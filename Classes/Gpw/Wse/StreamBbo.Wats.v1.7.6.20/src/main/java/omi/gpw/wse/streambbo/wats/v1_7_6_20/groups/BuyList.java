package omi.gpw.wse.streambbo.wats.v1_7_6_20.groups;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.PrintOptions;

/**
 * The entries of the Buy repeating group.
 *
 * <p>An array of a stated size: the list always holds that many entries, and only replacing one changes it.</p>
 */
public final class BuyList extends AbstractList<BuyEntry> {

    private static final String NAME = "Buy";

    private final List<BuyEntry> entries = new ArrayList<>();

    private BuyEntry failedEntry;

    private boolean decoded;

    private final int stated;

    /**
     * Creates a list of default entries.
     *
     * @param stated the number of entries the wire carries
     */
    public BuyList(int stated) {
        this.stated = stated;
        fill();
    }

    private void fill() {
        for (int index = entries.size(); index < stated; index++) {
            entries.add(new BuyEntry());
        }
    }

    @Override
    public BuyEntry get(int index) {
        return entries.get(index);
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public BuyEntry set(int index, BuyEntry entry) {
        Objects.requireNonNull(entry, "entry");
        return entries.set(index, entry);
    }

    @Override
    public void add(int index, BuyEntry entry) {
        throw new UnsupportedOperationException(NAME + " always holds " + stated + " entries");
    }

    @Override
    public BuyEntry remove(int index) {
        throw new UnsupportedOperationException(NAME + " always holds " + stated + " entries");
    }

    @Override
    public void clear() {
        empty();
        fill();
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
            BuyEntry entry = new BuyEntry();
            if (!entry.parseFrom(data, cursor, end)) {
                failedEntry = entry;
                return false;
            }
            entries.add(entry);
            cursor += BuyEntry.BYTE_LENGTH;
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
        for (BuyEntry entry : entries) {
            cursor = entry.encode(data, cursor);
        }
        for (int index = entries.size(); index < stated; index++) {
            cursor = new BuyEntry().encode(data, cursor);
        }
        return cursor;
    }

    /**
     * Returns the bytes these entries occupy on the wire.
     *
     * @return the width in bytes
     */
    public int byteLength() {
        return Math.max(entries.size(), stated) * BuyEntry.BYTE_LENGTH;
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
    public Optional<BuyEntry> failedEntry() {
        return Optional.ofNullable(failedEntry);
    }

    /**
     * Returns whether every entry holds only values the protocol declares.
     *
     * @return true when every entry is recognized
     */
    public boolean isRecognized() {
        for (BuyEntry entry : entries) {
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
        for (BuyEntry entry : entries) {
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
    public List<Field> diffFields(BuyList other) {
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
        for (BuyEntry entry : entries) {
            entry.toFormattedString(builder, nested);
        }
    }
}
