package omi.finra.finraorf.tdds.dfi.v2_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.ClosingPriceDenominatorField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.ClosingPriceField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.ClosingPriceMarketCenterField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.CurrencyField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.DailyHighPriceDenominatorField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.DailyHighPriceField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.DailyLowPriceDenominatorField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.DailyLowPriceField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.NetChangeAmountField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.NetChangeDenominatorField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.NetChangeDirectionField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.SecuritySymbolField;
import omi.finra.finraorf.tdds.dfi.v2_1.fields.TotalSecurityVolumeField;
import omi.finra.finraorf.tdds.dfi.v2_1.structs.MessageHeader;
import omi.finra.finraorf.tdds.dfi.v2_1.types.Field;
import omi.finra.finraorf.tdds.dfi.v2_1.types.Message;
import omi.finra.finraorf.tdds.dfi.v2_1.types.PrintOptions;

/**
 * Represents the ClosingTradeSummaryReportMessage message from the Tdds protocol.
 *
 * <p>The closing trade summary will reflect the daily high, low, and closing prices as well as the total volume for the security</p>
 */
public final class ClosingTradeSummaryReportMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '2';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 114;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Closing Trade Summary Report Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 87, 1 };

    /**
     * This Security Symbol field indicates the security identifier assigned by FINRA for a given security
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * The Closing Price Denominator field indicates the whole dollar and decimal digit composition of the Closing Price field
     */
    private final DailyHighPriceDenominatorField dailyHighPriceDenominator = new DailyHighPriceDenominatorField();

    /**
     * This Daily High Price field indicates the highest price at which the security traded during the session
     */
    private final DailyHighPriceField dailyHighPrice = new DailyHighPriceField();

    /**
     * The Closing Price Denominator field indicates the whole dollar and decimal digit composition of the Closing Price field
     */
    private final DailyLowPriceDenominatorField dailyLowPriceDenominator = new DailyLowPriceDenominatorField();

    /**
     * This Daily High Price field indicates the lowest price at which the security traded during the session
     */
    private final DailyLowPriceField dailyLowPrice = new DailyLowPriceField();

    /**
     * This field indicates the market center responsible for the closing price
     */
    private final ClosingPriceMarketCenterField closingPriceMarketCenter = new ClosingPriceMarketCenterField();

    /**
     * The Closing Price Denominator field indicates the whole dollar and decimal digit composition of the Closing Price field
     */
    private final ClosingPriceDenominatorField closingPriceDenominator = new ClosingPriceDenominatorField();

    /**
     * This Closing Price field reflects the final last sale eligible transaction reported to ORF for the security during the current business day
     */
    private final ClosingPriceField closingPrice = new ClosingPriceField();

    /**
     * The Net Change Denominator indicates the whole dollar and decimal digit composition of the Net Change Amount field
     */
    private final NetChangeDenominatorField netChangeDenominator = new NetChangeDenominatorField();

    /**
     * The Net Change Amount field reflects the absolute value of the difference between the current closing price and the adjusted previous day’s closing price
     */
    private final NetChangeAmountField netChangeAmount = new NetChangeAmountField();

    /**
     * This field indicates the direction of net change field
     */
    private final NetChangeDirectionField netChangeDirection = new NetChangeDirectionField();

    /**
     * This field indicates the currency in which the trade transaction was reported
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * This field reflects the total number of shares traded during the session for the given security
     */
    private final TotalSecurityVolumeField totalSecurityVolume = new TotalSecurityVolumeField();

    /**
     * Message Header
     */
    private final MessageHeader messageHeader = new MessageHeader();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(messageHeader.fields(), List.<Field>of(securitySymbol), List.<Field>of(dailyHighPriceDenominator), List.<Field>of(dailyHighPrice), List.<Field>of(dailyLowPriceDenominator), List.<Field>of(dailyLowPrice), List.<Field>of(closingPriceMarketCenter), List.<Field>of(closingPriceDenominator), List.<Field>of(closingPrice), List.<Field>of(netChangeDenominator), List.<Field>of(netChangeAmount), List.<Field>of(netChangeDirection), List.<Field>of(currency), List.<Field>of(totalSecurityVolume)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * This Security Symbol field indicates the security identifier assigned by FINRA for a given security
     *
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
    }

    /**
     * The Closing Price Denominator field indicates the whole dollar and decimal digit composition of the Closing Price field
     *
     * @return the DailyHighPriceDenominator field
     */
    public DailyHighPriceDenominatorField dailyHighPriceDenominator() {
        return dailyHighPriceDenominator;
    }

    /**
     * This Daily High Price field indicates the highest price at which the security traded during the session
     *
     * @return the DailyHighPrice field
     */
    public DailyHighPriceField dailyHighPrice() {
        return dailyHighPrice;
    }

    /**
     * The Closing Price Denominator field indicates the whole dollar and decimal digit composition of the Closing Price field
     *
     * @return the DailyLowPriceDenominator field
     */
    public DailyLowPriceDenominatorField dailyLowPriceDenominator() {
        return dailyLowPriceDenominator;
    }

    /**
     * This Daily High Price field indicates the lowest price at which the security traded during the session
     *
     * @return the DailyLowPrice field
     */
    public DailyLowPriceField dailyLowPrice() {
        return dailyLowPrice;
    }

    /**
     * This field indicates the market center responsible for the closing price
     *
     * @return the ClosingPriceMarketCenter field
     */
    public ClosingPriceMarketCenterField closingPriceMarketCenter() {
        return closingPriceMarketCenter;
    }

    /**
     * The Closing Price Denominator field indicates the whole dollar and decimal digit composition of the Closing Price field
     *
     * @return the ClosingPriceDenominator field
     */
    public ClosingPriceDenominatorField closingPriceDenominator() {
        return closingPriceDenominator;
    }

    /**
     * This Closing Price field reflects the final last sale eligible transaction reported to ORF for the security during the current business day
     *
     * @return the ClosingPrice field
     */
    public ClosingPriceField closingPrice() {
        return closingPrice;
    }

    /**
     * The Net Change Denominator indicates the whole dollar and decimal digit composition of the Net Change Amount field
     *
     * @return the NetChangeDenominator field
     */
    public NetChangeDenominatorField netChangeDenominator() {
        return netChangeDenominator;
    }

    /**
     * The Net Change Amount field reflects the absolute value of the difference between the current closing price and the adjusted previous day’s closing price
     *
     * @return the NetChangeAmount field
     */
    public NetChangeAmountField netChangeAmount() {
        return netChangeAmount;
    }

    /**
     * This field indicates the direction of net change field
     *
     * @return the NetChangeDirection field
     */
    public NetChangeDirectionField netChangeDirection() {
        return netChangeDirection;
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
     * This field reflects the total number of shares traded during the session for the given security
     *
     * @return the TotalSecurityVolume field
     */
    public TotalSecurityVolumeField totalSecurityVolume() {
        return totalSecurityVolume;
    }

    /**
     * Message Header
     *
     * @return the MessageHeader record
     */
    public MessageHeader messageHeader() {
        return messageHeader;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!messageHeader.parseFrom(data, cursor, end - 81)) {
            return false;
        }
        cursor += messageHeader.byteLength();
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;
        if (!dailyHighPriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += DailyHighPriceDenominatorField.BYTE_LENGTH;
        if (!dailyHighPrice.parse(data, cursor)) {
            return false;
        }
        cursor += DailyHighPriceField.BYTE_LENGTH;
        if (!dailyLowPriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += DailyLowPriceDenominatorField.BYTE_LENGTH;
        if (!dailyLowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += DailyLowPriceField.BYTE_LENGTH;
        if (!closingPriceMarketCenter.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingPriceMarketCenterField.BYTE_LENGTH;
        if (!closingPriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingPriceDenominatorField.BYTE_LENGTH;
        if (!closingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingPriceField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!netChangeDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeDenominatorField.BYTE_LENGTH;
        if (!netChangeAmount.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeAmountField.BYTE_LENGTH;
        if (!netChangeDirection.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeDirectionField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        return totalSecurityVolume.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = messageHeader.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = dailyHighPriceDenominator.encode(data, cursor);
        cursor = dailyHighPrice.encode(data, cursor);
        cursor = dailyLowPriceDenominator.encode(data, cursor);
        cursor = dailyLowPrice.encode(data, cursor);
        cursor = closingPriceMarketCenter.encode(data, cursor);
        cursor = closingPriceDenominator.encode(data, cursor);
        cursor = closingPrice.encode(data, cursor);
        if (buffer != null && buffer.length >= 88) {
            System.arraycopy(buffer, 87, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = netChangeDenominator.encode(data, cursor);
        cursor = netChangeAmount.encode(data, cursor);
        cursor = netChangeDirection.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = totalSecurityVolume.encode(data, cursor);
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
        messageHeader.clear();
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
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "DailyHighPriceDenominator" -> Optional.of(dailyHighPriceDenominator);
            case "DailyHighPrice" -> Optional.of(dailyHighPrice);
            case "DailyLowPriceDenominator" -> Optional.of(dailyLowPriceDenominator);
            case "DailyLowPrice" -> Optional.of(dailyLowPrice);
            case "ClosingPriceMarketCenter" -> Optional.of(closingPriceMarketCenter);
            case "ClosingPriceDenominator" -> Optional.of(closingPriceDenominator);
            case "ClosingPrice" -> Optional.of(closingPrice);
            case "NetChangeDenominator" -> Optional.of(netChangeDenominator);
            case "NetChangeAmount" -> Optional.of(netChangeAmount);
            case "NetChangeDirection" -> Optional.of(netChangeDirection);
            case "Currency" -> Optional.of(currency);
            case "TotalSecurityVolume" -> Optional.of(totalSecurityVolume);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ClosingTradeSummaryReportMessage message)) {
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
        if (!(other instanceof ClosingTradeSummaryReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
