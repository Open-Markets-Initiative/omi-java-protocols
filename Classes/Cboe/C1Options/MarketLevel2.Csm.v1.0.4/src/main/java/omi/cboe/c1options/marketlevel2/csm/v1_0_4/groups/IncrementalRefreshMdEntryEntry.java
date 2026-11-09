package omi.cboe.c1options.marketlevel2.csm.v1_0_4.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.fields.MdEntryTypeField;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.fields.MdPriceLevelField;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.fields.MdUpdateActionField;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.fields.NoLegsField;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.groups.MdVolumeEntryEntry;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.groups.MdVolumeEntryList;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.structs.MdEntryPx;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.types.Field;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.types.GroupEntry;
import omi.cboe.c1options.marketlevel2.csm.v1_0_4.types.PrintOptions;

/**
 * One entry of the IncrementalRefreshMdEntry repeating group.
 *
 * <p>Incremental Refresh MDEntry</p>
 */
public final class IncrementalRefreshMdEntryEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 9;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "IncrementalRefreshMdEntry";

    /**
     * Indicates how book structure changed. See table: 24 – MD UpdateActions
     */
    private final MdUpdateActionField mdUpdateAction = new MdUpdateActionField();

    /**
     * Side of book for this entry.
     */
    private final MdEntryTypeField mdEntryType = new MdEntryTypeField();

    /**
     * Level number of book for this MDEntry.
     */
    private final MdPriceLevelField mdPriceLevel = new MdPriceLevelField();

    /**
     * Num. of Legs in a strategy product.
     */
    private final NoLegsField noLegs = new NoLegsField();

    /**
     * Volume Entry for this price level.
     */
    private final MdVolumeEntryList mdVolumeEntry = new MdVolumeEntryList();

    /**
     * Md Entry Px
     */
    private final MdEntryPx mdEntryPx = new MdEntryPx();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(mdUpdateAction), List.<Field>of(mdEntryType), List.<Field>of(mdPriceLevel), mdEntryPx.fields(), List.<Field>of(noLegs)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Indicates how book structure changed. See table: 24 – MD UpdateActions
     *
     * @return the MdUpdateAction field
     */
    public MdUpdateActionField mdUpdateAction() {
        return mdUpdateAction;
    }

    /**
     * Side of book for this entry.
     *
     * @return the MdEntryType field
     */
    public MdEntryTypeField mdEntryType() {
        return mdEntryType;
    }

    /**
     * Level number of book for this MDEntry.
     *
     * @return the MdPriceLevel field
     */
    public MdPriceLevelField mdPriceLevel() {
        return mdPriceLevel;
    }

    /**
     * Num. of Legs in a strategy product.
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
    }

    /**
     * Volume Entry for this price level.
     *
     * <p>Encode writes this list's size to the NoLegs field.</p>
     *
     * @return the MdVolumeEntry entries
     */
    public MdVolumeEntryList mdVolumeEntry() {
        return mdVolumeEntry;
    }

    /**
     * Md Entry Px
     *
     * @return the MdEntryPx record
     */
    public MdEntryPx mdEntryPx() {
        return mdEntryPx;
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + mdVolumeEntry.byteLength();
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
        cursor += 1;
        cursor += 1;
        cursor += 1;
        for (int[] run = MdEntryPx.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += MdEntryPx.BYTE_LENGTH;
        cursor += 1;
        cursor = mdVolumeEntry.padding(runs, cursor);
        return cursor;
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
        if (!mdUpdateAction.parse(data, cursor)) {
            return false;
        }
        cursor += MdUpdateActionField.BYTE_LENGTH;
        if (!mdEntryType.parse(data, cursor)) {
            return false;
        }
        cursor += MdEntryTypeField.BYTE_LENGTH;
        if (!mdPriceLevel.parse(data, cursor)) {
            return false;
        }
        cursor += MdPriceLevelField.BYTE_LENGTH;
        if (!mdEntryPx.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += mdEntryPx.byteLength();
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        if (!mdVolumeEntry.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += mdVolumeEntry.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (mdVolumeEntry.size() > 255) {
            throw new IllegalStateException("mdVolumeEntry holds " + mdVolumeEntry.size() + " entries, more than its count field can state");
        }
        noLegs.value((short) mdVolumeEntry.size());
        int cursor = offset;
        cursor = mdUpdateAction.encode(data, cursor);
        cursor = mdEntryType.encode(data, cursor);
        cursor = mdPriceLevel.encode(data, cursor);
        cursor = mdEntryPx.encode(data, cursor);
        cursor = noLegs.encode(data, cursor);
        cursor = mdVolumeEntry.encode(data, cursor);
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
        mdVolumeEntry.clear();
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
            if (field != noLegs && !field.isRecognized()) {
                return false;
            }
        }
        if (!mdVolumeEntry.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noLegs && !field.isValid()) {
                return false;
            }
        }
        if (!mdVolumeEntry.isValid()) {
            return false;
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
        if (!mdUpdateAction.isDecoded()) {
            return Optional.of(mdUpdateAction);
        }
        if (!mdEntryType.isDecoded()) {
            return Optional.of(mdEntryType);
        }
        if (!mdPriceLevel.isDecoded()) {
            return Optional.of(mdPriceLevel);
        }
        if (!mdEntryPx.isDecoded()) {
            return mdEntryPx.failedAt();
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!mdVolumeEntry.isDecoded()) {
            return Optional.of(mdVolumeEntry.failedEntry().flatMap(MdVolumeEntryEntry::failedAt).orElse(noLegs));
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
            case "MdUpdateAction" -> Optional.of(mdUpdateAction);
            case "MdEntryType" -> Optional.of(mdEntryType);
            case "MdPriceLevel" -> Optional.of(mdPriceLevel);
            case "NoLegs" -> Optional.of(noLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof IncrementalRefreshMdEntryEntry message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(mdVolumeEntry.diffFields(message.mdVolumeEntry));
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
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            mdVolumeEntry.toFormattedString(builder, options);
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
        mdVolumeEntry.toFormattedString(builder, nested);
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
        if (!(other instanceof IncrementalRefreshMdEntryEntry message)) {
            return false;
        }
        return fields.equals(message.fields) && mdVolumeEntry.equals(message.mdVolumeEntry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, mdVolumeEntry);
    }
}
