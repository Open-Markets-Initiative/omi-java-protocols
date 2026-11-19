package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.groups;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.types.PrintOptions;

/**
 * The entries of the CrossOrderAcknowledgmentOrderAllocations repeating group.
 *
 * <p>Entries added here reach the wire with their count, since encode writes the count field from this list.</p>
 */
public final class CrossOrderAcknowledgmentOrderAllocationsList extends AbstractList<CrossOrderAcknowledgmentOrderAllocationsEntry> {

    private static final String NAME = "CrossOrderAcknowledgmentOrderAllocations";

    private final List<CrossOrderAcknowledgmentOrderAllocationsEntry> entries = new ArrayList<>();

    private CrossOrderAcknowledgmentOrderAllocationsEntry failedEntry;

    private boolean decoded;

    private OptionalLong numberOfReturnBitfieldsInput = OptionalLong.empty();

    private OptionalLong crossOrderAcknowledgmentReturnBitfield1Input = OptionalLong.empty();

    private OptionalLong crossOrderAcknowledgmentReturnBitfield10Input = OptionalLong.empty();

    private OptionalLong crossOrderAcknowledgmentReturnBitfield2Input = OptionalLong.empty();

    private OptionalLong crossOrderAcknowledgmentReturnBitfield4Input = OptionalLong.empty();

    private OptionalLong crossOrderAcknowledgmentReturnBitfield3Input = OptionalLong.empty();

    private OptionalLong crossOrderAcknowledgmentReturnBitfield17Input = OptionalLong.empty();

    private OptionalLong crossOrderAcknowledgmentReturnBitfield18Input = OptionalLong.empty();

    private OptionalLong crossOrderAcknowledgmentReturnBitfield9Input = OptionalLong.empty();

    private OptionalLong crossOrderAcknowledgmentReturnBitfield11Input = OptionalLong.empty();

    /**
     * Creates an empty list.
     */
    public CrossOrderAcknowledgmentOrderAllocationsList() {
    }

    @Override
    public CrossOrderAcknowledgmentOrderAllocationsEntry get(int index) {
        return entries.get(index);
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public CrossOrderAcknowledgmentOrderAllocationsEntry set(int index, CrossOrderAcknowledgmentOrderAllocationsEntry entry) {
        Objects.requireNonNull(entry, "entry");
        return entries.set(index, entry);
    }

    @Override
    public void add(int index, CrossOrderAcknowledgmentOrderAllocationsEntry entry) {
        Objects.requireNonNull(entry, "entry");
        entries.add(index, entry);
        modCount++;
    }

    @Override
    public CrossOrderAcknowledgmentOrderAllocationsEntry remove(int index) {
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
     * @param crossOrderAcknowledgmentReturnBitfield1Input the CrossOrderAcknowledgmentReturnBitfield1 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderAcknowledgmentReturnBitfield10Input the CrossOrderAcknowledgmentReturnBitfield10 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderAcknowledgmentReturnBitfield2Input the CrossOrderAcknowledgmentReturnBitfield2 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderAcknowledgmentReturnBitfield4Input the CrossOrderAcknowledgmentReturnBitfield4 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderAcknowledgmentReturnBitfield3Input the CrossOrderAcknowledgmentReturnBitfield3 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderAcknowledgmentReturnBitfield17Input the CrossOrderAcknowledgmentReturnBitfield17 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderAcknowledgmentReturnBitfield18Input the CrossOrderAcknowledgmentReturnBitfield18 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderAcknowledgmentReturnBitfield9Input the CrossOrderAcknowledgmentReturnBitfield9 its holder holds, or empty while it is off the holder's wire
     * @param crossOrderAcknowledgmentReturnBitfield11Input the CrossOrderAcknowledgmentReturnBitfield11 its holder holds, or empty while it is off the holder's wire
     */
    public void inputs(OptionalLong numberOfReturnBitfieldsInput, OptionalLong crossOrderAcknowledgmentReturnBitfield1Input, OptionalLong crossOrderAcknowledgmentReturnBitfield10Input, OptionalLong crossOrderAcknowledgmentReturnBitfield2Input, OptionalLong crossOrderAcknowledgmentReturnBitfield4Input, OptionalLong crossOrderAcknowledgmentReturnBitfield3Input, OptionalLong crossOrderAcknowledgmentReturnBitfield17Input, OptionalLong crossOrderAcknowledgmentReturnBitfield18Input, OptionalLong crossOrderAcknowledgmentReturnBitfield9Input, OptionalLong crossOrderAcknowledgmentReturnBitfield11Input) {
        this.numberOfReturnBitfieldsInput = numberOfReturnBitfieldsInput;
        this.crossOrderAcknowledgmentReturnBitfield1Input = crossOrderAcknowledgmentReturnBitfield1Input;
        this.crossOrderAcknowledgmentReturnBitfield10Input = crossOrderAcknowledgmentReturnBitfield10Input;
        this.crossOrderAcknowledgmentReturnBitfield2Input = crossOrderAcknowledgmentReturnBitfield2Input;
        this.crossOrderAcknowledgmentReturnBitfield4Input = crossOrderAcknowledgmentReturnBitfield4Input;
        this.crossOrderAcknowledgmentReturnBitfield3Input = crossOrderAcknowledgmentReturnBitfield3Input;
        this.crossOrderAcknowledgmentReturnBitfield17Input = crossOrderAcknowledgmentReturnBitfield17Input;
        this.crossOrderAcknowledgmentReturnBitfield18Input = crossOrderAcknowledgmentReturnBitfield18Input;
        this.crossOrderAcknowledgmentReturnBitfield9Input = crossOrderAcknowledgmentReturnBitfield9Input;
        this.crossOrderAcknowledgmentReturnBitfield11Input = crossOrderAcknowledgmentReturnBitfield11Input;
        for (CrossOrderAcknowledgmentOrderAllocationsEntry entry : entries) {
            entry.numberOfReturnBitfieldsInput(numberOfReturnBitfieldsInput);
            entry.crossOrderAcknowledgmentReturnBitfield1Input(crossOrderAcknowledgmentReturnBitfield1Input);
            entry.crossOrderAcknowledgmentReturnBitfield10Input(crossOrderAcknowledgmentReturnBitfield10Input);
            entry.crossOrderAcknowledgmentReturnBitfield2Input(crossOrderAcknowledgmentReturnBitfield2Input);
            entry.crossOrderAcknowledgmentReturnBitfield4Input(crossOrderAcknowledgmentReturnBitfield4Input);
            entry.crossOrderAcknowledgmentReturnBitfield3Input(crossOrderAcknowledgmentReturnBitfield3Input);
            entry.crossOrderAcknowledgmentReturnBitfield17Input(crossOrderAcknowledgmentReturnBitfield17Input);
            entry.crossOrderAcknowledgmentReturnBitfield18Input(crossOrderAcknowledgmentReturnBitfield18Input);
            entry.crossOrderAcknowledgmentReturnBitfield9Input(crossOrderAcknowledgmentReturnBitfield9Input);
            entry.crossOrderAcknowledgmentReturnBitfield11Input(crossOrderAcknowledgmentReturnBitfield11Input);
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
            CrossOrderAcknowledgmentOrderAllocationsEntry entry = new CrossOrderAcknowledgmentOrderAllocationsEntry();
            entry.numberOfReturnBitfieldsInput(numberOfReturnBitfieldsInput);
            entry.crossOrderAcknowledgmentReturnBitfield1Input(crossOrderAcknowledgmentReturnBitfield1Input);
            entry.crossOrderAcknowledgmentReturnBitfield10Input(crossOrderAcknowledgmentReturnBitfield10Input);
            entry.crossOrderAcknowledgmentReturnBitfield2Input(crossOrderAcknowledgmentReturnBitfield2Input);
            entry.crossOrderAcknowledgmentReturnBitfield4Input(crossOrderAcknowledgmentReturnBitfield4Input);
            entry.crossOrderAcknowledgmentReturnBitfield3Input(crossOrderAcknowledgmentReturnBitfield3Input);
            entry.crossOrderAcknowledgmentReturnBitfield17Input(crossOrderAcknowledgmentReturnBitfield17Input);
            entry.crossOrderAcknowledgmentReturnBitfield18Input(crossOrderAcknowledgmentReturnBitfield18Input);
            entry.crossOrderAcknowledgmentReturnBitfield9Input(crossOrderAcknowledgmentReturnBitfield9Input);
            entry.crossOrderAcknowledgmentReturnBitfield11Input(crossOrderAcknowledgmentReturnBitfield11Input);
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
        for (CrossOrderAcknowledgmentOrderAllocationsEntry entry : entries) {
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
        for (CrossOrderAcknowledgmentOrderAllocationsEntry entry : entries) {
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
    public Optional<CrossOrderAcknowledgmentOrderAllocationsEntry> failedEntry() {
        return Optional.ofNullable(failedEntry);
    }

    /**
     * Returns whether every entry holds only values the protocol declares.
     *
     * @return true when every entry is recognized
     */
    public boolean isRecognized() {
        for (CrossOrderAcknowledgmentOrderAllocationsEntry entry : entries) {
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
        for (CrossOrderAcknowledgmentOrderAllocationsEntry entry : entries) {
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
    public List<Field> diffFields(CrossOrderAcknowledgmentOrderAllocationsList other) {
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
        for (CrossOrderAcknowledgmentOrderAllocationsEntry entry : entries) {
            entry.toFormattedString(builder, nested);
        }
    }
}
