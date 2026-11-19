package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.EntryNumberField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MarketStructureIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.NewsIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TextField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TitleField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TotalField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the News message from the StreamFullDepth protocol.
 *
 * <p>News message</p>
 */
public final class News implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 890;

    /**
     * This message's declared name.
     */
    public static final String NAME = "News";

    /**
     * ID of the financial instrument’s market segment
     */
    private final MarketStructureIdField marketStructureId = new MarketStructureIdField();

    /**
     * News id - The news id serves as a unique reference for tracking purposes within the WATS system
     */
    private final NewsIdField newsId = new NewsIdField();

    /**
     * News title, unique per message
     */
    private final TitleField title = new TitleField();

    /**
     * News entry number
     */
    private final EntryNumberField entryNumber = new EntryNumberField();

    /**
     * Total number of news entries
     */
    private final TotalField total = new TotalField();

    /**
     * News text
     */
    private final TextField text = new TextField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketStructureId, newsId, title, entryNumber, total, text);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID of the financial instrument’s market segment
     *
     * @return the MarketStructureId field
     */
    public MarketStructureIdField marketStructureId() {
        return marketStructureId;
    }

    /**
     * News id - The news id serves as a unique reference for tracking purposes within the WATS system
     *
     * @return the NewsId field
     */
    public NewsIdField newsId() {
        return newsId;
    }

    /**
     * News title, unique per message
     *
     * @return the Title field
     */
    public TitleField title() {
        return title;
    }

    /**
     * News entry number
     *
     * @return the EntryNumber field
     */
    public EntryNumberField entryNumber() {
        return entryNumber;
    }

    /**
     * Total number of news entries
     *
     * @return the Total field
     */
    public TotalField total() {
        return total;
    }

    /**
     * News text
     *
     * @return the Text field
     */
    public TextField text() {
        return text;
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
        if (!marketStructureId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketStructureIdField.BYTE_LENGTH;
        if (!newsId.parse(data, cursor)) {
            return false;
        }
        cursor += NewsIdField.BYTE_LENGTH;
        if (!title.parse(data, cursor)) {
            return false;
        }
        cursor += TitleField.BYTE_LENGTH;
        if (!entryNumber.parse(data, cursor)) {
            return false;
        }
        cursor += EntryNumberField.BYTE_LENGTH;
        if (!total.parse(data, cursor)) {
            return false;
        }
        cursor += TotalField.BYTE_LENGTH;
        return text.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketStructureId.encode(data, cursor);
        cursor = newsId.encode(data, cursor);
        cursor = title.encode(data, cursor);
        cursor = entryNumber.encode(data, cursor);
        cursor = total.encode(data, cursor);
        cursor = text.encode(data, cursor);
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
            case "MarketStructureId" -> Optional.of(marketStructureId);
            case "NewsId" -> Optional.of(newsId);
            case "Title" -> Optional.of(title);
            case "EntryNumber" -> Optional.of(entryNumber);
            case "Total" -> Optional.of(total);
            case "Text" -> Optional.of(text);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof News message)) {
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
        if (!(other instanceof News message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
