package omi.siac.cqs.snapshot.cta.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.siac.cqs.snapshot.cta.v1_0.fields.BidPriceField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.BidSizeField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.HaltReasonField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.HighIndicationPriceField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.LowIndicationPriceField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.LuldIndicatorField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.MarketConditionField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.OfferPriceField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.OfferSizeField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.ParticipantIdField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.QuoteConditionField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.RetailInterestIndicatorField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.SecuritySymbolField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.SettlementConditionField;
import omi.siac.cqs.snapshot.cta.v1_0.types.Field;
import omi.siac.cqs.snapshot.cta.v1_0.types.Message;
import omi.siac.cqs.snapshot.cta.v1_0.types.PrintOptions;

/**
 * Represents the ParticipantSnapshotMessage message from the Snapshot protocol.
 *
 * <p>a SIP Generated Message used to report information for each Security Symbol</p>
 */
public final class ParticipantSnapshotMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'P';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 58;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Participant Snapshot Message";

    /**
     * Participant or Processor that generated the message
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * Contains the security symbol
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * Denotes a particular condition applicable to the quote.
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * Represents the highest price a prospective buyer is prepared to pay at a particular time for a security
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * The Bid Size identifies the number of round-lots, for a security
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Represents the lowest price acceptable to a prospective seller at a particular time for a security
     */
    private final OfferPriceField offerPrice = new OfferPriceField();

    /**
     * The Offer Size identifies the number of round-lots, for a security
     */
    private final OfferSizeField offerSize = new OfferSizeField();

    /**
     * When Retail Price Improvement (RPI) interest is priced better than the Protected Best Bid or Offer (PBBO) by a minimum of $0.001, an indication of interest on the Bid, Offer, or both the Bid and Offer will identify that interest will be eligible to interact with incoming Retail Order interest.
     */
    private final RetailInterestIndicatorField retailInterestIndicator = new RetailInterestIndicatorField();

    /**
     * Identifies the settlement condition for a security
     */
    private final SettlementConditionField settlementCondition = new SettlementConditionField();

    /**
     * Identifies the market condition of a quote for a security.
     */
    private final MarketConditionField marketCondition = new MarketConditionField();

    /**
     * Indicates the affect the Quote has on the Limit Up-Limit Down Price Band range.
     */
    private final LuldIndicatorField luldIndicator = new LuldIndicatorField();

    /**
     * The High Indication Price represents an approximation of what the high end ‘Offer’ price of a security's trading range may be.
     */
    private final HighIndicationPriceField highIndicationPrice = new HighIndicationPriceField();

    /**
     * The Low Indication Price represents an approximation of what the low end "Bid" price of a security's trading range may be
     */
    private final LowIndicationPriceField lowIndicationPrice = new LowIndicationPriceField();

    /**
     * Denotes the reason for the Trading Halt
     */
    private final HaltReasonField haltReason = new HaltReasonField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(participantId, securitySymbol, quoteCondition, bidPrice, bidSize, offerPrice, offerSize, retailInterestIndicator, settlementCondition, marketCondition, luldIndicator, highIndicationPrice, lowIndicationPrice, haltReason);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Participant or Processor that generated the message
     *
     * @return the ParticipantId field
     */
    public ParticipantIdField participantId() {
        return participantId;
    }

    /**
     * Contains the security symbol
     *
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
    }

    /**
     * Denotes a particular condition applicable to the quote.
     *
     * @return the QuoteCondition field
     */
    public QuoteConditionField quoteCondition() {
        return quoteCondition;
    }

    /**
     * Represents the highest price a prospective buyer is prepared to pay at a particular time for a security
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * The Bid Size identifies the number of round-lots, for a security
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Represents the lowest price acceptable to a prospective seller at a particular time for a security
     *
     * @return the OfferPrice field
     */
    public OfferPriceField offerPrice() {
        return offerPrice;
    }

    /**
     * The Offer Size identifies the number of round-lots, for a security
     *
     * @return the OfferSize field
     */
    public OfferSizeField offerSize() {
        return offerSize;
    }

    /**
     * When Retail Price Improvement (RPI) interest is priced better than the Protected Best Bid or Offer (PBBO) by a minimum of $0.001, an indication of interest on the Bid, Offer, or both the Bid and Offer will identify that interest will be eligible to interact with incoming Retail Order interest.
     *
     * @return the RetailInterestIndicator field
     */
    public RetailInterestIndicatorField retailInterestIndicator() {
        return retailInterestIndicator;
    }

    /**
     * Identifies the settlement condition for a security
     *
     * @return the SettlementCondition field
     */
    public SettlementConditionField settlementCondition() {
        return settlementCondition;
    }

    /**
     * Identifies the market condition of a quote for a security.
     *
     * @return the MarketCondition field
     */
    public MarketConditionField marketCondition() {
        return marketCondition;
    }

    /**
     * Indicates the affect the Quote has on the Limit Up-Limit Down Price Band range.
     *
     * @return the LuldIndicator field
     */
    public LuldIndicatorField luldIndicator() {
        return luldIndicator;
    }

    /**
     * The High Indication Price represents an approximation of what the high end ‘Offer’ price of a security's trading range may be.
     *
     * @return the HighIndicationPrice field
     */
    public HighIndicationPriceField highIndicationPrice() {
        return highIndicationPrice;
    }

    /**
     * The Low Indication Price represents an approximation of what the low end "Bid" price of a security's trading range may be
     *
     * @return the LowIndicationPrice field
     */
    public LowIndicationPriceField lowIndicationPrice() {
        return lowIndicationPrice;
    }

    /**
     * Denotes the reason for the Trading Halt
     *
     * @return the HaltReason field
     */
    public HaltReasonField haltReason() {
        return haltReason;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!participantId.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantIdField.BYTE_LENGTH;
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;
        if (!quoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteConditionField.BYTE_LENGTH;
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
        if (!retailInterestIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += RetailInterestIndicatorField.BYTE_LENGTH;
        if (!settlementCondition.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementConditionField.BYTE_LENGTH;
        if (!marketCondition.parse(data, cursor)) {
            return false;
        }
        cursor += MarketConditionField.BYTE_LENGTH;
        if (!luldIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LuldIndicatorField.BYTE_LENGTH;
        if (!highIndicationPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighIndicationPriceField.BYTE_LENGTH;
        if (!lowIndicationPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowIndicationPriceField.BYTE_LENGTH;
        return haltReason.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = participantId.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = offerPrice.encode(data, cursor);
        cursor = offerSize.encode(data, cursor);
        cursor = retailInterestIndicator.encode(data, cursor);
        cursor = settlementCondition.encode(data, cursor);
        cursor = marketCondition.encode(data, cursor);
        cursor = luldIndicator.encode(data, cursor);
        cursor = highIndicationPrice.encode(data, cursor);
        cursor = lowIndicationPrice.encode(data, cursor);
        cursor = haltReason.encode(data, cursor);
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
            case "ParticipantId" -> Optional.of(participantId);
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidSize" -> Optional.of(bidSize);
            case "OfferPrice" -> Optional.of(offerPrice);
            case "OfferSize" -> Optional.of(offerSize);
            case "RetailInterestIndicator" -> Optional.of(retailInterestIndicator);
            case "SettlementCondition" -> Optional.of(settlementCondition);
            case "MarketCondition" -> Optional.of(marketCondition);
            case "LuldIndicator" -> Optional.of(luldIndicator);
            case "HighIndicationPrice" -> Optional.of(highIndicationPrice);
            case "LowIndicationPrice" -> Optional.of(lowIndicationPrice);
            case "HaltReason" -> Optional.of(haltReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ParticipantSnapshotMessage message)) {
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
        if (!(other instanceof ParticipantSnapshotMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
