package omi.nasdaq.utdf.output.utp.v1_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.utdf.output.utp.v1_5.fields.ConsolidatedHighPriceField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.ConsolidatedLastPriceField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.ConsolidatedLowPriceField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.ConsolidatedPriceChangeIndicatorField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.ConsolidatedVolumeField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.FinraTimestampField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.MarketCenterOriginatorIdField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.MarketParticipantHighPriceField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.MarketParticipantLastPriceField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.MarketParticipantLowPriceField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.MarketParticipantVolumeField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.OriginalSellersSaleDaysField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.OriginalTradeIdField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.OriginalTradePriceField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.OriginalTradeThroughExemptFlagField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.OriginalVolumeField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.SymbolLongField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.TradeCancellationTypeField;
import omi.nasdaq.utdf.output.utp.v1_5.structs.MessageInfo;
import omi.nasdaq.utdf.output.utp.v1_5.structs.OriginalSaleCondition;
import omi.nasdaq.utdf.output.utp.v1_5.types.Field;
import omi.nasdaq.utdf.output.utp.v1_5.types.Message;
import omi.nasdaq.utdf.output.utp.v1_5.types.PrintOptions;

/**
 * Represents the TradeCancelErrorMessage message from the Output protocol.
 *
 * <p>Used to disseminate trade cancels or errors</p>
 */
public final class TradeCancelErrorMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Z';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 139;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Cancel Error Message";

    /**
     * FINRA Timestamp
     */
    private final FinraTimestampField finraTimestamp = new FinraTimestampField();

    /**
     * Security Identifier
     */
    private final SymbolLongField symbolLong = new SymbolLongField();

    /**
     * Trade Cancellation Type
     */
    private final TradeCancellationTypeField tradeCancellationType = new TradeCancellationTypeField();

    /**
     * Original Trade Id
     */
    private final OriginalTradeIdField originalTradeId = new OriginalTradeIdField();

    /**
     * Original Trade Price
     */
    private final OriginalTradePriceField originalTradePrice = new OriginalTradePriceField();

    /**
     * Original Volume
     */
    private final OriginalVolumeField originalVolume = new OriginalVolumeField();

    /**
     * Original Trade Through Exempt Flag
     */
    private final OriginalTradeThroughExemptFlagField originalTradeThroughExemptFlag = new OriginalTradeThroughExemptFlagField();

    /**
     * Original Seller’s Sale Days
     */
    private final OriginalSellersSaleDaysField originalSellersSaleDays = new OriginalSellersSaleDaysField();

    /**
     * Consolidated High Price
     */
    private final ConsolidatedHighPriceField consolidatedHighPrice = new ConsolidatedHighPriceField();

    /**
     * Consolidated Low Price
     */
    private final ConsolidatedLowPriceField consolidatedLowPrice = new ConsolidatedLowPriceField();

    /**
     * Consolidated Last Price
     */
    private final ConsolidatedLastPriceField consolidatedLastPrice = new ConsolidatedLastPriceField();

    /**
     * Consolidated Volume
     */
    private final ConsolidatedVolumeField consolidatedVolume = new ConsolidatedVolumeField();

    /**
     * Consolidated Price Change Indicator
     */
    private final ConsolidatedPriceChangeIndicatorField consolidatedPriceChangeIndicator = new ConsolidatedPriceChangeIndicatorField();

    /**
     * Market Center Originator ID
     */
    private final MarketCenterOriginatorIdField marketCenterOriginatorId = new MarketCenterOriginatorIdField();

    /**
     * Market Participant High Price
     */
    private final MarketParticipantHighPriceField marketParticipantHighPrice = new MarketParticipantHighPriceField();

    /**
     * Market Participant Low Price
     */
    private final MarketParticipantLowPriceField marketParticipantLowPrice = new MarketParticipantLowPriceField();

    /**
     * Market Participant Last Price
     */
    private final MarketParticipantLastPriceField marketParticipantLastPrice = new MarketParticipantLastPriceField();

    /**
     * Market Participant Volume
     */
    private final MarketParticipantVolumeField marketParticipantVolume = new MarketParticipantVolumeField();

    /**
     * Message Info
     */
    private final MessageInfo messageInfo = new MessageInfo();

    /**
     * Original Sale Condition
     */
    private final OriginalSaleCondition originalSaleCondition = new OriginalSaleCondition();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(messageInfo.fields(), List.<Field>of(finraTimestamp), List.<Field>of(symbolLong), List.<Field>of(tradeCancellationType), List.<Field>of(originalTradeId), List.<Field>of(originalTradePrice), List.<Field>of(originalVolume), originalSaleCondition.fields(), List.<Field>of(originalTradeThroughExemptFlag), List.<Field>of(originalSellersSaleDays), List.<Field>of(consolidatedHighPrice), List.<Field>of(consolidatedLowPrice), List.<Field>of(consolidatedLastPrice), List.<Field>of(consolidatedVolume), List.<Field>of(consolidatedPriceChangeIndicator), List.<Field>of(marketCenterOriginatorId), List.<Field>of(marketParticipantHighPrice), List.<Field>of(marketParticipantLowPrice), List.<Field>of(marketParticipantLastPrice), List.<Field>of(marketParticipantVolume)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * FINRA Timestamp
     *
     * @return the FinraTimestamp field
     */
    public FinraTimestampField finraTimestamp() {
        return finraTimestamp;
    }

    /**
     * Security Identifier
     *
     * @return the SymbolLong field
     */
    public SymbolLongField symbolLong() {
        return symbolLong;
    }

    /**
     * Trade Cancellation Type
     *
     * @return the TradeCancellationType field
     */
    public TradeCancellationTypeField tradeCancellationType() {
        return tradeCancellationType;
    }

    /**
     * Original Trade Id
     *
     * @return the OriginalTradeId field
     */
    public OriginalTradeIdField originalTradeId() {
        return originalTradeId;
    }

    /**
     * Original Trade Price
     *
     * @return the OriginalTradePrice field
     */
    public OriginalTradePriceField originalTradePrice() {
        return originalTradePrice;
    }

    /**
     * Original Volume
     *
     * @return the OriginalVolume field
     */
    public OriginalVolumeField originalVolume() {
        return originalVolume;
    }

    /**
     * Original Trade Through Exempt Flag
     *
     * @return the OriginalTradeThroughExemptFlag field
     */
    public OriginalTradeThroughExemptFlagField originalTradeThroughExemptFlag() {
        return originalTradeThroughExemptFlag;
    }

    /**
     * Original Seller’s Sale Days
     *
     * @return the OriginalSellersSaleDays field
     */
    public OriginalSellersSaleDaysField originalSellersSaleDays() {
        return originalSellersSaleDays;
    }

    /**
     * Consolidated High Price
     *
     * @return the ConsolidatedHighPrice field
     */
    public ConsolidatedHighPriceField consolidatedHighPrice() {
        return consolidatedHighPrice;
    }

    /**
     * Consolidated Low Price
     *
     * @return the ConsolidatedLowPrice field
     */
    public ConsolidatedLowPriceField consolidatedLowPrice() {
        return consolidatedLowPrice;
    }

    /**
     * Consolidated Last Price
     *
     * @return the ConsolidatedLastPrice field
     */
    public ConsolidatedLastPriceField consolidatedLastPrice() {
        return consolidatedLastPrice;
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
     * Consolidated Price Change Indicator
     *
     * @return the ConsolidatedPriceChangeIndicator field
     */
    public ConsolidatedPriceChangeIndicatorField consolidatedPriceChangeIndicator() {
        return consolidatedPriceChangeIndicator;
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
     * Market Participant High Price
     *
     * @return the MarketParticipantHighPrice field
     */
    public MarketParticipantHighPriceField marketParticipantHighPrice() {
        return marketParticipantHighPrice;
    }

    /**
     * Market Participant Low Price
     *
     * @return the MarketParticipantLowPrice field
     */
    public MarketParticipantLowPriceField marketParticipantLowPrice() {
        return marketParticipantLowPrice;
    }

    /**
     * Market Participant Last Price
     *
     * @return the MarketParticipantLastPrice field
     */
    public MarketParticipantLastPriceField marketParticipantLastPrice() {
        return marketParticipantLastPrice;
    }

    /**
     * Market Participant Volume
     *
     * @return the MarketParticipantVolume field
     */
    public MarketParticipantVolumeField marketParticipantVolume() {
        return marketParticipantVolume;
    }

    /**
     * Message Info
     *
     * @return the MessageInfo record
     */
    public MessageInfo messageInfo() {
        return messageInfo;
    }

    /**
     * Original Sale Condition
     *
     * @return the OriginalSaleCondition record
     */
    public OriginalSaleCondition originalSaleCondition() {
        return originalSaleCondition;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!messageInfo.parseFrom(data, cursor, end - 113)) {
            return false;
        }
        cursor += messageInfo.byteLength();
        if (!finraTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += FinraTimestampField.BYTE_LENGTH;
        if (!symbolLong.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolLongField.BYTE_LENGTH;
        if (!tradeCancellationType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeCancellationTypeField.BYTE_LENGTH;
        if (!originalTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeIdField.BYTE_LENGTH;
        if (!originalTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradePriceField.BYTE_LENGTH;
        if (!originalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalVolumeField.BYTE_LENGTH;
        if (!originalSaleCondition.parseFrom(data, cursor, end - 69)) {
            return false;
        }
        cursor += originalSaleCondition.byteLength();
        if (!originalTradeThroughExemptFlag.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeThroughExemptFlagField.BYTE_LENGTH;
        if (!originalSellersSaleDays.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalSellersSaleDaysField.BYTE_LENGTH;
        if (!consolidatedHighPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedHighPriceField.BYTE_LENGTH;
        if (!consolidatedLowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedLowPriceField.BYTE_LENGTH;
        if (!consolidatedLastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedLastPriceField.BYTE_LENGTH;
        if (!consolidatedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedVolumeField.BYTE_LENGTH;
        if (!consolidatedPriceChangeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedPriceChangeIndicatorField.BYTE_LENGTH;
        if (!marketCenterOriginatorId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCenterOriginatorIdField.BYTE_LENGTH;
        if (!marketParticipantHighPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantHighPriceField.BYTE_LENGTH;
        if (!marketParticipantLowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantLowPriceField.BYTE_LENGTH;
        if (!marketParticipantLastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantLastPriceField.BYTE_LENGTH;
        return marketParticipantVolume.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = messageInfo.encode(data, cursor);
        cursor = finraTimestamp.encode(data, cursor);
        cursor = symbolLong.encode(data, cursor);
        cursor = tradeCancellationType.encode(data, cursor);
        cursor = originalTradeId.encode(data, cursor);
        cursor = originalTradePrice.encode(data, cursor);
        cursor = originalVolume.encode(data, cursor);
        cursor = originalSaleCondition.encode(data, cursor);
        cursor = originalTradeThroughExemptFlag.encode(data, cursor);
        cursor = originalSellersSaleDays.encode(data, cursor);
        cursor = consolidatedHighPrice.encode(data, cursor);
        cursor = consolidatedLowPrice.encode(data, cursor);
        cursor = consolidatedLastPrice.encode(data, cursor);
        cursor = consolidatedVolume.encode(data, cursor);
        cursor = consolidatedPriceChangeIndicator.encode(data, cursor);
        cursor = marketCenterOriginatorId.encode(data, cursor);
        cursor = marketParticipantHighPrice.encode(data, cursor);
        cursor = marketParticipantLowPrice.encode(data, cursor);
        cursor = marketParticipantLastPrice.encode(data, cursor);
        cursor = marketParticipantVolume.encode(data, cursor);
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
        messageInfo.clear();
        originalSaleCondition.clear();
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
            case "FinraTimestamp" -> Optional.of(finraTimestamp);
            case "SymbolLong" -> Optional.of(symbolLong);
            case "TradeCancellationType" -> Optional.of(tradeCancellationType);
            case "OriginalTradeId" -> Optional.of(originalTradeId);
            case "OriginalTradePrice" -> Optional.of(originalTradePrice);
            case "OriginalVolume" -> Optional.of(originalVolume);
            case "OriginalTradeThroughExemptFlag" -> Optional.of(originalTradeThroughExemptFlag);
            case "OriginalSellersSaleDays" -> Optional.of(originalSellersSaleDays);
            case "ConsolidatedHighPrice" -> Optional.of(consolidatedHighPrice);
            case "ConsolidatedLowPrice" -> Optional.of(consolidatedLowPrice);
            case "ConsolidatedLastPrice" -> Optional.of(consolidatedLastPrice);
            case "ConsolidatedVolume" -> Optional.of(consolidatedVolume);
            case "ConsolidatedPriceChangeIndicator" -> Optional.of(consolidatedPriceChangeIndicator);
            case "MarketCenterOriginatorId" -> Optional.of(marketCenterOriginatorId);
            case "MarketParticipantHighPrice" -> Optional.of(marketParticipantHighPrice);
            case "MarketParticipantLowPrice" -> Optional.of(marketParticipantLowPrice);
            case "MarketParticipantLastPrice" -> Optional.of(marketParticipantLastPrice);
            case "MarketParticipantVolume" -> Optional.of(marketParticipantVolume);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCancelErrorMessage message)) {
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
        if (!(other instanceof TradeCancelErrorMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
