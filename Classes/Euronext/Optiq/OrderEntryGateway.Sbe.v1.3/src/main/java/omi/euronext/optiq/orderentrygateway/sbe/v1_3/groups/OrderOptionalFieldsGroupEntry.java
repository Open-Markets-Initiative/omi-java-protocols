package omi.euronext.optiq.orderentrygateway.sbe.v1_3.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.DisclosedQtyField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.MinOrderQtyField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderExpirationDateField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderExpirationTimeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.PegOffsetField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.QuoteReqIdOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.StopPxField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.StopTriggeredTimeInForceField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.TradingSessionField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.UndisclosedIcebergTypeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.UndisclosedPriceField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Field;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.GroupEntry;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.PrintOptions;

/**
 * One entry of the OrderOptionalFieldsGroup repeating group.
 *
 * <p>OptionalFields</p>
 */
public final class OrderOptionalFieldsGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 50;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 50;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "OrderOptionalFieldsGroup";

    /**
     * stopPx
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * undisclosedPrice
     */
    private final UndisclosedPriceField undisclosedPrice = new UndisclosedPriceField();

    /**
     * disclosedQty
     */
    private final DisclosedQtyField disclosedQty = new DisclosedQtyField();

    /**
     * minOrderQty
     */
    private final MinOrderQtyField minOrderQty = new MinOrderQtyField();

    /**
     * quoteReqID
     */
    private final QuoteReqIdOptionalField quoteReqIdOptional = new QuoteReqIdOptionalField();

    /**
     * orderExpirationTime
     */
    private final OrderExpirationTimeField orderExpirationTime = new OrderExpirationTimeField();

    /**
     * orderExpirationDate
     */
    private final OrderExpirationDateField orderExpirationDate = new OrderExpirationDateField();

    /**
     * pegOffset
     */
    private final PegOffsetField pegOffset = new PegOffsetField();

    /**
     * TradingSessionValidity_set bit set
     */
    private final TradingSessionField tradingSession = new TradingSessionField();

    /**
     * undisclosedIcebergType
     */
    private final UndisclosedIcebergTypeField undisclosedIcebergType = new UndisclosedIcebergTypeField();

    /**
     * stopTriggeredTimeInForce
     */
    private final StopTriggeredTimeInForceField stopTriggeredTimeInForce = new StopTriggeredTimeInForceField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(stopPx, undisclosedPrice, disclosedQty, minOrderQty, quoteReqIdOptional, orderExpirationTime, orderExpirationDate, pegOffset, tradingSession, undisclosedIcebergType, stopTriggeredTimeInForce);

    private byte[] buffer;

    private boolean decoded;

    /**
     * stopPx
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * undisclosedPrice
     *
     * @return the UndisclosedPrice field
     */
    public UndisclosedPriceField undisclosedPrice() {
        return undisclosedPrice;
    }

    /**
     * disclosedQty
     *
     * @return the DisclosedQty field
     */
    public DisclosedQtyField disclosedQty() {
        return disclosedQty;
    }

    /**
     * minOrderQty
     *
     * @return the MinOrderQty field
     */
    public MinOrderQtyField minOrderQty() {
        return minOrderQty;
    }

    /**
     * quoteReqID
     *
     * @return the QuoteReqIdOptional field
     */
    public QuoteReqIdOptionalField quoteReqIdOptional() {
        return quoteReqIdOptional;
    }

    /**
     * orderExpirationTime
     *
     * @return the OrderExpirationTime field
     */
    public OrderExpirationTimeField orderExpirationTime() {
        return orderExpirationTime;
    }

    /**
     * orderExpirationDate
     *
     * @return the OrderExpirationDate field
     */
    public OrderExpirationDateField orderExpirationDate() {
        return orderExpirationDate;
    }

    /**
     * pegOffset
     *
     * @return the PegOffset field
     */
    public PegOffsetField pegOffset() {
        return pegOffset;
    }

    /**
     * TradingSessionValidity_set bit set
     *
     * @return the TradingSession field
     */
    public TradingSessionField tradingSession() {
        return tradingSession;
    }

    /**
     * undisclosedIcebergType
     *
     * @return the UndisclosedIcebergType field
     */
    public UndisclosedIcebergTypeField undisclosedIcebergType() {
        return undisclosedIcebergType;
    }

    /**
     * stopTriggeredTimeInForce
     *
     * @return the StopTriggeredTimeInForce field
     */
    public StopTriggeredTimeInForceField stopTriggeredTimeInForce() {
        return stopTriggeredTimeInForce;
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
        if (wireBlock >= 50) {
            return 50;
        }
        if (wireBlock >= 49) {
            return 49;
        }
        if (wireBlock >= 48) {
            return 48;
        }
        if (wireBlock >= 47) {
            return 47;
        }
        if (wireBlock >= 46) {
            return 46;
        }
        if (wireBlock >= 44) {
            return 44;
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
            if (!stopPx.parse(data, cursor)) {
                return false;
            }
            cursor += StopPxField.BYTE_LENGTH;
        }
        if (known >= 16) {
            if (!undisclosedPrice.parse(data, cursor)) {
                return false;
            }
            cursor += UndisclosedPriceField.BYTE_LENGTH;
        }
        if (known >= 24) {
            if (!disclosedQty.parse(data, cursor)) {
                return false;
            }
            cursor += DisclosedQtyField.BYTE_LENGTH;
        }
        if (known >= 32) {
            if (!minOrderQty.parse(data, cursor)) {
                return false;
            }
            cursor += MinOrderQtyField.BYTE_LENGTH;
        }
        if (known >= 40) {
            if (!quoteReqIdOptional.parse(data, cursor)) {
                return false;
            }
            cursor += QuoteReqIdOptionalField.BYTE_LENGTH;
        }
        if (known >= 44) {
            if (!orderExpirationTime.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExpirationTimeField.BYTE_LENGTH;
        }
        if (known >= 46) {
            if (!orderExpirationDate.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExpirationDateField.BYTE_LENGTH;
        }
        if (known >= 47) {
            if (!pegOffset.parse(data, cursor)) {
                return false;
            }
            cursor += PegOffsetField.BYTE_LENGTH;
        }
        if (known >= 48) {
            if (!tradingSession.parse(data, cursor)) {
                return false;
            }
            cursor += TradingSessionField.BYTE_LENGTH;
        }
        if (known >= 49) {
            if (!undisclosedIcebergType.parse(data, cursor)) {
                return false;
            }
            cursor += UndisclosedIcebergTypeField.BYTE_LENGTH;
        }
        if (known >= 50) {
            if (!stopTriggeredTimeInForce.parse(data, cursor)) {
                return false;
            }
            cursor += StopTriggeredTimeInForceField.BYTE_LENGTH;
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
            cursor = stopPx.encode(data, cursor);
        }
        if (known >= 16) {
            cursor = undisclosedPrice.encode(data, cursor);
        }
        if (known >= 24) {
            cursor = disclosedQty.encode(data, cursor);
        }
        if (known >= 32) {
            cursor = minOrderQty.encode(data, cursor);
        }
        if (known >= 40) {
            cursor = quoteReqIdOptional.encode(data, cursor);
        }
        if (known >= 44) {
            cursor = orderExpirationTime.encode(data, cursor);
        }
        if (known >= 46) {
            cursor = orderExpirationDate.encode(data, cursor);
        }
        if (known >= 47) {
            cursor = pegOffset.encode(data, cursor);
        }
        if (known >= 48) {
            cursor = tradingSession.encode(data, cursor);
        }
        if (known >= 49) {
            cursor = undisclosedIcebergType.encode(data, cursor);
        }
        if (known >= 50) {
            cursor = stopTriggeredTimeInForce.encode(data, cursor);
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
            case "StopPx" -> Optional.of(stopPx);
            case "UndisclosedPrice" -> Optional.of(undisclosedPrice);
            case "DisclosedQty" -> Optional.of(disclosedQty);
            case "MinOrderQty" -> Optional.of(minOrderQty);
            case "QuoteReqIdOptional" -> Optional.of(quoteReqIdOptional);
            case "OrderExpirationTime" -> Optional.of(orderExpirationTime);
            case "OrderExpirationDate" -> Optional.of(orderExpirationDate);
            case "PegOffset" -> Optional.of(pegOffset);
            case "TradingSession" -> Optional.of(tradingSession);
            case "UndisclosedIcebergType" -> Optional.of(undisclosedIcebergType);
            case "StopTriggeredTimeInForce" -> Optional.of(stopTriggeredTimeInForce);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof OrderOptionalFieldsGroupEntry message)) {
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
        if (!(other instanceof OrderOptionalFieldsGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
