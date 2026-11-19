package omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.BusinessDateField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.LongPositionBandCountField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.ProductCodeField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.ShortPositionBandCountField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.groups.LongPositionBandsEntry;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.groups.LongPositionBandsList;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.groups.ShortPositionBandsEntry;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.groups.ShortPositionBandsList;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the PositionBandMessage message from the DailySummariesSnapshot protocol.
 *
 * <p>Reports the number of market participants holding futures positions as a percentage of Market Open Interest.</p>
 */
public final class PositionBandMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 14;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Position Band Message";

    /**
     * The business date for which the open interest is being reported, as YYYYMMDD.
     */
    private final BusinessDateField businessDate = new BusinessDateField();

    /**
     * The product code. This identifies the metal for the instrument.
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * Number of bands for long position.
     */
    private final LongPositionBandCountField longPositionBandCount = new LongPositionBandCountField();

    /**
     * Number of bands for short position.
     */
    private final ShortPositionBandCountField shortPositionBandCount = new ShortPositionBandCountField();

    /**
     * One long position band, giving the percentage range of Market Open Interest and the prompt dates participants hold long positions in
     */
    private final LongPositionBandsList longPositionBands = new LongPositionBandsList();

    /**
     * One short position band, giving the percentage range of Market Open Interest and the prompt dates participants hold short positions in
     */
    private final ShortPositionBandsList shortPositionBands = new ShortPositionBandsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(businessDate, productCode, longPositionBandCount, shortPositionBandCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The business date for which the open interest is being reported, as YYYYMMDD.
     *
     * @return the BusinessDate field
     */
    public BusinessDateField businessDate() {
        return businessDate;
    }

    /**
     * The product code. This identifies the metal for the instrument.
     *
     * @return the ProductCode field
     */
    public ProductCodeField productCode() {
        return productCode;
    }

    /**
     * Number of bands for long position.
     *
     * @return the LongPositionBandCount field
     */
    public LongPositionBandCountField longPositionBandCount() {
        return longPositionBandCount;
    }

    /**
     * Number of bands for short position.
     *
     * @return the ShortPositionBandCount field
     */
    public ShortPositionBandCountField shortPositionBandCount() {
        return shortPositionBandCount;
    }

    /**
     * One long position band, giving the percentage range of Market Open Interest and the prompt dates participants hold long positions in
     *
     * <p>Encode writes this list's size to the LongPositionBandCount field.</p>
     *
     * @return the LongPositionBands entries
     */
    public LongPositionBandsList longPositionBands() {
        return longPositionBands;
    }

    /**
     * One short position band, giving the percentage range of Market Open Interest and the prompt dates participants hold short positions in
     *
     * <p>Encode writes this list's size to the ShortPositionBandCount field.</p>
     *
     * @return the ShortPositionBands entries
     */
    public ShortPositionBandsList shortPositionBands() {
        return shortPositionBands;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + longPositionBands.byteLength() + shortPositionBands.byteLength();
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
        if (!businessDate.parse(data, cursor)) {
            return false;
        }
        cursor += BusinessDateField.BYTE_LENGTH;
        if (!productCode.parse(data, cursor)) {
            return false;
        }
        cursor += ProductCodeField.BYTE_LENGTH;
        if (!longPositionBandCount.parse(data, cursor)) {
            return false;
        }
        cursor += LongPositionBandCountField.BYTE_LENGTH;
        if (!shortPositionBandCount.parse(data, cursor)) {
            return false;
        }
        cursor += ShortPositionBandCountField.BYTE_LENGTH;
        if (!longPositionBands.parse(data, cursor, end, longPositionBandCount.value())) {
            return false;
        }
        cursor += longPositionBands.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!shortPositionBands.parse(data, cursor, end, shortPositionBandCount.value())) {
            return false;
        }
        cursor += shortPositionBands.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        longPositionBandCount.value(longPositionBands.size());
        shortPositionBandCount.value(shortPositionBands.size());
        int cursor = offset;
        cursor = businessDate.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
        cursor = longPositionBandCount.encode(data, cursor);
        cursor = shortPositionBandCount.encode(data, cursor);
        cursor = longPositionBands.encode(data, cursor);
        cursor = shortPositionBands.encode(data, cursor);
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
        longPositionBands.clear();
        shortPositionBands.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != longPositionBandCount && field != shortPositionBandCount && !field.isRecognized()) {
                return false;
            }
        }
        if (!longPositionBands.isRecognized()) {
            return false;
        }
        return shortPositionBands.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != longPositionBandCount && field != shortPositionBandCount && !field.isValid()) {
                return false;
            }
        }
        if (!longPositionBands.isValid()) {
            return false;
        }
        if (!shortPositionBands.isValid()) {
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
        if (!businessDate.isDecoded()) {
            return Optional.of(businessDate);
        }
        if (!productCode.isDecoded()) {
            return Optional.of(productCode);
        }
        if (!longPositionBandCount.isDecoded()) {
            return Optional.of(longPositionBandCount);
        }
        if (!shortPositionBandCount.isDecoded()) {
            return Optional.of(shortPositionBandCount);
        }
        if (!longPositionBands.isDecoded()) {
            return Optional.of(longPositionBands.failedEntry().flatMap(LongPositionBandsEntry::failedAt).orElse(longPositionBandCount));
        }
        if (!shortPositionBands.isDecoded()) {
            return Optional.of(shortPositionBands.failedEntry().flatMap(ShortPositionBandsEntry::failedAt).orElse(shortPositionBandCount));
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
            case "BusinessDate" -> Optional.of(businessDate);
            case "ProductCode" -> Optional.of(productCode);
            case "LongPositionBandCount" -> Optional.of(longPositionBandCount);
            case "ShortPositionBandCount" -> Optional.of(shortPositionBandCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PositionBandMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(longPositionBands.diffFields(message.longPositionBands));
        changed.addAll(shortPositionBands.diffFields(message.shortPositionBands));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            longPositionBands.toFormattedString(builder, options);
            builder.append(", ");
            shortPositionBands.toFormattedString(builder, options);
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
        longPositionBands.toFormattedString(builder, nested);
        shortPositionBands.toFormattedString(builder, nested);
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
        if (!(other instanceof PositionBandMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && longPositionBands.equals(message.longPositionBands) && shortPositionBands.equals(message.shortPositionBands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, longPositionBands, shortPositionBands);
    }
}
