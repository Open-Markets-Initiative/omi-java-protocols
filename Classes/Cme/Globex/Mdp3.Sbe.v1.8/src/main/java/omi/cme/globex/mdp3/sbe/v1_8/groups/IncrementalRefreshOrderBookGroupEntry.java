package omi.cme.globex.mdp3.sbe.v1_8.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.mdp3.sbe.v1_8.fields.MdDisplayQtyOptionalField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.MdEntryPxOptionalField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.MdEntryTypeBookField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.MdOrderPriorityField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.MdUpdateActionField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.OrderIdOptionalField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.SecurityIdField;
import omi.cme.globex.mdp3.sbe.v1_8.types.Field;
import omi.cme.globex.mdp3.sbe.v1_8.types.GroupEntry;
import omi.cme.globex.mdp3.sbe.v1_8.types.PrintOptions;

/**
 * One entry of the IncrementalRefreshOrderBookGroup repeating group.
 *
 * <p>Number of entries in Market Data message</p>
 */
public final class IncrementalRefreshOrderBookGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 40;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 40;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "IncrementalRefreshOrderBookGroup";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 34, 6 };

    /**
     * Order ID
     */
    private final OrderIdOptionalField orderIdOptional = new OrderIdOptionalField();

    /**
     * Order priority for execution on the order book
     */
    private final MdOrderPriorityField mdOrderPriority = new MdOrderPriorityField();

    /**
     * Market Data entry price
     */
    private final MdEntryPxOptionalField mdEntryPxOptional = new MdEntryPxOptionalField();

    /**
     * Visible qty of order
     */
    private final MdDisplayQtyOptionalField mdDisplayQtyOptional = new MdDisplayQtyOptionalField();

    /**
     * Unique instrument ID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Market Data update action
     */
    private final MdUpdateActionField mdUpdateAction = new MdUpdateActionField();

    /**
     * Market Data entry type
     */
    private final MdEntryTypeBookField mdEntryTypeBook = new MdEntryTypeBookField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(orderIdOptional, mdOrderPriority, mdEntryPxOptional, mdDisplayQtyOptional, securityId, mdUpdateAction, mdEntryTypeBook);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Order ID
     *
     * @return the OrderIdOptional field
     */
    public OrderIdOptionalField orderIdOptional() {
        return orderIdOptional;
    }

    /**
     * Order priority for execution on the order book
     *
     * @return the MdOrderPriority field
     */
    public MdOrderPriorityField mdOrderPriority() {
        return mdOrderPriority;
    }

    /**
     * Market Data entry price
     *
     * @return the MdEntryPxOptional field
     */
    public MdEntryPxOptionalField mdEntryPxOptional() {
        return mdEntryPxOptional;
    }

    /**
     * Visible qty of order
     *
     * @return the MdDisplayQtyOptional field
     */
    public MdDisplayQtyOptionalField mdDisplayQtyOptional() {
        return mdDisplayQtyOptional;
    }

    /**
     * Unique instrument ID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Market Data update action
     *
     * @return the MdUpdateAction field
     */
    public MdUpdateActionField mdUpdateAction() {
        return mdUpdateAction;
    }

    /**
     * Market Data entry type
     *
     * @return the MdEntryTypeBook field
     */
    public MdEntryTypeBookField mdEntryTypeBook() {
        return mdEntryTypeBook;
    }

    private int wireBlock = ROOT_BYTE_LENGTH;

    private byte[] blockTrailer = new byte[0];

    /**
     * Sets the width the wire gives this entry's fixed part, as the list holding it states.
     *
     * @param wireBlock the width in bytes
     */
    public void wireBlock(int wireBlock) {
        this.wireBlock = wireBlock;
    }

    /**
     * Returns the bytes of this entry's known fields that lie wholly inside its block.
     *
     * @return the width in bytes; a field past it is absent
     */
    public int knownBytes() {
        if (wireBlock >= 40) {
            return 40;
        }
        if (wireBlock >= 34) {
            return 34;
        }
        if (wireBlock >= 33) {
            return 33;
        }
        if (wireBlock >= 32) {
            return 32;
        }
        if (wireBlock >= 28) {
            return 28;
        }
        if (wireBlock >= 24) {
            return 24;
        }
        if (wireBlock >= 16) {
            return 16;
        }
        if (wireBlock >= 8) {
            return 8;
        }
        return 0;
    }

    /**
     * Returns what this entry's block held past the fields this class knows.
     *
     * @return a copy of those bytes, empty when the block held no more
     */
    public byte[] blockTrailer() {
        return blockTrailer.clone();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH - ROOT_BYTE_LENGTH + wireBlock;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        return parseBlock(data, offset, end, ROOT_BYTE_LENGTH);
    }

    /**
     * Decodes this entry given the width the wire states for its fixed part.
     *
     * @param data   the buffer to decode from
     * @param offset the index of this entry's first byte
     * @param end    the index just past the last byte this entry may read
     * @param block  the width of the fixed part
     * @return true when every field inside the block, and what follows it, decoded
     */
    public boolean parseBlock(byte[] data, int offset, int end, int block) {
        clear();
        this.wireBlock = block;
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH - ROOT_BYTE_LENGTH + wireBlock) {
            return false;
        }

        int cursor = offset;
        int known = knownBytes();
        if (known >= 8) {
            if (!orderIdOptional.parse(data, cursor)) {
                return false;
            }
            cursor += OrderIdOptionalField.BYTE_LENGTH;
        }
        if (known >= 16) {
            if (!mdOrderPriority.parse(data, cursor)) {
                return false;
            }
            cursor += MdOrderPriorityField.BYTE_LENGTH;
        }
        if (known >= 24) {
            if (!mdEntryPxOptional.parse(data, cursor)) {
                return false;
            }
            cursor += MdEntryPxOptionalField.BYTE_LENGTH;
        }
        if (known >= 28) {
            if (!mdDisplayQtyOptional.parse(data, cursor)) {
                return false;
            }
            cursor += MdDisplayQtyOptionalField.BYTE_LENGTH;
        }
        if (known >= 32) {
            if (!securityId.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityIdField.BYTE_LENGTH;
        }
        if (known >= 33) {
            if (!mdUpdateAction.parse(data, cursor)) {
                return false;
            }
            cursor += MdUpdateActionField.BYTE_LENGTH;
        }
        if (known >= 34) {
            if (!mdEntryTypeBook.parse(data, cursor)) {
                return false;
            }
            cursor += MdEntryTypeBookField.BYTE_LENGTH;
        }
        if (known >= 40) {
            cursor += 6; // padding
        }
        if (wireBlock > known) {
            this.blockTrailer = Arrays.copyOfRange(data, offset + known, offset + wireBlock);
        }
        cursor = offset + wireBlock;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        int known = knownBytes();
        if (known >= 8) {
            cursor = orderIdOptional.encode(data, cursor);
        }
        if (known >= 16) {
            cursor = mdOrderPriority.encode(data, cursor);
        }
        if (known >= 24) {
            cursor = mdEntryPxOptional.encode(data, cursor);
        }
        if (known >= 28) {
            cursor = mdDisplayQtyOptional.encode(data, cursor);
        }
        if (known >= 32) {
            cursor = securityId.encode(data, cursor);
        }
        if (known >= 33) {
            cursor = mdUpdateAction.encode(data, cursor);
        }
        if (known >= 34) {
            cursor = mdEntryTypeBook.encode(data, cursor);
        }
        if (known >= 40) {
            if (buffer != null && buffer.length >= 40) {
                System.arraycopy(buffer, 34, data, cursor, 6); // padding
            } else {
                Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
            }
            cursor += 6;
        }
        int kept = Math.min(blockTrailer.length, wireBlock - known);
        System.arraycopy(blockTrailer, 0, data, offset + known, kept);
        Arrays.fill(data, offset + known + kept, offset + wireBlock, (byte) 0);
        cursor = offset + wireBlock;
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        this.blockTrailer = new byte[0];
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields) {
            if ((!decoded || field.hasValue()) && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if ((!decoded || field.hasValue()) && !field.isValid()) {
                return false;
            }
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
     */
    @Override
    public Optional<byte[]> raw() {
        if (buffer == null) {
            return Optional.empty();
        }
        return Optional.of(buffer.clone());
    }

    @Override
    public Optional<Field> failedAt() {
        if (buffer == null || decoded) {
            return Optional.empty();
        }
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "OrderIdOptional" -> Optional.of(orderIdOptional);
            case "MdOrderPriority" -> Optional.of(mdOrderPriority);
            case "MdEntryPxOptional" -> Optional.of(mdEntryPxOptional);
            case "MdDisplayQtyOptional" -> Optional.of(mdDisplayQtyOptional);
            case "SecurityId" -> Optional.of(securityId);
            case "MdUpdateAction" -> Optional.of(mdUpdateAction);
            case "MdEntryTypeBook" -> Optional.of(mdEntryTypeBook);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof IncrementalRefreshOrderBookGroupEntry message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
     *
     * @param builder the destination
     * @param options the display options
     */
    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : fields) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncrementalRefreshOrderBookGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
