package omi.cme.brokertec.ilink3.sbe.v8_9.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.OrderIdOptionalField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.QuoteEntryIdField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.QuoteEntryRejectReasonOptionalField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.QuoteSetIdField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.SecurityIdField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.SideSideField;
import omi.cme.brokertec.ilink3.sbe.v8_9.types.Field;
import omi.cme.brokertec.ilink3.sbe.v8_9.types.GroupEntry;
import omi.cme.brokertec.ilink3.sbe.v8_9.types.PrintOptions;

/**
 * One entry of the MassQuoteResponseEntriesGroup repeating group.
 *
 * <p>The number of quote entries. Acknowledged or modified quotes contain order id value</p>
 */
public final class MassQuoteResponseEntriesGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 20;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 20;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "MassQuoteResponseEntriesGroup";

    /**
     * Unique identifier for order as assigned by the exchange. Uniqueness is guaranteed within a single trading day across all instruments.
     */
    private final OrderIdOptionalField orderIdOptional = new OrderIdOptionalField();

    /**
     * Unique identifier for a quote. The QuoteEntryID stays with the quote as a static identifier even if the quote is updated. For fills this value is transposed into client order ID (tag 11)
     */
    private final QuoteEntryIdField quoteEntryId = new QuoteEntryIdField();

    /**
     * Unique id for the Quote Set
     */
    private final QuoteSetIdField quoteSetId = new QuoteSetIdField();

    /**
     * Security ID as defined by CME. For the security ID list, see the security definition messages
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Quote side
     */
    private final SideSideField sideSide = new SideSideField();

    /**
     * Reason provided for requested quote entries that are rejected
     */
    private final QuoteEntryRejectReasonOptionalField quoteEntryRejectReasonOptional = new QuoteEntryRejectReasonOptionalField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(orderIdOptional, quoteEntryId, quoteSetId, securityId, sideSide, quoteEntryRejectReasonOptional);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique identifier for order as assigned by the exchange. Uniqueness is guaranteed within a single trading day across all instruments.
     *
     * @return the OrderIdOptional field
     */
    public OrderIdOptionalField orderIdOptional() {
        return orderIdOptional;
    }

    /**
     * Unique identifier for a quote. The QuoteEntryID stays with the quote as a static identifier even if the quote is updated. For fills this value is transposed into client order ID (tag 11)
     *
     * @return the QuoteEntryId field
     */
    public QuoteEntryIdField quoteEntryId() {
        return quoteEntryId;
    }

    /**
     * Unique id for the Quote Set
     *
     * @return the QuoteSetId field
     */
    public QuoteSetIdField quoteSetId() {
        return quoteSetId;
    }

    /**
     * Security ID as defined by CME. For the security ID list, see the security definition messages
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Quote side
     *
     * @return the SideSide field
     */
    public SideSideField sideSide() {
        return sideSide;
    }

    /**
     * Reason provided for requested quote entries that are rejected
     *
     * @return the QuoteEntryRejectReasonOptional field
     */
    public QuoteEntryRejectReasonOptionalField quoteEntryRejectReasonOptional() {
        return quoteEntryRejectReasonOptional;
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
        if (wireBlock >= 20) {
            return 20;
        }
        if (wireBlock >= 19) {
            return 19;
        }
        if (wireBlock >= 18) {
            return 18;
        }
        if (wireBlock >= 14) {
            return 14;
        }
        if (wireBlock >= 12) {
            return 12;
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
        return new int[0];
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
        if (known >= 12) {
            if (!quoteEntryId.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteEntryIdField.BYTE_LENGTH;
        }
        if (known >= 14) {
            if (!quoteSetId.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteSetIdField.BYTE_LENGTH;
        }
        if (known >= 18) {
            if (!securityId.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityIdField.BYTE_LENGTH;
        }
        if (known >= 19) {
            if (!sideSide.parse(data, cursor)) {
                return false;
            }
            cursor += SideSideField.BYTE_LENGTH;
        }
        if (known >= 20) {
            if (!quoteEntryRejectReasonOptional.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteEntryRejectReasonOptionalField.BYTE_LENGTH;
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
        if (known >= 12) {
            cursor = quoteEntryId.encode(data, cursor);
        }
        if (known >= 14) {
            cursor = quoteSetId.encode(data, cursor);
        }
        if (known >= 18) {
            cursor = securityId.encode(data, cursor);
        }
        if (known >= 19) {
            cursor = sideSide.encode(data, cursor);
        }
        if (known >= 20) {
            cursor = quoteEntryRejectReasonOptional.encode(data, cursor);
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
            case "QuoteEntryId" -> Optional.of(quoteEntryId);
            case "QuoteSetId" -> Optional.of(quoteSetId);
            case "SecurityId" -> Optional.of(securityId);
            case "SideSide" -> Optional.of(sideSide);
            case "QuoteEntryRejectReasonOptional" -> Optional.of(quoteEntryRejectReasonOptional);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof MassQuoteResponseEntriesGroupEntry message)) {
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
        if (!(other instanceof MassQuoteResponseEntriesGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
