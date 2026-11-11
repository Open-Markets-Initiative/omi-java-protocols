package omi.eurex.t7.eti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v6_1.fields.BidPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.BidSizeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FreeTextField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NegotiationIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.OfferPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.OfferSizeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyEnteringTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.QuoteIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.QuoteReqIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SecondaryQuoteIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TransactTimeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingDeltaPercentageField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingPxField;
import omi.eurex.t7.eti.fbe.v6_1.structs.RbcHeaderComp;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the SrqsQuoteNotification message from the Eti protocol.
 */
public final class SrqsQuoteNotification implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 154;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Srqs Quote Notification";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 27, 7, 151, 3 };

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Quote Id
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Secondary Quote Id
     */
    private final SecondaryQuoteIdField secondaryQuoteId = new SecondaryQuoteIdField();

    /**
     * Bid Px
     */
    private final BidPxField bidPx = new BidPxField();

    /**
     * Offer Px
     */
    private final OfferPxField offerPx = new OfferPxField();

    /**
     * Underlying Px
     */
    private final UnderlyingPxField underlyingPx = new UnderlyingPxField();

    /**
     * Underlying Delta Percentage
     */
    private final UnderlyingDeltaPercentageField underlyingDeltaPercentage = new UnderlyingDeltaPercentageField();

    /**
     * Negotiation Id
     */
    private final NegotiationIdField negotiationId = new NegotiationIdField();

    /**
     * Bid Size
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Offer Size
     */
    private final OfferSizeField offerSize = new OfferSizeField();

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
     * Quote Req Id
     */
    private final QuoteReqIdField quoteReqId = new QuoteReqIdField();

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
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(transactTime), List.<Field>of(quoteId), List.<Field>of(secondaryQuoteId), List.<Field>of(bidPx), List.<Field>of(offerPx), List.<Field>of(underlyingPx), List.<Field>of(underlyingDeltaPercentage), List.<Field>of(negotiationId), List.<Field>of(bidSize), List.<Field>of(offerSize), List.<Field>of(partyExecutingFirm), List.<Field>of(partyExecutingTrader), List.<Field>of(partyEnteringTrader), List.<Field>of(quoteReqId), List.<Field>of(freeText)).flatMap(List::stream).toList();

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
     * Quote Id
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * Secondary Quote Id
     *
     * @return the SecondaryQuoteId field
     */
    public SecondaryQuoteIdField secondaryQuoteId() {
        return secondaryQuoteId;
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
     * Negotiation Id
     *
     * @return the NegotiationId field
     */
    public NegotiationIdField negotiationId() {
        return negotiationId;
    }

    /**
     * Bid Size
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Offer Size
     *
     * @return the OfferSize field
     */
    public OfferSizeField offerSize() {
        return offerSize;
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
     * Quote Req Id
     *
     * @return the QuoteReqId field
     */
    public QuoteReqIdField quoteReqId() {
        return quoteReqId;
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 120)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!secondaryQuoteId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryQuoteIdField.BYTE_LENGTH;
        if (!bidPx.parse(data, cursor)) {
            return false;
        }
        cursor += BidPxField.BYTE_LENGTH;
        if (!offerPx.parse(data, cursor)) {
            return false;
        }
        cursor += OfferPxField.BYTE_LENGTH;
        if (!underlyingPx.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingPxField.BYTE_LENGTH;
        if (!underlyingDeltaPercentage.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingDeltaPercentageField.BYTE_LENGTH;
        if (!negotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIdField.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!offerSize.parse(data, cursor)) {
            return false;
        }
        cursor += OfferSizeField.BYTE_LENGTH;
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
        if (!quoteReqId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteReqIdField.BYTE_LENGTH;
        if (!freeText.parse(data, cursor)) {
            return false;
        }
        cursor += FreeTextField.BYTE_LENGTH;

        return true;
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
        cursor = quoteId.encode(data, cursor);
        cursor = secondaryQuoteId.encode(data, cursor);
        cursor = bidPx.encode(data, cursor);
        cursor = offerPx.encode(data, cursor);
        cursor = underlyingPx.encode(data, cursor);
        cursor = underlyingDeltaPercentage.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = offerSize.encode(data, cursor);
        cursor = partyExecutingFirm.encode(data, cursor);
        cursor = partyExecutingTrader.encode(data, cursor);
        cursor = partyEnteringTrader.encode(data, cursor);
        cursor = quoteReqId.encode(data, cursor);
        cursor = freeText.encode(data, cursor);
        if (buffer != null && buffer.length >= 154) {
            System.arraycopy(buffer, 151, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
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
            case "QuoteId" -> Optional.of(quoteId);
            case "SecondaryQuoteId" -> Optional.of(secondaryQuoteId);
            case "BidPx" -> Optional.of(bidPx);
            case "OfferPx" -> Optional.of(offerPx);
            case "UnderlyingPx" -> Optional.of(underlyingPx);
            case "UnderlyingDeltaPercentage" -> Optional.of(underlyingDeltaPercentage);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "BidSize" -> Optional.of(bidSize);
            case "OfferSize" -> Optional.of(offerSize);
            case "PartyExecutingFirm" -> Optional.of(partyExecutingFirm);
            case "PartyExecutingTrader" -> Optional.of(partyExecutingTrader);
            case "PartyEnteringTrader" -> Optional.of(partyEnteringTrader);
            case "QuoteReqId" -> Optional.of(quoteReqId);
            case "FreeText" -> Optional.of(freeText);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SrqsQuoteNotification message)) {
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
        if (!(other instanceof SrqsQuoteNotification message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
