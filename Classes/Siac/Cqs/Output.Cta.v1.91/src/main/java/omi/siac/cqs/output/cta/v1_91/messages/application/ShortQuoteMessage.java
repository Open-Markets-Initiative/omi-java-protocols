package omi.siac.cqs.output.cta.v1_91.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.siac.cqs.output.cta.v1_91.fields.BidPriceShortField;
import omi.siac.cqs.output.cta.v1_91.fields.BidSizeShortField;
import omi.siac.cqs.output.cta.v1_91.fields.MessageIdField;
import omi.siac.cqs.output.cta.v1_91.fields.NationalBboIndicatorField;
import omi.siac.cqs.output.cta.v1_91.fields.OfferPriceShortField;
import omi.siac.cqs.output.cta.v1_91.fields.OfferSizeShortField;
import omi.siac.cqs.output.cta.v1_91.fields.ParticipantIdField;
import omi.siac.cqs.output.cta.v1_91.fields.ParticipantReferenceNumberField;
import omi.siac.cqs.output.cta.v1_91.fields.PrimaryListingMarketParticipantIdField;
import omi.siac.cqs.output.cta.v1_91.fields.SecuritySymbolShortField;
import omi.siac.cqs.output.cta.v1_91.fields.TransactionIdField;
import omi.siac.cqs.output.cta.v1_91.structs.NationalBestBidLongAppendage;
import omi.siac.cqs.output.cta.v1_91.structs.NationalBestBidShortAppendage;
import omi.siac.cqs.output.cta.v1_91.structs.NationalBestOfferLongAppendage;
import omi.siac.cqs.output.cta.v1_91.structs.NationalBestOfferShortAppendage;
import omi.siac.cqs.output.cta.v1_91.structs.ParticipantTimestamp;
import omi.siac.cqs.output.cta.v1_91.types.Field;
import omi.siac.cqs.output.cta.v1_91.types.Message;
import omi.siac.cqs.output.cta.v1_91.types.PrintOptions;

/**
 * Represents the ShortQuoteMessage message from the Output protocol.
 *
 * <p>The Auction Status message is used when a Participant in a Cta eligible security</p>
 */
public final class ShortQuoteMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Q';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 37;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Short Quote Message";

    /**
     * Participant or Processor that generated the message
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * The Message ID identifies the individual message within the block beginning with number one
     */
    private final MessageIdField messageId = new MessageIdField();

    /**
     * The Transaction Id will be populated by CQS and is Reserved for Internal Use only
     */
    private final TransactionIdField transactionId = new TransactionIdField();

    /**
     * Participant Reference Number is a pass-thru of the inbound Participant Reference number assigned to a transaction
     */
    private final ParticipantReferenceNumberField participantReferenceNumber = new ParticipantReferenceNumberField();

    /**
     * Contains the security symbol
     */
    private final SecuritySymbolShortField securitySymbolShort = new SecuritySymbolShortField();

    /**
     * Represents the highest price a prospective buyer is prepared to pay at a particular time for a security
     */
    private final BidPriceShortField bidPriceShort = new BidPriceShortField();

    /**
     * The Bid Size identifies the number of round-lots, for a security
     */
    private final BidSizeShortField bidSizeShort = new BidSizeShortField();

    /**
     * Represents the lowest price acceptable to a prospective seller at a particular time for a security
     */
    private final OfferPriceShortField offerPriceShort = new OfferPriceShortField();

    /**
     * The Offer Size identifies the number of round-lots, for a security
     */
    private final OfferSizeShortField offerSizeShort = new OfferSizeShortField();

    /**
     * Identifies the Primary Listing Market for a security
     */
    private final PrimaryListingMarketParticipantIdField primaryListingMarketParticipantId = new PrimaryListingMarketParticipantIdField();

    /**
     * Indicates the affect the new quote has on the National BBO.
     */
    private final NationalBboIndicatorField nationalBboIndicator = new NationalBboIndicatorField();

    /**
     * Participant Timestamp
     */
    private final ParticipantTimestamp participantTimestamp = new ParticipantTimestamp();

    /**
     * National Best Bid Long Appendage
     */
    private final NationalBestBidLongAppendage nationalBestBidLongAppendage = new NationalBestBidLongAppendage();

    /**
     * National Best Offer Long Appendage
     */
    private final NationalBestOfferLongAppendage nationalBestOfferLongAppendage = new NationalBestOfferLongAppendage();

    /**
     * National Best Bid Short Appendage
     */
    private final NationalBestBidShortAppendage nationalBestBidShortAppendage = new NationalBestBidShortAppendage();

    /**
     * National Best Offer Short Appendage
     */
    private final NationalBestOfferShortAppendage nationalBestOfferShortAppendage = new NationalBestOfferShortAppendage();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(participantId), participantTimestamp.fields(), List.<Field>of(messageId), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbolShort), List.<Field>of(bidPriceShort), List.<Field>of(bidSizeShort), List.<Field>of(offerPriceShort), List.<Field>of(offerSizeShort), List.<Field>of(primaryListingMarketParticipantId), List.<Field>of(nationalBboIndicator)).flatMap(List::stream).toList();

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
     * The Message ID identifies the individual message within the block beginning with number one
     *
     * @return the MessageId field
     */
    public MessageIdField messageId() {
        return messageId;
    }

    /**
     * The Transaction Id will be populated by CQS and is Reserved for Internal Use only
     *
     * @return the TransactionId field
     */
    public TransactionIdField transactionId() {
        return transactionId;
    }

    /**
     * Participant Reference Number is a pass-thru of the inbound Participant Reference number assigned to a transaction
     *
     * @return the ParticipantReferenceNumber field
     */
    public ParticipantReferenceNumberField participantReferenceNumber() {
        return participantReferenceNumber;
    }

    /**
     * Contains the security symbol
     *
     * @return the SecuritySymbolShort field
     */
    public SecuritySymbolShortField securitySymbolShort() {
        return securitySymbolShort;
    }

    /**
     * Represents the highest price a prospective buyer is prepared to pay at a particular time for a security
     *
     * @return the BidPriceShort field
     */
    public BidPriceShortField bidPriceShort() {
        return bidPriceShort;
    }

    /**
     * The Bid Size identifies the number of round-lots, for a security
     *
     * @return the BidSizeShort field
     */
    public BidSizeShortField bidSizeShort() {
        return bidSizeShort;
    }

    /**
     * Represents the lowest price acceptable to a prospective seller at a particular time for a security
     *
     * @return the OfferPriceShort field
     */
    public OfferPriceShortField offerPriceShort() {
        return offerPriceShort;
    }

    /**
     * The Offer Size identifies the number of round-lots, for a security
     *
     * @return the OfferSizeShort field
     */
    public OfferSizeShortField offerSizeShort() {
        return offerSizeShort;
    }

    /**
     * Identifies the Primary Listing Market for a security
     *
     * @return the PrimaryListingMarketParticipantId field
     */
    public PrimaryListingMarketParticipantIdField primaryListingMarketParticipantId() {
        return primaryListingMarketParticipantId;
    }

    /**
     * Indicates the affect the new quote has on the National BBO.
     *
     * @return the NationalBboIndicator field
     */
    public NationalBboIndicatorField nationalBboIndicator() {
        return nationalBboIndicator;
    }

    /**
     * Participant Timestamp
     *
     * @return the ParticipantTimestamp record
     */
    public ParticipantTimestamp participantTimestamp() {
        return participantTimestamp;
    }

    /**
     * National Best Bid Long Appendage
     *
     * @return the NationalBestBidLongAppendage record
     */
    public NationalBestBidLongAppendage nationalBestBidLongAppendage() {
        return nationalBestBidLongAppendage;
    }

    /**
     * National Best Offer Long Appendage
     *
     * @return the NationalBestOfferLongAppendage record
     */
    public NationalBestOfferLongAppendage nationalBestOfferLongAppendage() {
        return nationalBestOfferLongAppendage;
    }

    /**
     * National Best Bid Short Appendage
     *
     * @return the NationalBestBidShortAppendage record
     */
    public NationalBestBidShortAppendage nationalBestBidShortAppendage() {
        return nationalBestBidShortAppendage;
    }

    /**
     * National Best Offer Short Appendage
     *
     * @return the NationalBestOfferShortAppendage record
     */
    public NationalBestOfferShortAppendage nationalBestOfferShortAppendage() {
        return nationalBestOfferShortAppendage;
    }

    /**
     * Returns whether the fields before the NationalBestBidLongAppendage put it on the wire.
     *
     * <p>Decode reads the NationalBestBidLongAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NationalBestBidLongAppendage is on the wire
     */
    public boolean nationalBestBidLongAppendagePresent() {
        return nationalBboIndicator.rawValue() == 'U';
    }

    /**
     * Returns whether the fields before the NationalBestOfferLongAppendage put it on the wire.
     *
     * <p>Decode reads the NationalBestOfferLongAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NationalBestOfferLongAppendage is on the wire
     */
    public boolean nationalBestOfferLongAppendagePresent() {
        return nationalBboIndicator.rawValue() == 'U';
    }

    /**
     * Returns whether the fields before the NationalBestBidShortAppendage put it on the wire.
     *
     * <p>Decode reads the NationalBestBidShortAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NationalBestBidShortAppendage is on the wire
     */
    public boolean nationalBestBidShortAppendagePresent() {
        return nationalBboIndicator.rawValue() == 'T';
    }

    /**
     * Returns whether the fields before the NationalBestOfferShortAppendage put it on the wire.
     *
     * <p>Decode reads the NationalBestOfferShortAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NationalBestOfferShortAppendage is on the wire
     */
    public boolean nationalBestOfferShortAppendagePresent() {
        return nationalBboIndicator.rawValue() == 'T';
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (nationalBestBidLongAppendagePresent() ? nationalBestBidLongAppendage.byteLength() : 0) + (nationalBestOfferLongAppendagePresent() ? nationalBestOfferLongAppendage.byteLength() : 0) + (nationalBestBidShortAppendagePresent() ? nationalBestBidShortAppendage.byteLength() : 0) + (nationalBestOfferShortAppendagePresent() ? nationalBestOfferShortAppendage.byteLength() : 0);
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
        for (int[] run = ParticipantTimestamp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += ParticipantTimestamp.BYTE_LENGTH;
        cursor += 1;
        cursor += 4;
        cursor += 8;
        cursor += 5;
        cursor += 2;
        cursor += 2;
        cursor += 2;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        if (nationalBestBidLongAppendagePresent()) {
            for (int[] run = NationalBestBidLongAppendage.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
                runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
            }
            cursor += NationalBestBidLongAppendage.BYTE_LENGTH;
        }
        if (nationalBestOfferLongAppendagePresent()) {
            for (int[] run = NationalBestOfferLongAppendage.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
                runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
            }
            cursor += NationalBestOfferLongAppendage.BYTE_LENGTH;
        }
        if (nationalBestBidShortAppendagePresent()) {
            for (int[] run = NationalBestBidShortAppendage.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
                runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
            }
            cursor += NationalBestBidShortAppendage.BYTE_LENGTH;
        }
        if (nationalBestOfferShortAppendagePresent()) {
            for (int[] run = NationalBestOfferShortAppendage.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
                runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
            }
            cursor += NationalBestOfferShortAppendage.BYTE_LENGTH;
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
        if (!participantId.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantIdField.BYTE_LENGTH;
        if (!participantTimestamp.parseFrom(data, cursor, end - 28)) {
            return false;
        }
        cursor += participantTimestamp.byteLength();
        if (!messageId.parse(data, cursor)) {
            return false;
        }
        cursor += MessageIdField.BYTE_LENGTH;
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
        if (!primaryListingMarketParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryListingMarketParticipantIdField.BYTE_LENGTH;
        if (!nationalBboIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBboIndicatorField.BYTE_LENGTH;
        if (nationalBestBidLongAppendagePresent()) {
            if (!nationalBestBidLongAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += nationalBestBidLongAppendage.byteLength();
        }
        if (end - cursor < 0) {
            return false;
        }
        if (nationalBestOfferLongAppendagePresent()) {
            if (!nationalBestOfferLongAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += nationalBestOfferLongAppendage.byteLength();
        }
        if (end - cursor < 0) {
            return false;
        }
        if (nationalBestBidShortAppendagePresent()) {
            if (!nationalBestBidShortAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += nationalBestBidShortAppendage.byteLength();
        }
        if (end - cursor < 0) {
            return false;
        }
        if (nationalBestOfferShortAppendagePresent()) {
            if (!nationalBestOfferShortAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += nationalBestOfferShortAppendage.byteLength();
        }
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = participantId.encode(data, cursor);
        cursor = participantTimestamp.encode(data, cursor);
        cursor = messageId.encode(data, cursor);
        cursor = transactionId.encode(data, cursor);
        cursor = participantReferenceNumber.encode(data, cursor);
        cursor = securitySymbolShort.encode(data, cursor);
        cursor = bidPriceShort.encode(data, cursor);
        cursor = bidSizeShort.encode(data, cursor);
        cursor = offerPriceShort.encode(data, cursor);
        cursor = offerSizeShort.encode(data, cursor);
        cursor = primaryListingMarketParticipantId.encode(data, cursor);
        cursor = nationalBboIndicator.encode(data, cursor);
        if (nationalBestBidLongAppendagePresent()) {
            cursor = nationalBestBidLongAppendage.encode(data, cursor);
        }
        if (nationalBestOfferLongAppendagePresent()) {
            cursor = nationalBestOfferLongAppendage.encode(data, cursor);
        }
        if (nationalBestBidShortAppendagePresent()) {
            cursor = nationalBestBidShortAppendage.encode(data, cursor);
        }
        if (nationalBestOfferShortAppendagePresent()) {
            cursor = nationalBestOfferShortAppendage.encode(data, cursor);
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
        participantTimestamp.clear();
        nationalBestBidLongAppendage.clear();
        nationalBestOfferLongAppendage.clear();
        nationalBestBidShortAppendage.clear();
        nationalBestOfferShortAppendage.clear();
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
        if (nationalBestBidLongAppendagePresent() && !nationalBestBidLongAppendage.isRecognized()) {
            return false;
        }
        if (nationalBestOfferLongAppendagePresent() && !nationalBestOfferLongAppendage.isRecognized()) {
            return false;
        }
        if (nationalBestBidShortAppendagePresent() && !nationalBestBidShortAppendage.isRecognized()) {
            return false;
        }
        if (nationalBestOfferShortAppendagePresent() && !nationalBestOfferShortAppendage.isRecognized()) {
            return false;
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
        if (nationalBestBidLongAppendagePresent() && !nationalBestBidLongAppendage.isValid()) {
            return false;
        }
        if (nationalBestOfferLongAppendagePresent() && !nationalBestOfferLongAppendage.isValid()) {
            return false;
        }
        if (nationalBestBidShortAppendagePresent() && !nationalBestBidShortAppendage.isValid()) {
            return false;
        }
        if (nationalBestOfferShortAppendagePresent() && !nationalBestOfferShortAppendage.isValid()) {
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
            case "ParticipantId" -> Optional.of(participantId);
            case "MessageId" -> Optional.of(messageId);
            case "TransactionId" -> Optional.of(transactionId);
            case "ParticipantReferenceNumber" -> Optional.of(participantReferenceNumber);
            case "SecuritySymbolShort" -> Optional.of(securitySymbolShort);
            case "BidPriceShort" -> Optional.of(bidPriceShort);
            case "BidSizeShort" -> Optional.of(bidSizeShort);
            case "OfferPriceShort" -> Optional.of(offerPriceShort);
            case "OfferSizeShort" -> Optional.of(offerSizeShort);
            case "PrimaryListingMarketParticipantId" -> Optional.of(primaryListingMarketParticipantId);
            case "NationalBboIndicator" -> Optional.of(nationalBboIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ShortQuoteMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(nationalBestBidLongAppendage.diffFields(message.nationalBestBidLongAppendage));
        changed.addAll(nationalBestOfferLongAppendage.diffFields(message.nationalBestOfferLongAppendage));
        changed.addAll(nationalBestBidShortAppendage.diffFields(message.nationalBestBidShortAppendage));
        changed.addAll(nationalBestOfferShortAppendage.diffFields(message.nationalBestOfferShortAppendage));
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
            if (nationalBestBidLongAppendagePresent()) {
                builder.append(", ");
                nationalBestBidLongAppendage.toFormattedString(builder, options);
            }
            if (nationalBestOfferLongAppendagePresent()) {
                builder.append(", ");
                nationalBestOfferLongAppendage.toFormattedString(builder, options);
            }
            if (nationalBestBidShortAppendagePresent()) {
                builder.append(", ");
                nationalBestBidShortAppendage.toFormattedString(builder, options);
            }
            if (nationalBestOfferShortAppendagePresent()) {
                builder.append(", ");
                nationalBestOfferShortAppendage.toFormattedString(builder, options);
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
        if (nationalBestBidLongAppendagePresent()) {
            nationalBestBidLongAppendage.toFormattedString(builder, nested);
        }
        if (nationalBestOfferLongAppendagePresent()) {
            nationalBestOfferLongAppendage.toFormattedString(builder, nested);
        }
        if (nationalBestBidShortAppendagePresent()) {
            nationalBestBidShortAppendage.toFormattedString(builder, nested);
        }
        if (nationalBestOfferShortAppendagePresent()) {
            nationalBestOfferShortAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof ShortQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && nationalBestBidLongAppendage.equals(message.nationalBestBidLongAppendage) && nationalBestOfferLongAppendage.equals(message.nationalBestOfferLongAppendage) && nationalBestBidShortAppendage.equals(message.nationalBestBidShortAppendage) && nationalBestOfferShortAppendage.equals(message.nationalBestOfferShortAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, nationalBestBidLongAppendage, nationalBestOfferLongAppendage, nationalBestBidShortAppendage, nationalBestOfferShortAppendage);
    }
}
