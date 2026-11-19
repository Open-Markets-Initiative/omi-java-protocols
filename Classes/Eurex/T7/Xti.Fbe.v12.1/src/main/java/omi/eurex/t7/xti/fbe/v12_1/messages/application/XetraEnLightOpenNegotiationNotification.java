package omi.eurex.t7.xti.fbe.v12_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v12_1.fields.BidPxField;
import omi.eurex.t7.xti.fbe.v12_1.fields.ExpireTimeField;
import omi.eurex.t7.xti.fbe.v12_1.fields.FirmNegotiationIdField;
import omi.eurex.t7.xti.fbe.v12_1.fields.FreeTextField;
import omi.eurex.t7.xti.fbe.v12_1.fields.LeavesQtyField;
import omi.eurex.t7.xti.fbe.v12_1.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v12_1.fields.NegotiationIdField;
import omi.eurex.t7.xti.fbe.v12_1.fields.NegotiationStartTimeField;
import omi.eurex.t7.xti.fbe.v12_1.fields.NumberOfRespondentsField;
import omi.eurex.t7.xti.fbe.v12_1.fields.OfferPxField;
import omi.eurex.t7.xti.fbe.v12_1.fields.PartyEnteringTraderField;
import omi.eurex.t7.xti.fbe.v12_1.fields.PartyExecutingFirmField;
import omi.eurex.t7.xti.fbe.v12_1.fields.PartyExecutingTraderField;
import omi.eurex.t7.xti.fbe.v12_1.fields.QuoteConditionField;
import omi.eurex.t7.xti.fbe.v12_1.fields.QuoteTypeField;
import omi.eurex.t7.xti.fbe.v12_1.fields.RespondentTypeField;
import omi.eurex.t7.xti.fbe.v12_1.fields.SecurityIdField;
import omi.eurex.t7.xti.fbe.v12_1.fields.SettlDateField;
import omi.eurex.t7.xti.fbe.v12_1.fields.SideField;
import omi.eurex.t7.xti.fbe.v12_1.fields.TargetPartyExecutingFirmField;
import omi.eurex.t7.xti.fbe.v12_1.fields.TargetPartyExecutingTraderField;
import omi.eurex.t7.xti.fbe.v12_1.fields.TransactTimeField;
import omi.eurex.t7.xti.fbe.v12_1.structs.RbcHeaderComp;
import omi.eurex.t7.xti.fbe.v12_1.types.Field;
import omi.eurex.t7.xti.fbe.v12_1.types.Message;
import omi.eurex.t7.xti.fbe.v12_1.types.PrintOptions;

/**
 * Represents the XetraEnLightOpenNegotiationNotification message from the Xti protocol.
 */
public final class XetraEnLightOpenNegotiationNotification implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 290;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Xetra En Light Open Negotiation Notification";

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
     * Negotiation Start Time
     */
    private final NegotiationStartTimeField negotiationStartTime = new NegotiationStartTimeField();

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
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Expire Time
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Negotiation Id
     */
    private final NegotiationIdField negotiationId = new NegotiationIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Number Of Respondents
     */
    private final NumberOfRespondentsField numberOfRespondents = new NumberOfRespondentsField();

    /**
     * Settl Date
     */
    private final SettlDateField settlDate = new SettlDateField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Quote Type
     */
    private final QuoteTypeField quoteType = new QuoteTypeField();

    /**
     * Respondent Type
     */
    private final RespondentTypeField respondentType = new RespondentTypeField();

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
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(transactTime), List.<Field>of(negotiationStartTime), List.<Field>of(securityId), List.<Field>of(bidPx), List.<Field>of(offerPx), List.<Field>of(leavesQty), List.<Field>of(expireTime), List.<Field>of(negotiationId), List.<Field>of(marketSegmentId), List.<Field>of(numberOfRespondents), List.<Field>of(settlDate), List.<Field>of(side), List.<Field>of(quoteType), List.<Field>of(respondentType), List.<Field>of(quoteCondition), List.<Field>of(partyExecutingFirm), List.<Field>of(partyExecutingTrader), List.<Field>of(partyEnteringTrader), List.<Field>of(targetPartyExecutingFirm), List.<Field>of(targetPartyExecutingTrader), List.<Field>of(firmNegotiationId), List.<Field>of(freeText)).flatMap(List::stream).toList();

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
     * Negotiation Start Time
     *
     * @return the NegotiationStartTime field
     */
    public NegotiationStartTimeField negotiationStartTime() {
        return negotiationStartTime;
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
     * Leaves Qty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
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
     * Number Of Respondents
     *
     * @return the NumberOfRespondents field
     */
    public NumberOfRespondentsField numberOfRespondents() {
        return numberOfRespondents;
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
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
     * Respondent Type
     *
     * @return the RespondentType field
     */
    public RespondentTypeField respondentType() {
        return respondentType;
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 256)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!negotiationStartTime.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationStartTimeField.BYTE_LENGTH;
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
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!expireTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireTimeField.BYTE_LENGTH;
        if (!negotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!numberOfRespondents.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfRespondentsField.BYTE_LENGTH;
        if (!settlDate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlDateField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!quoteType.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteTypeField.BYTE_LENGTH;
        if (!respondentType.parse(data, cursor)) {
            return false;
        }
        cursor += RespondentTypeField.BYTE_LENGTH;
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
        return freeText.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = negotiationStartTime.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = bidPx.encode(data, cursor);
        cursor = offerPx.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = expireTime.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = numberOfRespondents.encode(data, cursor);
        cursor = settlDate.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = quoteType.encode(data, cursor);
        cursor = respondentType.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = partyExecutingFirm.encode(data, cursor);
        cursor = partyExecutingTrader.encode(data, cursor);
        cursor = partyEnteringTrader.encode(data, cursor);
        cursor = targetPartyExecutingFirm.encode(data, cursor);
        cursor = targetPartyExecutingTrader.encode(data, cursor);
        cursor = firmNegotiationId.encode(data, cursor);
        cursor = freeText.encode(data, cursor);
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
            case "NegotiationStartTime" -> Optional.of(negotiationStartTime);
            case "SecurityId" -> Optional.of(securityId);
            case "BidPx" -> Optional.of(bidPx);
            case "OfferPx" -> Optional.of(offerPx);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "ExpireTime" -> Optional.of(expireTime);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "NumberOfRespondents" -> Optional.of(numberOfRespondents);
            case "SettlDate" -> Optional.of(settlDate);
            case "Side" -> Optional.of(side);
            case "QuoteType" -> Optional.of(quoteType);
            case "RespondentType" -> Optional.of(respondentType);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "PartyExecutingFirm" -> Optional.of(partyExecutingFirm);
            case "PartyExecutingTrader" -> Optional.of(partyExecutingTrader);
            case "PartyEnteringTrader" -> Optional.of(partyEnteringTrader);
            case "TargetPartyExecutingFirm" -> Optional.of(targetPartyExecutingFirm);
            case "TargetPartyExecutingTrader" -> Optional.of(targetPartyExecutingTrader);
            case "FirmNegotiationId" -> Optional.of(firmNegotiationId);
            case "FreeText" -> Optional.of(freeText);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof XetraEnLightOpenNegotiationNotification message)) {
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
        if (!(other instanceof XetraEnLightOpenNegotiationNotification message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
