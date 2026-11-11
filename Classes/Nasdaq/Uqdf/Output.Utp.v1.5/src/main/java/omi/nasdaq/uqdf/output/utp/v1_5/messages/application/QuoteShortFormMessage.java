package omi.nasdaq.uqdf.output.utp.v1_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.AskPriceShortField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.AskSizeShortField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.BidPriceShortField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.BidSizeShortField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.LuldBboIndicatorField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.LuldNationalBboIndicatorField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.NbboAppendageIndicatorField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.QuoteConditionField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.RetailInterestIndicatorField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.SipGeneratedUpdateField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.SymbolShortField;
import omi.nasdaq.uqdf.output.utp.v1_5.structs.LongFormNationalBboAppendage;
import omi.nasdaq.uqdf.output.utp.v1_5.structs.MessageInfo;
import omi.nasdaq.uqdf.output.utp.v1_5.structs.ShortFormNationalBboAppendage;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Field;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Message;
import omi.nasdaq.uqdf.output.utp.v1_5.types.PrintOptions;

/**
 * Represents the QuoteShortFormMessage message from the Output protocol.
 *
 * <p>Used to disseminate quotation data for NASDAQ listed securities</p>
 */
public final class QuoteShortFormMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'E';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 45;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Short Form Message";

    /**
     * Security Identifier
     */
    private final SymbolShortField symbolShort = new SymbolShortField();

    /**
     * Bid Price Short
     */
    private final BidPriceShortField bidPriceShort = new BidPriceShortField();

    /**
     * Bid Size short
     */
    private final BidSizeShortField bidSizeShort = new BidSizeShortField();

    /**
     * Ask Price short
     */
    private final AskPriceShortField askPriceShort = new AskPriceShortField();

    /**
     * Ask Size short
     */
    private final AskSizeShortField askSizeShort = new AskSizeShortField();

    /**
     * Quote Condition
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * SIP Generated Update
     */
    private final SipGeneratedUpdateField sipGeneratedUpdate = new SipGeneratedUpdateField();

    /**
     * LULD BBO Indicator
     */
    private final LuldBboIndicatorField luldBboIndicator = new LuldBboIndicatorField();

    /**
     * Retail Interest Indicator
     */
    private final RetailInterestIndicatorField retailInterestIndicator = new RetailInterestIndicatorField();

    /**
     * NBBO Appendage Indicator
     */
    private final NbboAppendageIndicatorField nbboAppendageIndicator = new NbboAppendageIndicatorField();

    /**
     * LULD National BBO Indicator
     */
    private final LuldNationalBboIndicatorField luldNationalBboIndicator = new LuldNationalBboIndicatorField();

    /**
     * Message Info
     */
    private final MessageInfo messageInfo = new MessageInfo();

    /**
     * Short Form National BBO Appendage
     */
    private final ShortFormNationalBboAppendage shortFormNationalBboAppendage = new ShortFormNationalBboAppendage();

    /**
     * Long Form National BBO Appendage
     */
    private final LongFormNationalBboAppendage longFormNationalBboAppendage = new LongFormNationalBboAppendage();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(messageInfo.fields(), List.<Field>of(symbolShort), List.<Field>of(bidPriceShort), List.<Field>of(bidSizeShort), List.<Field>of(askPriceShort), List.<Field>of(askSizeShort), List.<Field>of(quoteCondition), List.<Field>of(sipGeneratedUpdate), List.<Field>of(luldBboIndicator), List.<Field>of(retailInterestIndicator), List.<Field>of(nbboAppendageIndicator), List.<Field>of(luldNationalBboIndicator)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Security Identifier
     *
     * @return the SymbolShort field
     */
    public SymbolShortField symbolShort() {
        return symbolShort;
    }

    /**
     * Bid Price Short
     *
     * @return the BidPriceShort field
     */
    public BidPriceShortField bidPriceShort() {
        return bidPriceShort;
    }

    /**
     * Bid Size short
     *
     * @return the BidSizeShort field
     */
    public BidSizeShortField bidSizeShort() {
        return bidSizeShort;
    }

    /**
     * Ask Price short
     *
     * @return the AskPriceShort field
     */
    public AskPriceShortField askPriceShort() {
        return askPriceShort;
    }

    /**
     * Ask Size short
     *
     * @return the AskSizeShort field
     */
    public AskSizeShortField askSizeShort() {
        return askSizeShort;
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
     * SIP Generated Update
     *
     * @return the SipGeneratedUpdate field
     */
    public SipGeneratedUpdateField sipGeneratedUpdate() {
        return sipGeneratedUpdate;
    }

    /**
     * LULD BBO Indicator
     *
     * @return the LuldBboIndicator field
     */
    public LuldBboIndicatorField luldBboIndicator() {
        return luldBboIndicator;
    }

    /**
     * Retail Interest Indicator
     *
     * @return the RetailInterestIndicator field
     */
    public RetailInterestIndicatorField retailInterestIndicator() {
        return retailInterestIndicator;
    }

    /**
     * NBBO Appendage Indicator
     *
     * @return the NbboAppendageIndicator field
     */
    public NbboAppendageIndicatorField nbboAppendageIndicator() {
        return nbboAppendageIndicator;
    }

    /**
     * LULD National BBO Indicator
     *
     * @return the LuldNationalBboIndicator field
     */
    public LuldNationalBboIndicatorField luldNationalBboIndicator() {
        return luldNationalBboIndicator;
    }

    /**
     * Message Info
     *
     * @return the MessageInfo record
     */
    public MessageInfo messageInfo() {
        return messageInfo;
    }

    /**
     * Short Form National BBO Appendage
     *
     * @return the ShortFormNationalBboAppendage record
     */
    public ShortFormNationalBboAppendage shortFormNationalBboAppendage() {
        return shortFormNationalBboAppendage;
    }

    /**
     * Long Form National BBO Appendage
     *
     * @return the LongFormNationalBboAppendage record
     */
    public LongFormNationalBboAppendage longFormNationalBboAppendage() {
        return longFormNationalBboAppendage;
    }

    /**
     * Returns whether the fields before the ShortFormNationalBboAppendage put it on the wire.
     *
     * <p>Decode reads the ShortFormNationalBboAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ShortFormNationalBboAppendage is on the wire
     */
    public boolean shortFormNationalBboAppendagePresent() {
        return nbboAppendageIndicator.rawValue() == '2';
    }

    /**
     * Returns whether the fields before the LongFormNationalBboAppendage put it on the wire.
     *
     * <p>Decode reads the LongFormNationalBboAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LongFormNationalBboAppendage is on the wire
     */
    public boolean longFormNationalBboAppendagePresent() {
        return nbboAppendageIndicator.rawValue() == '3';
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (shortFormNationalBboAppendagePresent() ? shortFormNationalBboAppendage.byteLength() : 0) + (longFormNationalBboAppendagePresent() ? longFormNationalBboAppendage.byteLength() : 0);
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
        return Optional.ofNullable(messageInfo.sipTimestamp().value());
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
        if (!messageInfo.parseFrom(data, cursor, end - 19)) {
            return false;
        }
        cursor += messageInfo.byteLength();
        if (!symbolShort.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolShortField.BYTE_LENGTH;
        if (!bidPriceShort.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceShortField.BYTE_LENGTH;
        if (!bidSizeShort.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeShortField.BYTE_LENGTH;
        if (!askPriceShort.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceShortField.BYTE_LENGTH;
        if (!askSizeShort.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeShortField.BYTE_LENGTH;
        if (!quoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteConditionField.BYTE_LENGTH;
        if (!sipGeneratedUpdate.parse(data, cursor)) {
            return false;
        }
        cursor += SipGeneratedUpdateField.BYTE_LENGTH;
        if (!luldBboIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LuldBboIndicatorField.BYTE_LENGTH;
        if (!retailInterestIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += RetailInterestIndicatorField.BYTE_LENGTH;
        if (!nbboAppendageIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += NbboAppendageIndicatorField.BYTE_LENGTH;
        if (!luldNationalBboIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LuldNationalBboIndicatorField.BYTE_LENGTH;
        if (shortFormNationalBboAppendagePresent()) {
            if (!shortFormNationalBboAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += shortFormNationalBboAppendage.byteLength();
        }
        if (end - cursor < 0) {
            return false;
        }
        if (longFormNationalBboAppendagePresent()) {
            if (!longFormNationalBboAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += longFormNationalBboAppendage.byteLength();
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = messageInfo.encode(data, cursor);
        cursor = symbolShort.encode(data, cursor);
        cursor = bidPriceShort.encode(data, cursor);
        cursor = bidSizeShort.encode(data, cursor);
        cursor = askPriceShort.encode(data, cursor);
        cursor = askSizeShort.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = sipGeneratedUpdate.encode(data, cursor);
        cursor = luldBboIndicator.encode(data, cursor);
        cursor = retailInterestIndicator.encode(data, cursor);
        cursor = nbboAppendageIndicator.encode(data, cursor);
        cursor = luldNationalBboIndicator.encode(data, cursor);
        if (shortFormNationalBboAppendagePresent()) {
            cursor = shortFormNationalBboAppendage.encode(data, cursor);
        }
        if (longFormNationalBboAppendagePresent()) {
            cursor = longFormNationalBboAppendage.encode(data, cursor);
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
        messageInfo.clear();
        shortFormNationalBboAppendage.clear();
        longFormNationalBboAppendage.clear();
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
        if (shortFormNationalBboAppendagePresent() && !shortFormNationalBboAppendage.isRecognized()) {
            return false;
        }
        return !longFormNationalBboAppendagePresent() || longFormNationalBboAppendage.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (shortFormNationalBboAppendagePresent() && !shortFormNationalBboAppendage.isValid()) {
            return false;
        }
        if (longFormNationalBboAppendagePresent() && !longFormNationalBboAppendage.isValid()) {
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
            case "SymbolShort" -> Optional.of(symbolShort);
            case "BidPriceShort" -> Optional.of(bidPriceShort);
            case "BidSizeShort" -> Optional.of(bidSizeShort);
            case "AskPriceShort" -> Optional.of(askPriceShort);
            case "AskSizeShort" -> Optional.of(askSizeShort);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "SipGeneratedUpdate" -> Optional.of(sipGeneratedUpdate);
            case "LuldBboIndicator" -> Optional.of(luldBboIndicator);
            case "RetailInterestIndicator" -> Optional.of(retailInterestIndicator);
            case "NbboAppendageIndicator" -> Optional.of(nbboAppendageIndicator);
            case "LuldNationalBboIndicator" -> Optional.of(luldNationalBboIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteShortFormMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(shortFormNationalBboAppendage.diffFields(message.shortFormNationalBboAppendage));
        changed.addAll(longFormNationalBboAppendage.diffFields(message.longFormNationalBboAppendage));
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
            if (shortFormNationalBboAppendagePresent()) {
                builder.append(", ");
                shortFormNationalBboAppendage.toFormattedString(builder, options);
            }
            if (longFormNationalBboAppendagePresent()) {
                builder.append(", ");
                longFormNationalBboAppendage.toFormattedString(builder, options);
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
        if (shortFormNationalBboAppendagePresent()) {
            shortFormNationalBboAppendage.toFormattedString(builder, nested);
        }
        if (longFormNationalBboAppendagePresent()) {
            longFormNationalBboAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof QuoteShortFormMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && shortFormNationalBboAppendage.equals(message.shortFormNationalBboAppendage) && longFormNationalBboAppendage.equals(message.longFormNationalBboAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, shortFormNationalBboAppendage, longFormNationalBboAppendage);
    }
}
