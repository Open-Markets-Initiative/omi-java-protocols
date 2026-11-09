package omi.siac.cqs.output.cta.v1_91.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.siac.cqs.output.cta.v1_91.fields.BestBidParticipantIdField;
import omi.siac.cqs.output.cta.v1_91.fields.BestBidPriceShortField;
import omi.siac.cqs.output.cta.v1_91.fields.BestBidSizeShortField;
import omi.siac.cqs.output.cta.v1_91.types.Field;
import omi.siac.cqs.output.cta.v1_91.types.GroupEntry;
import omi.siac.cqs.output.cta.v1_91.types.PrintOptions;

/**
 * The NationalBestBidShortAppendage record a message holds.
 *
 * <p>National Best Bid Short Appendage</p>
 */
public final class NationalBestBidShortAppendage implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 5;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "NationalBestBidShortAppendage";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Identifies the Participant that submitted the Best Bid on a consolidated basis.
     */
    private final BestBidParticipantIdField bestBidParticipantId = new BestBidParticipantIdField();

    /**
     * Represents the Best Offer Price on a consolidated basis
     */
    private final BestBidPriceShortField bestBidPriceShort = new BestBidPriceShortField();

    /**
     * Represents the Best Offer Bid associated with the Best Bid Price on a consolidated basis
     */
    private final BestBidSizeShortField bestBidSizeShort = new BestBidSizeShortField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(bestBidParticipantId, bestBidPriceShort, bestBidSizeShort);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identifies the Participant that submitted the Best Bid on a consolidated basis.
     *
     * @return the BestBidParticipantId field
     */
    public BestBidParticipantIdField bestBidParticipantId() {
        return bestBidParticipantId;
    }

    /**
     * Represents the Best Offer Price on a consolidated basis
     *
     * @return the BestBidPriceShort field
     */
    public BestBidPriceShortField bestBidPriceShort() {
        return bestBidPriceShort;
    }

    /**
     * Represents the Best Offer Bid associated with the Best Bid Price on a consolidated basis
     *
     * @return the BestBidSizeShort field
     */
    public BestBidSizeShortField bestBidSizeShort() {
        return bestBidSizeShort;
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
        return PADDING.clone();
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
        if (!bestBidParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidParticipantIdField.BYTE_LENGTH;
        if (!bestBidPriceShort.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidPriceShortField.BYTE_LENGTH;
        if (!bestBidSizeShort.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidSizeShortField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = bestBidParticipantId.encode(data, cursor);
        cursor = bestBidPriceShort.encode(data, cursor);
        cursor = bestBidSizeShort.encode(data, cursor);
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
            case "BestBidParticipantId" -> Optional.of(bestBidParticipantId);
            case "BestBidPriceShort" -> Optional.of(bestBidPriceShort);
            case "BestBidSizeShort" -> Optional.of(bestBidSizeShort);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof NationalBestBidShortAppendage message)) {
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
        if (!(other instanceof NationalBestBidShortAppendage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
