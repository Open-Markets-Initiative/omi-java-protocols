package omi.cboe.c1options.marketdatafeed.csm.v1_4_2.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.MdEntrySizeField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.MdEntryTypeField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.MdEntryPx;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.TradeCondition;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.Field;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.GroupEntry;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.PrintOptions;

/**
 * One entry of the TickerMdEntry repeating group.
 *
 * <p>Volume Entry for this price level.</p>
 */
public final class TickerMdEntryEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 11;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "TickerMdEntry";

    /**
     * Side of book for this entry.
     */
    private final MdEntryTypeField mdEntryType = new MdEntryTypeField();

    /**
     * Quote Quantity
     */
    private final MdEntrySizeField mdEntrySize = new MdEntrySizeField();

    /**
     * Md Entry Px
     */
    private final MdEntryPx mdEntryPx = new MdEntryPx();

    /**
     * Trade Condition
     */
    private final TradeCondition tradeCondition = new TradeCondition();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(mdEntryType), mdEntryPx.fields(), List.<Field>of(mdEntrySize), tradeCondition.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Side of book for this entry.
     *
     * @return the MdEntryType field
     */
    public MdEntryTypeField mdEntryType() {
        return mdEntryType;
    }

    /**
     * Quote Quantity
     *
     * @return the MdEntrySize field
     */
    public MdEntrySizeField mdEntrySize() {
        return mdEntrySize;
    }

    /**
     * Md Entry Px
     *
     * @return the MdEntryPx record
     */
    public MdEntryPx mdEntryPx() {
        return mdEntryPx;
    }

    /**
     * Trade Condition
     *
     * @return the TradeCondition record
     */
    public TradeCondition tradeCondition() {
        return tradeCondition;
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + tradeCondition.byteLength() - TradeCondition.MINIMUM_BYTE_LENGTH;
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
        if (!mdEntryType.parse(data, cursor)) {
            return false;
        }
        cursor += MdEntryTypeField.BYTE_LENGTH;
        if (!mdEntryPx.parseFrom(data, cursor, end - 5)) {
            return false;
        }
        cursor += mdEntryPx.byteLength();
        if (!mdEntrySize.parse(data, cursor)) {
            return false;
        }
        cursor += MdEntrySizeField.BYTE_LENGTH;
        if (!tradeCondition.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += tradeCondition.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = mdEntryType.encode(data, cursor);
        cursor = mdEntryPx.encode(data, cursor);
        cursor = mdEntrySize.encode(data, cursor);
        cursor = tradeCondition.encode(data, cursor);
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
        mdEntryPx.clear();
        tradeCondition.clear();
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
            if (field != tradeCondition.tradeConditionLength() && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != tradeCondition.tradeConditionLength() && !field.isValid()) {
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
            case "MdEntryType" -> Optional.of(mdEntryType);
            case "MdEntrySize" -> Optional.of(mdEntrySize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof TickerMdEntryEntry message)) {
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
        if (!(other instanceof TickerMdEntryEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
