package omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.groups;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.types.Field;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.types.PrintOptions;

/**
 * The entries of the LegDefinition repeating group.
 *
 * <p>Entries added here reach the wire with their count, since encode writes the count field from this list.</p>
 */
public final class LegDefinitionList extends AbstractList<LegDefinitionEntry> {

    private static final String NAME = "LegDefinition";

    private final List<LegDefinitionEntry> entries = new ArrayList<>();

    private LegDefinitionEntry failedEntry;

    private boolean decoded;

    /**
     * Creates an empty list.
     */
    public LegDefinitionList() {
    }

    @Override
    public LegDefinitionEntry get(int index) {
        return entries.get(index);
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public LegDefinitionEntry set(int index, LegDefinitionEntry entry) {
        Objects.requireNonNull(entry, "entry");
        return entries.set(index, entry);
    }

    @Override
    public void add(int index, LegDefinitionEntry entry) {
        Objects.requireNonNull(entry, "entry");
        entries.add(index, entry);
        modCount++;
    }

    @Override
    public LegDefinitionEntry remove(int index) {
        modCount++;
        return entries.remove(index);
    }

    @Override
    public void clear() {
        empty();
    }

    private void empty() {
        entries.clear();
        modCount++;
        failedEntry = null;
        decoded = false;
    }

    /**
     * Decodes the entries a count states, replacing any held.
     *
     * @param data   the buffer to decode from
     * @param offset the index of the first entry's first byte
     * @param end    the index just past the last byte these entries may read
     * @param count  the number of entries
     * @return true when every entry decoded; a negative count is refused
     */
    public boolean parse(byte[] data, int offset, int end, long count) {
        empty();
        if (count < 0) {
            return false;
        }
        int cursor = offset;
        for (long index = 0; index < count; index++) {
            LegDefinitionEntry entry = new LegDefinitionEntry();
            if (!entry.parseFrom(data, cursor, end)) {
                failedEntry = entry;
                return false;
            }
            entries.add(entry);
            cursor += LegDefinitionEntry.BYTE_LENGTH;
        }
        decoded = true;
        return true;
    }

    /**
     * Encodes every entry into a buffer.
     *
     * @param data   the buffer to encode into
     * @param offset the index of the first entry's first byte
     * @return the index just past the last entry
     * @throws IndexOutOfBoundsException when the entries do not fit at offset
     */
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        for (LegDefinitionEntry entry : entries) {
            cursor = entry.encode(data, cursor);
        }
        return cursor;
    }

    /**
     * Returns the bytes these entries occupy on the wire.
     *
     * @return the width in bytes
     */
    public int byteLength() {
        return entries.size() * LegDefinitionEntry.BYTE_LENGTH;
    }

    /**
     * Returns whether the last parse decoded every entry its count stated.
     *
     * @return true when the last parse succeeded
     */
    public boolean isDecoded() {
        return decoded;
    }

    /**
     * Returns the entry that stopped the last parse.
     *
     * @return the entry that failed, or empty when none did
     */
    public Optional<LegDefinitionEntry> failedEntry() {
        return Optional.ofNullable(failedEntry);
    }

    /**
     * Returns whether every entry holds only values the protocol declares.
     *
     * @return true when every entry is recognized
     */
    public boolean isRecognized() {
        for (LegDefinitionEntry entry : entries) {
            if (!entry.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns whether every entry is complete and holds only declared values.
     *
     * @return true when every entry is valid
     */
    public boolean isValid() {
        for (LegDefinitionEntry entry : entries) {
            if (!entry.isValid()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns the fields differing from another list, entry by entry. Entries only one list holds are not compared: their count differs.
     *
     * @param other the list to compare against
     * @return this list's differing fields
     */
    public List<Field> diffFields(LegDefinitionList other) {
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < Math.min(entries.size(), other.entries.size()); index++) {
            changed.addAll(entries.get(index).diffFields(other.entries.get(index)));
        }
        return changed;
    }

    /**
     * Appends this list's formatted representation.
     *
     * @param builder the destination
     * @param options the display options
     */
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.compact()) {
            builder.append(NAME).append(" [ ");
            for (int index = 0; index < entries.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                entries.get(index).toFormattedString(builder, options);
            }
            builder.append(" ]");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (LegDefinitionEntry entry : entries) {
            entry.toFormattedString(builder, nested);
        }
    }
}
