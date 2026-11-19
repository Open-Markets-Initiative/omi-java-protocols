package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.AskPriceQuoteStrategyQuoteMessage;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.BidPriceQuoteFuturesQuoteMessage;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.FixedRateFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.AskSizeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.BidSizeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ExchangeIdField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ExpiryDayField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ExpiryMonthSwapFutureField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ExpiryYearField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.InstrumentStatusMarkerField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.RootSymbolSwapFutureField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.TenorField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Message;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.PrintOptions;

/**
 * Represents the SwapFutureQuoteMessage message from the SolaTcpRetransmission protocol.
 *
 * <p>Swap Future Quote message</p>
 */
public final class SwapFutureQuoteMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 45;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Swap Future Quote Message";

    /**
     * Exchange on which the quote occurred Q = Montreal
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Swap future base symbol
     */
    private final RootSymbolSwapFutureField rootSymbolSwapFuture = new RootSymbolSwapFutureField();

    /**
     * Expiry month code of the swap future Refer to Month Codes
     */
    private final ExpiryMonthSwapFutureField expiryMonthSwapFuture = new ExpiryMonthSwapFutureField();

    /**
     * Two last digits of the expiry year of the swap future
     */
    private final ExpiryYearField expiryYear = new ExpiryYearField();

    /**
     * Expiry day of the swap future
     */
    private final ExpiryDayField expiryDay = new ExpiryDayField();

    /**
     * The tenor of the swap future
     */
    private final TenorField tenor = new TenorField();

    /**
     * Number of futures contracts represented by the Bid Price If size is greater than 99999, the 5th character becomes an exponent Refer to Indicator Code
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * The number of futures contracts represented by the Ask Price If size is greater than 99999, the 5th character becomes an exponent Refer to Indicator Code
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * Indicates instrument status
     */
    private final InstrumentStatusMarkerField instrumentStatusMarker = new InstrumentStatusMarkerField();

    /**
     * Branch
     */
    private final FixedRateFractionPair fixedRateFractionPair = new FixedRateFractionPair();

    /**
     * Bid price for the future contract
     */
    private final BidPriceQuoteFuturesQuoteMessage bidPriceQuoteFuturesQuoteMessage = new BidPriceQuoteFuturesQuoteMessage();

    /**
     * Ask price for the future contract
     */
    private final AskPriceQuoteStrategyQuoteMessage askPriceQuoteStrategyQuoteMessage = new AskPriceQuoteStrategyQuoteMessage();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, rootSymbolSwapFuture, expiryMonthSwapFuture, expiryYear, expiryDay, tenor, bidSize, askSize, instrumentStatusMarker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange on which the quote occurred Q = Montreal
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Swap future base symbol
     *
     * @return the RootSymbolSwapFuture field
     */
    public RootSymbolSwapFutureField rootSymbolSwapFuture() {
        return rootSymbolSwapFuture;
    }

    /**
     * Expiry month code of the swap future Refer to Month Codes
     *
     * @return the ExpiryMonthSwapFuture field
     */
    public ExpiryMonthSwapFutureField expiryMonthSwapFuture() {
        return expiryMonthSwapFuture;
    }

    /**
     * Two last digits of the expiry year of the swap future
     *
     * @return the ExpiryYear field
     */
    public ExpiryYearField expiryYear() {
        return expiryYear;
    }

    /**
     * Expiry day of the swap future
     *
     * @return the ExpiryDay field
     */
    public ExpiryDayField expiryDay() {
        return expiryDay;
    }

    /**
     * The tenor of the swap future
     *
     * @return the Tenor field
     */
    public TenorField tenor() {
        return tenor;
    }

    /**
     * Number of futures contracts represented by the Bid Price If size is greater than 99999, the 5th character becomes an exponent Refer to Indicator Code
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * The number of futures contracts represented by the Ask Price If size is greater than 99999, the 5th character becomes an exponent Refer to Indicator Code
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * Indicates instrument status
     *
     * @return the InstrumentStatusMarker field
     */
    public InstrumentStatusMarkerField instrumentStatusMarker() {
        return instrumentStatusMarker;
    }

    /**
     * Branch
     *
     * @return the FixedRateFractionPair record
     */
    public FixedRateFractionPair fixedRateFractionPair() {
        return fixedRateFractionPair;
    }

    /**
     * Bid price for the future contract
     *
     * @return the BidPriceQuoteFuturesQuoteMessage record
     */
    public BidPriceQuoteFuturesQuoteMessage bidPriceQuoteFuturesQuoteMessage() {
        return bidPriceQuoteFuturesQuoteMessage;
    }

    /**
     * Ask price for the future contract
     *
     * @return the AskPriceQuoteStrategyQuoteMessage record
     */
    public AskPriceQuoteStrategyQuoteMessage askPriceQuoteStrategyQuoteMessage() {
        return askPriceQuoteStrategyQuoteMessage;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!rootSymbolSwapFuture.parse(data, cursor)) {
            return false;
        }
        cursor += RootSymbolSwapFutureField.BYTE_LENGTH;
        if (!expiryMonthSwapFuture.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryMonthSwapFutureField.BYTE_LENGTH;
        if (!expiryYear.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryYearField.BYTE_LENGTH;
        if (!expiryDay.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDayField.BYTE_LENGTH;
        if (!tenor.parse(data, cursor)) {
            return false;
        }
        cursor += TenorField.BYTE_LENGTH;
        if (!fixedRateFractionPair.parseFrom(data, cursor, end - 25)) {
            return false;
        }
        cursor += fixedRateFractionPair.byteLength();
        if (!bidPriceQuoteFuturesQuoteMessage.parseFrom(data, cursor, end - 18)) {
            return false;
        }
        cursor += bidPriceQuoteFuturesQuoteMessage.byteLength();
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askPriceQuoteStrategyQuoteMessage.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += askPriceQuoteStrategyQuoteMessage.byteLength();
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        return instrumentStatusMarker.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = rootSymbolSwapFuture.encode(data, cursor);
        cursor = expiryMonthSwapFuture.encode(data, cursor);
        cursor = expiryYear.encode(data, cursor);
        cursor = expiryDay.encode(data, cursor);
        cursor = tenor.encode(data, cursor);
        cursor = fixedRateFractionPair.encode(data, cursor);
        cursor = bidPriceQuoteFuturesQuoteMessage.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askPriceQuoteStrategyQuoteMessage.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = instrumentStatusMarker.encode(data, cursor);
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
        fixedRateFractionPair.clear();
        bidPriceQuoteFuturesQuoteMessage.clear();
        askPriceQuoteStrategyQuoteMessage.clear();
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
        if (!fixedRateFractionPair.isRecognized()) {
            return false;
        }
        if (!bidPriceQuoteFuturesQuoteMessage.isRecognized()) {
            return false;
        }
        return askPriceQuoteStrategyQuoteMessage.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!fixedRateFractionPair.isValid()) {
            return false;
        }
        if (!bidPriceQuoteFuturesQuoteMessage.isValid()) {
            return false;
        }
        if (!askPriceQuoteStrategyQuoteMessage.isValid()) {
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "RootSymbolSwapFuture" -> Optional.of(rootSymbolSwapFuture);
            case "ExpiryMonthSwapFuture" -> Optional.of(expiryMonthSwapFuture);
            case "ExpiryYear" -> Optional.of(expiryYear);
            case "ExpiryDay" -> Optional.of(expiryDay);
            case "Tenor" -> Optional.of(tenor);
            case "BidSize" -> Optional.of(bidSize);
            case "AskSize" -> Optional.of(askSize);
            case "InstrumentStatusMarker" -> Optional.of(instrumentStatusMarker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SwapFutureQuoteMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(fixedRateFractionPair.diffFields(message.fixedRateFractionPair));
        changed.addAll(bidPriceQuoteFuturesQuoteMessage.diffFields(message.bidPriceQuoteFuturesQuoteMessage));
        changed.addAll(askPriceQuoteStrategyQuoteMessage.diffFields(message.askPriceQuoteStrategyQuoteMessage));
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
            builder.append(", ");
            fixedRateFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            bidPriceQuoteFuturesQuoteMessage.toFormattedString(builder, options);
            builder.append(", ");
            askPriceQuoteStrategyQuoteMessage.toFormattedString(builder, options);
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
        fixedRateFractionPair.toFormattedString(builder, nested);
        bidPriceQuoteFuturesQuoteMessage.toFormattedString(builder, nested);
        askPriceQuoteStrategyQuoteMessage.toFormattedString(builder, nested);
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
        if (!(other instanceof SwapFutureQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && fixedRateFractionPair.equals(message.fixedRateFractionPair) && bidPriceQuoteFuturesQuoteMessage.equals(message.bidPriceQuoteFuturesQuoteMessage) && askPriceQuoteStrategyQuoteMessage.equals(message.askPriceQuoteStrategyQuoteMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, fixedRateFractionPair, bidPriceQuoteFuturesQuoteMessage, askPriceQuoteStrategyQuoteMessage);
    }
}
