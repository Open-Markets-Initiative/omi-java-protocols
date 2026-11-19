package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.BestBuyLevelField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.BestBuyLevelQuantityField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.BestSellLevelField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.BestSellLevelQuantityField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.IndicativeMatchingPriceField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.IndicativeMatchingVolumeField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.InstrumentIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TotalBuyQuantityAtImpField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TotalSellQuantityAtImpField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the AuctionUpdate message from the StreamFullDepth protocol.
 *
 * <p>Updates IMP/IMV and BBO during an auction</p>
 */
public final class AuctionUpdate implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 68;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Update";

    /**
     * ID of financial instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Indicative Matching Price (IMP)
     */
    private final IndicativeMatchingPriceField indicativeMatchingPrice = new IndicativeMatchingPriceField();

    /**
     * Indicative Matching Volume (IMV)
     */
    private final IndicativeMatchingVolumeField indicativeMatchingVolume = new IndicativeMatchingVolumeField();

    /**
     * Total sell quantity at IMP
     */
    private final TotalSellQuantityAtImpField totalSellQuantityAtImp = new TotalSellQuantityAtImpField();

    /**
     * Total buy quantity at IMP
     */
    private final TotalBuyQuantityAtImpField totalBuyQuantityAtImp = new TotalBuyQuantityAtImpField();

    /**
     * Best sell price level (1st BBO level)
     */
    private final BestSellLevelField bestSellLevel = new BestSellLevelField();

    /**
     * Quantity at the best sell price level
     */
    private final BestSellLevelQuantityField bestSellLevelQuantity = new BestSellLevelQuantityField();

    /**
     * Best buy price level (1st BBO level)
     */
    private final BestBuyLevelField bestBuyLevel = new BestBuyLevelField();

    /**
     * Quantity at the best buy price level
     */
    private final BestBuyLevelQuantityField bestBuyLevelQuantity = new BestBuyLevelQuantityField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, indicativeMatchingPrice, indicativeMatchingVolume, totalSellQuantityAtImp, totalBuyQuantityAtImp, bestSellLevel, bestSellLevelQuantity, bestBuyLevel, bestBuyLevelQuantity);

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
     * Indicative Matching Price (IMP)
     *
     * @return the IndicativeMatchingPrice field
     */
    public IndicativeMatchingPriceField indicativeMatchingPrice() {
        return indicativeMatchingPrice;
    }

    /**
     * Indicative Matching Volume (IMV)
     *
     * @return the IndicativeMatchingVolume field
     */
    public IndicativeMatchingVolumeField indicativeMatchingVolume() {
        return indicativeMatchingVolume;
    }

    /**
     * Total sell quantity at IMP
     *
     * @return the TotalSellQuantityAtImp field
     */
    public TotalSellQuantityAtImpField totalSellQuantityAtImp() {
        return totalSellQuantityAtImp;
    }

    /**
     * Total buy quantity at IMP
     *
     * @return the TotalBuyQuantityAtImp field
     */
    public TotalBuyQuantityAtImpField totalBuyQuantityAtImp() {
        return totalBuyQuantityAtImp;
    }

    /**
     * Best sell price level (1st BBO level)
     *
     * @return the BestSellLevel field
     */
    public BestSellLevelField bestSellLevel() {
        return bestSellLevel;
    }

    /**
     * Quantity at the best sell price level
     *
     * @return the BestSellLevelQuantity field
     */
    public BestSellLevelQuantityField bestSellLevelQuantity() {
        return bestSellLevelQuantity;
    }

    /**
     * Best buy price level (1st BBO level)
     *
     * @return the BestBuyLevel field
     */
    public BestBuyLevelField bestBuyLevel() {
        return bestBuyLevel;
    }

    /**
     * Quantity at the best buy price level
     *
     * @return the BestBuyLevelQuantity field
     */
    public BestBuyLevelQuantityField bestBuyLevelQuantity() {
        return bestBuyLevelQuantity;
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
        if (!indicativeMatchingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativeMatchingPriceField.BYTE_LENGTH;
        if (!indicativeMatchingVolume.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativeMatchingVolumeField.BYTE_LENGTH;
        if (!totalSellQuantityAtImp.parse(data, cursor)) {
            return false;
        }
        cursor += TotalSellQuantityAtImpField.BYTE_LENGTH;
        if (!totalBuyQuantityAtImp.parse(data, cursor)) {
            return false;
        }
        cursor += TotalBuyQuantityAtImpField.BYTE_LENGTH;
        if (!bestSellLevel.parse(data, cursor)) {
            return false;
        }
        cursor += BestSellLevelField.BYTE_LENGTH;
        if (!bestSellLevelQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += BestSellLevelQuantityField.BYTE_LENGTH;
        if (!bestBuyLevel.parse(data, cursor)) {
            return false;
        }
        cursor += BestBuyLevelField.BYTE_LENGTH;
        return bestBuyLevelQuantity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = indicativeMatchingPrice.encode(data, cursor);
        cursor = indicativeMatchingVolume.encode(data, cursor);
        cursor = totalSellQuantityAtImp.encode(data, cursor);
        cursor = totalBuyQuantityAtImp.encode(data, cursor);
        cursor = bestSellLevel.encode(data, cursor);
        cursor = bestSellLevelQuantity.encode(data, cursor);
        cursor = bestBuyLevel.encode(data, cursor);
        cursor = bestBuyLevelQuantity.encode(data, cursor);
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
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
            case "IndicativeMatchingPrice" -> Optional.of(indicativeMatchingPrice);
            case "IndicativeMatchingVolume" -> Optional.of(indicativeMatchingVolume);
            case "TotalSellQuantityAtImp" -> Optional.of(totalSellQuantityAtImp);
            case "TotalBuyQuantityAtImp" -> Optional.of(totalBuyQuantityAtImp);
            case "BestSellLevel" -> Optional.of(bestSellLevel);
            case "BestSellLevelQuantity" -> Optional.of(bestSellLevelQuantity);
            case "BestBuyLevel" -> Optional.of(bestBuyLevel);
            case "BestBuyLevelQuantity" -> Optional.of(bestBuyLevelQuantity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AuctionUpdate message)) {
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
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof AuctionUpdate message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
