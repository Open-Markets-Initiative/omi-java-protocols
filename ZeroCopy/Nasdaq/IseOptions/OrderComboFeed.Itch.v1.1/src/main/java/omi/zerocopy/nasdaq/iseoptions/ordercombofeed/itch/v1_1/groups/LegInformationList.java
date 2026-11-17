package omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * The Leg Information entries of a message, read where they lie.
 *
 * <p>The list is immutable, and each entry asked for is a new view, so both are valid for as long as the bytes
 * viewed are unchanged.</p>
 */
public final class LegInformationList implements Iterable<LegInformationEntry> {

    private final byte[] buffer;

    private final int offset;

    private final int count;

    /**
     * Views entries, which their message has checked lie inside the bytes it was given.
     *
     * @param buffer the bytes holding the entries
     * @param offset where the first entry starts
     * @param count how many entries there are
     */
    public LegInformationList(byte[] buffer, int offset, int count) {
        this.buffer = Objects.requireNonNull(buffer, "buffer");
        this.offset = offset;
        this.count = count;
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
     * Gets one entry, as a new view.
     *
     * @param index the entry's position, from zero
     * @return the entry
     * @throws IndexOutOfBoundsException when there is no entry at the index
     */
    public LegInformationEntry get(int index) {
        Objects.checkIndex(index, count);
        int start = offset + index * LegInformationEntry.BYTE_LENGTH;
        return new LegInformationEntry(buffer, start, start + LegInformationEntry.BYTE_LENGTH);
    }

    /**
     * Walks the entries from the first, through an iterator of its own.
     *
     * @return the iterator
     */
    @Override
    public Iterator<LegInformationEntry> iterator() {
        return new Iterator<LegInformationEntry>() {

            private int next;

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
        };
    }
}
