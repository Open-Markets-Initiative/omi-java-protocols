package omi.eurex.t7.eti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v6_1.fields.BidPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FirmNegotiationIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LastPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LastQtyField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NegotiateUnderlyingField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NegotiationIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NoLegsField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NoTargetPartyIDsField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NumberOfRespDisclosureInstructionField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NumberOfRespondentsField;
import omi.eurex.t7.eti.fbe.v6_1.fields.OfferPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.OrderQtyField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyEnteringTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ProductComplexField;
import omi.eurex.t7.eti.fbe.v6_1.fields.QuoteRefPriceField;
import omi.eurex.t7.eti.fbe.v6_1.fields.QuoteRefPriceSourceField;
import omi.eurex.t7.eti.fbe.v6_1.fields.QuoteStatusField;
import omi.eurex.t7.eti.fbe.v6_1.fields.QuoteTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SecuritySubTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SideField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeUnderlyingField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TransactTimeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingDeltaPercentageField;
import omi.eurex.t7.eti.fbe.v6_1.groups.QuotReqLegsGrpCompEntry;
import omi.eurex.t7.eti.fbe.v6_1.groups.QuotReqLegsGrpCompList;
import omi.eurex.t7.eti.fbe.v6_1.groups.TargetPartiesCompEntry;
import omi.eurex.t7.eti.fbe.v6_1.groups.TargetPartiesCompList;
import omi.eurex.t7.eti.fbe.v6_1.structs.RbcHeaderComp;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the SrqsOpenNegotiationRequesterNotification message from the Eti protocol.
 */
public final class SrqsOpenNegotiationRequesterNotification implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 162;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Srqs Open Negotiation Requester Notification";

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Bid Px
     */
    private final BidPxField bidPx = new BidPxField();

    /**
     * Offer Px
     */
    private final OfferPxField offerPx = new OfferPxField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Quote Ref Price
     */
    private final QuoteRefPriceField quoteRefPrice = new QuoteRefPriceField();

    /**
     * Underlying Delta Percentage
     */
    private final UnderlyingDeltaPercentageField underlyingDeltaPercentage = new UnderlyingDeltaPercentageField();

    /**
     * Negotiation Id
     */
    private final NegotiationIdField negotiationId = new NegotiationIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Order Qty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Last Qty
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Security Sub Type
     */
    private final SecuritySubTypeField securitySubType = new SecuritySubTypeField();

    /**
     * Number Of Respondents
     */
    private final NumberOfRespondentsField numberOfRespondents = new NumberOfRespondentsField();

    /**
     * Quote Type
     */
    private final QuoteTypeField quoteType = new QuoteTypeField();

    /**
     * Quote Status
     */
    private final QuoteStatusField quoteStatus = new QuoteStatusField();

    /**
     * No Legs
     */
    private final NoLegsField noLegs = new NoLegsField();

    /**
     * No Target Party I Ds
     */
    private final NoTargetPartyIDsField noTargetPartyIDs = new NoTargetPartyIDsField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Quote Ref Price Source
     */
    private final QuoteRefPriceSourceField quoteRefPriceSource = new QuoteRefPriceSourceField();

    /**
     * Trade Underlying
     */
    private final TradeUnderlyingField tradeUnderlying = new TradeUnderlyingField();

    /**
     * Negotiate Underlying
     */
    private final NegotiateUnderlyingField negotiateUnderlying = new NegotiateUnderlyingField();

    /**
     * Product Complex
     */
    private final ProductComplexField productComplex = new ProductComplexField();

    /**
     * Number Of Resp Disclosure Instruction
     */
    private final NumberOfRespDisclosureInstructionField numberOfRespDisclosureInstruction = new NumberOfRespDisclosureInstructionField();

    /**
     * Party Executing Firm
     */
    private final PartyExecutingFirmField partyExecutingFirm = new PartyExecutingFirmField();

    /**
     * Party Executing Trader
     */
    private final PartyExecutingTraderField partyExecutingTrader = new PartyExecutingTraderField();

    /**
     * Party Entering Trader
     */
    private final PartyEnteringTraderField partyEnteringTrader = new PartyEnteringTraderField();

    /**
     * Firm Negotiation Id
     */
    private final FirmNegotiationIdField firmNegotiationId = new FirmNegotiationIdField();

    /**
     * Quot Req Legs Grp Comp
     */
    private final QuotReqLegsGrpCompList quotReqLegsGrpComp = new QuotReqLegsGrpCompList();

    /**
     * Target Parties Comp
     */
    private final TargetPartiesCompList targetPartiesComp = new TargetPartiesCompList();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(transactTime), List.<Field>of(securityId), List.<Field>of(bidPx), List.<Field>of(offerPx), List.<Field>of(lastPx), List.<Field>of(quoteRefPrice), List.<Field>of(underlyingDeltaPercentage), List.<Field>of(negotiationId), List.<Field>of(marketSegmentId), List.<Field>of(orderQty), List.<Field>of(lastQty), List.<Field>of(securitySubType), List.<Field>of(numberOfRespondents), List.<Field>of(quoteType), List.<Field>of(quoteStatus), List.<Field>of(noLegs), List.<Field>of(noTargetPartyIDs), List.<Field>of(side), List.<Field>of(quoteRefPriceSource), List.<Field>of(tradeUnderlying), List.<Field>of(negotiateUnderlying), List.<Field>of(productComplex), List.<Field>of(numberOfRespDisclosureInstruction), List.<Field>of(partyExecutingFirm), List.<Field>of(partyExecutingTrader), List.<Field>of(partyEnteringTrader), List.<Field>of(firmNegotiationId)).flatMap(List::stream).toList();

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
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Bid Px
     *
     * @return the BidPx field
     */
    public BidPxField bidPx() {
        return bidPx;
    }

    /**
     * Offer Px
     *
     * @return the OfferPx field
     */
    public OfferPxField offerPx() {
        return offerPx;
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
     * Quote Ref Price
     *
     * @return the QuoteRefPrice field
     */
    public QuoteRefPriceField quoteRefPrice() {
        return quoteRefPrice;
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
     * Negotiation Id
     *
     * @return the NegotiationId field
     */
    public NegotiationIdField negotiationId() {
        return negotiationId;
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
     * Order Qty
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
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
     * Security Sub Type
     *
     * @return the SecuritySubType field
     */
    public SecuritySubTypeField securitySubType() {
        return securitySubType;
    }

    /**
     * Number Of Respondents
     *
     * @return the NumberOfRespondents field
     */
    public NumberOfRespondentsField numberOfRespondents() {
        return numberOfRespondents;
    }

    /**
     * Quote Type
     *
     * @return the QuoteType field
     */
    public QuoteTypeField quoteType() {
        return quoteType;
    }

    /**
     * Quote Status
     *
     * @return the QuoteStatus field
     */
    public QuoteStatusField quoteStatus() {
        return quoteStatus;
    }

    /**
     * No Legs
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
    }

    /**
     * No Target Party I Ds
     *
     * @return the NoTargetPartyIDs field
     */
    public NoTargetPartyIDsField noTargetPartyIDs() {
        return noTargetPartyIDs;
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
     * Quote Ref Price Source
     *
     * @return the QuoteRefPriceSource field
     */
    public QuoteRefPriceSourceField quoteRefPriceSource() {
        return quoteRefPriceSource;
    }

    /**
     * Trade Underlying
     *
     * @return the TradeUnderlying field
     */
    public TradeUnderlyingField tradeUnderlying() {
        return tradeUnderlying;
    }

    /**
     * Negotiate Underlying
     *
     * @return the NegotiateUnderlying field
     */
    public NegotiateUnderlyingField negotiateUnderlying() {
        return negotiateUnderlying;
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
     * Number Of Resp Disclosure Instruction
     *
     * @return the NumberOfRespDisclosureInstruction field
     */
    public NumberOfRespDisclosureInstructionField numberOfRespDisclosureInstruction() {
        return numberOfRespDisclosureInstruction;
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
     * Party Entering Trader
     *
     * @return the PartyEnteringTrader field
     */
    public PartyEnteringTraderField partyEnteringTrader() {
        return partyEnteringTrader;
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
     * Quot Req Legs Grp Comp
     *
     * <p>Encode writes this list's size to the NoLegs field.</p>
     *
     * @return the QuotReqLegsGrpComp entries
     */
    public QuotReqLegsGrpCompList quotReqLegsGrpComp() {
        return quotReqLegsGrpComp;
    }

    /**
     * Target Parties Comp
     *
     * <p>Encode writes this list's size to the NoTargetPartyIDs field.</p>
     *
     * @return the TargetPartiesComp entries
     */
    public TargetPartiesCompList targetPartiesComp() {
        return targetPartiesComp;
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
        return MINIMUM_BYTE_LENGTH + quotReqLegsGrpComp.byteLength() + targetPartiesComp.byteLength();
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
        cursor += 4;
        cursor += 4;
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
        cursor += 5;
        cursor += 6;
        cursor += 6;
        cursor += 20;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor = quotReqLegsGrpComp.padding(runs, cursor);
        cursor = targetPartiesComp.padding(runs, cursor);
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 128)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!bidPx.parse(data, cursor)) {
            return false;
        }
        cursor += BidPxField.BYTE_LENGTH;
        if (!offerPx.parse(data, cursor)) {
            return false;
        }
        cursor += OfferPxField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!quoteRefPrice.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteRefPriceField.BYTE_LENGTH;
        if (!underlyingDeltaPercentage.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingDeltaPercentageField.BYTE_LENGTH;
        if (!negotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!securitySubType.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySubTypeField.BYTE_LENGTH;
        if (!numberOfRespondents.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfRespondentsField.BYTE_LENGTH;
        if (!quoteType.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteTypeField.BYTE_LENGTH;
        if (!quoteStatus.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteStatusField.BYTE_LENGTH;
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        if (!noTargetPartyIDs.parse(data, cursor)) {
            return false;
        }
        cursor += NoTargetPartyIDsField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!quoteRefPriceSource.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteRefPriceSourceField.BYTE_LENGTH;
        if (!tradeUnderlying.parse(data, cursor)) {
            return false;
        }
        cursor += TradeUnderlyingField.BYTE_LENGTH;
        if (!negotiateUnderlying.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiateUnderlyingField.BYTE_LENGTH;
        if (!productComplex.parse(data, cursor)) {
            return false;
        }
        cursor += ProductComplexField.BYTE_LENGTH;
        if (!numberOfRespDisclosureInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfRespDisclosureInstructionField.BYTE_LENGTH;
        if (!partyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingFirmField.BYTE_LENGTH;
        if (!partyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingTraderField.BYTE_LENGTH;
        if (!partyEnteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyEnteringTraderField.BYTE_LENGTH;
        if (!firmNegotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmNegotiationIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!quotReqLegsGrpComp.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += quotReqLegsGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!targetPartiesComp.parse(data, cursor, end, noTargetPartyIDs.value())) {
            return false;
        }
        cursor += targetPartiesComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (quotReqLegsGrpComp.size() > 255) {
            throw new IllegalStateException("quotReqLegsGrpComp holds " + quotReqLegsGrpComp.size() + " entries, more than its count field can state");
        }
        if (targetPartiesComp.size() > 255) {
            throw new IllegalStateException("targetPartiesComp holds " + targetPartiesComp.size() + " entries, more than its count field can state");
        }
        noLegs.value((short) quotReqLegsGrpComp.size());
        noTargetPartyIDs.value((short) targetPartiesComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = bidPx.encode(data, cursor);
        cursor = offerPx.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = quoteRefPrice.encode(data, cursor);
        cursor = underlyingDeltaPercentage.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = securitySubType.encode(data, cursor);
        cursor = numberOfRespondents.encode(data, cursor);
        cursor = quoteType.encode(data, cursor);
        cursor = quoteStatus.encode(data, cursor);
        cursor = noLegs.encode(data, cursor);
        cursor = noTargetPartyIDs.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = quoteRefPriceSource.encode(data, cursor);
        cursor = tradeUnderlying.encode(data, cursor);
        cursor = negotiateUnderlying.encode(data, cursor);
        cursor = productComplex.encode(data, cursor);
        cursor = numberOfRespDisclosureInstruction.encode(data, cursor);
        cursor = partyExecutingFirm.encode(data, cursor);
        cursor = partyExecutingTrader.encode(data, cursor);
        cursor = partyEnteringTrader.encode(data, cursor);
        cursor = firmNegotiationId.encode(data, cursor);
        if (buffer != null && buffer.length >= 161 + 1) {
            System.arraycopy(buffer, 161, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = quotReqLegsGrpComp.encode(data, cursor);
        cursor = targetPartiesComp.encode(data, cursor);
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
        quotReqLegsGrpComp.clear();
        targetPartiesComp.clear();
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
            if (field != noLegs && field != noTargetPartyIDs && !field.isRecognized()) {
                return false;
            }
        }
        if (!quotReqLegsGrpComp.isRecognized()) {
            return false;
        }
        if (!targetPartiesComp.isRecognized()) {
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
            if (field != noLegs && field != noTargetPartyIDs && !field.isValid()) {
                return false;
            }
        }
        if (!quotReqLegsGrpComp.isValid()) {
            return false;
        }
        if (!targetPartiesComp.isValid()) {
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
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!bidPx.isDecoded()) {
            return Optional.of(bidPx);
        }
        if (!offerPx.isDecoded()) {
            return Optional.of(offerPx);
        }
        if (!lastPx.isDecoded()) {
            return Optional.of(lastPx);
        }
        if (!quoteRefPrice.isDecoded()) {
            return Optional.of(quoteRefPrice);
        }
        if (!underlyingDeltaPercentage.isDecoded()) {
            return Optional.of(underlyingDeltaPercentage);
        }
        if (!negotiationId.isDecoded()) {
            return Optional.of(negotiationId);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!lastQty.isDecoded()) {
            return Optional.of(lastQty);
        }
        if (!securitySubType.isDecoded()) {
            return Optional.of(securitySubType);
        }
        if (!numberOfRespondents.isDecoded()) {
            return Optional.of(numberOfRespondents);
        }
        if (!quoteType.isDecoded()) {
            return Optional.of(quoteType);
        }
        if (!quoteStatus.isDecoded()) {
            return Optional.of(quoteStatus);
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!noTargetPartyIDs.isDecoded()) {
            return Optional.of(noTargetPartyIDs);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!quoteRefPriceSource.isDecoded()) {
            return Optional.of(quoteRefPriceSource);
        }
        if (!tradeUnderlying.isDecoded()) {
            return Optional.of(tradeUnderlying);
        }
        if (!negotiateUnderlying.isDecoded()) {
            return Optional.of(negotiateUnderlying);
        }
        if (!productComplex.isDecoded()) {
            return Optional.of(productComplex);
        }
        if (!numberOfRespDisclosureInstruction.isDecoded()) {
            return Optional.of(numberOfRespDisclosureInstruction);
        }
        if (!partyExecutingFirm.isDecoded()) {
            return Optional.of(partyExecutingFirm);
        }
        if (!partyExecutingTrader.isDecoded()) {
            return Optional.of(partyExecutingTrader);
        }
        if (!partyEnteringTrader.isDecoded()) {
            return Optional.of(partyEnteringTrader);
        }
        if (!firmNegotiationId.isDecoded()) {
            return Optional.of(firmNegotiationId);
        }
        if (!quotReqLegsGrpComp.isDecoded()) {
            return Optional.of(quotReqLegsGrpComp.failedEntry().flatMap(QuotReqLegsGrpCompEntry::failedAt).orElse(noLegs));
        }
        if (!targetPartiesComp.isDecoded()) {
            return Optional.of(targetPartiesComp.failedEntry().flatMap(TargetPartiesCompEntry::failedAt).orElse(noTargetPartyIDs));
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
            case "SecurityId" -> Optional.of(securityId);
            case "BidPx" -> Optional.of(bidPx);
            case "OfferPx" -> Optional.of(offerPx);
            case "LastPx" -> Optional.of(lastPx);
            case "QuoteRefPrice" -> Optional.of(quoteRefPrice);
            case "UnderlyingDeltaPercentage" -> Optional.of(underlyingDeltaPercentage);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "OrderQty" -> Optional.of(orderQty);
            case "LastQty" -> Optional.of(lastQty);
            case "SecuritySubType" -> Optional.of(securitySubType);
            case "NumberOfRespondents" -> Optional.of(numberOfRespondents);
            case "QuoteType" -> Optional.of(quoteType);
            case "QuoteStatus" -> Optional.of(quoteStatus);
            case "NoLegs" -> Optional.of(noLegs);
            case "NoTargetPartyIDs" -> Optional.of(noTargetPartyIDs);
            case "Side" -> Optional.of(side);
            case "QuoteRefPriceSource" -> Optional.of(quoteRefPriceSource);
            case "TradeUnderlying" -> Optional.of(tradeUnderlying);
            case "NegotiateUnderlying" -> Optional.of(negotiateUnderlying);
            case "ProductComplex" -> Optional.of(productComplex);
            case "NumberOfRespDisclosureInstruction" -> Optional.of(numberOfRespDisclosureInstruction);
            case "PartyExecutingFirm" -> Optional.of(partyExecutingFirm);
            case "PartyExecutingTrader" -> Optional.of(partyExecutingTrader);
            case "PartyEnteringTrader" -> Optional.of(partyEnteringTrader);
            case "FirmNegotiationId" -> Optional.of(firmNegotiationId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SrqsOpenNegotiationRequesterNotification message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(quotReqLegsGrpComp.diffFields(message.quotReqLegsGrpComp));
        changed.addAll(targetPartiesComp.diffFields(message.targetPartiesComp));
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
            quotReqLegsGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            targetPartiesComp.toFormattedString(builder, options);
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
        quotReqLegsGrpComp.toFormattedString(builder, nested);
        targetPartiesComp.toFormattedString(builder, nested);
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
        if (!(other instanceof SrqsOpenNegotiationRequesterNotification message)) {
            return false;
        }
        return fields.equals(message.fields) && quotReqLegsGrpComp.equals(message.quotReqLegsGrpComp) && targetPartiesComp.equals(message.targetPartiesComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, quotReqLegsGrpComp, targetPartiesComp);
    }
}
