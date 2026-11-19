package omi.nasdaq.utdf.output.utp.v3_0_c.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.ConsolidatedLastPriceOriginatorField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.ConsolidatedVolumeField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.DailyConsolidatedClosingPriceField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.DailyConsolidatedHighPriceField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.DailyConsolidatedLowPriceField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.MarketCenterOriginatorField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.NumberOfMarketCenterAttachmentsField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.ParticipantTokenField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.SipTimestampField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.SubMarketCenterIdField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.SymbolLongField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.TimestampField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.TradingActionIndicatorField;
import omi.nasdaq.utdf.output.utp.v3_0_c.groups.MarketCenterClosingPriceAndVolumeSummaryEntry;
import omi.nasdaq.utdf.output.utp.v3_0_c.groups.MarketCenterClosingPriceAndVolumeSummaryList;
import omi.nasdaq.utdf.output.utp.v3_0_c.types.Field;
import omi.nasdaq.utdf.output.utp.v3_0_c.types.Message;
import omi.nasdaq.utdf.output.utp.v3_0_c.types.PrintOptions;

/**
 * Represents the ClosingTradeSummaryReportMessage message from the Output protocol.
 *
 * <p>Fractional Closing Trade Summary Report Message. Disseminated three times daily, last at End of Trading Reporting event, with attachments per market center</p>
 */
public final class ClosingTradeSummaryReportMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'U';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 73;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Closing Trade Summary Report Message";

    /**
     * Market Center Originator
     */
    private final MarketCenterOriginatorField marketCenterOriginator = new MarketCenterOriginatorField();

    /**
     * Sub-Market Center ID
     */
    private final SubMarketCenterIdField subMarketCenterId = new SubMarketCenterIdField();

    /**
     * SIP Timestamp
     */
    private final SipTimestampField sipTimestamp = new SipTimestampField();

    /**
     * Participant Timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Participant Token
     */
    private final ParticipantTokenField participantToken = new ParticipantTokenField();

    /**
     * Security symbol
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
     * Market Center Originator for consolidated last price
     */
    private final ConsolidatedLastPriceOriginatorField consolidatedLastPriceOriginator = new ConsolidatedLastPriceOriginatorField();

    /**
     * Consolidated Volume
     */
    private final ConsolidatedVolumeField consolidatedVolume = new ConsolidatedVolumeField();

    /**
     * Trading Action Indicator
     */
    private final TradingActionIndicatorField tradingActionIndicator = new TradingActionIndicatorField();

    /**
     * Number of Market Center Attachments
     */
    private final NumberOfMarketCenterAttachmentsField numberOfMarketCenterAttachments = new NumberOfMarketCenterAttachmentsField();

    /**
     * Market Center Closing Price and Volume Summary attachment following the Closing Trade Summary Report Message. Repeats Number of Market Center Attachments times.
     */
    private final MarketCenterClosingPriceAndVolumeSummaryList marketCenterClosingPriceAndVolumeSummary = new MarketCenterClosingPriceAndVolumeSummaryList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketCenterOriginator, subMarketCenterId, sipTimestamp, timestampField, participantToken, symbolLong, dailyConsolidatedHighPrice, dailyConsolidatedLowPrice, dailyConsolidatedClosingPrice, consolidatedLastPriceOriginator, consolidatedVolume, tradingActionIndicator, numberOfMarketCenterAttachments);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Market Center Originator
     *
     * @return the MarketCenterOriginator field
     */
    public MarketCenterOriginatorField marketCenterOriginator() {
        return marketCenterOriginator;
    }

    /**
     * Sub-Market Center ID
     *
     * @return the SubMarketCenterId field
     */
    public SubMarketCenterIdField subMarketCenterId() {
        return subMarketCenterId;
    }

    /**
     * SIP Timestamp
     *
     * @return the SipTimestamp field
     */
    public SipTimestampField sipTimestamp() {
        return sipTimestamp;
    }

    /**
     * Participant Timestamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Participant Token
     *
     * @return the ParticipantToken field
     */
    public ParticipantTokenField participantToken() {
        return participantToken;
    }

    /**
     * Security symbol
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
     * Market Center Originator for consolidated last price
     *
     * @return the ConsolidatedLastPriceOriginator field
     */
    public ConsolidatedLastPriceOriginatorField consolidatedLastPriceOriginator() {
        return consolidatedLastPriceOriginator;
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
     * Number of Market Center Attachments
     *
     * @return the NumberOfMarketCenterAttachments field
     */
    public NumberOfMarketCenterAttachmentsField numberOfMarketCenterAttachments() {
        return numberOfMarketCenterAttachments;
    }

    /**
     * Market Center Closing Price and Volume Summary attachment following the Closing Trade Summary Report Message. Repeats Number of Market Center Attachments times.
     *
     * <p>Encode writes this list's size to the NumberOfMarketCenterAttachments field.</p>
     *
     * @return the MarketCenterClosingPriceAndVolumeSummary entries
     */
    public MarketCenterClosingPriceAndVolumeSummaryList marketCenterClosingPriceAndVolumeSummary() {
        return marketCenterClosingPriceAndVolumeSummary;
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
        return Optional.ofNullable(sipTimestamp.value());
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
        if (!marketCenterOriginator.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCenterOriginatorField.BYTE_LENGTH;
        if (!subMarketCenterId.parse(data, cursor)) {
            return false;
        }
        cursor += SubMarketCenterIdField.BYTE_LENGTH;
        if (!sipTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += SipTimestampField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!participantToken.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantTokenField.BYTE_LENGTH;
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
        if (!consolidatedLastPriceOriginator.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedLastPriceOriginatorField.BYTE_LENGTH;
        if (!consolidatedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedVolumeField.BYTE_LENGTH;
        if (!tradingActionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TradingActionIndicatorField.BYTE_LENGTH;
        if (!numberOfMarketCenterAttachments.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfMarketCenterAttachmentsField.BYTE_LENGTH;
        if (!marketCenterClosingPriceAndVolumeSummary.parse(data, cursor, end, numberOfMarketCenterAttachments.value())) {
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
        numberOfMarketCenterAttachments.value(marketCenterClosingPriceAndVolumeSummary.size());
        int cursor = offset;
        cursor = marketCenterOriginator.encode(data, cursor);
        cursor = subMarketCenterId.encode(data, cursor);
        cursor = sipTimestamp.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = participantToken.encode(data, cursor);
        cursor = symbolLong.encode(data, cursor);
        cursor = dailyConsolidatedHighPrice.encode(data, cursor);
        cursor = dailyConsolidatedLowPrice.encode(data, cursor);
        cursor = dailyConsolidatedClosingPrice.encode(data, cursor);
        cursor = consolidatedLastPriceOriginator.encode(data, cursor);
        cursor = consolidatedVolume.encode(data, cursor);
        cursor = tradingActionIndicator.encode(data, cursor);
        cursor = numberOfMarketCenterAttachments.encode(data, cursor);
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
            if (field != numberOfMarketCenterAttachments && !field.isRecognized()) {
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
            if (field != numberOfMarketCenterAttachments && !field.isValid()) {
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
        if (!marketCenterOriginator.isDecoded()) {
            return Optional.of(marketCenterOriginator);
        }
        if (!subMarketCenterId.isDecoded()) {
            return Optional.of(subMarketCenterId);
        }
        if (!sipTimestamp.isDecoded()) {
            return Optional.of(sipTimestamp);
        }
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!participantToken.isDecoded()) {
            return Optional.of(participantToken);
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
        if (!consolidatedLastPriceOriginator.isDecoded()) {
            return Optional.of(consolidatedLastPriceOriginator);
        }
        if (!consolidatedVolume.isDecoded()) {
            return Optional.of(consolidatedVolume);
        }
        if (!tradingActionIndicator.isDecoded()) {
            return Optional.of(tradingActionIndicator);
        }
        if (!numberOfMarketCenterAttachments.isDecoded()) {
            return Optional.of(numberOfMarketCenterAttachments);
        }
        if (!marketCenterClosingPriceAndVolumeSummary.isDecoded()) {
            return Optional.of(marketCenterClosingPriceAndVolumeSummary.failedEntry().flatMap(MarketCenterClosingPriceAndVolumeSummaryEntry::failedAt).orElse(numberOfMarketCenterAttachments));
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
            case "MarketCenterOriginator" -> Optional.of(marketCenterOriginator);
            case "SubMarketCenterId" -> Optional.of(subMarketCenterId);
            case "SipTimestamp" -> Optional.of(sipTimestamp);
            case "Timestamp" -> Optional.of(timestampField);
            case "ParticipantToken" -> Optional.of(participantToken);
            case "SymbolLong" -> Optional.of(symbolLong);
            case "DailyConsolidatedHighPrice" -> Optional.of(dailyConsolidatedHighPrice);
            case "DailyConsolidatedLowPrice" -> Optional.of(dailyConsolidatedLowPrice);
            case "DailyConsolidatedClosingPrice" -> Optional.of(dailyConsolidatedClosingPrice);
            case "ConsolidatedLastPriceOriginator" -> Optional.of(consolidatedLastPriceOriginator);
            case "ConsolidatedVolume" -> Optional.of(consolidatedVolume);
            case "TradingActionIndicator" -> Optional.of(tradingActionIndicator);
            case "NumberOfMarketCenterAttachments" -> Optional.of(numberOfMarketCenterAttachments);
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
