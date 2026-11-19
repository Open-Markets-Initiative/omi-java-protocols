package omi.finra.finraorf.tdds.dfi.v2_1.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.AsOfIndicatorField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.CurrencyField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.ReportVolumeField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.SaleConditionLevel1Field;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.SaleConditionLevel2Field;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.SaleConditionLevel3Field;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.SaleConditionLevel4Field;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.SellersSaleDaysField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.TradePriceDenominatorField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.TradePriceField;
import omi.finra.finraorf.tdds.dfi.v2_1.structs.ExecutionDatetime;
import omi.finra.finraorf.tdds.dfi.v2_1.types.Field;
import omi.finra.finraorf.tdds.dfi.v2_1.types.GroupEntry;
import omi.finra.finraorf.tdds.dfi.v2_1.types.PrintOptions;

/**
 * The OriginalTradeInformation record a message holds.
 *
 * <p>Original Trade Information</p>
 */
public final class OriginalTradeInformation implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 54;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "OriginalTradeInformation";

    /**
     * This field denotes the number of shares reported in the current Trade Report
     */
    private final ReportVolumeField reportVolume = new ReportVolumeField();

    /**
     * This field denotes the whole dollar and decimal digit composition for the Trade Price field
     */
    private final TradePriceDenominatorField tradePriceDenominator = new TradePriceDenominatorField();

    /**
     * This field indicates the trade price for the current transaction
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * This field indicates the currency in which the trade transaction was reported
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * This field will be populated if the transaction being reported is an As/Of trade, Reversal, Cancel or Correction from a prior business day
     */
    private final AsOfIndicatorField asOfIndicator = new AsOfIndicatorField();

    /**
     * This field is used to denote the sale condition associated with a trade transaction
     */
    private final SaleConditionLevel1Field saleConditionLevel1 = new SaleConditionLevel1Field();

    /**
     * This field is reserved and may be used in the future.
     */
    private final SaleConditionLevel2Field saleConditionLevel2 = new SaleConditionLevel2Field();

    /**
     * This field is used to denote the sale condition associated with a trade transaction
     */
    private final SaleConditionLevel3Field saleConditionLevel3 = new SaleConditionLevel3Field();

    /**
     * This field is used to denote the sale condition associated with a trade transaction
     */
    private final SaleConditionLevel4Field saleConditionLevel4 = new SaleConditionLevel4Field();

    /**
     * this field will reflect the number of days that may elapse before delivery of the stock
     */
    private final SellersSaleDaysField sellersSaleDays = new SellersSaleDaysField();

    /**
     * Execution Datetime
     */
    private final ExecutionDatetime executionDatetime = new ExecutionDatetime();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(reportVolume), List.<Field>of(tradePriceDenominator), List.<Field>of(tradePrice), List.<Field>of(currency), List.<Field>of(asOfIndicator), executionDatetime.fields(), List.<Field>of(saleConditionLevel1), List.<Field>of(saleConditionLevel2), List.<Field>of(saleConditionLevel3), List.<Field>of(saleConditionLevel4), List.<Field>of(sellersSaleDays)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * This field denotes the number of shares reported in the current Trade Report
     *
     * @return the ReportVolume field
     */
    public ReportVolumeField reportVolume() {
        return reportVolume;
    }

    /**
     * This field denotes the whole dollar and decimal digit composition for the Trade Price field
     *
     * @return the TradePriceDenominator field
     */
    public TradePriceDenominatorField tradePriceDenominator() {
        return tradePriceDenominator;
    }

    /**
     * This field indicates the trade price for the current transaction
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * This field indicates the currency in which the trade transaction was reported
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * This field will be populated if the transaction being reported is an As/Of trade, Reversal, Cancel or Correction from a prior business day
     *
     * @return the AsOfIndicator field
     */
    public AsOfIndicatorField asOfIndicator() {
        return asOfIndicator;
    }

    /**
     * This field is used to denote the sale condition associated with a trade transaction
     *
     * @return the SaleConditionLevel1 field
     */
    public SaleConditionLevel1Field saleConditionLevel1() {
        return saleConditionLevel1;
    }

    /**
     * This field is reserved and may be used in the future.
     *
     * @return the SaleConditionLevel2 field
     */
    public SaleConditionLevel2Field saleConditionLevel2() {
        return saleConditionLevel2;
    }

    /**
     * This field is used to denote the sale condition associated with a trade transaction
     *
     * @return the SaleConditionLevel3 field
     */
    public SaleConditionLevel3Field saleConditionLevel3() {
        return saleConditionLevel3;
    }

    /**
     * This field is used to denote the sale condition associated with a trade transaction
     *
     * @return the SaleConditionLevel4 field
     */
    public SaleConditionLevel4Field saleConditionLevel4() {
        return saleConditionLevel4;
    }

    /**
     * this field will reflect the number of days that may elapse before delivery of the stock
     *
     * @return the SellersSaleDays field
     */
    public SellersSaleDaysField sellersSaleDays() {
        return sellersSaleDays;
    }

    /**
     * Execution Datetime
     *
     * @return the ExecutionDatetime record
     */
    public ExecutionDatetime executionDatetime() {
        return executionDatetime;
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
        if (!reportVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ReportVolumeField.BYTE_LENGTH;
        if (!tradePriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceDenominatorField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!asOfIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AsOfIndicatorField.BYTE_LENGTH;
        if (!executionDatetime.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += executionDatetime.byteLength();
        if (!saleConditionLevel1.parse(data, cursor)) {
            return false;
        }
        cursor += SaleConditionLevel1Field.BYTE_LENGTH;
        if (!saleConditionLevel2.parse(data, cursor)) {
            return false;
        }
        cursor += SaleConditionLevel2Field.BYTE_LENGTH;
        if (!saleConditionLevel3.parse(data, cursor)) {
            return false;
        }
        cursor += SaleConditionLevel3Field.BYTE_LENGTH;
        if (!saleConditionLevel4.parse(data, cursor)) {
            return false;
        }
        cursor += SaleConditionLevel4Field.BYTE_LENGTH;
        return sellersSaleDays.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = reportVolume.encode(data, cursor);
        cursor = tradePriceDenominator.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = asOfIndicator.encode(data, cursor);
        cursor = executionDatetime.encode(data, cursor);
        cursor = saleConditionLevel1.encode(data, cursor);
        cursor = saleConditionLevel2.encode(data, cursor);
        cursor = saleConditionLevel3.encode(data, cursor);
        cursor = saleConditionLevel4.encode(data, cursor);
        cursor = sellersSaleDays.encode(data, cursor);
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
        executionDatetime.clear();
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
            case "ReportVolume" -> Optional.of(reportVolume);
            case "TradePriceDenominator" -> Optional.of(tradePriceDenominator);
            case "TradePrice" -> Optional.of(tradePrice);
            case "Currency" -> Optional.of(currency);
            case "AsOfIndicator" -> Optional.of(asOfIndicator);
            case "SaleConditionLevel1" -> Optional.of(saleConditionLevel1);
            case "SaleConditionLevel2" -> Optional.of(saleConditionLevel2);
            case "SaleConditionLevel3" -> Optional.of(saleConditionLevel3);
            case "SaleConditionLevel4" -> Optional.of(saleConditionLevel4);
            case "SellersSaleDays" -> Optional.of(sellersSaleDays);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof OriginalTradeInformation message)) {
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
        if (!(other instanceof OriginalTradeInformation message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
