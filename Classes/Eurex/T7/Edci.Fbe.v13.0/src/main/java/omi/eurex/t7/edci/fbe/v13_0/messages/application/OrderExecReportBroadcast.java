package omi.eurex.t7.edci.fbe.v13_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.edci.fbe.v13_0.fields.ApplSeqIndicatorField;
import omi.eurex.t7.edci.fbe.v13_0.fields.ClOrdIdField;
import omi.eurex.t7.edci.fbe.v13_0.fields.CrossedIndicatorField;
import omi.eurex.t7.edci.fbe.v13_0.fields.CumQtyField;
import omi.eurex.t7.edci.fbe.v13_0.fields.CustOrderHandlingInstField;
import omi.eurex.t7.edci.fbe.v13_0.fields.CxlQtyField;
import omi.eurex.t7.edci.fbe.v13_0.fields.ExecIdField;
import omi.eurex.t7.edci.fbe.v13_0.fields.ExecInstField;
import omi.eurex.t7.edci.fbe.v13_0.fields.ExecTypeField;
import omi.eurex.t7.edci.fbe.v13_0.fields.ExecutingTraderField;
import omi.eurex.t7.edci.fbe.v13_0.fields.ExecutingTraderQualifierField;
import omi.eurex.t7.edci.fbe.v13_0.fields.ExpireDateField;
import omi.eurex.t7.edci.fbe.v13_0.fields.FixClOrdIdField;
import omi.eurex.t7.edci.fbe.v13_0.fields.FixOrigClOrdIdField;
import omi.eurex.t7.edci.fbe.v13_0.fields.FreeText1Field;
import omi.eurex.t7.edci.fbe.v13_0.fields.FreeText2Field;
import omi.eurex.t7.edci.fbe.v13_0.fields.FreeText3Field;
import omi.eurex.t7.edci.fbe.v13_0.fields.LeavesQtyField;
import omi.eurex.t7.edci.fbe.v13_0.fields.MarketSegmentIdField;
import omi.eurex.t7.edci.fbe.v13_0.fields.MatchTypeField;
import omi.eurex.t7.edci.fbe.v13_0.fields.NoFillsField;
import omi.eurex.t7.edci.fbe.v13_0.fields.OrdStatusField;
import omi.eurex.t7.edci.fbe.v13_0.fields.OrdTypeField;
import omi.eurex.t7.edci.fbe.v13_0.fields.OrderIdField;
import omi.eurex.t7.edci.fbe.v13_0.fields.OrderQtyField;
import omi.eurex.t7.edci.fbe.v13_0.fields.OrigClOrdIdField;
import omi.eurex.t7.edci.fbe.v13_0.fields.PartyEndClientIdentificationField;
import omi.eurex.t7.edci.fbe.v13_0.fields.PartyIdClientIdField;
import omi.eurex.t7.edci.fbe.v13_0.fields.PartyIdExecutingTraderField;
import omi.eurex.t7.edci.fbe.v13_0.fields.PartyIdInvestmentDecisionMakerField;
import omi.eurex.t7.edci.fbe.v13_0.fields.PartyIdInvestmentDecisionMakerQualifierField;
import omi.eurex.t7.edci.fbe.v13_0.fields.PartyIdSessionIdField;
import omi.eurex.t7.edci.fbe.v13_0.fields.PriceField;
import omi.eurex.t7.edci.fbe.v13_0.fields.ProductComplexField;
import omi.eurex.t7.edci.fbe.v13_0.fields.SecurityIdField;
import omi.eurex.t7.edci.fbe.v13_0.fields.SideField;
import omi.eurex.t7.edci.fbe.v13_0.fields.StopPxField;
import omi.eurex.t7.edci.fbe.v13_0.fields.TimeInForceField;
import omi.eurex.t7.edci.fbe.v13_0.fields.TradingCapacityField;
import omi.eurex.t7.edci.fbe.v13_0.fields.TradingSessionSubIdField;
import omi.eurex.t7.edci.fbe.v13_0.fields.TriggeredField;
import omi.eurex.t7.edci.fbe.v13_0.groups.FillsGrpCompEntry;
import omi.eurex.t7.edci.fbe.v13_0.groups.FillsGrpCompList;
import omi.eurex.t7.edci.fbe.v13_0.structs.RbcHeaderComp;
import omi.eurex.t7.edci.fbe.v13_0.types.Field;
import omi.eurex.t7.edci.fbe.v13_0.types.Message;
import omi.eurex.t7.edci.fbe.v13_0.types.PrintOptions;

/**
 * Represents the OrderExecReportBroadcast message from the Edci protocol.
 */
public final class OrderExecReportBroadcast implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 266;

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
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

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
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Expire Date
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * Party Id Session Id
     */
    private final PartyIdSessionIdField partyIdSessionId = new PartyIdSessionIdField();

    /**
     * Party Id Executing Trader
     */
    private final PartyIdExecutingTraderField partyIdExecutingTrader = new PartyIdExecutingTraderField();

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
     * Match Type
     */
    private final MatchTypeField matchType = new MatchTypeField();

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
     * Triggered
     */
    private final TriggeredField triggered = new TriggeredField();

    /**
     * Trading Session Sub Id
     */
    private final TradingSessionSubIdField tradingSessionSubId = new TradingSessionSubIdField();

    /**
     * Appl Seq Indicator
     */
    private final ApplSeqIndicatorField applSeqIndicator = new ApplSeqIndicatorField();

    /**
     * Party Id Investment Decision Maker Qualifier
     */
    private final PartyIdInvestmentDecisionMakerQualifierField partyIdInvestmentDecisionMakerQualifier = new PartyIdInvestmentDecisionMakerQualifierField();

    /**
     * Executing Trader Qualifier
     */
    private final ExecutingTraderQualifierField executingTraderQualifier = new ExecutingTraderQualifierField();

    /**
     * No Fills
     */
    private final NoFillsField noFills = new NoFillsField();

    /**
     * Crossed Indicator
     */
    private final CrossedIndicatorField crossedIndicator = new CrossedIndicatorField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

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
     * Fix Orig Cl Ord Id
     */
    private final FixOrigClOrdIdField fixOrigClOrdId = new FixOrigClOrdIdField();

    /**
     * Party End Client Identification
     */
    private final PartyEndClientIdentificationField partyEndClientIdentification = new PartyEndClientIdentificationField();

    /**
     * Fills Grp Comp
     */
    private final FillsGrpCompList fillsGrpComp = new FillsGrpCompList();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(orderId), List.<Field>of(clOrdId), List.<Field>of(origClOrdId), List.<Field>of(securityId), List.<Field>of(execId), List.<Field>of(price), List.<Field>of(stopPx), List.<Field>of(leavesQty), List.<Field>of(cumQty), List.<Field>of(cxlQty), List.<Field>of(orderQty), List.<Field>of(partyIdClientId), List.<Field>of(partyIdInvestmentDecisionMaker), List.<Field>of(executingTrader), List.<Field>of(marketSegmentId), List.<Field>of(expireDate), List.<Field>of(partyIdSessionId), List.<Field>of(partyIdExecutingTrader), List.<Field>of(productComplex), List.<Field>of(ordStatus), List.<Field>of(execType), List.<Field>of(side), List.<Field>of(ordType), List.<Field>of(matchType), List.<Field>of(tradingCapacity), List.<Field>of(timeInForce), List.<Field>of(execInst), List.<Field>of(triggered), List.<Field>of(tradingSessionSubId), List.<Field>of(applSeqIndicator), List.<Field>of(partyIdInvestmentDecisionMakerQualifier), List.<Field>of(executingTraderQualifier), List.<Field>of(noFills), List.<Field>of(crossedIndicator), List.<Field>of(custOrderHandlingInst), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText3), List.<Field>of(fixClOrdId), List.<Field>of(fixOrigClOrdId), List.<Field>of(partyEndClientIdentification)).flatMap(List::stream).toList();

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
     * Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
     * Match Type
     *
     * @return the MatchType field
     */
    public MatchTypeField matchType() {
        return matchType;
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
     * Triggered
     *
     * @return the Triggered field
     */
    public TriggeredField triggered() {
        return triggered;
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
     * No Fills
     *
     * @return the NoFills field
     */
    public NoFillsField noFills() {
        return noFills;
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
     * Cust Order Handling Inst
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
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
     * Fix Orig Cl Ord Id
     *
     * @return the FixOrigClOrdId field
     */
    public FixOrigClOrdIdField fixOrigClOrdId() {
        return fixOrigClOrdId;
    }

    /**
     * Party End Client Identification
     *
     * @return the PartyEndClientIdentification field
     */
    public PartyEndClientIdentificationField partyEndClientIdentification() {
        return partyEndClientIdentification;
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
     * Rbc Header Comp
     *
     * @return the RbcHeaderComp record
     */
    public RbcHeaderComp rbcHeaderComp() {
        return rbcHeaderComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + fillsGrpComp.byteLength();
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
        for (int[] run = RbcHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RbcHeaderComp.BYTE_LENGTH;
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
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
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
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 12;
        cursor += 12;
        cursor += 12;
        cursor += 20;
        cursor += 20;
        cursor += 20;
        runs.add(cursor).add(7);
        cursor += 7;
        cursor += fillsGrpComp.byteLength();
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(rbcHeaderComp.sendingTime().value());
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 248)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
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
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
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
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!expireDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateField.BYTE_LENGTH;
        if (!partyIdSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdSessionIdField.BYTE_LENGTH;
        if (!partyIdExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdExecutingTraderField.BYTE_LENGTH;
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
        if (!matchType.parse(data, cursor)) {
            return false;
        }
        cursor += MatchTypeField.BYTE_LENGTH;
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
        if (!triggered.parse(data, cursor)) {
            return false;
        }
        cursor += TriggeredField.BYTE_LENGTH;
        if (!tradingSessionSubId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionSubIdField.BYTE_LENGTH;
        if (!applSeqIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ApplSeqIndicatorField.BYTE_LENGTH;
        if (!partyIdInvestmentDecisionMakerQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdInvestmentDecisionMakerQualifierField.BYTE_LENGTH;
        if (!executingTraderQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderQualifierField.BYTE_LENGTH;
        if (!noFills.parse(data, cursor)) {
            return false;
        }
        cursor += NoFillsField.BYTE_LENGTH;
        if (!crossedIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CrossedIndicatorField.BYTE_LENGTH;
        if (!custOrderHandlingInst.parse(data, cursor)) {
            return false;
        }
        cursor += CustOrderHandlingInstField.BYTE_LENGTH;
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
        if (!fixOrigClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += FixOrigClOrdIdField.BYTE_LENGTH;
        if (!partyEndClientIdentification.parse(data, cursor)) {
            return false;
        }
        cursor += PartyEndClientIdentificationField.BYTE_LENGTH;
        cursor += 7; // padding
        if (!fillsGrpComp.parse(data, cursor, end, noFills.value())) {
            return false;
        }
        cursor += fillsGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (fillsGrpComp.size() > 255) {
            throw new IllegalStateException("fillsGrpComp holds " + fillsGrpComp.size() + " entries, more than its count field can state");
        }
        noFills.value((short) fillsGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = cxlQty.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = partyIdClientId.encode(data, cursor);
        cursor = partyIdInvestmentDecisionMaker.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = partyIdSessionId.encode(data, cursor);
        cursor = partyIdExecutingTrader.encode(data, cursor);
        cursor = productComplex.encode(data, cursor);
        cursor = ordStatus.encode(data, cursor);
        cursor = execType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = matchType.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = triggered.encode(data, cursor);
        cursor = tradingSessionSubId.encode(data, cursor);
        cursor = applSeqIndicator.encode(data, cursor);
        cursor = partyIdInvestmentDecisionMakerQualifier.encode(data, cursor);
        cursor = executingTraderQualifier.encode(data, cursor);
        cursor = noFills.encode(data, cursor);
        cursor = crossedIndicator.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText3.encode(data, cursor);
        cursor = fixClOrdId.encode(data, cursor);
        cursor = fixOrigClOrdId.encode(data, cursor);
        cursor = partyEndClientIdentification.encode(data, cursor);
        if (buffer != null && buffer.length >= 266) {
            System.arraycopy(buffer, 259, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
        cursor = fillsGrpComp.encode(data, cursor);
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
        rbcHeaderComp.clear();
        fillsGrpComp.clear();
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
            if (field != noFills && !field.isRecognized()) {
                return false;
            }
        }
        return fillsGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noFills && !field.isValid()) {
                return false;
            }
        }
        if (!fillsGrpComp.isValid()) {
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
        if (!rbcHeaderComp.isDecoded()) {
            return rbcHeaderComp.failedAt();
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
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!stopPx.isDecoded()) {
            return Optional.of(stopPx);
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
        if (!partyIdClientId.isDecoded()) {
            return Optional.of(partyIdClientId);
        }
        if (!partyIdInvestmentDecisionMaker.isDecoded()) {
            return Optional.of(partyIdInvestmentDecisionMaker);
        }
        if (!executingTrader.isDecoded()) {
            return Optional.of(executingTrader);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!expireDate.isDecoded()) {
            return Optional.of(expireDate);
        }
        if (!partyIdSessionId.isDecoded()) {
            return Optional.of(partyIdSessionId);
        }
        if (!partyIdExecutingTrader.isDecoded()) {
            return Optional.of(partyIdExecutingTrader);
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
        if (!matchType.isDecoded()) {
            return Optional.of(matchType);
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
        if (!triggered.isDecoded()) {
            return Optional.of(triggered);
        }
        if (!tradingSessionSubId.isDecoded()) {
            return Optional.of(tradingSessionSubId);
        }
        if (!applSeqIndicator.isDecoded()) {
            return Optional.of(applSeqIndicator);
        }
        if (!partyIdInvestmentDecisionMakerQualifier.isDecoded()) {
            return Optional.of(partyIdInvestmentDecisionMakerQualifier);
        }
        if (!executingTraderQualifier.isDecoded()) {
            return Optional.of(executingTraderQualifier);
        }
        if (!noFills.isDecoded()) {
            return Optional.of(noFills);
        }
        if (!crossedIndicator.isDecoded()) {
            return Optional.of(crossedIndicator);
        }
        if (!custOrderHandlingInst.isDecoded()) {
            return Optional.of(custOrderHandlingInst);
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
        if (!fixOrigClOrdId.isDecoded()) {
            return Optional.of(fixOrigClOrdId);
        }
        if (!partyEndClientIdentification.isDecoded()) {
            return Optional.of(partyEndClientIdentification);
        }
        if (!fillsGrpComp.isDecoded()) {
            return Optional.of(fillsGrpComp.failedEntry().flatMap(FillsGrpCompEntry::failedAt).orElse(noFills));
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
            case "Price" -> Optional.of(price);
            case "StopPx" -> Optional.of(stopPx);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "CumQty" -> Optional.of(cumQty);
            case "CxlQty" -> Optional.of(cxlQty);
            case "OrderQty" -> Optional.of(orderQty);
            case "PartyIdClientId" -> Optional.of(partyIdClientId);
            case "PartyIdInvestmentDecisionMaker" -> Optional.of(partyIdInvestmentDecisionMaker);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "ExpireDate" -> Optional.of(expireDate);
            case "PartyIdSessionId" -> Optional.of(partyIdSessionId);
            case "PartyIdExecutingTrader" -> Optional.of(partyIdExecutingTrader);
            case "ProductComplex" -> Optional.of(productComplex);
            case "OrdStatus" -> Optional.of(ordStatus);
            case "ExecType" -> Optional.of(execType);
            case "Side" -> Optional.of(side);
            case "OrdType" -> Optional.of(ordType);
            case "MatchType" -> Optional.of(matchType);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "ExecInst" -> Optional.of(execInst);
            case "Triggered" -> Optional.of(triggered);
            case "TradingSessionSubId" -> Optional.of(tradingSessionSubId);
            case "ApplSeqIndicator" -> Optional.of(applSeqIndicator);
            case "PartyIdInvestmentDecisionMakerQualifier" -> Optional.of(partyIdInvestmentDecisionMakerQualifier);
            case "ExecutingTraderQualifier" -> Optional.of(executingTraderQualifier);
            case "NoFills" -> Optional.of(noFills);
            case "CrossedIndicator" -> Optional.of(crossedIndicator);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText3" -> Optional.of(freeText3);
            case "FixClOrdId" -> Optional.of(fixClOrdId);
            case "FixOrigClOrdId" -> Optional.of(fixOrigClOrdId);
            case "PartyEndClientIdentification" -> Optional.of(partyEndClientIdentification);
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
        changed.addAll(fillsGrpComp.diffFields(message.fillsGrpComp));
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
            fillsGrpComp.toFormattedString(builder, options);
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
        fillsGrpComp.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && fillsGrpComp.equals(message.fillsGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, fillsGrpComp);
    }
}
