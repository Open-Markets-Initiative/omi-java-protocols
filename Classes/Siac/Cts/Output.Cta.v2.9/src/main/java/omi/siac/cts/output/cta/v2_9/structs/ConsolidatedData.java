package omi.siac.cts.output.cta.v2_9.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.siac.cts.output.cta.v2_9.fields.HighPriceField;
import omi.siac.cts.output.cta.v2_9.fields.LastParticipantIdField;
import omi.siac.cts.output.cta.v2_9.fields.LastPriceField;
import omi.siac.cts.output.cta.v2_9.fields.LowPriceField;
import omi.siac.cts.output.cta.v2_9.fields.PreviousClosePriceDateField;
import omi.siac.cts.output.cta.v2_9.fields.TickField;
import omi.siac.cts.output.cta.v2_9.fields.TotalVolumeShortField;
import omi.siac.cts.output.cta.v2_9.types.Field;
import omi.siac.cts.output.cta.v2_9.types.GroupEntry;
import omi.siac.cts.output.cta.v2_9.types.PrintOptions;

/**
 * The ConsolidatedData record a message holds.
 *
 * <p>Consolidated Data</p>
 */
public final class ConsolidatedData implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 34;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "ConsolidatedData";

    /**
     * Represents the date the security last traded
     */
    private final PreviousClosePriceDateField previousClosePriceDate = new PreviousClosePriceDateField();

    /**
     * Refer to Participant ID field description for Participant codes
     */
    private final LastParticipantIdField lastParticipantId = new LastParticipantIdField();

    /**
     * The Last Price represents the last price for that security either on a Consolidated or an individual Participant basis at the time it is disseminated
     */
    private final LastPriceField lastPrice = new LastPriceField();

    /**
     * The High Price represents the highest price paid for a security during the trading day
     */
    private final HighPriceField highPrice = new HighPriceField();

    /**
     * The Low Price represents the lowest price paid for a security during the trading day
     */
    private final LowPriceField lowPrice = new LowPriceField();

    /**
     * Contains Total Volume of shares traded in a security either on a Consolidated or an individual Participant basis at the time it is disseminated
     */
    private final TotalVolumeShortField totalVolumeShort = new TotalVolumeShortField();

    /**
     * Represents for a Participant the upward, downward or unchanged price movement in a security's trades
     */
    private final TickField tick = new TickField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(previousClosePriceDate, lastParticipantId, lastPrice, highPrice, lowPrice, totalVolumeShort, tick);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Represents the date the security last traded
     *
     * @return the PreviousClosePriceDate field
     */
    public PreviousClosePriceDateField previousClosePriceDate() {
        return previousClosePriceDate;
    }

    /**
     * Refer to Participant ID field description for Participant codes
     *
     * @return the LastParticipantId field
     */
    public LastParticipantIdField lastParticipantId() {
        return lastParticipantId;
    }

    /**
     * The Last Price represents the last price for that security either on a Consolidated or an individual Participant basis at the time it is disseminated
     *
     * @return the LastPrice field
     */
    public LastPriceField lastPrice() {
        return lastPrice;
    }

    /**
     * The High Price represents the highest price paid for a security during the trading day
     *
     * @return the HighPrice field
     */
    public HighPriceField highPrice() {
        return highPrice;
    }

    /**
     * The Low Price represents the lowest price paid for a security during the trading day
     *
     * @return the LowPrice field
     */
    public LowPriceField lowPrice() {
        return lowPrice;
    }

    /**
     * Contains Total Volume of shares traded in a security either on a Consolidated or an individual Participant basis at the time it is disseminated
     *
     * @return the TotalVolumeShort field
     */
    public TotalVolumeShortField totalVolumeShort() {
        return totalVolumeShort;
    }

    /**
     * Represents for a Participant the upward, downward or unchanged price movement in a security's trades
     *
     * @return the Tick field
     */
    public TickField tick() {
        return tick;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
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
        if (!previousClosePriceDate.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousClosePriceDateField.BYTE_LENGTH;
        if (!lastParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += LastParticipantIdField.BYTE_LENGTH;
        if (!lastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceField.BYTE_LENGTH;
        if (!highPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceField.BYTE_LENGTH;
        if (!lowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceField.BYTE_LENGTH;
        if (!totalVolumeShort.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeShortField.BYTE_LENGTH;
        return tick.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = previousClosePriceDate.encode(data, cursor);
        cursor = lastParticipantId.encode(data, cursor);
        cursor = lastPrice.encode(data, cursor);
        cursor = highPrice.encode(data, cursor);
        cursor = lowPrice.encode(data, cursor);
        cursor = totalVolumeShort.encode(data, cursor);
        cursor = tick.encode(data, cursor);
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
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
            case "PreviousClosePriceDate" -> Optional.of(previousClosePriceDate);
            case "LastParticipantId" -> Optional.of(lastParticipantId);
            case "LastPrice" -> Optional.of(lastPrice);
            case "HighPrice" -> Optional.of(highPrice);
            case "LowPrice" -> Optional.of(lowPrice);
            case "TotalVolumeShort" -> Optional.of(totalVolumeShort);
            case "Tick" -> Optional.of(tick);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof ConsolidatedData message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof ConsolidatedData message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
