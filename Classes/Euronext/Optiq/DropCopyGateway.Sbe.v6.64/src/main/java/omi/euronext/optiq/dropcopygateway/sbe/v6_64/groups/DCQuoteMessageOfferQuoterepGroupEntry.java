package omi.euronext.optiq.dropcopygateway.sbe.v6_64.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.OfferErrorCodeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.OfferLeavesQuantityField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.OfferOeSessionIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.OfferOrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.OfferPreviousPxField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.OfferPreviousSizeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.OfferPxField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.OfferQuotePriorityField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.OfferSizeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.RfeAnswerOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.SellRevisionFlagField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.types.GroupEntry;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.types.PrintOptions;

/**
 * One entry of the DCQuoteMessageOfferQuoterepGroup repeating group.
 *
 * <p>OfferQuoterep</p>
 */
public final class DCQuoteMessageOfferQuoterepGroupEntry implements GroupEntry {

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
    public static final String NAME = "DCQuoteMessageOfferQuoterepGroup";

    /**
     * offerSize
     */
    private final OfferSizeField offerSize = new OfferSizeField();

    /**
     * offerPx
     */
    private final OfferPxField offerPx = new OfferPxField();

    /**
     * offerQuotePriority
     */
    private final OfferQuotePriorityField offerQuotePriority = new OfferQuotePriorityField();

    /**
     * offerOrderID
     */
    private final OfferOrderIdField offerOrderId = new OfferOrderIdField();

    /**
     * sellRevisionFlag
     */
    private final SellRevisionFlagField sellRevisionFlag = new SellRevisionFlagField();

    /**
     * offerErrorCode
     */
    private final OfferErrorCodeField offerErrorCode = new OfferErrorCodeField();

    /**
     * offerOESessionID
     */
    private final OfferOeSessionIdField offerOeSessionId = new OfferOeSessionIdField();

    /**
     * rFEAnswer
     */
    private final RfeAnswerOptionalField rfeAnswerOptional = new RfeAnswerOptionalField();

    /**
     * offerLeavesQuantity
     */
    private final OfferLeavesQuantityField offerLeavesQuantity = new OfferLeavesQuantityField();

    /**
     * offerPreviousSize
     */
    private final OfferPreviousSizeField offerPreviousSize = new OfferPreviousSizeField();

    /**
     * offerPreviousPx
     */
    private final OfferPreviousPxField offerPreviousPx = new OfferPreviousPxField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(offerSize, offerPx, offerQuotePriority, offerOrderId, sellRevisionFlag, offerErrorCode, offerOeSessionId, rfeAnswerOptional, offerLeavesQuantity, offerPreviousSize, offerPreviousPx);

    private byte[] buffer;

    private boolean decoded;

    /**
     * offerSize
     *
     * @return the OfferSize field
     */
    public OfferSizeField offerSize() {
        return offerSize;
    }

    /**
     * offerPx
     *
     * @return the OfferPx field
     */
    public OfferPxField offerPx() {
        return offerPx;
    }

    /**
     * offerQuotePriority
     *
     * @return the OfferQuotePriority field
     */
    public OfferQuotePriorityField offerQuotePriority() {
        return offerQuotePriority;
    }

    /**
     * offerOrderID
     *
     * @return the OfferOrderId field
     */
    public OfferOrderIdField offerOrderId() {
        return offerOrderId;
    }

    /**
     * sellRevisionFlag
     *
     * @return the SellRevisionFlag field
     */
    public SellRevisionFlagField sellRevisionFlag() {
        return sellRevisionFlag;
    }

    /**
     * offerErrorCode
     *
     * @return the OfferErrorCode field
     */
    public OfferErrorCodeField offerErrorCode() {
        return offerErrorCode;
    }

    /**
     * offerOESessionID
     *
     * @return the OfferOeSessionId field
     */
    public OfferOeSessionIdField offerOeSessionId() {
        return offerOeSessionId;
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
     * offerLeavesQuantity
     *
     * @return the OfferLeavesQuantity field
     */
    public OfferLeavesQuantityField offerLeavesQuantity() {
        return offerLeavesQuantity;
    }

    /**
     * offerPreviousSize
     *
     * @return the OfferPreviousSize field
     */
    public OfferPreviousSizeField offerPreviousSize() {
        return offerPreviousSize;
    }

    /**
     * offerPreviousPx
     *
     * @return the OfferPreviousPx field
     */
    public OfferPreviousPxField offerPreviousPx() {
        return offerPreviousPx;
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
            if (!offerSize.parse(data, cursor)) {
                return false;
            }
            cursor += OfferSizeField.BYTE_LENGTH;
        }
        if (known >= 16) {
            if (!offerPx.parse(data, cursor)) {
                return false;
            }
            cursor += OfferPxField.BYTE_LENGTH;
        }
        if (known >= 24) {
            if (!offerQuotePriority.parse(data, cursor)) {
                return false;
            }
            cursor += OfferQuotePriorityField.BYTE_LENGTH;
        }
        if (known >= 32) {
            if (!offerOrderId.parse(data, cursor)) {
                return false;
            }
            cursor += OfferOrderIdField.BYTE_LENGTH;
        }
        if (known >= 33) {
            if (!sellRevisionFlag.parse(data, cursor)) {
                return false;
            }
            cursor += SellRevisionFlagField.BYTE_LENGTH;
        }
        if (known >= 35) {
            if (!offerErrorCode.parse(data, cursor)) {
                return false;
            }
            cursor += OfferErrorCodeField.BYTE_LENGTH;
        }
        if (known >= 43) {
            if (!offerOeSessionId.parse(data, cursor)) {
                return false;
            }
            cursor += OfferOeSessionIdField.BYTE_LENGTH;
        }
        if (known >= 44) {
            if (!rfeAnswerOptional.parse(data, cursor)) {
                return false;
            }
            cursor += RfeAnswerOptionalField.BYTE_LENGTH;
        }
        if (known >= 52) {
            if (!offerLeavesQuantity.parse(data, cursor)) {
                return false;
            }
            cursor += OfferLeavesQuantityField.BYTE_LENGTH;
        }
        if (known >= 60) {
            if (!offerPreviousSize.parse(data, cursor)) {
                return false;
            }
            cursor += OfferPreviousSizeField.BYTE_LENGTH;
        }
        if (known >= 68) {
            if (!offerPreviousPx.parse(data, cursor)) {
                return false;
            }
            cursor += OfferPreviousPxField.BYTE_LENGTH;
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
            cursor = offerSize.encode(data, cursor);
        }
        if (known >= 16) {
            cursor = offerPx.encode(data, cursor);
        }
        if (known >= 24) {
            cursor = offerQuotePriority.encode(data, cursor);
        }
        if (known >= 32) {
            cursor = offerOrderId.encode(data, cursor);
        }
        if (known >= 33) {
            cursor = sellRevisionFlag.encode(data, cursor);
        }
        if (known >= 35) {
            cursor = offerErrorCode.encode(data, cursor);
        }
        if (known >= 43) {
            cursor = offerOeSessionId.encode(data, cursor);
        }
        if (known >= 44) {
            cursor = rfeAnswerOptional.encode(data, cursor);
        }
        if (known >= 52) {
            cursor = offerLeavesQuantity.encode(data, cursor);
        }
        if (known >= 60) {
            cursor = offerPreviousSize.encode(data, cursor);
        }
        if (known >= 68) {
            cursor = offerPreviousPx.encode(data, cursor);
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
            case "OfferSize" -> Optional.of(offerSize);
            case "OfferPx" -> Optional.of(offerPx);
            case "OfferQuotePriority" -> Optional.of(offerQuotePriority);
            case "OfferOrderId" -> Optional.of(offerOrderId);
            case "SellRevisionFlag" -> Optional.of(sellRevisionFlag);
            case "OfferErrorCode" -> Optional.of(offerErrorCode);
            case "OfferOeSessionId" -> Optional.of(offerOeSessionId);
            case "RfeAnswerOptional" -> Optional.of(rfeAnswerOptional);
            case "OfferLeavesQuantity" -> Optional.of(offerLeavesQuantity);
            case "OfferPreviousSize" -> Optional.of(offerPreviousSize);
            case "OfferPreviousPx" -> Optional.of(offerPreviousPx);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof DCQuoteMessageOfferQuoterepGroupEntry message)) {
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
        if (!(other instanceof DCQuoteMessageOfferQuoterepGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
