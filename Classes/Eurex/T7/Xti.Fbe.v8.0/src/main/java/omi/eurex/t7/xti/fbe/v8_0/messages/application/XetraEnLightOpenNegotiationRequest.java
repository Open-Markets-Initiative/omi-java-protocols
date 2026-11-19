package omi.eurex.t7.xti.fbe.v8_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v8_0.fields.BidPxField;
import omi.eurex.t7.xti.fbe.v8_0.fields.FreeTextField;
import omi.eurex.t7.xti.fbe.v8_0.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v8_0.fields.NetworkMsgIdField;
import omi.eurex.t7.xti.fbe.v8_0.fields.NoTargetPartyIDsField;
import omi.eurex.t7.xti.fbe.v8_0.fields.NumberOfRespDisclosureInstructionField;
import omi.eurex.t7.xti.fbe.v8_0.fields.OfferPxField;
import omi.eurex.t7.xti.fbe.v8_0.fields.OrderQtyField;
import omi.eurex.t7.xti.fbe.v8_0.fields.PartyExecutingFirmField;
import omi.eurex.t7.xti.fbe.v8_0.fields.PartyExecutingTraderField;
import omi.eurex.t7.xti.fbe.v8_0.fields.QuoteReqIdField;
import omi.eurex.t7.xti.fbe.v8_0.fields.RespondentTypeField;
import omi.eurex.t7.xti.fbe.v8_0.fields.SecurityIdField;
import omi.eurex.t7.xti.fbe.v8_0.fields.SettlDateField;
import omi.eurex.t7.xti.fbe.v8_0.fields.SideField;
import omi.eurex.t7.xti.fbe.v8_0.fields.ValidUntilTimeField;
import omi.eurex.t7.xti.fbe.v8_0.fields.ValueCheckTypeQuantityField;
import omi.eurex.t7.xti.fbe.v8_0.fields.ValueCheckTypeValueField;
import omi.eurex.t7.xti.fbe.v8_0.groups.XetraEnLightTargetPartiesCompEntry;
import omi.eurex.t7.xti.fbe.v8_0.groups.XetraEnLightTargetPartiesCompList;
import omi.eurex.t7.xti.fbe.v8_0.structs.RequestHeaderComp;
import omi.eurex.t7.xti.fbe.v8_0.types.Field;
import omi.eurex.t7.xti.fbe.v8_0.types.Message;
import omi.eurex.t7.xti.fbe.v8_0.types.PrintOptions;

/**
 * Represents the XetraEnLightOpenNegotiationRequest message from the Xti protocol.
 */
public final class XetraEnLightOpenNegotiationRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 242;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Xetra En Light Open Negotiation Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

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
     * Order Qty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Valid Until Time
     */
    private final ValidUntilTimeField validUntilTime = new ValidUntilTimeField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Settl Date
     */
    private final SettlDateField settlDate = new SettlDateField();

    /**
     * No Target Party I Ds
     */
    private final NoTargetPartyIDsField noTargetPartyIDs = new NoTargetPartyIDsField();

    /**
     * Number Of Resp Disclosure Instruction
     */
    private final NumberOfRespDisclosureInstructionField numberOfRespDisclosureInstruction = new NumberOfRespDisclosureInstructionField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Value Check Type Value
     */
    private final ValueCheckTypeValueField valueCheckTypeValue = new ValueCheckTypeValueField();

    /**
     * Value Check Type Quantity
     */
    private final ValueCheckTypeQuantityField valueCheckTypeQuantity = new ValueCheckTypeQuantityField();

    /**
     * Respondent Type
     */
    private final RespondentTypeField respondentType = new RespondentTypeField();

    /**
     * Party Executing Firm
     */
    private final PartyExecutingFirmField partyExecutingFirm = new PartyExecutingFirmField();

    /**
     * Party Executing Trader
     */
    private final PartyExecutingTraderField partyExecutingTrader = new PartyExecutingTraderField();

    /**
     * Free Text
     */
    private final FreeTextField freeText = new FreeTextField();

    /**
     * Quote Req Id
     */
    private final QuoteReqIdField quoteReqId = new QuoteReqIdField();

    /**
     * Xetra En Light Target Parties Comp
     */
    private final XetraEnLightTargetPartiesCompList xetraEnLightTargetPartiesComp = new XetraEnLightTargetPartiesCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(securityId), List.<Field>of(bidPx), List.<Field>of(offerPx), List.<Field>of(orderQty), List.<Field>of(validUntilTime), List.<Field>of(marketSegmentId), List.<Field>of(settlDate), List.<Field>of(noTargetPartyIDs), List.<Field>of(numberOfRespDisclosureInstruction), List.<Field>of(side), List.<Field>of(valueCheckTypeValue), List.<Field>of(valueCheckTypeQuantity), List.<Field>of(respondentType), List.<Field>of(partyExecutingFirm), List.<Field>of(partyExecutingTrader), List.<Field>of(freeText), List.<Field>of(quoteReqId)).flatMap(List::stream).toList();

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
     * Order Qty
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Valid Until Time
     *
     * @return the ValidUntilTime field
     */
    public ValidUntilTimeField validUntilTime() {
        return validUntilTime;
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
     * Settl Date
     *
     * @return the SettlDate field
     */
    public SettlDateField settlDate() {
        return settlDate;
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
     * Number Of Resp Disclosure Instruction
     *
     * @return the NumberOfRespDisclosureInstruction field
     */
    public NumberOfRespDisclosureInstructionField numberOfRespDisclosureInstruction() {
        return numberOfRespDisclosureInstruction;
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
     * Value Check Type Value
     *
     * @return the ValueCheckTypeValue field
     */
    public ValueCheckTypeValueField valueCheckTypeValue() {
        return valueCheckTypeValue;
    }

    /**
     * Value Check Type Quantity
     *
     * @return the ValueCheckTypeQuantity field
     */
    public ValueCheckTypeQuantityField valueCheckTypeQuantity() {
        return valueCheckTypeQuantity;
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
     * Free Text
     *
     * @return the FreeText field
     */
    public FreeTextField freeText() {
        return freeText;
    }

    /**
     * Quote Req Id
     *
     * @return the QuoteReqId field
     */
    public QuoteReqIdField quoteReqId() {
        return quoteReqId;
    }

    /**
     * Xetra En Light Target Parties Comp
     *
     * <p>Encode writes this list's size to the NoTargetPartyIDs field.</p>
     *
     * @return the XetraEnLightTargetPartiesComp entries
     */
    public XetraEnLightTargetPartiesCompList xetraEnLightTargetPartiesComp() {
        return xetraEnLightTargetPartiesComp;
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
        return MINIMUM_BYTE_LENGTH + xetraEnLightTargetPartiesComp.byteLength();
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
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 5;
        cursor += 6;
        cursor += 132;
        cursor += 20;
        runs.add(cursor).add(7);
        cursor += 7;
        cursor = xetraEnLightTargetPartiesComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(validUntilTime.value());
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
        if (!requestHeaderComp.parseFrom(data, cursor, end - 224)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
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
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!validUntilTime.parse(data, cursor)) {
            return false;
        }
        cursor += ValidUntilTimeField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!settlDate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlDateField.BYTE_LENGTH;
        if (!noTargetPartyIDs.parse(data, cursor)) {
            return false;
        }
        cursor += NoTargetPartyIDsField.BYTE_LENGTH;
        if (!numberOfRespDisclosureInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfRespDisclosureInstructionField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!valueCheckTypeValue.parse(data, cursor)) {
            return false;
        }
        cursor += ValueCheckTypeValueField.BYTE_LENGTH;
        if (!valueCheckTypeQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ValueCheckTypeQuantityField.BYTE_LENGTH;
        if (!respondentType.parse(data, cursor)) {
            return false;
        }
        cursor += RespondentTypeField.BYTE_LENGTH;
        if (!partyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingFirmField.BYTE_LENGTH;
        if (!partyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingTraderField.BYTE_LENGTH;
        if (!freeText.parse(data, cursor)) {
            return false;
        }
        cursor += FreeTextField.BYTE_LENGTH;
        if (!quoteReqId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteReqIdField.BYTE_LENGTH;
        cursor += 7; // padding
        if (!xetraEnLightTargetPartiesComp.parse(data, cursor, end, noTargetPartyIDs.value())) {
            return false;
        }
        cursor += xetraEnLightTargetPartiesComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (xetraEnLightTargetPartiesComp.size() > 255) {
            throw new IllegalStateException("xetraEnLightTargetPartiesComp holds " + xetraEnLightTargetPartiesComp.size() + " entries, more than its count field can state");
        }
        noTargetPartyIDs.value((short) xetraEnLightTargetPartiesComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = bidPx.encode(data, cursor);
        cursor = offerPx.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = validUntilTime.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = settlDate.encode(data, cursor);
        cursor = noTargetPartyIDs.encode(data, cursor);
        cursor = numberOfRespDisclosureInstruction.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = valueCheckTypeValue.encode(data, cursor);
        cursor = valueCheckTypeQuantity.encode(data, cursor);
        cursor = respondentType.encode(data, cursor);
        cursor = partyExecutingFirm.encode(data, cursor);
        cursor = partyExecutingTrader.encode(data, cursor);
        cursor = freeText.encode(data, cursor);
        cursor = quoteReqId.encode(data, cursor);
        if (buffer != null && buffer.length >= 242) {
            System.arraycopy(buffer, 235, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
        cursor = xetraEnLightTargetPartiesComp.encode(data, cursor);
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
        xetraEnLightTargetPartiesComp.clear();
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
            if (field != noTargetPartyIDs && !field.isRecognized()) {
                return false;
            }
        }
        return xetraEnLightTargetPartiesComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noTargetPartyIDs && !field.isValid()) {
                return false;
            }
        }
        if (!xetraEnLightTargetPartiesComp.isValid()) {
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
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!bidPx.isDecoded()) {
            return Optional.of(bidPx);
        }
        if (!offerPx.isDecoded()) {
            return Optional.of(offerPx);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!validUntilTime.isDecoded()) {
            return Optional.of(validUntilTime);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!settlDate.isDecoded()) {
            return Optional.of(settlDate);
        }
        if (!noTargetPartyIDs.isDecoded()) {
            return Optional.of(noTargetPartyIDs);
        }
        if (!numberOfRespDisclosureInstruction.isDecoded()) {
            return Optional.of(numberOfRespDisclosureInstruction);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!valueCheckTypeValue.isDecoded()) {
            return Optional.of(valueCheckTypeValue);
        }
        if (!valueCheckTypeQuantity.isDecoded()) {
            return Optional.of(valueCheckTypeQuantity);
        }
        if (!respondentType.isDecoded()) {
            return Optional.of(respondentType);
        }
        if (!partyExecutingFirm.isDecoded()) {
            return Optional.of(partyExecutingFirm);
        }
        if (!partyExecutingTrader.isDecoded()) {
            return Optional.of(partyExecutingTrader);
        }
        if (!freeText.isDecoded()) {
            return Optional.of(freeText);
        }
        if (!quoteReqId.isDecoded()) {
            return Optional.of(quoteReqId);
        }
        if (!xetraEnLightTargetPartiesComp.isDecoded()) {
            return Optional.of(xetraEnLightTargetPartiesComp.failedEntry().flatMap(XetraEnLightTargetPartiesCompEntry::failedAt).orElse(noTargetPartyIDs));
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
            case "SecurityId" -> Optional.of(securityId);
            case "BidPx" -> Optional.of(bidPx);
            case "OfferPx" -> Optional.of(offerPx);
            case "OrderQty" -> Optional.of(orderQty);
            case "ValidUntilTime" -> Optional.of(validUntilTime);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "SettlDate" -> Optional.of(settlDate);
            case "NoTargetPartyIDs" -> Optional.of(noTargetPartyIDs);
            case "NumberOfRespDisclosureInstruction" -> Optional.of(numberOfRespDisclosureInstruction);
            case "Side" -> Optional.of(side);
            case "ValueCheckTypeValue" -> Optional.of(valueCheckTypeValue);
            case "ValueCheckTypeQuantity" -> Optional.of(valueCheckTypeQuantity);
            case "RespondentType" -> Optional.of(respondentType);
            case "PartyExecutingFirm" -> Optional.of(partyExecutingFirm);
            case "PartyExecutingTrader" -> Optional.of(partyExecutingTrader);
            case "FreeText" -> Optional.of(freeText);
            case "QuoteReqId" -> Optional.of(quoteReqId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof XetraEnLightOpenNegotiationRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(xetraEnLightTargetPartiesComp.diffFields(message.xetraEnLightTargetPartiesComp));
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
            xetraEnLightTargetPartiesComp.toFormattedString(builder, options);
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
        xetraEnLightTargetPartiesComp.toFormattedString(builder, nested);
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
        if (!(other instanceof XetraEnLightOpenNegotiationRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && xetraEnLightTargetPartiesComp.equals(message.xetraEnLightTargetPartiesComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, xetraEnLightTargetPartiesComp);
    }
}
