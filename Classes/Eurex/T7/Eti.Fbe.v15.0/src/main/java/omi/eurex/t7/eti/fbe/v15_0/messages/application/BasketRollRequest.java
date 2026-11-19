package omi.eurex.t7.eti.fbe.v15_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v15_0.fields.BasketProfileIdField;
import omi.eurex.t7.eti.fbe.v15_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v15_0.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v15_0.fields.NoBasketRootPartyGrpsField;
import omi.eurex.t7.eti.fbe.v15_0.fields.NoNewBasketInstrmtMatchSidesField;
import omi.eurex.t7.eti.fbe.v15_0.fields.NoNewBasketSideAllocField;
import omi.eurex.t7.eti.fbe.v15_0.fields.NoOldBasketInstrmtMatchSidesField;
import omi.eurex.t7.eti.fbe.v15_0.fields.NoOldBasketSideAllocField;
import omi.eurex.t7.eti.fbe.v15_0.fields.TradeReportIdField;
import omi.eurex.t7.eti.fbe.v15_0.fields.TradeReportTypeField;
import omi.eurex.t7.eti.fbe.v15_0.fields.TrdTypeField;
import omi.eurex.t7.eti.fbe.v15_0.groups.BasketRootPartyGrpCompEntry;
import omi.eurex.t7.eti.fbe.v15_0.groups.BasketRootPartyGrpCompList;
import omi.eurex.t7.eti.fbe.v15_0.groups.NewBasketInstrmtMatchSideGrpCompEntry;
import omi.eurex.t7.eti.fbe.v15_0.groups.NewBasketInstrmtMatchSideGrpCompList;
import omi.eurex.t7.eti.fbe.v15_0.groups.NewBasketSideAllocGrpCompEntry;
import omi.eurex.t7.eti.fbe.v15_0.groups.NewBasketSideAllocGrpCompList;
import omi.eurex.t7.eti.fbe.v15_0.groups.OldBasketInstrmtMatchSideGrpCompEntry;
import omi.eurex.t7.eti.fbe.v15_0.groups.OldBasketInstrmtMatchSideGrpCompList;
import omi.eurex.t7.eti.fbe.v15_0.groups.OldBasketSideAllocGrpCompEntry;
import omi.eurex.t7.eti.fbe.v15_0.groups.OldBasketSideAllocGrpCompList;
import omi.eurex.t7.eti.fbe.v15_0.structs.NewBasketDataGrpComp;
import omi.eurex.t7.eti.fbe.v15_0.structs.OldBasketDataGrpComp;
import omi.eurex.t7.eti.fbe.v15_0.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v15_0.types.Field;
import omi.eurex.t7.eti.fbe.v15_0.types.Message;
import omi.eurex.t7.eti.fbe.v15_0.types.PrintOptions;

/**
 * Represents the BasketRollRequest message from the Eti protocol.
 */
public final class BasketRollRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 170;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Basket Roll Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Basket Profile Id
     */
    private final BasketProfileIdField basketProfileId = new BasketProfileIdField();

    /**
     * Trd Type
     */
    private final TrdTypeField trdType = new TrdTypeField();

    /**
     * No Old Basket Side Alloc
     */
    private final NoOldBasketSideAllocField noOldBasketSideAlloc = new NoOldBasketSideAllocField();

    /**
     * No New Basket Side Alloc
     */
    private final NoNewBasketSideAllocField noNewBasketSideAlloc = new NoNewBasketSideAllocField();

    /**
     * Trade Report Type
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * No Basket Root Party Grps
     */
    private final NoBasketRootPartyGrpsField noBasketRootPartyGrps = new NoBasketRootPartyGrpsField();

    /**
     * No Old Basket Instrmt Match Sides
     */
    private final NoOldBasketInstrmtMatchSidesField noOldBasketInstrmtMatchSides = new NoOldBasketInstrmtMatchSidesField();

    /**
     * No New Basket Instrmt Match Sides
     */
    private final NoNewBasketInstrmtMatchSidesField noNewBasketInstrmtMatchSides = new NoNewBasketInstrmtMatchSidesField();

    /**
     * Trade Report Id
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Basket Root Party Grp Comp
     */
    private final BasketRootPartyGrpCompList basketRootPartyGrpComp = new BasketRootPartyGrpCompList();

    /**
     * Old Basket Instrmt Match Side Grp Comp
     */
    private final OldBasketInstrmtMatchSideGrpCompList oldBasketInstrmtMatchSideGrpComp = new OldBasketInstrmtMatchSideGrpCompList();

    /**
     * New Basket Instrmt Match Side Grp Comp
     */
    private final NewBasketInstrmtMatchSideGrpCompList newBasketInstrmtMatchSideGrpComp = new NewBasketInstrmtMatchSideGrpCompList();

    /**
     * Old Basket Side Alloc Grp Comp
     */
    private final OldBasketSideAllocGrpCompList oldBasketSideAllocGrpComp = new OldBasketSideAllocGrpCompList();

    /**
     * New Basket Side Alloc Grp Comp
     */
    private final NewBasketSideAllocGrpCompList newBasketSideAllocGrpComp = new NewBasketSideAllocGrpCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * Old Basket Data Grp Comp
     */
    private final OldBasketDataGrpComp oldBasketDataGrpComp = new OldBasketDataGrpComp();

    /**
     * New Basket Data Grp Comp
     */
    private final NewBasketDataGrpComp newBasketDataGrpComp = new NewBasketDataGrpComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(marketSegmentId), List.<Field>of(basketProfileId), List.<Field>of(trdType), List.<Field>of(noOldBasketSideAlloc), List.<Field>of(noNewBasketSideAlloc), List.<Field>of(tradeReportType), List.<Field>of(noBasketRootPartyGrps), List.<Field>of(noOldBasketInstrmtMatchSides), List.<Field>of(noNewBasketInstrmtMatchSides), List.<Field>of(tradeReportId), oldBasketDataGrpComp.fields(), newBasketDataGrpComp.fields()).flatMap(List::stream).toList();

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
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
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
     * Trd Type
     *
     * @return the TrdType field
     */
    public TrdTypeField trdType() {
        return trdType;
    }

    /**
     * No Old Basket Side Alloc
     *
     * @return the NoOldBasketSideAlloc field
     */
    public NoOldBasketSideAllocField noOldBasketSideAlloc() {
        return noOldBasketSideAlloc;
    }

    /**
     * No New Basket Side Alloc
     *
     * @return the NoNewBasketSideAlloc field
     */
    public NoNewBasketSideAllocField noNewBasketSideAlloc() {
        return noNewBasketSideAlloc;
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
     * No Basket Root Party Grps
     *
     * @return the NoBasketRootPartyGrps field
     */
    public NoBasketRootPartyGrpsField noBasketRootPartyGrps() {
        return noBasketRootPartyGrps;
    }

    /**
     * No Old Basket Instrmt Match Sides
     *
     * @return the NoOldBasketInstrmtMatchSides field
     */
    public NoOldBasketInstrmtMatchSidesField noOldBasketInstrmtMatchSides() {
        return noOldBasketInstrmtMatchSides;
    }

    /**
     * No New Basket Instrmt Match Sides
     *
     * @return the NoNewBasketInstrmtMatchSides field
     */
    public NoNewBasketInstrmtMatchSidesField noNewBasketInstrmtMatchSides() {
        return noNewBasketInstrmtMatchSides;
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
     * <p>Encode writes this list's size to the NoBasketRootPartyGrps field.</p>
     *
     * @return the BasketRootPartyGrpComp entries
     */
    public BasketRootPartyGrpCompList basketRootPartyGrpComp() {
        return basketRootPartyGrpComp;
    }

    /**
     * Old Basket Instrmt Match Side Grp Comp
     *
     * <p>Encode writes this list's size to the NoOldBasketInstrmtMatchSides field.</p>
     *
     * @return the OldBasketInstrmtMatchSideGrpComp entries
     */
    public OldBasketInstrmtMatchSideGrpCompList oldBasketInstrmtMatchSideGrpComp() {
        return oldBasketInstrmtMatchSideGrpComp;
    }

    /**
     * New Basket Instrmt Match Side Grp Comp
     *
     * <p>Encode writes this list's size to the NoNewBasketInstrmtMatchSides field.</p>
     *
     * @return the NewBasketInstrmtMatchSideGrpComp entries
     */
    public NewBasketInstrmtMatchSideGrpCompList newBasketInstrmtMatchSideGrpComp() {
        return newBasketInstrmtMatchSideGrpComp;
    }

    /**
     * Old Basket Side Alloc Grp Comp
     *
     * <p>Encode writes this list's size to the NoOldBasketSideAlloc field.</p>
     *
     * @return the OldBasketSideAllocGrpComp entries
     */
    public OldBasketSideAllocGrpCompList oldBasketSideAllocGrpComp() {
        return oldBasketSideAllocGrpComp;
    }

    /**
     * New Basket Side Alloc Grp Comp
     *
     * <p>Encode writes this list's size to the NoNewBasketSideAlloc field.</p>
     *
     * @return the NewBasketSideAllocGrpComp entries
     */
    public NewBasketSideAllocGrpCompList newBasketSideAllocGrpComp() {
        return newBasketSideAllocGrpComp;
    }

    /**
     * Request Header Comp
     *
     * @return the RequestHeaderComp record
     */
    public RequestHeaderComp requestHeaderComp() {
        return requestHeaderComp;
    }

    /**
     * Old Basket Data Grp Comp
     *
     * @return the OldBasketDataGrpComp record
     */
    public OldBasketDataGrpComp oldBasketDataGrpComp() {
        return oldBasketDataGrpComp;
    }

    /**
     * New Basket Data Grp Comp
     *
     * @return the NewBasketDataGrpComp record
     */
    public NewBasketDataGrpComp newBasketDataGrpComp() {
        return newBasketDataGrpComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + basketRootPartyGrpComp.byteLength() + oldBasketInstrmtMatchSideGrpComp.byteLength() + newBasketInstrmtMatchSideGrpComp.byteLength() + oldBasketSideAllocGrpComp.byteLength() + newBasketSideAllocGrpComp.byteLength();
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
        cursor += 8;
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = RequestHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RequestHeaderComp.BYTE_LENGTH;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 2;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 20;
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = OldBasketDataGrpComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += OldBasketDataGrpComp.BYTE_LENGTH;
        for (int[] run = NewBasketDataGrpComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += NewBasketDataGrpComp.BYTE_LENGTH;
        cursor = basketRootPartyGrpComp.padding(runs, cursor);
        cursor = oldBasketInstrmtMatchSideGrpComp.padding(runs, cursor);
        cursor = newBasketInstrmtMatchSideGrpComp.padding(runs, cursor);
        cursor = oldBasketSideAllocGrpComp.padding(runs, cursor);
        cursor = newBasketSideAllocGrpComp.padding(runs, cursor);
        return cursor;
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!networkMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += NetworkMsgIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 152)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!basketProfileId.parse(data, cursor)) {
            return false;
        }
        cursor += BasketProfileIdField.BYTE_LENGTH;
        if (!trdType.parse(data, cursor)) {
            return false;
        }
        cursor += TrdTypeField.BYTE_LENGTH;
        if (!noOldBasketSideAlloc.parse(data, cursor)) {
            return false;
        }
        cursor += NoOldBasketSideAllocField.BYTE_LENGTH;
        if (!noNewBasketSideAlloc.parse(data, cursor)) {
            return false;
        }
        cursor += NoNewBasketSideAllocField.BYTE_LENGTH;
        if (!tradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTypeField.BYTE_LENGTH;
        if (!noBasketRootPartyGrps.parse(data, cursor)) {
            return false;
        }
        cursor += NoBasketRootPartyGrpsField.BYTE_LENGTH;
        if (!noOldBasketInstrmtMatchSides.parse(data, cursor)) {
            return false;
        }
        cursor += NoOldBasketInstrmtMatchSidesField.BYTE_LENGTH;
        if (!noNewBasketInstrmtMatchSides.parse(data, cursor)) {
            return false;
        }
        cursor += NoNewBasketInstrmtMatchSidesField.BYTE_LENGTH;
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!oldBasketDataGrpComp.parseFrom(data, cursor, end - 48)) {
            return false;
        }
        cursor += oldBasketDataGrpComp.byteLength();
        if (!newBasketDataGrpComp.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += newBasketDataGrpComp.byteLength();
        if (!basketRootPartyGrpComp.parse(data, cursor, end, noBasketRootPartyGrps.value())) {
            return false;
        }
        cursor += basketRootPartyGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!oldBasketInstrmtMatchSideGrpComp.parse(data, cursor, end, noOldBasketInstrmtMatchSides.value())) {
            return false;
        }
        cursor += oldBasketInstrmtMatchSideGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!newBasketInstrmtMatchSideGrpComp.parse(data, cursor, end, noNewBasketInstrmtMatchSides.value())) {
            return false;
        }
        cursor += newBasketInstrmtMatchSideGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!oldBasketSideAllocGrpComp.parse(data, cursor, end, noOldBasketSideAlloc.value())) {
            return false;
        }
        cursor += oldBasketSideAllocGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!newBasketSideAllocGrpComp.parse(data, cursor, end, noNewBasketSideAlloc.value())) {
            return false;
        }
        cursor += newBasketSideAllocGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (basketRootPartyGrpComp.size() > 255) {
            throw new IllegalStateException("basketRootPartyGrpComp holds " + basketRootPartyGrpComp.size() + " entries, more than its count field can state");
        }
        if (oldBasketInstrmtMatchSideGrpComp.size() > 255) {
            throw new IllegalStateException("oldBasketInstrmtMatchSideGrpComp holds " + oldBasketInstrmtMatchSideGrpComp.size() + " entries, more than its count field can state");
        }
        if (newBasketInstrmtMatchSideGrpComp.size() > 255) {
            throw new IllegalStateException("newBasketInstrmtMatchSideGrpComp holds " + newBasketInstrmtMatchSideGrpComp.size() + " entries, more than its count field can state");
        }
        if (oldBasketSideAllocGrpComp.size() > 65535) {
            throw new IllegalStateException("oldBasketSideAllocGrpComp holds " + oldBasketSideAllocGrpComp.size() + " entries, more than its count field can state");
        }
        if (newBasketSideAllocGrpComp.size() > 65535) {
            throw new IllegalStateException("newBasketSideAllocGrpComp holds " + newBasketSideAllocGrpComp.size() + " entries, more than its count field can state");
        }
        noBasketRootPartyGrps.value((short) basketRootPartyGrpComp.size());
        noOldBasketInstrmtMatchSides.value((short) oldBasketInstrmtMatchSideGrpComp.size());
        noNewBasketInstrmtMatchSides.value((short) newBasketInstrmtMatchSideGrpComp.size());
        noOldBasketSideAlloc.value(oldBasketSideAllocGrpComp.size());
        noNewBasketSideAlloc.value(newBasketSideAllocGrpComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = basketProfileId.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = noOldBasketSideAlloc.encode(data, cursor);
        cursor = noNewBasketSideAlloc.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = noBasketRootPartyGrps.encode(data, cursor);
        cursor = noOldBasketInstrmtMatchSides.encode(data, cursor);
        cursor = noNewBasketInstrmtMatchSides.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        if (buffer != null && buffer.length >= 58) {
            System.arraycopy(buffer, 56, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = oldBasketDataGrpComp.encode(data, cursor);
        cursor = newBasketDataGrpComp.encode(data, cursor);
        cursor = basketRootPartyGrpComp.encode(data, cursor);
        cursor = oldBasketInstrmtMatchSideGrpComp.encode(data, cursor);
        cursor = newBasketInstrmtMatchSideGrpComp.encode(data, cursor);
        cursor = oldBasketSideAllocGrpComp.encode(data, cursor);
        cursor = newBasketSideAllocGrpComp.encode(data, cursor);
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
        requestHeaderComp.clear();
        oldBasketDataGrpComp.clear();
        newBasketDataGrpComp.clear();
        basketRootPartyGrpComp.clear();
        oldBasketInstrmtMatchSideGrpComp.clear();
        newBasketInstrmtMatchSideGrpComp.clear();
        oldBasketSideAllocGrpComp.clear();
        newBasketSideAllocGrpComp.clear();
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
            if (field != noBasketRootPartyGrps && field != noOldBasketInstrmtMatchSides && field != noNewBasketInstrmtMatchSides && field != noOldBasketSideAlloc && field != noNewBasketSideAlloc && !field.isRecognized()) {
                return false;
            }
        }
        if (!basketRootPartyGrpComp.isRecognized()) {
            return false;
        }
        if (!oldBasketInstrmtMatchSideGrpComp.isRecognized()) {
            return false;
        }
        if (!newBasketInstrmtMatchSideGrpComp.isRecognized()) {
            return false;
        }
        if (!oldBasketSideAllocGrpComp.isRecognized()) {
            return false;
        }
        return newBasketSideAllocGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noBasketRootPartyGrps && field != noOldBasketInstrmtMatchSides && field != noNewBasketInstrmtMatchSides && field != noOldBasketSideAlloc && field != noNewBasketSideAlloc && !field.isValid()) {
                return false;
            }
        }
        if (!basketRootPartyGrpComp.isValid()) {
            return false;
        }
        if (!oldBasketInstrmtMatchSideGrpComp.isValid()) {
            return false;
        }
        if (!newBasketInstrmtMatchSideGrpComp.isValid()) {
            return false;
        }
        if (!oldBasketSideAllocGrpComp.isValid()) {
            return false;
        }
        if (!newBasketSideAllocGrpComp.isValid()) {
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
        if (!networkMsgId.isDecoded()) {
            return Optional.of(networkMsgId);
        }
        if (!requestHeaderComp.isDecoded()) {
            return requestHeaderComp.failedAt();
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!basketProfileId.isDecoded()) {
            return Optional.of(basketProfileId);
        }
        if (!trdType.isDecoded()) {
            return Optional.of(trdType);
        }
        if (!noOldBasketSideAlloc.isDecoded()) {
            return Optional.of(noOldBasketSideAlloc);
        }
        if (!noNewBasketSideAlloc.isDecoded()) {
            return Optional.of(noNewBasketSideAlloc);
        }
        if (!tradeReportType.isDecoded()) {
            return Optional.of(tradeReportType);
        }
        if (!noBasketRootPartyGrps.isDecoded()) {
            return Optional.of(noBasketRootPartyGrps);
        }
        if (!noOldBasketInstrmtMatchSides.isDecoded()) {
            return Optional.of(noOldBasketInstrmtMatchSides);
        }
        if (!noNewBasketInstrmtMatchSides.isDecoded()) {
            return Optional.of(noNewBasketInstrmtMatchSides);
        }
        if (!tradeReportId.isDecoded()) {
            return Optional.of(tradeReportId);
        }
        if (!oldBasketDataGrpComp.isDecoded()) {
            return oldBasketDataGrpComp.failedAt();
        }
        if (!newBasketDataGrpComp.isDecoded()) {
            return newBasketDataGrpComp.failedAt();
        }
        if (!basketRootPartyGrpComp.isDecoded()) {
            return Optional.of(basketRootPartyGrpComp.failedEntry().flatMap(BasketRootPartyGrpCompEntry::failedAt).orElse(noBasketRootPartyGrps));
        }
        if (!oldBasketInstrmtMatchSideGrpComp.isDecoded()) {
            return Optional.of(oldBasketInstrmtMatchSideGrpComp.failedEntry().flatMap(OldBasketInstrmtMatchSideGrpCompEntry::failedAt).orElse(noOldBasketInstrmtMatchSides));
        }
        if (!newBasketInstrmtMatchSideGrpComp.isDecoded()) {
            return Optional.of(newBasketInstrmtMatchSideGrpComp.failedEntry().flatMap(NewBasketInstrmtMatchSideGrpCompEntry::failedAt).orElse(noNewBasketInstrmtMatchSides));
        }
        if (!oldBasketSideAllocGrpComp.isDecoded()) {
            return Optional.of(oldBasketSideAllocGrpComp.failedEntry().flatMap(OldBasketSideAllocGrpCompEntry::failedAt).orElse(noOldBasketSideAlloc));
        }
        if (!newBasketSideAllocGrpComp.isDecoded()) {
            return Optional.of(newBasketSideAllocGrpComp.failedEntry().flatMap(NewBasketSideAllocGrpCompEntry::failedAt).orElse(noNewBasketSideAlloc));
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
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "BasketProfileId" -> Optional.of(basketProfileId);
            case "TrdType" -> Optional.of(trdType);
            case "NoOldBasketSideAlloc" -> Optional.of(noOldBasketSideAlloc);
            case "NoNewBasketSideAlloc" -> Optional.of(noNewBasketSideAlloc);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "NoBasketRootPartyGrps" -> Optional.of(noBasketRootPartyGrps);
            case "NoOldBasketInstrmtMatchSides" -> Optional.of(noOldBasketInstrmtMatchSides);
            case "NoNewBasketInstrmtMatchSides" -> Optional.of(noNewBasketInstrmtMatchSides);
            case "TradeReportId" -> Optional.of(tradeReportId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BasketRollRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(basketRootPartyGrpComp.diffFields(message.basketRootPartyGrpComp));
        changed.addAll(oldBasketInstrmtMatchSideGrpComp.diffFields(message.oldBasketInstrmtMatchSideGrpComp));
        changed.addAll(newBasketInstrmtMatchSideGrpComp.diffFields(message.newBasketInstrmtMatchSideGrpComp));
        changed.addAll(oldBasketSideAllocGrpComp.diffFields(message.oldBasketSideAllocGrpComp));
        changed.addAll(newBasketSideAllocGrpComp.diffFields(message.newBasketSideAllocGrpComp));
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
            oldBasketInstrmtMatchSideGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            newBasketInstrmtMatchSideGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            oldBasketSideAllocGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            newBasketSideAllocGrpComp.toFormattedString(builder, options);
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
        oldBasketInstrmtMatchSideGrpComp.toFormattedString(builder, nested);
        newBasketInstrmtMatchSideGrpComp.toFormattedString(builder, nested);
        oldBasketSideAllocGrpComp.toFormattedString(builder, nested);
        newBasketSideAllocGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof BasketRollRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && basketRootPartyGrpComp.equals(message.basketRootPartyGrpComp) && oldBasketInstrmtMatchSideGrpComp.equals(message.oldBasketInstrmtMatchSideGrpComp) && newBasketInstrmtMatchSideGrpComp.equals(message.newBasketInstrmtMatchSideGrpComp) && oldBasketSideAllocGrpComp.equals(message.oldBasketSideAllocGrpComp) && newBasketSideAllocGrpComp.equals(message.newBasketSideAllocGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, basketRootPartyGrpComp, oldBasketInstrmtMatchSideGrpComp, newBasketInstrmtMatchSideGrpComp, oldBasketSideAllocGrpComp, newBasketSideAllocGrpComp);
    }
}
