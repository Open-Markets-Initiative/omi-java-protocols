package omi.eurex.t7.xti.fbe.v12_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v12_1.fields.ApplSeqIndicatorField;
import omi.eurex.t7.xti.fbe.v12_1.fields.CheckSumCorrectionField;
import omi.eurex.t7.xti.fbe.v12_1.fields.ClOrdIdField;
import omi.eurex.t7.xti.fbe.v12_1.fields.DisplayHighQtyField;
import omi.eurex.t7.xti.fbe.v12_1.fields.DisplayLowQtyField;
import omi.eurex.t7.xti.fbe.v12_1.fields.DisplayQtyField;
import omi.eurex.t7.xti.fbe.v12_1.fields.ExecInstField;
import omi.eurex.t7.xti.fbe.v12_1.fields.ExecutingTraderField;
import omi.eurex.t7.xti.fbe.v12_1.fields.ExecutingTraderQualifierField;
import omi.eurex.t7.xti.fbe.v12_1.fields.ExpireDateField;
import omi.eurex.t7.xti.fbe.v12_1.fields.FixClOrdIdField;
import omi.eurex.t7.xti.fbe.v12_1.fields.FreeText1Field;
import omi.eurex.t7.xti.fbe.v12_1.fields.FreeText2Field;
import omi.eurex.t7.xti.fbe.v12_1.fields.FreeText4Field;
import omi.eurex.t7.xti.fbe.v12_1.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v12_1.fields.MatchInstCrossIdField;
import omi.eurex.t7.xti.fbe.v12_1.fields.NetworkMsgIdField;
import omi.eurex.t7.xti.fbe.v12_1.fields.OrdTypeField;
import omi.eurex.t7.xti.fbe.v12_1.fields.OrderAttributeLiquidityProvisionField;
import omi.eurex.t7.xti.fbe.v12_1.fields.OrderOriginationField;
import omi.eurex.t7.xti.fbe.v12_1.fields.OrderQtyField;
import omi.eurex.t7.xti.fbe.v12_1.fields.PartyExecutingFirmField;
import omi.eurex.t7.xti.fbe.v12_1.fields.PartyExecutingTraderField;
import omi.eurex.t7.xti.fbe.v12_1.fields.PartyIdClientIdField;
import omi.eurex.t7.xti.fbe.v12_1.fields.PartyIdInvestmentDecisionMakerField;
import omi.eurex.t7.xti.fbe.v12_1.fields.PartyIdInvestmentDecisionMakerQualifierField;
import omi.eurex.t7.xti.fbe.v12_1.fields.PegOffsetValueAbsField;
import omi.eurex.t7.xti.fbe.v12_1.fields.PegOffsetValuePctField;
import omi.eurex.t7.xti.fbe.v12_1.fields.PriceField;
import omi.eurex.t7.xti.fbe.v12_1.fields.PriceValidityCheckTypeField;
import omi.eurex.t7.xti.fbe.v12_1.fields.QuoteIdField;
import omi.eurex.t7.xti.fbe.v12_1.fields.SecurityIdField;
import omi.eurex.t7.xti.fbe.v12_1.fields.SideField;
import omi.eurex.t7.xti.fbe.v12_1.fields.StopPxField;
import omi.eurex.t7.xti.fbe.v12_1.fields.TargetPartyIdSessionIdField;
import omi.eurex.t7.xti.fbe.v12_1.fields.TimeInForceField;
import omi.eurex.t7.xti.fbe.v12_1.fields.TradeAtCloseOptInField;
import omi.eurex.t7.xti.fbe.v12_1.fields.TradingCapacityField;
import omi.eurex.t7.xti.fbe.v12_1.fields.TradingSessionSubIdField;
import omi.eurex.t7.xti.fbe.v12_1.fields.ValueCheckTypeQuantityField;
import omi.eurex.t7.xti.fbe.v12_1.fields.ValueCheckTypeValueField;
import omi.eurex.t7.xti.fbe.v12_1.structs.RequestHeaderComp;
import omi.eurex.t7.xti.fbe.v12_1.types.Field;
import omi.eurex.t7.xti.fbe.v12_1.types.Message;
import omi.eurex.t7.xti.fbe.v12_1.types.PrintOptions;

/**
 * Represents the NewOrderRequest message from the Xti protocol.
 */
public final class NewOrderRequest implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 242;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Request";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 2, 191, 3, 204, 2, 237, 1, 240, 2 };

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Cl Ord Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

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
     * Quote Id
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Target Party Id Session Id
     */
    private final TargetPartyIdSessionIdField targetPartyIdSessionId = new TargetPartyIdSessionIdField();

    /**
     * Match Inst Cross Id
     */
    private final MatchInstCrossIdField matchInstCrossId = new MatchInstCrossIdField();

    /**
     * Expire Date
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * Trading Session Sub Id
     */
    private final TradingSessionSubIdField tradingSessionSubId = new TradingSessionSubIdField();

    /**
     * Trade At Close Opt In
     */
    private final TradeAtCloseOptInField tradeAtCloseOptIn = new TradeAtCloseOptInField();

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
     * Party Executing Firm
     */
    private final PartyExecutingFirmField partyExecutingFirm = new PartyExecutingFirmField();

    /**
     * Party Executing Trader
     */
    private final PartyExecutingTraderField partyExecutingTrader = new PartyExecutingTraderField();

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
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(clOrdId), List.<Field>of(stopPx), List.<Field>of(displayQty), List.<Field>of(displayLowQty), List.<Field>of(displayHighQty), List.<Field>of(pegOffsetValueAbs), List.<Field>of(pegOffsetValuePct), List.<Field>of(partyIdClientId), List.<Field>of(executingTrader), List.<Field>of(quoteId), List.<Field>of(targetPartyIdSessionId), List.<Field>of(matchInstCrossId), List.<Field>of(expireDate), List.<Field>of(tradingSessionSubId), List.<Field>of(tradeAtCloseOptIn), List.<Field>of(applSeqIndicator), List.<Field>of(ordType), List.<Field>of(priceValidityCheckType), List.<Field>of(valueCheckTypeValue), List.<Field>of(valueCheckTypeQuantity), List.<Field>of(orderOrigination), List.<Field>of(partyExecutingFirm), List.<Field>of(partyExecutingTrader), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText4), List.<Field>of(fixClOrdId), List.<Field>of(executingTraderQualifier), List.<Field>of(partyIdInvestmentDecisionMakerQualifier), List.<Field>of(partyIdInvestmentDecisionMaker), List.<Field>of(orderAttributeLiquidityProvision), List.<Field>of(tradingCapacity), List.<Field>of(marketSegmentId), List.<Field>of(securityId), List.<Field>of(orderQty), List.<Field>of(price), List.<Field>of(side), List.<Field>of(execInst), List.<Field>of(timeInForce), List.<Field>of(checkSumCorrection)).flatMap(List::stream).toList();

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
     * Cl Ord Id
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
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
     * Quote Id
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
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
     * Trading Session Sub Id
     *
     * @return the TradingSessionSubId field
     */
    public TradingSessionSubIdField tradingSessionSubId() {
        return tradingSessionSubId;
    }

    /**
     * Trade At Close Opt In
     *
     * @return the TradeAtCloseOptIn field
     */
    public TradeAtCloseOptInField tradeAtCloseOptIn() {
        return tradeAtCloseOptIn;
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
        if (!requestHeaderComp.parseFrom(data, cursor, end - 224)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
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
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!targetPartyIdSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyIdSessionIdField.BYTE_LENGTH;
        if (!matchInstCrossId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchInstCrossIdField.BYTE_LENGTH;
        if (!expireDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateField.BYTE_LENGTH;
        if (!tradingSessionSubId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionSubIdField.BYTE_LENGTH;
        if (!tradeAtCloseOptIn.parse(data, cursor)) {
            return false;
        }
        cursor += TradeAtCloseOptInField.BYTE_LENGTH;
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
        if (!partyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingFirmField.BYTE_LENGTH;
        if (!partyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingTraderField.BYTE_LENGTH;
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
        cursor += 3; // padding
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
        cursor += 1; // padding
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
        cursor = clOrdId.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = displayQty.encode(data, cursor);
        cursor = displayLowQty.encode(data, cursor);
        cursor = displayHighQty.encode(data, cursor);
        cursor = pegOffsetValueAbs.encode(data, cursor);
        cursor = pegOffsetValuePct.encode(data, cursor);
        cursor = partyIdClientId.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = quoteId.encode(data, cursor);
        cursor = targetPartyIdSessionId.encode(data, cursor);
        cursor = matchInstCrossId.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = tradingSessionSubId.encode(data, cursor);
        cursor = tradeAtCloseOptIn.encode(data, cursor);
        cursor = applSeqIndicator.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = priceValidityCheckType.encode(data, cursor);
        cursor = valueCheckTypeValue.encode(data, cursor);
        cursor = valueCheckTypeQuantity.encode(data, cursor);
        cursor = orderOrigination.encode(data, cursor);
        cursor = partyExecutingFirm.encode(data, cursor);
        cursor = partyExecutingTrader.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText4.encode(data, cursor);
        cursor = fixClOrdId.encode(data, cursor);
        cursor = executingTraderQualifier.encode(data, cursor);
        cursor = partyIdInvestmentDecisionMakerQualifier.encode(data, cursor);
        if (buffer != null && buffer.length >= 194) {
            System.arraycopy(buffer, 191, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        cursor = partyIdInvestmentDecisionMaker.encode(data, cursor);
        cursor = orderAttributeLiquidityProvision.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        if (buffer != null && buffer.length >= 206) {
            System.arraycopy(buffer, 204, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = marketSegmentId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        if (buffer != null && buffer.length >= 238) {
            System.arraycopy(buffer, 237, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = checkSumCorrection.encode(data, cursor);
        if (buffer != null && buffer.length >= 242) {
            System.arraycopy(buffer, 240, data, cursor, 2); // padding
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "StopPx" -> Optional.of(stopPx);
            case "DisplayQty" -> Optional.of(displayQty);
            case "DisplayLowQty" -> Optional.of(displayLowQty);
            case "DisplayHighQty" -> Optional.of(displayHighQty);
            case "PegOffsetValueAbs" -> Optional.of(pegOffsetValueAbs);
            case "PegOffsetValuePct" -> Optional.of(pegOffsetValuePct);
            case "PartyIdClientId" -> Optional.of(partyIdClientId);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "QuoteId" -> Optional.of(quoteId);
            case "TargetPartyIdSessionId" -> Optional.of(targetPartyIdSessionId);
            case "MatchInstCrossId" -> Optional.of(matchInstCrossId);
            case "ExpireDate" -> Optional.of(expireDate);
            case "TradingSessionSubId" -> Optional.of(tradingSessionSubId);
            case "TradeAtCloseOptIn" -> Optional.of(tradeAtCloseOptIn);
            case "ApplSeqIndicator" -> Optional.of(applSeqIndicator);
            case "OrdType" -> Optional.of(ordType);
            case "PriceValidityCheckType" -> Optional.of(priceValidityCheckType);
            case "ValueCheckTypeValue" -> Optional.of(valueCheckTypeValue);
            case "ValueCheckTypeQuantity" -> Optional.of(valueCheckTypeQuantity);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "PartyExecutingFirm" -> Optional.of(partyExecutingFirm);
            case "PartyExecutingTrader" -> Optional.of(partyExecutingTrader);
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
            case "OrderQty" -> Optional.of(orderQty);
            case "Price" -> Optional.of(price);
            case "Side" -> Optional.of(side);
            case "ExecInst" -> Optional.of(execInst);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "CheckSumCorrection" -> Optional.of(checkSumCorrection);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderRequest message)) {
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
        if (!(other instanceof NewOrderRequest message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
