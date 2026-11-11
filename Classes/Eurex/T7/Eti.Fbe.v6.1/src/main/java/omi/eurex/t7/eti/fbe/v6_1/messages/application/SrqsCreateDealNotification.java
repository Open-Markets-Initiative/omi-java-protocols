package omi.eurex.t7.eti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v6_1.fields.ExpireTimeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FirmNegotiationIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FirmTradeIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FreeTextField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LastPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LastQtyField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MessageEventSourceField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NegotiationIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NoOrderBookItemsField;
import omi.eurex.t7.eti.fbe.v6_1.fields.QuoteIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyEnteringTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SideField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TargetPartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TargetPartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TransactTimeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TrdRptStatusField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingDeltaPercentageField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingEffectiveDeltaPercentageField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingQtyField;
import omi.eurex.t7.eti.fbe.v6_1.groups.OrderBookItemGrpCompEntry;
import omi.eurex.t7.eti.fbe.v6_1.groups.OrderBookItemGrpCompList;
import omi.eurex.t7.eti.fbe.v6_1.structs.RbcHeaderComp;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the SrqsCreateDealNotification message from the Eti protocol.
 */
public final class SrqsCreateDealNotification implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 202;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Srqs Create Deal Notification";

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Quote Id
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Expire Time
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Underlying Px
     */
    private final UnderlyingPxField underlyingPx = new UnderlyingPxField();

    /**
     * Underlying Delta Percentage
     */
    private final UnderlyingDeltaPercentageField underlyingDeltaPercentage = new UnderlyingDeltaPercentageField();

    /**
     * Underlying Effective Delta Percentage
     */
    private final UnderlyingEffectiveDeltaPercentageField underlyingEffectiveDeltaPercentage = new UnderlyingEffectiveDeltaPercentageField();

    /**
     * Underlying Qty
     */
    private final UnderlyingQtyField underlyingQty = new UnderlyingQtyField();

    /**
     * Negotiation Id
     */
    private final NegotiationIdField negotiationId = new NegotiationIdField();

    /**
     * Trade Id
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Last Qty
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Trd Rpt Status
     */
    private final TrdRptStatusField trdRptStatus = new TrdRptStatusField();

    /**
     * Message Event Source
     */
    private final MessageEventSourceField messageEventSource = new MessageEventSourceField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * No Order Book Items
     */
    private final NoOrderBookItemsField noOrderBookItems = new NoOrderBookItemsField();

    /**
     * Root Party Executing Firm
     */
    private final RootPartyExecutingFirmField rootPartyExecutingFirm = new RootPartyExecutingFirmField();

    /**
     * Root Party Executing Trader
     */
    private final RootPartyExecutingTraderField rootPartyExecutingTrader = new RootPartyExecutingTraderField();

    /**
     * Root Party Entering Trader
     */
    private final RootPartyEnteringTraderField rootPartyEnteringTrader = new RootPartyEnteringTraderField();

    /**
     * Target Party Executing Firm
     */
    private final TargetPartyExecutingFirmField targetPartyExecutingFirm = new TargetPartyExecutingFirmField();

    /**
     * Target Party Executing Trader
     */
    private final TargetPartyExecutingTraderField targetPartyExecutingTrader = new TargetPartyExecutingTraderField();

    /**
     * Firm Trade Id
     */
    private final FirmTradeIdField firmTradeId = new FirmTradeIdField();

    /**
     * Firm Negotiation Id
     */
    private final FirmNegotiationIdField firmNegotiationId = new FirmNegotiationIdField();

    /**
     * Free Text
     */
    private final FreeTextField freeText = new FreeTextField();

    /**
     * Order Book Item Grp Comp
     */
    private final OrderBookItemGrpCompList orderBookItemGrpComp = new OrderBookItemGrpCompList();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(transactTime), List.<Field>of(lastPx), List.<Field>of(quoteId), List.<Field>of(securityId), List.<Field>of(expireTime), List.<Field>of(underlyingPx), List.<Field>of(underlyingDeltaPercentage), List.<Field>of(underlyingEffectiveDeltaPercentage), List.<Field>of(underlyingQty), List.<Field>of(negotiationId), List.<Field>of(tradeId), List.<Field>of(lastQty), List.<Field>of(trdRptStatus), List.<Field>of(messageEventSource), List.<Field>of(side), List.<Field>of(noOrderBookItems), List.<Field>of(rootPartyExecutingFirm), List.<Field>of(rootPartyExecutingTrader), List.<Field>of(rootPartyEnteringTrader), List.<Field>of(targetPartyExecutingFirm), List.<Field>of(targetPartyExecutingTrader), List.<Field>of(firmTradeId), List.<Field>of(firmNegotiationId), List.<Field>of(freeText)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Transact Time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
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
     * Quote Id
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
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
     * Expire Time
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
    }

    /**
     * Underlying Px
     *
     * @return the UnderlyingPx field
     */
    public UnderlyingPxField underlyingPx() {
        return underlyingPx;
    }

    /**
     * Underlying Delta Percentage
     *
     * @return the UnderlyingDeltaPercentage field
     */
    public UnderlyingDeltaPercentageField underlyingDeltaPercentage() {
        return underlyingDeltaPercentage;
    }

    /**
     * Underlying Effective Delta Percentage
     *
     * @return the UnderlyingEffectiveDeltaPercentage field
     */
    public UnderlyingEffectiveDeltaPercentageField underlyingEffectiveDeltaPercentage() {
        return underlyingEffectiveDeltaPercentage;
    }

    /**
     * Underlying Qty
     *
     * @return the UnderlyingQty field
     */
    public UnderlyingQtyField underlyingQty() {
        return underlyingQty;
    }

    /**
     * Negotiation Id
     *
     * @return the NegotiationId field
     */
    public NegotiationIdField negotiationId() {
        return negotiationId;
    }

    /**
     * Trade Id
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
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
     * Trd Rpt Status
     *
     * @return the TrdRptStatus field
     */
    public TrdRptStatusField trdRptStatus() {
        return trdRptStatus;
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
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * No Order Book Items
     *
     * @return the NoOrderBookItems field
     */
    public NoOrderBookItemsField noOrderBookItems() {
        return noOrderBookItems;
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
     * Root Party Entering Trader
     *
     * @return the RootPartyEnteringTrader field
     */
    public RootPartyEnteringTraderField rootPartyEnteringTrader() {
        return rootPartyEnteringTrader;
    }

    /**
     * Target Party Executing Firm
     *
     * @return the TargetPartyExecutingFirm field
     */
    public TargetPartyExecutingFirmField targetPartyExecutingFirm() {
        return targetPartyExecutingFirm;
    }

    /**
     * Target Party Executing Trader
     *
     * @return the TargetPartyExecutingTrader field
     */
    public TargetPartyExecutingTraderField targetPartyExecutingTrader() {
        return targetPartyExecutingTrader;
    }

    /**
     * Firm Trade Id
     *
     * @return the FirmTradeId field
     */
    public FirmTradeIdField firmTradeId() {
        return firmTradeId;
    }

    /**
     * Firm Negotiation Id
     *
     * @return the FirmNegotiationId field
     */
    public FirmNegotiationIdField firmNegotiationId() {
        return firmNegotiationId;
    }

    /**
     * Free Text
     *
     * @return the FreeText field
     */
    public FreeTextField freeText() {
        return freeText;
    }

    /**
     * Order Book Item Grp Comp
     *
     * <p>Encode writes this list's size to the NoOrderBookItems field.</p>
     *
     * @return the OrderBookItemGrpComp entries
     */
    public OrderBookItemGrpCompList orderBookItemGrpComp() {
        return orderBookItemGrpComp;
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
        return MINIMUM_BYTE_LENGTH + orderBookItemGrpComp.byteLength();
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
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 5;
        cursor += 6;
        cursor += 6;
        cursor += 5;
        cursor += 6;
        cursor += 20;
        cursor += 20;
        cursor += 12;
        cursor = orderBookItemGrpComp.padding(runs, cursor);
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 168)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!expireTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireTimeField.BYTE_LENGTH;
        if (!underlyingPx.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingPxField.BYTE_LENGTH;
        if (!underlyingDeltaPercentage.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingDeltaPercentageField.BYTE_LENGTH;
        if (!underlyingEffectiveDeltaPercentage.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingEffectiveDeltaPercentageField.BYTE_LENGTH;
        if (!underlyingQty.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingQtyField.BYTE_LENGTH;
        if (!negotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!trdRptStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TrdRptStatusField.BYTE_LENGTH;
        if (!messageEventSource.parse(data, cursor)) {
            return false;
        }
        cursor += MessageEventSourceField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!noOrderBookItems.parse(data, cursor)) {
            return false;
        }
        cursor += NoOrderBookItemsField.BYTE_LENGTH;
        if (!rootPartyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingFirmField.BYTE_LENGTH;
        if (!rootPartyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingTraderField.BYTE_LENGTH;
        if (!rootPartyEnteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyEnteringTraderField.BYTE_LENGTH;
        if (!targetPartyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyExecutingFirmField.BYTE_LENGTH;
        if (!targetPartyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyExecutingTraderField.BYTE_LENGTH;
        if (!firmTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmTradeIdField.BYTE_LENGTH;
        if (!firmNegotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmNegotiationIdField.BYTE_LENGTH;
        if (!freeText.parse(data, cursor)) {
            return false;
        }
        cursor += FreeTextField.BYTE_LENGTH;
        if (!orderBookItemGrpComp.parse(data, cursor, end, noOrderBookItems.value())) {
            return false;
        }
        cursor += orderBookItemGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderBookItemGrpComp.size() > 255) {
            throw new IllegalStateException("orderBookItemGrpComp holds " + orderBookItemGrpComp.size() + " entries, more than its count field can state");
        }
        noOrderBookItems.value((short) orderBookItemGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = quoteId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = expireTime.encode(data, cursor);
        cursor = underlyingPx.encode(data, cursor);
        cursor = underlyingDeltaPercentage.encode(data, cursor);
        cursor = underlyingEffectiveDeltaPercentage.encode(data, cursor);
        cursor = underlyingQty.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = trdRptStatus.encode(data, cursor);
        cursor = messageEventSource.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = noOrderBookItems.encode(data, cursor);
        cursor = rootPartyExecutingFirm.encode(data, cursor);
        cursor = rootPartyExecutingTrader.encode(data, cursor);
        cursor = rootPartyEnteringTrader.encode(data, cursor);
        cursor = targetPartyExecutingFirm.encode(data, cursor);
        cursor = targetPartyExecutingTrader.encode(data, cursor);
        cursor = firmTradeId.encode(data, cursor);
        cursor = firmNegotiationId.encode(data, cursor);
        cursor = freeText.encode(data, cursor);
        cursor = orderBookItemGrpComp.encode(data, cursor);
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
        orderBookItemGrpComp.clear();
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
            if (field != noOrderBookItems && !field.isRecognized()) {
                return false;
            }
        }
        return orderBookItemGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noOrderBookItems && !field.isValid()) {
                return false;
            }
        }
        if (!orderBookItemGrpComp.isValid()) {
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
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!lastPx.isDecoded()) {
            return Optional.of(lastPx);
        }
        if (!quoteId.isDecoded()) {
            return Optional.of(quoteId);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!expireTime.isDecoded()) {
            return Optional.of(expireTime);
        }
        if (!underlyingPx.isDecoded()) {
            return Optional.of(underlyingPx);
        }
        if (!underlyingDeltaPercentage.isDecoded()) {
            return Optional.of(underlyingDeltaPercentage);
        }
        if (!underlyingEffectiveDeltaPercentage.isDecoded()) {
            return Optional.of(underlyingEffectiveDeltaPercentage);
        }
        if (!underlyingQty.isDecoded()) {
            return Optional.of(underlyingQty);
        }
        if (!negotiationId.isDecoded()) {
            return Optional.of(negotiationId);
        }
        if (!tradeId.isDecoded()) {
            return Optional.of(tradeId);
        }
        if (!lastQty.isDecoded()) {
            return Optional.of(lastQty);
        }
        if (!trdRptStatus.isDecoded()) {
            return Optional.of(trdRptStatus);
        }
        if (!messageEventSource.isDecoded()) {
            return Optional.of(messageEventSource);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!noOrderBookItems.isDecoded()) {
            return Optional.of(noOrderBookItems);
        }
        if (!rootPartyExecutingFirm.isDecoded()) {
            return Optional.of(rootPartyExecutingFirm);
        }
        if (!rootPartyExecutingTrader.isDecoded()) {
            return Optional.of(rootPartyExecutingTrader);
        }
        if (!rootPartyEnteringTrader.isDecoded()) {
            return Optional.of(rootPartyEnteringTrader);
        }
        if (!targetPartyExecutingFirm.isDecoded()) {
            return Optional.of(targetPartyExecutingFirm);
        }
        if (!targetPartyExecutingTrader.isDecoded()) {
            return Optional.of(targetPartyExecutingTrader);
        }
        if (!firmTradeId.isDecoded()) {
            return Optional.of(firmTradeId);
        }
        if (!firmNegotiationId.isDecoded()) {
            return Optional.of(firmNegotiationId);
        }
        if (!freeText.isDecoded()) {
            return Optional.of(freeText);
        }
        if (!orderBookItemGrpComp.isDecoded()) {
            return Optional.of(orderBookItemGrpComp.failedEntry().flatMap(OrderBookItemGrpCompEntry::failedAt).orElse(noOrderBookItems));
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
            case "TransactTime" -> Optional.of(transactTime);
            case "LastPx" -> Optional.of(lastPx);
            case "QuoteId" -> Optional.of(quoteId);
            case "SecurityId" -> Optional.of(securityId);
            case "ExpireTime" -> Optional.of(expireTime);
            case "UnderlyingPx" -> Optional.of(underlyingPx);
            case "UnderlyingDeltaPercentage" -> Optional.of(underlyingDeltaPercentage);
            case "UnderlyingEffectiveDeltaPercentage" -> Optional.of(underlyingEffectiveDeltaPercentage);
            case "UnderlyingQty" -> Optional.of(underlyingQty);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "TradeId" -> Optional.of(tradeId);
            case "LastQty" -> Optional.of(lastQty);
            case "TrdRptStatus" -> Optional.of(trdRptStatus);
            case "MessageEventSource" -> Optional.of(messageEventSource);
            case "Side" -> Optional.of(side);
            case "NoOrderBookItems" -> Optional.of(noOrderBookItems);
            case "RootPartyExecutingFirm" -> Optional.of(rootPartyExecutingFirm);
            case "RootPartyExecutingTrader" -> Optional.of(rootPartyExecutingTrader);
            case "RootPartyEnteringTrader" -> Optional.of(rootPartyEnteringTrader);
            case "TargetPartyExecutingFirm" -> Optional.of(targetPartyExecutingFirm);
            case "TargetPartyExecutingTrader" -> Optional.of(targetPartyExecutingTrader);
            case "FirmTradeId" -> Optional.of(firmTradeId);
            case "FirmNegotiationId" -> Optional.of(firmNegotiationId);
            case "FreeText" -> Optional.of(freeText);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SrqsCreateDealNotification message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(orderBookItemGrpComp.diffFields(message.orderBookItemGrpComp));
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
            orderBookItemGrpComp.toFormattedString(builder, options);
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
        orderBookItemGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof SrqsCreateDealNotification message)) {
            return false;
        }
        return fields.equals(message.fields) && orderBookItemGrpComp.equals(message.orderBookItemGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, orderBookItemGrpComp);
    }
}
