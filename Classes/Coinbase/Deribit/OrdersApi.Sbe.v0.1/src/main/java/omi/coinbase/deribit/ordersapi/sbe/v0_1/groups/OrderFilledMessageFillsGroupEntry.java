package omi.coinbase.deribit.ordersapi.sbe.v0_1.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.ClientOrderIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.FlagsFillFlagsField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.InstrumentIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.MatchIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.OrderIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.PriceField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.SideField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.FillQty;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.TotalFilled;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Field;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.GroupEntry;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.PrintOptions;

/**
 * One entry of the OrderFilledMessageFillsGroup repeating group.
 *
 * <p>fills</p>
 */
public final class OrderFilledMessageFillsGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 60;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 60;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "OrderFilledMessageFillsGroup";

    /**
     * clientOrderId
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * orderId
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * matchId
     */
    private final MatchIdField matchId = new MatchIdField();

    /**
     * price
     */
    private final PriceField price = new PriceField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * FillFlags bit set
     */
    private final FlagsFillFlagsField flagsFillFlags = new FlagsFillFlagsField();

    /**
     * fills
     */
    private final FillQty fillQty = new FillQty();

    /**
     * NewOrderResponseMessage
     */
    private final TotalFilled totalFilled = new TotalFilled();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(clientOrderId), List.<Field>of(orderId), List.<Field>of(instrumentId), List.<Field>of(matchId), List.<Field>of(price), fillQty.fields(), totalFilled.fields(), List.<Field>of(side), List.<Field>of(flagsFillFlags)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * clientOrderId
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * orderId
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * instrumentId
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * matchId
     *
     * @return the MatchId field
     */
    public MatchIdField matchId() {
        return matchId;
    }

    /**
     * price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
     * FillFlags bit set
     *
     * @return the FlagsFillFlags field
     */
    public FlagsFillFlagsField flagsFillFlags() {
        return flagsFillFlags;
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
        if (wireBlock >= 60) {
            return 60;
        }
        if (wireBlock >= 59) {
            return 59;
        }
        if (wireBlock >= 58) {
            return 58;
        }
        if (wireBlock >= 49) {
            return 49;
        }
        if (wireBlock >= 40) {
            return 40;
        }
        if (wireBlock >= 32) {
            return 32;
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

    /**
     * fills
     *
     * @return the FillQty record
     */
    public FillQty fillQty() {
        return fillQty;
    }

    /**
     * NewOrderResponseMessage
     *
     * @return the TotalFilled record
     */
    public TotalFilled totalFilled() {
        return totalFilled;
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
            if (!clientOrderId.parse(data, cursor)) {
                return false;
            }
            cursor += ClientOrderIdField.BYTE_LENGTH;
        }
        if (known >= 16) {
            if (!orderId.parse(data, cursor)) {
                return false;
            }
            cursor += OrderIdField.BYTE_LENGTH;
        }
        if (known >= 24) {
            if (!instrumentId.parse(data, cursor)) {
                return false;
            }
            cursor += InstrumentIdField.BYTE_LENGTH;
        }
        if (known >= 32) {
            if (!matchId.parse(data, cursor)) {
                return false;
            }
            cursor += MatchIdField.BYTE_LENGTH;
        }
        if (known >= 40) {
            if (!price.parse(data, cursor)) {
                return false;
            }
            cursor += PriceField.BYTE_LENGTH;
        }
        if (known >= 49) {
            if (!fillQty.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += fillQty.byteLength();
        }
        if (known >= 58) {
            if (!totalFilled.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += totalFilled.byteLength();
        }
        if (known >= 59) {
            if (!side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
        }
        if (known >= 60) {
            if (!flagsFillFlags.parse(data, cursor)) {
                return false;
            }
            cursor += FlagsFillFlagsField.BYTE_LENGTH;
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
            cursor = clientOrderId.encode(data, cursor);
        }
        if (known >= 16) {
            cursor = orderId.encode(data, cursor);
        }
        if (known >= 24) {
            cursor = instrumentId.encode(data, cursor);
        }
        if (known >= 32) {
            cursor = matchId.encode(data, cursor);
        }
        if (known >= 40) {
            cursor = price.encode(data, cursor);
        }
        if (known >= 49) {
            cursor = fillQty.encode(data, cursor);
        }
        if (known >= 58) {
            cursor = totalFilled.encode(data, cursor);
        }
        if (known >= 59) {
            cursor = side.encode(data, cursor);
        }
        if (known >= 60) {
            cursor = flagsFillFlags.encode(data, cursor);
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
        fillQty.clear();
        totalFilled.clear();
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
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "OrderId" -> Optional.of(orderId);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "MatchId" -> Optional.of(matchId);
            case "Price" -> Optional.of(price);
            case "Side" -> Optional.of(side);
            case "FlagsFillFlags" -> Optional.of(flagsFillFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof OrderFilledMessageFillsGroupEntry message)) {
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
        if (!(other instanceof OrderFilledMessageFillsGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
