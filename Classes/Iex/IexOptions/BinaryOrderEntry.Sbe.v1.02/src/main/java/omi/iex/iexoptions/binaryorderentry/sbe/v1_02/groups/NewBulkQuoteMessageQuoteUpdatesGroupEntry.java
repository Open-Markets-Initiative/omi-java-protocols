package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.InstrumentIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.OrderQtyQuantityZeroOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.PricePrice4OptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.QuoteTypeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ReservedField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.SideField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.GroupEntry;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.PrintOptions;

/**
 * One entry of the NewBulkQuoteMessageQuoteUpdatesGroup repeating group.
 *
 * <p>quoteUpdates</p>
 */
public final class NewBulkQuoteMessageQuoteUpdatesGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 15;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 15;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "NewBulkQuoteMessageQuoteUpdatesGroup";

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * Order price
     */
    private final PricePrice4OptionalField pricePrice4Optional = new PricePrice4OptionalField();

    /**
     * Order quantity
     */
    private final OrderQtyQuantityZeroOptionalField orderQtyQuantityZeroOptional = new OrderQtyQuantityZeroOptionalField();

    /**
     * Type of quote
     */
    private final QuoteTypeField quoteType = new QuoteTypeField();

    /**
     * Reserved for future use
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, side, pricePrice4Optional, orderQtyQuantityZeroOptional, quoteType, reserved);

    private byte[] buffer;

    private boolean decoded;

    /**
     * instrumentId
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Order price
     *
     * @return the PricePrice4Optional field
     */
    public PricePrice4OptionalField pricePrice4Optional() {
        return pricePrice4Optional;
    }

    /**
     * Order quantity
     *
     * @return the OrderQtyQuantityZeroOptional field
     */
    public OrderQtyQuantityZeroOptionalField orderQtyQuantityZeroOptional() {
        return orderQtyQuantityZeroOptional;
    }

    /**
     * Type of quote
     *
     * @return the QuoteType field
     */
    public QuoteTypeField quoteType() {
        return quoteType;
    }

    /**
     * Reserved for future use
     *
     * @return the Reserved field
     */
    public ReservedField reserved() {
        return reserved;
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
        if (wireBlock >= 15) {
            return 15;
        }
        if (wireBlock >= 14) {
            return 14;
        }
        if (wireBlock >= 13) {
            return 13;
        }
        if (wireBlock >= 9) {
            return 9;
        }
        if (wireBlock >= 5) {
            return 5;
        }
        if (wireBlock >= 4) {
            return 4;
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
        if (known >= 4) {
            if (!instrumentId.parse(data, cursor)) {
                return false;
            }
            cursor += InstrumentIdField.BYTE_LENGTH;
        }
        if (known >= 5) {
            if (!side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
        }
        if (known >= 9) {
            if (!pricePrice4Optional.parse(data, cursor)) {
                return false;
            }
            cursor += PricePrice4OptionalField.BYTE_LENGTH;
        }
        if (known >= 13) {
            if (!orderQtyQuantityZeroOptional.parse(data, cursor)) {
                return false;
            }
            cursor += OrderQtyQuantityZeroOptionalField.BYTE_LENGTH;
        }
        if (known >= 14) {
            if (!quoteType.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteTypeField.BYTE_LENGTH;
        }
        if (known >= 15) {
            if (!reserved.parse(data, cursor)) {
                return false;
            }
            cursor += ReservedField.BYTE_LENGTH;
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
        if (known >= 4) {
            cursor = instrumentId.encode(data, cursor);
        }
        if (known >= 5) {
            cursor = side.encode(data, cursor);
        }
        if (known >= 9) {
            cursor = pricePrice4Optional.encode(data, cursor);
        }
        if (known >= 13) {
            cursor = orderQtyQuantityZeroOptional.encode(data, cursor);
        }
        if (known >= 14) {
            cursor = quoteType.encode(data, cursor);
        }
        if (known >= 15) {
            cursor = reserved.encode(data, cursor);
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "Side" -> Optional.of(side);
            case "PricePrice4Optional" -> Optional.of(pricePrice4Optional);
            case "OrderQtyQuantityZeroOptional" -> Optional.of(orderQtyQuantityZeroOptional);
            case "QuoteType" -> Optional.of(quoteType);
            case "Reserved" -> Optional.of(reserved);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof NewBulkQuoteMessageQuoteUpdatesGroupEntry message)) {
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
        if (!(other instanceof NewBulkQuoteMessageQuoteUpdatesGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
