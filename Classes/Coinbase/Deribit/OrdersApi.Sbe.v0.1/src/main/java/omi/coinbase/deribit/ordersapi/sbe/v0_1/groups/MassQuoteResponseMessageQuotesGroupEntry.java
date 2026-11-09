package omi.coinbase.deribit.ordersapi.sbe.v0_1.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.AskOrderIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.AskPriceField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.AskRejectReasonField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.AskStatusField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.BidOrderIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.BidPriceField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.BidRejectReasonField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.BidStatusField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.InstrumentIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.AskFilledQty;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.AskQty;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.BidFilledQty;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.BidQty;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Field;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.GroupEntry;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.PrintOptions;

/**
 * One entry of the MassQuoteResponseMessageQuotesGroup repeating group.
 *
 * <p>quotes</p>
 */
public final class MassQuoteResponseMessageQuotesGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 80;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 80;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "MassQuoteResponseMessageQuotesGroup";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * bidOrderId
     */
    private final BidOrderIdField bidOrderId = new BidOrderIdField();

    /**
     * askOrderId
     */
    private final AskOrderIdField askOrderId = new AskOrderIdField();

    /**
     * bidPrice
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * askPrice
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * bidStatus
     */
    private final BidStatusField bidStatus = new BidStatusField();

    /**
     * askStatus
     */
    private final AskStatusField askStatus = new AskStatusField();

    /**
     * bidRejectReason
     */
    private final BidRejectReasonField bidRejectReason = new BidRejectReasonField();

    /**
     * askRejectReason
     */
    private final AskRejectReasonField askRejectReason = new AskRejectReasonField();

    /**
     * quotes
     */
    private final BidQty bidQty = new BidQty();

    /**
     * quotes
     */
    private final AskQty askQty = new AskQty();

    /**
     * quotes
     */
    private final BidFilledQty bidFilledQty = new BidFilledQty();

    /**
     * quotes
     */
    private final AskFilledQty askFilledQty = new AskFilledQty();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(instrumentId), List.<Field>of(bidOrderId), List.<Field>of(askOrderId), List.<Field>of(bidPrice), List.<Field>of(askPrice), bidQty.fields(), askQty.fields(), bidFilledQty.fields(), askFilledQty.fields(), List.<Field>of(bidStatus), List.<Field>of(askStatus), List.<Field>of(bidRejectReason), List.<Field>of(askRejectReason)).flatMap(List::stream).toList();

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
     * bidOrderId
     *
     * @return the BidOrderId field
     */
    public BidOrderIdField bidOrderId() {
        return bidOrderId;
    }

    /**
     * askOrderId
     *
     * @return the AskOrderId field
     */
    public AskOrderIdField askOrderId() {
        return askOrderId;
    }

    /**
     * bidPrice
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * askPrice
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * bidStatus
     *
     * @return the BidStatus field
     */
    public BidStatusField bidStatus() {
        return bidStatus;
    }

    /**
     * askStatus
     *
     * @return the AskStatus field
     */
    public AskStatusField askStatus() {
        return askStatus;
    }

    /**
     * bidRejectReason
     *
     * @return the BidRejectReason field
     */
    public BidRejectReasonField bidRejectReason() {
        return bidRejectReason;
    }

    /**
     * askRejectReason
     *
     * @return the AskRejectReason field
     */
    public AskRejectReasonField askRejectReason() {
        return askRejectReason;
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
        if (wireBlock >= 80) {
            return 80;
        }
        if (wireBlock >= 79) {
            return 79;
        }
        if (wireBlock >= 78) {
            return 78;
        }
        if (wireBlock >= 77) {
            return 77;
        }
        if (wireBlock >= 76) {
            return 76;
        }
        if (wireBlock >= 67) {
            return 67;
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
     * quotes
     *
     * @return the BidQty record
     */
    public BidQty bidQty() {
        return bidQty;
    }

    /**
     * quotes
     *
     * @return the AskQty record
     */
    public AskQty askQty() {
        return askQty;
    }

    /**
     * quotes
     *
     * @return the BidFilledQty record
     */
    public BidFilledQty bidFilledQty() {
        return bidFilledQty;
    }

    /**
     * quotes
     *
     * @return the AskFilledQty record
     */
    public AskFilledQty askFilledQty() {
        return askFilledQty;
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
            if (!instrumentId.parse(data, cursor)) {
                return false;
            }
            cursor += InstrumentIdField.BYTE_LENGTH;
        }
        if (known >= 16) {
            if (!bidOrderId.parse(data, cursor)) {
                return false;
            }
            cursor += BidOrderIdField.BYTE_LENGTH;
        }
        if (known >= 24) {
            if (!askOrderId.parse(data, cursor)) {
                return false;
            }
            cursor += AskOrderIdField.BYTE_LENGTH;
        }
        if (known >= 32) {
            if (!bidPrice.parse(data, cursor)) {
                return false;
            }
            cursor += BidPriceField.BYTE_LENGTH;
        }
        if (known >= 40) {
            if (!askPrice.parse(data, cursor)) {
                return false;
            }
            cursor += AskPriceField.BYTE_LENGTH;
        }
        if (known >= 49) {
            if (!bidQty.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += bidQty.byteLength();
        }
        if (known >= 58) {
            if (!askQty.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += askQty.byteLength();
        }
        if (known >= 67) {
            if (!bidFilledQty.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += bidFilledQty.byteLength();
        }
        if (known >= 76) {
            if (!askFilledQty.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += askFilledQty.byteLength();
        }
        if (known >= 77) {
            if (!bidStatus.parse(data, cursor)) {
                return false;
            }
            cursor += BidStatusField.BYTE_LENGTH;
        }
        if (known >= 78) {
            if (!askStatus.parse(data, cursor)) {
                return false;
            }
            cursor += AskStatusField.BYTE_LENGTH;
        }
        if (known >= 79) {
            if (!bidRejectReason.parse(data, cursor)) {
                return false;
            }
            cursor += BidRejectReasonField.BYTE_LENGTH;
        }
        if (known >= 80) {
            if (!askRejectReason.parse(data, cursor)) {
                return false;
            }
            cursor += AskRejectReasonField.BYTE_LENGTH;
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
            cursor = instrumentId.encode(data, cursor);
        }
        if (known >= 16) {
            cursor = bidOrderId.encode(data, cursor);
        }
        if (known >= 24) {
            cursor = askOrderId.encode(data, cursor);
        }
        if (known >= 32) {
            cursor = bidPrice.encode(data, cursor);
        }
        if (known >= 40) {
            cursor = askPrice.encode(data, cursor);
        }
        if (known >= 49) {
            cursor = bidQty.encode(data, cursor);
        }
        if (known >= 58) {
            cursor = askQty.encode(data, cursor);
        }
        if (known >= 67) {
            cursor = bidFilledQty.encode(data, cursor);
        }
        if (known >= 76) {
            cursor = askFilledQty.encode(data, cursor);
        }
        if (known >= 77) {
            cursor = bidStatus.encode(data, cursor);
        }
        if (known >= 78) {
            cursor = askStatus.encode(data, cursor);
        }
        if (known >= 79) {
            cursor = bidRejectReason.encode(data, cursor);
        }
        if (known >= 80) {
            cursor = askRejectReason.encode(data, cursor);
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
        bidQty.clear();
        askQty.clear();
        bidFilledQty.clear();
        askFilledQty.clear();
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
            case "BidOrderId" -> Optional.of(bidOrderId);
            case "AskOrderId" -> Optional.of(askOrderId);
            case "BidPrice" -> Optional.of(bidPrice);
            case "AskPrice" -> Optional.of(askPrice);
            case "BidStatus" -> Optional.of(bidStatus);
            case "AskStatus" -> Optional.of(askStatus);
            case "BidRejectReason" -> Optional.of(bidRejectReason);
            case "AskRejectReason" -> Optional.of(askRejectReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof MassQuoteResponseMessageQuotesGroupEntry message)) {
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
        if (!(other instanceof MassQuoteResponseMessageQuotesGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
