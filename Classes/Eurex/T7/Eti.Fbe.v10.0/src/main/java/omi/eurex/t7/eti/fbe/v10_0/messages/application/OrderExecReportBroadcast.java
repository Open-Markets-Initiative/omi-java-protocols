package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.AccountField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ApplSeqIndicatorField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ClOrdIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ComplianceTextField;
import omi.eurex.t7.eti.fbe.v10_0.fields.CrossedIndicatorField;
import omi.eurex.t7.eti.fbe.v10_0.fields.CumQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.CustOrderHandlingInstField;
import omi.eurex.t7.eti.fbe.v10_0.fields.CxlQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecInstField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecRestatementReasonField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExpireDateField;
import omi.eurex.t7.eti.fbe.v10_0.fields.FixClOrdIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.FreeText1Field;
import omi.eurex.t7.eti.fbe.v10_0.fields.FreeText2Field;
import omi.eurex.t7.eti.fbe.v10_0.fields.FreeText3Field;
import omi.eurex.t7.eti.fbe.v10_0.fields.LeavesQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MatchInstCrossIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoFillsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoLegExecsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoLegsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoOrderEventsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrdStatusField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrdTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrderIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrderQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrigClOrdIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdBeneficiaryField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdEnteringFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdEnteringTraderField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdExecutingTraderField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdExecutingUnitField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdLocationIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdOrderOriginationFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdPositionAccountField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdSessionIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyIdTakeUpTradingFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PositionEffectField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PriceField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ProductComplexField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SideField;
import omi.eurex.t7.eti.fbe.v10_0.fields.StopPxField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TimeInForceField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradingCapacityField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradingSessionSubIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TrdRegTsEntryTimeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TrdRegTsTimePriorityField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TriggeredField;
import omi.eurex.t7.eti.fbe.v10_0.groups.FillsGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.FillsGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.groups.InstrmntLegExecGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.InstrmntLegExecGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.groups.LegOrdGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.LegOrdGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.groups.OrderEventGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.OrderEventGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.RbcHeaderMeComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the OrderExecReportBroadcast message from the Eti protocol.
 */
public final class OrderExecReportBroadcast implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 346;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Exec Report Broadcast";

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
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Exec Id
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Trd Reg Ts Entry Time
     */
    private final TrdRegTsEntryTimeField trdRegTsEntryTime = new TrdRegTsEntryTimeField();

    /**
     * Trd Reg Ts Time Priority
     */
    private final TrdRegTsTimePriorityField trdRegTsTimePriority = new TrdRegTsTimePriorityField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Cum Qty
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * Cxl Qty
     */
    private final CxlQtyField cxlQty = new CxlQtyField();

    /**
     * Order Qty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Expire Date
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * Match Inst Cross Id
     */
    private final MatchInstCrossIdField matchInstCrossId = new MatchInstCrossIdField();

    /**
     * Party Id Executing Unit
     */
    private final PartyIdExecutingUnitField partyIdExecutingUnit = new PartyIdExecutingUnitField();

    /**
     * Party Id Session Id
     */
    private final PartyIdSessionIdField partyIdSessionId = new PartyIdSessionIdField();

    /**
     * Party Id Executing Trader
     */
    private final PartyIdExecutingTraderField partyIdExecutingTrader = new PartyIdExecutingTraderField();

    /**
     * Party Id Entering Trader
     */
    private final PartyIdEnteringTraderField partyIdEnteringTrader = new PartyIdEnteringTraderField();

    /**
     * No Leg Execs
     */
    private final NoLegExecsField noLegExecs = new NoLegExecsField();

    /**
     * Exec Restatement Reason
     */
    private final ExecRestatementReasonField execRestatementReason = new ExecRestatementReasonField();

    /**
     * Party Id Entering Firm
     */
    private final PartyIdEnteringFirmField partyIdEnteringFirm = new PartyIdEnteringFirmField();

    /**
     * Product Complex
     */
    private final ProductComplexField productComplex = new ProductComplexField();

    /**
     * Ord Status
     */
    private final OrdStatusField ordStatus = new OrdStatusField();

    /**
     * Exec Type
     */
    private final ExecTypeField execType = new ExecTypeField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

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
     * Appl Seq Indicator
     */
    private final ApplSeqIndicatorField applSeqIndicator = new ApplSeqIndicatorField();

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
     * No Fills
     */
    private final NoFillsField noFills = new NoFillsField();

    /**
     * No Legs
     */
    private final NoLegsField noLegs = new NoLegsField();

    /**
     * No Order Events
     */
    private final NoOrderEventsField noOrderEvents = new NoOrderEventsField();

    /**
     * Triggered
     */
    private final TriggeredField triggered = new TriggeredField();

    /**
     * Crossed Indicator
     */
    private final CrossedIndicatorField crossedIndicator = new CrossedIndicatorField();

    /**
     * Leg Ord Grp Comp
     */
    private final LegOrdGrpCompList legOrdGrpComp = new LegOrdGrpCompList();

    /**
     * Fills Grp Comp
     */
    private final FillsGrpCompList fillsGrpComp = new FillsGrpCompList();

    /**
     * Instrmnt Leg Exec Grp Comp
     */
    private final InstrmntLegExecGrpCompList instrmntLegExecGrpComp = new InstrmntLegExecGrpCompList();

    /**
     * Order Event Grp Comp
     */
    private final OrderEventGrpCompList orderEventGrpComp = new OrderEventGrpCompList();

    /**
     * Rbc Header Me Comp
     */
    private final RbcHeaderMeComp rbcHeaderMeComp = new RbcHeaderMeComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderMeComp.fields(), List.<Field>of(orderId), List.<Field>of(clOrdId), List.<Field>of(origClOrdId), List.<Field>of(securityId), List.<Field>of(execId), List.<Field>of(trdRegTsEntryTime), List.<Field>of(trdRegTsTimePriority), List.<Field>of(price), List.<Field>of(leavesQty), List.<Field>of(cumQty), List.<Field>of(cxlQty), List.<Field>of(orderQty), List.<Field>of(stopPx), List.<Field>of(marketSegmentId), List.<Field>of(expireDate), List.<Field>of(matchInstCrossId), List.<Field>of(partyIdExecutingUnit), List.<Field>of(partyIdSessionId), List.<Field>of(partyIdExecutingTrader), List.<Field>of(partyIdEnteringTrader), List.<Field>of(noLegExecs), List.<Field>of(execRestatementReason), List.<Field>of(partyIdEnteringFirm), List.<Field>of(productComplex), List.<Field>of(ordStatus), List.<Field>of(execType), List.<Field>of(side), List.<Field>of(ordType), List.<Field>of(tradingCapacity), List.<Field>of(timeInForce), List.<Field>of(execInst), List.<Field>of(tradingSessionSubId), List.<Field>of(applSeqIndicator), List.<Field>of(account), List.<Field>of(partyIdPositionAccount), List.<Field>of(positionEffect), List.<Field>of(partyIdTakeUpTradingFirm), List.<Field>of(partyIdOrderOriginationFirm), List.<Field>of(partyIdBeneficiary), List.<Field>of(partyIdLocationId), List.<Field>of(custOrderHandlingInst), List.<Field>of(complianceText), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText3), List.<Field>of(fixClOrdId), List.<Field>of(noFills), List.<Field>of(noLegs), List.<Field>of(noOrderEvents), List.<Field>of(triggered), List.<Field>of(crossedIndicator)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

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
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Exec Id
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * Trd Reg Ts Entry Time
     *
     * @return the TrdRegTsEntryTime field
     */
    public TrdRegTsEntryTimeField trdRegTsEntryTime() {
        return trdRegTsEntryTime;
    }

    /**
     * Trd Reg Ts Time Priority
     *
     * @return the TrdRegTsTimePriority field
     */
    public TrdRegTsTimePriorityField trdRegTsTimePriority() {
        return trdRegTsTimePriority;
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
     * Leaves Qty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Cum Qty
     *
     * @return the CumQty field
     */
    public CumQtyField cumQty() {
        return cumQty;
    }

    /**
     * Cxl Qty
     *
     * @return the CxlQty field
     */
    public CxlQtyField cxlQty() {
        return cxlQty;
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
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
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
     * Match Inst Cross Id
     *
     * @return the MatchInstCrossId field
     */
    public MatchInstCrossIdField matchInstCrossId() {
        return matchInstCrossId;
    }

    /**
     * Party Id Executing Unit
     *
     * @return the PartyIdExecutingUnit field
     */
    public PartyIdExecutingUnitField partyIdExecutingUnit() {
        return partyIdExecutingUnit;
    }

    /**
     * Party Id Session Id
     *
     * @return the PartyIdSessionId field
     */
    public PartyIdSessionIdField partyIdSessionId() {
        return partyIdSessionId;
    }

    /**
     * Party Id Executing Trader
     *
     * @return the PartyIdExecutingTrader field
     */
    public PartyIdExecutingTraderField partyIdExecutingTrader() {
        return partyIdExecutingTrader;
    }

    /**
     * Party Id Entering Trader
     *
     * @return the PartyIdEnteringTrader field
     */
    public PartyIdEnteringTraderField partyIdEnteringTrader() {
        return partyIdEnteringTrader;
    }

    /**
     * No Leg Execs
     *
     * @return the NoLegExecs field
     */
    public NoLegExecsField noLegExecs() {
        return noLegExecs;
    }

    /**
     * Exec Restatement Reason
     *
     * @return the ExecRestatementReason field
     */
    public ExecRestatementReasonField execRestatementReason() {
        return execRestatementReason;
    }

    /**
     * Party Id Entering Firm
     *
     * @return the PartyIdEnteringFirm field
     */
    public PartyIdEnteringFirmField partyIdEnteringFirm() {
        return partyIdEnteringFirm;
    }

    /**
     * Product Complex
     *
     * @return the ProductComplex field
     */
    public ProductComplexField productComplex() {
        return productComplex;
    }

    /**
     * Ord Status
     *
     * @return the OrdStatus field
     */
    public OrdStatusField ordStatus() {
        return ordStatus;
    }

    /**
     * Exec Type
     *
     * @return the ExecType field
     */
    public ExecTypeField execType() {
        return execType;
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
     * Trading Capacity
     *
     * @return the TradingCapacity field
     */
    public TradingCapacityField tradingCapacity() {
        return tradingCapacity;
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
     * Appl Seq Indicator
     *
     * @return the ApplSeqIndicator field
     */
    public ApplSeqIndicatorField applSeqIndicator() {
        return applSeqIndicator;
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
     * No Fills
     *
     * @return the NoFills field
     */
    public NoFillsField noFills() {
        return noFills;
    }

    /**
     * No Legs
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
    }

    /**
     * No Order Events
     *
     * @return the NoOrderEvents field
     */
    public NoOrderEventsField noOrderEvents() {
        return noOrderEvents;
    }

    /**
     * Triggered
     *
     * @return the Triggered field
     */
    public TriggeredField triggered() {
        return triggered;
    }

    /**
     * Crossed Indicator
     *
     * @return the CrossedIndicator field
     */
    public CrossedIndicatorField crossedIndicator() {
        return crossedIndicator;
    }

    /**
     * Leg Ord Grp Comp
     *
     * <p>Encode writes this list's size to the NoLegs field.</p>
     *
     * @return the LegOrdGrpComp entries
     */
    public LegOrdGrpCompList legOrdGrpComp() {
        return legOrdGrpComp;
    }

    /**
     * Fills Grp Comp
     *
     * <p>Encode writes this list's size to the NoFills field.</p>
     *
     * @return the FillsGrpComp entries
     */
    public FillsGrpCompList fillsGrpComp() {
        return fillsGrpComp;
    }

    /**
     * Instrmnt Leg Exec Grp Comp
     *
     * <p>Encode writes this list's size to the NoLegExecs field.</p>
     *
     * @return the InstrmntLegExecGrpComp entries
     */
    public InstrmntLegExecGrpCompList instrmntLegExecGrpComp() {
        return instrmntLegExecGrpComp;
    }

    /**
     * Order Event Grp Comp
     *
     * <p>Encode writes this list's size to the NoOrderEvents field.</p>
     *
     * @return the OrderEventGrpComp entries
     */
    public OrderEventGrpCompList orderEventGrpComp() {
        return orderEventGrpComp;
    }

    /**
     * Rbc Header Me Comp
     *
     * @return the RbcHeaderMeComp record
     */
    public RbcHeaderMeComp rbcHeaderMeComp() {
        return rbcHeaderMeComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + legOrdGrpComp.byteLength() + fillsGrpComp.byteLength() + instrmntLegExecGrpComp.byteLength() + orderEventGrpComp.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = RbcHeaderMeComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RbcHeaderMeComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 2;
        cursor += 32;
        cursor += 1;
        cursor += 5;
        cursor += 7;
        cursor += 9;
        cursor += 2;
        cursor += 1;
        cursor += 20;
        cursor += 12;
        cursor += 12;
        cursor += 12;
        cursor += 20;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor = legOrdGrpComp.padding(runs, cursor);
        cursor = fillsGrpComp.padding(runs, cursor);
        cursor = instrmntLegExecGrpComp.padding(runs, cursor);
        cursor = orderEventGrpComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(rbcHeaderMeComp.trdRegTsTimeOut().value());
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
        cursor += 2; // padding
        if (!rbcHeaderMeComp.parseFrom(data, cursor, end - 288)) {
            return false;
        }
        cursor += rbcHeaderMeComp.byteLength();
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!trdRegTsEntryTime.parse(data, cursor)) {
            return false;
        }
        cursor += TrdRegTsEntryTimeField.BYTE_LENGTH;
        if (!trdRegTsTimePriority.parse(data, cursor)) {
            return false;
        }
        cursor += TrdRegTsTimePriorityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!cumQty.parse(data, cursor)) {
            return false;
        }
        cursor += CumQtyField.BYTE_LENGTH;
        if (!cxlQty.parse(data, cursor)) {
            return false;
        }
        cursor += CxlQtyField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!expireDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateField.BYTE_LENGTH;
        if (!matchInstCrossId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchInstCrossIdField.BYTE_LENGTH;
        if (!partyIdExecutingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdExecutingUnitField.BYTE_LENGTH;
        if (!partyIdSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdSessionIdField.BYTE_LENGTH;
        if (!partyIdExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdExecutingTraderField.BYTE_LENGTH;
        if (!partyIdEnteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdEnteringTraderField.BYTE_LENGTH;
        if (!noLegExecs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegExecsField.BYTE_LENGTH;
        if (!execRestatementReason.parse(data, cursor)) {
            return false;
        }
        cursor += ExecRestatementReasonField.BYTE_LENGTH;
        if (!partyIdEnteringFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdEnteringFirmField.BYTE_LENGTH;
        if (!productComplex.parse(data, cursor)) {
            return false;
        }
        cursor += ProductComplexField.BYTE_LENGTH;
        if (!ordStatus.parse(data, cursor)) {
            return false;
        }
        cursor += OrdStatusField.BYTE_LENGTH;
        if (!execType.parse(data, cursor)) {
            return false;
        }
        cursor += ExecTypeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
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
        if (!applSeqIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ApplSeqIndicatorField.BYTE_LENGTH;
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
        if (!noFills.parse(data, cursor)) {
            return false;
        }
        cursor += NoFillsField.BYTE_LENGTH;
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        if (!noOrderEvents.parse(data, cursor)) {
            return false;
        }
        cursor += NoOrderEventsField.BYTE_LENGTH;
        if (!triggered.parse(data, cursor)) {
            return false;
        }
        cursor += TriggeredField.BYTE_LENGTH;
        if (!crossedIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CrossedIndicatorField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!legOrdGrpComp.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += legOrdGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!fillsGrpComp.parse(data, cursor, end, noFills.value())) {
            return false;
        }
        cursor += fillsGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!instrmntLegExecGrpComp.parse(data, cursor, end, noLegExecs.value())) {
            return false;
        }
        cursor += instrmntLegExecGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!orderEventGrpComp.parse(data, cursor, end, noOrderEvents.value())) {
            return false;
        }
        cursor += orderEventGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (legOrdGrpComp.size() > 255) {
            throw new IllegalStateException("legOrdGrpComp holds " + legOrdGrpComp.size() + " entries, more than its count field can state");
        }
        if (fillsGrpComp.size() > 255) {
            throw new IllegalStateException("fillsGrpComp holds " + fillsGrpComp.size() + " entries, more than its count field can state");
        }
        if (instrmntLegExecGrpComp.size() > 65535) {
            throw new IllegalStateException("instrmntLegExecGrpComp holds " + instrmntLegExecGrpComp.size() + " entries, more than its count field can state");
        }
        if (orderEventGrpComp.size() > 255) {
            throw new IllegalStateException("orderEventGrpComp holds " + orderEventGrpComp.size() + " entries, more than its count field can state");
        }
        noLegs.value((short) legOrdGrpComp.size());
        noFills.value((short) fillsGrpComp.size());
        noLegExecs.value(instrmntLegExecGrpComp.size());
        noOrderEvents.value((short) orderEventGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderMeComp.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = trdRegTsEntryTime.encode(data, cursor);
        cursor = trdRegTsTimePriority.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = cxlQty.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = matchInstCrossId.encode(data, cursor);
        cursor = partyIdExecutingUnit.encode(data, cursor);
        cursor = partyIdSessionId.encode(data, cursor);
        cursor = partyIdExecutingTrader.encode(data, cursor);
        cursor = partyIdEnteringTrader.encode(data, cursor);
        cursor = noLegExecs.encode(data, cursor);
        cursor = execRestatementReason.encode(data, cursor);
        cursor = partyIdEnteringFirm.encode(data, cursor);
        cursor = productComplex.encode(data, cursor);
        cursor = ordStatus.encode(data, cursor);
        cursor = execType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = tradingSessionSubId.encode(data, cursor);
        cursor = applSeqIndicator.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = partyIdPositionAccount.encode(data, cursor);
        cursor = positionEffect.encode(data, cursor);
        cursor = partyIdTakeUpTradingFirm.encode(data, cursor);
        cursor = partyIdOrderOriginationFirm.encode(data, cursor);
        cursor = partyIdBeneficiary.encode(data, cursor);
        cursor = partyIdLocationId.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = complianceText.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText3.encode(data, cursor);
        cursor = fixClOrdId.encode(data, cursor);
        cursor = noFills.encode(data, cursor);
        cursor = noLegs.encode(data, cursor);
        cursor = noOrderEvents.encode(data, cursor);
        cursor = triggered.encode(data, cursor);
        cursor = crossedIndicator.encode(data, cursor);
        if (buffer != null && buffer.length >= 345 + 1) {
            System.arraycopy(buffer, 345, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = legOrdGrpComp.encode(data, cursor);
        cursor = fillsGrpComp.encode(data, cursor);
        cursor = instrmntLegExecGrpComp.encode(data, cursor);
        cursor = orderEventGrpComp.encode(data, cursor);
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
        rbcHeaderMeComp.clear();
        legOrdGrpComp.clear();
        fillsGrpComp.clear();
        instrmntLegExecGrpComp.clear();
        orderEventGrpComp.clear();
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
            if (field != noLegs && field != noFills && field != noLegExecs && field != noOrderEvents && !field.isRecognized()) {
                return false;
            }
        }
        if (!legOrdGrpComp.isRecognized()) {
            return false;
        }
        if (!fillsGrpComp.isRecognized()) {
            return false;
        }
        if (!instrmntLegExecGrpComp.isRecognized()) {
            return false;
        }
        if (!orderEventGrpComp.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noLegs && field != noFills && field != noLegExecs && field != noOrderEvents && !field.isValid()) {
                return false;
            }
        }
        if (!legOrdGrpComp.isValid()) {
            return false;
        }
        if (!fillsGrpComp.isValid()) {
            return false;
        }
        if (!instrmntLegExecGrpComp.isValid()) {
            return false;
        }
        if (!orderEventGrpComp.isValid()) {
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
        if (!rbcHeaderMeComp.isDecoded()) {
            return rbcHeaderMeComp.failedAt();
        }
        if (!orderId.isDecoded()) {
            return Optional.of(orderId);
        }
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!origClOrdId.isDecoded()) {
            return Optional.of(origClOrdId);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!execId.isDecoded()) {
            return Optional.of(execId);
        }
        if (!trdRegTsEntryTime.isDecoded()) {
            return Optional.of(trdRegTsEntryTime);
        }
        if (!trdRegTsTimePriority.isDecoded()) {
            return Optional.of(trdRegTsTimePriority);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!leavesQty.isDecoded()) {
            return Optional.of(leavesQty);
        }
        if (!cumQty.isDecoded()) {
            return Optional.of(cumQty);
        }
        if (!cxlQty.isDecoded()) {
            return Optional.of(cxlQty);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!stopPx.isDecoded()) {
            return Optional.of(stopPx);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!expireDate.isDecoded()) {
            return Optional.of(expireDate);
        }
        if (!matchInstCrossId.isDecoded()) {
            return Optional.of(matchInstCrossId);
        }
        if (!partyIdExecutingUnit.isDecoded()) {
            return Optional.of(partyIdExecutingUnit);
        }
        if (!partyIdSessionId.isDecoded()) {
            return Optional.of(partyIdSessionId);
        }
        if (!partyIdExecutingTrader.isDecoded()) {
            return Optional.of(partyIdExecutingTrader);
        }
        if (!partyIdEnteringTrader.isDecoded()) {
            return Optional.of(partyIdEnteringTrader);
        }
        if (!noLegExecs.isDecoded()) {
            return Optional.of(noLegExecs);
        }
        if (!execRestatementReason.isDecoded()) {
            return Optional.of(execRestatementReason);
        }
        if (!partyIdEnteringFirm.isDecoded()) {
            return Optional.of(partyIdEnteringFirm);
        }
        if (!productComplex.isDecoded()) {
            return Optional.of(productComplex);
        }
        if (!ordStatus.isDecoded()) {
            return Optional.of(ordStatus);
        }
        if (!execType.isDecoded()) {
            return Optional.of(execType);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!ordType.isDecoded()) {
            return Optional.of(ordType);
        }
        if (!tradingCapacity.isDecoded()) {
            return Optional.of(tradingCapacity);
        }
        if (!timeInForce.isDecoded()) {
            return Optional.of(timeInForce);
        }
        if (!execInst.isDecoded()) {
            return Optional.of(execInst);
        }
        if (!tradingSessionSubId.isDecoded()) {
            return Optional.of(tradingSessionSubId);
        }
        if (!applSeqIndicator.isDecoded()) {
            return Optional.of(applSeqIndicator);
        }
        if (!account.isDecoded()) {
            return Optional.of(account);
        }
        if (!partyIdPositionAccount.isDecoded()) {
            return Optional.of(partyIdPositionAccount);
        }
        if (!positionEffect.isDecoded()) {
            return Optional.of(positionEffect);
        }
        if (!partyIdTakeUpTradingFirm.isDecoded()) {
            return Optional.of(partyIdTakeUpTradingFirm);
        }
        if (!partyIdOrderOriginationFirm.isDecoded()) {
            return Optional.of(partyIdOrderOriginationFirm);
        }
        if (!partyIdBeneficiary.isDecoded()) {
            return Optional.of(partyIdBeneficiary);
        }
        if (!partyIdLocationId.isDecoded()) {
            return Optional.of(partyIdLocationId);
        }
        if (!custOrderHandlingInst.isDecoded()) {
            return Optional.of(custOrderHandlingInst);
        }
        if (!complianceText.isDecoded()) {
            return Optional.of(complianceText);
        }
        if (!freeText1.isDecoded()) {
            return Optional.of(freeText1);
        }
        if (!freeText2.isDecoded()) {
            return Optional.of(freeText2);
        }
        if (!freeText3.isDecoded()) {
            return Optional.of(freeText3);
        }
        if (!fixClOrdId.isDecoded()) {
            return Optional.of(fixClOrdId);
        }
        if (!noFills.isDecoded()) {
            return Optional.of(noFills);
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!noOrderEvents.isDecoded()) {
            return Optional.of(noOrderEvents);
        }
        if (!triggered.isDecoded()) {
            return Optional.of(triggered);
        }
        if (!crossedIndicator.isDecoded()) {
            return Optional.of(crossedIndicator);
        }
        if (!legOrdGrpComp.isDecoded()) {
            return Optional.of(legOrdGrpComp.failedEntry().flatMap(LegOrdGrpCompEntry::failedAt).orElse(noLegs));
        }
        if (!fillsGrpComp.isDecoded()) {
            return Optional.of(fillsGrpComp.failedEntry().flatMap(FillsGrpCompEntry::failedAt).orElse(noFills));
        }
        if (!instrmntLegExecGrpComp.isDecoded()) {
            return Optional.of(instrmntLegExecGrpComp.failedEntry().flatMap(InstrmntLegExecGrpCompEntry::failedAt).orElse(noLegExecs));
        }
        if (!orderEventGrpComp.isDecoded()) {
            return Optional.of(orderEventGrpComp.failedEntry().flatMap(OrderEventGrpCompEntry::failedAt).orElse(noOrderEvents));
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
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "SecurityId" -> Optional.of(securityId);
            case "ExecId" -> Optional.of(execId);
            case "TrdRegTsEntryTime" -> Optional.of(trdRegTsEntryTime);
            case "TrdRegTsTimePriority" -> Optional.of(trdRegTsTimePriority);
            case "Price" -> Optional.of(price);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "CumQty" -> Optional.of(cumQty);
            case "CxlQty" -> Optional.of(cxlQty);
            case "OrderQty" -> Optional.of(orderQty);
            case "StopPx" -> Optional.of(stopPx);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "ExpireDate" -> Optional.of(expireDate);
            case "MatchInstCrossId" -> Optional.of(matchInstCrossId);
            case "PartyIdExecutingUnit" -> Optional.of(partyIdExecutingUnit);
            case "PartyIdSessionId" -> Optional.of(partyIdSessionId);
            case "PartyIdExecutingTrader" -> Optional.of(partyIdExecutingTrader);
            case "PartyIdEnteringTrader" -> Optional.of(partyIdEnteringTrader);
            case "NoLegExecs" -> Optional.of(noLegExecs);
            case "ExecRestatementReason" -> Optional.of(execRestatementReason);
            case "PartyIdEnteringFirm" -> Optional.of(partyIdEnteringFirm);
            case "ProductComplex" -> Optional.of(productComplex);
            case "OrdStatus" -> Optional.of(ordStatus);
            case "ExecType" -> Optional.of(execType);
            case "Side" -> Optional.of(side);
            case "OrdType" -> Optional.of(ordType);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "ExecInst" -> Optional.of(execInst);
            case "TradingSessionSubId" -> Optional.of(tradingSessionSubId);
            case "ApplSeqIndicator" -> Optional.of(applSeqIndicator);
            case "Account" -> Optional.of(account);
            case "PartyIdPositionAccount" -> Optional.of(partyIdPositionAccount);
            case "PositionEffect" -> Optional.of(positionEffect);
            case "PartyIdTakeUpTradingFirm" -> Optional.of(partyIdTakeUpTradingFirm);
            case "PartyIdOrderOriginationFirm" -> Optional.of(partyIdOrderOriginationFirm);
            case "PartyIdBeneficiary" -> Optional.of(partyIdBeneficiary);
            case "PartyIdLocationId" -> Optional.of(partyIdLocationId);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "ComplianceText" -> Optional.of(complianceText);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText3" -> Optional.of(freeText3);
            case "FixClOrdId" -> Optional.of(fixClOrdId);
            case "NoFills" -> Optional.of(noFills);
            case "NoLegs" -> Optional.of(noLegs);
            case "NoOrderEvents" -> Optional.of(noOrderEvents);
            case "Triggered" -> Optional.of(triggered);
            case "CrossedIndicator" -> Optional.of(crossedIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderExecReportBroadcast message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(legOrdGrpComp.diffFields(message.legOrdGrpComp));
        changed.addAll(fillsGrpComp.diffFields(message.fillsGrpComp));
        changed.addAll(instrmntLegExecGrpComp.diffFields(message.instrmntLegExecGrpComp));
        changed.addAll(orderEventGrpComp.diffFields(message.orderEventGrpComp));
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
            legOrdGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            fillsGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            instrmntLegExecGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            orderEventGrpComp.toFormattedString(builder, options);
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
        legOrdGrpComp.toFormattedString(builder, nested);
        fillsGrpComp.toFormattedString(builder, nested);
        instrmntLegExecGrpComp.toFormattedString(builder, nested);
        orderEventGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof OrderExecReportBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields) && legOrdGrpComp.equals(message.legOrdGrpComp) && fillsGrpComp.equals(message.fillsGrpComp) && instrmntLegExecGrpComp.equals(message.instrmntLegExecGrpComp) && orderEventGrpComp.equals(message.orderEventGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, legOrdGrpComp, fillsGrpComp, instrmntLegExecGrpComp, orderEventGrpComp);
    }
}
