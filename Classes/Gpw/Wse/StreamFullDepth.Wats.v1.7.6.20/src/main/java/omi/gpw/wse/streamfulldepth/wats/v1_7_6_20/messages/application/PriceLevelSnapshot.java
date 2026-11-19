package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.InstrumentIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MaxDepthField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmBuyQuoteLevelField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmSellQuoteLevelField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.groups.BuyEntry;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.groups.BuyList;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.groups.SellEntry;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.groups.SellList;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the PriceLevelSnapshot message from the StreamFullDepth protocol.
 *
 * <p>BBO price levels and volumes</p>
 */
public final class PriceLevelSnapshot implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 317;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Price Level Snapshot";

    /**
     * The number of entries that Buy carries on the wire.
     */
    public static final int BUY_COUNT = 5;

    /**
     * The number of entries that Sell carries on the wire.
     */
    public static final int SELL_COUNT = 5;

    /**
     * ID of financial instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * The number of BBO levels contained in the message
     */
    private final MaxDepthField maxDepth = new MaxDepthField();

    /**
     * Id of an level on which mm quote rests (0 means no mm)
     */
    private final MmBuyQuoteLevelField mmBuyQuoteLevel = new MmBuyQuoteLevelField();

    /**
     * Id of an level on which mm quote rests (0 means no mm)
     */
    private final MmSellQuoteLevelField mmSellQuoteLevel = new MmSellQuoteLevelField();

    /**
     * PriceLevel table
     */
    private final BuyList buy = new BuyList(BUY_COUNT);

    /**
     * PriceLevel table
     */
    private final SellList sell = new SellList(SELL_COUNT);

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, maxDepth, mmBuyQuoteLevel, mmSellQuoteLevel);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID of financial instrument
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * The number of BBO levels contained in the message
     *
     * @return the MaxDepth field
     */
    public MaxDepthField maxDepth() {
        return maxDepth;
    }

    /**
     * Id of an level on which mm quote rests (0 means no mm)
     *
     * @return the MmBuyQuoteLevel field
     */
    public MmBuyQuoteLevelField mmBuyQuoteLevel() {
        return mmBuyQuoteLevel;
    }

    /**
     * Id of an level on which mm quote rests (0 means no mm)
     *
     * @return the MmSellQuoteLevel field
     */
    public MmSellQuoteLevelField mmSellQuoteLevel() {
        return mmSellQuoteLevel;
    }

    /**
     * PriceLevel table
     *
     * <p>This list always holds 5 entries: replace one with {@code set}, or set the values of those it holds.</p>
     *
     * @return the Buy entries
     */
    public BuyList buy() {
        return buy;
    }

    /**
     * PriceLevel table
     *
     * <p>This list always holds 5 entries: replace one with {@code set}, or set the values of those it holds.</p>
     *
     * @return the Sell entries
     */
    public SellList sell() {
        return sell;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!maxDepth.parse(data, cursor)) {
            return false;
        }
        cursor += MaxDepthField.BYTE_LENGTH;
        if (!mmBuyQuoteLevel.parse(data, cursor)) {
            return false;
        }
        cursor += MmBuyQuoteLevelField.BYTE_LENGTH;
        if (!mmSellQuoteLevel.parse(data, cursor)) {
            return false;
        }
        cursor += MmSellQuoteLevelField.BYTE_LENGTH;
        if (!buy.parse(data, cursor, end - 155, BUY_COUNT)) {
            return false;
        }
        cursor += buy.byteLength();
        if (!sell.parse(data, cursor, end, SELL_COUNT)) {
            return false;
        }
        cursor += sell.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = maxDepth.encode(data, cursor);
        cursor = mmBuyQuoteLevel.encode(data, cursor);
        cursor = mmSellQuoteLevel.encode(data, cursor);
        cursor = buy.encode(data, cursor);
        cursor = sell.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        buy.clear();
        sell.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        if (!buy.isRecognized()) {
            return false;
        }
        return sell.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!buy.isValid()) {
            return false;
        }
        if (!sell.isValid()) {
            return false;
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this message was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the message bytes, or empty when no decode has been attempted
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
        if (!instrumentId.isDecoded()) {
            return Optional.of(instrumentId);
        }
        if (!maxDepth.isDecoded()) {
            return Optional.of(maxDepth);
        }
        if (!mmBuyQuoteLevel.isDecoded()) {
            return Optional.of(mmBuyQuoteLevel);
        }
        if (!mmSellQuoteLevel.isDecoded()) {
            return Optional.of(mmSellQuoteLevel);
        }
        if (!buy.isDecoded()) {
            return buy.failedEntry().flatMap(BuyEntry::failedAt);
        }
        if (!sell.isDecoded()) {
            return sell.failedEntry().flatMap(SellEntry::failedAt);
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
            case "MaxDepth" -> Optional.of(maxDepth);
            case "MmBuyQuoteLevel" -> Optional.of(mmBuyQuoteLevel);
            case "MmSellQuoteLevel" -> Optional.of(mmSellQuoteLevel);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PriceLevelSnapshot message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(buy.diffFields(message.buy));
        changed.addAll(sell.diffFields(message.sell));
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            buy.toFormattedString(builder, options);
            builder.append(", ");
            sell.toFormattedString(builder, options);
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
        buy.toFormattedString(builder, nested);
        sell.toFormattedString(builder, nested);
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
        if (!(other instanceof PriceLevelSnapshot message)) {
            return false;
        }
        return fields.equals(message.fields) && buy.equals(message.buy) && sell.equals(message.sell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, buy, sell);
    }
}
