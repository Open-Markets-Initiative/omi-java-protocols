package omi.ice.icefutures.mdf.impact.v1_1_51.groups;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.ice.icefutures.mdf.impact.v1_1_51.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_51.types.PrintOptions;

/**
 * The entries of the ExtraLegDefinition repeating group.
 *
 * <p>Entries added here reach the wire with their count, since encode writes the count field from this list.</p>
 */
public final class ExtraLegDefinitionList extends AbstractList<ExtraLegDefinitionEntry> {

    private static final String NAME = "ExtraLegDefinition";

    private final List<ExtraLegDefinitionEntry> entries = new ArrayList<>();

    private ExtraLegDefinitionEntry failedEntry;

    private boolean decoded;

    /**
     * Creates an empty list.
     */
    public ExtraLegDefinitionList() {
    }

    @Override
    public ExtraLegDefinitionEntry get(int index) {
        return entries.get(index);
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public ExtraLegDefinitionEntry set(int index, ExtraLegDefinitionEntry entry) {
        Objects.requireNonNull(entry, "entry");
        return entries.set(index, entry);
    }

    @Override
    public void add(int index, ExtraLegDefinitionEntry entry) {
        Objects.requireNonNull(entry, "entry");
        entries.add(index, entry);
        modCount++;
    }

    @Override
    public ExtraLegDefinitionEntry remove(int index) {
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
            ExtraLegDefinitionEntry entry = new ExtraLegDefinitionEntry();
            if (!entry.parseFrom(data, cursor, end)) {
                failedEntry = entry;
                return false;
            }
            entries.add(entry);
            cursor += ExtraLegDefinitionEntry.BYTE_LENGTH;
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
        for (ExtraLegDefinitionEntry entry : entries) {
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
        return entries.size() * ExtraLegDefinitionEntry.BYTE_LENGTH;
    }

    /**
     * Adds the declared padding of every entry, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of the first entry, relative to the start of the message
     * @return the offset just past the last entry
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        int[] padding = ExtraLegDefinitionEntry.padding();
        for (int index = 0; index < entries.size(); index++) {
            for (int run = 0; run < padding.length; run += 2) {
                runs.add(cursor + padding[run]).add(padding[run + 1]);
            }
            cursor += ExtraLegDefinitionEntry.BYTE_LENGTH;
        }
        return cursor;
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
    public Optional<ExtraLegDefinitionEntry> failedEntry() {
        return Optional.ofNullable(failedEntry);
    }

    /**
     * Returns whether every entry holds only values the protocol declares.
     *
     * @return true when every entry is recognized
     */
    public boolean isRecognized() {
        for (ExtraLegDefinitionEntry entry : entries) {
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
        for (ExtraLegDefinitionEntry entry : entries) {
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
    public List<Field> diffFields(ExtraLegDefinitionList other) {
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
        for (ExtraLegDefinitionEntry entry : entries) {
            entry.toFormattedString(builder, nested);
        }
    }
}
