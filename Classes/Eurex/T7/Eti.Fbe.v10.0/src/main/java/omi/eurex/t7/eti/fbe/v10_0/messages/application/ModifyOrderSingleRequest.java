package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.AccountField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ApplSeqIndicatorField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ClOrdIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ComplianceTextField;
import omi.eurex.t7.eti.fbe.v10_0.fields.CustOrderHandlingInstField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecInstField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecutingTraderField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecutingTraderQualifierField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExpireDateField;
import omi.eurex.t7.eti.fbe.v10_0.fields.FixClOrdIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.FreeText1Field;
import omi.eurex.t7.eti.fbe.v10_0.fields.FreeText2Field;
import omi.eurex.t7.eti.fbe.v10_0.fields.FreeText3Field;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MatchInstCrossIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrdTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrderAttributeLiquidityProvisionField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrderIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrderOriginationField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrderQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrigClOrdIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OwnershipIndicatorField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdBeneficiaryField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdClientIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdInvestmentDecisionMakerField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdInvestmentDecisionMakerQualifierField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdLocationIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdOrderOriginationFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdPositionAccountField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdTakeUpTradingFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PositionEffectField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PriceField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PriceValidityCheckTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SideField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SimpleSecurityIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.StopPxField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TargetPartyIdSessionIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TimeInForceField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradingCapacityField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradingSessionSubIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ValueCheckTypeValueField;
import omi.eurex.t7.eti.fbe.v10_0.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the ModifyOrderSingleRequest message from the Eti protocol.
 */
public final class ModifyOrderSingleRequest implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 266;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Modify Order Single Request";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 2, 259, 7 };

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Order Id
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Cl Ord Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Orig Cl Ord Id
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Order Qty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Party Id Client Id
     */
    private final PartyIdClientIdField partyIdClientId = new PartyIdClientIdField();

    /**
     * Party Id Investment Decision Maker
     */
    private final PartyIdInvestmentDecisionMakerField partyIdInvestmentDecisionMaker = new PartyIdInvestmentDecisionMakerField();

    /**
     * Executing Trader
     */
    private final ExecutingTraderField executingTrader = new ExecutingTraderField();

    /**
     * Expire Date
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Simple Security Id
     */
    private final SimpleSecurityIdField simpleSecurityId = new SimpleSecurityIdField();

    /**
     * Match Inst Cross Id
     */
    private final MatchInstCrossIdField matchInstCrossId = new MatchInstCrossIdField();

    /**
     * Target Party Id Session Id
     */
    private final TargetPartyIdSessionIdField targetPartyIdSessionId = new TargetPartyIdSessionIdField();

    /**
     * Party Id Take Up Trading Firm
     */
    private final PartyIdTakeUpTradingFirmField partyIdTakeUpTradingFirm = new PartyIdTakeUpTradingFirmField();

    /**
     * Party Id Order Origination Firm
     */
    private final PartyIdOrderOriginationFirmField partyIdOrderOriginationFirm = new PartyIdOrderOriginationFirmField();

    /**
     * Party Id Beneficiary
     */
    private final PartyIdBeneficiaryField partyIdBeneficiary = new PartyIdBeneficiaryField();

    /**
     * Appl Seq Indicator
     */
    private final ApplSeqIndicatorField applSeqIndicator = new ApplSeqIndicatorField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Price Validity Check Type
     */
    private final PriceValidityCheckTypeField priceValidityCheckType = new PriceValidityCheckTypeField();

    /**
     * Value Check Type Value
     */
    private final ValueCheckTypeValueField valueCheckTypeValue = new ValueCheckTypeValueField();

    /**
     * Order Attribute Liquidity Provision
     */
    private final OrderAttributeLiquidityProvisionField orderAttributeLiquidityProvision = new OrderAttributeLiquidityProvisionField();

    /**
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Trading Session Sub Id
     */
    private final TradingSessionSubIdField tradingSessionSubId = new TradingSessionSubIdField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Order Origination
     */
    private final OrderOriginationField orderOrigination = new OrderOriginationField();

    /**
     * Party Id Investment Decision Maker Qualifier
     */
    private final PartyIdInvestmentDecisionMakerQualifierField partyIdInvestmentDecisionMakerQualifier = new PartyIdInvestmentDecisionMakerQualifierField();

    /**
     * Executing Trader Qualifier
     */
    private final ExecutingTraderQualifierField executingTraderQualifier = new ExecutingTraderQualifierField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Party Id Position Account
     */
    private final PartyIdPositionAccountField partyIdPositionAccount = new PartyIdPositionAccountField();

    /**
     * Position Effect
     */
    private final PositionEffectField positionEffect = new PositionEffectField();

    /**
     * Ownership Indicator
     */
    private final OwnershipIndicatorField ownershipIndicator = new OwnershipIndicatorField();

    /**
     * Party Id Location Id
     */
    private final PartyIdLocationIdField partyIdLocationId = new PartyIdLocationIdField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * Compliance Text
     */
    private final ComplianceTextField complianceText = new ComplianceTextField();

    /**
     * Free Text 1
     */
    private final FreeText1Field freeText1 = new FreeText1Field();

    /**
     * Free Text 2
     */
    private final FreeText2Field freeText2 = new FreeText2Field();

    /**
     * Free Text 3
     */
    private final FreeText3Field freeText3 = new FreeText3Field();

    /**
     * Fix Cl Ord Id
     */
    private final FixClOrdIdField fixClOrdId = new FixClOrdIdField();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(orderId), List.<Field>of(clOrdId), List.<Field>of(origClOrdId), List.<Field>of(price), List.<Field>of(orderQty), List.<Field>of(stopPx), List.<Field>of(partyIdClientId), List.<Field>of(partyIdInvestmentDecisionMaker), List.<Field>of(executingTrader), List.<Field>of(expireDate), List.<Field>of(marketSegmentId), List.<Field>of(simpleSecurityId), List.<Field>of(matchInstCrossId), List.<Field>of(targetPartyIdSessionId), List.<Field>of(partyIdTakeUpTradingFirm), List.<Field>of(partyIdOrderOriginationFirm), List.<Field>of(partyIdBeneficiary), List.<Field>of(applSeqIndicator), List.<Field>of(side), List.<Field>of(ordType), List.<Field>of(priceValidityCheckType), List.<Field>of(valueCheckTypeValue), List.<Field>of(orderAttributeLiquidityProvision), List.<Field>of(timeInForce), List.<Field>of(execInst), List.<Field>of(tradingSessionSubId), List.<Field>of(tradingCapacity), List.<Field>of(orderOrigination), List.<Field>of(partyIdInvestmentDecisionMakerQualifier), List.<Field>of(executingTraderQualifier), List.<Field>of(account), List.<Field>of(partyIdPositionAccount), List.<Field>of(positionEffect), List.<Field>of(ownershipIndicator), List.<Field>of(partyIdLocationId), List.<Field>of(custOrderHandlingInst), List.<Field>of(complianceText), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText3), List.<Field>of(fixClOrdId)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Network Msg Id
     *
     * @return the NetworkMsgId field
     */
    public NetworkMsgIdField networkMsgId() {
        return networkMsgId;
    }

    /**
     * Order Id
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Cl Ord Id
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Orig Cl Ord Id
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Order Qty
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Stop Px
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Party Id Client Id
     *
     * @return the PartyIdClientId field
     */
    public PartyIdClientIdField partyIdClientId() {
        return partyIdClientId;
    }

    /**
     * Party Id Investment Decision Maker
     *
     * @return the PartyIdInvestmentDecisionMaker field
     */
    public PartyIdInvestmentDecisionMakerField partyIdInvestmentDecisionMaker() {
        return partyIdInvestmentDecisionMaker;
    }

    /**
     * Executing Trader
     *
     * @return the ExecutingTrader field
     */
    public ExecutingTraderField executingTrader() {
        return executingTrader;
    }

    /**
     * Expire Date
     *
     * @return the ExpireDate field
     */
    public ExpireDateField expireDate() {
        return expireDate;
    }

    /**
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Simple Security Id
     *
     * @return the SimpleSecurityId field
     */
    public SimpleSecurityIdField simpleSecurityId() {
        return simpleSecurityId;
    }

    /**
     * Match Inst Cross Id
     *
     * @return the MatchInstCrossId field
     */
    public MatchInstCrossIdField matchInstCrossId() {
        return matchInstCrossId;
    }

    /**
     * Target Party Id Session Id
     *
     * @return the TargetPartyIdSessionId field
     */
    public TargetPartyIdSessionIdField targetPartyIdSessionId() {
        return targetPartyIdSessionId;
    }

    /**
     * Party Id Take Up Trading Firm
     *
     * @return the PartyIdTakeUpTradingFirm field
     */
    public PartyIdTakeUpTradingFirmField partyIdTakeUpTradingFirm() {
        return partyIdTakeUpTradingFirm;
    }

    /**
     * Party Id Order Origination Firm
     *
     * @return the PartyIdOrderOriginationFirm field
     */
    public PartyIdOrderOriginationFirmField partyIdOrderOriginationFirm() {
        return partyIdOrderOriginationFirm;
    }

    /**
     * Party Id Beneficiary
     *
     * @return the PartyIdBeneficiary field
     */
    public PartyIdBeneficiaryField partyIdBeneficiary() {
        return partyIdBeneficiary;
    }

    /**
     * Appl Seq Indicator
     *
     * @return the ApplSeqIndicator field
     */
    public ApplSeqIndicatorField applSeqIndicator() {
        return applSeqIndicator;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Ord Type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Price Validity Check Type
     *
     * @return the PriceValidityCheckType field
     */
    public PriceValidityCheckTypeField priceValidityCheckType() {
        return priceValidityCheckType;
    }

    /**
     * Value Check Type Value
     *
     * @return the ValueCheckTypeValue field
     */
    public ValueCheckTypeValueField valueCheckTypeValue() {
        return valueCheckTypeValue;
    }

    /**
     * Order Attribute Liquidity Provision
     *
     * @return the OrderAttributeLiquidityProvision field
     */
    public OrderAttributeLiquidityProvisionField orderAttributeLiquidityProvision() {
        return orderAttributeLiquidityProvision;
    }

    /**
     * Time In Force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Exec Inst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * Trading Session Sub Id
     *
     * @return the TradingSessionSubId field
     */
    public TradingSessionSubIdField tradingSessionSubId() {
        return tradingSessionSubId;
    }

    /**
     * Trading Capacity
     *
     * @return the TradingCapacity field
     */
    public TradingCapacityField tradingCapacity() {
        return tradingCapacity;
    }

    /**
     * Order Origination
     *
     * @return the OrderOrigination field
     */
    public OrderOriginationField orderOrigination() {
        return orderOrigination;
    }

    /**
     * Party Id Investment Decision Maker Qualifier
     *
     * @return the PartyIdInvestmentDecisionMakerQualifier field
     */
    public PartyIdInvestmentDecisionMakerQualifierField partyIdInvestmentDecisionMakerQualifier() {
        return partyIdInvestmentDecisionMakerQualifier;
    }

    /**
     * Executing Trader Qualifier
     *
     * @return the ExecutingTraderQualifier field
     */
    public ExecutingTraderQualifierField executingTraderQualifier() {
        return executingTraderQualifier;
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
     * Party Id Position Account
     *
     * @return the PartyIdPositionAccount field
     */
    public PartyIdPositionAccountField partyIdPositionAccount() {
        return partyIdPositionAccount;
    }

    /**
     * Position Effect
     *
     * @return the PositionEffect field
     */
    public PositionEffectField positionEffect() {
        return positionEffect;
    }

    /**
     * Ownership Indicator
     *
     * @return the OwnershipIndicator field
     */
    public OwnershipIndicatorField ownershipIndicator() {
        return ownershipIndicator;
    }

    /**
     * Party Id Location Id
     *
     * @return the PartyIdLocationId field
     */
    public PartyIdLocationIdField partyIdLocationId() {
        return partyIdLocationId;
    }

    /**
     * Cust Order Handling Inst
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
    }

    /**
     * Compliance Text
     *
     * @return the ComplianceText field
     */
    public ComplianceTextField complianceText() {
        return complianceText;
    }

    /**
     * Free Text 1
     *
     * @return the FreeText1 field
     */
    public FreeText1Field freeText1() {
        return freeText1;
    }

    /**
     * Free Text 2
     *
     * @return the FreeText2 field
     */
    public FreeText2Field freeText2() {
        return freeText2;
    }

    /**
     * Free Text 3
     *
     * @return the FreeText3 field
     */
    public FreeText3Field freeText3() {
        return freeText3;
    }

    /**
     * Fix Cl Ord Id
     *
     * @return the FixClOrdId field
     */
    public FixClOrdIdField fixClOrdId() {
        return fixClOrdId;
    }

    /**
     * Request Header Comp
     *
     * @return the RequestHeaderComp record
     */
    public RequestHeaderComp requestHeaderComp() {
        return requestHeaderComp;
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
        return PADDING.clone();
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
        if (!networkMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += NetworkMsgIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 248)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!partyIdClientId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdClientIdField.BYTE_LENGTH;
        if (!partyIdInvestmentDecisionMaker.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdInvestmentDecisionMakerField.BYTE_LENGTH;
        if (!executingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderField.BYTE_LENGTH;
        if (!expireDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!simpleSecurityId.parse(data, cursor)) {
            return false;
        }
        cursor += SimpleSecurityIdField.BYTE_LENGTH;
        if (!matchInstCrossId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchInstCrossIdField.BYTE_LENGTH;
        if (!targetPartyIdSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyIdSessionIdField.BYTE_LENGTH;
        if (!partyIdTakeUpTradingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdTakeUpTradingFirmField.BYTE_LENGTH;
        if (!partyIdOrderOriginationFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdOrderOriginationFirmField.BYTE_LENGTH;
        if (!partyIdBeneficiary.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdBeneficiaryField.BYTE_LENGTH;
        if (!applSeqIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ApplSeqIndicatorField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!priceValidityCheckType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceValidityCheckTypeField.BYTE_LENGTH;
        if (!valueCheckTypeValue.parse(data, cursor)) {
            return false;
        }
        cursor += ValueCheckTypeValueField.BYTE_LENGTH;
        if (!orderAttributeLiquidityProvision.parse(data, cursor)) {
            return false;
        }
        cursor += OrderAttributeLiquidityProvisionField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!tradingSessionSubId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionSubIdField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!orderOrigination.parse(data, cursor)) {
            return false;
        }
        cursor += OrderOriginationField.BYTE_LENGTH;
        if (!partyIdInvestmentDecisionMakerQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdInvestmentDecisionMakerQualifierField.BYTE_LENGTH;
        if (!executingTraderQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderQualifierField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!partyIdPositionAccount.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdPositionAccountField.BYTE_LENGTH;
        if (!positionEffect.parse(data, cursor)) {
            return false;
        }
        cursor += PositionEffectField.BYTE_LENGTH;
        if (!ownershipIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OwnershipIndicatorField.BYTE_LENGTH;
        if (!partyIdLocationId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdLocationIdField.BYTE_LENGTH;
        if (!custOrderHandlingInst.parse(data, cursor)) {
            return false;
        }
        cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        if (!complianceText.parse(data, cursor)) {
            return false;
        }
        cursor += ComplianceTextField.BYTE_LENGTH;
        if (!freeText1.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText1Field.BYTE_LENGTH;
        if (!freeText2.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText2Field.BYTE_LENGTH;
        if (!freeText3.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText3Field.BYTE_LENGTH;
        if (!fixClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += FixClOrdIdField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = partyIdClientId.encode(data, cursor);
        cursor = partyIdInvestmentDecisionMaker.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = simpleSecurityId.encode(data, cursor);
        cursor = matchInstCrossId.encode(data, cursor);
        cursor = targetPartyIdSessionId.encode(data, cursor);
        cursor = partyIdTakeUpTradingFirm.encode(data, cursor);
        cursor = partyIdOrderOriginationFirm.encode(data, cursor);
        cursor = partyIdBeneficiary.encode(data, cursor);
        cursor = applSeqIndicator.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = priceValidityCheckType.encode(data, cursor);
        cursor = valueCheckTypeValue.encode(data, cursor);
        cursor = orderAttributeLiquidityProvision.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = tradingSessionSubId.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = orderOrigination.encode(data, cursor);
        cursor = partyIdInvestmentDecisionMakerQualifier.encode(data, cursor);
        cursor = executingTraderQualifier.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = partyIdPositionAccount.encode(data, cursor);
        cursor = positionEffect.encode(data, cursor);
        cursor = ownershipIndicator.encode(data, cursor);
        cursor = partyIdLocationId.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = complianceText.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText3.encode(data, cursor);
        cursor = fixClOrdId.encode(data, cursor);
        if (buffer != null && buffer.length >= 266) {
            System.arraycopy(buffer, 259, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
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
        requestHeaderComp.clear();
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
            case "NetworkMsgId" -> Optional.of(networkMsgId);
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "Price" -> Optional.of(price);
            case "OrderQty" -> Optional.of(orderQty);
            case "StopPx" -> Optional.of(stopPx);
            case "PartyIdClientId" -> Optional.of(partyIdClientId);
            case "PartyIdInvestmentDecisionMaker" -> Optional.of(partyIdInvestmentDecisionMaker);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "ExpireDate" -> Optional.of(expireDate);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "SimpleSecurityId" -> Optional.of(simpleSecurityId);
            case "MatchInstCrossId" -> Optional.of(matchInstCrossId);
            case "TargetPartyIdSessionId" -> Optional.of(targetPartyIdSessionId);
            case "PartyIdTakeUpTradingFirm" -> Optional.of(partyIdTakeUpTradingFirm);
            case "PartyIdOrderOriginationFirm" -> Optional.of(partyIdOrderOriginationFirm);
            case "PartyIdBeneficiary" -> Optional.of(partyIdBeneficiary);
            case "ApplSeqIndicator" -> Optional.of(applSeqIndicator);
            case "Side" -> Optional.of(side);
            case "OrdType" -> Optional.of(ordType);
            case "PriceValidityCheckType" -> Optional.of(priceValidityCheckType);
            case "ValueCheckTypeValue" -> Optional.of(valueCheckTypeValue);
            case "OrderAttributeLiquidityProvision" -> Optional.of(orderAttributeLiquidityProvision);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "ExecInst" -> Optional.of(execInst);
            case "TradingSessionSubId" -> Optional.of(tradingSessionSubId);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "PartyIdInvestmentDecisionMakerQualifier" -> Optional.of(partyIdInvestmentDecisionMakerQualifier);
            case "ExecutingTraderQualifier" -> Optional.of(executingTraderQualifier);
            case "Account" -> Optional.of(account);
            case "PartyIdPositionAccount" -> Optional.of(partyIdPositionAccount);
            case "PositionEffect" -> Optional.of(positionEffect);
            case "OwnershipIndicator" -> Optional.of(ownershipIndicator);
            case "PartyIdLocationId" -> Optional.of(partyIdLocationId);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "ComplianceText" -> Optional.of(complianceText);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText3" -> Optional.of(freeText3);
            case "FixClOrdId" -> Optional.of(fixClOrdId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ModifyOrderSingleRequest message)) {
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
        if (!(other instanceof ModifyOrderSingleRequest message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
