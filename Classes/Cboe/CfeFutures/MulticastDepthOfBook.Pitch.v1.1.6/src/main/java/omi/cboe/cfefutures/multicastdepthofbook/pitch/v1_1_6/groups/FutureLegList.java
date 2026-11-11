package omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.groups;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.Field;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.PrintOptions;

/**
 * The entries of the FutureLeg repeating group.
 *
 * <p>Entries added here reach the wire with their count, since encode writes the count field from this list.</p>
 */
public final class FutureLegList extends AbstractList<FutureLegEntry> {

    private static final String NAME = "FutureLeg";

    private final List<FutureLegEntry> entries = new ArrayList<>();

    private FutureLegEntry failedEntry;

    private boolean decoded;

    /**
     * Creates an empty list.
     */
    public FutureLegList() {
    }

    @Override
    public FutureLegEntry get(int index) {
        return entries.get(index);
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public FutureLegEntry set(int index, FutureLegEntry entry) {
        Objects.requireNonNull(entry, "entry");
        return entries.set(index, entry);
    }

    @Override
    public void add(int index, FutureLegEntry entry) {
        Objects.requireNonNull(entry, "entry");
        entries.add(index, entry);
        modCount++;
    }

    @Override
    public FutureLegEntry remove(int index) {
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
     * Decodes entries until the bytes given are spent, replacing any held.
     *
     * @param data   the buffer to decode from
     * @param offset the index of the first entry's first byte
     * @param end    the index just past the last byte the entries fill
     * @return true when entries decoded that fill the bytes exactly
     */
    public boolean parse(byte[] data, int offset, int end) {
        empty();
        int cursor = offset;
        while (cursor < end) {
            FutureLegEntry entry = new FutureLegEntry();
            if (!entry.parseFrom(data, cursor, end) || entry.byteLength() == 0) {
                failedEntry = entry;
                return false;
            }
            entries.add(entry);
            cursor += entry.byteLength();
        }
        decoded = true;
        return true;
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
            FutureLegEntry entry = new FutureLegEntry();
            if (!entry.parseFrom(data, cursor, end)) {
                failedEntry = entry;
                return false;
            }
            entries.add(entry);
            cursor += FutureLegEntry.BYTE_LENGTH;
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
        for (FutureLegEntry entry : entries) {
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
        return entries.size() * FutureLegEntry.BYTE_LENGTH;
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
    public Optional<FutureLegEntry> failedEntry() {
        return Optional.ofNullable(failedEntry);
    }

    /**
     * Returns whether every entry holds only values the protocol declares.
     *
     * @return true when every entry is recognized
     */
    public boolean isRecognized() {
        for (FutureLegEntry entry : entries) {
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
        for (FutureLegEntry entry : entries) {
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
    public List<Field> diffFields(FutureLegList other) {
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
        for (FutureLegEntry entry : entries) {
            entry.toFormattedString(builder, nested);
        }
    }
}
