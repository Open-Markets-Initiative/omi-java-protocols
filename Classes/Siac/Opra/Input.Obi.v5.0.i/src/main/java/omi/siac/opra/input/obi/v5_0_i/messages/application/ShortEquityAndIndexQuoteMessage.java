package omi.siac.opra.input.obi.v5_0_i.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.siac.opra.input.obi.v5_0_i.fields.BidPriceShortField;
import omi.siac.opra.input.obi.v5_0_i.fields.BidSizeShortField;
import omi.siac.opra.input.obi.v5_0_i.fields.OfferPriceShortField;
import omi.siac.opra.input.obi.v5_0_i.fields.OfferSizeShortField;
import omi.siac.opra.input.obi.v5_0_i.fields.ParticipantReferenceNumberField;
import omi.siac.opra.input.obi.v5_0_i.fields.SecuritySymbolShortField;
import omi.siac.opra.input.obi.v5_0_i.fields.SessionIndicatorField;
import omi.siac.opra.input.obi.v5_0_i.fields.StrikePriceShortField;
import omi.siac.opra.input.obi.v5_0_i.structs.ExpirationBlock;
import omi.siac.opra.input.obi.v5_0_i.types.Field;
import omi.siac.opra.input.obi.v5_0_i.types.Message;
import omi.siac.opra.input.obi.v5_0_i.types.PrintOptions;

/**
 * Represents the ShortEquityAndIndexQuoteMessage message from the Input protocol.
 *
 * <p>Short Equity and Index Quote message containing a short quote using two byte unsigned integers for prices and sizes</p>
 */
public final class ShortEquityAndIndexQuoteMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 22;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Short Equity And Index Quote Message";

    /**
     * Session Indicator value on messages from Participant to OPRA. 0x00 for regular trading session, 0x01 to 0x05 for Pre-Market trading session (Global Trading Hours).
     */
    private final SessionIndicatorField sessionIndicator = new SessionIndicatorField();

    /**
     * Optional reference number for use by the Participant. Does not need to be unique on a per security basis.
     */
    private final ParticipantReferenceNumberField participantReferenceNumber = new ParticipantReferenceNumberField();

    /**
     * Security Symbol restricted to four characters for short quote messages (category 'q'). Left justified, space filled.
     */
    private final SecuritySymbolShortField securitySymbolShort = new SecuritySymbolShortField();

    /**
     * The Strike Price of the option series with implied Denominator Code A. Short quote variant.
     */
    private final StrikePriceShortField strikePriceShort = new StrikePriceShortField();

    /**
     * Bid Price with implied Premium Denominator Code B. Short quote variant.
     */
    private final BidPriceShortField bidPriceShort = new BidPriceShortField();

    /**
     * Number of contracts at the Bid Price. Short quote variant.
     */
    private final BidSizeShortField bidSizeShort = new BidSizeShortField();

    /**
     * Offer Price with implied Premium Denominator Code B. Short quote variant.
     */
    private final OfferPriceShortField offerPriceShort = new OfferPriceShortField();

    /**
     * Number of contracts at the Offer Price. Short quote variant.
     */
    private final OfferSizeShortField offerSizeShort = new OfferSizeShortField();

    /**
     * Expiration Block
     */
    private final ExpirationBlock expirationBlock = new ExpirationBlock();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(sessionIndicator), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbolShort), expirationBlock.fields(), List.<Field>of(strikePriceShort), List.<Field>of(bidPriceShort), List.<Field>of(bidSizeShort), List.<Field>of(offerPriceShort), List.<Field>of(offerSizeShort)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Session Indicator value on messages from Participant to OPRA. 0x00 for regular trading session, 0x01 to 0x05 for Pre-Market trading session (Global Trading Hours).
     *
     * @return the SessionIndicator field
     */
    public SessionIndicatorField sessionIndicator() {
        return sessionIndicator;
    }

    /**
     * Optional reference number for use by the Participant. Does not need to be unique on a per security basis.
     *
     * @return the ParticipantReferenceNumber field
     */
    public ParticipantReferenceNumberField participantReferenceNumber() {
        return participantReferenceNumber;
    }

    /**
     * Security Symbol restricted to four characters for short quote messages (category 'q'). Left justified, space filled.
     *
     * @return the SecuritySymbolShort field
     */
    public SecuritySymbolShortField securitySymbolShort() {
        return securitySymbolShort;
    }

    /**
     * The Strike Price of the option series with implied Denominator Code A. Short quote variant.
     *
     * @return the StrikePriceShort field
     */
    public StrikePriceShortField strikePriceShort() {
        return strikePriceShort;
    }

    /**
     * Bid Price with implied Premium Denominator Code B. Short quote variant.
     *
     * @return the BidPriceShort field
     */
    public BidPriceShortField bidPriceShort() {
        return bidPriceShort;
    }

    /**
     * Number of contracts at the Bid Price. Short quote variant.
     *
     * @return the BidSizeShort field
     */
    public BidSizeShortField bidSizeShort() {
        return bidSizeShort;
    }

    /**
     * Offer Price with implied Premium Denominator Code B. Short quote variant.
     *
     * @return the OfferPriceShort field
     */
    public OfferPriceShortField offerPriceShort() {
        return offerPriceShort;
    }

    /**
     * Number of contracts at the Offer Price. Short quote variant.
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
        if (!sessionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SessionIndicatorField.BYTE_LENGTH;
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
        return offerSizeShort.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sessionIndicator.encode(data, cursor);
        cursor = participantReferenceNumber.encode(data, cursor);
        cursor = securitySymbolShort.encode(data, cursor);
        cursor = expirationBlock.encode(data, cursor);
        cursor = strikePriceShort.encode(data, cursor);
        cursor = bidPriceShort.encode(data, cursor);
        cursor = bidSizeShort.encode(data, cursor);
        cursor = offerPriceShort.encode(data, cursor);
        cursor = offerSizeShort.encode(data, cursor);
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
        expirationBlock.clear();
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
            case "SessionIndicator" -> Optional.of(sessionIndicator);
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
        if (!(other instanceof ShortEquityAndIndexQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
