package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.BidPxField;
import omi.eurex.t7.eti.fbe.v10_0.fields.EffectiveTimeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.FirmNegotiationIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.FreeTextField;
import omi.eurex.t7.eti.fbe.v10_0.fields.LastPxField;
import omi.eurex.t7.eti.fbe.v10_0.fields.LastQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.LastUpdateTimeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.LeavesQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NegotiationIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NumberOfRespondentsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OfferPxField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyEnteringTraderField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyOrderOriginationTraderField;
import omi.eurex.t7.eti.fbe.v10_0.fields.QuoteConditionField;
import omi.eurex.t7.eti.fbe.v10_0.fields.QuoteInstructionField;
import omi.eurex.t7.eti.fbe.v10_0.fields.QuoteRefPriceField;
import omi.eurex.t7.eti.fbe.v10_0.fields.QuoteSubTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.QuoteTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SideField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TargetPartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TargetPartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeAggregationTransTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeToQuoteRatioField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeToQuoteRatioPositionField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TransactTimeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.UnderlyingDeltaPercentageField;
import omi.eurex.t7.eti.fbe.v10_0.structs.RbcHeaderComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the SrqsNegotiationNotification message from the Eti protocol.
 */
public final class SrqsNegotiationNotification implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 450;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Srqs Negotiation Notification";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 27, 7 };

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Quote Ref Price
     */
    private final QuoteRefPriceField quoteRefPrice = new QuoteRefPriceField();

    /**
     * Underlying Delta Percentage
     */
    private final UnderlyingDeltaPercentageField underlyingDeltaPercentage = new UnderlyingDeltaPercentageField();

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
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Last Qty
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Effective Time
     */
    private final EffectiveTimeField effectiveTime = new EffectiveTimeField();

    /**
     * Last Update Time
     */
    private final LastUpdateTimeField lastUpdateTime = new LastUpdateTimeField();

    /**
     * Trade To Quote Ratio
     */
    private final TradeToQuoteRatioField tradeToQuoteRatio = new TradeToQuoteRatioField();

    /**
     * Negotiation Id
     */
    private final NegotiationIdField negotiationId = new NegotiationIdField();

    /**
     * Number Of Respondents
     */
    private final NumberOfRespondentsField numberOfRespondents = new NumberOfRespondentsField();

    /**
     * Trade To Quote Ratio Position
     */
    private final TradeToQuoteRatioPositionField tradeToQuoteRatioPosition = new TradeToQuoteRatioPositionField();

    /**
     * Quote Type
     */
    private final QuoteTypeField quoteType = new QuoteTypeField();

    /**
     * Quote Sub Type
     */
    private final QuoteSubTypeField quoteSubType = new QuoteSubTypeField();

    /**
     * Quote Instruction
     */
    private final QuoteInstructionField quoteInstruction = new QuoteInstructionField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Trade Aggregation Trans Type
     */
    private final TradeAggregationTransTypeField tradeAggregationTransType = new TradeAggregationTransTypeField();

    /**
     * Quote Condition
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

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
     * Target Party Executing Firm
     */
    private final TargetPartyExecutingFirmField targetPartyExecutingFirm = new TargetPartyExecutingFirmField();

    /**
     * Target Party Executing Trader
     */
    private final TargetPartyExecutingTraderField targetPartyExecutingTrader = new TargetPartyExecutingTraderField();

    /**
     * Firm Negotiation Id
     */
    private final FirmNegotiationIdField firmNegotiationId = new FirmNegotiationIdField();

    /**
     * Free Text
     */
    private final FreeTextField freeText = new FreeTextField();

    /**
     * Party Order Origination Trader
     */
    private final PartyOrderOriginationTraderField partyOrderOriginationTrader = new PartyOrderOriginationTraderField();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(transactTime), List.<Field>of(quoteRefPrice), List.<Field>of(underlyingDeltaPercentage), List.<Field>of(bidPx), List.<Field>of(offerPx), List.<Field>of(lastPx), List.<Field>of(leavesQty), List.<Field>of(lastQty), List.<Field>of(effectiveTime), List.<Field>of(lastUpdateTime), List.<Field>of(tradeToQuoteRatio), List.<Field>of(negotiationId), List.<Field>of(numberOfRespondents), List.<Field>of(tradeToQuoteRatioPosition), List.<Field>of(quoteType), List.<Field>of(quoteSubType), List.<Field>of(quoteInstruction), List.<Field>of(side), List.<Field>of(tradeAggregationTransType), List.<Field>of(quoteCondition), List.<Field>of(partyExecutingFirm), List.<Field>of(partyExecutingTrader), List.<Field>of(partyEnteringTrader), List.<Field>of(targetPartyExecutingFirm), List.<Field>of(targetPartyExecutingTrader), List.<Field>of(firmNegotiationId), List.<Field>of(freeText), List.<Field>of(partyOrderOriginationTrader)).flatMap(List::stream).toList();

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
     * Leaves Qty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
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
     * Effective Time
     *
     * @return the EffectiveTime field
     */
    public EffectiveTimeField effectiveTime() {
        return effectiveTime;
    }

    /**
     * Last Update Time
     *
     * @return the LastUpdateTime field
     */
    public LastUpdateTimeField lastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Trade To Quote Ratio
     *
     * @return the TradeToQuoteRatio field
     */
    public TradeToQuoteRatioField tradeToQuoteRatio() {
        return tradeToQuoteRatio;
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
     * Number Of Respondents
     *
     * @return the NumberOfRespondents field
     */
    public NumberOfRespondentsField numberOfRespondents() {
        return numberOfRespondents;
    }

    /**
     * Trade To Quote Ratio Position
     *
     * @return the TradeToQuoteRatioPosition field
     */
    public TradeToQuoteRatioPositionField tradeToQuoteRatioPosition() {
        return tradeToQuoteRatioPosition;
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
     * Quote Sub Type
     *
     * @return the QuoteSubType field
     */
    public QuoteSubTypeField quoteSubType() {
        return quoteSubType;
    }

    /**
     * Quote Instruction
     *
     * @return the QuoteInstruction field
     */
    public QuoteInstructionField quoteInstruction() {
        return quoteInstruction;
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
     * Trade Aggregation Trans Type
     *
     * @return the TradeAggregationTransType field
     */
    public TradeAggregationTransTypeField tradeAggregationTransType() {
        return tradeAggregationTransType;
    }

    /**
     * Quote Condition
     *
     * @return the QuoteCondition field
     */
    public QuoteConditionField quoteCondition() {
        return quoteCondition;
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
     * Party Order Origination Trader
     *
     * @return the PartyOrderOriginationTrader field
     */
    public PartyOrderOriginationTraderField partyOrderOriginationTrader() {
        return partyOrderOriginationTrader;
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 416)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!quoteRefPrice.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteRefPriceField.BYTE_LENGTH;
        if (!underlyingDeltaPercentage.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingDeltaPercentageField.BYTE_LENGTH;
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
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!effectiveTime.parse(data, cursor)) {
            return false;
        }
        cursor += EffectiveTimeField.BYTE_LENGTH;
        if (!lastUpdateTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastUpdateTimeField.BYTE_LENGTH;
        if (!tradeToQuoteRatio.parse(data, cursor)) {
            return false;
        }
        cursor += TradeToQuoteRatioField.BYTE_LENGTH;
        if (!negotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIdField.BYTE_LENGTH;
        if (!numberOfRespondents.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfRespondentsField.BYTE_LENGTH;
        if (!tradeToQuoteRatioPosition.parse(data, cursor)) {
            return false;
        }
        cursor += TradeToQuoteRatioPositionField.BYTE_LENGTH;
        if (!quoteType.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteTypeField.BYTE_LENGTH;
        if (!quoteSubType.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteSubTypeField.BYTE_LENGTH;
        if (!quoteInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteInstructionField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!tradeAggregationTransType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeAggregationTransTypeField.BYTE_LENGTH;
        if (!quoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteConditionField.BYTE_LENGTH;
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
        if (!targetPartyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyExecutingFirmField.BYTE_LENGTH;
        if (!targetPartyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyExecutingTraderField.BYTE_LENGTH;
        if (!firmNegotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmNegotiationIdField.BYTE_LENGTH;
        if (!freeText.parse(data, cursor)) {
            return false;
        }
        cursor += FreeTextField.BYTE_LENGTH;
        if (!partyOrderOriginationTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyOrderOriginationTraderField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = quoteRefPrice.encode(data, cursor);
        cursor = underlyingDeltaPercentage.encode(data, cursor);
        cursor = bidPx.encode(data, cursor);
        cursor = offerPx.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = effectiveTime.encode(data, cursor);
        cursor = lastUpdateTime.encode(data, cursor);
        cursor = tradeToQuoteRatio.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = numberOfRespondents.encode(data, cursor);
        cursor = tradeToQuoteRatioPosition.encode(data, cursor);
        cursor = quoteType.encode(data, cursor);
        cursor = quoteSubType.encode(data, cursor);
        cursor = quoteInstruction.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = tradeAggregationTransType.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = partyExecutingFirm.encode(data, cursor);
        cursor = partyExecutingTrader.encode(data, cursor);
        cursor = partyEnteringTrader.encode(data, cursor);
        cursor = targetPartyExecutingFirm.encode(data, cursor);
        cursor = targetPartyExecutingTrader.encode(data, cursor);
        cursor = firmNegotiationId.encode(data, cursor);
        cursor = freeText.encode(data, cursor);
        cursor = partyOrderOriginationTrader.encode(data, cursor);
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
            case "TransactTime" -> Optional.of(transactTime);
            case "QuoteRefPrice" -> Optional.of(quoteRefPrice);
            case "UnderlyingDeltaPercentage" -> Optional.of(underlyingDeltaPercentage);
            case "BidPx" -> Optional.of(bidPx);
            case "OfferPx" -> Optional.of(offerPx);
            case "LastPx" -> Optional.of(lastPx);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "LastQty" -> Optional.of(lastQty);
            case "EffectiveTime" -> Optional.of(effectiveTime);
            case "LastUpdateTime" -> Optional.of(lastUpdateTime);
            case "TradeToQuoteRatio" -> Optional.of(tradeToQuoteRatio);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "NumberOfRespondents" -> Optional.of(numberOfRespondents);
            case "TradeToQuoteRatioPosition" -> Optional.of(tradeToQuoteRatioPosition);
            case "QuoteType" -> Optional.of(quoteType);
            case "QuoteSubType" -> Optional.of(quoteSubType);
            case "QuoteInstruction" -> Optional.of(quoteInstruction);
            case "Side" -> Optional.of(side);
            case "TradeAggregationTransType" -> Optional.of(tradeAggregationTransType);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "PartyExecutingFirm" -> Optional.of(partyExecutingFirm);
            case "PartyExecutingTrader" -> Optional.of(partyExecutingTrader);
            case "PartyEnteringTrader" -> Optional.of(partyEnteringTrader);
            case "TargetPartyExecutingFirm" -> Optional.of(targetPartyExecutingFirm);
            case "TargetPartyExecutingTrader" -> Optional.of(targetPartyExecutingTrader);
            case "FirmNegotiationId" -> Optional.of(firmNegotiationId);
            case "FreeText" -> Optional.of(freeText);
            case "PartyOrderOriginationTrader" -> Optional.of(partyOrderOriginationTrader);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SrqsNegotiationNotification message)) {
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
        if (!(other instanceof SrqsNegotiationNotification message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
