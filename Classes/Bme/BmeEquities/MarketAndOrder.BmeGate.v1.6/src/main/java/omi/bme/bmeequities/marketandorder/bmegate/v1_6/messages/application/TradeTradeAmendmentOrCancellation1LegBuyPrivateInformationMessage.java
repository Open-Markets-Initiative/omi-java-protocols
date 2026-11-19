package omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.AccountBolsaField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.AccountField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.AccountTypeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.AggressorIndicatorField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.AlgoFlagField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.AlgorithmicTradeIndicatorField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.AllocTextField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.AmendedTradeDateField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.AmendedTradeTypeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.AutomaticOrderFilterFlagField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.BencRfptFlagField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.BolsaCodeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.BuyerBolsaCodeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.CcpCodeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.CcvField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.ClientDataIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.ClientIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.CrossIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.CsdbicField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.CtaLiqField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.DeaFlagField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.DecisorIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.DeferralWaiverField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.DesignationField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.DisplayQtyField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.EntryDateField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.ExecRefIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.ExecutorIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.ExternalMemberField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.FirmMnemonicField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.GiveInMemberField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.GrossTradeAmtField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.LastCapacityField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.LastChangeFlagField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.LastPxField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.LastQtyField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.LiquidityProvisionActivityField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.MarketMechanismField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.MarketSegmentIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.MemberField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.OrdStatusField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.OrderIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.OrderQtyField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.OrderSecurityCodeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.ParticipantField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.PersistenceField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.PreTradeTransparencyWaiverField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.PriceField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.PriorityField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.PublishDateAndTimeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.ReceivedDeptIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.RequestIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SecondaryExecIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SecondaryOrderIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SelfMatchPreventionIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SelfMatchPreventionTypeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SettlDateField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SicavFundCounterpartySideField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SubMemberField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.TradeDateField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.TradePriceConditionField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.TradeSessionDateField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.TradeTypeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.TraderField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.TradingSessionIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.TransactionCategoryField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.TransactionDateAndTimeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.TrdMatchIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.VolumeFloatField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.types.Field;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.types.Message;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the TradeTradeAmendmentOrCancellation1LegBuyPrivateInformationMessage message from the MarketAndOrder protocol.
 *
 * <p>Sent by the server to inform about a trade produced due to any reason other than order matching, also to inform about trades produced due to order matching in a Dark pool. The user is involved in the trade as Buyer. It is also sent to inform about the amendment or cancellation of whatever origin trade where the user is involved as Buyer. Shares the same layout as the next message</p>
 */
public final class TradeTradeAmendmentOrCancellation1LegBuyPrivateInformationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 317;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Trade Amendment Or Cancellation 1 Leg Buy Private Information Message";

    /**
     * Message sequence number
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Instrument (or Book) code
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     */
    private final TransactionDateAndTimeField transactionDateAndTime = new TransactionDateAndTimeField();

    /**
     * Segment MIC Code
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Trading mode
     */
    private final TradingSessionIdField tradingSessionId = new TradingSessionIdField();

    /**
     * System Trade Number
     */
    private final TrdMatchIdField trdMatchId = new TrdMatchIdField();

    /**
     * Trade type
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * Trade price
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Current trade volume
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Premium / Trade amount
     */
    private final GrossTradeAmtField grossTradeAmt = new GrossTradeAmtField();

    /**
     * Trade situation
     */
    private final DesignationField designation = new DesignationField();

    /**
     * Market Mechanism
     */
    private final MarketMechanismField marketMechanism = new MarketMechanismField();

    /**
     * Algorithmic flag indicator
     */
    private final AlgoFlagField algoFlag = new AlgoFlagField();

    /**
     * Stock Exchange code of the buyer
     */
    private final BuyerBolsaCodeField buyerBolsaCode = new BuyerBolsaCodeField();

    /**
     * Settlement date
     */
    private final SettlDateField settlDate = new SettlDateField();

    /**
     * Transaction Category
     */
    private final TransactionCategoryField transactionCategory = new TransactionCategoryField();

    /**
     * Indicates if this trade changes the instrument Last price
     */
    private final LastChangeFlagField lastChangeFlag = new LastChangeFlagField();

    /**
     * Benchmark or Reference Price Indicator MMT
     */
    private final BencRfptFlagField bencRfptFlag = new BencRfptFlagField();

    /**
     * MMT 3.8
     */
    private final TradePriceConditionField tradePriceCondition = new TradePriceConditionField();

    /**
     * Pre-trade transparency waiver
     */
    private final PreTradeTransparencyWaiverField preTradeTransparencyWaiver = new PreTradeTransparencyWaiverField();

    /**
     * Deferral Waiver
     */
    private final DeferralWaiverField deferralWaiver = new DeferralWaiverField();

    /**
     * Publication Date and Time in nanoseconds since 1-jan-1970 UTC
     */
    private final PublishDateAndTimeField publishDateAndTime = new PublishDateAndTimeField();

    /**
     * Trade date and time
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Trade Session Date
     */
    private final TradeSessionDateField tradeSessionDate = new TradeSessionDateField();

    /**
     * Volume with decimal places
     */
    private final VolumeFloatField volumeFloat = new VolumeFloatField();

    /**
     * Indicates the side of the Counterparty member in a SICAV or Mutual Fund
     */
    private final SicavFundCounterpartySideField sicavFundCounterpartySide = new SicavFundCounterpartySideField();

    /**
     * Trade type of the amended/cancelled trade
     */
    private final AmendedTradeTypeField amendedTradeType = new AmendedTradeTypeField();

    /**
     * System Trade Number of the amended/cancelled trade
     */
    private final ExecRefIdField execRefId = new ExecRefIdField();

    /**
     * Date of the amended/cancelled trade
     */
    private final AmendedTradeDateField amendedTradeDate = new AmendedTradeDateField();

    /**
     * System Order Number
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * System order entry date (when System Order Number was assigned)
     */
    private final EntryDateField entryDate = new EntryDateField();

    /**
     * Priority
     */
    private final PriorityField priority = new PriorityField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * Visible pending volume
     */
    private final DisplayQtyField displayQty = new DisplayQtyField();

    /**
     * Application Order ID (unique at security level)
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * History number
     */
    private final SecondaryExecIdField secondaryExecId = new SecondaryExecIdField();

    /**
     * Total order volume
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Order Status
     */
    private final OrdStatusField ordStatus = new OrdStatusField();

    /**
     * CCP Code
     */
    private final CcpCodeField ccpCode = new CcpCodeField();

    /**
     * Passive or aggressive indicator
     */
    private final AggressorIndicatorField aggressorIndicator = new AggressorIndicatorField();

    /**
     * Request ID (for application feedback)
     */
    private final RequestIdField requestId = new RequestIdField();

    /**
     * Client Data ID (to be used as a shortcode in orders and quotes). Valid values: 1-65535 (in response messages, 0 means no ClientDataID used)
     */
    private final ClientDataIdField clientDataId = new ClientDataIdField();

    /**
     * Algorithmic flag indicator
     */
    private final AlgorithmicTradeIndicatorField algorithmicTradeIndicator = new AlgorithmicTradeIndicatorField();

    /**
     * Mifid II ClientID
     */
    private final ClientIdField clientId = new ClientIdField();

    /**
     * Client code
     */
    private final AccountBolsaField accountBolsa = new AccountBolsaField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Direct Electronic Access indicator
     */
    private final DeaFlagField deaFlag = new DeaFlagField();

    /**
     * MIFID II DecisorID
     */
    private final DecisorIdField decisorId = new DecisorIdField();

    /**
     * Mifid II ExecutorID
     */
    private final ExecutorIdField executorId = new ExecutorIdField();

    /**
     * Liquidity Provision Activity Flag
     */
    private final LiquidityProvisionActivityField liquidityProvisionActivity = new LiquidityProvisionActivityField();

    /**
     * Give-in member
     */
    private final GiveInMemberField giveInMember = new GiveInMemberField();

    /**
     * Firm Mnemonic
     */
    private final FirmMnemonicField firmMnemonic = new FirmMnemonicField();

    /**
     * Alloc Text
     */
    private final AllocTextField allocText = new AllocTextField();

    /**
     * Last Capacity
     */
    private final LastCapacityField lastCapacity = new LastCapacityField();

    /**
     * Self Match Prevention Id
     */
    private final SelfMatchPreventionIdField selfMatchPreventionId = new SelfMatchPreventionIdField();

    /**
     * Automatic Order Filter Flag
     */
    private final AutomaticOrderFilterFlagField automaticOrderFilterFlag = new AutomaticOrderFilterFlagField();

    /**
     * Received Dept Id
     */
    private final ReceivedDeptIdField receivedDeptId = new ReceivedDeptIdField();

    /**
     * Persistence type
     */
    private final PersistenceField persistence = new PersistenceField();

    /**
     * Capacity Indicator
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * Self Match Prevention Type
     */
    private final SelfMatchPreventionTypeField selfMatchPreventionType = new SelfMatchPreventionTypeField();

    /**
     * Member
     */
    private final MemberField member = new MemberField();

    /**
     * Trader
     */
    private final TraderField trader = new TraderField();

    /**
     * Submember code
     */
    private final SubMemberField subMember = new SubMemberField();

    /**
     * Cross Trade Unique Identifier
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Bolsa code (Madrid, Barcelona, Bilbao, Valencia)
     */
    private final BolsaCodeField bolsaCode = new BolsaCodeField();

    /**
     * BIC of the Central Securities Depositary
     */
    private final CsdbicField csdbic = new CsdbicField();

    /**
     * Participant
     */
    private final ParticipantField participant = new ParticipantField();

    /**
     * Securities Account code in CSD
     */
    private final CtaLiqField ctaLiq = new CtaLiqField();

    /**
     * Securities Account code in CSD
     */
    private final CcvField ccv = new CcvField();

    /**
     * Order instrument (or Book) code
     */
    private final OrderSecurityCodeField orderSecurityCode = new OrderSecurityCodeField();

    /**
     * External Member
     */
    private final ExternalMemberField externalMember = new ExternalMemberField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, securityCode, transactionDateAndTime, marketSegmentId, tradingSessionId, trdMatchId, tradeType, lastPx, lastQty, grossTradeAmt, designation, marketMechanism, algoFlag, buyerBolsaCode, settlDate, transactionCategory, lastChangeFlag, bencRfptFlag, tradePriceCondition, preTradeTransparencyWaiver, deferralWaiver, publishDateAndTime, tradeDate, tradeSessionDate, volumeFloat, sicavFundCounterpartySide, amendedTradeType, execRefId, amendedTradeDate, secondaryOrderId, entryDate, priority, price, displayQty, orderId, secondaryExecId, orderQty, ordStatus, ccpCode, aggressorIndicator, requestId, clientDataId, algorithmicTradeIndicator, clientId, accountBolsa, account, deaFlag, decisorId, executorId, liquidityProvisionActivity, giveInMember, firmMnemonic, allocText, lastCapacity, selfMatchPreventionId, automaticOrderFilterFlag, receivedDeptId, persistence, accountType, selfMatchPreventionType, member, trader, subMember, crossId, bolsaCode, csdbic, participant, ctaLiq, ccv, orderSecurityCode, externalMember);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message sequence number
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Instrument (or Book) code
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     *
     * @return the TransactionDateAndTime field
     */
    public TransactionDateAndTimeField transactionDateAndTime() {
        return transactionDateAndTime;
    }

    /**
     * Segment MIC Code
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Trading mode
     *
     * @return the TradingSessionId field
     */
    public TradingSessionIdField tradingSessionId() {
        return tradingSessionId;
    }

    /**
     * System Trade Number
     *
     * @return the TrdMatchId field
     */
    public TrdMatchIdField trdMatchId() {
        return trdMatchId;
    }

    /**
     * Trade type
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * Trade price
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Current trade volume
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * Premium / Trade amount
     *
     * @return the GrossTradeAmt field
     */
    public GrossTradeAmtField grossTradeAmt() {
        return grossTradeAmt;
    }

    /**
     * Trade situation
     *
     * @return the Designation field
     */
    public DesignationField designation() {
        return designation;
    }

    /**
     * Market Mechanism
     *
     * @return the MarketMechanism field
     */
    public MarketMechanismField marketMechanism() {
        return marketMechanism;
    }

    /**
     * Algorithmic flag indicator
     *
     * @return the AlgoFlag field
     */
    public AlgoFlagField algoFlag() {
        return algoFlag;
    }

    /**
     * Stock Exchange code of the buyer
     *
     * @return the BuyerBolsaCode field
     */
    public BuyerBolsaCodeField buyerBolsaCode() {
        return buyerBolsaCode;
    }

    /**
     * Settlement date
     *
     * @return the SettlDate field
     */
    public SettlDateField settlDate() {
        return settlDate;
    }

    /**
     * Transaction Category
     *
     * @return the TransactionCategory field
     */
    public TransactionCategoryField transactionCategory() {
        return transactionCategory;
    }

    /**
     * Indicates if this trade changes the instrument Last price
     *
     * @return the LastChangeFlag field
     */
    public LastChangeFlagField lastChangeFlag() {
        return lastChangeFlag;
    }

    /**
     * Benchmark or Reference Price Indicator MMT
     *
     * @return the BencRfptFlag field
     */
    public BencRfptFlagField bencRfptFlag() {
        return bencRfptFlag;
    }

    /**
     * MMT 3.8
     *
     * @return the TradePriceCondition field
     */
    public TradePriceConditionField tradePriceCondition() {
        return tradePriceCondition;
    }

    /**
     * Pre-trade transparency waiver
     *
     * @return the PreTradeTransparencyWaiver field
     */
    public PreTradeTransparencyWaiverField preTradeTransparencyWaiver() {
        return preTradeTransparencyWaiver;
    }

    /**
     * Deferral Waiver
     *
     * @return the DeferralWaiver field
     */
    public DeferralWaiverField deferralWaiver() {
        return deferralWaiver;
    }

    /**
     * Publication Date and Time in nanoseconds since 1-jan-1970 UTC
     *
     * @return the PublishDateAndTime field
     */
    public PublishDateAndTimeField publishDateAndTime() {
        return publishDateAndTime;
    }

    /**
     * Trade date and time
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Trade Session Date
     *
     * @return the TradeSessionDate field
     */
    public TradeSessionDateField tradeSessionDate() {
        return tradeSessionDate;
    }

    /**
     * Volume with decimal places
     *
     * @return the VolumeFloat field
     */
    public VolumeFloatField volumeFloat() {
        return volumeFloat;
    }

    /**
     * Indicates the side of the Counterparty member in a SICAV or Mutual Fund
     *
     * @return the SicavFundCounterpartySide field
     */
    public SicavFundCounterpartySideField sicavFundCounterpartySide() {
        return sicavFundCounterpartySide;
    }

    /**
     * Trade type of the amended/cancelled trade
     *
     * @return the AmendedTradeType field
     */
    public AmendedTradeTypeField amendedTradeType() {
        return amendedTradeType;
    }

    /**
     * System Trade Number of the amended/cancelled trade
     *
     * @return the ExecRefId field
     */
    public ExecRefIdField execRefId() {
        return execRefId;
    }

    /**
     * Date of the amended/cancelled trade
     *
     * @return the AmendedTradeDate field
     */
    public AmendedTradeDateField amendedTradeDate() {
        return amendedTradeDate;
    }

    /**
     * System Order Number
     *
     * @return the SecondaryOrderId field
     */
    public SecondaryOrderIdField secondaryOrderId() {
        return secondaryOrderId;
    }

    /**
     * System order entry date (when System Order Number was assigned)
     *
     * @return the EntryDate field
     */
    public EntryDateField entryDate() {
        return entryDate;
    }

    /**
     * Priority
     *
     * @return the Priority field
     */
    public PriorityField priority() {
        return priority;
    }

    /**
     * Limit price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Visible pending volume
     *
     * @return the DisplayQty field
     */
    public DisplayQtyField displayQty() {
        return displayQty;
    }

    /**
     * Application Order ID (unique at security level)
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * History number
     *
     * @return the SecondaryExecId field
     */
    public SecondaryExecIdField secondaryExecId() {
        return secondaryExecId;
    }

    /**
     * Total order volume
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Order Status
     *
     * @return the OrdStatus field
     */
    public OrdStatusField ordStatus() {
        return ordStatus;
    }

    /**
     * CCP Code
     *
     * @return the CcpCode field
     */
    public CcpCodeField ccpCode() {
        return ccpCode;
    }

    /**
     * Passive or aggressive indicator
     *
     * @return the AggressorIndicator field
     */
    public AggressorIndicatorField aggressorIndicator() {
        return aggressorIndicator;
    }

    /**
     * Request ID (for application feedback)
     *
     * @return the RequestId field
     */
    public RequestIdField requestId() {
        return requestId;
    }

    /**
     * Client Data ID (to be used as a shortcode in orders and quotes). Valid values: 1-65535 (in response messages, 0 means no ClientDataID used)
     *
     * @return the ClientDataId field
     */
    public ClientDataIdField clientDataId() {
        return clientDataId;
    }

    /**
     * Algorithmic flag indicator
     *
     * @return the AlgorithmicTradeIndicator field
     */
    public AlgorithmicTradeIndicatorField algorithmicTradeIndicator() {
        return algorithmicTradeIndicator;
    }

    /**
     * Mifid II ClientID
     *
     * @return the ClientId field
     */
    public ClientIdField clientId() {
        return clientId;
    }

    /**
     * Client code
     *
     * @return the AccountBolsa field
     */
    public AccountBolsaField accountBolsa() {
        return accountBolsa;
    }

    /**
     * Account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Direct Electronic Access indicator
     *
     * @return the DeaFlag field
     */
    public DeaFlagField deaFlag() {
        return deaFlag;
    }

    /**
     * MIFID II DecisorID
     *
     * @return the DecisorId field
     */
    public DecisorIdField decisorId() {
        return decisorId;
    }

    /**
     * Mifid II ExecutorID
     *
     * @return the ExecutorId field
     */
    public ExecutorIdField executorId() {
        return executorId;
    }

    /**
     * Liquidity Provision Activity Flag
     *
     * @return the LiquidityProvisionActivity field
     */
    public LiquidityProvisionActivityField liquidityProvisionActivity() {
        return liquidityProvisionActivity;
    }

    /**
     * Give-in member
     *
     * @return the GiveInMember field
     */
    public GiveInMemberField giveInMember() {
        return giveInMember;
    }

    /**
     * Firm Mnemonic
     *
     * @return the FirmMnemonic field
     */
    public FirmMnemonicField firmMnemonic() {
        return firmMnemonic;
    }

    /**
     * Alloc Text
     *
     * @return the AllocText field
     */
    public AllocTextField allocText() {
        return allocText;
    }

    /**
     * Last Capacity
     *
     * @return the LastCapacity field
     */
    public LastCapacityField lastCapacity() {
        return lastCapacity;
    }

    /**
     * Self Match Prevention Id
     *
     * @return the SelfMatchPreventionId field
     */
    public SelfMatchPreventionIdField selfMatchPreventionId() {
        return selfMatchPreventionId;
    }

    /**
     * Automatic Order Filter Flag
     *
     * @return the AutomaticOrderFilterFlag field
     */
    public AutomaticOrderFilterFlagField automaticOrderFilterFlag() {
        return automaticOrderFilterFlag;
    }

    /**
     * Received Dept Id
     *
     * @return the ReceivedDeptId field
     */
    public ReceivedDeptIdField receivedDeptId() {
        return receivedDeptId;
    }

    /**
     * Persistence type
     *
     * @return the Persistence field
     */
    public PersistenceField persistence() {
        return persistence;
    }

    /**
     * Capacity Indicator
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
    }

    /**
     * Self Match Prevention Type
     *
     * @return the SelfMatchPreventionType field
     */
    public SelfMatchPreventionTypeField selfMatchPreventionType() {
        return selfMatchPreventionType;
    }

    /**
     * Member
     *
     * @return the Member field
     */
    public MemberField member() {
        return member;
    }

    /**
     * Trader
     *
     * @return the Trader field
     */
    public TraderField trader() {
        return trader;
    }

    /**
     * Submember code
     *
     * @return the SubMember field
     */
    public SubMemberField subMember() {
        return subMember;
    }

    /**
     * Cross Trade Unique Identifier
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
    }

    /**
     * Bolsa code (Madrid, Barcelona, Bilbao, Valencia)
     *
     * @return the BolsaCode field
     */
    public BolsaCodeField bolsaCode() {
        return bolsaCode;
    }

    /**
     * BIC of the Central Securities Depositary
     *
     * @return the Csdbic field
     */
    public CsdbicField csdbic() {
        return csdbic;
    }

    /**
     * Participant
     *
     * @return the Participant field
     */
    public ParticipantField participant() {
        return participant;
    }

    /**
     * Securities Account code in CSD
     *
     * @return the CtaLiq field
     */
    public CtaLiqField ctaLiq() {
        return ctaLiq;
    }

    /**
     * Securities Account code in CSD
     *
     * @return the Ccv field
     */
    public CcvField ccv() {
        return ccv;
    }

    /**
     * Order instrument (or Book) code
     *
     * @return the OrderSecurityCode field
     */
    public OrderSecurityCodeField orderSecurityCode() {
        return orderSecurityCode;
    }

    /**
     * External Member
     *
     * @return the ExternalMember field
     */
    public ExternalMemberField externalMember() {
        return externalMember;
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
        return Optional.ofNullable(transactionDateAndTime.value());
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
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!transactionDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionDateAndTimeField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!tradingSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionIdField.BYTE_LENGTH;
        if (!trdMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += TrdMatchIdField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!grossTradeAmt.parse(data, cursor)) {
            return false;
        }
        cursor += GrossTradeAmtField.BYTE_LENGTH;
        if (!designation.parse(data, cursor)) {
            return false;
        }
        cursor += DesignationField.BYTE_LENGTH;
        if (!marketMechanism.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMechanismField.BYTE_LENGTH;
        if (!algoFlag.parse(data, cursor)) {
            return false;
        }
        cursor += AlgoFlagField.BYTE_LENGTH;
        if (!buyerBolsaCode.parse(data, cursor)) {
            return false;
        }
        cursor += BuyerBolsaCodeField.BYTE_LENGTH;
        if (!settlDate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlDateField.BYTE_LENGTH;
        if (!transactionCategory.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionCategoryField.BYTE_LENGTH;
        if (!lastChangeFlag.parse(data, cursor)) {
            return false;
        }
        cursor += LastChangeFlagField.BYTE_LENGTH;
        if (!bencRfptFlag.parse(data, cursor)) {
            return false;
        }
        cursor += BencRfptFlagField.BYTE_LENGTH;
        if (!tradePriceCondition.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceConditionField.BYTE_LENGTH;
        if (!preTradeTransparencyWaiver.parse(data, cursor)) {
            return false;
        }
        cursor += PreTradeTransparencyWaiverField.BYTE_LENGTH;
        if (!deferralWaiver.parse(data, cursor)) {
            return false;
        }
        cursor += DeferralWaiverField.BYTE_LENGTH;
        if (!publishDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += PublishDateAndTimeField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!tradeSessionDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeSessionDateField.BYTE_LENGTH;
        if (!volumeFloat.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeFloatField.BYTE_LENGTH;
        if (!sicavFundCounterpartySide.parse(data, cursor)) {
            return false;
        }
        cursor += SicavFundCounterpartySideField.BYTE_LENGTH;
        if (!amendedTradeType.parse(data, cursor)) {
            return false;
        }
        cursor += AmendedTradeTypeField.BYTE_LENGTH;
        if (!execRefId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecRefIdField.BYTE_LENGTH;
        if (!amendedTradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += AmendedTradeDateField.BYTE_LENGTH;
        if (!secondaryOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryOrderIdField.BYTE_LENGTH;
        if (!entryDate.parse(data, cursor)) {
            return false;
        }
        cursor += EntryDateField.BYTE_LENGTH;
        if (!priority.parse(data, cursor)) {
            return false;
        }
        cursor += PriorityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!displayQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayQtyField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!secondaryExecId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryExecIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!ordStatus.parse(data, cursor)) {
            return false;
        }
        cursor += OrdStatusField.BYTE_LENGTH;
        if (!ccpCode.parse(data, cursor)) {
            return false;
        }
        cursor += CcpCodeField.BYTE_LENGTH;
        if (!aggressorIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AggressorIndicatorField.BYTE_LENGTH;
        if (!requestId.parse(data, cursor)) {
            return false;
        }
        cursor += RequestIdField.BYTE_LENGTH;
        if (!clientDataId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientDataIdField.BYTE_LENGTH;
        if (!algorithmicTradeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AlgorithmicTradeIndicatorField.BYTE_LENGTH;
        if (!clientId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientIdField.BYTE_LENGTH;
        if (!accountBolsa.parse(data, cursor)) {
            return false;
        }
        cursor += AccountBolsaField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!deaFlag.parse(data, cursor)) {
            return false;
        }
        cursor += DeaFlagField.BYTE_LENGTH;
        if (!decisorId.parse(data, cursor)) {
            return false;
        }
        cursor += DecisorIdField.BYTE_LENGTH;
        if (!executorId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutorIdField.BYTE_LENGTH;
        if (!liquidityProvisionActivity.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityProvisionActivityField.BYTE_LENGTH;
        if (!giveInMember.parse(data, cursor)) {
            return false;
        }
        cursor += GiveInMemberField.BYTE_LENGTH;
        if (!firmMnemonic.parse(data, cursor)) {
            return false;
        }
        cursor += FirmMnemonicField.BYTE_LENGTH;
        if (!allocText.parse(data, cursor)) {
            return false;
        }
        cursor += AllocTextField.BYTE_LENGTH;
        if (!lastCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += LastCapacityField.BYTE_LENGTH;
        if (!selfMatchPreventionId.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionIdField.BYTE_LENGTH;
        if (!automaticOrderFilterFlag.parse(data, cursor)) {
            return false;
        }
        cursor += AutomaticOrderFilterFlagField.BYTE_LENGTH;
        if (!receivedDeptId.parse(data, cursor)) {
            return false;
        }
        cursor += ReceivedDeptIdField.BYTE_LENGTH;
        if (!persistence.parse(data, cursor)) {
            return false;
        }
        cursor += PersistenceField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!selfMatchPreventionType.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionTypeField.BYTE_LENGTH;
        if (!member.parse(data, cursor)) {
            return false;
        }
        cursor += MemberField.BYTE_LENGTH;
        if (!trader.parse(data, cursor)) {
            return false;
        }
        cursor += TraderField.BYTE_LENGTH;
        if (!subMember.parse(data, cursor)) {
            return false;
        }
        cursor += SubMemberField.BYTE_LENGTH;
        if (!crossId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIdField.BYTE_LENGTH;
        if (!bolsaCode.parse(data, cursor)) {
            return false;
        }
        cursor += BolsaCodeField.BYTE_LENGTH;
        if (!csdbic.parse(data, cursor)) {
            return false;
        }
        cursor += CsdbicField.BYTE_LENGTH;
        if (!participant.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantField.BYTE_LENGTH;
        if (!ctaLiq.parse(data, cursor)) {
            return false;
        }
        cursor += CtaLiqField.BYTE_LENGTH;
        if (!ccv.parse(data, cursor)) {
            return false;
        }
        cursor += CcvField.BYTE_LENGTH;
        if (!orderSecurityCode.parse(data, cursor)) {
            return false;
        }
        cursor += OrderSecurityCodeField.BYTE_LENGTH;
        return externalMember.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sequenceNumber.encode(data, cursor);
        cursor = securityCode.encode(data, cursor);
        cursor = transactionDateAndTime.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = tradingSessionId.encode(data, cursor);
        cursor = trdMatchId.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = grossTradeAmt.encode(data, cursor);
        cursor = designation.encode(data, cursor);
        cursor = marketMechanism.encode(data, cursor);
        cursor = algoFlag.encode(data, cursor);
        cursor = buyerBolsaCode.encode(data, cursor);
        cursor = settlDate.encode(data, cursor);
        cursor = transactionCategory.encode(data, cursor);
        cursor = lastChangeFlag.encode(data, cursor);
        cursor = bencRfptFlag.encode(data, cursor);
        cursor = tradePriceCondition.encode(data, cursor);
        cursor = preTradeTransparencyWaiver.encode(data, cursor);
        cursor = deferralWaiver.encode(data, cursor);
        cursor = publishDateAndTime.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = tradeSessionDate.encode(data, cursor);
        cursor = volumeFloat.encode(data, cursor);
        cursor = sicavFundCounterpartySide.encode(data, cursor);
        cursor = amendedTradeType.encode(data, cursor);
        cursor = execRefId.encode(data, cursor);
        cursor = amendedTradeDate.encode(data, cursor);
        cursor = secondaryOrderId.encode(data, cursor);
        cursor = entryDate.encode(data, cursor);
        cursor = priority.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = displayQty.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = secondaryExecId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = ordStatus.encode(data, cursor);
        cursor = ccpCode.encode(data, cursor);
        cursor = aggressorIndicator.encode(data, cursor);
        cursor = requestId.encode(data, cursor);
        cursor = clientDataId.encode(data, cursor);
        cursor = algorithmicTradeIndicator.encode(data, cursor);
        cursor = clientId.encode(data, cursor);
        cursor = accountBolsa.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = deaFlag.encode(data, cursor);
        cursor = decisorId.encode(data, cursor);
        cursor = executorId.encode(data, cursor);
        cursor = liquidityProvisionActivity.encode(data, cursor);
        cursor = giveInMember.encode(data, cursor);
        cursor = firmMnemonic.encode(data, cursor);
        cursor = allocText.encode(data, cursor);
        cursor = lastCapacity.encode(data, cursor);
        cursor = selfMatchPreventionId.encode(data, cursor);
        cursor = automaticOrderFilterFlag.encode(data, cursor);
        cursor = receivedDeptId.encode(data, cursor);
        cursor = persistence.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = selfMatchPreventionType.encode(data, cursor);
        cursor = member.encode(data, cursor);
        cursor = trader.encode(data, cursor);
        cursor = subMember.encode(data, cursor);
        cursor = crossId.encode(data, cursor);
        cursor = bolsaCode.encode(data, cursor);
        cursor = csdbic.encode(data, cursor);
        cursor = participant.encode(data, cursor);
        cursor = ctaLiq.encode(data, cursor);
        cursor = ccv.encode(data, cursor);
        cursor = orderSecurityCode.encode(data, cursor);
        cursor = externalMember.encode(data, cursor);
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
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "SecurityCode" -> Optional.of(securityCode);
            case "TransactionDateAndTime" -> Optional.of(transactionDateAndTime);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "TradingSessionId" -> Optional.of(tradingSessionId);
            case "TrdMatchId" -> Optional.of(trdMatchId);
            case "TradeType" -> Optional.of(tradeType);
            case "LastPx" -> Optional.of(lastPx);
            case "LastQty" -> Optional.of(lastQty);
            case "GrossTradeAmt" -> Optional.of(grossTradeAmt);
            case "Designation" -> Optional.of(designation);
            case "MarketMechanism" -> Optional.of(marketMechanism);
            case "AlgoFlag" -> Optional.of(algoFlag);
            case "BuyerBolsaCode" -> Optional.of(buyerBolsaCode);
            case "SettlDate" -> Optional.of(settlDate);
            case "TransactionCategory" -> Optional.of(transactionCategory);
            case "LastChangeFlag" -> Optional.of(lastChangeFlag);
            case "BencRfptFlag" -> Optional.of(bencRfptFlag);
            case "TradePriceCondition" -> Optional.of(tradePriceCondition);
            case "PreTradeTransparencyWaiver" -> Optional.of(preTradeTransparencyWaiver);
            case "DeferralWaiver" -> Optional.of(deferralWaiver);
            case "PublishDateAndTime" -> Optional.of(publishDateAndTime);
            case "TradeDate" -> Optional.of(tradeDate);
            case "TradeSessionDate" -> Optional.of(tradeSessionDate);
            case "VolumeFloat" -> Optional.of(volumeFloat);
            case "SicavFundCounterpartySide" -> Optional.of(sicavFundCounterpartySide);
            case "AmendedTradeType" -> Optional.of(amendedTradeType);
            case "ExecRefId" -> Optional.of(execRefId);
            case "AmendedTradeDate" -> Optional.of(amendedTradeDate);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "EntryDate" -> Optional.of(entryDate);
            case "Priority" -> Optional.of(priority);
            case "Price" -> Optional.of(price);
            case "DisplayQty" -> Optional.of(displayQty);
            case "OrderId" -> Optional.of(orderId);
            case "SecondaryExecId" -> Optional.of(secondaryExecId);
            case "OrderQty" -> Optional.of(orderQty);
            case "OrdStatus" -> Optional.of(ordStatus);
            case "CcpCode" -> Optional.of(ccpCode);
            case "AggressorIndicator" -> Optional.of(aggressorIndicator);
            case "RequestId" -> Optional.of(requestId);
            case "ClientDataId" -> Optional.of(clientDataId);
            case "AlgorithmicTradeIndicator" -> Optional.of(algorithmicTradeIndicator);
            case "ClientId" -> Optional.of(clientId);
            case "AccountBolsa" -> Optional.of(accountBolsa);
            case "Account" -> Optional.of(account);
            case "DeaFlag" -> Optional.of(deaFlag);
            case "DecisorId" -> Optional.of(decisorId);
            case "ExecutorId" -> Optional.of(executorId);
            case "LiquidityProvisionActivity" -> Optional.of(liquidityProvisionActivity);
            case "GiveInMember" -> Optional.of(giveInMember);
            case "FirmMnemonic" -> Optional.of(firmMnemonic);
            case "AllocText" -> Optional.of(allocText);
            case "LastCapacity" -> Optional.of(lastCapacity);
            case "SelfMatchPreventionId" -> Optional.of(selfMatchPreventionId);
            case "AutomaticOrderFilterFlag" -> Optional.of(automaticOrderFilterFlag);
            case "ReceivedDeptId" -> Optional.of(receivedDeptId);
            case "Persistence" -> Optional.of(persistence);
            case "AccountType" -> Optional.of(accountType);
            case "SelfMatchPreventionType" -> Optional.of(selfMatchPreventionType);
            case "Member" -> Optional.of(member);
            case "Trader" -> Optional.of(trader);
            case "SubMember" -> Optional.of(subMember);
            case "CrossId" -> Optional.of(crossId);
            case "BolsaCode" -> Optional.of(bolsaCode);
            case "Csdbic" -> Optional.of(csdbic);
            case "Participant" -> Optional.of(participant);
            case "CtaLiq" -> Optional.of(ctaLiq);
            case "Ccv" -> Optional.of(ccv);
            case "OrderSecurityCode" -> Optional.of(orderSecurityCode);
            case "ExternalMember" -> Optional.of(externalMember);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeTradeAmendmentOrCancellation1LegBuyPrivateInformationMessage message)) {
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
        if (!(other instanceof TradeTradeAmendmentOrCancellation1LegBuyPrivateInformationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
