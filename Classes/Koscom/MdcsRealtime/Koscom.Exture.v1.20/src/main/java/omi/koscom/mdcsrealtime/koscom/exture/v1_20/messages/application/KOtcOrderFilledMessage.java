package omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.AskQuoteNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BestAskOrderField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BestBidOrderField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BidQuoteNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ComparedToPreviousDayField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ComparedToPreviousDayTypeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.DataSeqNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EndKeywordField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.HighPriceField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IsinField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.LowPriceField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.RemainingQuantityOfBestAskOrderField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.RemainingQuantityOfBestBidOrderField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TotalRemainingQuantityOfAskField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TotalRemainingQuantityOfBidField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TotalTradingAccumulatedValueField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TotalTradingAccumulatedVolumeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TradingNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TradingPriceCompareRemainingQuantityOfAskField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TradingPriceCompareRemainingQuantityOfBidField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TradingPriceField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TradingTimeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TradingVolumeShortField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.WeightedAverageStockPriceField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Field;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.PrintOptions;

/**
 * Represents the KOtcOrderFilledMessage message from the Koscom protocol.
 *
 * <p>K-OTC Order Filled. Trade prints with running totals, high/low, weighted average price, and previous-day comparison.</p>
 */
public final class KOtcOrderFilledMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 245;

    /**
     * This message's declared name.
     */
    public static final String NAME = "K Otc Order Filled Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 204, 40 };

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     */
    private final IsinField isin = new IsinField();

    /**
     * Transmission seq. number.
     */
    private final DataSeqNumberField dataSeqNumber = new DataSeqNumberField();

    /**
     * Trading number for each issue.
     */
    private final TradingNumberField tradingNumber = new TradingNumberField();

    /**
     * Trading price.
     */
    private final TradingPriceField tradingPrice = new TradingPriceField();

    /**
     * Trading volume for each issue.
     */
    private final TradingVolumeShortField tradingVolumeShort = new TradingVolumeShortField();

    /**
     * Trading time.
     */
    private final TradingTimeField tradingTime = new TradingTimeField();

    /**
     * quote number for each issue.
     */
    private final AskQuoteNumberField askQuoteNumber = new AskQuoteNumberField();

    /**
     * quote number for each issue.
     */
    private final BidQuoteNumberField bidQuoteNumber = new BidQuoteNumberField();

    /**
     * High price.
     */
    private final HighPriceField highPrice = new HighPriceField();

    /**
     * Low price.
     */
    private final LowPriceField lowPrice = new LowPriceField();

    /**
     * Weighted average stock price.
     */
    private final WeightedAverageStockPriceField weightedAverageStockPrice = new WeightedAverageStockPriceField();

    /**
     * Total trading accumulated Volume.
     */
    private final TotalTradingAccumulatedVolumeField totalTradingAccumulatedVolume = new TotalTradingAccumulatedVolumeField();

    /**
     * Total trading accumulated value.
     */
    private final TotalTradingAccumulatedValueField totalTradingAccumulatedValue = new TotalTradingAccumulatedValueField();

    /**
     * Total remaining quantity of ask.
     */
    private final TotalRemainingQuantityOfAskField totalRemainingQuantityOfAsk = new TotalRemainingQuantityOfAskField();

    /**
     * Total remaining quantity of bid.
     */
    private final TotalRemainingQuantityOfBidField totalRemainingQuantityOfBid = new TotalRemainingQuantityOfBidField();

    /**
     * Best ask order.
     */
    private final BestAskOrderField bestAskOrder = new BestAskOrderField();

    /**
     * Remaining quantity of best ask order.
     */
    private final RemainingQuantityOfBestAskOrderField remainingQuantityOfBestAskOrder = new RemainingQuantityOfBestAskOrderField();

    /**
     * Best bid order.
     */
    private final BestBidOrderField bestBidOrder = new BestBidOrderField();

    /**
     * Remaining quantity of Best bid order.
     */
    private final RemainingQuantityOfBestBidOrderField remainingQuantityOfBestBidOrder = new RemainingQuantityOfBestBidOrderField();

    /**
     * +: up -: down space: steadiness.
     */
    private final ComparedToPreviousDayTypeField comparedToPreviousDayType = new ComparedToPreviousDayTypeField();

    /**
     * Compared to previous day.
     */
    private final ComparedToPreviousDayField comparedToPreviousDay = new ComparedToPreviousDayField();

    /**
     * Trading price compare remaining quantity of ask.
     */
    private final TradingPriceCompareRemainingQuantityOfAskField tradingPriceCompareRemainingQuantityOfAsk = new TradingPriceCompareRemainingQuantityOfAskField();

    /**
     * Trading price compare remaining quantity of bid.
     */
    private final TradingPriceCompareRemainingQuantityOfBidField tradingPriceCompareRemainingQuantityOfBid = new TradingPriceCompareRemainingQuantityOfBidField();

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     */
    private final EndKeywordField endKeyword = new EndKeywordField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(isin, dataSeqNumber, tradingNumber, tradingPrice, tradingVolumeShort, tradingTime, askQuoteNumber, bidQuoteNumber, highPrice, lowPrice, weightedAverageStockPrice, totalTradingAccumulatedVolume, totalTradingAccumulatedValue, totalRemainingQuantityOfAsk, totalRemainingQuantityOfBid, bestAskOrder, remainingQuantityOfBestAskOrder, bestBidOrder, remainingQuantityOfBestBidOrder, comparedToPreviousDayType, comparedToPreviousDay, tradingPriceCompareRemainingQuantityOfAsk, tradingPriceCompareRemainingQuantityOfBid, endKeyword);

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
     * Trading number for each issue.
     *
     * @return the TradingNumber field
     */
    public TradingNumberField tradingNumber() {
        return tradingNumber;
    }

    /**
     * Trading price.
     *
     * @return the TradingPrice field
     */
    public TradingPriceField tradingPrice() {
        return tradingPrice;
    }

    /**
     * Trading volume for each issue.
     *
     * @return the TradingVolumeShort field
     */
    public TradingVolumeShortField tradingVolumeShort() {
        return tradingVolumeShort;
    }

    /**
     * Trading time.
     *
     * @return the TradingTime field
     */
    public TradingTimeField tradingTime() {
        return tradingTime;
    }

    /**
     * quote number for each issue.
     *
     * @return the AskQuoteNumber field
     */
    public AskQuoteNumberField askQuoteNumber() {
        return askQuoteNumber;
    }

    /**
     * quote number for each issue.
     *
     * @return the BidQuoteNumber field
     */
    public BidQuoteNumberField bidQuoteNumber() {
        return bidQuoteNumber;
    }

    /**
     * High price.
     *
     * @return the HighPrice field
     */
    public HighPriceField highPrice() {
        return highPrice;
    }

    /**
     * Low price.
     *
     * @return the LowPrice field
     */
    public LowPriceField lowPrice() {
        return lowPrice;
    }

    /**
     * Weighted average stock price.
     *
     * @return the WeightedAverageStockPrice field
     */
    public WeightedAverageStockPriceField weightedAverageStockPrice() {
        return weightedAverageStockPrice;
    }

    /**
     * Total trading accumulated Volume.
     *
     * @return the TotalTradingAccumulatedVolume field
     */
    public TotalTradingAccumulatedVolumeField totalTradingAccumulatedVolume() {
        return totalTradingAccumulatedVolume;
    }

    /**
     * Total trading accumulated value.
     *
     * @return the TotalTradingAccumulatedValue field
     */
    public TotalTradingAccumulatedValueField totalTradingAccumulatedValue() {
        return totalTradingAccumulatedValue;
    }

    /**
     * Total remaining quantity of ask.
     *
     * @return the TotalRemainingQuantityOfAsk field
     */
    public TotalRemainingQuantityOfAskField totalRemainingQuantityOfAsk() {
        return totalRemainingQuantityOfAsk;
    }

    /**
     * Total remaining quantity of bid.
     *
     * @return the TotalRemainingQuantityOfBid field
     */
    public TotalRemainingQuantityOfBidField totalRemainingQuantityOfBid() {
        return totalRemainingQuantityOfBid;
    }

    /**
     * Best ask order.
     *
     * @return the BestAskOrder field
     */
    public BestAskOrderField bestAskOrder() {
        return bestAskOrder;
    }

    /**
     * Remaining quantity of best ask order.
     *
     * @return the RemainingQuantityOfBestAskOrder field
     */
    public RemainingQuantityOfBestAskOrderField remainingQuantityOfBestAskOrder() {
        return remainingQuantityOfBestAskOrder;
    }

    /**
     * Best bid order.
     *
     * @return the BestBidOrder field
     */
    public BestBidOrderField bestBidOrder() {
        return bestBidOrder;
    }

    /**
     * Remaining quantity of Best bid order.
     *
     * @return the RemainingQuantityOfBestBidOrder field
     */
    public RemainingQuantityOfBestBidOrderField remainingQuantityOfBestBidOrder() {
        return remainingQuantityOfBestBidOrder;
    }

    /**
     * +: up -: down space: steadiness.
     *
     * @return the ComparedToPreviousDayType field
     */
    public ComparedToPreviousDayTypeField comparedToPreviousDayType() {
        return comparedToPreviousDayType;
    }

    /**
     * Compared to previous day.
     *
     * @return the ComparedToPreviousDay field
     */
    public ComparedToPreviousDayField comparedToPreviousDay() {
        return comparedToPreviousDay;
    }

    /**
     * Trading price compare remaining quantity of ask.
     *
     * @return the TradingPriceCompareRemainingQuantityOfAsk field
     */
    public TradingPriceCompareRemainingQuantityOfAskField tradingPriceCompareRemainingQuantityOfAsk() {
        return tradingPriceCompareRemainingQuantityOfAsk;
    }

    /**
     * Trading price compare remaining quantity of bid.
     *
     * @return the TradingPriceCompareRemainingQuantityOfBid field
     */
    public TradingPriceCompareRemainingQuantityOfBidField tradingPriceCompareRemainingQuantityOfBid() {
        return tradingPriceCompareRemainingQuantityOfBid;
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
        if (!tradingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TradingNumberField.BYTE_LENGTH;
        if (!tradingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradingPriceField.BYTE_LENGTH;
        if (!tradingVolumeShort.parse(data, cursor)) {
            return false;
        }
        cursor += TradingVolumeShortField.BYTE_LENGTH;
        if (!tradingTime.parse(data, cursor)) {
            return false;
        }
        cursor += TradingTimeField.BYTE_LENGTH;
        if (!askQuoteNumber.parse(data, cursor)) {
            return false;
        }
        cursor += AskQuoteNumberField.BYTE_LENGTH;
        if (!bidQuoteNumber.parse(data, cursor)) {
            return false;
        }
        cursor += BidQuoteNumberField.BYTE_LENGTH;
        if (!highPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceField.BYTE_LENGTH;
        if (!lowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceField.BYTE_LENGTH;
        if (!weightedAverageStockPrice.parse(data, cursor)) {
            return false;
        }
        cursor += WeightedAverageStockPriceField.BYTE_LENGTH;
        if (!totalTradingAccumulatedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalTradingAccumulatedVolumeField.BYTE_LENGTH;
        if (!totalTradingAccumulatedValue.parse(data, cursor)) {
            return false;
        }
        cursor += TotalTradingAccumulatedValueField.BYTE_LENGTH;
        if (!totalRemainingQuantityOfAsk.parse(data, cursor)) {
            return false;
        }
        cursor += TotalRemainingQuantityOfAskField.BYTE_LENGTH;
        if (!totalRemainingQuantityOfBid.parse(data, cursor)) {
            return false;
        }
        cursor += TotalRemainingQuantityOfBidField.BYTE_LENGTH;
        if (!bestAskOrder.parse(data, cursor)) {
            return false;
        }
        cursor += BestAskOrderField.BYTE_LENGTH;
        if (!remainingQuantityOfBestAskOrder.parse(data, cursor)) {
            return false;
        }
        cursor += RemainingQuantityOfBestAskOrderField.BYTE_LENGTH;
        if (!bestBidOrder.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidOrderField.BYTE_LENGTH;
        if (!remainingQuantityOfBestBidOrder.parse(data, cursor)) {
            return false;
        }
        cursor += RemainingQuantityOfBestBidOrderField.BYTE_LENGTH;
        if (!comparedToPreviousDayType.parse(data, cursor)) {
            return false;
        }
        cursor += ComparedToPreviousDayTypeField.BYTE_LENGTH;
        if (!comparedToPreviousDay.parse(data, cursor)) {
            return false;
        }
        cursor += ComparedToPreviousDayField.BYTE_LENGTH;
        if (!tradingPriceCompareRemainingQuantityOfAsk.parse(data, cursor)) {
            return false;
        }
        cursor += TradingPriceCompareRemainingQuantityOfAskField.BYTE_LENGTH;
        if (!tradingPriceCompareRemainingQuantityOfBid.parse(data, cursor)) {
            return false;
        }
        cursor += TradingPriceCompareRemainingQuantityOfBidField.BYTE_LENGTH;
        cursor += 40; // padding
        return endKeyword.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = isin.encode(data, cursor);
        cursor = dataSeqNumber.encode(data, cursor);
        cursor = tradingNumber.encode(data, cursor);
        cursor = tradingPrice.encode(data, cursor);
        cursor = tradingVolumeShort.encode(data, cursor);
        cursor = tradingTime.encode(data, cursor);
        cursor = askQuoteNumber.encode(data, cursor);
        cursor = bidQuoteNumber.encode(data, cursor);
        cursor = highPrice.encode(data, cursor);
        cursor = lowPrice.encode(data, cursor);
        cursor = weightedAverageStockPrice.encode(data, cursor);
        cursor = totalTradingAccumulatedVolume.encode(data, cursor);
        cursor = totalTradingAccumulatedValue.encode(data, cursor);
        cursor = totalRemainingQuantityOfAsk.encode(data, cursor);
        cursor = totalRemainingQuantityOfBid.encode(data, cursor);
        cursor = bestAskOrder.encode(data, cursor);
        cursor = remainingQuantityOfBestAskOrder.encode(data, cursor);
        cursor = bestBidOrder.encode(data, cursor);
        cursor = remainingQuantityOfBestBidOrder.encode(data, cursor);
        cursor = comparedToPreviousDayType.encode(data, cursor);
        cursor = comparedToPreviousDay.encode(data, cursor);
        cursor = tradingPriceCompareRemainingQuantityOfAsk.encode(data, cursor);
        cursor = tradingPriceCompareRemainingQuantityOfBid.encode(data, cursor);
        if (buffer != null && buffer.length >= 244) {
            System.arraycopy(buffer, 204, data, cursor, 40); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 40, (byte) 0); // padding
        }
        cursor += 40;
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
            case "TradingNumber" -> Optional.of(tradingNumber);
            case "TradingPrice" -> Optional.of(tradingPrice);
            case "TradingVolumeShort" -> Optional.of(tradingVolumeShort);
            case "TradingTime" -> Optional.of(tradingTime);
            case "AskQuoteNumber" -> Optional.of(askQuoteNumber);
            case "BidQuoteNumber" -> Optional.of(bidQuoteNumber);
            case "HighPrice" -> Optional.of(highPrice);
            case "LowPrice" -> Optional.of(lowPrice);
            case "WeightedAverageStockPrice" -> Optional.of(weightedAverageStockPrice);
            case "TotalTradingAccumulatedVolume" -> Optional.of(totalTradingAccumulatedVolume);
            case "TotalTradingAccumulatedValue" -> Optional.of(totalTradingAccumulatedValue);
            case "TotalRemainingQuantityOfAsk" -> Optional.of(totalRemainingQuantityOfAsk);
            case "TotalRemainingQuantityOfBid" -> Optional.of(totalRemainingQuantityOfBid);
            case "BestAskOrder" -> Optional.of(bestAskOrder);
            case "RemainingQuantityOfBestAskOrder" -> Optional.of(remainingQuantityOfBestAskOrder);
            case "BestBidOrder" -> Optional.of(bestBidOrder);
            case "RemainingQuantityOfBestBidOrder" -> Optional.of(remainingQuantityOfBestBidOrder);
            case "ComparedToPreviousDayType" -> Optional.of(comparedToPreviousDayType);
            case "ComparedToPreviousDay" -> Optional.of(comparedToPreviousDay);
            case "TradingPriceCompareRemainingQuantityOfAsk" -> Optional.of(tradingPriceCompareRemainingQuantityOfAsk);
            case "TradingPriceCompareRemainingQuantityOfBid" -> Optional.of(tradingPriceCompareRemainingQuantityOfBid);
            case "EndKeyword" -> Optional.of(endKeyword);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof KOtcOrderFilledMessage message)) {
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
        if (!(other instanceof KOtcOrderFilledMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
