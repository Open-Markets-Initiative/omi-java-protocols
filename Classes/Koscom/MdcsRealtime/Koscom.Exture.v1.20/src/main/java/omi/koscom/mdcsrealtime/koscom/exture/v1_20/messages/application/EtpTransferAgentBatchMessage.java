package omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.DataSeqNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.DayBeforePreviousDaysNonTaxableBasePriceForOverseasStocksField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EndKeywordField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EtfCuQuantityField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EtfFlowNetAssetTotalAmountField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EtfForeignFinalNetAssetValueField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EtfForeignFlowNetAssetTotalAmountField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EtfForeignNetAssetTotalField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EtfForeignNetAssetValueAmountField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EtfNetAssetValueAmountField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IsinField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.NumberOfFreeFloatingEtfSharesField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.PreviousDaysCashDividendAmountField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.PreviousDaysNonTaxableBasePriceBeforeDividendForOverseasStocksField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.PreviousDaysNonTaxableBasePriceForOverseasStocksField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.PreviousDaysTaxBaseNavBeforeDividendField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.PreviousDaysTaxBaseNavField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TaxBaseNavAsOfTheDayBeforeThePreviousDayField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Field;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.PrintOptions;

/**
 * Represents the EtpTransferAgentBatchMessage message from the Koscom protocol.
 *
 * <p>ETP/BDC transfer agent batch data.</p>
 */
public final class EtpTransferAgentBatchMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 245;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Etp Transfer Agent Batch Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 20, 10, 198, 46 };

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     */
    private final IsinField isin = new IsinField();

    /**
     * Transmission seq. number.
     */
    private final DataSeqNumberField dataSeqNumber = new DataSeqNumberField();

    /**
     * ETF Flow Net Asset total amount.
     */
    private final EtfFlowNetAssetTotalAmountField etfFlowNetAssetTotalAmount = new EtfFlowNetAssetTotalAmountField();

    /**
     * Unit: KRW.
     */
    private final EtfForeignNetAssetValueAmountField etfForeignNetAssetValueAmount = new EtfForeignNetAssetValueAmountField();

    /**
     * 9(7)V9(2) Information Category 03S: Final NAV of the previous business day, Fund unit Information Category 05S: TU unit Information Category 01Q: Final NAV of the previous business day, Fund unit.
     */
    private final EtfNetAssetValueAmountField etfNetAssetValueAmount = new EtfNetAssetValueAmountField();

    /**
     * ETF Foreign Flow Net Asset Total Amount.
     */
    private final EtfForeignFlowNetAssetTotalAmountField etfForeignFlowNetAssetTotalAmount = new EtfForeignFlowNetAssetTotalAmountField();

    /**
     * ETF Foreign Net Asset Total.
     */
    private final EtfForeignNetAssetTotalField etfForeignNetAssetTotal = new EtfForeignNetAssetTotalField();

    /**
     * 9(7)V9(2).
     */
    private final EtfForeignFinalNetAssetValueField etfForeignFinalNetAssetValue = new EtfForeignFinalNetAssetValueField();

    /**
     * Unit: Securities.
     */
    private final EtfCuQuantityField etfCuQuantity = new EtfCuQuantityField();

    /**
     * 9999999V99 Information Category 03S: Fund unit, 05S: TU unit.
     */
    private final PreviousDaysTaxBaseNavField previousDaysTaxBaseNav = new PreviousDaysTaxBaseNavField();

    /**
     * 9999999V99 Information Category 03S: Fund unit, 05S: TU unit.
     */
    private final PreviousDaysTaxBaseNavBeforeDividendField previousDaysTaxBaseNavBeforeDividend = new PreviousDaysTaxBaseNavBeforeDividendField();

    /**
     * 9999999999V99 Information Category 03S: Fund unit, 05S: TU unit.
     */
    private final PreviousDaysCashDividendAmountField previousDaysCashDividendAmount = new PreviousDaysCashDividendAmountField();

    /**
     * 9999999V99 Information Category 03S: Fund unit, 05S: TU unit.
     */
    private final TaxBaseNavAsOfTheDayBeforeThePreviousDayField taxBaseNavAsOfTheDayBeforeThePreviousDay = new TaxBaseNavAsOfTheDayBeforeThePreviousDayField();

    /**
     * 9999999V99.
     */
    private final PreviousDaysNonTaxableBasePriceForOverseasStocksField previousDaysNonTaxableBasePriceForOverseasStocks = new PreviousDaysNonTaxableBasePriceForOverseasStocksField();

    /**
     * 9999999V99.
     */
    private final PreviousDaysNonTaxableBasePriceBeforeDividendForOverseasStocksField previousDaysNonTaxableBasePriceBeforeDividendForOverseasStocks = new PreviousDaysNonTaxableBasePriceBeforeDividendForOverseasStocksField();

    /**
     * 9999999V99.
     */
    private final DayBeforePreviousDaysNonTaxableBasePriceForOverseasStocksField dayBeforePreviousDaysNonTaxableBasePriceForOverseasStocks = new DayBeforePreviousDaysNonTaxableBasePriceForOverseasStocksField();

    /**
     * Information Category 03S: Fund unit, 05S: TU unit.
     */
    private final NumberOfFreeFloatingEtfSharesField numberOfFreeFloatingEtfShares = new NumberOfFreeFloatingEtfSharesField();

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     */
    private final EndKeywordField endKeyword = new EndKeywordField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(isin, dataSeqNumber, etfFlowNetAssetTotalAmount, etfForeignNetAssetValueAmount, etfNetAssetValueAmount, etfForeignFlowNetAssetTotalAmount, etfForeignNetAssetTotal, etfForeignFinalNetAssetValue, etfCuQuantity, previousDaysTaxBaseNav, previousDaysTaxBaseNavBeforeDividend, previousDaysCashDividendAmount, taxBaseNavAsOfTheDayBeforeThePreviousDay, previousDaysNonTaxableBasePriceForOverseasStocks, previousDaysNonTaxableBasePriceBeforeDividendForOverseasStocks, dayBeforePreviousDaysNonTaxableBasePriceForOverseasStocks, numberOfFreeFloatingEtfShares, endKeyword);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * Transmission seq. number.
     *
     * @return the DataSeqNumber field
     */
    public DataSeqNumberField dataSeqNumber() {
        return dataSeqNumber;
    }

    /**
     * ETF Flow Net Asset total amount.
     *
     * @return the EtfFlowNetAssetTotalAmount field
     */
    public EtfFlowNetAssetTotalAmountField etfFlowNetAssetTotalAmount() {
        return etfFlowNetAssetTotalAmount;
    }

    /**
     * Unit: KRW.
     *
     * @return the EtfForeignNetAssetValueAmount field
     */
    public EtfForeignNetAssetValueAmountField etfForeignNetAssetValueAmount() {
        return etfForeignNetAssetValueAmount;
    }

    /**
     * 9(7)V9(2) Information Category 03S: Final NAV of the previous business day, Fund unit Information Category 05S: TU unit Information Category 01Q: Final NAV of the previous business day, Fund unit.
     *
     * @return the EtfNetAssetValueAmount field
     */
    public EtfNetAssetValueAmountField etfNetAssetValueAmount() {
        return etfNetAssetValueAmount;
    }

    /**
     * ETF Foreign Flow Net Asset Total Amount.
     *
     * @return the EtfForeignFlowNetAssetTotalAmount field
     */
    public EtfForeignFlowNetAssetTotalAmountField etfForeignFlowNetAssetTotalAmount() {
        return etfForeignFlowNetAssetTotalAmount;
    }

    /**
     * ETF Foreign Net Asset Total.
     *
     * @return the EtfForeignNetAssetTotal field
     */
    public EtfForeignNetAssetTotalField etfForeignNetAssetTotal() {
        return etfForeignNetAssetTotal;
    }

    /**
     * 9(7)V9(2).
     *
     * @return the EtfForeignFinalNetAssetValue field
     */
    public EtfForeignFinalNetAssetValueField etfForeignFinalNetAssetValue() {
        return etfForeignFinalNetAssetValue;
    }

    /**
     * Unit: Securities.
     *
     * @return the EtfCuQuantity field
     */
    public EtfCuQuantityField etfCuQuantity() {
        return etfCuQuantity;
    }

    /**
     * 9999999V99 Information Category 03S: Fund unit, 05S: TU unit.
     *
     * @return the PreviousDaysTaxBaseNav field
     */
    public PreviousDaysTaxBaseNavField previousDaysTaxBaseNav() {
        return previousDaysTaxBaseNav;
    }

    /**
     * 9999999V99 Information Category 03S: Fund unit, 05S: TU unit.
     *
     * @return the PreviousDaysTaxBaseNavBeforeDividend field
     */
    public PreviousDaysTaxBaseNavBeforeDividendField previousDaysTaxBaseNavBeforeDividend() {
        return previousDaysTaxBaseNavBeforeDividend;
    }

    /**
     * 9999999999V99 Information Category 03S: Fund unit, 05S: TU unit.
     *
     * @return the PreviousDaysCashDividendAmount field
     */
    public PreviousDaysCashDividendAmountField previousDaysCashDividendAmount() {
        return previousDaysCashDividendAmount;
    }

    /**
     * 9999999V99 Information Category 03S: Fund unit, 05S: TU unit.
     *
     * @return the TaxBaseNavAsOfTheDayBeforeThePreviousDay field
     */
    public TaxBaseNavAsOfTheDayBeforeThePreviousDayField taxBaseNavAsOfTheDayBeforeThePreviousDay() {
        return taxBaseNavAsOfTheDayBeforeThePreviousDay;
    }

    /**
     * 9999999V99.
     *
     * @return the PreviousDaysNonTaxableBasePriceForOverseasStocks field
     */
    public PreviousDaysNonTaxableBasePriceForOverseasStocksField previousDaysNonTaxableBasePriceForOverseasStocks() {
        return previousDaysNonTaxableBasePriceForOverseasStocks;
    }

    /**
     * 9999999V99.
     *
     * @return the PreviousDaysNonTaxableBasePriceBeforeDividendForOverseasStocks field
     */
    public PreviousDaysNonTaxableBasePriceBeforeDividendForOverseasStocksField previousDaysNonTaxableBasePriceBeforeDividendForOverseasStocks() {
        return previousDaysNonTaxableBasePriceBeforeDividendForOverseasStocks;
    }

    /**
     * 9999999V99.
     *
     * @return the DayBeforePreviousDaysNonTaxableBasePriceForOverseasStocks field
     */
    public DayBeforePreviousDaysNonTaxableBasePriceForOverseasStocksField dayBeforePreviousDaysNonTaxableBasePriceForOverseasStocks() {
        return dayBeforePreviousDaysNonTaxableBasePriceForOverseasStocks;
    }

    /**
     * Information Category 03S: Fund unit, 05S: TU unit.
     *
     * @return the NumberOfFreeFloatingEtfShares field
     */
    public NumberOfFreeFloatingEtfSharesField numberOfFreeFloatingEtfShares() {
        return numberOfFreeFloatingEtfShares;
    }

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     *
     * @return the EndKeyword field
     */
    public EndKeywordField endKeyword() {
        return endKeyword;
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
        return PADDING.clone();
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
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!dataSeqNumber.parse(data, cursor)) {
            return false;
        }
        cursor += DataSeqNumberField.BYTE_LENGTH;
        cursor += 10; // padding
        if (!etfFlowNetAssetTotalAmount.parse(data, cursor)) {
            return false;
        }
        cursor += EtfFlowNetAssetTotalAmountField.BYTE_LENGTH;
        if (!etfForeignNetAssetValueAmount.parse(data, cursor)) {
            return false;
        }
        cursor += EtfForeignNetAssetValueAmountField.BYTE_LENGTH;
        if (!etfNetAssetValueAmount.parse(data, cursor)) {
            return false;
        }
        cursor += EtfNetAssetValueAmountField.BYTE_LENGTH;
        if (!etfForeignFlowNetAssetTotalAmount.parse(data, cursor)) {
            return false;
        }
        cursor += EtfForeignFlowNetAssetTotalAmountField.BYTE_LENGTH;
        if (!etfForeignNetAssetTotal.parse(data, cursor)) {
            return false;
        }
        cursor += EtfForeignNetAssetTotalField.BYTE_LENGTH;
        if (!etfForeignFinalNetAssetValue.parse(data, cursor)) {
            return false;
        }
        cursor += EtfForeignFinalNetAssetValueField.BYTE_LENGTH;
        if (!etfCuQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += EtfCuQuantityField.BYTE_LENGTH;
        if (!previousDaysTaxBaseNav.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousDaysTaxBaseNavField.BYTE_LENGTH;
        if (!previousDaysTaxBaseNavBeforeDividend.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousDaysTaxBaseNavBeforeDividendField.BYTE_LENGTH;
        if (!previousDaysCashDividendAmount.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousDaysCashDividendAmountField.BYTE_LENGTH;
        if (!taxBaseNavAsOfTheDayBeforeThePreviousDay.parse(data, cursor)) {
            return false;
        }
        cursor += TaxBaseNavAsOfTheDayBeforeThePreviousDayField.BYTE_LENGTH;
        if (!previousDaysNonTaxableBasePriceForOverseasStocks.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousDaysNonTaxableBasePriceForOverseasStocksField.BYTE_LENGTH;
        if (!previousDaysNonTaxableBasePriceBeforeDividendForOverseasStocks.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousDaysNonTaxableBasePriceBeforeDividendForOverseasStocksField.BYTE_LENGTH;
        if (!dayBeforePreviousDaysNonTaxableBasePriceForOverseasStocks.parse(data, cursor)) {
            return false;
        }
        cursor += DayBeforePreviousDaysNonTaxableBasePriceForOverseasStocksField.BYTE_LENGTH;
        if (!numberOfFreeFloatingEtfShares.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfFreeFloatingEtfSharesField.BYTE_LENGTH;
        cursor += 46; // padding
        return endKeyword.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = isin.encode(data, cursor);
        cursor = dataSeqNumber.encode(data, cursor);
        if (buffer != null && buffer.length >= 30) {
            System.arraycopy(buffer, 20, data, cursor, 10); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 10, (byte) 0); // padding
        }
        cursor += 10;
        cursor = etfFlowNetAssetTotalAmount.encode(data, cursor);
        cursor = etfForeignNetAssetValueAmount.encode(data, cursor);
        cursor = etfNetAssetValueAmount.encode(data, cursor);
        cursor = etfForeignFlowNetAssetTotalAmount.encode(data, cursor);
        cursor = etfForeignNetAssetTotal.encode(data, cursor);
        cursor = etfForeignFinalNetAssetValue.encode(data, cursor);
        cursor = etfCuQuantity.encode(data, cursor);
        cursor = previousDaysTaxBaseNav.encode(data, cursor);
        cursor = previousDaysTaxBaseNavBeforeDividend.encode(data, cursor);
        cursor = previousDaysCashDividendAmount.encode(data, cursor);
        cursor = taxBaseNavAsOfTheDayBeforeThePreviousDay.encode(data, cursor);
        cursor = previousDaysNonTaxableBasePriceForOverseasStocks.encode(data, cursor);
        cursor = previousDaysNonTaxableBasePriceBeforeDividendForOverseasStocks.encode(data, cursor);
        cursor = dayBeforePreviousDaysNonTaxableBasePriceForOverseasStocks.encode(data, cursor);
        cursor = numberOfFreeFloatingEtfShares.encode(data, cursor);
        if (buffer != null && buffer.length >= 244) {
            System.arraycopy(buffer, 198, data, cursor, 46); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 46, (byte) 0); // padding
        }
        cursor += 46;
        cursor = endKeyword.encode(data, cursor);
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
            case "Isin" -> Optional.of(isin);
            case "DataSeqNumber" -> Optional.of(dataSeqNumber);
            case "EtfFlowNetAssetTotalAmount" -> Optional.of(etfFlowNetAssetTotalAmount);
            case "EtfForeignNetAssetValueAmount" -> Optional.of(etfForeignNetAssetValueAmount);
            case "EtfNetAssetValueAmount" -> Optional.of(etfNetAssetValueAmount);
            case "EtfForeignFlowNetAssetTotalAmount" -> Optional.of(etfForeignFlowNetAssetTotalAmount);
            case "EtfForeignNetAssetTotal" -> Optional.of(etfForeignNetAssetTotal);
            case "EtfForeignFinalNetAssetValue" -> Optional.of(etfForeignFinalNetAssetValue);
            case "EtfCuQuantity" -> Optional.of(etfCuQuantity);
            case "PreviousDaysTaxBaseNav" -> Optional.of(previousDaysTaxBaseNav);
            case "PreviousDaysTaxBaseNavBeforeDividend" -> Optional.of(previousDaysTaxBaseNavBeforeDividend);
            case "PreviousDaysCashDividendAmount" -> Optional.of(previousDaysCashDividendAmount);
            case "TaxBaseNavAsOfTheDayBeforeThePreviousDay" -> Optional.of(taxBaseNavAsOfTheDayBeforeThePreviousDay);
            case "PreviousDaysNonTaxableBasePriceForOverseasStocks" -> Optional.of(previousDaysNonTaxableBasePriceForOverseasStocks);
            case "PreviousDaysNonTaxableBasePriceBeforeDividendForOverseasStocks" -> Optional.of(previousDaysNonTaxableBasePriceBeforeDividendForOverseasStocks);
            case "DayBeforePreviousDaysNonTaxableBasePriceForOverseasStocks" -> Optional.of(dayBeforePreviousDaysNonTaxableBasePriceForOverseasStocks);
            case "NumberOfFreeFloatingEtfShares" -> Optional.of(numberOfFreeFloatingEtfShares);
            case "EndKeyword" -> Optional.of(endKeyword);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EtpTransferAgentBatchMessage message)) {
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
        if (!(other instanceof EtpTransferAgentBatchMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
