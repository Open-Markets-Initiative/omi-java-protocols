package omi.siac.opra.output.obi.v6_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.siac.opra.output.obi.v6_2.fields.BboIndicatorField;
import omi.siac.opra.output.obi.v6_2.fields.BidPriceShortField;
import omi.siac.opra.output.obi.v6_2.fields.BidSizeShortField;
import omi.siac.opra.output.obi.v6_2.fields.OfferPriceShortField;
import omi.siac.opra.output.obi.v6_2.fields.OfferSizeShortField;
import omi.siac.opra.output.obi.v6_2.fields.ParticipantReferenceNumberField;
import omi.siac.opra.output.obi.v6_2.fields.SecuritySymbolShortField;
import omi.siac.opra.output.obi.v6_2.fields.StrikePriceShortField;
import omi.siac.opra.output.obi.v6_2.fields.TransactionIdField;
import omi.siac.opra.output.obi.v6_2.structs.BestBidAndOfferAppendage;
import omi.siac.opra.output.obi.v6_2.structs.BestBidAppendage;
import omi.siac.opra.output.obi.v6_2.structs.BestOfferAppendage;
import omi.siac.opra.output.obi.v6_2.structs.ExpirationBlock;
import omi.siac.opra.output.obi.v6_2.types.Field;
import omi.siac.opra.output.obi.v6_2.types.Message;
import omi.siac.opra.output.obi.v6_2.types.PrintOptions;

/**
 * Represents the ShortEquityAndIndexQuoteMessage message from the Output protocol.
 *
 * <p>Short Equity and Index Quote Message</p>
 */
public final class ShortEquityAndIndexQuoteMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Short Equity And Index Quote Message";

    /**
     * Indicates the effect the new quote has on the Best Bid and/or the Best Offer.
     */
    private final BboIndicatorField bboIndicator = new BboIndicatorField();

    /**
     * Reserved for Internal Use only
     */
    private final TransactionIdField transactionId = new TransactionIdField();

    /**
     * The PRN is for optional use by the Participant
     */
    private final ParticipantReferenceNumberField participantReferenceNumber = new ParticipantReferenceNumberField();

    /**
     * Identifies the unique symbol assigned to the underlying security.
     */
    private final SecuritySymbolShortField securitySymbolShort = new SecuritySymbolShortField();

    /**
     * Represents the stated price per share for which the underlying security may be purchased (in the case of a call) or sold (in the case of a put) by the option holder upon exercise of the option contract.
     */
    private final StrikePriceShortField strikePriceShort = new StrikePriceShortField();

    /**
     * Represents the price at which a buyer is willing to buy an option.
     */
    private final BidPriceShortField bidPriceShort = new BidPriceShortField();

    /**
     * The Bid Size identifies the number of contracts being bought for an option at the Bid Price.
     */
    private final BidSizeShortField bidSizeShort = new BidSizeShortField();

    /**
     * Represents the price at which a seller is offering to sell an option.
     */
    private final OfferPriceShortField offerPriceShort = new OfferPriceShortField();

    /**
     * The Offer Size identifies the number of contracts for sale for an option at the Offer Price.
     */
    private final OfferSizeShortField offerSizeShort = new OfferSizeShortField();

    /**
     * Expiration Block
     */
    private final ExpirationBlock expirationBlock = new ExpirationBlock();

    /**
     * Best Bid Appendage
     */
    private final BestBidAppendage bestBidAppendage = new BestBidAppendage();

    /**
     * Best Offer Appendage
     */
    private final BestOfferAppendage bestOfferAppendage = new BestOfferAppendage();

    /**
     * Best Bid and Offer Appendage
     */
    private final BestBidAndOfferAppendage bestBidAndOfferAppendage = new BestBidAndOfferAppendage();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(bboIndicator), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbolShort), expirationBlock.fields(), List.<Field>of(strikePriceShort), List.<Field>of(bidPriceShort), List.<Field>of(bidSizeShort), List.<Field>of(offerPriceShort), List.<Field>of(offerSizeShort)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Indicates the effect the new quote has on the Best Bid and/or the Best Offer.
     *
     * @return the BboIndicator field
     */
    public BboIndicatorField bboIndicator() {
        return bboIndicator;
    }

    /**
     * Reserved for Internal Use only
     *
     * @return the TransactionId field
     */
    public TransactionIdField transactionId() {
        return transactionId;
    }

    /**
     * The PRN is for optional use by the Participant
     *
     * @return the ParticipantReferenceNumber field
     */
    public ParticipantReferenceNumberField participantReferenceNumber() {
        return participantReferenceNumber;
    }

    /**
     * Identifies the unique symbol assigned to the underlying security.
     *
     * @return the SecuritySymbolShort field
     */
    public SecuritySymbolShortField securitySymbolShort() {
        return securitySymbolShort;
    }

    /**
     * Represents the stated price per share for which the underlying security may be purchased (in the case of a call) or sold (in the case of a put) by the option holder upon exercise of the option contract.
     *
     * @return the StrikePriceShort field
     */
    public StrikePriceShortField strikePriceShort() {
        return strikePriceShort;
    }

    /**
     * Represents the price at which a buyer is willing to buy an option.
     *
     * @return the BidPriceShort field
     */
    public BidPriceShortField bidPriceShort() {
        return bidPriceShort;
    }

    /**
     * The Bid Size identifies the number of contracts being bought for an option at the Bid Price.
     *
     * @return the BidSizeShort field
     */
    public BidSizeShortField bidSizeShort() {
        return bidSizeShort;
    }

    /**
     * Represents the price at which a seller is offering to sell an option.
     *
     * @return the OfferPriceShort field
     */
    public OfferPriceShortField offerPriceShort() {
        return offerPriceShort;
    }

    /**
     * The Offer Size identifies the number of contracts for sale for an option at the Offer Price.
     *
     * @return the OfferSizeShort field
     */
    public OfferSizeShortField offerSizeShort() {
        return offerSizeShort;
    }

    /**
     * Expiration Block
     *
     * @return the ExpirationBlock record
     */
    public ExpirationBlock expirationBlock() {
        return expirationBlock;
    }

    /**
     * Best Bid Appendage
     *
     * @return the BestBidAppendage record
     */
    public BestBidAppendage bestBidAppendage() {
        return bestBidAppendage;
    }

    /**
     * Best Offer Appendage
     *
     * @return the BestOfferAppendage record
     */
    public BestOfferAppendage bestOfferAppendage() {
        return bestOfferAppendage;
    }

    /**
     * Best Bid and Offer Appendage
     *
     * @return the BestBidAndOfferAppendage record
     */
    public BestBidAndOfferAppendage bestBidAndOfferAppendage() {
        return bestBidAndOfferAppendage;
    }

    /**
     * Returns whether the fields before the BestBidAppendage put it on the wire.
     *
     * <p>Decode reads the BestBidAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BestBidAppendage is on the wire
     */
    public boolean bestBidAppendagePresent() {
        return (bboIndicator.rawValue() == 'M') || (bboIndicator.rawValue() == 'N') || (bboIndicator.rawValue() == 'P');
    }

    /**
     * Returns whether the fields before the BestOfferAppendage put it on the wire.
     *
     * <p>Decode reads the BestOfferAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BestOfferAppendage is on the wire
     */
    public boolean bestOfferAppendagePresent() {
        return (bboIndicator.rawValue() == 'C') || (bboIndicator.rawValue() == 'G') || (bboIndicator.rawValue() == 'K');
    }

    /**
     * Returns whether the fields before the BestBidAndOfferAppendage put it on the wire.
     *
     * <p>Decode reads the BestBidAndOfferAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BestBidAndOfferAppendage is on the wire
     */
    public boolean bestBidAndOfferAppendagePresent() {
        return bboIndicator.rawValue() == 'O';
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (bestBidAppendagePresent() ? bestBidAppendage.byteLength() : 0) + (bestOfferAppendagePresent() ? bestOfferAppendage.byteLength() : 0) + (bestBidAndOfferAppendagePresent() ? bestBidAndOfferAppendage.byteLength() : 0);
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        return new int[0];
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
        if (!bboIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BboIndicatorField.BYTE_LENGTH;
        if (!transactionId.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionIdField.BYTE_LENGTH;
        if (!participantReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantReferenceNumberField.BYTE_LENGTH;
        if (!securitySymbolShort.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolShortField.BYTE_LENGTH;
        if (!expirationBlock.parseFrom(data, cursor, end - 10)) {
            return false;
        }
        cursor += expirationBlock.byteLength();
        if (!strikePriceShort.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceShortField.BYTE_LENGTH;
        if (!bidPriceShort.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceShortField.BYTE_LENGTH;
        if (!bidSizeShort.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeShortField.BYTE_LENGTH;
        if (!offerPriceShort.parse(data, cursor)) {
            return false;
        }
        cursor += OfferPriceShortField.BYTE_LENGTH;
        if (!offerSizeShort.parse(data, cursor)) {
            return false;
        }
        cursor += OfferSizeShortField.BYTE_LENGTH;
        if (bestBidAppendagePresent()) {
            if (!bestBidAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += bestBidAppendage.byteLength();
        }
        if (end - cursor < 0) {
            return false;
        }
        if (bestOfferAppendagePresent()) {
            if (!bestOfferAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += bestOfferAppendage.byteLength();
        }
        if (end - cursor < 0) {
            return false;
        }
        if (bestBidAndOfferAppendagePresent()) {
            if (!bestBidAndOfferAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += bestBidAndOfferAppendage.byteLength();
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = bboIndicator.encode(data, cursor);
        cursor = transactionId.encode(data, cursor);
        cursor = participantReferenceNumber.encode(data, cursor);
        cursor = securitySymbolShort.encode(data, cursor);
        cursor = expirationBlock.encode(data, cursor);
        cursor = strikePriceShort.encode(data, cursor);
        cursor = bidPriceShort.encode(data, cursor);
        cursor = bidSizeShort.encode(data, cursor);
        cursor = offerPriceShort.encode(data, cursor);
        cursor = offerSizeShort.encode(data, cursor);
        if (bestBidAppendagePresent()) {
            cursor = bestBidAppendage.encode(data, cursor);
        }
        if (bestOfferAppendagePresent()) {
            cursor = bestOfferAppendage.encode(data, cursor);
        }
        if (bestBidAndOfferAppendagePresent()) {
            cursor = bestBidAndOfferAppendage.encode(data, cursor);
        }
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
        expirationBlock.clear();
        bestBidAppendage.clear();
        bestOfferAppendage.clear();
        bestBidAndOfferAppendage.clear();
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
        if (bestBidAppendagePresent() && !bestBidAppendage.isRecognized()) {
            return false;
        }
        if (bestOfferAppendagePresent() && !bestOfferAppendage.isRecognized()) {
            return false;
        }
        return !bestBidAndOfferAppendagePresent() || bestBidAndOfferAppendage.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (bestBidAppendagePresent() && !bestBidAppendage.isValid()) {
            return false;
        }
        if (bestOfferAppendagePresent() && !bestOfferAppendage.isValid()) {
            return false;
        }
        if (bestBidAndOfferAppendagePresent() && !bestBidAndOfferAppendage.isValid()) {
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
            case "BboIndicator" -> Optional.of(bboIndicator);
            case "TransactionId" -> Optional.of(transactionId);
            case "ParticipantReferenceNumber" -> Optional.of(participantReferenceNumber);
            case "SecuritySymbolShort" -> Optional.of(securitySymbolShort);
            case "StrikePriceShort" -> Optional.of(strikePriceShort);
            case "BidPriceShort" -> Optional.of(bidPriceShort);
            case "BidSizeShort" -> Optional.of(bidSizeShort);
            case "OfferPriceShort" -> Optional.of(offerPriceShort);
            case "OfferSizeShort" -> Optional.of(offerSizeShort);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ShortEquityAndIndexQuoteMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(bestBidAppendage.diffFields(message.bestBidAppendage));
        changed.addAll(bestOfferAppendage.diffFields(message.bestOfferAppendage));
        changed.addAll(bestBidAndOfferAppendage.diffFields(message.bestBidAndOfferAppendage));
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
            if (bestBidAppendagePresent()) {
                builder.append(", ");
                bestBidAppendage.toFormattedString(builder, options);
            }
            if (bestOfferAppendagePresent()) {
                builder.append(", ");
                bestOfferAppendage.toFormattedString(builder, options);
            }
            if (bestBidAndOfferAppendagePresent()) {
                builder.append(", ");
                bestBidAndOfferAppendage.toFormattedString(builder, options);
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
        if (bestBidAppendagePresent()) {
            bestBidAppendage.toFormattedString(builder, nested);
        }
        if (bestOfferAppendagePresent()) {
            bestOfferAppendage.toFormattedString(builder, nested);
        }
        if (bestBidAndOfferAppendagePresent()) {
            bestBidAndOfferAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof ShortEquityAndIndexQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && bestBidAppendage.equals(message.bestBidAppendage) && bestOfferAppendage.equals(message.bestOfferAppendage) && bestBidAndOfferAppendage.equals(message.bestBidAndOfferAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, bestBidAppendage, bestOfferAppendage, bestBidAndOfferAppendage);
    }
}
