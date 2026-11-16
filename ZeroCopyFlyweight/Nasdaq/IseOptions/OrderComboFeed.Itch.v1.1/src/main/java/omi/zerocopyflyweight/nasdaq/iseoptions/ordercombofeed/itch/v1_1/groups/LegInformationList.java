package omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * The Leg Information entries of a message, read where they lie.
 *
 * <p>One entry flyweight is rewrapped for each entry, and the list is its own iterator, so reading the entries
 * allocates nothing. An entry returned is valid until the list returns another, and only while the bytes are
 * unchanged; the list itself is valid as long as the message that returned it.</p>
 */
public final class LegInformationList implements Iterable<LegInformationEntry>, Iterator<LegInformationEntry> {

    private final LegInformationEntry entry = new LegInformationEntry();

    private byte[] buffer;

    private int offset;

    private int count;

    private int next;

    /**
     * Creates a list wrapping nothing; its message wraps it.
     */
    public LegInformationList() {
    }

    /**
     * Points the list at entries, which its message has checked lie inside the bytes it was given.
     *
     * @param buffer the bytes holding the entries
     * @param offset where the first entry starts
     * @param count how many entries there are
     * @return this list
     */
    public LegInformationList wrap(byte[] buffer, int offset, int count) {
        this.buffer = buffer;
        this.offset = offset;
        this.count = count;
        this.next = 0;
        return this;
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
     * Gets one entry, rewrapping the list's one entry flyweight.
     *
     * @param index the entry's position, from zero
     * @return the entry
     * @throws IndexOutOfBoundsException when there is no entry at the index
     */
    public LegInformationEntry get(int index) {
        Objects.checkIndex(index, count);
        int start = offset + index * LegInformationEntry.BYTE_LENGTH;
        entry.wrap(buffer, start, start + LegInformationEntry.BYTE_LENGTH);
        return entry;
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
