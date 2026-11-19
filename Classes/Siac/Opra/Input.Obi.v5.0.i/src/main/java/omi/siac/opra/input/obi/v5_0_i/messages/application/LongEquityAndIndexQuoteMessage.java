package omi.siac.opra.input.obi.v5_0_i.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.siac.opra.input.obi.v5_0_i.fields.BidPriceField;
import omi.siac.opra.input.obi.v5_0_i.fields.BidSizeField;
import omi.siac.opra.input.obi.v5_0_i.fields.OfferPriceField;
import omi.siac.opra.input.obi.v5_0_i.fields.OfferSizeField;
import omi.siac.opra.input.obi.v5_0_i.fields.ParticipantReferenceNumberField;
import omi.siac.opra.input.obi.v5_0_i.fields.PremiumPriceDenominatorCodeField;
import omi.siac.opra.input.obi.v5_0_i.fields.SecuritySymbolField;
import omi.siac.opra.input.obi.v5_0_i.fields.SessionIndicatorField;
import omi.siac.opra.input.obi.v5_0_i.fields.StrikePriceDenominatorCodeField;
import omi.siac.opra.input.obi.v5_0_i.fields.StrikePriceField;
import omi.siac.opra.input.obi.v5_0_i.structs.ExpirationBlock;
import omi.siac.opra.input.obi.v5_0_i.types.Field;
import omi.siac.opra.input.obi.v5_0_i.types.Message;
import omi.siac.opra.input.obi.v5_0_i.types.PrintOptions;

/**
 * Represents the LongEquityAndIndexQuoteMessage message from the Input protocol.
 *
 * <p>Long Equity and Index Quote message containing a full quote using four byte integers for prices and sizes</p>
 */
public final class LongEquityAndIndexQuoteMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Long Equity And Index Quote Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 10, 1 };

    /**
     * Session Indicator value on messages from Participant to OPRA. 0x00 for regular trading session, 0x01 to 0x05 for Pre-Market trading session (Global Trading Hours).
     */
    private final SessionIndicatorField sessionIndicator = new SessionIndicatorField();

    /**
     * Optional reference number for use by the Participant. Does not need to be unique on a per security basis.
     */
    private final ParticipantReferenceNumberField participantReferenceNumber = new ParticipantReferenceNumberField();

    /**
     * The security symbol is used for Equity and Index options. It identifies the unique symbol assigned to the underlying security. Left justified, space filled.
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * Indicates the position of the floating decimal point within the Strike Price field.
     */
    private final StrikePriceDenominatorCodeField strikePriceDenominatorCode = new StrikePriceDenominatorCodeField();

    /**
     * The Strike Price of the option series.
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Indicates the position of the floating decimal point within the Premium Price field.
     */
    private final PremiumPriceDenominatorCodeField premiumPriceDenominatorCode = new PremiumPriceDenominatorCodeField();

    /**
     * Represents the price at which a buyer is willing to buy an option.
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * Number of contracts at the Bid Price.
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Represents the price at which a seller is offering to sell an option.
     */
    private final OfferPriceField offerPrice = new OfferPriceField();

    /**
     * Number of contracts at the Offer Price.
     */
    private final OfferSizeField offerSize = new OfferSizeField();

    /**
     * Expiration Block
     */
    private final ExpirationBlock expirationBlock = new ExpirationBlock();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(sessionIndicator), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbol), expirationBlock.fields(), List.<Field>of(strikePriceDenominatorCode), List.<Field>of(strikePrice), List.<Field>of(premiumPriceDenominatorCode), List.<Field>of(bidPrice), List.<Field>of(bidSize), List.<Field>of(offerPrice), List.<Field>of(offerSize)).flatMap(List::stream).toList();

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
     * The security symbol is used for Equity and Index options. It identifies the unique symbol assigned to the underlying security. Left justified, space filled.
     *
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
    }

    /**
     * Indicates the position of the floating decimal point within the Strike Price field.
     *
     * @return the StrikePriceDenominatorCode field
     */
    public StrikePriceDenominatorCodeField strikePriceDenominatorCode() {
        return strikePriceDenominatorCode;
    }

    /**
     * The Strike Price of the option series.
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Indicates the position of the floating decimal point within the Premium Price field.
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
     * Number of contracts at the Bid Price.
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
     * Number of contracts at the Offer Price.
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
        return offerSize.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sessionIndicator.encode(data, cursor);
        cursor = participantReferenceNumber.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        if (buffer != null && buffer.length >= 11) {
            System.arraycopy(buffer, 10, data, cursor, 1); // padding
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
        if (!(other instanceof LongEquityAndIndexQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
