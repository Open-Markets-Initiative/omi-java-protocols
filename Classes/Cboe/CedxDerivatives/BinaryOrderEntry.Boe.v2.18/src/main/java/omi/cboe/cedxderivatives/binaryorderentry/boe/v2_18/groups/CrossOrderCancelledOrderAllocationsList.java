package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.groups;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.PrintOptions;

/**
 * The entries of the CrossOrderCancelledOrderAllocations repeating group.
 *
 * <p>Entries added here reach the wire with their count, since encode writes the count field from this list.</p>
 */
public final class CrossOrderCancelledOrderAllocationsList extends AbstractList<CrossOrderCancelledOrderAllocationsEntry> {

    private static final String NAME = "CrossOrderCancelledOrderAllocations";

    private final List<CrossOrderCancelledOrderAllocationsEntry> entries = new ArrayList<>();

    private CrossOrderCancelledOrderAllocationsEntry failedEntry;

    private boolean decoded;

    private OptionalLong numberOfReturnBitfieldsInput = OptionalLong.empty();

    private OptionalLong crossOrderCancelledReturnBitfield1Input = OptionalLong.empty();

    private OptionalLong crossOrderCancelledReturnBitfield10Input = OptionalLong.empty();

    private OptionalLong crossOrderCancelledReturnBitfield2Input = OptionalLong.empty();

    private OptionalLong crossOrderCancelledReturnBitfield4Input = OptionalLong.empty();

    private OptionalLong crossOrderCancelledReturnBitfield3Input = OptionalLong.empty();

    private OptionalLong crossOrderCancelledReturnBitfield17Input = OptionalLong.empty();

    private OptionalLong crossOrderCancelledReturnBitfield18Input = OptionalLong.empty();

    private OptionalLong crossOrderCancelledReturnBitfield11Input = OptionalLong.empty();

    /**
     * Creates an empty list.
     */
    public CrossOrderCancelledOrderAllocationsList() {
    }

    @Override
    public CrossOrderCancelledOrderAllocationsEntry get(int index) {
        return entries.get(index);
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public CrossOrderCancelledOrderAllocationsEntry set(int index, CrossOrderCancelledOrderAllocationsEntry entry) {
        Objects.requireNonNull(entry, "entry");
        return entries.set(index, entry);
    }

    @Override
    public void add(int index, CrossOrderCancelledOrderAllocationsEntry entry) {
        Objects.requireNonNull(entry, "entry");
        entries.add(index, entry);
        modCount++;
    }

    @Override
    public CrossOrderCancelledOrderAllocationsEntry remove(int index) {
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
     * Gives every entry what its holder read before this list, which its members are present by; its holder gives it as it parses and measures itself.
     *
     * @param numberOfReturnBitfieldsInput the NumberOfReturnBitfields its holder holds, or empty while it is off the holder's wire
     * @param crossOrderCancelledReturnBitfield1Input the CrossOrderCancelledReturnBitfield1 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderCancelledReturnBitfield10Input the CrossOrderCancelledReturnBitfield10 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderCancelledReturnBitfield2Input the CrossOrderCancelledReturnBitfield2 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderCancelledReturnBitfield4Input the CrossOrderCancelledReturnBitfield4 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderCancelledReturnBitfield3Input the CrossOrderCancelledReturnBitfield3 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderCancelledReturnBitfield17Input the CrossOrderCancelledReturnBitfield17 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderCancelledReturnBitfield18Input the CrossOrderCancelledReturnBitfield18 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderCancelledReturnBitfield11Input the CrossOrderCancelledReturnBitfield11 its holder holds, or empty while it is off the holder's wire
     */
    public void inputs(OptionalLong numberOfReturnBitfieldsInput, OptionalLong crossOrderCancelledReturnBitfield1Input, OptionalLong crossOrderCancelledReturnBitfield10Input, OptionalLong crossOrderCancelledReturnBitfield2Input, OptionalLong crossOrderCancelledReturnBitfield4Input, OptionalLong crossOrderCancelledReturnBitfield3Input, OptionalLong crossOrderCancelledReturnBitfield17Input, OptionalLong crossOrderCancelledReturnBitfield18Input, OptionalLong crossOrderCancelledReturnBitfield11Input) {
        this.numberOfReturnBitfieldsInput = numberOfReturnBitfieldsInput;
        this.crossOrderCancelledReturnBitfield1Input = crossOrderCancelledReturnBitfield1Input;
        this.crossOrderCancelledReturnBitfield10Input = crossOrderCancelledReturnBitfield10Input;
        this.crossOrderCancelledReturnBitfield2Input = crossOrderCancelledReturnBitfield2Input;
        this.crossOrderCancelledReturnBitfield4Input = crossOrderCancelledReturnBitfield4Input;
        this.crossOrderCancelledReturnBitfield3Input = crossOrderCancelledReturnBitfield3Input;
        this.crossOrderCancelledReturnBitfield17Input = crossOrderCancelledReturnBitfield17Input;
        this.crossOrderCancelledReturnBitfield18Input = crossOrderCancelledReturnBitfield18Input;
        this.crossOrderCancelledReturnBitfield11Input = crossOrderCancelledReturnBitfield11Input;
        for (CrossOrderCancelledOrderAllocationsEntry entry : entries) {
            entry.numberOfReturnBitfieldsInput(numberOfReturnBitfieldsInput);
            entry.crossOrderCancelledReturnBitfield1Input(crossOrderCancelledReturnBitfield1Input);
            entry.crossOrderCancelledReturnBitfield10Input(crossOrderCancelledReturnBitfield10Input);
            entry.crossOrderCancelledReturnBitfield2Input(crossOrderCancelledReturnBitfield2Input);
            entry.crossOrderCancelledReturnBitfield4Input(crossOrderCancelledReturnBitfield4Input);
            entry.crossOrderCancelledReturnBitfield3Input(crossOrderCancelledReturnBitfield3Input);
            entry.crossOrderCancelledReturnBitfield17Input(crossOrderCancelledReturnBitfield17Input);
            entry.crossOrderCancelledReturnBitfield18Input(crossOrderCancelledReturnBitfield18Input);
            entry.crossOrderCancelledReturnBitfield11Input(crossOrderCancelledReturnBitfield11Input);
        }
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
            CrossOrderCancelledOrderAllocationsEntry entry = new CrossOrderCancelledOrderAllocationsEntry();
            entry.numberOfReturnBitfieldsInput(numberOfReturnBitfieldsInput);
            entry.crossOrderCancelledReturnBitfield1Input(crossOrderCancelledReturnBitfield1Input);
            entry.crossOrderCancelledReturnBitfield10Input(crossOrderCancelledReturnBitfield10Input);
            entry.crossOrderCancelledReturnBitfield2Input(crossOrderCancelledReturnBitfield2Input);
            entry.crossOrderCancelledReturnBitfield4Input(crossOrderCancelledReturnBitfield4Input);
            entry.crossOrderCancelledReturnBitfield3Input(crossOrderCancelledReturnBitfield3Input);
            entry.crossOrderCancelledReturnBitfield17Input(crossOrderCancelledReturnBitfield17Input);
            entry.crossOrderCancelledReturnBitfield18Input(crossOrderCancelledReturnBitfield18Input);
            entry.crossOrderCancelledReturnBitfield11Input(crossOrderCancelledReturnBitfield11Input);
            if (!entry.parseFrom(data, cursor, end)) {
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
        for (CrossOrderCancelledOrderAllocationsEntry entry : entries) {
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
        for (CrossOrderCancelledOrderAllocationsEntry entry : entries) {
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
    public Optional<CrossOrderCancelledOrderAllocationsEntry> failedEntry() {
        return Optional.ofNullable(failedEntry);
    }

    /**
     * Returns whether every entry holds only values the protocol declares.
     *
     * @return true when every entry is recognized
     */
    public boolean isRecognized() {
        for (CrossOrderCancelledOrderAllocationsEntry entry : entries) {
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
        for (CrossOrderCancelledOrderAllocationsEntry entry : entries) {
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
    public List<Field> diffFields(CrossOrderCancelledOrderAllocationsList other) {
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
        for (CrossOrderCancelledOrderAllocationsEntry entry : entries) {
            entry.toFormattedString(builder, nested);
        }
    }
}
