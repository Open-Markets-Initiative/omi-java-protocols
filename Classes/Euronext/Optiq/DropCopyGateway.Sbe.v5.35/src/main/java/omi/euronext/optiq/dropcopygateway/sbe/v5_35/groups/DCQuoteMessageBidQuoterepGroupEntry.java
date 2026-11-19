package omi.euronext.optiq.dropcopygateway.sbe.v5_35.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BidErrorCodeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BidLeavesQuantityField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BidOeSessionIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BidOrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BidPreviousPxField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BidPreviousSizeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BidPxField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BidQuotePriorityField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BidSizeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BuyRevisionFlagField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.RfeAnswerOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.GroupEntry;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.PrintOptions;

/**
 * One entry of the DCQuoteMessageBidQuoterepGroup repeating group.
 *
 * <p>BidQuoterep</p>
 */
public final class DCQuoteMessageBidQuoterepGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 68;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 68;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "DCQuoteMessageBidQuoterepGroup";

    /**
     * bidSize
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * bidPx
     */
    private final BidPxField bidPx = new BidPxField();

    /**
     * bidQuotePriority
     */
    private final BidQuotePriorityField bidQuotePriority = new BidQuotePriorityField();

    /**
     * bidOrderID
     */
    private final BidOrderIdField bidOrderId = new BidOrderIdField();

    /**
     * buyRevisionFlag
     */
    private final BuyRevisionFlagField buyRevisionFlag = new BuyRevisionFlagField();

    /**
     * bidErrorCode
     */
    private final BidErrorCodeField bidErrorCode = new BidErrorCodeField();

    /**
     * bidOESessionID
     */
    private final BidOeSessionIdField bidOeSessionId = new BidOeSessionIdField();

    /**
     * rFEAnswer
     */
    private final RfeAnswerOptionalField rfeAnswerOptional = new RfeAnswerOptionalField();

    /**
     * bidLeavesQuantity
     */
    private final BidLeavesQuantityField bidLeavesQuantity = new BidLeavesQuantityField();

    /**
     * bidPreviousSize
     */
    private final BidPreviousSizeField bidPreviousSize = new BidPreviousSizeField();

    /**
     * bidPreviousPx
     */
    private final BidPreviousPxField bidPreviousPx = new BidPreviousPxField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(bidSize, bidPx, bidQuotePriority, bidOrderId, buyRevisionFlag, bidErrorCode, bidOeSessionId, rfeAnswerOptional, bidLeavesQuantity, bidPreviousSize, bidPreviousPx);

    private byte[] buffer;

    private boolean decoded;

    /**
     * bidSize
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * bidPx
     *
     * @return the BidPx field
     */
    public BidPxField bidPx() {
        return bidPx;
    }

    /**
     * bidQuotePriority
     *
     * @return the BidQuotePriority field
     */
    public BidQuotePriorityField bidQuotePriority() {
        return bidQuotePriority;
    }

    /**
     * bidOrderID
     *
     * @return the BidOrderId field
     */
    public BidOrderIdField bidOrderId() {
        return bidOrderId;
    }

    /**
     * buyRevisionFlag
     *
     * @return the BuyRevisionFlag field
     */
    public BuyRevisionFlagField buyRevisionFlag() {
        return buyRevisionFlag;
    }

    /**
     * bidErrorCode
     *
     * @return the BidErrorCode field
     */
    public BidErrorCodeField bidErrorCode() {
        return bidErrorCode;
    }

    /**
     * bidOESessionID
     *
     * @return the BidOeSessionId field
     */
    public BidOeSessionIdField bidOeSessionId() {
        return bidOeSessionId;
    }

    /**
     * rFEAnswer
     *
     * @return the RfeAnswerOptional field
     */
    public RfeAnswerOptionalField rfeAnswerOptional() {
        return rfeAnswerOptional;
    }

    /**
     * bidLeavesQuantity
     *
     * @return the BidLeavesQuantity field
     */
    public BidLeavesQuantityField bidLeavesQuantity() {
        return bidLeavesQuantity;
    }

    /**
     * bidPreviousSize
     *
     * @return the BidPreviousSize field
     */
    public BidPreviousSizeField bidPreviousSize() {
        return bidPreviousSize;
    }

    /**
     * bidPreviousPx
     *
     * @return the BidPreviousPx field
     */
    public BidPreviousPxField bidPreviousPx() {
        return bidPreviousPx;
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
        if (wireBlock >= 68) {
            return 68;
        }
        if (wireBlock >= 60) {
            return 60;
        }
        if (wireBlock >= 52) {
            return 52;
        }
        if (wireBlock >= 44) {
            return 44;
        }
        if (wireBlock >= 43) {
            return 43;
        }
        if (wireBlock >= 35) {
            return 35;
        }
        if (wireBlock >= 33) {
            return 33;
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
            if (!bidSize.parse(data, cursor)) {
                return false;
            }
            cursor += BidSizeField.BYTE_LENGTH;
        }
        if (known >= 16) {
            if (!bidPx.parse(data, cursor)) {
                return false;
            }
            cursor += BidPxField.BYTE_LENGTH;
        }
        if (known >= 24) {
            if (!bidQuotePriority.parse(data, cursor)) {
                return false;
            }
            cursor += BidQuotePriorityField.BYTE_LENGTH;
        }
        if (known >= 32) {
            if (!bidOrderId.parse(data, cursor)) {
                return false;
            }
            cursor += BidOrderIdField.BYTE_LENGTH;
        }
        if (known >= 33) {
            if (!buyRevisionFlag.parse(data, cursor)) {
                return false;
            }
            cursor += BuyRevisionFlagField.BYTE_LENGTH;
        }
        if (known >= 35) {
            if (!bidErrorCode.parse(data, cursor)) {
                return false;
            }
            cursor += BidErrorCodeField.BYTE_LENGTH;
        }
        if (known >= 43) {
            if (!bidOeSessionId.parse(data, cursor)) {
                return false;
            }
            cursor += BidOeSessionIdField.BYTE_LENGTH;
        }
        if (known >= 44) {
            if (!rfeAnswerOptional.parse(data, cursor)) {
                return false;
            }
            cursor += RfeAnswerOptionalField.BYTE_LENGTH;
        }
        if (known >= 52) {
            if (!bidLeavesQuantity.parse(data, cursor)) {
                return false;
            }
            cursor += BidLeavesQuantityField.BYTE_LENGTH;
        }
        if (known >= 60) {
            if (!bidPreviousSize.parse(data, cursor)) {
                return false;
            }
            cursor += BidPreviousSizeField.BYTE_LENGTH;
        }
        if (known >= 68) {
            if (!bidPreviousPx.parse(data, cursor)) {
                return false;
            }
            cursor += BidPreviousPxField.BYTE_LENGTH;
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
            cursor = bidSize.encode(data, cursor);
        }
        if (known >= 16) {
            cursor = bidPx.encode(data, cursor);
        }
        if (known >= 24) {
            cursor = bidQuotePriority.encode(data, cursor);
        }
        if (known >= 32) {
            cursor = bidOrderId.encode(data, cursor);
        }
        if (known >= 33) {
            cursor = buyRevisionFlag.encode(data, cursor);
        }
        if (known >= 35) {
            cursor = bidErrorCode.encode(data, cursor);
        }
        if (known >= 43) {
            cursor = bidOeSessionId.encode(data, cursor);
        }
        if (known >= 44) {
            cursor = rfeAnswerOptional.encode(data, cursor);
        }
        if (known >= 52) {
            cursor = bidLeavesQuantity.encode(data, cursor);
        }
        if (known >= 60) {
            cursor = bidPreviousSize.encode(data, cursor);
        }
        if (known >= 68) {
            cursor = bidPreviousPx.encode(data, cursor);
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
            case "BidSize" -> Optional.of(bidSize);
            case "BidPx" -> Optional.of(bidPx);
            case "BidQuotePriority" -> Optional.of(bidQuotePriority);
            case "BidOrderId" -> Optional.of(bidOrderId);
            case "BuyRevisionFlag" -> Optional.of(buyRevisionFlag);
            case "BidErrorCode" -> Optional.of(bidErrorCode);
            case "BidOeSessionId" -> Optional.of(bidOeSessionId);
            case "RfeAnswerOptional" -> Optional.of(rfeAnswerOptional);
            case "BidLeavesQuantity" -> Optional.of(bidLeavesQuantity);
            case "BidPreviousSize" -> Optional.of(bidPreviousSize);
            case "BidPreviousPx" -> Optional.of(bidPreviousPx);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof DCQuoteMessageBidQuoterepGroupEntry message)) {
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
        if (!(other instanceof DCQuoteMessageBidQuoterepGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
