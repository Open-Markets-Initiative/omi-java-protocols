package omi.siac.opra.output.obi.v6_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.siac.opra.output.obi.v6_2.fields.BboIndicatorField;
import omi.siac.opra.output.obi.v6_2.fields.BidPriceField;
import omi.siac.opra.output.obi.v6_2.fields.BidSizeField;
import omi.siac.opra.output.obi.v6_2.fields.OfferPriceField;
import omi.siac.opra.output.obi.v6_2.fields.OfferSizeField;
import omi.siac.opra.output.obi.v6_2.fields.ParticipantReferenceNumberField;
import omi.siac.opra.output.obi.v6_2.fields.PremiumPriceDenominatorCodeField;
import omi.siac.opra.output.obi.v6_2.fields.SecuritySymbolField;
import omi.siac.opra.output.obi.v6_2.fields.StrikePriceDenominatorCodeField;
import omi.siac.opra.output.obi.v6_2.fields.StrikePriceField;
import omi.siac.opra.output.obi.v6_2.fields.TransactionIdField;
import omi.siac.opra.output.obi.v6_2.structs.BestBidAndOfferAppendage;
import omi.siac.opra.output.obi.v6_2.structs.BestBidAppendage;
import omi.siac.opra.output.obi.v6_2.structs.BestOfferAppendage;
import omi.siac.opra.output.obi.v6_2.structs.ExpirationBlock;
import omi.siac.opra.output.obi.v6_2.types.Field;
import omi.siac.opra.output.obi.v6_2.types.Message;
import omi.siac.opra.output.obi.v6_2.types.PrintOptions;

/**
 * Represents the LongEquityAndIndexQuoteMessage message from the Output protocol.
 *
 * <p>Long Equity and Index Quote Message</p>
 */
public final class LongEquityAndIndexQuoteMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 40;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Long Equity And Index Quote Message";

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
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * The Strike Price Denominator Code field indicates the position of the floating decimal point within the Strike Price field.
     */
    private final StrikePriceDenominatorCodeField strikePriceDenominatorCode = new StrikePriceDenominatorCodeField();

    /**
     * Represents the stated price per share for which the underlying security may be purchased (in the case of a call) or sold (in the case of a put) by the option holder upon exercise of the option contract.
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Represents the first price paid for an option during the trading day.
     */
    private final PremiumPriceDenominatorCodeField premiumPriceDenominatorCode = new PremiumPriceDenominatorCodeField();

    /**
     * Represents the price at which a buyer is willing to buy an option.
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * The Bid Size identifies the number of contracts being bought for an option at the Bid Price.
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Represents the price at which a seller is offering to sell an option.
     */
    private final OfferPriceField offerPrice = new OfferPriceField();

    /**
     * The Offer Size identifies the number of contracts for sale for an option at the Offer Price.
     */
    private final OfferSizeField offerSize = new OfferSizeField();

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
    private final List<Field> fields = Stream.of(List.<Field>of(bboIndicator), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbol), expirationBlock.fields(), List.<Field>of(strikePriceDenominatorCode), List.<Field>of(strikePrice), List.<Field>of(premiumPriceDenominatorCode), List.<Field>of(bidPrice), List.<Field>of(bidSize), List.<Field>of(offerPrice), List.<Field>of(offerSize)).flatMap(List::stream).toList();

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
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
    }

    /**
     * The Strike Price Denominator Code field indicates the position of the floating decimal point within the Strike Price field.
     *
     * @return the StrikePriceDenominatorCode field
     */
    public StrikePriceDenominatorCodeField strikePriceDenominatorCode() {
        return strikePriceDenominatorCode;
    }

    /**
     * Represents the stated price per share for which the underlying security may be purchased (in the case of a call) or sold (in the case of a put) by the option holder upon exercise of the option contract.
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Represents the first price paid for an option during the trading day.
     *
     * @return the PremiumPriceDenominatorCode field
     */
    public PremiumPriceDenominatorCodeField premiumPriceDenominatorCode() {
        return premiumPriceDenominatorCode;
    }

    /**
     * Represents the price at which a buyer is willing to buy an option.
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * The Bid Size identifies the number of contracts being bought for an option at the Bid Price.
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Represents the price at which a seller is offering to sell an option.
     *
     * @return the OfferPrice field
     */
    public OfferPriceField offerPrice() {
        return offerPrice;
    }

    /**
     * The Offer Size identifies the number of contracts for sale for an option at the Offer Price.
     *
     * @return the OfferSize field
     */
    public OfferSizeField offerSize() {
        return offerSize;
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
        cursor += 1;
        cursor += 4;
        cursor += 4;
        cursor += 5;
        runs.add(cursor).add(1);
        cursor += 1;
        for (int[] run = ExpirationBlock.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += ExpirationBlock.BYTE_LENGTH;
        cursor += 1;
        cursor += 4;
        cursor += 1;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        if (bestBidAppendagePresent()) {
            for (int[] run = BestBidAppendage.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
                runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
            }
            cursor += BestBidAppendage.BYTE_LENGTH;
        }
        if (bestOfferAppendagePresent()) {
            for (int[] run = BestOfferAppendage.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
                runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
            }
            cursor += BestOfferAppendage.BYTE_LENGTH;
        }
        if (bestBidAndOfferAppendagePresent()) {
            for (int[] run = BestBidAndOfferAppendage.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
                runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
            }
            cursor += BestBidAndOfferAppendage.BYTE_LENGTH;
        }
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
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!expirationBlock.parseFrom(data, cursor, end - 22)) {
            return false;
        }
        cursor += expirationBlock.byteLength();
        if (!strikePriceDenominatorCode.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceDenominatorCodeField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!premiumPriceDenominatorCode.parse(data, cursor)) {
            return false;
        }
        cursor += PremiumPriceDenominatorCodeField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!offerPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OfferPriceField.BYTE_LENGTH;
        if (!offerSize.parse(data, cursor)) {
            return false;
        }
        cursor += OfferSizeField.BYTE_LENGTH;
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
        cursor = securitySymbol.encode(data, cursor);
        if (buffer != null && buffer.length >= 15) {
            System.arraycopy(buffer, 14, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = expirationBlock.encode(data, cursor);
        cursor = strikePriceDenominatorCode.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = premiumPriceDenominatorCode.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = offerPrice.encode(data, cursor);
        cursor = offerSize.encode(data, cursor);
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
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "StrikePriceDenominatorCode" -> Optional.of(strikePriceDenominatorCode);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "PremiumPriceDenominatorCode" -> Optional.of(premiumPriceDenominatorCode);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidSize" -> Optional.of(bidSize);
            case "OfferPrice" -> Optional.of(offerPrice);
            case "OfferSize" -> Optional.of(offerSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LongEquityAndIndexQuoteMessage message)) {
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
        if (!(other instanceof LongEquityAndIndexQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && bestBidAppendage.equals(message.bestBidAppendage) && bestOfferAppendage.equals(message.bestOfferAppendage) && bestBidAndOfferAppendage.equals(message.bestBidAndOfferAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, bestBidAppendage, bestOfferAppendage, bestBidAndOfferAppendage);
    }
}
