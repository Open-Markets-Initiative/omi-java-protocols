package omi.nasdaq.nsmequities.orders.ouch.v5_0.groups;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;

/**
 * The entries of the ReplacedMessageAppendage repeating group.
 *
 * <p>Entries added here reach the wire with their count, since encode writes the count field from this list.</p>
 */
public final class ReplacedMessageAppendageList extends AbstractList<ReplacedMessageAppendageEntry> {

    private static final String NAME = "ReplacedMessageAppendage";

    private final List<ReplacedMessageAppendageEntry> entries = new ArrayList<>();

    private ReplacedMessageAppendageEntry failedEntry;

    private boolean decoded;

    /**
     * Creates an empty list.
     */
    public ReplacedMessageAppendageList() {
    }

    @Override
    public ReplacedMessageAppendageEntry get(int index) {
        return entries.get(index);
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public ReplacedMessageAppendageEntry set(int index, ReplacedMessageAppendageEntry entry) {
        Objects.requireNonNull(entry, "entry");
        return entries.set(index, entry);
    }

    @Override
    public void add(int index, ReplacedMessageAppendageEntry entry) {
        Objects.requireNonNull(entry, "entry");
        entries.add(index, entry);
        modCount++;
    }

    @Override
    public ReplacedMessageAppendageEntry remove(int index) {
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
            ReplacedMessageAppendageEntry entry = new ReplacedMessageAppendageEntry();
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
        for (ReplacedMessageAppendageEntry entry : entries) {
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
        int length = 0;
        for (ReplacedMessageAppendageEntry entry : entries) {
            length += entry.byteLength();
        }
        return length;
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
        for (ReplacedMessageAppendageEntry entry : entries) {
            cursor = entry.padding(runs, cursor);
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
    public Optional<ReplacedMessageAppendageEntry> failedEntry() {
        return Optional.ofNullable(failedEntry);
    }

    /**
     * Returns whether every entry holds only values the protocol declares.
     *
     * @return true when every entry is recognized
     */
    public boolean isRecognized() {
        for (ReplacedMessageAppendageEntry entry : entries) {
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
        for (ReplacedMessageAppendageEntry entry : entries) {
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
    public List<Field> diffFields(ReplacedMessageAppendageList other) {
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
        for (ReplacedMessageAppendageEntry entry : entries) {
            entry.toFormattedString(builder, nested);
        }
    }
}
