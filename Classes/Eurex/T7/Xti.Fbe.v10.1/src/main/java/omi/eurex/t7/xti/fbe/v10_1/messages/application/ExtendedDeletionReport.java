package omi.eurex.t7.xti.fbe.v10_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v10_1.fields.ApplSeqIndicatorField;
import omi.eurex.t7.xti.fbe.v10_1.fields.ClOrdIdField;
import omi.eurex.t7.xti.fbe.v10_1.fields.CumQtyField;
import omi.eurex.t7.xti.fbe.v10_1.fields.CxlQtyField;
import omi.eurex.t7.xti.fbe.v10_1.fields.DisplayHighQtyField;
import omi.eurex.t7.xti.fbe.v10_1.fields.DisplayLowQtyField;
import omi.eurex.t7.xti.fbe.v10_1.fields.DisplayQtyField;
import omi.eurex.t7.xti.fbe.v10_1.fields.ExecIdField;
import omi.eurex.t7.xti.fbe.v10_1.fields.ExecInstField;
import omi.eurex.t7.xti.fbe.v10_1.fields.ExecRestatementReasonField;
import omi.eurex.t7.xti.fbe.v10_1.fields.ExecTypeField;
import omi.eurex.t7.xti.fbe.v10_1.fields.ExpireDateField;
import omi.eurex.t7.xti.fbe.v10_1.fields.FixClOrdIdField;
import omi.eurex.t7.xti.fbe.v10_1.fields.FreeText1Field;
import omi.eurex.t7.xti.fbe.v10_1.fields.FreeText2Field;
import omi.eurex.t7.xti.fbe.v10_1.fields.FreeText4Field;
import omi.eurex.t7.xti.fbe.v10_1.fields.LeavesQtyField;
import omi.eurex.t7.xti.fbe.v10_1.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v10_1.fields.MatchInstCrossIdField;
import omi.eurex.t7.xti.fbe.v10_1.fields.OrdStatusField;
import omi.eurex.t7.xti.fbe.v10_1.fields.OrdTypeField;
import omi.eurex.t7.xti.fbe.v10_1.fields.OrderIdField;
import omi.eurex.t7.xti.fbe.v10_1.fields.OrderIdSfxField;
import omi.eurex.t7.xti.fbe.v10_1.fields.OrderQtyField;
import omi.eurex.t7.xti.fbe.v10_1.fields.OrigClOrdIdField;
import omi.eurex.t7.xti.fbe.v10_1.fields.PartyEnteringFirmField;
import omi.eurex.t7.xti.fbe.v10_1.fields.PartyEnteringTraderField;
import omi.eurex.t7.xti.fbe.v10_1.fields.PartyExecutingFirmField;
import omi.eurex.t7.xti.fbe.v10_1.fields.PartyExecutingTraderField;
import omi.eurex.t7.xti.fbe.v10_1.fields.PartyIdEnteringTraderField;
import omi.eurex.t7.xti.fbe.v10_1.fields.PartyIdExecutingTraderField;
import omi.eurex.t7.xti.fbe.v10_1.fields.PartyIdExecutingUnitField;
import omi.eurex.t7.xti.fbe.v10_1.fields.PartyIdSessionIdField;
import omi.eurex.t7.xti.fbe.v10_1.fields.PegOffsetValueAbsField;
import omi.eurex.t7.xti.fbe.v10_1.fields.PegOffsetValuePctField;
import omi.eurex.t7.xti.fbe.v10_1.fields.PriceField;
import omi.eurex.t7.xti.fbe.v10_1.fields.QuoteIdField;
import omi.eurex.t7.xti.fbe.v10_1.fields.SecurityIdField;
import omi.eurex.t7.xti.fbe.v10_1.fields.SideField;
import omi.eurex.t7.xti.fbe.v10_1.fields.StopPxField;
import omi.eurex.t7.xti.fbe.v10_1.fields.TimeInForceField;
import omi.eurex.t7.xti.fbe.v10_1.fields.TradingCapacityField;
import omi.eurex.t7.xti.fbe.v10_1.fields.TradingSessionSubIdField;
import omi.eurex.t7.xti.fbe.v10_1.fields.TrdRegTsEntryTimeField;
import omi.eurex.t7.xti.fbe.v10_1.fields.TriggeredField;
import omi.eurex.t7.xti.fbe.v10_1.fields.VolumeDiscoveryPriceField;
import omi.eurex.t7.xti.fbe.v10_1.structs.RbcHeaderMeComp;
import omi.eurex.t7.xti.fbe.v10_1.types.Field;
import omi.eurex.t7.xti.fbe.v10_1.types.Message;
import omi.eurex.t7.xti.fbe.v10_1.types.PrintOptions;

/**
 * Represents the ExtendedDeletionReport message from the Xti protocol.
 */
public final class ExtendedDeletionReport implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 338;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Extended Deletion Report";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 51, 7, 336, 2 };

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
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Volume Discovery Price
     */
    private final VolumeDiscoveryPriceField volumeDiscoveryPrice = new VolumeDiscoveryPriceField();

    /**
     * Peg Offset Value Abs
     */
    private final PegOffsetValueAbsField pegOffsetValueAbs = new PegOffsetValueAbsField();

    /**
     * Peg Offset Value Pct
     */
    private final PegOffsetValuePctField pegOffsetValuePct = new PegOffsetValuePctField();

    /**
     * Quote Id
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Order Id Sfx
     */
    private final OrderIdSfxField orderIdSfx = new OrderIdSfxField();

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
     * Exec Restatement Reason
     */
    private final ExecRestatementReasonField execRestatementReason = new ExecRestatementReasonField();

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
     * Party Entering Firm
     */
    private final PartyEnteringFirmField partyEnteringFirm = new PartyEnteringFirmField();

    /**
     * Party Entering Trader
     */
    private final PartyEnteringTraderField partyEnteringTrader = new PartyEnteringTraderField();

    /**
     * Party Executing Firm
     */
    private final PartyExecutingFirmField partyExecutingFirm = new PartyExecutingFirmField();

    /**
     * Party Executing Trader
     */
    private final PartyExecutingTraderField partyExecutingTrader = new PartyExecutingTraderField();

    /**
     * Fix Cl Ord Id
     */
    private final FixClOrdIdField fixClOrdId = new FixClOrdIdField();

    /**
     * Triggered
     */
    private final TriggeredField triggered = new TriggeredField();

    /**
     * Rbc Header Me Comp
     */
    private final RbcHeaderMeComp rbcHeaderMeComp = new RbcHeaderMeComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderMeComp.fields(), List.<Field>of(orderId), List.<Field>of(clOrdId), List.<Field>of(origClOrdId), List.<Field>of(securityId), List.<Field>of(execId), List.<Field>of(trdRegTsEntryTime), List.<Field>of(price), List.<Field>of(leavesQty), List.<Field>of(cumQty), List.<Field>of(cxlQty), List.<Field>of(orderQty), List.<Field>of(displayQty), List.<Field>of(displayLowQty), List.<Field>of(displayHighQty), List.<Field>of(stopPx), List.<Field>of(volumeDiscoveryPrice), List.<Field>of(pegOffsetValueAbs), List.<Field>of(pegOffsetValuePct), List.<Field>of(quoteId), List.<Field>of(marketSegmentId), List.<Field>of(orderIdSfx), List.<Field>of(expireDate), List.<Field>of(matchInstCrossId), List.<Field>of(partyIdExecutingUnit), List.<Field>of(partyIdSessionId), List.<Field>of(partyIdExecutingTrader), List.<Field>of(partyIdEnteringTrader), List.<Field>of(execRestatementReason), List.<Field>of(ordStatus), List.<Field>of(execType), List.<Field>of(side), List.<Field>of(ordType), List.<Field>of(tradingCapacity), List.<Field>of(timeInForce), List.<Field>of(execInst), List.<Field>of(tradingSessionSubId), List.<Field>of(applSeqIndicator), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText4), List.<Field>of(partyEnteringFirm), List.<Field>of(partyEnteringTrader), List.<Field>of(partyExecutingFirm), List.<Field>of(partyExecutingTrader), List.<Field>of(fixClOrdId), List.<Field>of(triggered)).flatMap(List::stream).toList();

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
     * Stop Px
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Volume Discovery Price
     *
     * @return the VolumeDiscoveryPrice field
     */
    public VolumeDiscoveryPriceField volumeDiscoveryPrice() {
        return volumeDiscoveryPrice;
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
     * Quote Id
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
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
     * Order Id Sfx
     *
     * @return the OrderIdSfx field
     */
    public OrderIdSfxField orderIdSfx() {
        return orderIdSfx;
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
     * Exec Restatement Reason
     *
     * @return the ExecRestatementReason field
     */
    public ExecRestatementReasonField execRestatementReason() {
        return execRestatementReason;
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
     * Party Entering Firm
     *
     * @return the PartyEnteringFirm field
     */
    public PartyEnteringFirmField partyEnteringFirm() {
        return partyEnteringFirm;
    }

    /**
     * Party Entering Trader
     *
     * @return the PartyEnteringTrader field
     */
    public PartyEnteringTraderField partyEnteringTrader() {
        return partyEnteringTrader;
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
     * Fix Cl Ord Id
     *
     * @return the FixClOrdId field
     */
    public FixClOrdIdField fixClOrdId() {
        return fixClOrdId;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        cursor += 2; // padding
        if (!rbcHeaderMeComp.parseFrom(data, cursor, end - 280)) {
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
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!volumeDiscoveryPrice.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeDiscoveryPriceField.BYTE_LENGTH;
        if (!pegOffsetValueAbs.parse(data, cursor)) {
            return false;
        }
        cursor += PegOffsetValueAbsField.BYTE_LENGTH;
        if (!pegOffsetValuePct.parse(data, cursor)) {
            return false;
        }
        cursor += PegOffsetValuePctField.BYTE_LENGTH;
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!orderIdSfx.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdSfxField.BYTE_LENGTH;
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
        if (!execRestatementReason.parse(data, cursor)) {
            return false;
        }
        cursor += ExecRestatementReasonField.BYTE_LENGTH;
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
        if (!partyEnteringFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyEnteringFirmField.BYTE_LENGTH;
        if (!partyEnteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyEnteringTraderField.BYTE_LENGTH;
        if (!partyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingFirmField.BYTE_LENGTH;
        if (!partyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingTraderField.BYTE_LENGTH;
        if (!fixClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += FixClOrdIdField.BYTE_LENGTH;
        if (!triggered.parse(data, cursor)) {
            return false;
        }
        cursor += TriggeredField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
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
        cursor = price.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = cxlQty.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = displayQty.encode(data, cursor);
        cursor = displayLowQty.encode(data, cursor);
        cursor = displayHighQty.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = volumeDiscoveryPrice.encode(data, cursor);
        cursor = pegOffsetValueAbs.encode(data, cursor);
        cursor = pegOffsetValuePct.encode(data, cursor);
        cursor = quoteId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = orderIdSfx.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = matchInstCrossId.encode(data, cursor);
        cursor = partyIdExecutingUnit.encode(data, cursor);
        cursor = partyIdSessionId.encode(data, cursor);
        cursor = partyIdExecutingTrader.encode(data, cursor);
        cursor = partyIdEnteringTrader.encode(data, cursor);
        cursor = execRestatementReason.encode(data, cursor);
        cursor = ordStatus.encode(data, cursor);
        cursor = execType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = tradingSessionSubId.encode(data, cursor);
        cursor = applSeqIndicator.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText4.encode(data, cursor);
        cursor = partyEnteringFirm.encode(data, cursor);
        cursor = partyEnteringTrader.encode(data, cursor);
        cursor = partyExecutingFirm.encode(data, cursor);
        cursor = partyExecutingTrader.encode(data, cursor);
        cursor = fixClOrdId.encode(data, cursor);
        cursor = triggered.encode(data, cursor);
        if (buffer != null && buffer.length >= 338) {
            System.arraycopy(buffer, 336, data, cursor, 2); // padding
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
        rbcHeaderMeComp.clear();
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
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "SecurityId" -> Optional.of(securityId);
            case "ExecId" -> Optional.of(execId);
            case "TrdRegTsEntryTime" -> Optional.of(trdRegTsEntryTime);
            case "Price" -> Optional.of(price);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "CumQty" -> Optional.of(cumQty);
            case "CxlQty" -> Optional.of(cxlQty);
            case "OrderQty" -> Optional.of(orderQty);
            case "DisplayQty" -> Optional.of(displayQty);
            case "DisplayLowQty" -> Optional.of(displayLowQty);
            case "DisplayHighQty" -> Optional.of(displayHighQty);
            case "StopPx" -> Optional.of(stopPx);
            case "VolumeDiscoveryPrice" -> Optional.of(volumeDiscoveryPrice);
            case "PegOffsetValueAbs" -> Optional.of(pegOffsetValueAbs);
            case "PegOffsetValuePct" -> Optional.of(pegOffsetValuePct);
            case "QuoteId" -> Optional.of(quoteId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "OrderIdSfx" -> Optional.of(orderIdSfx);
            case "ExpireDate" -> Optional.of(expireDate);
            case "MatchInstCrossId" -> Optional.of(matchInstCrossId);
            case "PartyIdExecutingUnit" -> Optional.of(partyIdExecutingUnit);
            case "PartyIdSessionId" -> Optional.of(partyIdSessionId);
            case "PartyIdExecutingTrader" -> Optional.of(partyIdExecutingTrader);
            case "PartyIdEnteringTrader" -> Optional.of(partyIdEnteringTrader);
            case "ExecRestatementReason" -> Optional.of(execRestatementReason);
            case "OrdStatus" -> Optional.of(ordStatus);
            case "ExecType" -> Optional.of(execType);
            case "Side" -> Optional.of(side);
            case "OrdType" -> Optional.of(ordType);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "ExecInst" -> Optional.of(execInst);
            case "TradingSessionSubId" -> Optional.of(tradingSessionSubId);
            case "ApplSeqIndicator" -> Optional.of(applSeqIndicator);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText4" -> Optional.of(freeText4);
            case "PartyEnteringFirm" -> Optional.of(partyEnteringFirm);
            case "PartyEnteringTrader" -> Optional.of(partyEnteringTrader);
            case "PartyExecutingFirm" -> Optional.of(partyExecutingFirm);
            case "PartyExecutingTrader" -> Optional.of(partyExecutingTrader);
            case "FixClOrdId" -> Optional.of(fixClOrdId);
            case "Triggered" -> Optional.of(triggered);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExtendedDeletionReport message)) {
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
        if (!(other instanceof ExtendedDeletionReport message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
