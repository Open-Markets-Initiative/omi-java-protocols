package omi.nasdaq.utdf.output.utp.v1_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.utdf.output.utp.v1_5.fields.ConsolidatedVolumeField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.DailyConsolidatedClosingPriceField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.DailyConsolidatedHighPriceField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.DailyConsolidatedLowPriceField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.MarketCenterOriginatorIdField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.NumberOfMarketCenterSummariesField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.SymbolLongField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.TradingActionIndicatorField;
import omi.nasdaq.utdf.output.utp.v1_5.groups.MarketCenterClosingPriceAndVolumeSummaryEntry;
import omi.nasdaq.utdf.output.utp.v1_5.groups.MarketCenterClosingPriceAndVolumeSummaryList;
import omi.nasdaq.utdf.output.utp.v1_5.structs.MessageInfo;
import omi.nasdaq.utdf.output.utp.v1_5.types.Field;
import omi.nasdaq.utdf.output.utp.v1_5.types.Message;
import omi.nasdaq.utdf.output.utp.v1_5.types.PrintOptions;

/**
 * Represents the ClosingTradeSummaryReportMessage message from the Output protocol.
 *
 * <p>The Closing Trade Summary Report will be disseminated three times daily</p>
 */
public final class ClosingTradeSummaryReportMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Z';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 73;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Closing Trade Summary Report Message";

    /**
     * Security Identifier
     */
    private final SymbolLongField symbolLong = new SymbolLongField();

    /**
     * Daily Consolidated High Price
     */
    private final DailyConsolidatedHighPriceField dailyConsolidatedHighPrice = new DailyConsolidatedHighPriceField();

    /**
     * Daily Consolidated Low Price
     */
    private final DailyConsolidatedLowPriceField dailyConsolidatedLowPrice = new DailyConsolidatedLowPriceField();

    /**
     * Daily Consolidated Closing Price
     */
    private final DailyConsolidatedClosingPriceField dailyConsolidatedClosingPrice = new DailyConsolidatedClosingPriceField();

    /**
     * Market Center Originator ID
     */
    private final MarketCenterOriginatorIdField marketCenterOriginatorId = new MarketCenterOriginatorIdField();

    /**
     * Consolidated Volume
     */
    private final ConsolidatedVolumeField consolidatedVolume = new ConsolidatedVolumeField();

    /**
     * Trading Action Indicator
     */
    private final TradingActionIndicatorField tradingActionIndicator = new TradingActionIndicatorField();

    /**
     * Number of Market Center Summaries
     */
    private final NumberOfMarketCenterSummariesField numberOfMarketCenterSummaries = new NumberOfMarketCenterSummariesField();

    /**
     * Market Center Closing Price And Volume Summary
     */
    private final MarketCenterClosingPriceAndVolumeSummaryList marketCenterClosingPriceAndVolumeSummary = new MarketCenterClosingPriceAndVolumeSummaryList();

    /**
     * Message Info
     */
    private final MessageInfo messageInfo = new MessageInfo();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(messageInfo.fields(), List.<Field>of(symbolLong), List.<Field>of(dailyConsolidatedHighPrice), List.<Field>of(dailyConsolidatedLowPrice), List.<Field>of(dailyConsolidatedClosingPrice), List.<Field>of(marketCenterOriginatorId), List.<Field>of(consolidatedVolume), List.<Field>of(tradingActionIndicator), List.<Field>of(numberOfMarketCenterSummaries)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Security Identifier
     *
     * @return the SymbolLong field
     */
    public SymbolLongField symbolLong() {
        return symbolLong;
    }

    /**
     * Daily Consolidated High Price
     *
     * @return the DailyConsolidatedHighPrice field
     */
    public DailyConsolidatedHighPriceField dailyConsolidatedHighPrice() {
        return dailyConsolidatedHighPrice;
    }

    /**
     * Daily Consolidated Low Price
     *
     * @return the DailyConsolidatedLowPrice field
     */
    public DailyConsolidatedLowPriceField dailyConsolidatedLowPrice() {
        return dailyConsolidatedLowPrice;
    }

    /**
     * Daily Consolidated Closing Price
     *
     * @return the DailyConsolidatedClosingPrice field
     */
    public DailyConsolidatedClosingPriceField dailyConsolidatedClosingPrice() {
        return dailyConsolidatedClosingPrice;
    }

    /**
     * Market Center Originator ID
     *
     * @return the MarketCenterOriginatorId field
     */
    public MarketCenterOriginatorIdField marketCenterOriginatorId() {
        return marketCenterOriginatorId;
    }

    /**
     * Consolidated Volume
     *
     * @return the ConsolidatedVolume field
     */
    public ConsolidatedVolumeField consolidatedVolume() {
        return consolidatedVolume;
    }

    /**
     * Trading Action Indicator
     *
     * @return the TradingActionIndicator field
     */
    public TradingActionIndicatorField tradingActionIndicator() {
        return tradingActionIndicator;
    }

    /**
     * Number of Market Center Summaries
     *
     * @return the NumberOfMarketCenterSummaries field
     */
    public NumberOfMarketCenterSummariesField numberOfMarketCenterSummaries() {
        return numberOfMarketCenterSummaries;
    }

    /**
     * Market Center Closing Price And Volume Summary
     *
     * <p>Encode writes this list's size to the NumberOfMarketCenterSummaries field.</p>
     *
     * @return the MarketCenterClosingPriceAndVolumeSummary entries
     */
    public MarketCenterClosingPriceAndVolumeSummaryList marketCenterClosingPriceAndVolumeSummary() {
        return marketCenterClosingPriceAndVolumeSummary;
    }

    /**
     * Message Info
     *
     * @return the MessageInfo record
     */
    public MessageInfo messageInfo() {
        return messageInfo;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + marketCenterClosingPriceAndVolumeSummary.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(messageInfo.sipTimestamp().value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!messageInfo.parseFrom(data, cursor, end - 47)) {
            return false;
        }
        cursor += messageInfo.byteLength();
        if (!symbolLong.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolLongField.BYTE_LENGTH;
        if (!dailyConsolidatedHighPrice.parse(data, cursor)) {
            return false;
        }
        cursor += DailyConsolidatedHighPriceField.BYTE_LENGTH;
        if (!dailyConsolidatedLowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += DailyConsolidatedLowPriceField.BYTE_LENGTH;
        if (!dailyConsolidatedClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += DailyConsolidatedClosingPriceField.BYTE_LENGTH;
        if (!marketCenterOriginatorId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCenterOriginatorIdField.BYTE_LENGTH;
        if (!consolidatedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedVolumeField.BYTE_LENGTH;
        if (!tradingActionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TradingActionIndicatorField.BYTE_LENGTH;
        if (!numberOfMarketCenterSummaries.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfMarketCenterSummariesField.BYTE_LENGTH;
        if (!marketCenterClosingPriceAndVolumeSummary.parse(data, cursor, end, numberOfMarketCenterSummaries.value())) {
            return false;
        }
        cursor += marketCenterClosingPriceAndVolumeSummary.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (marketCenterClosingPriceAndVolumeSummary.size() > 65535) {
            throw new IllegalStateException("marketCenterClosingPriceAndVolumeSummary holds " + marketCenterClosingPriceAndVolumeSummary.size() + " entries, more than its count field can state");
        }
        numberOfMarketCenterSummaries.value(marketCenterClosingPriceAndVolumeSummary.size());
        int cursor = offset;
        cursor = messageInfo.encode(data, cursor);
        cursor = symbolLong.encode(data, cursor);
        cursor = dailyConsolidatedHighPrice.encode(data, cursor);
        cursor = dailyConsolidatedLowPrice.encode(data, cursor);
        cursor = dailyConsolidatedClosingPrice.encode(data, cursor);
        cursor = marketCenterOriginatorId.encode(data, cursor);
        cursor = consolidatedVolume.encode(data, cursor);
        cursor = tradingActionIndicator.encode(data, cursor);
        cursor = numberOfMarketCenterSummaries.encode(data, cursor);
        cursor = marketCenterClosingPriceAndVolumeSummary.encode(data, cursor);
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
        messageInfo.clear();
        marketCenterClosingPriceAndVolumeSummary.clear();
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
            if (field != numberOfMarketCenterSummaries && !field.isRecognized()) {
                return false;
            }
        }
        return marketCenterClosingPriceAndVolumeSummary.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfMarketCenterSummaries && !field.isValid()) {
                return false;
            }
        }
        if (!marketCenterClosingPriceAndVolumeSummary.isValid()) {
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
        if (!messageInfo.isDecoded()) {
            return messageInfo.failedAt();
        }
        if (!symbolLong.isDecoded()) {
            return Optional.of(symbolLong);
        }
        if (!dailyConsolidatedHighPrice.isDecoded()) {
            return Optional.of(dailyConsolidatedHighPrice);
        }
        if (!dailyConsolidatedLowPrice.isDecoded()) {
            return Optional.of(dailyConsolidatedLowPrice);
        }
        if (!dailyConsolidatedClosingPrice.isDecoded()) {
            return Optional.of(dailyConsolidatedClosingPrice);
        }
        if (!marketCenterOriginatorId.isDecoded()) {
            return Optional.of(marketCenterOriginatorId);
        }
        if (!consolidatedVolume.isDecoded()) {
            return Optional.of(consolidatedVolume);
        }
        if (!tradingActionIndicator.isDecoded()) {
            return Optional.of(tradingActionIndicator);
        }
        if (!numberOfMarketCenterSummaries.isDecoded()) {
            return Optional.of(numberOfMarketCenterSummaries);
        }
        if (!marketCenterClosingPriceAndVolumeSummary.isDecoded()) {
            return Optional.of(marketCenterClosingPriceAndVolumeSummary.failedEntry().flatMap(MarketCenterClosingPriceAndVolumeSummaryEntry::failedAt).orElse(numberOfMarketCenterSummaries));
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
            case "SymbolLong" -> Optional.of(symbolLong);
            case "DailyConsolidatedHighPrice" -> Optional.of(dailyConsolidatedHighPrice);
            case "DailyConsolidatedLowPrice" -> Optional.of(dailyConsolidatedLowPrice);
            case "DailyConsolidatedClosingPrice" -> Optional.of(dailyConsolidatedClosingPrice);
            case "MarketCenterOriginatorId" -> Optional.of(marketCenterOriginatorId);
            case "ConsolidatedVolume" -> Optional.of(consolidatedVolume);
            case "TradingActionIndicator" -> Optional.of(tradingActionIndicator);
            case "NumberOfMarketCenterSummaries" -> Optional.of(numberOfMarketCenterSummaries);
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
        changed.addAll(marketCenterClosingPriceAndVolumeSummary.diffFields(message.marketCenterClosingPriceAndVolumeSummary));
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
            marketCenterClosingPriceAndVolumeSummary.toFormattedString(builder, options);
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
        marketCenterClosingPriceAndVolumeSummary.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && marketCenterClosingPriceAndVolumeSummary.equals(message.marketCenterClosingPriceAndVolumeSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, marketCenterClosingPriceAndVolumeSummary);
    }
}
