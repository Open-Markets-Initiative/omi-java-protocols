package omi.eurex.t7.xti.fbe.v13_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v13_1.fields.ApplSeqIndicatorField;
import omi.eurex.t7.xti.fbe.v13_1.fields.CheckSumCorrectionField;
import omi.eurex.t7.xti.fbe.v13_1.fields.ClOrdIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.DisplayHighQtyField;
import omi.eurex.t7.xti.fbe.v13_1.fields.DisplayLowQtyField;
import omi.eurex.t7.xti.fbe.v13_1.fields.DisplayQtyField;
import omi.eurex.t7.xti.fbe.v13_1.fields.ExecInstField;
import omi.eurex.t7.xti.fbe.v13_1.fields.ExecutingTraderField;
import omi.eurex.t7.xti.fbe.v13_1.fields.ExecutingTraderQualifierField;
import omi.eurex.t7.xti.fbe.v13_1.fields.ExpireDateField;
import omi.eurex.t7.xti.fbe.v13_1.fields.FixClOrdIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.FreeText1Field;
import omi.eurex.t7.xti.fbe.v13_1.fields.FreeText2Field;
import omi.eurex.t7.xti.fbe.v13_1.fields.FreeText4Field;
import omi.eurex.t7.xti.fbe.v13_1.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.MatchInstCrossIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.MidPointTypeField;
import omi.eurex.t7.xti.fbe.v13_1.fields.MinQtyField;
import omi.eurex.t7.xti.fbe.v13_1.fields.NetworkMsgIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.OrdTypeField;
import omi.eurex.t7.xti.fbe.v13_1.fields.OrderAttributeLiquidityProvisionField;
import omi.eurex.t7.xti.fbe.v13_1.fields.OrderIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.OrderOriginationField;
import omi.eurex.t7.xti.fbe.v13_1.fields.OrderQtyField;
import omi.eurex.t7.xti.fbe.v13_1.fields.OrigClOrdIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.OwnershipIndicatorField;
import omi.eurex.t7.xti.fbe.v13_1.fields.PartyExecutingFirmField;
import omi.eurex.t7.xti.fbe.v13_1.fields.PartyExecutingTraderField;
import omi.eurex.t7.xti.fbe.v13_1.fields.PartyIdClientIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.PartyIdInvestmentDecisionMakerField;
import omi.eurex.t7.xti.fbe.v13_1.fields.PartyIdInvestmentDecisionMakerQualifierField;
import omi.eurex.t7.xti.fbe.v13_1.fields.PegOffsetValueAbsField;
import omi.eurex.t7.xti.fbe.v13_1.fields.PegOffsetValuePctField;
import omi.eurex.t7.xti.fbe.v13_1.fields.PriceField;
import omi.eurex.t7.xti.fbe.v13_1.fields.PriceValidityCheckTypeField;
import omi.eurex.t7.xti.fbe.v13_1.fields.SecurityIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.SideField;
import omi.eurex.t7.xti.fbe.v13_1.fields.StopPxField;
import omi.eurex.t7.xti.fbe.v13_1.fields.StopPxIndicatorField;
import omi.eurex.t7.xti.fbe.v13_1.fields.TargetPartyIdSessionIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.TimeInForceField;
import omi.eurex.t7.xti.fbe.v13_1.fields.TradingCapacityField;
import omi.eurex.t7.xti.fbe.v13_1.fields.TradingSessionSubIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.ValueCheckTypeQuantityField;
import omi.eurex.t7.xti.fbe.v13_1.fields.ValueCheckTypeValueField;
import omi.eurex.t7.xti.fbe.v13_1.structs.RequestHeaderComp;
import omi.eurex.t7.xti.fbe.v13_1.types.Field;
import omi.eurex.t7.xti.fbe.v13_1.types.Message;
import omi.eurex.t7.xti.fbe.v13_1.types.PrintOptions;

/**
 * Represents the ModifyOrderRequest message from the Xti protocol.
 */
public final class ModifyOrderRequest implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 258;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Modify Order Request";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 2, 200, 2, 212, 2, 256, 2 };

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Order Id
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Display Qty
     */
    private final DisplayQtyField displayQty = new DisplayQtyField();

    /**
     * Display Low Qty
     */
    private final DisplayLowQtyField displayLowQty = new DisplayLowQtyField();

    /**
     * Display High Qty
     */
    private final DisplayHighQtyField displayHighQty = new DisplayHighQtyField();

    /**
     * Cl Ord Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Orig Cl Ord Id
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Peg Offset Value Abs
     */
    private final PegOffsetValueAbsField pegOffsetValueAbs = new PegOffsetValueAbsField();

    /**
     * Peg Offset Value Pct
     */
    private final PegOffsetValuePctField pegOffsetValuePct = new PegOffsetValuePctField();

    /**
     * Party Id Client Id
     */
    private final PartyIdClientIdField partyIdClientId = new PartyIdClientIdField();

    /**
     * Executing Trader
     */
    private final ExecutingTraderField executingTrader = new ExecutingTraderField();

    /**
     * Match Inst Cross Id
     */
    private final MatchInstCrossIdField matchInstCrossId = new MatchInstCrossIdField();

    /**
     * Expire Date
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * Target Party Id Session Id
     */
    private final TargetPartyIdSessionIdField targetPartyIdSessionId = new TargetPartyIdSessionIdField();

    /**
     * Trading Session Sub Id
     */
    private final TradingSessionSubIdField tradingSessionSubId = new TradingSessionSubIdField();

    /**
     * Stop Px Indicator
     */
    private final StopPxIndicatorField stopPxIndicator = new StopPxIndicatorField();

    /**
     * Ownership Indicator
     */
    private final OwnershipIndicatorField ownershipIndicator = new OwnershipIndicatorField();

    /**
     * Party Executing Firm
     */
    private final PartyExecutingFirmField partyExecutingFirm = new PartyExecutingFirmField();

    /**
     * Party Executing Trader
     */
    private final PartyExecutingTraderField partyExecutingTrader = new PartyExecutingTraderField();

    /**
     * Appl Seq Indicator
     */
    private final ApplSeqIndicatorField applSeqIndicator = new ApplSeqIndicatorField();

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
     * Value Check Type Quantity
     */
    private final ValueCheckTypeQuantityField valueCheckTypeQuantity = new ValueCheckTypeQuantityField();

    /**
     * Order Origination
     */
    private final OrderOriginationField orderOrigination = new OrderOriginationField();

    /**
     * Free Text 1
     */
    private final FreeText1Field freeText1 = new FreeText1Field();

    /**
     * Free Text 2
     */
    private final FreeText2Field freeText2 = new FreeText2Field();

    /**
     * Free Text 4
     */
    private final FreeText4Field freeText4 = new FreeText4Field();

    /**
     * Fix Cl Ord Id
     */
    private final FixClOrdIdField fixClOrdId = new FixClOrdIdField();

    /**
     * Executing Trader Qualifier
     */
    private final ExecutingTraderQualifierField executingTraderQualifier = new ExecutingTraderQualifierField();

    /**
     * Party Id Investment Decision Maker Qualifier
     */
    private final PartyIdInvestmentDecisionMakerQualifierField partyIdInvestmentDecisionMakerQualifier = new PartyIdInvestmentDecisionMakerQualifierField();

    /**
     * Party Id Investment Decision Maker
     */
    private final PartyIdInvestmentDecisionMakerField partyIdInvestmentDecisionMaker = new PartyIdInvestmentDecisionMakerField();

    /**
     * Order Attribute Liquidity Provision
     */
    private final OrderAttributeLiquidityProvisionField orderAttributeLiquidityProvision = new OrderAttributeLiquidityProvisionField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Min Qty
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Order Qty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Mid Point Type
     */
    private final MidPointTypeField midPointType = new MidPointTypeField();

    /**
     * Check Sum Correction
     */
    private final CheckSumCorrectionField checkSumCorrection = new CheckSumCorrectionField();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(orderId), List.<Field>of(displayQty), List.<Field>of(displayLowQty), List.<Field>of(displayHighQty), List.<Field>of(clOrdId), List.<Field>of(origClOrdId), List.<Field>of(stopPx), List.<Field>of(pegOffsetValueAbs), List.<Field>of(pegOffsetValuePct), List.<Field>of(partyIdClientId), List.<Field>of(executingTrader), List.<Field>of(matchInstCrossId), List.<Field>of(expireDate), List.<Field>of(targetPartyIdSessionId), List.<Field>of(tradingSessionSubId), List.<Field>of(stopPxIndicator), List.<Field>of(ownershipIndicator), List.<Field>of(partyExecutingFirm), List.<Field>of(partyExecutingTrader), List.<Field>of(applSeqIndicator), List.<Field>of(ordType), List.<Field>of(priceValidityCheckType), List.<Field>of(valueCheckTypeValue), List.<Field>of(valueCheckTypeQuantity), List.<Field>of(orderOrigination), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText4), List.<Field>of(fixClOrdId), List.<Field>of(executingTraderQualifier), List.<Field>of(partyIdInvestmentDecisionMakerQualifier), List.<Field>of(partyIdInvestmentDecisionMaker), List.<Field>of(orderAttributeLiquidityProvision), List.<Field>of(tradingCapacity), List.<Field>of(marketSegmentId), List.<Field>of(securityId), List.<Field>of(minQty), List.<Field>of(orderQty), List.<Field>of(price), List.<Field>of(side), List.<Field>of(execInst), List.<Field>of(timeInForce), List.<Field>of(midPointType), List.<Field>of(checkSumCorrection)).flatMap(List::stream).toList();

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
     * Display Qty
     *
     * @return the DisplayQty field
     */
    public DisplayQtyField displayQty() {
        return displayQty;
    }

    /**
     * Display Low Qty
     *
     * @return the DisplayLowQty field
     */
    public DisplayLowQtyField displayLowQty() {
        return displayLowQty;
    }

    /**
     * Display High Qty
     *
     * @return the DisplayHighQty field
     */
    public DisplayHighQtyField displayHighQty() {
        return displayHighQty;
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
     * Stop Px
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Peg Offset Value Abs
     *
     * @return the PegOffsetValueAbs field
     */
    public PegOffsetValueAbsField pegOffsetValueAbs() {
        return pegOffsetValueAbs;
    }

    /**
     * Peg Offset Value Pct
     *
     * @return the PegOffsetValuePct field
     */
    public PegOffsetValuePctField pegOffsetValuePct() {
        return pegOffsetValuePct;
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
     * Executing Trader
     *
     * @return the ExecutingTrader field
     */
    public ExecutingTraderField executingTrader() {
        return executingTrader;
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
     * Expire Date
     *
     * @return the ExpireDate field
     */
    public ExpireDateField expireDate() {
        return expireDate;
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
     * Trading Session Sub Id
     *
     * @return the TradingSessionSubId field
     */
    public TradingSessionSubIdField tradingSessionSubId() {
        return tradingSessionSubId;
    }

    /**
     * Stop Px Indicator
     *
     * @return the StopPxIndicator field
     */
    public StopPxIndicatorField stopPxIndicator() {
        return stopPxIndicator;
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
     * Party Executing Firm
     *
     * @return the PartyExecutingFirm field
     */
    public PartyExecutingFirmField partyExecutingFirm() {
        return partyExecutingFirm;
    }

    /**
     * Party Executing Trader
     *
     * @return the PartyExecutingTrader field
     */
    public PartyExecutingTraderField partyExecutingTrader() {
        return partyExecutingTrader;
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
     * Value Check Type Quantity
     *
     * @return the ValueCheckTypeQuantity field
     */
    public ValueCheckTypeQuantityField valueCheckTypeQuantity() {
        return valueCheckTypeQuantity;
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
     * Free Text 4
     *
     * @return the FreeText4 field
     */
    public FreeText4Field freeText4() {
        return freeText4;
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
     * Executing Trader Qualifier
     *
     * @return the ExecutingTraderQualifier field
     */
    public ExecutingTraderQualifierField executingTraderQualifier() {
        return executingTraderQualifier;
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
     * Party Id Investment Decision Maker
     *
     * @return the PartyIdInvestmentDecisionMaker field
     */
    public PartyIdInvestmentDecisionMakerField partyIdInvestmentDecisionMaker() {
        return partyIdInvestmentDecisionMaker;
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
     * Trading Capacity
     *
     * @return the TradingCapacity field
     */
    public TradingCapacityField tradingCapacity() {
        return tradingCapacity;
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
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Min Qty
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
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
     * Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
     * Exec Inst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
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
     * Mid Point Type
     *
     * @return the MidPointType field
     */
    public MidPointTypeField midPointType() {
        return midPointType;
    }

    /**
     * Check Sum Correction
     *
     * @return the CheckSumCorrection field
     */
    public CheckSumCorrectionField checkSumCorrection() {
        return checkSumCorrection;
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
        if (!requestHeaderComp.parseFrom(data, cursor, end - 240)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!displayQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayQtyField.BYTE_LENGTH;
        if (!displayLowQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayLowQtyField.BYTE_LENGTH;
        if (!displayHighQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayHighQtyField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!pegOffsetValueAbs.parse(data, cursor)) {
            return false;
        }
        cursor += PegOffsetValueAbsField.BYTE_LENGTH;
        if (!pegOffsetValuePct.parse(data, cursor)) {
            return false;
        }
        cursor += PegOffsetValuePctField.BYTE_LENGTH;
        if (!partyIdClientId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdClientIdField.BYTE_LENGTH;
        if (!executingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderField.BYTE_LENGTH;
        if (!matchInstCrossId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchInstCrossIdField.BYTE_LENGTH;
        if (!expireDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateField.BYTE_LENGTH;
        if (!targetPartyIdSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyIdSessionIdField.BYTE_LENGTH;
        if (!tradingSessionSubId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionSubIdField.BYTE_LENGTH;
        if (!stopPxIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxIndicatorField.BYTE_LENGTH;
        if (!ownershipIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OwnershipIndicatorField.BYTE_LENGTH;
        if (!partyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingFirmField.BYTE_LENGTH;
        if (!partyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingTraderField.BYTE_LENGTH;
        if (!applSeqIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ApplSeqIndicatorField.BYTE_LENGTH;
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
        if (!valueCheckTypeQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ValueCheckTypeQuantityField.BYTE_LENGTH;
        if (!orderOrigination.parse(data, cursor)) {
            return false;
        }
        cursor += OrderOriginationField.BYTE_LENGTH;
        if (!freeText1.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText1Field.BYTE_LENGTH;
        if (!freeText2.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText2Field.BYTE_LENGTH;
        if (!freeText4.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText4Field.BYTE_LENGTH;
        if (!fixClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += FixClOrdIdField.BYTE_LENGTH;
        if (!executingTraderQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderQualifierField.BYTE_LENGTH;
        if (!partyIdInvestmentDecisionMakerQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdInvestmentDecisionMakerQualifierField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!partyIdInvestmentDecisionMaker.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdInvestmentDecisionMakerField.BYTE_LENGTH;
        if (!orderAttributeLiquidityProvision.parse(data, cursor)) {
            return false;
        }
        cursor += OrderAttributeLiquidityProvisionField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!midPointType.parse(data, cursor)) {
            return false;
        }
        cursor += MidPointTypeField.BYTE_LENGTH;
        if (!checkSumCorrection.parse(data, cursor)) {
            return false;
        }
        cursor += CheckSumCorrectionField.BYTE_LENGTH;

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
        cursor = displayQty.encode(data, cursor);
        cursor = displayLowQty.encode(data, cursor);
        cursor = displayHighQty.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = pegOffsetValueAbs.encode(data, cursor);
        cursor = pegOffsetValuePct.encode(data, cursor);
        cursor = partyIdClientId.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = matchInstCrossId.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = targetPartyIdSessionId.encode(data, cursor);
        cursor = tradingSessionSubId.encode(data, cursor);
        cursor = stopPxIndicator.encode(data, cursor);
        cursor = ownershipIndicator.encode(data, cursor);
        cursor = partyExecutingFirm.encode(data, cursor);
        cursor = partyExecutingTrader.encode(data, cursor);
        cursor = applSeqIndicator.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = priceValidityCheckType.encode(data, cursor);
        cursor = valueCheckTypeValue.encode(data, cursor);
        cursor = valueCheckTypeQuantity.encode(data, cursor);
        cursor = orderOrigination.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText4.encode(data, cursor);
        cursor = fixClOrdId.encode(data, cursor);
        cursor = executingTraderQualifier.encode(data, cursor);
        cursor = partyIdInvestmentDecisionMakerQualifier.encode(data, cursor);
        if (buffer != null && buffer.length >= 202) {
            System.arraycopy(buffer, 200, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = partyIdInvestmentDecisionMaker.encode(data, cursor);
        cursor = orderAttributeLiquidityProvision.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        if (buffer != null && buffer.length >= 214) {
            System.arraycopy(buffer, 212, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = marketSegmentId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = midPointType.encode(data, cursor);
        cursor = checkSumCorrection.encode(data, cursor);
        if (buffer != null && buffer.length >= 258) {
            System.arraycopy(buffer, 256, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
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
            case "DisplayQty" -> Optional.of(displayQty);
            case "DisplayLowQty" -> Optional.of(displayLowQty);
            case "DisplayHighQty" -> Optional.of(displayHighQty);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "StopPx" -> Optional.of(stopPx);
            case "PegOffsetValueAbs" -> Optional.of(pegOffsetValueAbs);
            case "PegOffsetValuePct" -> Optional.of(pegOffsetValuePct);
            case "PartyIdClientId" -> Optional.of(partyIdClientId);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "MatchInstCrossId" -> Optional.of(matchInstCrossId);
            case "ExpireDate" -> Optional.of(expireDate);
            case "TargetPartyIdSessionId" -> Optional.of(targetPartyIdSessionId);
            case "TradingSessionSubId" -> Optional.of(tradingSessionSubId);
            case "StopPxIndicator" -> Optional.of(stopPxIndicator);
            case "OwnershipIndicator" -> Optional.of(ownershipIndicator);
            case "PartyExecutingFirm" -> Optional.of(partyExecutingFirm);
            case "PartyExecutingTrader" -> Optional.of(partyExecutingTrader);
            case "ApplSeqIndicator" -> Optional.of(applSeqIndicator);
            case "OrdType" -> Optional.of(ordType);
            case "PriceValidityCheckType" -> Optional.of(priceValidityCheckType);
            case "ValueCheckTypeValue" -> Optional.of(valueCheckTypeValue);
            case "ValueCheckTypeQuantity" -> Optional.of(valueCheckTypeQuantity);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText4" -> Optional.of(freeText4);
            case "FixClOrdId" -> Optional.of(fixClOrdId);
            case "ExecutingTraderQualifier" -> Optional.of(executingTraderQualifier);
            case "PartyIdInvestmentDecisionMakerQualifier" -> Optional.of(partyIdInvestmentDecisionMakerQualifier);
            case "PartyIdInvestmentDecisionMaker" -> Optional.of(partyIdInvestmentDecisionMaker);
            case "OrderAttributeLiquidityProvision" -> Optional.of(orderAttributeLiquidityProvision);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "SecurityId" -> Optional.of(securityId);
            case "MinQty" -> Optional.of(minQty);
            case "OrderQty" -> Optional.of(orderQty);
            case "Price" -> Optional.of(price);
            case "Side" -> Optional.of(side);
            case "ExecInst" -> Optional.of(execInst);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MidPointType" -> Optional.of(midPointType);
            case "CheckSumCorrection" -> Optional.of(checkSumCorrection);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ModifyOrderRequest message)) {
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
        if (!(other instanceof ModifyOrderRequest message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
