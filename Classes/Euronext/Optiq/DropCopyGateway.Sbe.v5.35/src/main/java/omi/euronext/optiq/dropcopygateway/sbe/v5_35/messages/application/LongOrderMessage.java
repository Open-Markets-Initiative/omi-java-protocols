package omi.euronext.optiq.dropcopygateway.sbe.v5_35.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.AccountTypeInternalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.AckPhaseField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.AckQualifiersField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.AckTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BookInOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BookOutTimeOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BreachedCollarPriceField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ClientOrderIdOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.CollarRejTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ConsumeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.CounterpartFirmIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.CounterpartyReasonTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.CrossOrderIndicatorField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.DarkExecutionInstructionField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.DisplayedQtyField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.EmmField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ErrorCodeOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.EscbMembershipField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.EventIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ExecutionIdOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ExecutionInstructionField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ExecutionPhaseOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.FirmIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.IndicativeAuctionPriceField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.IndicativeAuctionVolumeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.KillReasonField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.LastSharesOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.LastTradedPxOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.LeavesQtyField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.LisTransactionIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.LpRoleOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.MiFidIndicatorsField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.MsgSeqNumField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OeSessionIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OeginFromMemberOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OegoutTimeToMeOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderEventTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderPriorityField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderPxField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderQtyField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderSideField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderSweepReasonField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderTolerablePriceField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrigClientOrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ProduceTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.QuoteIndicatorField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.RejectedMessageField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.StopQueuePriorityField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.StpidField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.SymbolIndexField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.TimeInForceField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.TradeQualifierOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.TradeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.TradeTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.TradeUniqueIdentifierField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.WholesaleTradeTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderAdditionalInfosGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderClearingFieldsGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderCommercialFieldsGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderExtendedClearingAccountGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderFreeTextSectionGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderModifiableCommercialInvestorFieldGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderModifiableShortCodesGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderNonModifiableCommercialInvestorFieldGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderNonModifiableOptFieldsGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderNonModifiableShortCodesGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderOptionalFieldsDerivativesGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderOptionalFieldsGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderShortCodesDetailsModifiableGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderShortCodesDetailsNonModifiableGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.LongOrderStrategyFieldsGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.Message;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.PrintOptions;

/**
 * Represents the LongOrderMessage message from the DropCopyGateway protocol.
 *
 * <p>DCLongOrderMessage</p>
 */
public final class LongOrderMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 300;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Long Order Message";

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
     * accountTypeInternal
     */
    private final AccountTypeInternalField accountTypeInternal = new AccountTypeInternalField();

    /**
     * ackPhase
     */
    private final AckPhaseField ackPhase = new AckPhaseField();

    /**
     * AckQualifiers_set bit set
     */
    private final AckQualifiersField ackQualifiers = new AckQualifiersField();

    /**
     * ackType
     */
    private final AckTypeField ackType = new AckTypeField();

    /**
     * bookIn
     */
    private final BookInOptionalField bookInOptional = new BookInOptionalField();

    /**
     * bookOUTTime
     */
    private final BookOutTimeOptionalField bookOutTimeOptional = new BookOutTimeOptionalField();

    /**
     * clientOrderID
     */
    private final ClientOrderIdOptionalField clientOrderIdOptional = new ClientOrderIdOptionalField();

    /**
     * DarkExecutionInstruction_set bit set
     */
    private final DarkExecutionInstructionField darkExecutionInstruction = new DarkExecutionInstructionField();

    /**
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * eventId
     */
    private final EventIdField eventId = new EventIdField();

    /**
     * ExecutionInstruction_set bit set
     */
    private final ExecutionInstructionField executionInstruction = new ExecutionInstructionField();

    /**
     * firmID
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * indicativeAuctionPrice
     */
    private final IndicativeAuctionPriceField indicativeAuctionPrice = new IndicativeAuctionPriceField();

    /**
     * indicativeAuctionVolume
     */
    private final IndicativeAuctionVolumeField indicativeAuctionVolume = new IndicativeAuctionVolumeField();

    /**
     * oESessionID
     */
    private final OeSessionIdField oeSessionId = new OeSessionIdField();

    /**
     * lPRole
     */
    private final LpRoleOptionalField lpRoleOptional = new LpRoleOptionalField();

    /**
     * MiFIDIndicators_set bit set
     */
    private final MiFidIndicatorsField miFidIndicators = new MiFidIndicatorsField();

    /**
     * oEGINFromMember
     */
    private final OeginFromMemberOptionalField oeginFromMemberOptional = new OeginFromMemberOptionalField();

    /**
     * oEGOUTTimeToME
     */
    private final OegoutTimeToMeOptionalField oegoutTimeToMeOptional = new OegoutTimeToMeOptionalField();

    /**
     * orderID
     */
    private final OrderIdField orderId = new OrderIdField();

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
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * orderSide
     */
    private final OrderSideField orderSide = new OrderSideField();

    /**
     * orderType
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * origClientOrderID
     */
    private final OrigClientOrderIdField origClientOrderId = new OrigClientOrderIdField();

    /**
     * sTPID
     */
    private final StpidField stpid = new StpidField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * timeInForce
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * displayedQty
     */
    private final DisplayedQtyField displayedQty = new DisplayedQtyField();

    /**
     * crossOrderIndicator
     */
    private final CrossOrderIndicatorField crossOrderIndicator = new CrossOrderIndicatorField();

    /**
     * counterpartFirmID
     */
    private final CounterpartFirmIdField counterpartFirmId = new CounterpartFirmIdField();

    /**
     * executionID
     */
    private final ExecutionIdOptionalField executionIdOptional = new ExecutionIdOptionalField();

    /**
     * executionPhase
     */
    private final ExecutionPhaseOptionalField executionPhaseOptional = new ExecutionPhaseOptionalField();

    /**
     * lastShares
     */
    private final LastSharesOptionalField lastSharesOptional = new LastSharesOptionalField();

    /**
     * lastTradedPx
     */
    private final LastTradedPxOptionalField lastTradedPxOptional = new LastTradedPxOptionalField();

    /**
     * leavesQty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * TradeQualifier_set bit set
     */
    private final TradeQualifierOptionalField tradeQualifierOptional = new TradeQualifierOptionalField();

    /**
     * tradeTime
     */
    private final TradeTimeField tradeTime = new TradeTimeField();

    /**
     * tradeType
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * killReason
     */
    private final KillReasonField killReason = new KillReasonField();

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
    private final ErrorCodeOptionalField errorCodeOptional = new ErrorCodeOptionalField();

    /**
     * stopQueuePriority
     */
    private final StopQueuePriorityField stopQueuePriority = new StopQueuePriorityField();

    /**
     * counterpartyReasonType
     */
    private final CounterpartyReasonTypeField counterpartyReasonType = new CounterpartyReasonTypeField();

    /**
     * quoteIndicator
     */
    private final QuoteIndicatorField quoteIndicator = new QuoteIndicatorField();

    /**
     * lISTransactionID
     */
    private final LisTransactionIdField lisTransactionId = new LisTransactionIdField();

    /**
     * wholesaleTradeType
     */
    private final WholesaleTradeTypeField wholesaleTradeType = new WholesaleTradeTypeField();

    /**
     * eSCBMembership
     */
    private final EscbMembershipField escbMembership = new EscbMembershipField();

    /**
     * tradeUniqueIdentifier
     */
    private final TradeUniqueIdentifierField tradeUniqueIdentifier = new TradeUniqueIdentifierField();

    /**
     * orderTolerablePrice
     */
    private final OrderTolerablePriceField orderTolerablePrice = new OrderTolerablePriceField();

    /**
     * orderSweepReason
     */
    private final OrderSweepReasonField orderSweepReason = new OrderSweepReasonField();

    /**
     * FreeTextSection Block
     */
    private final LongOrderFreeTextSectionGroups longOrderFreeTextSectionGroups = new LongOrderFreeTextSectionGroups();

    /**
     * OptionalFields Block
     */
    private final LongOrderOptionalFieldsGroups longOrderOptionalFieldsGroups = new LongOrderOptionalFieldsGroups();

    /**
     * ClearingFields Block
     */
    private final LongOrderClearingFieldsGroups longOrderClearingFieldsGroups = new LongOrderClearingFieldsGroups();

    /**
     * NonModifiableOptFields Block
     */
    private final LongOrderNonModifiableOptFieldsGroups longOrderNonModifiableOptFieldsGroups = new LongOrderNonModifiableOptFieldsGroups();

    /**
     * NonModifiableShortCodes Block
     */
    private final LongOrderNonModifiableShortCodesGroups longOrderNonModifiableShortCodesGroups = new LongOrderNonModifiableShortCodesGroups();

    /**
     * ModifiableShortCodes Block
     */
    private final LongOrderModifiableShortCodesGroups longOrderModifiableShortCodesGroups = new LongOrderModifiableShortCodesGroups();

    /**
     * CommercialFields Block
     */
    private final LongOrderCommercialFieldsGroups longOrderCommercialFieldsGroups = new LongOrderCommercialFieldsGroups();

    /**
     * ModifiableCommercialInvestorField Block
     */
    private final LongOrderModifiableCommercialInvestorFieldGroups longOrderModifiableCommercialInvestorFieldGroups = new LongOrderModifiableCommercialInvestorFieldGroups();

    /**
     * NonModifiableCommercialInvestorField Block
     */
    private final LongOrderNonModifiableCommercialInvestorFieldGroups longOrderNonModifiableCommercialInvestorFieldGroups = new LongOrderNonModifiableCommercialInvestorFieldGroups();

    /**
     * ExtendedClearingAccount Block
     */
    private final LongOrderExtendedClearingAccountGroups longOrderExtendedClearingAccountGroups = new LongOrderExtendedClearingAccountGroups();

    /**
     * StrategyFields Block
     */
    private final LongOrderStrategyFieldsGroups longOrderStrategyFieldsGroups = new LongOrderStrategyFieldsGroups();

    /**
     * OptionalFieldsDerivatives Block
     */
    private final LongOrderOptionalFieldsDerivativesGroups longOrderOptionalFieldsDerivativesGroups = new LongOrderOptionalFieldsDerivativesGroups();

    /**
     * AdditionalInfos Block
     */
    private final LongOrderAdditionalInfosGroups longOrderAdditionalInfosGroups = new LongOrderAdditionalInfosGroups();

    /**
     * ShortCodesDetailsNonModifiable Block
     */
    private final LongOrderShortCodesDetailsNonModifiableGroups longOrderShortCodesDetailsNonModifiableGroups = new LongOrderShortCodesDetailsNonModifiableGroups();

    /**
     * ShortCodesDetailsModifiable Block
     */
    private final LongOrderShortCodesDetailsModifiableGroups longOrderShortCodesDetailsModifiableGroups = new LongOrderShortCodesDetailsModifiableGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, produceTime, consumeTime, orderEventType, accountTypeInternal, ackPhase, ackQualifiers, ackType, bookInOptional, bookOutTimeOptional, clientOrderIdOptional, darkExecutionInstruction, emm, eventId, executionInstruction, firmId, indicativeAuctionPrice, indicativeAuctionVolume, oeSessionId, lpRoleOptional, miFidIndicators, oeginFromMemberOptional, oegoutTimeToMeOptional, orderId, orderPriority, orderPx, orderQty, orderSide, orderType, origClientOrderId, stpid, symbolIndex, timeInForce, displayedQty, crossOrderIndicator, counterpartFirmId, executionIdOptional, executionPhaseOptional, lastSharesOptional, lastTradedPxOptional, leavesQty, tradeQualifierOptional, tradeTime, tradeType, killReason, breachedCollarPrice, collarRejType, rejectedMessage, errorCodeOptional, stopQueuePriority, counterpartyReasonType, quoteIndicator, lisTransactionId, wholesaleTradeType, escbMembership, tradeUniqueIdentifier, orderTolerablePrice, orderSweepReason);

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
     * accountTypeInternal
     *
     * @return the AccountTypeInternal field
     */
    public AccountTypeInternalField accountTypeInternal() {
        return accountTypeInternal;
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
     * AckQualifiers_set bit set
     *
     * @return the AckQualifiers field
     */
    public AckQualifiersField ackQualifiers() {
        return ackQualifiers;
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
     * clientOrderID
     *
     * @return the ClientOrderIdOptional field
     */
    public ClientOrderIdOptionalField clientOrderIdOptional() {
        return clientOrderIdOptional;
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
     * eventId
     *
     * @return the EventId field
     */
    public EventIdField eventId() {
        return eventId;
    }

    /**
     * ExecutionInstruction_set bit set
     *
     * @return the ExecutionInstruction field
     */
    public ExecutionInstructionField executionInstruction() {
        return executionInstruction;
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
     * indicativeAuctionPrice
     *
     * @return the IndicativeAuctionPrice field
     */
    public IndicativeAuctionPriceField indicativeAuctionPrice() {
        return indicativeAuctionPrice;
    }

    /**
     * indicativeAuctionVolume
     *
     * @return the IndicativeAuctionVolume field
     */
    public IndicativeAuctionVolumeField indicativeAuctionVolume() {
        return indicativeAuctionVolume;
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
     * lPRole
     *
     * @return the LpRoleOptional field
     */
    public LpRoleOptionalField lpRoleOptional() {
        return lpRoleOptional;
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
     * @return the OegoutTimeToMeOptional field
     */
    public OegoutTimeToMeOptionalField oegoutTimeToMeOptional() {
        return oegoutTimeToMeOptional;
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
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
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
     * orderType
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
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
     * sTPID
     *
     * @return the Stpid field
     */
    public StpidField stpid() {
        return stpid;
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
     * timeInForce
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * displayedQty
     *
     * @return the DisplayedQty field
     */
    public DisplayedQtyField displayedQty() {
        return displayedQty;
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
     * counterpartFirmID
     *
     * @return the CounterpartFirmId field
     */
    public CounterpartFirmIdField counterpartFirmId() {
        return counterpartFirmId;
    }

    /**
     * executionID
     *
     * @return the ExecutionIdOptional field
     */
    public ExecutionIdOptionalField executionIdOptional() {
        return executionIdOptional;
    }

    /**
     * executionPhase
     *
     * @return the ExecutionPhaseOptional field
     */
    public ExecutionPhaseOptionalField executionPhaseOptional() {
        return executionPhaseOptional;
    }

    /**
     * lastShares
     *
     * @return the LastSharesOptional field
     */
    public LastSharesOptionalField lastSharesOptional() {
        return lastSharesOptional;
    }

    /**
     * lastTradedPx
     *
     * @return the LastTradedPxOptional field
     */
    public LastTradedPxOptionalField lastTradedPxOptional() {
        return lastTradedPxOptional;
    }

    /**
     * leavesQty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * TradeQualifier_set bit set
     *
     * @return the TradeQualifierOptional field
     */
    public TradeQualifierOptionalField tradeQualifierOptional() {
        return tradeQualifierOptional;
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
     * tradeType
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * killReason
     *
     * @return the KillReason field
     */
    public KillReasonField killReason() {
        return killReason;
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
     * @return the ErrorCodeOptional field
     */
    public ErrorCodeOptionalField errorCodeOptional() {
        return errorCodeOptional;
    }

    /**
     * stopQueuePriority
     *
     * @return the StopQueuePriority field
     */
    public StopQueuePriorityField stopQueuePriority() {
        return stopQueuePriority;
    }

    /**
     * counterpartyReasonType
     *
     * @return the CounterpartyReasonType field
     */
    public CounterpartyReasonTypeField counterpartyReasonType() {
        return counterpartyReasonType;
    }

    /**
     * quoteIndicator
     *
     * @return the QuoteIndicator field
     */
    public QuoteIndicatorField quoteIndicator() {
        return quoteIndicator;
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
     * wholesaleTradeType
     *
     * @return the WholesaleTradeType field
     */
    public WholesaleTradeTypeField wholesaleTradeType() {
        return wholesaleTradeType;
    }

    /**
     * eSCBMembership
     *
     * @return the EscbMembership field
     */
    public EscbMembershipField escbMembership() {
        return escbMembership;
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
     * orderTolerablePrice
     *
     * @return the OrderTolerablePrice field
     */
    public OrderTolerablePriceField orderTolerablePrice() {
        return orderTolerablePrice;
    }

    /**
     * orderSweepReason
     *
     * @return the OrderSweepReason field
     */
    public OrderSweepReasonField orderSweepReason() {
        return orderSweepReason;
    }

    /**
     * FreeTextSection Block
     *
     * @return the LongOrderFreeTextSectionGroups record
     */
    public LongOrderFreeTextSectionGroups longOrderFreeTextSectionGroups() {
        return longOrderFreeTextSectionGroups;
    }

    /**
     * OptionalFields Block
     *
     * @return the LongOrderOptionalFieldsGroups record
     */
    public LongOrderOptionalFieldsGroups longOrderOptionalFieldsGroups() {
        return longOrderOptionalFieldsGroups;
    }

    /**
     * ClearingFields Block
     *
     * @return the LongOrderClearingFieldsGroups record
     */
    public LongOrderClearingFieldsGroups longOrderClearingFieldsGroups() {
        return longOrderClearingFieldsGroups;
    }

    /**
     * NonModifiableOptFields Block
     *
     * @return the LongOrderNonModifiableOptFieldsGroups record
     */
    public LongOrderNonModifiableOptFieldsGroups longOrderNonModifiableOptFieldsGroups() {
        return longOrderNonModifiableOptFieldsGroups;
    }

    /**
     * NonModifiableShortCodes Block
     *
     * @return the LongOrderNonModifiableShortCodesGroups record
     */
    public LongOrderNonModifiableShortCodesGroups longOrderNonModifiableShortCodesGroups() {
        return longOrderNonModifiableShortCodesGroups;
    }

    /**
     * ModifiableShortCodes Block
     *
     * @return the LongOrderModifiableShortCodesGroups record
     */
    public LongOrderModifiableShortCodesGroups longOrderModifiableShortCodesGroups() {
        return longOrderModifiableShortCodesGroups;
    }

    /**
     * CommercialFields Block
     *
     * @return the LongOrderCommercialFieldsGroups record
     */
    public LongOrderCommercialFieldsGroups longOrderCommercialFieldsGroups() {
        return longOrderCommercialFieldsGroups;
    }

    /**
     * ModifiableCommercialInvestorField Block
     *
     * @return the LongOrderModifiableCommercialInvestorFieldGroups record
     */
    public LongOrderModifiableCommercialInvestorFieldGroups longOrderModifiableCommercialInvestorFieldGroups() {
        return longOrderModifiableCommercialInvestorFieldGroups;
    }

    /**
     * NonModifiableCommercialInvestorField Block
     *
     * @return the LongOrderNonModifiableCommercialInvestorFieldGroups record
     */
    public LongOrderNonModifiableCommercialInvestorFieldGroups longOrderNonModifiableCommercialInvestorFieldGroups() {
        return longOrderNonModifiableCommercialInvestorFieldGroups;
    }

    /**
     * ExtendedClearingAccount Block
     *
     * @return the LongOrderExtendedClearingAccountGroups record
     */
    public LongOrderExtendedClearingAccountGroups longOrderExtendedClearingAccountGroups() {
        return longOrderExtendedClearingAccountGroups;
    }

    /**
     * StrategyFields Block
     *
     * @return the LongOrderStrategyFieldsGroups record
     */
    public LongOrderStrategyFieldsGroups longOrderStrategyFieldsGroups() {
        return longOrderStrategyFieldsGroups;
    }

    /**
     * OptionalFieldsDerivatives Block
     *
     * @return the LongOrderOptionalFieldsDerivativesGroups record
     */
    public LongOrderOptionalFieldsDerivativesGroups longOrderOptionalFieldsDerivativesGroups() {
        return longOrderOptionalFieldsDerivativesGroups;
    }

    /**
     * AdditionalInfos Block
     *
     * @return the LongOrderAdditionalInfosGroups record
     */
    public LongOrderAdditionalInfosGroups longOrderAdditionalInfosGroups() {
        return longOrderAdditionalInfosGroups;
    }

    /**
     * ShortCodesDetailsNonModifiable Block
     *
     * @return the LongOrderShortCodesDetailsNonModifiableGroups record
     */
    public LongOrderShortCodesDetailsNonModifiableGroups longOrderShortCodesDetailsNonModifiableGroups() {
        return longOrderShortCodesDetailsNonModifiableGroups;
    }

    /**
     * ShortCodesDetailsModifiable Block
     *
     * @return the LongOrderShortCodesDetailsModifiableGroups record
     */
    public LongOrderShortCodesDetailsModifiableGroups longOrderShortCodesDetailsModifiableGroups() {
        return longOrderShortCodesDetailsModifiableGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + longOrderFreeTextSectionGroups.byteLength() - LongOrderFreeTextSectionGroups.MINIMUM_BYTE_LENGTH + longOrderOptionalFieldsGroups.byteLength() - LongOrderOptionalFieldsGroups.MINIMUM_BYTE_LENGTH + longOrderClearingFieldsGroups.byteLength() - LongOrderClearingFieldsGroups.MINIMUM_BYTE_LENGTH + longOrderNonModifiableOptFieldsGroups.byteLength() - LongOrderNonModifiableOptFieldsGroups.MINIMUM_BYTE_LENGTH + longOrderNonModifiableShortCodesGroups.byteLength() - LongOrderNonModifiableShortCodesGroups.MINIMUM_BYTE_LENGTH + longOrderModifiableShortCodesGroups.byteLength() - LongOrderModifiableShortCodesGroups.MINIMUM_BYTE_LENGTH + longOrderCommercialFieldsGroups.byteLength() - LongOrderCommercialFieldsGroups.MINIMUM_BYTE_LENGTH + longOrderModifiableCommercialInvestorFieldGroups.byteLength() - LongOrderModifiableCommercialInvestorFieldGroups.MINIMUM_BYTE_LENGTH + longOrderNonModifiableCommercialInvestorFieldGroups.byteLength() - LongOrderNonModifiableCommercialInvestorFieldGroups.MINIMUM_BYTE_LENGTH + longOrderExtendedClearingAccountGroups.byteLength() - LongOrderExtendedClearingAccountGroups.MINIMUM_BYTE_LENGTH + longOrderStrategyFieldsGroups.byteLength() - LongOrderStrategyFieldsGroups.MINIMUM_BYTE_LENGTH + longOrderOptionalFieldsDerivativesGroups.byteLength() - LongOrderOptionalFieldsDerivativesGroups.MINIMUM_BYTE_LENGTH + longOrderAdditionalInfosGroups.byteLength() - LongOrderAdditionalInfosGroups.MINIMUM_BYTE_LENGTH + longOrderShortCodesDetailsNonModifiableGroups.byteLength() - LongOrderShortCodesDetailsNonModifiableGroups.MINIMUM_BYTE_LENGTH + longOrderShortCodesDetailsModifiableGroups.byteLength() - LongOrderShortCodesDetailsModifiableGroups.MINIMUM_BYTE_LENGTH;
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
        if (!accountTypeInternal.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeInternalField.BYTE_LENGTH;
        if (!ackPhase.parse(data, cursor)) {
            return false;
        }
        cursor += AckPhaseField.BYTE_LENGTH;
        if (!ackQualifiers.parse(data, cursor)) {
            return false;
        }
        cursor += AckQualifiersField.BYTE_LENGTH;
        if (!ackType.parse(data, cursor)) {
            return false;
        }
        cursor += AckTypeField.BYTE_LENGTH;
        if (!bookInOptional.parse(data, cursor)) {
            return false;
        }
        cursor += BookInOptionalField.BYTE_LENGTH;
        if (!bookOutTimeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += BookOutTimeOptionalField.BYTE_LENGTH;
        if (!clientOrderIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdOptionalField.BYTE_LENGTH;
        if (!darkExecutionInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += DarkExecutionInstructionField.BYTE_LENGTH;
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!eventId.parse(data, cursor)) {
            return false;
        }
        cursor += EventIdField.BYTE_LENGTH;
        if (!executionInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionInstructionField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!indicativeAuctionPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativeAuctionPriceField.BYTE_LENGTH;
        if (!indicativeAuctionVolume.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativeAuctionVolumeField.BYTE_LENGTH;
        if (!oeSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += OeSessionIdField.BYTE_LENGTH;
        if (!lpRoleOptional.parse(data, cursor)) {
            return false;
        }
        cursor += LpRoleOptionalField.BYTE_LENGTH;
        if (!miFidIndicators.parse(data, cursor)) {
            return false;
        }
        cursor += MiFidIndicatorsField.BYTE_LENGTH;
        if (!oeginFromMemberOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OeginFromMemberOptionalField.BYTE_LENGTH;
        if (!oegoutTimeToMeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OegoutTimeToMeOptionalField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!orderPriority.parse(data, cursor)) {
            return false;
        }
        cursor += OrderPriorityField.BYTE_LENGTH;
        if (!orderPx.parse(data, cursor)) {
            return false;
        }
        cursor += OrderPxField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!orderSide.parse(data, cursor)) {
            return false;
        }
        cursor += OrderSideField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!origClientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClientOrderIdField.BYTE_LENGTH;
        if (!stpid.parse(data, cursor)) {
            return false;
        }
        cursor += StpidField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!displayedQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayedQtyField.BYTE_LENGTH;
        if (!crossOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CrossOrderIndicatorField.BYTE_LENGTH;
        if (!counterpartFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += CounterpartFirmIdField.BYTE_LENGTH;
        if (!executionIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionIdOptionalField.BYTE_LENGTH;
        if (!executionPhaseOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionPhaseOptionalField.BYTE_LENGTH;
        if (!lastSharesOptional.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesOptionalField.BYTE_LENGTH;
        if (!lastTradedPxOptional.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradedPxOptionalField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!tradeQualifierOptional.parse(data, cursor)) {
            return false;
        }
        cursor += TradeQualifierOptionalField.BYTE_LENGTH;
        if (!tradeTime.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTimeField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!killReason.parse(data, cursor)) {
            return false;
        }
        cursor += KillReasonField.BYTE_LENGTH;
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
        if (!errorCodeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ErrorCodeOptionalField.BYTE_LENGTH;
        if (!stopQueuePriority.parse(data, cursor)) {
            return false;
        }
        cursor += StopQueuePriorityField.BYTE_LENGTH;
        if (!counterpartyReasonType.parse(data, cursor)) {
            return false;
        }
        cursor += CounterpartyReasonTypeField.BYTE_LENGTH;
        if (!quoteIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIndicatorField.BYTE_LENGTH;
        if (!lisTransactionId.parse(data, cursor)) {
            return false;
        }
        cursor += LisTransactionIdField.BYTE_LENGTH;
        if (!wholesaleTradeType.parse(data, cursor)) {
            return false;
        }
        cursor += WholesaleTradeTypeField.BYTE_LENGTH;
        if (!escbMembership.parse(data, cursor)) {
            return false;
        }
        cursor += EscbMembershipField.BYTE_LENGTH;
        if (!tradeUniqueIdentifier.parse(data, cursor)) {
            return false;
        }
        cursor += TradeUniqueIdentifierField.BYTE_LENGTH;
        if (!orderTolerablePrice.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTolerablePriceField.BYTE_LENGTH;
        if (!orderSweepReason.parse(data, cursor)) {
            return false;
        }
        cursor += OrderSweepReasonField.BYTE_LENGTH;
        if (!longOrderFreeTextSectionGroups.parseFrom(data, cursor, end - 28)) {
            return false;
        }
        cursor += longOrderFreeTextSectionGroups.byteLength();
        if (end - cursor < 28) {
            return false;
        }
        if (!longOrderOptionalFieldsGroups.parseFrom(data, cursor, end - 26)) {
            return false;
        }
        cursor += longOrderOptionalFieldsGroups.byteLength();
        if (end - cursor < 26) {
            return false;
        }
        if (!longOrderClearingFieldsGroups.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += longOrderClearingFieldsGroups.byteLength();
        if (end - cursor < 24) {
            return false;
        }
        if (!longOrderNonModifiableOptFieldsGroups.parseFrom(data, cursor, end - 22)) {
            return false;
        }
        cursor += longOrderNonModifiableOptFieldsGroups.byteLength();
        if (end - cursor < 22) {
            return false;
        }
        if (!longOrderNonModifiableShortCodesGroups.parseFrom(data, cursor, end - 20)) {
            return false;
        }
        cursor += longOrderNonModifiableShortCodesGroups.byteLength();
        if (end - cursor < 20) {
            return false;
        }
        if (!longOrderModifiableShortCodesGroups.parseFrom(data, cursor, end - 18)) {
            return false;
        }
        cursor += longOrderModifiableShortCodesGroups.byteLength();
        if (end - cursor < 18) {
            return false;
        }
        if (!longOrderCommercialFieldsGroups.parseFrom(data, cursor, end - 16)) {
            return false;
        }
        cursor += longOrderCommercialFieldsGroups.byteLength();
        if (end - cursor < 16) {
            return false;
        }
        if (!longOrderModifiableCommercialInvestorFieldGroups.parseFrom(data, cursor, end - 14)) {
            return false;
        }
        cursor += longOrderModifiableCommercialInvestorFieldGroups.byteLength();
        if (end - cursor < 14) {
            return false;
        }
        if (!longOrderNonModifiableCommercialInvestorFieldGroups.parseFrom(data, cursor, end - 12)) {
            return false;
        }
        cursor += longOrderNonModifiableCommercialInvestorFieldGroups.byteLength();
        if (end - cursor < 12) {
            return false;
        }
        if (!longOrderExtendedClearingAccountGroups.parseFrom(data, cursor, end - 10)) {
            return false;
        }
        cursor += longOrderExtendedClearingAccountGroups.byteLength();
        if (end - cursor < 10) {
            return false;
        }
        if (!longOrderStrategyFieldsGroups.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += longOrderStrategyFieldsGroups.byteLength();
        if (end - cursor < 8) {
            return false;
        }
        if (!longOrderOptionalFieldsDerivativesGroups.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += longOrderOptionalFieldsDerivativesGroups.byteLength();
        if (end - cursor < 6) {
            return false;
        }
        if (!longOrderAdditionalInfosGroups.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += longOrderAdditionalInfosGroups.byteLength();
        if (end - cursor < 4) {
            return false;
        }
        if (!longOrderShortCodesDetailsNonModifiableGroups.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += longOrderShortCodesDetailsNonModifiableGroups.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!longOrderShortCodesDetailsModifiableGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += longOrderShortCodesDetailsModifiableGroups.byteLength();

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
        cursor = accountTypeInternal.encode(data, cursor);
        cursor = ackPhase.encode(data, cursor);
        cursor = ackQualifiers.encode(data, cursor);
        cursor = ackType.encode(data, cursor);
        cursor = bookInOptional.encode(data, cursor);
        cursor = bookOutTimeOptional.encode(data, cursor);
        cursor = clientOrderIdOptional.encode(data, cursor);
        cursor = darkExecutionInstruction.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = eventId.encode(data, cursor);
        cursor = executionInstruction.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = indicativeAuctionPrice.encode(data, cursor);
        cursor = indicativeAuctionVolume.encode(data, cursor);
        cursor = oeSessionId.encode(data, cursor);
        cursor = lpRoleOptional.encode(data, cursor);
        cursor = miFidIndicators.encode(data, cursor);
        cursor = oeginFromMemberOptional.encode(data, cursor);
        cursor = oegoutTimeToMeOptional.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = orderPriority.encode(data, cursor);
        cursor = orderPx.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = orderSide.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = origClientOrderId.encode(data, cursor);
        cursor = stpid.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = displayedQty.encode(data, cursor);
        cursor = crossOrderIndicator.encode(data, cursor);
        cursor = counterpartFirmId.encode(data, cursor);
        cursor = executionIdOptional.encode(data, cursor);
        cursor = executionPhaseOptional.encode(data, cursor);
        cursor = lastSharesOptional.encode(data, cursor);
        cursor = lastTradedPxOptional.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = tradeQualifierOptional.encode(data, cursor);
        cursor = tradeTime.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = killReason.encode(data, cursor);
        cursor = breachedCollarPrice.encode(data, cursor);
        cursor = collarRejType.encode(data, cursor);
        cursor = rejectedMessage.encode(data, cursor);
        cursor = errorCodeOptional.encode(data, cursor);
        cursor = stopQueuePriority.encode(data, cursor);
        cursor = counterpartyReasonType.encode(data, cursor);
        cursor = quoteIndicator.encode(data, cursor);
        cursor = lisTransactionId.encode(data, cursor);
        cursor = wholesaleTradeType.encode(data, cursor);
        cursor = escbMembership.encode(data, cursor);
        cursor = tradeUniqueIdentifier.encode(data, cursor);
        cursor = orderTolerablePrice.encode(data, cursor);
        cursor = orderSweepReason.encode(data, cursor);
        cursor = longOrderFreeTextSectionGroups.encode(data, cursor);
        cursor = longOrderOptionalFieldsGroups.encode(data, cursor);
        cursor = longOrderClearingFieldsGroups.encode(data, cursor);
        cursor = longOrderNonModifiableOptFieldsGroups.encode(data, cursor);
        cursor = longOrderNonModifiableShortCodesGroups.encode(data, cursor);
        cursor = longOrderModifiableShortCodesGroups.encode(data, cursor);
        cursor = longOrderCommercialFieldsGroups.encode(data, cursor);
        cursor = longOrderModifiableCommercialInvestorFieldGroups.encode(data, cursor);
        cursor = longOrderNonModifiableCommercialInvestorFieldGroups.encode(data, cursor);
        cursor = longOrderExtendedClearingAccountGroups.encode(data, cursor);
        cursor = longOrderStrategyFieldsGroups.encode(data, cursor);
        cursor = longOrderOptionalFieldsDerivativesGroups.encode(data, cursor);
        cursor = longOrderAdditionalInfosGroups.encode(data, cursor);
        cursor = longOrderShortCodesDetailsNonModifiableGroups.encode(data, cursor);
        cursor = longOrderShortCodesDetailsModifiableGroups.encode(data, cursor);
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
        longOrderFreeTextSectionGroups.clear();
        longOrderOptionalFieldsGroups.clear();
        longOrderClearingFieldsGroups.clear();
        longOrderNonModifiableOptFieldsGroups.clear();
        longOrderNonModifiableShortCodesGroups.clear();
        longOrderModifiableShortCodesGroups.clear();
        longOrderCommercialFieldsGroups.clear();
        longOrderModifiableCommercialInvestorFieldGroups.clear();
        longOrderNonModifiableCommercialInvestorFieldGroups.clear();
        longOrderExtendedClearingAccountGroups.clear();
        longOrderStrategyFieldsGroups.clear();
        longOrderOptionalFieldsDerivativesGroups.clear();
        longOrderAdditionalInfosGroups.clear();
        longOrderShortCodesDetailsNonModifiableGroups.clear();
        longOrderShortCodesDetailsModifiableGroups.clear();
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
        if (!longOrderFreeTextSectionGroups.isRecognized()) {
            return false;
        }
        if (!longOrderOptionalFieldsGroups.isRecognized()) {
            return false;
        }
        if (!longOrderClearingFieldsGroups.isRecognized()) {
            return false;
        }
        if (!longOrderNonModifiableOptFieldsGroups.isRecognized()) {
            return false;
        }
        if (!longOrderNonModifiableShortCodesGroups.isRecognized()) {
            return false;
        }
        if (!longOrderModifiableShortCodesGroups.isRecognized()) {
            return false;
        }
        if (!longOrderCommercialFieldsGroups.isRecognized()) {
            return false;
        }
        if (!longOrderModifiableCommercialInvestorFieldGroups.isRecognized()) {
            return false;
        }
        if (!longOrderNonModifiableCommercialInvestorFieldGroups.isRecognized()) {
            return false;
        }
        if (!longOrderExtendedClearingAccountGroups.isRecognized()) {
            return false;
        }
        if (!longOrderStrategyFieldsGroups.isRecognized()) {
            return false;
        }
        if (!longOrderOptionalFieldsDerivativesGroups.isRecognized()) {
            return false;
        }
        if (!longOrderAdditionalInfosGroups.isRecognized()) {
            return false;
        }
        if (!longOrderShortCodesDetailsNonModifiableGroups.isRecognized()) {
            return false;
        }
        return longOrderShortCodesDetailsModifiableGroups.isRecognized();
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
        if (!longOrderFreeTextSectionGroups.isValid()) {
            return false;
        }
        if (!longOrderOptionalFieldsGroups.isValid()) {
            return false;
        }
        if (!longOrderClearingFieldsGroups.isValid()) {
            return false;
        }
        if (!longOrderNonModifiableOptFieldsGroups.isValid()) {
            return false;
        }
        if (!longOrderNonModifiableShortCodesGroups.isValid()) {
            return false;
        }
        if (!longOrderModifiableShortCodesGroups.isValid()) {
            return false;
        }
        if (!longOrderCommercialFieldsGroups.isValid()) {
            return false;
        }
        if (!longOrderModifiableCommercialInvestorFieldGroups.isValid()) {
            return false;
        }
        if (!longOrderNonModifiableCommercialInvestorFieldGroups.isValid()) {
            return false;
        }
        if (!longOrderExtendedClearingAccountGroups.isValid()) {
            return false;
        }
        if (!longOrderStrategyFieldsGroups.isValid()) {
            return false;
        }
        if (!longOrderOptionalFieldsDerivativesGroups.isValid()) {
            return false;
        }
        if (!longOrderAdditionalInfosGroups.isValid()) {
            return false;
        }
        if (!longOrderShortCodesDetailsNonModifiableGroups.isValid()) {
            return false;
        }
        if (!longOrderShortCodesDetailsModifiableGroups.isValid()) {
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
        if (!accountTypeInternal.isDecoded()) {
            return Optional.of(accountTypeInternal);
        }
        if (!ackPhase.isDecoded()) {
            return Optional.of(ackPhase);
        }
        if (!ackQualifiers.isDecoded()) {
            return Optional.of(ackQualifiers);
        }
        if (!ackType.isDecoded()) {
            return Optional.of(ackType);
        }
        if (!bookInOptional.isDecoded()) {
            return Optional.of(bookInOptional);
        }
        if (!bookOutTimeOptional.isDecoded()) {
            return Optional.of(bookOutTimeOptional);
        }
        if (!clientOrderIdOptional.isDecoded()) {
            return Optional.of(clientOrderIdOptional);
        }
        if (!darkExecutionInstruction.isDecoded()) {
            return Optional.of(darkExecutionInstruction);
        }
        if (!emm.isDecoded()) {
            return Optional.of(emm);
        }
        if (!eventId.isDecoded()) {
            return Optional.of(eventId);
        }
        if (!executionInstruction.isDecoded()) {
            return Optional.of(executionInstruction);
        }
        if (!firmId.isDecoded()) {
            return Optional.of(firmId);
        }
        if (!indicativeAuctionPrice.isDecoded()) {
            return Optional.of(indicativeAuctionPrice);
        }
        if (!indicativeAuctionVolume.isDecoded()) {
            return Optional.of(indicativeAuctionVolume);
        }
        if (!oeSessionId.isDecoded()) {
            return Optional.of(oeSessionId);
        }
        if (!lpRoleOptional.isDecoded()) {
            return Optional.of(lpRoleOptional);
        }
        if (!miFidIndicators.isDecoded()) {
            return Optional.of(miFidIndicators);
        }
        if (!oeginFromMemberOptional.isDecoded()) {
            return Optional.of(oeginFromMemberOptional);
        }
        if (!oegoutTimeToMeOptional.isDecoded()) {
            return Optional.of(oegoutTimeToMeOptional);
        }
        if (!orderId.isDecoded()) {
            return Optional.of(orderId);
        }
        if (!orderPriority.isDecoded()) {
            return Optional.of(orderPriority);
        }
        if (!orderPx.isDecoded()) {
            return Optional.of(orderPx);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!orderSide.isDecoded()) {
            return Optional.of(orderSide);
        }
        if (!orderType.isDecoded()) {
            return Optional.of(orderType);
        }
        if (!origClientOrderId.isDecoded()) {
            return Optional.of(origClientOrderId);
        }
        if (!stpid.isDecoded()) {
            return Optional.of(stpid);
        }
        if (!symbolIndex.isDecoded()) {
            return Optional.of(symbolIndex);
        }
        if (!timeInForce.isDecoded()) {
            return Optional.of(timeInForce);
        }
        if (!displayedQty.isDecoded()) {
            return Optional.of(displayedQty);
        }
        if (!crossOrderIndicator.isDecoded()) {
            return Optional.of(crossOrderIndicator);
        }
        if (!counterpartFirmId.isDecoded()) {
            return Optional.of(counterpartFirmId);
        }
        if (!executionIdOptional.isDecoded()) {
            return Optional.of(executionIdOptional);
        }
        if (!executionPhaseOptional.isDecoded()) {
            return Optional.of(executionPhaseOptional);
        }
        if (!lastSharesOptional.isDecoded()) {
            return Optional.of(lastSharesOptional);
        }
        if (!lastTradedPxOptional.isDecoded()) {
            return Optional.of(lastTradedPxOptional);
        }
        if (!leavesQty.isDecoded()) {
            return Optional.of(leavesQty);
        }
        if (!tradeQualifierOptional.isDecoded()) {
            return Optional.of(tradeQualifierOptional);
        }
        if (!tradeTime.isDecoded()) {
            return Optional.of(tradeTime);
        }
        if (!tradeType.isDecoded()) {
            return Optional.of(tradeType);
        }
        if (!killReason.isDecoded()) {
            return Optional.of(killReason);
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
        if (!errorCodeOptional.isDecoded()) {
            return Optional.of(errorCodeOptional);
        }
        if (!stopQueuePriority.isDecoded()) {
            return Optional.of(stopQueuePriority);
        }
        if (!counterpartyReasonType.isDecoded()) {
            return Optional.of(counterpartyReasonType);
        }
        if (!quoteIndicator.isDecoded()) {
            return Optional.of(quoteIndicator);
        }
        if (!lisTransactionId.isDecoded()) {
            return Optional.of(lisTransactionId);
        }
        if (!wholesaleTradeType.isDecoded()) {
            return Optional.of(wholesaleTradeType);
        }
        if (!escbMembership.isDecoded()) {
            return Optional.of(escbMembership);
        }
        if (!tradeUniqueIdentifier.isDecoded()) {
            return Optional.of(tradeUniqueIdentifier);
        }
        if (!orderTolerablePrice.isDecoded()) {
            return Optional.of(orderTolerablePrice);
        }
        if (!orderSweepReason.isDecoded()) {
            return Optional.of(orderSweepReason);
        }
        if (!longOrderFreeTextSectionGroups.isDecoded()) {
            return longOrderFreeTextSectionGroups.failedAt();
        }
        if (!longOrderOptionalFieldsGroups.isDecoded()) {
            return longOrderOptionalFieldsGroups.failedAt();
        }
        if (!longOrderClearingFieldsGroups.isDecoded()) {
            return longOrderClearingFieldsGroups.failedAt();
        }
        if (!longOrderNonModifiableOptFieldsGroups.isDecoded()) {
            return longOrderNonModifiableOptFieldsGroups.failedAt();
        }
        if (!longOrderNonModifiableShortCodesGroups.isDecoded()) {
            return longOrderNonModifiableShortCodesGroups.failedAt();
        }
        if (!longOrderModifiableShortCodesGroups.isDecoded()) {
            return longOrderModifiableShortCodesGroups.failedAt();
        }
        if (!longOrderCommercialFieldsGroups.isDecoded()) {
            return longOrderCommercialFieldsGroups.failedAt();
        }
        if (!longOrderModifiableCommercialInvestorFieldGroups.isDecoded()) {
            return longOrderModifiableCommercialInvestorFieldGroups.failedAt();
        }
        if (!longOrderNonModifiableCommercialInvestorFieldGroups.isDecoded()) {
            return longOrderNonModifiableCommercialInvestorFieldGroups.failedAt();
        }
        if (!longOrderExtendedClearingAccountGroups.isDecoded()) {
            return longOrderExtendedClearingAccountGroups.failedAt();
        }
        if (!longOrderStrategyFieldsGroups.isDecoded()) {
            return longOrderStrategyFieldsGroups.failedAt();
        }
        if (!longOrderOptionalFieldsDerivativesGroups.isDecoded()) {
            return longOrderOptionalFieldsDerivativesGroups.failedAt();
        }
        if (!longOrderAdditionalInfosGroups.isDecoded()) {
            return longOrderAdditionalInfosGroups.failedAt();
        }
        if (!longOrderShortCodesDetailsNonModifiableGroups.isDecoded()) {
            return longOrderShortCodesDetailsNonModifiableGroups.failedAt();
        }
        if (!longOrderShortCodesDetailsModifiableGroups.isDecoded()) {
            return longOrderShortCodesDetailsModifiableGroups.failedAt();
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
            case "AccountTypeInternal" -> Optional.of(accountTypeInternal);
            case "AckPhase" -> Optional.of(ackPhase);
            case "AckQualifiers" -> Optional.of(ackQualifiers);
            case "AckType" -> Optional.of(ackType);
            case "BookInOptional" -> Optional.of(bookInOptional);
            case "BookOutTimeOptional" -> Optional.of(bookOutTimeOptional);
            case "ClientOrderIdOptional" -> Optional.of(clientOrderIdOptional);
            case "DarkExecutionInstruction" -> Optional.of(darkExecutionInstruction);
            case "Emm" -> Optional.of(emm);
            case "EventId" -> Optional.of(eventId);
            case "ExecutionInstruction" -> Optional.of(executionInstruction);
            case "FirmId" -> Optional.of(firmId);
            case "IndicativeAuctionPrice" -> Optional.of(indicativeAuctionPrice);
            case "IndicativeAuctionVolume" -> Optional.of(indicativeAuctionVolume);
            case "OeSessionId" -> Optional.of(oeSessionId);
            case "LpRoleOptional" -> Optional.of(lpRoleOptional);
            case "MiFidIndicators" -> Optional.of(miFidIndicators);
            case "OeginFromMemberOptional" -> Optional.of(oeginFromMemberOptional);
            case "OegoutTimeToMeOptional" -> Optional.of(oegoutTimeToMeOptional);
            case "OrderId" -> Optional.of(orderId);
            case "OrderPriority" -> Optional.of(orderPriority);
            case "OrderPx" -> Optional.of(orderPx);
            case "OrderQty" -> Optional.of(orderQty);
            case "OrderSide" -> Optional.of(orderSide);
            case "OrderType" -> Optional.of(orderType);
            case "OrigClientOrderId" -> Optional.of(origClientOrderId);
            case "Stpid" -> Optional.of(stpid);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "DisplayedQty" -> Optional.of(displayedQty);
            case "CrossOrderIndicator" -> Optional.of(crossOrderIndicator);
            case "CounterpartFirmId" -> Optional.of(counterpartFirmId);
            case "ExecutionIdOptional" -> Optional.of(executionIdOptional);
            case "ExecutionPhaseOptional" -> Optional.of(executionPhaseOptional);
            case "LastSharesOptional" -> Optional.of(lastSharesOptional);
            case "LastTradedPxOptional" -> Optional.of(lastTradedPxOptional);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "TradeQualifierOptional" -> Optional.of(tradeQualifierOptional);
            case "TradeTime" -> Optional.of(tradeTime);
            case "TradeType" -> Optional.of(tradeType);
            case "KillReason" -> Optional.of(killReason);
            case "BreachedCollarPrice" -> Optional.of(breachedCollarPrice);
            case "CollarRejType" -> Optional.of(collarRejType);
            case "RejectedMessage" -> Optional.of(rejectedMessage);
            case "ErrorCodeOptional" -> Optional.of(errorCodeOptional);
            case "StopQueuePriority" -> Optional.of(stopQueuePriority);
            case "CounterpartyReasonType" -> Optional.of(counterpartyReasonType);
            case "QuoteIndicator" -> Optional.of(quoteIndicator);
            case "LisTransactionId" -> Optional.of(lisTransactionId);
            case "WholesaleTradeType" -> Optional.of(wholesaleTradeType);
            case "EscbMembership" -> Optional.of(escbMembership);
            case "TradeUniqueIdentifier" -> Optional.of(tradeUniqueIdentifier);
            case "OrderTolerablePrice" -> Optional.of(orderTolerablePrice);
            case "OrderSweepReason" -> Optional.of(orderSweepReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LongOrderMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(longOrderFreeTextSectionGroups.diffFields(message.longOrderFreeTextSectionGroups));
        changed.addAll(longOrderOptionalFieldsGroups.diffFields(message.longOrderOptionalFieldsGroups));
        changed.addAll(longOrderClearingFieldsGroups.diffFields(message.longOrderClearingFieldsGroups));
        changed.addAll(longOrderNonModifiableOptFieldsGroups.diffFields(message.longOrderNonModifiableOptFieldsGroups));
        changed.addAll(longOrderNonModifiableShortCodesGroups.diffFields(message.longOrderNonModifiableShortCodesGroups));
        changed.addAll(longOrderModifiableShortCodesGroups.diffFields(message.longOrderModifiableShortCodesGroups));
        changed.addAll(longOrderCommercialFieldsGroups.diffFields(message.longOrderCommercialFieldsGroups));
        changed.addAll(longOrderModifiableCommercialInvestorFieldGroups.diffFields(message.longOrderModifiableCommercialInvestorFieldGroups));
        changed.addAll(longOrderNonModifiableCommercialInvestorFieldGroups.diffFields(message.longOrderNonModifiableCommercialInvestorFieldGroups));
        changed.addAll(longOrderExtendedClearingAccountGroups.diffFields(message.longOrderExtendedClearingAccountGroups));
        changed.addAll(longOrderStrategyFieldsGroups.diffFields(message.longOrderStrategyFieldsGroups));
        changed.addAll(longOrderOptionalFieldsDerivativesGroups.diffFields(message.longOrderOptionalFieldsDerivativesGroups));
        changed.addAll(longOrderAdditionalInfosGroups.diffFields(message.longOrderAdditionalInfosGroups));
        changed.addAll(longOrderShortCodesDetailsNonModifiableGroups.diffFields(message.longOrderShortCodesDetailsNonModifiableGroups));
        changed.addAll(longOrderShortCodesDetailsModifiableGroups.diffFields(message.longOrderShortCodesDetailsModifiableGroups));
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
            longOrderFreeTextSectionGroups.toFormattedString(builder, options);
            builder.append(", ");
            longOrderOptionalFieldsGroups.toFormattedString(builder, options);
            builder.append(", ");
            longOrderClearingFieldsGroups.toFormattedString(builder, options);
            builder.append(", ");
            longOrderNonModifiableOptFieldsGroups.toFormattedString(builder, options);
            builder.append(", ");
            longOrderNonModifiableShortCodesGroups.toFormattedString(builder, options);
            builder.append(", ");
            longOrderModifiableShortCodesGroups.toFormattedString(builder, options);
            builder.append(", ");
            longOrderCommercialFieldsGroups.toFormattedString(builder, options);
            builder.append(", ");
            longOrderModifiableCommercialInvestorFieldGroups.toFormattedString(builder, options);
            builder.append(", ");
            longOrderNonModifiableCommercialInvestorFieldGroups.toFormattedString(builder, options);
            builder.append(", ");
            longOrderExtendedClearingAccountGroups.toFormattedString(builder, options);
            builder.append(", ");
            longOrderStrategyFieldsGroups.toFormattedString(builder, options);
            builder.append(", ");
            longOrderOptionalFieldsDerivativesGroups.toFormattedString(builder, options);
            builder.append(", ");
            longOrderAdditionalInfosGroups.toFormattedString(builder, options);
            builder.append(", ");
            longOrderShortCodesDetailsNonModifiableGroups.toFormattedString(builder, options);
            builder.append(", ");
            longOrderShortCodesDetailsModifiableGroups.toFormattedString(builder, options);
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
        longOrderFreeTextSectionGroups.toFormattedString(builder, nested);
        longOrderOptionalFieldsGroups.toFormattedString(builder, nested);
        longOrderClearingFieldsGroups.toFormattedString(builder, nested);
        longOrderNonModifiableOptFieldsGroups.toFormattedString(builder, nested);
        longOrderNonModifiableShortCodesGroups.toFormattedString(builder, nested);
        longOrderModifiableShortCodesGroups.toFormattedString(builder, nested);
        longOrderCommercialFieldsGroups.toFormattedString(builder, nested);
        longOrderModifiableCommercialInvestorFieldGroups.toFormattedString(builder, nested);
        longOrderNonModifiableCommercialInvestorFieldGroups.toFormattedString(builder, nested);
        longOrderExtendedClearingAccountGroups.toFormattedString(builder, nested);
        longOrderStrategyFieldsGroups.toFormattedString(builder, nested);
        longOrderOptionalFieldsDerivativesGroups.toFormattedString(builder, nested);
        longOrderAdditionalInfosGroups.toFormattedString(builder, nested);
        longOrderShortCodesDetailsNonModifiableGroups.toFormattedString(builder, nested);
        longOrderShortCodesDetailsModifiableGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof LongOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && longOrderFreeTextSectionGroups.equals(message.longOrderFreeTextSectionGroups) && longOrderOptionalFieldsGroups.equals(message.longOrderOptionalFieldsGroups) && longOrderClearingFieldsGroups.equals(message.longOrderClearingFieldsGroups) && longOrderNonModifiableOptFieldsGroups.equals(message.longOrderNonModifiableOptFieldsGroups) && longOrderNonModifiableShortCodesGroups.equals(message.longOrderNonModifiableShortCodesGroups) && longOrderModifiableShortCodesGroups.equals(message.longOrderModifiableShortCodesGroups) && longOrderCommercialFieldsGroups.equals(message.longOrderCommercialFieldsGroups) && longOrderModifiableCommercialInvestorFieldGroups.equals(message.longOrderModifiableCommercialInvestorFieldGroups) && longOrderNonModifiableCommercialInvestorFieldGroups.equals(message.longOrderNonModifiableCommercialInvestorFieldGroups) && longOrderExtendedClearingAccountGroups.equals(message.longOrderExtendedClearingAccountGroups) && longOrderStrategyFieldsGroups.equals(message.longOrderStrategyFieldsGroups) && longOrderOptionalFieldsDerivativesGroups.equals(message.longOrderOptionalFieldsDerivativesGroups) && longOrderAdditionalInfosGroups.equals(message.longOrderAdditionalInfosGroups) && longOrderShortCodesDetailsNonModifiableGroups.equals(message.longOrderShortCodesDetailsNonModifiableGroups) && longOrderShortCodesDetailsModifiableGroups.equals(message.longOrderShortCodesDetailsModifiableGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, longOrderFreeTextSectionGroups, longOrderOptionalFieldsGroups, longOrderClearingFieldsGroups, longOrderNonModifiableOptFieldsGroups, longOrderNonModifiableShortCodesGroups, longOrderModifiableShortCodesGroups, longOrderCommercialFieldsGroups, longOrderModifiableCommercialInvestorFieldGroups, longOrderNonModifiableCommercialInvestorFieldGroups, longOrderExtendedClearingAccountGroups, longOrderStrategyFieldsGroups, longOrderOptionalFieldsDerivativesGroups, longOrderAdditionalInfosGroups, longOrderShortCodesDetailsNonModifiableGroups, longOrderShortCodesDetailsModifiableGroups);
    }
}
