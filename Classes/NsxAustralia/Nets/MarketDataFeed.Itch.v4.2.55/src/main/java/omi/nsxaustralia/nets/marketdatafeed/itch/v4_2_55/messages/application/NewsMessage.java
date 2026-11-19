package omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.FirmCodeField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.NewsIdField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.NewsTextField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.OrderbookField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.ReferenceNullTerminatedCharField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.TimestampField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.TitleField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.types.Field;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.types.Message;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.types.PrintOptions;

/**
 * Represents the NewsMessage message from the MarketDataFeed protocol.
 *
 * <p>This message disseminates exchange news.</p>
 */
public final class NewsMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'N';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 891;

    /**
     * This message's declared name.
     */
    public static final String NAME = "News Message";

    /**
     * Nanoseconds since last ITCH Timestamp "T" message.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Identifies the Orderbook for which this event applies. Set to 0 if not at Orderbook level.
     */
    private final OrderbookField orderbook = new OrderbookField();

    /**
     * Unique news item identifier.
     */
    private final NewsIdField newsId = new NewsIdField();

    /**
     * The firm's text identifier.
     */
    private final FirmCodeField firmCode = new FirmCodeField();

    /**
     * News Title. Null-terminated string, maximum 81 characters.
     */
    private final TitleField title = new TitleField();

    /**
     * Reference text for the news item (e.g. a URL, file pathname). Null-terminated string, maximum 256 characters.
     */
    private final ReferenceNullTerminatedCharField referenceNullTerminatedChar = new ReferenceNullTerminatedCharField();

    /**
     * News data. Null-terminated string, maximum 512 characters.
     */
    private final NewsTextField newsText = new NewsTextField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, orderbook, newsId, firmCode, title, referenceNullTerminatedChar, newsText);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since last ITCH Timestamp "T" message.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Identifies the Orderbook for which this event applies. Set to 0 if not at Orderbook level.
     *
     * @return the Orderbook field
     */
    public OrderbookField orderbook() {
        return orderbook;
    }

    /**
     * Unique news item identifier.
     *
     * @return the NewsId field
     */
    public NewsIdField newsId() {
        return newsId;
    }

    /**
     * The firm's text identifier.
     *
     * @return the FirmCode field
     */
    public FirmCodeField firmCode() {
        return firmCode;
    }

    /**
     * News Title. Null-terminated string, maximum 81 characters.
     *
     * @return the Title field
     */
    public TitleField title() {
        return title;
    }

    /**
     * Reference text for the news item (e.g. a URL, file pathname). Null-terminated string, maximum 256 characters.
     *
     * @return the ReferenceNullTerminatedChar field
     */
    public ReferenceNullTerminatedCharField referenceNullTerminatedChar() {
        return referenceNullTerminatedChar;
    }

    /**
     * News data. Null-terminated string, maximum 512 characters.
     *
     * @return the NewsText field
     */
    public NewsTextField newsText() {
        return newsText;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!orderbook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderbookField.BYTE_LENGTH;
        if (!newsId.parse(data, cursor)) {
            return false;
        }
        cursor += NewsIdField.BYTE_LENGTH;
        if (!firmCode.parse(data, cursor)) {
            return false;
        }
        cursor += FirmCodeField.BYTE_LENGTH;
        if (!title.parse(data, cursor)) {
            return false;
        }
        cursor += TitleField.BYTE_LENGTH;
        if (!referenceNullTerminatedChar.parse(data, cursor)) {
            return false;
        }
        cursor += ReferenceNullTerminatedCharField.BYTE_LENGTH;
        return newsText.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = orderbook.encode(data, cursor);
        cursor = newsId.encode(data, cursor);
        cursor = firmCode.encode(data, cursor);
        cursor = title.encode(data, cursor);
        cursor = referenceNullTerminatedChar.encode(data, cursor);
        cursor = newsText.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "Orderbook" -> Optional.of(orderbook);
            case "NewsId" -> Optional.of(newsId);
            case "FirmCode" -> Optional.of(firmCode);
            case "Title" -> Optional.of(title);
            case "ReferenceNullTerminatedChar" -> Optional.of(referenceNullTerminatedChar);
            case "NewsText" -> Optional.of(newsText);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewsMessage message)) {
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
        if (!(other instanceof NewsMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
