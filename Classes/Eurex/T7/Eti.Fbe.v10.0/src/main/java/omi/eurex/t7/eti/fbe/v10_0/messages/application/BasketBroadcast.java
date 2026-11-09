package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.BasketExecIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.BasketProfileIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.BasketTradeReportTextField;
import omi.eurex.t7.eti.fbe.v10_0.fields.BasketTradeReportTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.BasketTrdMatchIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MaturityMonthYearField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MessageEventSourceField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoBasketRootPartyGrpsBcField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoBasketSideAllocField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoInstrmtMatchSidesField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeReportIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeReportTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TransactTimeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TrdTypeField;
import omi.eurex.t7.eti.fbe.v10_0.groups.BasketRootPartyGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.BasketRootPartyGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.groups.BasketSideAllocGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.BasketSideAllocGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.groups.InstrmtMatchSideGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.InstrmtMatchSideGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.RbcHeaderComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the BasketBroadcast message from the Eti protocol.
 */
public final class BasketBroadcast implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 122;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Basket Broadcast";

    /**
     * Basket Trd Match Id
     */
    private final BasketTrdMatchIdField basketTrdMatchId = new BasketTrdMatchIdField();

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Basket Exec Id
     */
    private final BasketExecIdField basketExecId = new BasketExecIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Maturity Month Year
     */
    private final MaturityMonthYearField maturityMonthYear = new MaturityMonthYearField();

    /**
     * Basket Profile Id
     */
    private final BasketProfileIdField basketProfileId = new BasketProfileIdField();

    /**
     * No Basket Side Alloc
     */
    private final NoBasketSideAllocField noBasketSideAlloc = new NoBasketSideAllocField();

    /**
     * Trd Type
     */
    private final TrdTypeField trdType = new TrdTypeField();

    /**
     * Trade Report Type
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * Basket Trade Report Type
     */
    private final BasketTradeReportTypeField basketTradeReportType = new BasketTradeReportTypeField();

    /**
     * Message Event Source
     */
    private final MessageEventSourceField messageEventSource = new MessageEventSourceField();

    /**
     * No Basket Root Party Grps Bc
     */
    private final NoBasketRootPartyGrpsBcField noBasketRootPartyGrpsBc = new NoBasketRootPartyGrpsBcField();

    /**
     * No Instrmt Match Sides
     */
    private final NoInstrmtMatchSidesField noInstrmtMatchSides = new NoInstrmtMatchSidesField();

    /**
     * Basket Trade Report Text
     */
    private final BasketTradeReportTextField basketTradeReportText = new BasketTradeReportTextField();

    /**
     * Trade Report Id
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Basket Root Party Grp Comp
     */
    private final BasketRootPartyGrpCompList basketRootPartyGrpComp = new BasketRootPartyGrpCompList();

    /**
     * Instrmt Match Side Grp Comp
     */
    private final InstrmtMatchSideGrpCompList instrmtMatchSideGrpComp = new InstrmtMatchSideGrpCompList();

    /**
     * Basket Side Alloc Grp Comp
     */
    private final BasketSideAllocGrpCompList basketSideAllocGrpComp = new BasketSideAllocGrpCompList();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(basketTrdMatchId), List.<Field>of(transactTime), List.<Field>of(basketExecId), List.<Field>of(marketSegmentId), List.<Field>of(maturityMonthYear), List.<Field>of(basketProfileId), List.<Field>of(noBasketSideAlloc), List.<Field>of(trdType), List.<Field>of(tradeReportType), List.<Field>of(basketTradeReportType), List.<Field>of(messageEventSource), List.<Field>of(noBasketRootPartyGrpsBc), List.<Field>of(noInstrmtMatchSides), List.<Field>of(basketTradeReportText), List.<Field>of(tradeReportId)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Basket Trd Match Id
     *
     * @return the BasketTrdMatchId field
     */
    public BasketTrdMatchIdField basketTrdMatchId() {
        return basketTrdMatchId;
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
     * Basket Exec Id
     *
     * @return the BasketExecId field
     */
    public BasketExecIdField basketExecId() {
        return basketExecId;
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
     * Maturity Month Year
     *
     * @return the MaturityMonthYear field
     */
    public MaturityMonthYearField maturityMonthYear() {
        return maturityMonthYear;
    }

    /**
     * Basket Profile Id
     *
     * @return the BasketProfileId field
     */
    public BasketProfileIdField basketProfileId() {
        return basketProfileId;
    }

    /**
     * No Basket Side Alloc
     *
     * @return the NoBasketSideAlloc field
     */
    public NoBasketSideAllocField noBasketSideAlloc() {
        return noBasketSideAlloc;
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
     * Basket Trade Report Type
     *
     * @return the BasketTradeReportType field
     */
    public BasketTradeReportTypeField basketTradeReportType() {
        return basketTradeReportType;
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
     * No Basket Root Party Grps Bc
     *
     * @return the NoBasketRootPartyGrpsBc field
     */
    public NoBasketRootPartyGrpsBcField noBasketRootPartyGrpsBc() {
        return noBasketRootPartyGrpsBc;
    }

    /**
     * No Instrmt Match Sides
     *
     * @return the NoInstrmtMatchSides field
     */
    public NoInstrmtMatchSidesField noInstrmtMatchSides() {
        return noInstrmtMatchSides;
    }

    /**
     * Basket Trade Report Text
     *
     * @return the BasketTradeReportText field
     */
    public BasketTradeReportTextField basketTradeReportText() {
        return basketTradeReportText;
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
     * Basket Root Party Grp Comp
     *
     * <p>Encode writes this list's size to the NoBasketRootPartyGrpsBc field.</p>
     *
     * @return the BasketRootPartyGrpComp entries
     */
    public BasketRootPartyGrpCompList basketRootPartyGrpComp() {
        return basketRootPartyGrpComp;
    }

    /**
     * Instrmt Match Side Grp Comp
     *
     * <p>Encode writes this list's size to the NoInstrmtMatchSides field.</p>
     *
     * @return the InstrmtMatchSideGrpComp entries
     */
    public InstrmtMatchSideGrpCompList instrmtMatchSideGrpComp() {
        return instrmtMatchSideGrpComp;
    }

    /**
     * Basket Side Alloc Grp Comp
     *
     * <p>Encode writes this list's size to the NoBasketSideAlloc field.</p>
     *
     * @return the BasketSideAllocGrpComp entries
     */
    public BasketSideAllocGrpCompList basketSideAllocGrpComp() {
        return basketSideAllocGrpComp;
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
        return MINIMUM_BYTE_LENGTH + basketRootPartyGrpComp.byteLength() + instrmtMatchSideGrpComp.byteLength() + basketSideAllocGrpComp.byteLength();
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
        cursor += 20;
        cursor += 20;
        runs.add(cursor).add(7);
        cursor += 7;
        cursor = basketRootPartyGrpComp.padding(runs, cursor);
        cursor = instrmtMatchSideGrpComp.padding(runs, cursor);
        cursor = basketSideAllocGrpComp.padding(runs, cursor);
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 88)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!basketTrdMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += BasketTrdMatchIdField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!basketExecId.parse(data, cursor)) {
            return false;
        }
        cursor += BasketExecIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!maturityMonthYear.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityMonthYearField.BYTE_LENGTH;
        if (!basketProfileId.parse(data, cursor)) {
            return false;
        }
        cursor += BasketProfileIdField.BYTE_LENGTH;
        if (!noBasketSideAlloc.parse(data, cursor)) {
            return false;
        }
        cursor += NoBasketSideAllocField.BYTE_LENGTH;
        if (!trdType.parse(data, cursor)) {
            return false;
        }
        cursor += TrdTypeField.BYTE_LENGTH;
        if (!tradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTypeField.BYTE_LENGTH;
        if (!basketTradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += BasketTradeReportTypeField.BYTE_LENGTH;
        if (!messageEventSource.parse(data, cursor)) {
            return false;
        }
        cursor += MessageEventSourceField.BYTE_LENGTH;
        if (!noBasketRootPartyGrpsBc.parse(data, cursor)) {
            return false;
        }
        cursor += NoBasketRootPartyGrpsBcField.BYTE_LENGTH;
        if (!noInstrmtMatchSides.parse(data, cursor)) {
            return false;
        }
        cursor += NoInstrmtMatchSidesField.BYTE_LENGTH;
        if (!basketTradeReportText.parse(data, cursor)) {
            return false;
        }
        cursor += BasketTradeReportTextField.BYTE_LENGTH;
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        cursor += 7; // padding
        if (!basketRootPartyGrpComp.parse(data, cursor, end, noBasketRootPartyGrpsBc.value())) {
            return false;
        }
        cursor += basketRootPartyGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!instrmtMatchSideGrpComp.parse(data, cursor, end, noInstrmtMatchSides.value())) {
            return false;
        }
        cursor += instrmtMatchSideGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!basketSideAllocGrpComp.parse(data, cursor, end, noBasketSideAlloc.value())) {
            return false;
        }
        cursor += basketSideAllocGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (basketRootPartyGrpComp.size() > 255) {
            throw new IllegalStateException("basketRootPartyGrpComp holds " + basketRootPartyGrpComp.size() + " entries, more than its count field can state");
        }
        if (instrmtMatchSideGrpComp.size() > 255) {
            throw new IllegalStateException("instrmtMatchSideGrpComp holds " + instrmtMatchSideGrpComp.size() + " entries, more than its count field can state");
        }
        if (basketSideAllocGrpComp.size() > 65535) {
            throw new IllegalStateException("basketSideAllocGrpComp holds " + basketSideAllocGrpComp.size() + " entries, more than its count field can state");
        }
        noBasketRootPartyGrpsBc.value((short) basketRootPartyGrpComp.size());
        noInstrmtMatchSides.value((short) instrmtMatchSideGrpComp.size());
        noBasketSideAlloc.value(basketSideAllocGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = basketTrdMatchId.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = basketExecId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = maturityMonthYear.encode(data, cursor);
        cursor = basketProfileId.encode(data, cursor);
        cursor = noBasketSideAlloc.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = basketTradeReportType.encode(data, cursor);
        cursor = messageEventSource.encode(data, cursor);
        cursor = noBasketRootPartyGrpsBc.encode(data, cursor);
        cursor = noInstrmtMatchSides.encode(data, cursor);
        cursor = basketTradeReportText.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        if (buffer != null && buffer.length >= 115 + 7) {
            System.arraycopy(buffer, 115, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
        cursor = basketRootPartyGrpComp.encode(data, cursor);
        cursor = instrmtMatchSideGrpComp.encode(data, cursor);
        cursor = basketSideAllocGrpComp.encode(data, cursor);
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
        basketRootPartyGrpComp.clear();
        instrmtMatchSideGrpComp.clear();
        basketSideAllocGrpComp.clear();
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
            if (field != noBasketRootPartyGrpsBc && field != noInstrmtMatchSides && field != noBasketSideAlloc && !field.isRecognized()) {
                return false;
            }
        }
        if (!basketRootPartyGrpComp.isRecognized()) {
            return false;
        }
        if (!instrmtMatchSideGrpComp.isRecognized()) {
            return false;
        }
        if (!basketSideAllocGrpComp.isRecognized()) {
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
            if (field != noBasketRootPartyGrpsBc && field != noInstrmtMatchSides && field != noBasketSideAlloc && !field.isValid()) {
                return false;
            }
        }
        if (!basketRootPartyGrpComp.isValid()) {
            return false;
        }
        if (!instrmtMatchSideGrpComp.isValid()) {
            return false;
        }
        if (!basketSideAllocGrpComp.isValid()) {
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
        if (!basketTrdMatchId.isDecoded()) {
            return Optional.of(basketTrdMatchId);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!basketExecId.isDecoded()) {
            return Optional.of(basketExecId);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!maturityMonthYear.isDecoded()) {
            return Optional.of(maturityMonthYear);
        }
        if (!basketProfileId.isDecoded()) {
            return Optional.of(basketProfileId);
        }
        if (!noBasketSideAlloc.isDecoded()) {
            return Optional.of(noBasketSideAlloc);
        }
        if (!trdType.isDecoded()) {
            return Optional.of(trdType);
        }
        if (!tradeReportType.isDecoded()) {
            return Optional.of(tradeReportType);
        }
        if (!basketTradeReportType.isDecoded()) {
            return Optional.of(basketTradeReportType);
        }
        if (!messageEventSource.isDecoded()) {
            return Optional.of(messageEventSource);
        }
        if (!noBasketRootPartyGrpsBc.isDecoded()) {
            return Optional.of(noBasketRootPartyGrpsBc);
        }
        if (!noInstrmtMatchSides.isDecoded()) {
            return Optional.of(noInstrmtMatchSides);
        }
        if (!basketTradeReportText.isDecoded()) {
            return Optional.of(basketTradeReportText);
        }
        if (!tradeReportId.isDecoded()) {
            return Optional.of(tradeReportId);
        }
        if (!basketRootPartyGrpComp.isDecoded()) {
            return Optional.of(basketRootPartyGrpComp.failedEntry().flatMap(BasketRootPartyGrpCompEntry::failedAt).orElse(noBasketRootPartyGrpsBc));
        }
        if (!instrmtMatchSideGrpComp.isDecoded()) {
            return Optional.of(instrmtMatchSideGrpComp.failedEntry().flatMap(InstrmtMatchSideGrpCompEntry::failedAt).orElse(noInstrmtMatchSides));
        }
        if (!basketSideAllocGrpComp.isDecoded()) {
            return Optional.of(basketSideAllocGrpComp.failedEntry().flatMap(BasketSideAllocGrpCompEntry::failedAt).orElse(noBasketSideAlloc));
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
            case "BasketTrdMatchId" -> Optional.of(basketTrdMatchId);
            case "TransactTime" -> Optional.of(transactTime);
            case "BasketExecId" -> Optional.of(basketExecId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "MaturityMonthYear" -> Optional.of(maturityMonthYear);
            case "BasketProfileId" -> Optional.of(basketProfileId);
            case "NoBasketSideAlloc" -> Optional.of(noBasketSideAlloc);
            case "TrdType" -> Optional.of(trdType);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "BasketTradeReportType" -> Optional.of(basketTradeReportType);
            case "MessageEventSource" -> Optional.of(messageEventSource);
            case "NoBasketRootPartyGrpsBc" -> Optional.of(noBasketRootPartyGrpsBc);
            case "NoInstrmtMatchSides" -> Optional.of(noInstrmtMatchSides);
            case "BasketTradeReportText" -> Optional.of(basketTradeReportText);
            case "TradeReportId" -> Optional.of(tradeReportId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BasketBroadcast message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(basketRootPartyGrpComp.diffFields(message.basketRootPartyGrpComp));
        changed.addAll(instrmtMatchSideGrpComp.diffFields(message.instrmtMatchSideGrpComp));
        changed.addAll(basketSideAllocGrpComp.diffFields(message.basketSideAllocGrpComp));
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
            basketRootPartyGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            instrmtMatchSideGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            basketSideAllocGrpComp.toFormattedString(builder, options);
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
        basketRootPartyGrpComp.toFormattedString(builder, nested);
        instrmtMatchSideGrpComp.toFormattedString(builder, nested);
        basketSideAllocGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof BasketBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields) && basketRootPartyGrpComp.equals(message.basketRootPartyGrpComp) && instrmtMatchSideGrpComp.equals(message.instrmtMatchSideGrpComp) && basketSideAllocGrpComp.equals(message.basketSideAllocGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, basketRootPartyGrpComp, instrmtMatchSideGrpComp, basketSideAllocGrpComp);
    }
}
