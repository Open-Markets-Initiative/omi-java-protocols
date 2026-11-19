package omi.eurex.t7.xti.fbe.v7_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v7_1.fields.LastPxField;
import omi.eurex.t7.xti.fbe.v7_1.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.MessageEventSourceField;
import omi.eurex.t7.xti.fbe.v7_1.fields.NoSideAllocsField;
import omi.eurex.t7.xti.fbe.v7_1.fields.PackageIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyExecutingFirmField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyExecutingTraderField;
import omi.eurex.t7.xti.fbe.v7_1.fields.SecurityIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.SettlCurrFxRateField;
import omi.eurex.t7.xti.fbe.v7_1.fields.SettlDateField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TesExecIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TradeReportIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TradeReportTextField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TradeReportTypeField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TransBkdTimeField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TransactTimeField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TrdTypeField;
import omi.eurex.t7.xti.fbe.v7_1.groups.SideAllocGrpBcCompEntry;
import omi.eurex.t7.xti.fbe.v7_1.groups.SideAllocGrpBcCompList;
import omi.eurex.t7.xti.fbe.v7_1.structs.RbcHeaderComp;
import omi.eurex.t7.xti.fbe.v7_1.types.Field;
import omi.eurex.t7.xti.fbe.v7_1.types.Message;
import omi.eurex.t7.xti.fbe.v7_1.types.PrintOptions;

/**
 * Represents the TesBroadcast message from the Xti protocol.
 */
public final class TesBroadcast implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 146;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Tes Broadcast";

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

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
     * No Side Allocs
     */
    private final NoSideAllocsField noSideAllocs = new NoSideAllocsField();

    /**
     * Message Event Source
     */
    private final MessageEventSourceField messageEventSource = new MessageEventSourceField();

    /**
     * Trade Report Text
     */
    private final TradeReportTextField tradeReportText = new TradeReportTextField();

    /**
     * Trade Report Id
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Root Party Executing Firm
     */
    private final RootPartyExecutingFirmField rootPartyExecutingFirm = new RootPartyExecutingFirmField();

    /**
     * Root Party Executing Trader
     */
    private final RootPartyExecutingTraderField rootPartyExecutingTrader = new RootPartyExecutingTraderField();

    /**
     * Side Alloc Grp Bc Comp
     */
    private final SideAllocGrpBcCompList sideAllocGrpBcComp = new SideAllocGrpBcCompList();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(securityId), List.<Field>of(lastPx), List.<Field>of(transactTime), List.<Field>of(transBkdTime), List.<Field>of(settlCurrFxRate), List.<Field>of(marketSegmentId), List.<Field>of(packageId), List.<Field>of(tesExecId), List.<Field>of(settlDate), List.<Field>of(trdType), List.<Field>of(tradeReportType), List.<Field>of(noSideAllocs), List.<Field>of(messageEventSource), List.<Field>of(tradeReportText), List.<Field>of(tradeReportId), List.<Field>of(rootPartyExecutingFirm), List.<Field>of(rootPartyExecutingTrader)).flatMap(List::stream).toList();

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
     * No Side Allocs
     *
     * @return the NoSideAllocs field
     */
    public NoSideAllocsField noSideAllocs() {
        return noSideAllocs;
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
     * Trade Report Text
     *
     * @return the TradeReportText field
     */
    public TradeReportTextField tradeReportText() {
        return tradeReportText;
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
     * Side Alloc Grp Bc Comp
     *
     * <p>Encode writes this list's size to the NoSideAllocs field.</p>
     *
     * @return the SideAllocGrpBcComp entries
     */
    public SideAllocGrpBcCompList sideAllocGrpBcComp() {
        return sideAllocGrpBcComp;
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
        return MINIMUM_BYTE_LENGTH + sideAllocGrpBcComp.byteLength();
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
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 20;
        cursor += 20;
        cursor += 5;
        cursor += 6;
        cursor = sideAllocGrpBcComp.padding(runs, cursor);
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 112)) {
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
        if (!noSideAllocs.parse(data, cursor)) {
            return false;
        }
        cursor += NoSideAllocsField.BYTE_LENGTH;
        if (!messageEventSource.parse(data, cursor)) {
            return false;
        }
        cursor += MessageEventSourceField.BYTE_LENGTH;
        if (!tradeReportText.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTextField.BYTE_LENGTH;
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        if (!rootPartyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingFirmField.BYTE_LENGTH;
        if (!rootPartyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingTraderField.BYTE_LENGTH;
        if (!sideAllocGrpBcComp.parse(data, cursor, end, noSideAllocs.value())) {
            return false;
        }
        cursor += sideAllocGrpBcComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (sideAllocGrpBcComp.size() > 255) {
            throw new IllegalStateException("sideAllocGrpBcComp holds " + sideAllocGrpBcComp.size() + " entries, more than its count field can state");
        }
        noSideAllocs.value((short) sideAllocGrpBcComp.size());
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
        cursor = transactTime.encode(data, cursor);
        cursor = transBkdTime.encode(data, cursor);
        cursor = settlCurrFxRate.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = packageId.encode(data, cursor);
        cursor = tesExecId.encode(data, cursor);
        cursor = settlDate.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = noSideAllocs.encode(data, cursor);
        cursor = messageEventSource.encode(data, cursor);
        cursor = tradeReportText.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        cursor = rootPartyExecutingFirm.encode(data, cursor);
        cursor = rootPartyExecutingTrader.encode(data, cursor);
        cursor = sideAllocGrpBcComp.encode(data, cursor);
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
        sideAllocGrpBcComp.clear();
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
            if (field != noSideAllocs && !field.isRecognized()) {
                return false;
            }
        }
        return sideAllocGrpBcComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noSideAllocs && !field.isValid()) {
                return false;
            }
        }
        if (!sideAllocGrpBcComp.isValid()) {
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
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!lastPx.isDecoded()) {
            return Optional.of(lastPx);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!transBkdTime.isDecoded()) {
            return Optional.of(transBkdTime);
        }
        if (!settlCurrFxRate.isDecoded()) {
            return Optional.of(settlCurrFxRate);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!packageId.isDecoded()) {
            return Optional.of(packageId);
        }
        if (!tesExecId.isDecoded()) {
            return Optional.of(tesExecId);
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
        if (!noSideAllocs.isDecoded()) {
            return Optional.of(noSideAllocs);
        }
        if (!messageEventSource.isDecoded()) {
            return Optional.of(messageEventSource);
        }
        if (!tradeReportText.isDecoded()) {
            return Optional.of(tradeReportText);
        }
        if (!tradeReportId.isDecoded()) {
            return Optional.of(tradeReportId);
        }
        if (!rootPartyExecutingFirm.isDecoded()) {
            return Optional.of(rootPartyExecutingFirm);
        }
        if (!rootPartyExecutingTrader.isDecoded()) {
            return Optional.of(rootPartyExecutingTrader);
        }
        if (!sideAllocGrpBcComp.isDecoded()) {
            return Optional.of(sideAllocGrpBcComp.failedEntry().flatMap(SideAllocGrpBcCompEntry::failedAt).orElse(noSideAllocs));
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
            case "TransactTime" -> Optional.of(transactTime);
            case "TransBkdTime" -> Optional.of(transBkdTime);
            case "SettlCurrFxRate" -> Optional.of(settlCurrFxRate);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "PackageId" -> Optional.of(packageId);
            case "TesExecId" -> Optional.of(tesExecId);
            case "SettlDate" -> Optional.of(settlDate);
            case "TrdType" -> Optional.of(trdType);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "NoSideAllocs" -> Optional.of(noSideAllocs);
            case "MessageEventSource" -> Optional.of(messageEventSource);
            case "TradeReportText" -> Optional.of(tradeReportText);
            case "TradeReportId" -> Optional.of(tradeReportId);
            case "RootPartyExecutingFirm" -> Optional.of(rootPartyExecutingFirm);
            case "RootPartyExecutingTrader" -> Optional.of(rootPartyExecutingTrader);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TesBroadcast message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(sideAllocGrpBcComp.diffFields(message.sideAllocGrpBcComp));
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
            sideAllocGrpBcComp.toFormattedString(builder, options);
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
        sideAllocGrpBcComp.toFormattedString(builder, nested);
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
        if (!(other instanceof TesBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields) && sideAllocGrpBcComp.equals(message.sideAllocGrpBcComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, sideAllocGrpBcComp);
    }
}
