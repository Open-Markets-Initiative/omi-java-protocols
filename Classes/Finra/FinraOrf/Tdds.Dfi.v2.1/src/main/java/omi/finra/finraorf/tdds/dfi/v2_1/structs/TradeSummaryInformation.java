package omi.finra.finraorf.tdds.dfi.v2_1.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.HighPriceDenominatorField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.HighPriceField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.LastSalePriceDenominatorField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.LastSalePriceField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.LastSalePriceMarketCenterField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.LowPriceDenominatorField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.LowPriceField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.PriceChangeIndicatorField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.TotalSecurityVolumeField;
import omi.finra.finraorf.tdds.dfi.v2_1.types.Field;
import omi.finra.finraorf.tdds.dfi.v2_1.types.GroupEntry;
import omi.finra.finraorf.tdds.dfi.v2_1.types.PrintOptions;

/**
 * The TradeSummaryInformation record a message holds.
 *
 * <p>Trade Summary Information</p>
 */
public final class TradeSummaryInformation implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 52;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "TradeSummaryInformation";

    /**
     * The High Price Denominator indicates the whole dollar and decimal digit composition of the High Price field
     */
    private final HighPriceDenominatorField highPriceDenominator = new HighPriceDenominatorField();

    /**
     * The High Price field indicates the highest price at which the security traded up to the current point in the trading session
     */
    private final HighPriceField highPrice = new HighPriceField();

    /**
     * The Low Price Denominator field indicates the whole dollar and decimal digit composition of the Low Price field
     */
    private final LowPriceDenominatorField lowPriceDenominator = new LowPriceDenominatorField();

    /**
     * The Low Price field indicates the lowest price at which the security traded up to the current point in the trading session
     */
    private final LowPriceField lowPrice = new LowPriceField();

    /**
     * The Last Sale Price Denominator field indicates the whole dollar and decimal digit composition of the Last Sale Price field
     */
    private final LastSalePriceDenominatorField lastSalePriceDenominator = new LastSalePriceDenominatorField();

    /**
     * This Last Sale Price field indicates the current last sale price for the given security
     */
    private final LastSalePriceField lastSalePrice = new LastSalePriceField();

    /**
     * This field indicates the market center responsible for the closing price
     */
    private final LastSalePriceMarketCenterField lastSalePriceMarketCenter = new LastSalePriceMarketCenterField();

    /**
     * This field reflects the total number of shares traded during the session for the given security
     */
    private final TotalSecurityVolumeField totalSecurityVolume = new TotalSecurityVolumeField();

    /**
     * The Price Change Indicator field indicates if the high, low, and/or last sale prices were impacted by the current trade transaction.
     */
    private final PriceChangeIndicatorField priceChangeIndicator = new PriceChangeIndicatorField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(highPriceDenominator, highPrice, lowPriceDenominator, lowPrice, lastSalePriceDenominator, lastSalePrice, lastSalePriceMarketCenter, totalSecurityVolume, priceChangeIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The High Price Denominator indicates the whole dollar and decimal digit composition of the High Price field
     *
     * @return the HighPriceDenominator field
     */
    public HighPriceDenominatorField highPriceDenominator() {
        return highPriceDenominator;
    }

    /**
     * The High Price field indicates the highest price at which the security traded up to the current point in the trading session
     *
     * @return the HighPrice field
     */
    public HighPriceField highPrice() {
        return highPrice;
    }

    /**
     * The Low Price Denominator field indicates the whole dollar and decimal digit composition of the Low Price field
     *
     * @return the LowPriceDenominator field
     */
    public LowPriceDenominatorField lowPriceDenominator() {
        return lowPriceDenominator;
    }

    /**
     * The Low Price field indicates the lowest price at which the security traded up to the current point in the trading session
     *
     * @return the LowPrice field
     */
    public LowPriceField lowPrice() {
        return lowPrice;
    }

    /**
     * The Last Sale Price Denominator field indicates the whole dollar and decimal digit composition of the Last Sale Price field
     *
     * @return the LastSalePriceDenominator field
     */
    public LastSalePriceDenominatorField lastSalePriceDenominator() {
        return lastSalePriceDenominator;
    }

    /**
     * This Last Sale Price field indicates the current last sale price for the given security
     *
     * @return the LastSalePrice field
     */
    public LastSalePriceField lastSalePrice() {
        return lastSalePrice;
    }

    /**
     * This field indicates the market center responsible for the closing price
     *
     * @return the LastSalePriceMarketCenter field
     */
    public LastSalePriceMarketCenterField lastSalePriceMarketCenter() {
        return lastSalePriceMarketCenter;
    }

    /**
     * This field reflects the total number of shares traded during the session for the given security
     *
     * @return the TotalSecurityVolume field
     */
    public TotalSecurityVolumeField totalSecurityVolume() {
        return totalSecurityVolume;
    }

    /**
     * The Price Change Indicator field indicates if the high, low, and/or last sale prices were impacted by the current trade transaction.
     *
     * @return the PriceChangeIndicator field
     */
    public PriceChangeIndicatorField priceChangeIndicator() {
        return priceChangeIndicator;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
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
        if (!highPriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceDenominatorField.BYTE_LENGTH;
        if (!highPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceField.BYTE_LENGTH;
        if (!lowPriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceDenominatorField.BYTE_LENGTH;
        if (!lowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceField.BYTE_LENGTH;
        if (!lastSalePriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += LastSalePriceDenominatorField.BYTE_LENGTH;
        if (!lastSalePrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastSalePriceField.BYTE_LENGTH;
        if (!lastSalePriceMarketCenter.parse(data, cursor)) {
            return false;
        }
        cursor += LastSalePriceMarketCenterField.BYTE_LENGTH;
        if (!totalSecurityVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalSecurityVolumeField.BYTE_LENGTH;
        return priceChangeIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = highPriceDenominator.encode(data, cursor);
        cursor = highPrice.encode(data, cursor);
        cursor = lowPriceDenominator.encode(data, cursor);
        cursor = lowPrice.encode(data, cursor);
        cursor = lastSalePriceDenominator.encode(data, cursor);
        cursor = lastSalePrice.encode(data, cursor);
        cursor = lastSalePriceMarketCenter.encode(data, cursor);
        cursor = totalSecurityVolume.encode(data, cursor);
        cursor = priceChangeIndicator.encode(data, cursor);
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
            case "HighPriceDenominator" -> Optional.of(highPriceDenominator);
            case "HighPrice" -> Optional.of(highPrice);
            case "LowPriceDenominator" -> Optional.of(lowPriceDenominator);
            case "LowPrice" -> Optional.of(lowPrice);
            case "LastSalePriceDenominator" -> Optional.of(lastSalePriceDenominator);
            case "LastSalePrice" -> Optional.of(lastSalePrice);
            case "LastSalePriceMarketCenter" -> Optional.of(lastSalePriceMarketCenter);
            case "TotalSecurityVolume" -> Optional.of(totalSecurityVolume);
            case "PriceChangeIndicator" -> Optional.of(priceChangeIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof TradeSummaryInformation message)) {
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
        if (!(other instanceof TradeSummaryInformation message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
