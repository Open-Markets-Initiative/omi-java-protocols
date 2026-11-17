package omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * The Leg Information entries of a message, each a copy its message decoded.
 *
 * <p>The list keeps one entry flyweight per entry, grown to the most entries any message has held and decoded into
 * again after, and is its own iterator, so reading the entries allocates nothing. The list and its entries are
 * valid until their message decodes the next one.</p>
 */
public final class LegInformationList implements Iterable<LegInformationEntry>, Iterator<LegInformationEntry> {

    private LegInformationEntry[] entries = new LegInformationEntry[0];

    private int count;

    private int next;

    /**
     * Creates a list holding no entries; its message decodes into it.
     */
    public LegInformationList() {
    }

    /**
     * Decodes entries, which their message has checked lie inside the bytes it was given, into the list's own.
     *
     * @param buffer the bytes holding the entries
     * @param offset where the first entry starts
     * @param count how many entries there are
     */
    public void read(byte[] buffer, int offset, int count) {
        if (count > entries.length) {
            int held = entries.length;
            entries = Arrays.copyOf(entries, Math.max(count, 2 * held));
            for (int index = held; index < entries.length; index++) {
                entries[index] = new LegInformationEntry();
            }
        }
        for (int index = 0; index < count; index++) {
            int start = offset + index * LegInformationEntry.BYTE_LENGTH;
            entries[index].decode(buffer, start, start + LegInformationEntry.BYTE_LENGTH);
        }
        this.count = count;
        this.next = 0;
    }

    /**
     * Gets how many entries there are.
     *
     * @return the count
     */
    public int count() {
        return count;
    }

    /**
     * Gets one entry.
     *
     * @param index the entry's position, from zero
     * @return the entry
     * @throws IndexOutOfBoundsException when there is no entry at the index
     */
    public LegInformationEntry get(int index) {
        Objects.checkIndex(index, count);
        return entries[index];
    }

    /**
     * Starts walking the entries from the first, returning the list itself rather than allocating an iterator.
     *
     * @return this list
     */
    @Override
    public Iterator<LegInformationEntry> iterator() {
        next = 0;
        return this;
    }

    @Override
    public boolean hasNext() {
        return next < count;
    }

    @Override
    public LegInformationEntry next() {
        if (next >= count) {
            throw new NoSuchElementException();
        }
        return get(next++);
    }
}
