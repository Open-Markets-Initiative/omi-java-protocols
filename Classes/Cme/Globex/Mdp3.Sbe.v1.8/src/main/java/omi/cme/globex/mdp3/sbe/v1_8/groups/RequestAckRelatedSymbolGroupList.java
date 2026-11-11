package omi.cme.globex.mdp3.sbe.v1_8.groups;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.mdp3.sbe.v1_8.types.Field;
import omi.cme.globex.mdp3.sbe.v1_8.types.PrintOptions;

/**
 * The entries of the RequestAckRelatedSymbolGroup repeating group.
 *
 * <p>Entries added here reach the wire with their count, since encode writes the count field from this list.</p>
 */
public final class RequestAckRelatedSymbolGroupList extends AbstractList<RequestAckRelatedSymbolGroupEntry> {

    private static final String NAME = "RequestAckRelatedSymbolGroup";

    private final List<RequestAckRelatedSymbolGroupEntry> entries = new ArrayList<>();

    private RequestAckRelatedSymbolGroupEntry failedEntry;

    private boolean decoded;

    /**
     * The width of each entry's fixed part on the wire: what a parse read, else what this class knows of it.
     */
    private int block = RequestAckRelatedSymbolGroupEntry.ROOT_BYTE_LENGTH;

    /**
     * Creates an empty list.
     */
    public RequestAckRelatedSymbolGroupList() {
    }

    @Override
    public RequestAckRelatedSymbolGroupEntry get(int index) {
        return entries.get(index);
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public RequestAckRelatedSymbolGroupEntry set(int index, RequestAckRelatedSymbolGroupEntry entry) {
        Objects.requireNonNull(entry, "entry");
        entry.wireBlock(block);
        return entries.set(index, entry);
    }

    @Override
    public void add(int index, RequestAckRelatedSymbolGroupEntry entry) {
        Objects.requireNonNull(entry, "entry");
        entry.wireBlock(block);
        entries.add(index, entry);
        modCount++;
    }

    @Override
    public RequestAckRelatedSymbolGroupEntry remove(int index) {
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
        block = RequestAckRelatedSymbolGroupEntry.ROOT_BYTE_LENGTH;
    }

    /**
     * Decodes the entries a count states, replacing any held.
     *
     * @param data   the buffer to decode from
     * @param offset the index of the first entry's first byte
     * @param end    the index just past the last byte these entries may read
     * @param count  the number of entries
     * @param blockLength the width the wire gives each entry
     * @return true when every entry decoded; a negative count is refused
     */
    public boolean parse(byte[] data, int offset, int end, long count, long blockLength) {
        empty();
        if (count < 0 || blockLength < 0 || blockLength > Integer.MAX_VALUE) {
            return false;
        }
        block = (int) blockLength;
        int cursor = offset;
        for (long index = 0; index < count; index++) {
            RequestAckRelatedSymbolGroupEntry entry = new RequestAckRelatedSymbolGroupEntry();
            if (!entry.parseBlock(data, cursor, end, block)) {
                failedEntry = entry;
                return false;
            }
            if (entry.byteLength() == 0) {
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
        for (RequestAckRelatedSymbolGroupEntry entry : entries) {
            cursor = entry.encode(data, cursor);
        }
        return cursor;
    }

    /**
     * Returns the width the wire gives each entry, which encode writes to the block length field.
     *
     * @return the width in bytes
     */
    public int block() {
        return block;
    }

    /**
     * Returns the bytes these entries occupy on the wire.
     *
     * @return the width in bytes
     */
    public int byteLength() {
        int length = 0;
        for (RequestAckRelatedSymbolGroupEntry entry : entries) {
            length += entry.byteLength();
        }
        return length;
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
    public Optional<RequestAckRelatedSymbolGroupEntry> failedEntry() {
        return Optional.ofNullable(failedEntry);
    }

    /**
     * Returns whether every entry holds only values the protocol declares.
     *
     * @return true when every entry is recognized
     */
    public boolean isRecognized() {
        for (RequestAckRelatedSymbolGroupEntry entry : entries) {
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
        for (RequestAckRelatedSymbolGroupEntry entry : entries) {
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
    public List<Field> diffFields(RequestAckRelatedSymbolGroupList other) {
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
        for (RequestAckRelatedSymbolGroupEntry entry : entries) {
            entry.toFormattedString(builder, nested);
        }
    }
}
