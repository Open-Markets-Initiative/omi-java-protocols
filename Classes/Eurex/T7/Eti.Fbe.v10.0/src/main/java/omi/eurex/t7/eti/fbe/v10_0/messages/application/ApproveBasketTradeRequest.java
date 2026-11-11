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
import omi.eurex.t7.eti.fbe.v10_0.fields.BasketSideTradeReportIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.BasketTradeReportTextField;
import omi.eurex.t7.eti.fbe.v10_0.fields.BasketTrdMatchIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoBasketSideAllocField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartySubIdTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeReportIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeReportTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TrdTypeField;
import omi.eurex.t7.eti.fbe.v10_0.groups.BasketSideAllocExtGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.BasketSideAllocExtGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the ApproveBasketTradeRequest message from the Eti protocol.
 */
public final class ApproveBasketTradeRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 106;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Approve Basket Trade Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Basket Trd Match Id
     */
    private final BasketTrdMatchIdField basketTrdMatchId = new BasketTrdMatchIdField();

    /**
     * Basket Exec Id
     */
    private final BasketExecIdField basketExecId = new BasketExecIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Root Party Sub Id Type
     */
    private final RootPartySubIdTypeField rootPartySubIdType = new RootPartySubIdTypeField();

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
     * Basket Trade Report Text
     */
    private final BasketTradeReportTextField basketTradeReportText = new BasketTradeReportTextField();

    /**
     * Trade Report Id
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Basket Side Trade Report Id
     */
    private final BasketSideTradeReportIdField basketSideTradeReportId = new BasketSideTradeReportIdField();

    /**
     * Basket Side Alloc Ext Grp Comp
     */
    private final BasketSideAllocExtGrpCompList basketSideAllocExtGrpComp = new BasketSideAllocExtGrpCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(basketTrdMatchId), List.<Field>of(basketExecId), List.<Field>of(marketSegmentId), List.<Field>of(rootPartySubIdType), List.<Field>of(noBasketSideAlloc), List.<Field>of(trdType), List.<Field>of(tradeReportType), List.<Field>of(basketTradeReportText), List.<Field>of(tradeReportId), List.<Field>of(basketSideTradeReportId)).flatMap(List::stream).toList();

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
     * Basket Trd Match Id
     *
     * @return the BasketTrdMatchId field
     */
    public BasketTrdMatchIdField basketTrdMatchId() {
        return basketTrdMatchId;
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
     * Root Party Sub Id Type
     *
     * @return the RootPartySubIdType field
     */
    public RootPartySubIdTypeField rootPartySubIdType() {
        return rootPartySubIdType;
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
     * Basket Side Trade Report Id
     *
     * @return the BasketSideTradeReportId field
     */
    public BasketSideTradeReportIdField basketSideTradeReportId() {
        return basketSideTradeReportId;
    }

    /**
     * Basket Side Alloc Ext Grp Comp
     *
     * <p>Encode writes this list's size to the NoBasketSideAlloc field.</p>
     *
     * @return the BasketSideAllocExtGrpComp entries
     */
    public BasketSideAllocExtGrpCompList basketSideAllocExtGrpComp() {
        return basketSideAllocExtGrpComp;
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
        return MINIMUM_BYTE_LENGTH + basketSideAllocExtGrpComp.byteLength();
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
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 2;
        cursor += 2;
        cursor += 1;
        cursor += 20;
        cursor += 20;
        cursor += 20;
        runs.add(cursor).add(5);
        cursor += 5;
        cursor = basketSideAllocExtGrpComp.padding(runs, cursor);
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
        if (!requestHeaderComp.parseFrom(data, cursor, end - 88)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!basketTrdMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += BasketTrdMatchIdField.BYTE_LENGTH;
        if (!basketExecId.parse(data, cursor)) {
            return false;
        }
        cursor += BasketExecIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!rootPartySubIdType.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartySubIdTypeField.BYTE_LENGTH;
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
        if (!basketTradeReportText.parse(data, cursor)) {
            return false;
        }
        cursor += BasketTradeReportTextField.BYTE_LENGTH;
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        if (!basketSideTradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += BasketSideTradeReportIdField.BYTE_LENGTH;
        cursor += 5; // padding
        if (!basketSideAllocExtGrpComp.parse(data, cursor, end, noBasketSideAlloc.value())) {
            return false;
        }
        cursor += basketSideAllocExtGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (basketSideAllocExtGrpComp.size() > 65535) {
            throw new IllegalStateException("basketSideAllocExtGrpComp holds " + basketSideAllocExtGrpComp.size() + " entries, more than its count field can state");
        }
        noBasketSideAlloc.value(basketSideAllocExtGrpComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = basketTrdMatchId.encode(data, cursor);
        cursor = basketExecId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = rootPartySubIdType.encode(data, cursor);
        cursor = noBasketSideAlloc.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = basketTradeReportText.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        cursor = basketSideTradeReportId.encode(data, cursor);
        if (buffer != null && buffer.length >= 106) {
            System.arraycopy(buffer, 101, data, cursor, 5); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 5, (byte) 0); // padding
        }
        cursor += 5;
        cursor = basketSideAllocExtGrpComp.encode(data, cursor);
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
        basketSideAllocExtGrpComp.clear();
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
            if (field != noBasketSideAlloc && !field.isRecognized()) {
                return false;
            }
        }
        return basketSideAllocExtGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noBasketSideAlloc && !field.isValid()) {
                return false;
            }
        }
        if (!basketSideAllocExtGrpComp.isValid()) {
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
        if (!basketTrdMatchId.isDecoded()) {
            return Optional.of(basketTrdMatchId);
        }
        if (!basketExecId.isDecoded()) {
            return Optional.of(basketExecId);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!rootPartySubIdType.isDecoded()) {
            return Optional.of(rootPartySubIdType);
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
        if (!basketTradeReportText.isDecoded()) {
            return Optional.of(basketTradeReportText);
        }
        if (!tradeReportId.isDecoded()) {
            return Optional.of(tradeReportId);
        }
        if (!basketSideTradeReportId.isDecoded()) {
            return Optional.of(basketSideTradeReportId);
        }
        if (!basketSideAllocExtGrpComp.isDecoded()) {
            return Optional.of(basketSideAllocExtGrpComp.failedEntry().flatMap(BasketSideAllocExtGrpCompEntry::failedAt).orElse(noBasketSideAlloc));
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
            case "BasketTrdMatchId" -> Optional.of(basketTrdMatchId);
            case "BasketExecId" -> Optional.of(basketExecId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "RootPartySubIdType" -> Optional.of(rootPartySubIdType);
            case "NoBasketSideAlloc" -> Optional.of(noBasketSideAlloc);
            case "TrdType" -> Optional.of(trdType);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "BasketTradeReportText" -> Optional.of(basketTradeReportText);
            case "TradeReportId" -> Optional.of(tradeReportId);
            case "BasketSideTradeReportId" -> Optional.of(basketSideTradeReportId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ApproveBasketTradeRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(basketSideAllocExtGrpComp.diffFields(message.basketSideAllocExtGrpComp));
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
            basketSideAllocExtGrpComp.toFormattedString(builder, options);
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
        basketSideAllocExtGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof ApproveBasketTradeRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && basketSideAllocExtGrpComp.equals(message.basketSideAllocExtGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, basketSideAllocExtGrpComp);
    }
}
