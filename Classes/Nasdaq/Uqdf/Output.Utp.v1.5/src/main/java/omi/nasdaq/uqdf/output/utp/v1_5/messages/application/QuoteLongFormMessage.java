package omi.nasdaq.uqdf.output.utp.v1_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.AskPriceField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.AskSizeField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.BidPriceField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.BidSizeField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.FinraAdfMpidAppendageIndicatorField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.FinraTimestampField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.LuldBboIndicatorField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.LuldNationalBboIndicatorField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.NbboAppendageIndicatorField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.QuoteConditionField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.RetailInterestIndicatorField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.SipGeneratedUpdateField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.SymbolLongField;
import omi.nasdaq.uqdf.output.utp.v1_5.structs.FinraAdfMpidAppendage;
import omi.nasdaq.uqdf.output.utp.v1_5.structs.LongFormNationalBboAppendage;
import omi.nasdaq.uqdf.output.utp.v1_5.structs.MessageInfo;
import omi.nasdaq.uqdf.output.utp.v1_5.structs.ShortFormNationalBboAppendage;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Field;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Message;
import omi.nasdaq.uqdf.output.utp.v1_5.types.PrintOptions;

/**
 * Represents the QuoteLongFormMessage message from the Output protocol.
 *
 * <p>Used to disseminate quotation data for NASDAQ listed securities</p>
 */
public final class QuoteLongFormMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'F';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 76;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Long Form Message";

    /**
     * FINRA Timestamp
     */
    private final FinraTimestampField finraTimestamp = new FinraTimestampField();

    /**
     * Security Identifier
     */
    private final SymbolLongField symbolLong = new SymbolLongField();

    /**
     * Bid Price
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * Bid Size
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Ask Price
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * Ask Size
     */
    private final AskSizeField askSize = new AskSizeField();

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
     * FINRA ADF MPID Appendage Indicator
     */
    private final FinraAdfMpidAppendageIndicatorField finraAdfMpidAppendageIndicator = new FinraAdfMpidAppendageIndicatorField();

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
     * FINRA ADF MPID Appendage
     */
    private final FinraAdfMpidAppendage finraAdfMpidAppendage = new FinraAdfMpidAppendage();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(messageInfo.fields(), List.<Field>of(finraTimestamp), List.<Field>of(symbolLong), List.<Field>of(bidPrice), List.<Field>of(bidSize), List.<Field>of(askPrice), List.<Field>of(askSize), List.<Field>of(quoteCondition), List.<Field>of(sipGeneratedUpdate), List.<Field>of(luldBboIndicator), List.<Field>of(retailInterestIndicator), List.<Field>of(nbboAppendageIndicator), List.<Field>of(luldNationalBboIndicator), List.<Field>of(finraAdfMpidAppendageIndicator)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * FINRA Timestamp
     *
     * @return the FinraTimestamp field
     */
    public FinraTimestampField finraTimestamp() {
        return finraTimestamp;
    }

    /**
     * Security Identifier
     *
     * @return the SymbolLong field
     */
    public SymbolLongField symbolLong() {
        return symbolLong;
    }

    /**
     * Bid Price
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
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
     * Ask Price
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * Ask Size
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
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
     * FINRA ADF MPID Appendage Indicator
     *
     * @return the FinraAdfMpidAppendageIndicator field
     */
    public FinraAdfMpidAppendageIndicatorField finraAdfMpidAppendageIndicator() {
        return finraAdfMpidAppendageIndicator;
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
     * FINRA ADF MPID Appendage
     *
     * @return the FinraAdfMpidAppendage record
     */
    public FinraAdfMpidAppendage finraAdfMpidAppendage() {
        return finraAdfMpidAppendage;
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

    /**
     * Returns whether the fields before the FinraAdfMpidAppendage put it on the wire.
     *
     * <p>Decode reads the FinraAdfMpidAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FinraAdfMpidAppendage is on the wire
     */
    public boolean finraAdfMpidAppendagePresent() {
        return finraAdfMpidAppendageIndicator.rawValue() == '2';
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (shortFormNationalBboAppendagePresent() ? shortFormNationalBboAppendage.byteLength() : 0) + (longFormNationalBboAppendagePresent() ? longFormNationalBboAppendage.byteLength() : 0) + (finraAdfMpidAppendagePresent() ? finraAdfMpidAppendage.byteLength() : 0);
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
        if (!messageInfo.parseFrom(data, cursor, end - 50)) {
            return false;
        }
        cursor += messageInfo.byteLength();
        if (!finraTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += FinraTimestampField.BYTE_LENGTH;
        if (!symbolLong.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolLongField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
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
        if (!finraAdfMpidAppendageIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FinraAdfMpidAppendageIndicatorField.BYTE_LENGTH;
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
        if (end - cursor < 0) {
            return false;
        }
        if (finraAdfMpidAppendagePresent()) {
            if (!finraAdfMpidAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += finraAdfMpidAppendage.byteLength();
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = messageInfo.encode(data, cursor);
        cursor = finraTimestamp.encode(data, cursor);
        cursor = symbolLong.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = sipGeneratedUpdate.encode(data, cursor);
        cursor = luldBboIndicator.encode(data, cursor);
        cursor = retailInterestIndicator.encode(data, cursor);
        cursor = nbboAppendageIndicator.encode(data, cursor);
        cursor = luldNationalBboIndicator.encode(data, cursor);
        cursor = finraAdfMpidAppendageIndicator.encode(data, cursor);
        if (shortFormNationalBboAppendagePresent()) {
            cursor = shortFormNationalBboAppendage.encode(data, cursor);
        }
        if (longFormNationalBboAppendagePresent()) {
            cursor = longFormNationalBboAppendage.encode(data, cursor);
        }
        if (finraAdfMpidAppendagePresent()) {
            cursor = finraAdfMpidAppendage.encode(data, cursor);
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
        finraAdfMpidAppendage.clear();
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
        if (longFormNationalBboAppendagePresent() && !longFormNationalBboAppendage.isRecognized()) {
            return false;
        }
        return !finraAdfMpidAppendagePresent() || finraAdfMpidAppendage.isRecognized();
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
        if (finraAdfMpidAppendagePresent() && !finraAdfMpidAppendage.isValid()) {
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
            case "FinraTimestamp" -> Optional.of(finraTimestamp);
            case "SymbolLong" -> Optional.of(symbolLong);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidSize" -> Optional.of(bidSize);
            case "AskPrice" -> Optional.of(askPrice);
            case "AskSize" -> Optional.of(askSize);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "SipGeneratedUpdate" -> Optional.of(sipGeneratedUpdate);
            case "LuldBboIndicator" -> Optional.of(luldBboIndicator);
            case "RetailInterestIndicator" -> Optional.of(retailInterestIndicator);
            case "NbboAppendageIndicator" -> Optional.of(nbboAppendageIndicator);
            case "LuldNationalBboIndicator" -> Optional.of(luldNationalBboIndicator);
            case "FinraAdfMpidAppendageIndicator" -> Optional.of(finraAdfMpidAppendageIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteLongFormMessage message)) {
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
        changed.addAll(finraAdfMpidAppendage.diffFields(message.finraAdfMpidAppendage));
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
            if (finraAdfMpidAppendagePresent()) {
                builder.append(", ");
                finraAdfMpidAppendage.toFormattedString(builder, options);
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
        if (finraAdfMpidAppendagePresent()) {
            finraAdfMpidAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof QuoteLongFormMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && shortFormNationalBboAppendage.equals(message.shortFormNationalBboAppendage) && longFormNationalBboAppendage.equals(message.longFormNationalBboAppendage) && finraAdfMpidAppendage.equals(message.finraAdfMpidAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, shortFormNationalBboAppendage, longFormNationalBboAppendage, finraAdfMpidAppendage);
    }
}
