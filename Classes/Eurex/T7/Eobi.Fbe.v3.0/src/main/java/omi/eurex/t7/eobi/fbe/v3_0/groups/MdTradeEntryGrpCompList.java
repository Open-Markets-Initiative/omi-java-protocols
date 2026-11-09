package omi.eurex.t7.eobi.fbe.v3_0.groups;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.eurex.t7.eobi.fbe.v3_0.types.Field;
import omi.eurex.t7.eobi.fbe.v3_0.types.PrintOptions;

/**
 * The entries of the MdTradeEntryGrpComp repeating group.
 *
 * <p>A filled group: every slot is on the wire, and this list holds those in use. Encode writes its size to the count field, and fills the rest.</p>
 */
public final class MdTradeEntryGrpCompList extends AbstractList<MdTradeEntryGrpCompEntry> {

    private static final String NAME = "MdTradeEntryGrpComp";

    private final List<MdTradeEntryGrpCompEntry> entries = new ArrayList<>();

    private MdTradeEntryGrpCompEntry failedEntry;

    private boolean decoded;

    private final int stated;

    /**
     * Its holder's copy of the bytes it decoded: what the unused slots held is written back from it while they stay unused.
     */
    private byte[] received;

    private int receivedOffset;

    private int receivedCount;

    /**
     * Creates an empty list.
     *
     * @param stated the number of entries the wire carries
     */
    public MdTradeEntryGrpCompList(int stated) {
        this.stated = stated;
    }

    @Override
    public MdTradeEntryGrpCompEntry get(int index) {
        return entries.get(index);
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public MdTradeEntryGrpCompEntry set(int index, MdTradeEntryGrpCompEntry entry) {
        Objects.requireNonNull(entry, "entry");
        return entries.set(index, entry);
    }

    @Override
    public void add(int index, MdTradeEntryGrpCompEntry entry) {
        if (entries.size() == stated) {
            throw new IllegalStateException(NAME + " carries only " + stated + " slots");
        }
        Objects.requireNonNull(entry, "entry");
        entries.add(index, entry);
        modCount++;
    }

    @Override
    public MdTradeEntryGrpCompEntry remove(int index) {
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
        received = null;
        receivedOffset = 0;
        receivedCount = 0;
    }

    /**
     * Decodes the slots a count field says are in use, replacing any held, and steps over the rest.
     *
     * @param data   the buffer to decode from
     * @param offset the index of the first entry's first byte
     * @param end    the index just past the last byte these entries may read
     * @param count  the number of entries
     * @return true when every entry decoded; a negative count is refused
     */
    public boolean parse(byte[] data, int offset, int end, long count) {
        empty();
        if (count < 0 || count > stated) {
            return false;
        }
        if (end - offset < stated * MdTradeEntryGrpCompEntry.BYTE_LENGTH) {
            return false;
        }
        int cursor = offset;
        for (long index = 0; index < count; index++) {
            MdTradeEntryGrpCompEntry entry = new MdTradeEntryGrpCompEntry();
            if (!entry.parseFrom(data, cursor, end)) {
                failedEntry = entry;
                return false;
            }
            entries.add(entry);
            cursor += MdTradeEntryGrpCompEntry.BYTE_LENGTH;
        }
        receivedOffset = offset;
        receivedCount = (int) count;
        decoded = true;
        return true;
    }

    /**
     * Gives this list the copy of the bytes its holder kept, for the slots the last parse stepped over.
     *
     * @param bytes  the holder's bytes
     * @param offset where they began in the buffer the list parsed
     */
    public void keep(byte[] bytes, int offset) {
        received = bytes;
        receivedOffset -= offset;
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
        for (MdTradeEntryGrpCompEntry entry : entries) {
            cursor = entry.encode(data, cursor);
        }
        int used = entries.size();
        int finish = offset + stated * MdTradeEntryGrpCompEntry.BYTE_LENGTH;
        for (; cursor < finish; cursor += MdTradeEntryGrpCompEntry.BYTE_LENGTH) {
            Arrays.fill(data, cursor, cursor + MdTradeEntryGrpCompEntry.BYTE_LENGTH, (byte) 0x00);
        }
        if (received != null) {
            int kept = Math.max(receivedCount, used);
            System.arraycopy(received, receivedOffset + kept * MdTradeEntryGrpCompEntry.BYTE_LENGTH, data, offset + kept * MdTradeEntryGrpCompEntry.BYTE_LENGTH, (stated - kept) * MdTradeEntryGrpCompEntry.BYTE_LENGTH);
        }
        return cursor;
    }

    /**
     * Returns the slots the wire always carries, of which this list holds those in use.
     *
     * @return the number of slots
     */
    public int slots() {
        return stated;
    }

    /**
     * Returns the bytes these entries occupy on the wire.
     *
     * @return the width in bytes
     */
    public int byteLength() {
        return stated * MdTradeEntryGrpCompEntry.BYTE_LENGTH;
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
        int[] padding = MdTradeEntryGrpCompEntry.padding();
        for (int index = 0; index < stated; index++) {
            for (int run = 0; run < padding.length; run += 2) {
                runs.add(cursor + padding[run]).add(padding[run + 1]);
            }
            cursor += MdTradeEntryGrpCompEntry.BYTE_LENGTH;
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
    public Optional<MdTradeEntryGrpCompEntry> failedEntry() {
        return Optional.ofNullable(failedEntry);
    }

    /**
     * Returns whether every entry holds only values the protocol declares.
     *
     * @return true when every entry is recognized
     */
    public boolean isRecognized() {
        for (MdTradeEntryGrpCompEntry entry : entries) {
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
        for (MdTradeEntryGrpCompEntry entry : entries) {
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
    public List<Field> diffFields(MdTradeEntryGrpCompList other) {
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
        for (MdTradeEntryGrpCompEntry entry : entries) {
            entry.toFormattedString(builder, nested);
        }
    }
}
