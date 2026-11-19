package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.groups;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.types.Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.types.PrintOptions;

/**
 * The entries of the TradeCaptureConfirmV2TrdCapAckSideGrp repeating group.
 *
 * <p>Entries added here reach the wire with their count, since encode writes the count field from this list.</p>
 */
public final class TradeCaptureConfirmV2TrdCapAckSideGrpList extends AbstractList<TradeCaptureConfirmV2TrdCapAckSideGrpEntry> {

    private static final String NAME = "TradeCaptureConfirmV2TrdCapAckSideGrp";

    private final List<TradeCaptureConfirmV2TrdCapAckSideGrpEntry> entries = new ArrayList<>();

    private TradeCaptureConfirmV2TrdCapAckSideGrpEntry failedEntry;

    private boolean decoded;

    private OptionalLong numberOfTradeCaptureConfirmV2BitfieldsInput = OptionalLong.empty();

    private OptionalLong tradeCaptureConfirmV2Bitfield1Input = OptionalLong.empty();

    private OptionalLong tradeCaptureConfirmV2Bitfield2Input = OptionalLong.empty();

    private OptionalLong tradeCaptureConfirmV2Bitfield3Input = OptionalLong.empty();

    private OptionalLong tradeCaptureConfirmV2Bitfield4Input = OptionalLong.empty();

    private OptionalLong tradeCaptureConfirmV2Bitfield6Input = OptionalLong.empty();

    /**
     * Creates an empty list.
     */
    public TradeCaptureConfirmV2TrdCapAckSideGrpList() {
    }

    @Override
    public TradeCaptureConfirmV2TrdCapAckSideGrpEntry get(int index) {
        return entries.get(index);
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public TradeCaptureConfirmV2TrdCapAckSideGrpEntry set(int index, TradeCaptureConfirmV2TrdCapAckSideGrpEntry entry) {
        Objects.requireNonNull(entry, "entry");
        return entries.set(index, entry);
    }

    @Override
    public void add(int index, TradeCaptureConfirmV2TrdCapAckSideGrpEntry entry) {
        Objects.requireNonNull(entry, "entry");
        entries.add(index, entry);
        modCount++;
    }

    @Override
    public TradeCaptureConfirmV2TrdCapAckSideGrpEntry remove(int index) {
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
     * @param numberOfTradeCaptureConfirmV2BitfieldsInput the NumberOfTradeCaptureConfirmV2Bitfields its holder holds, or empty while it is off the holder's wire
     * @param tradeCaptureConfirmV2Bitfield1Input the TradeCaptureConfirmV2Bitfield1 its holder holds, or empty while it is off the holder's wire
     * @param tradeCaptureConfirmV2Bitfield2Input the TradeCaptureConfirmV2Bitfield2 its holder holds, or empty while it is off the holder's wire
     * @param tradeCaptureConfirmV2Bitfield3Input the TradeCaptureConfirmV2Bitfield3 its holder holds, or empty while it is off the holder's wire
     * @param tradeCaptureConfirmV2Bitfield4Input the TradeCaptureConfirmV2Bitfield4 its holder holds, or empty while it is off the holder's wire
     * @param tradeCaptureConfirmV2Bitfield6Input the TradeCaptureConfirmV2Bitfield6 its holder holds, or empty while it is off the holder's wire
     */
    public void inputs(OptionalLong numberOfTradeCaptureConfirmV2BitfieldsInput, OptionalLong tradeCaptureConfirmV2Bitfield1Input, OptionalLong tradeCaptureConfirmV2Bitfield2Input, OptionalLong tradeCaptureConfirmV2Bitfield3Input, OptionalLong tradeCaptureConfirmV2Bitfield4Input, OptionalLong tradeCaptureConfirmV2Bitfield6Input) {
        this.numberOfTradeCaptureConfirmV2BitfieldsInput = numberOfTradeCaptureConfirmV2BitfieldsInput;
        this.tradeCaptureConfirmV2Bitfield1Input = tradeCaptureConfirmV2Bitfield1Input;
        this.tradeCaptureConfirmV2Bitfield2Input = tradeCaptureConfirmV2Bitfield2Input;
        this.tradeCaptureConfirmV2Bitfield3Input = tradeCaptureConfirmV2Bitfield3Input;
        this.tradeCaptureConfirmV2Bitfield4Input = tradeCaptureConfirmV2Bitfield4Input;
        this.tradeCaptureConfirmV2Bitfield6Input = tradeCaptureConfirmV2Bitfield6Input;
        for (TradeCaptureConfirmV2TrdCapAckSideGrpEntry entry : entries) {
            entry.numberOfTradeCaptureConfirmV2BitfieldsInput(numberOfTradeCaptureConfirmV2BitfieldsInput);
            entry.tradeCaptureConfirmV2Bitfield1Input(tradeCaptureConfirmV2Bitfield1Input);
            entry.tradeCaptureConfirmV2Bitfield2Input(tradeCaptureConfirmV2Bitfield2Input);
            entry.tradeCaptureConfirmV2Bitfield3Input(tradeCaptureConfirmV2Bitfield3Input);
            entry.tradeCaptureConfirmV2Bitfield4Input(tradeCaptureConfirmV2Bitfield4Input);
            entry.tradeCaptureConfirmV2Bitfield6Input(tradeCaptureConfirmV2Bitfield6Input);
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
            TradeCaptureConfirmV2TrdCapAckSideGrpEntry entry = new TradeCaptureConfirmV2TrdCapAckSideGrpEntry();
            entry.numberOfTradeCaptureConfirmV2BitfieldsInput(numberOfTradeCaptureConfirmV2BitfieldsInput);
            entry.tradeCaptureConfirmV2Bitfield1Input(tradeCaptureConfirmV2Bitfield1Input);
            entry.tradeCaptureConfirmV2Bitfield2Input(tradeCaptureConfirmV2Bitfield2Input);
            entry.tradeCaptureConfirmV2Bitfield3Input(tradeCaptureConfirmV2Bitfield3Input);
            entry.tradeCaptureConfirmV2Bitfield4Input(tradeCaptureConfirmV2Bitfield4Input);
            entry.tradeCaptureConfirmV2Bitfield6Input(tradeCaptureConfirmV2Bitfield6Input);
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
        for (TradeCaptureConfirmV2TrdCapAckSideGrpEntry entry : entries) {
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
        for (TradeCaptureConfirmV2TrdCapAckSideGrpEntry entry : entries) {
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
    public Optional<TradeCaptureConfirmV2TrdCapAckSideGrpEntry> failedEntry() {
        return Optional.ofNullable(failedEntry);
    }

    /**
     * Returns whether every entry holds only values the protocol declares.
     *
     * @return true when every entry is recognized
     */
    public boolean isRecognized() {
        for (TradeCaptureConfirmV2TrdCapAckSideGrpEntry entry : entries) {
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
        for (TradeCaptureConfirmV2TrdCapAckSideGrpEntry entry : entries) {
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
    public List<Field> diffFields(TradeCaptureConfirmV2TrdCapAckSideGrpList other) {
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
        for (TradeCaptureConfirmV2TrdCapAckSideGrpEntry entry : entries) {
            entry.toFormattedString(builder, nested);
        }
    }
}
