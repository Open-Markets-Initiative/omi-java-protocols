package omi.eurex.t7.xti.fbe.v13_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v13_1.fields.LastPxField;
import omi.eurex.t7.xti.fbe.v13_1.fields.LastQtyField;
import omi.eurex.t7.xti.fbe.v13_1.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.NoSideOtcAllocsField;
import omi.eurex.t7.xti.fbe.v13_1.fields.OtcExecIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.PackageIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.RegulatoryTradeIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.SecurityIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.SettlCurrFxRateField;
import omi.eurex.t7.xti.fbe.v13_1.fields.SettlCurrencyField;
import omi.eurex.t7.xti.fbe.v13_1.fields.SettlDateField;
import omi.eurex.t7.xti.fbe.v13_1.fields.TradePlatformField;
import omi.eurex.t7.xti.fbe.v13_1.fields.TradePublishIndicatorField;
import omi.eurex.t7.xti.fbe.v13_1.fields.TradeReportIdField;
import omi.eurex.t7.xti.fbe.v13_1.fields.TradeReportTypeField;
import omi.eurex.t7.xti.fbe.v13_1.fields.TransBkdTimeField;
import omi.eurex.t7.xti.fbe.v13_1.fields.TransactTimeField;
import omi.eurex.t7.xti.fbe.v13_1.fields.TransactionCostAmtField;
import omi.eurex.t7.xti.fbe.v13_1.fields.TransactionCostCodeField;
import omi.eurex.t7.xti.fbe.v13_1.fields.TrdRptStatusField;
import omi.eurex.t7.xti.fbe.v13_1.fields.TrdTypeField;
import omi.eurex.t7.xti.fbe.v13_1.groups.SideAllocOtcGrpCompEntry;
import omi.eurex.t7.xti.fbe.v13_1.groups.SideAllocOtcGrpCompList;
import omi.eurex.t7.xti.fbe.v13_1.structs.RbcHeaderComp;
import omi.eurex.t7.xti.fbe.v13_1.types.Field;
import omi.eurex.t7.xti.fbe.v13_1.types.Message;
import omi.eurex.t7.xti.fbe.v13_1.types.PrintOptions;

/**
 * Represents the OtcUploadBroadcast message from the Xti protocol.
 */
public final class OtcUploadBroadcast implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 194;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Otc Upload Broadcast";

    /**
     * Otc Exec Id
     */
    private final OtcExecIdField otcExecId = new OtcExecIdField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Last Qty
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Settl Curr Fx Rate
     */
    private final SettlCurrFxRateField settlCurrFxRate = new SettlCurrFxRateField();

    /**
     * Transaction Cost Amt
     */
    private final TransactionCostAmtField transactionCostAmt = new TransactionCostAmtField();

    /**
     * Trans Bkd Time
     */
    private final TransBkdTimeField transBkdTime = new TransBkdTimeField();

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Package Id
     */
    private final PackageIdField packageId = new PackageIdField();

    /**
     * Settl Date
     */
    private final SettlDateField settlDate = new SettlDateField();

    /**
     * Trd Type
     */
    private final TrdTypeField trdType = new TrdTypeField();

    /**
     * Trade Report Type
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * Trd Rpt Status
     */
    private final TrdRptStatusField trdRptStatus = new TrdRptStatusField();

    /**
     * Trade Publish Indicator
     */
    private final TradePublishIndicatorField tradePublishIndicator = new TradePublishIndicatorField();

    /**
     * No Side Otc Allocs
     */
    private final NoSideOtcAllocsField noSideOtcAllocs = new NoSideOtcAllocsField();

    /**
     * Transaction Cost Code
     */
    private final TransactionCostCodeField transactionCostCode = new TransactionCostCodeField();

    /**
     * Trade Platform
     */
    private final TradePlatformField tradePlatform = new TradePlatformField();

    /**
     * Settl Currency
     */
    private final SettlCurrencyField settlCurrency = new SettlCurrencyField();

    /**
     * Trade Report Id
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Regulatory Trade Id
     */
    private final RegulatoryTradeIdField regulatoryTradeId = new RegulatoryTradeIdField();

    /**
     * Side Alloc Otc Grp Comp
     */
    private final SideAllocOtcGrpCompList sideAllocOtcGrpComp = new SideAllocOtcGrpCompList();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(otcExecId), List.<Field>of(securityId), List.<Field>of(lastPx), List.<Field>of(lastQty), List.<Field>of(settlCurrFxRate), List.<Field>of(transactionCostAmt), List.<Field>of(transBkdTime), List.<Field>of(transactTime), List.<Field>of(marketSegmentId), List.<Field>of(packageId), List.<Field>of(settlDate), List.<Field>of(trdType), List.<Field>of(tradeReportType), List.<Field>of(trdRptStatus), List.<Field>of(tradePublishIndicator), List.<Field>of(noSideOtcAllocs), List.<Field>of(transactionCostCode), List.<Field>of(tradePlatform), List.<Field>of(settlCurrency), List.<Field>of(tradeReportId), List.<Field>of(regulatoryTradeId)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Otc Exec Id
     *
     * @return the OtcExecId field
     */
    public OtcExecIdField otcExecId() {
        return otcExecId;
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
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Last Qty
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
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
     * Transaction Cost Amt
     *
     * @return the TransactionCostAmt field
     */
    public TransactionCostAmtField transactionCostAmt() {
        return transactionCostAmt;
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
     * Transact Time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
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
     * Settl Date
     *
     * @return the SettlDate field
     */
    public SettlDateField settlDate() {
        return settlDate;
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
     * Trade Publish Indicator
     *
     * @return the TradePublishIndicator field
     */
    public TradePublishIndicatorField tradePublishIndicator() {
        return tradePublishIndicator;
    }

    /**
     * No Side Otc Allocs
     *
     * @return the NoSideOtcAllocs field
     */
    public NoSideOtcAllocsField noSideOtcAllocs() {
        return noSideOtcAllocs;
    }

    /**
     * Transaction Cost Code
     *
     * @return the TransactionCostCode field
     */
    public TransactionCostCodeField transactionCostCode() {
        return transactionCostCode;
    }

    /**
     * Trade Platform
     *
     * @return the TradePlatform field
     */
    public TradePlatformField tradePlatform() {
        return tradePlatform;
    }

    /**
     * Settl Currency
     *
     * @return the SettlCurrency field
     */
    public SettlCurrencyField settlCurrency() {
        return settlCurrency;
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
     * Regulatory Trade Id
     *
     * @return the RegulatoryTradeId field
     */
    public RegulatoryTradeIdField regulatoryTradeId() {
        return regulatoryTradeId;
    }

    /**
     * Side Alloc Otc Grp Comp
     *
     * <p>Encode writes this list's size to the NoSideOtcAllocs field.</p>
     *
     * @return the SideAllocOtcGrpComp entries
     */
    public SideAllocOtcGrpCompList sideAllocOtcGrpComp() {
        return sideAllocOtcGrpComp;
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
        return MINIMUM_BYTE_LENGTH + sideAllocOtcGrpComp.byteLength();
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
        cursor += 4;
        runs.add(cursor).add(4);
        cursor += 4;
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
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 3;
        cursor += 20;
        cursor += 52;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor = sideAllocOtcGrpComp.padding(runs, cursor);
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 160)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!otcExecId.parse(data, cursor)) {
            return false;
        }
        cursor += OtcExecIdField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!settlCurrFxRate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlCurrFxRateField.BYTE_LENGTH;
        if (!transactionCostAmt.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionCostAmtField.BYTE_LENGTH;
        if (!transBkdTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransBkdTimeField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!packageId.parse(data, cursor)) {
            return false;
        }
        cursor += PackageIdField.BYTE_LENGTH;
        if (!settlDate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlDateField.BYTE_LENGTH;
        if (!trdType.parse(data, cursor)) {
            return false;
        }
        cursor += TrdTypeField.BYTE_LENGTH;
        if (!tradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTypeField.BYTE_LENGTH;
        if (!trdRptStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TrdRptStatusField.BYTE_LENGTH;
        if (!tradePublishIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TradePublishIndicatorField.BYTE_LENGTH;
        if (!noSideOtcAllocs.parse(data, cursor)) {
            return false;
        }
        cursor += NoSideOtcAllocsField.BYTE_LENGTH;
        if (!transactionCostCode.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionCostCodeField.BYTE_LENGTH;
        if (!tradePlatform.parse(data, cursor)) {
            return false;
        }
        cursor += TradePlatformField.BYTE_LENGTH;
        if (!settlCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += SettlCurrencyField.BYTE_LENGTH;
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        if (!regulatoryTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += RegulatoryTradeIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!sideAllocOtcGrpComp.parse(data, cursor, end, noSideOtcAllocs.value())) {
            return false;
        }
        cursor += sideAllocOtcGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (sideAllocOtcGrpComp.size() > 255) {
            throw new IllegalStateException("sideAllocOtcGrpComp holds " + sideAllocOtcGrpComp.size() + " entries, more than its count field can state");
        }
        noSideOtcAllocs.value((short) sideAllocOtcGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = otcExecId.encode(data, cursor);
        if (buffer != null && buffer.length >= 42) {
            System.arraycopy(buffer, 38, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = securityId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = settlCurrFxRate.encode(data, cursor);
        cursor = transactionCostAmt.encode(data, cursor);
        cursor = transBkdTime.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = packageId.encode(data, cursor);
        cursor = settlDate.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = trdRptStatus.encode(data, cursor);
        cursor = tradePublishIndicator.encode(data, cursor);
        cursor = noSideOtcAllocs.encode(data, cursor);
        cursor = transactionCostCode.encode(data, cursor);
        cursor = tradePlatform.encode(data, cursor);
        cursor = settlCurrency.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        cursor = regulatoryTradeId.encode(data, cursor);
        if (buffer != null && buffer.length >= 194) {
            System.arraycopy(buffer, 193, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = sideAllocOtcGrpComp.encode(data, cursor);
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
        sideAllocOtcGrpComp.clear();
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
            if (field != noSideOtcAllocs && !field.isRecognized()) {
                return false;
            }
        }
        return sideAllocOtcGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noSideOtcAllocs && !field.isValid()) {
                return false;
            }
        }
        if (!sideAllocOtcGrpComp.isValid()) {
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
        if (!otcExecId.isDecoded()) {
            return Optional.of(otcExecId);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!lastPx.isDecoded()) {
            return Optional.of(lastPx);
        }
        if (!lastQty.isDecoded()) {
            return Optional.of(lastQty);
        }
        if (!settlCurrFxRate.isDecoded()) {
            return Optional.of(settlCurrFxRate);
        }
        if (!transactionCostAmt.isDecoded()) {
            return Optional.of(transactionCostAmt);
        }
        if (!transBkdTime.isDecoded()) {
            return Optional.of(transBkdTime);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!packageId.isDecoded()) {
            return Optional.of(packageId);
        }
        if (!settlDate.isDecoded()) {
            return Optional.of(settlDate);
        }
        if (!trdType.isDecoded()) {
            return Optional.of(trdType);
        }
        if (!tradeReportType.isDecoded()) {
            return Optional.of(tradeReportType);
        }
        if (!trdRptStatus.isDecoded()) {
            return Optional.of(trdRptStatus);
        }
        if (!tradePublishIndicator.isDecoded()) {
            return Optional.of(tradePublishIndicator);
        }
        if (!noSideOtcAllocs.isDecoded()) {
            return Optional.of(noSideOtcAllocs);
        }
        if (!transactionCostCode.isDecoded()) {
            return Optional.of(transactionCostCode);
        }
        if (!tradePlatform.isDecoded()) {
            return Optional.of(tradePlatform);
        }
        if (!settlCurrency.isDecoded()) {
            return Optional.of(settlCurrency);
        }
        if (!tradeReportId.isDecoded()) {
            return Optional.of(tradeReportId);
        }
        if (!regulatoryTradeId.isDecoded()) {
            return Optional.of(regulatoryTradeId);
        }
        if (!sideAllocOtcGrpComp.isDecoded()) {
            return Optional.of(sideAllocOtcGrpComp.failedEntry().flatMap(SideAllocOtcGrpCompEntry::failedAt).orElse(noSideOtcAllocs));
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
            case "OtcExecId" -> Optional.of(otcExecId);
            case "SecurityId" -> Optional.of(securityId);
            case "LastPx" -> Optional.of(lastPx);
            case "LastQty" -> Optional.of(lastQty);
            case "SettlCurrFxRate" -> Optional.of(settlCurrFxRate);
            case "TransactionCostAmt" -> Optional.of(transactionCostAmt);
            case "TransBkdTime" -> Optional.of(transBkdTime);
            case "TransactTime" -> Optional.of(transactTime);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "PackageId" -> Optional.of(packageId);
            case "SettlDate" -> Optional.of(settlDate);
            case "TrdType" -> Optional.of(trdType);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "TrdRptStatus" -> Optional.of(trdRptStatus);
            case "TradePublishIndicator" -> Optional.of(tradePublishIndicator);
            case "NoSideOtcAllocs" -> Optional.of(noSideOtcAllocs);
            case "TransactionCostCode" -> Optional.of(transactionCostCode);
            case "TradePlatform" -> Optional.of(tradePlatform);
            case "SettlCurrency" -> Optional.of(settlCurrency);
            case "TradeReportId" -> Optional.of(tradeReportId);
            case "RegulatoryTradeId" -> Optional.of(regulatoryTradeId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OtcUploadBroadcast message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(sideAllocOtcGrpComp.diffFields(message.sideAllocOtcGrpComp));
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
            sideAllocOtcGrpComp.toFormattedString(builder, options);
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
        sideAllocOtcGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof OtcUploadBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields) && sideAllocOtcGrpComp.equals(message.sideAllocOtcGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, sideAllocOtcGrpComp);
    }
}
