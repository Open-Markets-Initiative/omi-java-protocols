package omi.eurex.t7.eti.fbe.v13_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v13_0.fields.BasketAnonymityField;
import omi.eurex.t7.eti.fbe.v13_0.fields.BasketExecIdField;
import omi.eurex.t7.eti.fbe.v13_0.fields.BasketProfileIdField;
import omi.eurex.t7.eti.fbe.v13_0.fields.BasketTradeReportTextField;
import omi.eurex.t7.eti.fbe.v13_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v13_0.fields.MessageEventSourceField;
import omi.eurex.t7.eti.fbe.v13_0.fields.NoBasketRootPartyGrpsBcField;
import omi.eurex.t7.eti.fbe.v13_0.fields.NoNewBasketInstrmtMatchSidesField;
import omi.eurex.t7.eti.fbe.v13_0.fields.NoNewBasketSideAllocField;
import omi.eurex.t7.eti.fbe.v13_0.fields.NoOldBasketInstrmtMatchSidesField;
import omi.eurex.t7.eti.fbe.v13_0.fields.NoOldBasketSideAllocField;
import omi.eurex.t7.eti.fbe.v13_0.fields.TradeReportIdField;
import omi.eurex.t7.eti.fbe.v13_0.fields.TradeReportTypeField;
import omi.eurex.t7.eti.fbe.v13_0.fields.TrdTypeField;
import omi.eurex.t7.eti.fbe.v13_0.groups.BasketRootPartyGrpCompEntry;
import omi.eurex.t7.eti.fbe.v13_0.groups.BasketRootPartyGrpCompList;
import omi.eurex.t7.eti.fbe.v13_0.groups.NewBasketInstrmtMatchSideGrpCompEntry;
import omi.eurex.t7.eti.fbe.v13_0.groups.NewBasketInstrmtMatchSideGrpCompList;
import omi.eurex.t7.eti.fbe.v13_0.groups.NewBasketSideAllocGrpCompEntry;
import omi.eurex.t7.eti.fbe.v13_0.groups.NewBasketSideAllocGrpCompList;
import omi.eurex.t7.eti.fbe.v13_0.groups.OldBasketInstrmtMatchSideGrpCompEntry;
import omi.eurex.t7.eti.fbe.v13_0.groups.OldBasketInstrmtMatchSideGrpCompList;
import omi.eurex.t7.eti.fbe.v13_0.groups.OldBasketSideAllocGrpCompEntry;
import omi.eurex.t7.eti.fbe.v13_0.groups.OldBasketSideAllocGrpCompList;
import omi.eurex.t7.eti.fbe.v13_0.structs.NewBasketDataBcGrpComp;
import omi.eurex.t7.eti.fbe.v13_0.structs.OldBasketDataBcGrpComp;
import omi.eurex.t7.eti.fbe.v13_0.structs.RbcHeaderComp;
import omi.eurex.t7.eti.fbe.v13_0.types.Field;
import omi.eurex.t7.eti.fbe.v13_0.types.Message;
import omi.eurex.t7.eti.fbe.v13_0.types.PrintOptions;

/**
 * Represents the BasketRollBroadcast message from the Eti protocol.
 */
public final class BasketRollBroadcast implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 250;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Basket Roll Broadcast";

    /**
     * Basket Exec Id
     */
    private final BasketExecIdField basketExecId = new BasketExecIdField();

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
     * Trade Report Type
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * Message Event Source
     */
    private final MessageEventSourceField messageEventSource = new MessageEventSourceField();

    /**
     * No Basket Root Party Grps Bc
     */
    private final NoBasketRootPartyGrpsBcField noBasketRootPartyGrpsBc = new NoBasketRootPartyGrpsBcField();

    /**
     * No Old Basket Instrmt Match Sides
     */
    private final NoOldBasketInstrmtMatchSidesField noOldBasketInstrmtMatchSides = new NoOldBasketInstrmtMatchSidesField();

    /**
     * No New Basket Instrmt Match Sides
     */
    private final NoNewBasketInstrmtMatchSidesField noNewBasketInstrmtMatchSides = new NoNewBasketInstrmtMatchSidesField();

    /**
     * No Old Basket Side Alloc
     */
    private final NoOldBasketSideAllocField noOldBasketSideAlloc = new NoOldBasketSideAllocField();

    /**
     * No New Basket Side Alloc
     */
    private final NoNewBasketSideAllocField noNewBasketSideAlloc = new NoNewBasketSideAllocField();

    /**
     * Basket Anonymity
     */
    private final BasketAnonymityField basketAnonymity = new BasketAnonymityField();

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
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * Old Basket Data Bc Grp Comp
     */
    private final OldBasketDataBcGrpComp oldBasketDataBcGrpComp = new OldBasketDataBcGrpComp();

    /**
     * New Basket Data Bc Grp Comp
     */
    private final NewBasketDataBcGrpComp newBasketDataBcGrpComp = new NewBasketDataBcGrpComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(basketExecId), List.<Field>of(marketSegmentId), List.<Field>of(basketProfileId), List.<Field>of(trdType), List.<Field>of(tradeReportType), List.<Field>of(messageEventSource), List.<Field>of(noBasketRootPartyGrpsBc), List.<Field>of(noOldBasketInstrmtMatchSides), List.<Field>of(noNewBasketInstrmtMatchSides), List.<Field>of(noOldBasketSideAlloc), List.<Field>of(noNewBasketSideAlloc), List.<Field>of(basketAnonymity), List.<Field>of(basketTradeReportText), List.<Field>of(tradeReportId), oldBasketDataBcGrpComp.fields(), newBasketDataBcGrpComp.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

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
     * Trade Report Type
     *
     * @return the TradeReportType field
     */
    public TradeReportTypeField tradeReportType() {
        return tradeReportType;
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
     * Basket Anonymity
     *
     * @return the BasketAnonymity field
     */
    public BasketAnonymityField basketAnonymity() {
        return basketAnonymity;
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
     * Rbc Header Comp
     *
     * @return the RbcHeaderComp record
     */
    public RbcHeaderComp rbcHeaderComp() {
        return rbcHeaderComp;
    }

    /**
     * Old Basket Data Bc Grp Comp
     *
     * @return the OldBasketDataBcGrpComp record
     */
    public OldBasketDataBcGrpComp oldBasketDataBcGrpComp() {
        return oldBasketDataBcGrpComp;
    }

    /**
     * New Basket Data Bc Grp Comp
     *
     * @return the NewBasketDataBcGrpComp record
     */
    public NewBasketDataBcGrpComp newBasketDataBcGrpComp() {
        return newBasketDataBcGrpComp;
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
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = RbcHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RbcHeaderComp.BYTE_LENGTH;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 2;
        cursor += 2;
        cursor += 1;
        cursor += 20;
        cursor += 20;
        runs.add(cursor).add(7);
        cursor += 7;
        cursor = basketRootPartyGrpComp.padding(runs, cursor);
        for (int[] run = OldBasketDataBcGrpComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += OldBasketDataBcGrpComp.BYTE_LENGTH;
        for (int[] run = NewBasketDataBcGrpComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += NewBasketDataBcGrpComp.BYTE_LENGTH;
        cursor = oldBasketInstrmtMatchSideGrpComp.padding(runs, cursor);
        cursor = newBasketInstrmtMatchSideGrpComp.padding(runs, cursor);
        cursor = oldBasketSideAllocGrpComp.padding(runs, cursor);
        cursor = newBasketSideAllocGrpComp.padding(runs, cursor);
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 216)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!basketExecId.parse(data, cursor)) {
            return false;
        }
        cursor += BasketExecIdField.BYTE_LENGTH;
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
        if (!tradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTypeField.BYTE_LENGTH;
        if (!messageEventSource.parse(data, cursor)) {
            return false;
        }
        cursor += MessageEventSourceField.BYTE_LENGTH;
        if (!noBasketRootPartyGrpsBc.parse(data, cursor)) {
            return false;
        }
        cursor += NoBasketRootPartyGrpsBcField.BYTE_LENGTH;
        if (!noOldBasketInstrmtMatchSides.parse(data, cursor)) {
            return false;
        }
        cursor += NoOldBasketInstrmtMatchSidesField.BYTE_LENGTH;
        if (!noNewBasketInstrmtMatchSides.parse(data, cursor)) {
            return false;
        }
        cursor += NoNewBasketInstrmtMatchSidesField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!noOldBasketSideAlloc.parse(data, cursor)) {
            return false;
        }
        cursor += NoOldBasketSideAllocField.BYTE_LENGTH;
        if (!noNewBasketSideAlloc.parse(data, cursor)) {
            return false;
        }
        cursor += NoNewBasketSideAllocField.BYTE_LENGTH;
        if (!basketAnonymity.parse(data, cursor)) {
            return false;
        }
        cursor += BasketAnonymityField.BYTE_LENGTH;
        if (!basketTradeReportText.parse(data, cursor)) {
            return false;
        }
        cursor += BasketTradeReportTextField.BYTE_LENGTH;
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        cursor += 7; // padding
        if (!basketRootPartyGrpComp.parse(data, cursor, end - 144, noBasketRootPartyGrpsBc.value())) {
            return false;
        }
        cursor += basketRootPartyGrpComp.byteLength();
        if (end - cursor < 144) {
            return false;
        }
        if (!oldBasketDataBcGrpComp.parseFrom(data, cursor, end - 72)) {
            return false;
        }
        cursor += oldBasketDataBcGrpComp.byteLength();
        if (!newBasketDataBcGrpComp.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += newBasketDataBcGrpComp.byteLength();
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
        noBasketRootPartyGrpsBc.value((short) basketRootPartyGrpComp.size());
        noOldBasketInstrmtMatchSides.value((short) oldBasketInstrmtMatchSideGrpComp.size());
        noNewBasketInstrmtMatchSides.value((short) newBasketInstrmtMatchSideGrpComp.size());
        noOldBasketSideAlloc.value(oldBasketSideAllocGrpComp.size());
        noNewBasketSideAlloc.value(newBasketSideAllocGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = basketExecId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = basketProfileId.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = messageEventSource.encode(data, cursor);
        cursor = noBasketRootPartyGrpsBc.encode(data, cursor);
        cursor = noOldBasketInstrmtMatchSides.encode(data, cursor);
        cursor = noNewBasketInstrmtMatchSides.encode(data, cursor);
        if (buffer != null && buffer.length >= 54) {
            System.arraycopy(buffer, 53, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = noOldBasketSideAlloc.encode(data, cursor);
        cursor = noNewBasketSideAlloc.encode(data, cursor);
        cursor = basketAnonymity.encode(data, cursor);
        cursor = basketTradeReportText.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        if (buffer != null && buffer.length >= 106) {
            System.arraycopy(buffer, 99, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
        cursor = basketRootPartyGrpComp.encode(data, cursor);
        cursor = oldBasketDataBcGrpComp.encode(data, cursor);
        cursor = newBasketDataBcGrpComp.encode(data, cursor);
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
        rbcHeaderComp.clear();
        basketRootPartyGrpComp.clear();
        oldBasketDataBcGrpComp.clear();
        newBasketDataBcGrpComp.clear();
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
            if (field != noBasketRootPartyGrpsBc && field != noOldBasketInstrmtMatchSides && field != noNewBasketInstrmtMatchSides && field != noOldBasketSideAlloc && field != noNewBasketSideAlloc && !field.isRecognized()) {
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
            if (field != noBasketRootPartyGrpsBc && field != noOldBasketInstrmtMatchSides && field != noNewBasketInstrmtMatchSides && field != noOldBasketSideAlloc && field != noNewBasketSideAlloc && !field.isValid()) {
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
        if (!rbcHeaderComp.isDecoded()) {
            return rbcHeaderComp.failedAt();
        }
        if (!basketExecId.isDecoded()) {
            return Optional.of(basketExecId);
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
        if (!tradeReportType.isDecoded()) {
            return Optional.of(tradeReportType);
        }
        if (!messageEventSource.isDecoded()) {
            return Optional.of(messageEventSource);
        }
        if (!noBasketRootPartyGrpsBc.isDecoded()) {
            return Optional.of(noBasketRootPartyGrpsBc);
        }
        if (!noOldBasketInstrmtMatchSides.isDecoded()) {
            return Optional.of(noOldBasketInstrmtMatchSides);
        }
        if (!noNewBasketInstrmtMatchSides.isDecoded()) {
            return Optional.of(noNewBasketInstrmtMatchSides);
        }
        if (!noOldBasketSideAlloc.isDecoded()) {
            return Optional.of(noOldBasketSideAlloc);
        }
        if (!noNewBasketSideAlloc.isDecoded()) {
            return Optional.of(noNewBasketSideAlloc);
        }
        if (!basketAnonymity.isDecoded()) {
            return Optional.of(basketAnonymity);
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
        if (!oldBasketDataBcGrpComp.isDecoded()) {
            return oldBasketDataBcGrpComp.failedAt();
        }
        if (!newBasketDataBcGrpComp.isDecoded()) {
            return newBasketDataBcGrpComp.failedAt();
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
            case "BasketExecId" -> Optional.of(basketExecId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "BasketProfileId" -> Optional.of(basketProfileId);
            case "TrdType" -> Optional.of(trdType);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "MessageEventSource" -> Optional.of(messageEventSource);
            case "NoBasketRootPartyGrpsBc" -> Optional.of(noBasketRootPartyGrpsBc);
            case "NoOldBasketInstrmtMatchSides" -> Optional.of(noOldBasketInstrmtMatchSides);
            case "NoNewBasketInstrmtMatchSides" -> Optional.of(noNewBasketInstrmtMatchSides);
            case "NoOldBasketSideAlloc" -> Optional.of(noOldBasketSideAlloc);
            case "NoNewBasketSideAlloc" -> Optional.of(noNewBasketSideAlloc);
            case "BasketAnonymity" -> Optional.of(basketAnonymity);
            case "BasketTradeReportText" -> Optional.of(basketTradeReportText);
            case "TradeReportId" -> Optional.of(tradeReportId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BasketRollBroadcast message)) {
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
        if (!(other instanceof BasketRollBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields) && basketRootPartyGrpComp.equals(message.basketRootPartyGrpComp) && oldBasketInstrmtMatchSideGrpComp.equals(message.oldBasketInstrmtMatchSideGrpComp) && newBasketInstrmtMatchSideGrpComp.equals(message.newBasketInstrmtMatchSideGrpComp) && oldBasketSideAllocGrpComp.equals(message.oldBasketSideAllocGrpComp) && newBasketSideAllocGrpComp.equals(message.newBasketSideAllocGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, basketRootPartyGrpComp, oldBasketInstrmtMatchSideGrpComp, newBasketInstrmtMatchSideGrpComp, oldBasketSideAllocGrpComp, newBasketSideAllocGrpComp);
    }
}
