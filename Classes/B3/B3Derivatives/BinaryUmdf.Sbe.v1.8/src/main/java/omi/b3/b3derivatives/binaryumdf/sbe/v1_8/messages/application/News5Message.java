package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.LanguageCodeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MatchEventIndicatorField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.NewsIdField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.NewsSourceField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.OrigTimeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.PartCountField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.PartNumberField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityIdOptionalField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TotalTextLengthField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.structs.Headline;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.structs.Text;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.structs.UrlLink;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Field;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.PrintOptions;

/**
 * Represents the News5Message message from the BinaryUmdf protocol.
 *
 * <p>News_5Message</p>
 */
public final class News5Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "News 5 Message";

    /**
     * Security Id as defined by B3. For the Security Id list, see the Security Definition message in the market data feed
     */
    private final SecurityIdOptionalField securityIdOptional = new SecurityIdOptionalField();

    /**
     * MatchEventIndicator bit set
     */
    private final MatchEventIndicatorField matchEventIndicator = new MatchEventIndicatorField();

    /**
     * newsSource
     */
    private final NewsSourceField newsSource = new NewsSourceField();

    /**
     * languageCode
     */
    private final LanguageCodeField languageCode = new LanguageCodeField();

    /**
     * partCount
     */
    private final PartCountField partCount = new PartCountField();

    /**
     * partNumber
     */
    private final PartNumberField partNumber = new PartNumberField();

    /**
     * newsID
     */
    private final NewsIdField newsId = new NewsIdField();

    /**
     * origTime
     */
    private final OrigTimeField origTime = new OrigTimeField();

    /**
     * totalTextLength
     */
    private final TotalTextLengthField totalTextLength = new TotalTextLengthField();

    /**
     * headline data struct
     */
    private final Headline headline = new Headline();

    /**
     * text data struct
     */
    private final Text text = new Text();

    /**
     * uRLLink data struct
     */
    private final UrlLink urlLink = new UrlLink();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(securityIdOptional), List.<Field>of(matchEventIndicator), List.<Field>of(newsSource), List.<Field>of(languageCode), List.<Field>of(partCount), List.<Field>of(partNumber), List.<Field>of(newsId), List.<Field>of(origTime), List.<Field>of(totalTextLength), headline.fields(), text.fields(), urlLink.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Security Id as defined by B3. For the Security Id list, see the Security Definition message in the market data feed
     *
     * @return the SecurityIdOptional field
     */
    public SecurityIdOptionalField securityIdOptional() {
        return securityIdOptional;
    }

    /**
     * MatchEventIndicator bit set
     *
     * @return the MatchEventIndicator field
     */
    public MatchEventIndicatorField matchEventIndicator() {
        return matchEventIndicator;
    }

    /**
     * newsSource
     *
     * @return the NewsSource field
     */
    public NewsSourceField newsSource() {
        return newsSource;
    }

    /**
     * languageCode
     *
     * @return the LanguageCode field
     */
    public LanguageCodeField languageCode() {
        return languageCode;
    }

    /**
     * partCount
     *
     * @return the PartCount field
     */
    public PartCountField partCount() {
        return partCount;
    }

    /**
     * partNumber
     *
     * @return the PartNumber field
     */
    public PartNumberField partNumber() {
        return partNumber;
    }

    /**
     * newsID
     *
     * @return the NewsId field
     */
    public NewsIdField newsId() {
        return newsId;
    }

    /**
     * origTime
     *
     * @return the OrigTime field
     */
    public OrigTimeField origTime() {
        return origTime;
    }

    /**
     * totalTextLength
     *
     * @return the TotalTextLength field
     */
    public TotalTextLengthField totalTextLength() {
        return totalTextLength;
    }

    /**
     * headline data struct
     *
     * @return the Headline record
     */
    public Headline headline() {
        return headline;
    }

    /**
     * text data struct
     *
     * @return the Text record
     */
    public Text text() {
        return text;
    }

    /**
     * uRLLink data struct
     *
     * @return the UrlLink record
     */
    public UrlLink urlLink() {
        return urlLink;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + headline.byteLength() - Headline.MINIMUM_BYTE_LENGTH + text.byteLength() - Text.MINIMUM_BYTE_LENGTH + urlLink.byteLength() - UrlLink.MINIMUM_BYTE_LENGTH;
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
        cursor += 1;
        cursor += 1;
        cursor += 2;
        cursor += 2;
        cursor += 2;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor = headline.padding(runs, cursor);
        cursor = text.padding(runs, cursor);
        cursor = urlLink.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(origTime.value());
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
        if (!securityIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdOptionalField.BYTE_LENGTH;
        if (!matchEventIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MatchEventIndicatorField.BYTE_LENGTH;
        if (!newsSource.parse(data, cursor)) {
            return false;
        }
        cursor += NewsSourceField.BYTE_LENGTH;
        if (!languageCode.parse(data, cursor)) {
            return false;
        }
        cursor += LanguageCodeField.BYTE_LENGTH;
        if (!partCount.parse(data, cursor)) {
            return false;
        }
        cursor += PartCountField.BYTE_LENGTH;
        if (!partNumber.parse(data, cursor)) {
            return false;
        }
        cursor += PartNumberField.BYTE_LENGTH;
        if (!newsId.parse(data, cursor)) {
            return false;
        }
        cursor += NewsIdField.BYTE_LENGTH;
        if (!origTime.parse(data, cursor)) {
            return false;
        }
        cursor += OrigTimeField.BYTE_LENGTH;
        if (!totalTextLength.parse(data, cursor)) {
            return false;
        }
        cursor += TotalTextLengthField.BYTE_LENGTH;
        if (!headline.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += headline.byteLength();
        if (end - cursor < 4) {
            return false;
        }
        if (!text.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += text.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!urlLink.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += urlLink.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = securityIdOptional.encode(data, cursor);
        cursor = matchEventIndicator.encode(data, cursor);
        cursor = newsSource.encode(data, cursor);
        cursor = languageCode.encode(data, cursor);
        cursor = partCount.encode(data, cursor);
        cursor = partNumber.encode(data, cursor);
        cursor = newsId.encode(data, cursor);
        cursor = origTime.encode(data, cursor);
        cursor = totalTextLength.encode(data, cursor);
        cursor = headline.encode(data, cursor);
        cursor = text.encode(data, cursor);
        cursor = urlLink.encode(data, cursor);
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
        headline.clear();
        text.clear();
        urlLink.clear();
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
            if (field != headline.headlineLength() && field != text.textLength() && field != urlLink.urlLinkLength() && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != headline.headlineLength() && field != text.textLength() && field != urlLink.urlLinkLength() && !field.isValid()) {
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
            case "SecurityIdOptional" -> Optional.of(securityIdOptional);
            case "MatchEventIndicator" -> Optional.of(matchEventIndicator);
            case "NewsSource" -> Optional.of(newsSource);
            case "LanguageCode" -> Optional.of(languageCode);
            case "PartCount" -> Optional.of(partCount);
            case "PartNumber" -> Optional.of(partNumber);
            case "NewsId" -> Optional.of(newsId);
            case "OrigTime" -> Optional.of(origTime);
            case "TotalTextLength" -> Optional.of(totalTextLength);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof News5Message message)) {
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
        if (!(other instanceof News5Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
