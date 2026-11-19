package omi.eurex.t7.xti.fbe.v15_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v15_0.fields.AllocIdField;
import omi.eurex.t7.xti.fbe.v15_0.fields.AllocQtyField;
import omi.eurex.t7.xti.fbe.v15_0.fields.AutoApprovalRuleIdField;
import omi.eurex.t7.xti.fbe.v15_0.fields.FreeText1Field;
import omi.eurex.t7.xti.fbe.v15_0.fields.FreeText2Field;
import omi.eurex.t7.xti.fbe.v15_0.fields.FreeText4Field;
import omi.eurex.t7.xti.fbe.v15_0.fields.LastPxField;
import omi.eurex.t7.xti.fbe.v15_0.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v15_0.fields.MessageEventSourceField;
import omi.eurex.t7.xti.fbe.v15_0.fields.PackageIdField;
import omi.eurex.t7.xti.fbe.v15_0.fields.PartyEnteringTraderField;
import omi.eurex.t7.xti.fbe.v15_0.fields.PartyExecutingFirmField;
import omi.eurex.t7.xti.fbe.v15_0.fields.PartyExecutingTraderField;
import omi.eurex.t7.xti.fbe.v15_0.fields.PartyIdEnteringFirmField;
import omi.eurex.t7.xti.fbe.v15_0.fields.RootPartyExecutingFirmField;
import omi.eurex.t7.xti.fbe.v15_0.fields.RootPartyExecutingTraderField;
import omi.eurex.t7.xti.fbe.v15_0.fields.SecurityIdField;
import omi.eurex.t7.xti.fbe.v15_0.fields.SettlCurrFxRateField;
import omi.eurex.t7.xti.fbe.v15_0.fields.SettlDateField;
import omi.eurex.t7.xti.fbe.v15_0.fields.SideField;
import omi.eurex.t7.xti.fbe.v15_0.fields.TesEnrichmentRuleIdField;
import omi.eurex.t7.xti.fbe.v15_0.fields.TesExecIdField;
import omi.eurex.t7.xti.fbe.v15_0.fields.TradeAllocStatusField;
import omi.eurex.t7.xti.fbe.v15_0.fields.TradePublishIndicatorField;
import omi.eurex.t7.xti.fbe.v15_0.fields.TradeReportIdField;
import omi.eurex.t7.xti.fbe.v15_0.fields.TradeReportTypeField;
import omi.eurex.t7.xti.fbe.v15_0.fields.TradingCapacityField;
import omi.eurex.t7.xti.fbe.v15_0.fields.TransBkdTimeField;
import omi.eurex.t7.xti.fbe.v15_0.fields.TransactTimeField;
import omi.eurex.t7.xti.fbe.v15_0.fields.TrdRptStatusField;
import omi.eurex.t7.xti.fbe.v15_0.fields.TrdTypeField;
import omi.eurex.t7.xti.fbe.v15_0.fields.ValueCheckTypeQuantityField;
import omi.eurex.t7.xti.fbe.v15_0.fields.ValueCheckTypeValueField;
import omi.eurex.t7.xti.fbe.v15_0.fields.VarTextLenField;
import omi.eurex.t7.xti.fbe.v15_0.structs.RbcHeaderComp;
import omi.eurex.t7.xti.fbe.v15_0.types.Field;
import omi.eurex.t7.xti.fbe.v15_0.types.Message;
import omi.eurex.t7.xti.fbe.v15_0.types.PrintOptions;
import omi.eurex.t7.xti.fbe.v15_0.types.SizedField;

/**
 * Represents the TesApproveBroadcast message from the Xti protocol.
 */
public final class TesApproveBroadcast implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 212;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Tes Approve Broadcast";

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Alloc Qty
     */
    private final AllocQtyField allocQty = new AllocQtyField();

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Trans Bkd Time
     */
    private final TransBkdTimeField transBkdTime = new TransBkdTimeField();

    /**
     * Settl Curr Fx Rate
     */
    private final SettlCurrFxRateField settlCurrFxRate = new SettlCurrFxRateField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Package Id
     */
    private final PackageIdField packageId = new PackageIdField();

    /**
     * Tes Exec Id
     */
    private final TesExecIdField tesExecId = new TesExecIdField();

    /**
     * Alloc Id
     */
    private final AllocIdField allocId = new AllocIdField();

    /**
     * Settl Date
     */
    private final SettlDateField settlDate = new SettlDateField();

    /**
     * Tes Enrichment Rule Id
     */
    private final TesEnrichmentRuleIdField tesEnrichmentRuleId = new TesEnrichmentRuleIdField();

    /**
     * Auto Approval Rule Id
     */
    private final AutoApprovalRuleIdField autoApprovalRuleId = new AutoApprovalRuleIdField();

    /**
     * Trd Type
     */
    private final TrdTypeField trdType = new TrdTypeField();

    /**
     * Var Text Len
     */
    private final VarTextLenField varTextLen = new VarTextLenField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Value Check Type Value
     */
    private final ValueCheckTypeValueField valueCheckTypeValue = new ValueCheckTypeValueField();

    /**
     * Value Check Type Quantity
     */
    private final ValueCheckTypeQuantityField valueCheckTypeQuantity = new ValueCheckTypeQuantityField();

    /**
     * Trade Publish Indicator
     */
    private final TradePublishIndicatorField tradePublishIndicator = new TradePublishIndicatorField();

    /**
     * Trade Report Type
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * Trd Rpt Status
     */
    private final TrdRptStatusField trdRptStatus = new TrdRptStatusField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Trade Alloc Status
     */
    private final TradeAllocStatusField tradeAllocStatus = new TradeAllocStatusField();

    /**
     * Message Event Source
     */
    private final MessageEventSourceField messageEventSource = new MessageEventSourceField();

    /**
     * Trade Report Id
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Party Executing Firm
     */
    private final PartyExecutingFirmField partyExecutingFirm = new PartyExecutingFirmField();

    /**
     * Party Executing Trader
     */
    private final PartyExecutingTraderField partyExecutingTrader = new PartyExecutingTraderField();

    /**
     * Party Id Entering Firm
     */
    private final PartyIdEnteringFirmField partyIdEnteringFirm = new PartyIdEnteringFirmField();

    /**
     * Party Entering Trader
     */
    private final PartyEnteringTraderField partyEnteringTrader = new PartyEnteringTraderField();

    /**
     * Root Party Executing Firm
     */
    private final RootPartyExecutingFirmField rootPartyExecutingFirm = new RootPartyExecutingFirmField();

    /**
     * Root Party Executing Trader
     */
    private final RootPartyExecutingTraderField rootPartyExecutingTrader = new RootPartyExecutingTraderField();

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
     * Var Text
     */
    private final SizedField varText = new SizedField("VarText", true);

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(securityId), List.<Field>of(lastPx), List.<Field>of(allocQty), List.<Field>of(transactTime), List.<Field>of(transBkdTime), List.<Field>of(settlCurrFxRate), List.<Field>of(marketSegmentId), List.<Field>of(packageId), List.<Field>of(tesExecId), List.<Field>of(allocId), List.<Field>of(settlDate), List.<Field>of(tesEnrichmentRuleId), List.<Field>of(autoApprovalRuleId), List.<Field>of(trdType), List.<Field>of(varTextLen), List.<Field>of(side), List.<Field>of(valueCheckTypeValue), List.<Field>of(valueCheckTypeQuantity), List.<Field>of(tradePublishIndicator), List.<Field>of(tradeReportType), List.<Field>of(trdRptStatus), List.<Field>of(tradingCapacity), List.<Field>of(tradeAllocStatus), List.<Field>of(messageEventSource), List.<Field>of(tradeReportId), List.<Field>of(partyExecutingFirm), List.<Field>of(partyExecutingTrader), List.<Field>of(partyIdEnteringFirm), List.<Field>of(partyEnteringTrader), List.<Field>of(rootPartyExecutingFirm), List.<Field>of(rootPartyExecutingTrader), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText4), List.<Field>of(varText)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Alloc Qty
     *
     * @return the AllocQty field
     */
    public AllocQtyField allocQty() {
        return allocQty;
    }

    /**
     * Transact Time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Trans Bkd Time
     *
     * @return the TransBkdTime field
     */
    public TransBkdTimeField transBkdTime() {
        return transBkdTime;
    }

    /**
     * Settl Curr Fx Rate
     *
     * @return the SettlCurrFxRate field
     */
    public SettlCurrFxRateField settlCurrFxRate() {
        return settlCurrFxRate;
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
     * Package Id
     *
     * @return the PackageId field
     */
    public PackageIdField packageId() {
        return packageId;
    }

    /**
     * Tes Exec Id
     *
     * @return the TesExecId field
     */
    public TesExecIdField tesExecId() {
        return tesExecId;
    }

    /**
     * Alloc Id
     *
     * @return the AllocId field
     */
    public AllocIdField allocId() {
        return allocId;
    }

    /**
     * Settl Date
     *
     * @return the SettlDate field
     */
    public SettlDateField settlDate() {
        return settlDate;
    }

    /**
     * Tes Enrichment Rule Id
     *
     * @return the TesEnrichmentRuleId field
     */
    public TesEnrichmentRuleIdField tesEnrichmentRuleId() {
        return tesEnrichmentRuleId;
    }

    /**
     * Auto Approval Rule Id
     *
     * @return the AutoApprovalRuleId field
     */
    public AutoApprovalRuleIdField autoApprovalRuleId() {
        return autoApprovalRuleId;
    }

    /**
     * Trd Type
     *
     * @return the TrdType field
     */
    public TrdTypeField trdType() {
        return trdType;
    }

    /**
     * Var Text Len
     *
     * @return the VarTextLen field
     */
    public VarTextLenField varTextLen() {
        return varTextLen;
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
     * Trade Publish Indicator
     *
     * @return the TradePublishIndicator field
     */
    public TradePublishIndicatorField tradePublishIndicator() {
        return tradePublishIndicator;
    }

    /**
     * Trade Report Type
     *
     * @return the TradeReportType field
     */
    public TradeReportTypeField tradeReportType() {
        return tradeReportType;
    }

    /**
     * Trd Rpt Status
     *
     * @return the TrdRptStatus field
     */
    public TrdRptStatusField trdRptStatus() {
        return trdRptStatus;
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
     * Trade Alloc Status
     *
     * @return the TradeAllocStatus field
     */
    public TradeAllocStatusField tradeAllocStatus() {
        return tradeAllocStatus;
    }

    /**
     * Message Event Source
     *
     * @return the MessageEventSource field
     */
    public MessageEventSourceField messageEventSource() {
        return messageEventSource;
    }

    /**
     * Trade Report Id
     *
     * @return the TradeReportId field
     */
    public TradeReportIdField tradeReportId() {
        return tradeReportId;
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
     * Party Id Entering Firm
     *
     * @return the PartyIdEnteringFirm field
     */
    public PartyIdEnteringFirmField partyIdEnteringFirm() {
        return partyIdEnteringFirm;
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
     * Root Party Executing Firm
     *
     * @return the RootPartyExecutingFirm field
     */
    public RootPartyExecutingFirmField rootPartyExecutingFirm() {
        return rootPartyExecutingFirm;
    }

    /**
     * Root Party Executing Trader
     *
     * @return the RootPartyExecutingTrader field
     */
    public RootPartyExecutingTraderField rootPartyExecutingTrader() {
        return rootPartyExecutingTrader;
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
     * Var Text
     *
     * @return the VarText field
     */
    public SizedField varText() {
        return varText;
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
        return MINIMUM_BYTE_LENGTH + varText.byteLength();
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
        cursor += 20;
        cursor += 5;
        cursor += 6;
        cursor += 1;
        cursor += 6;
        cursor += 5;
        cursor += 6;
        cursor += 12;
        cursor += 12;
        cursor += 16;
        cursor += varText.byteLength();
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 178)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!allocQty.parse(data, cursor)) {
            return false;
        }
        cursor += AllocQtyField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!transBkdTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransBkdTimeField.BYTE_LENGTH;
        if (!settlCurrFxRate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlCurrFxRateField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!packageId.parse(data, cursor)) {
            return false;
        }
        cursor += PackageIdField.BYTE_LENGTH;
        if (!tesExecId.parse(data, cursor)) {
            return false;
        }
        cursor += TesExecIdField.BYTE_LENGTH;
        if (!allocId.parse(data, cursor)) {
            return false;
        }
        cursor += AllocIdField.BYTE_LENGTH;
        if (!settlDate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlDateField.BYTE_LENGTH;
        if (!tesEnrichmentRuleId.parse(data, cursor)) {
            return false;
        }
        cursor += TesEnrichmentRuleIdField.BYTE_LENGTH;
        if (!autoApprovalRuleId.parse(data, cursor)) {
            return false;
        }
        cursor += AutoApprovalRuleIdField.BYTE_LENGTH;
        if (!trdType.parse(data, cursor)) {
            return false;
        }
        cursor += TrdTypeField.BYTE_LENGTH;
        if (!varTextLen.parse(data, cursor)) {
            return false;
        }
        cursor += VarTextLenField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!valueCheckTypeValue.parse(data, cursor)) {
            return false;
        }
        cursor += ValueCheckTypeValueField.BYTE_LENGTH;
        if (!valueCheckTypeQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ValueCheckTypeQuantityField.BYTE_LENGTH;
        if (!tradePublishIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TradePublishIndicatorField.BYTE_LENGTH;
        if (!tradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTypeField.BYTE_LENGTH;
        if (!trdRptStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TrdRptStatusField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!tradeAllocStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradeAllocStatusField.BYTE_LENGTH;
        if (!messageEventSource.parse(data, cursor)) {
            return false;
        }
        cursor += MessageEventSourceField.BYTE_LENGTH;
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        if (!partyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingFirmField.BYTE_LENGTH;
        if (!partyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingTraderField.BYTE_LENGTH;
        if (!partyIdEnteringFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdEnteringFirmField.BYTE_LENGTH;
        if (!partyEnteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyEnteringTraderField.BYTE_LENGTH;
        if (!rootPartyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingFirmField.BYTE_LENGTH;
        if (!rootPartyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingTraderField.BYTE_LENGTH;
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
        if (!varText.parse(data, cursor, varTextLen.value(), end)) {
            return false;
        }
        cursor += varText.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (varText.byteLength() > 65535) {
            throw new IllegalStateException("varText holds " + varText.byteLength() + " bytes, more than its length field can state");
        }
        varTextLen.value((varText.byteLength()));
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = allocQty.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = transBkdTime.encode(data, cursor);
        cursor = settlCurrFxRate.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = packageId.encode(data, cursor);
        cursor = tesExecId.encode(data, cursor);
        cursor = allocId.encode(data, cursor);
        cursor = settlDate.encode(data, cursor);
        cursor = tesEnrichmentRuleId.encode(data, cursor);
        cursor = autoApprovalRuleId.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = varTextLen.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = valueCheckTypeValue.encode(data, cursor);
        cursor = valueCheckTypeQuantity.encode(data, cursor);
        cursor = tradePublishIndicator.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = trdRptStatus.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = tradeAllocStatus.encode(data, cursor);
        cursor = messageEventSource.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        cursor = partyExecutingFirm.encode(data, cursor);
        cursor = partyExecutingTrader.encode(data, cursor);
        cursor = partyIdEnteringFirm.encode(data, cursor);
        cursor = partyEnteringTrader.encode(data, cursor);
        cursor = rootPartyExecutingFirm.encode(data, cursor);
        cursor = rootPartyExecutingTrader.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText4.encode(data, cursor);
        cursor = varText.encode(data, cursor);
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
            if (field != varTextLen && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != varTextLen && !field.isValid()) {
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
            case "SecurityId" -> Optional.of(securityId);
            case "LastPx" -> Optional.of(lastPx);
            case "AllocQty" -> Optional.of(allocQty);
            case "TransactTime" -> Optional.of(transactTime);
            case "TransBkdTime" -> Optional.of(transBkdTime);
            case "SettlCurrFxRate" -> Optional.of(settlCurrFxRate);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "PackageId" -> Optional.of(packageId);
            case "TesExecId" -> Optional.of(tesExecId);
            case "AllocId" -> Optional.of(allocId);
            case "SettlDate" -> Optional.of(settlDate);
            case "TesEnrichmentRuleId" -> Optional.of(tesEnrichmentRuleId);
            case "AutoApprovalRuleId" -> Optional.of(autoApprovalRuleId);
            case "TrdType" -> Optional.of(trdType);
            case "VarTextLen" -> Optional.of(varTextLen);
            case "Side" -> Optional.of(side);
            case "ValueCheckTypeValue" -> Optional.of(valueCheckTypeValue);
            case "ValueCheckTypeQuantity" -> Optional.of(valueCheckTypeQuantity);
            case "TradePublishIndicator" -> Optional.of(tradePublishIndicator);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "TrdRptStatus" -> Optional.of(trdRptStatus);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "TradeAllocStatus" -> Optional.of(tradeAllocStatus);
            case "MessageEventSource" -> Optional.of(messageEventSource);
            case "TradeReportId" -> Optional.of(tradeReportId);
            case "PartyExecutingFirm" -> Optional.of(partyExecutingFirm);
            case "PartyExecutingTrader" -> Optional.of(partyExecutingTrader);
            case "PartyIdEnteringFirm" -> Optional.of(partyIdEnteringFirm);
            case "PartyEnteringTrader" -> Optional.of(partyEnteringTrader);
            case "RootPartyExecutingFirm" -> Optional.of(rootPartyExecutingFirm);
            case "RootPartyExecutingTrader" -> Optional.of(rootPartyExecutingTrader);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText4" -> Optional.of(freeText4);
            case "VarText" -> Optional.of(varText);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TesApproveBroadcast message)) {
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
        if (!(other instanceof TesApproveBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
