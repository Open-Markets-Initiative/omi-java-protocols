package omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.AskPriceQuoteFuturesQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.BidPriceQuoteFuturesQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.AskSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.BidSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.DeliveryDayField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.DeliveryMonthField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.DeliveryYearFuturesField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.InstrumentStatusMarkerField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.RootSymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.PrintOptions;

/**
 * Represents the FuturesQuoteMessage message from the SolaMulticast protocol.
 *
 * <p>Futures Quote message</p>
 */
public final class FuturesQuoteMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 37;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Futures Quote Message";

    /**
     * Exchange on which the quote occurred Q = Montreal
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Symbol for the Future series
     */
    private final RootSymbolField rootSymbol = new RootSymbolField();

    /**
     * Delivery month for the contract
     */
    private final DeliveryMonthField deliveryMonth = new DeliveryMonthField();

    /**
     * Two last digits of the delivery year of the future series
     */
    private final DeliveryYearFuturesField deliveryYearFutures = new DeliveryYearFuturesField();

    /**
     * Delivery day of the future series
     */
    private final DeliveryDayField deliveryDay = new DeliveryDayField();

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
     * Bid price for the future contract
     */
    private final BidPriceQuoteFuturesQuoteMessage bidPriceQuoteFuturesQuoteMessage = new BidPriceQuoteFuturesQuoteMessage();

    /**
     * Ask Price for the future contract
     */
    private final AskPriceQuoteFuturesQuoteMessage askPriceQuoteFuturesQuoteMessage = new AskPriceQuoteFuturesQuoteMessage();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, rootSymbol, deliveryMonth, deliveryYearFutures, deliveryDay, bidSize, askSize, instrumentStatusMarker);

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
     * Symbol for the Future series
     *
     * @return the RootSymbol field
     */
    public RootSymbolField rootSymbol() {
        return rootSymbol;
    }

    /**
     * Delivery month for the contract
     *
     * @return the DeliveryMonth field
     */
    public DeliveryMonthField deliveryMonth() {
        return deliveryMonth;
    }

    /**
     * Two last digits of the delivery year of the future series
     *
     * @return the DeliveryYearFutures field
     */
    public DeliveryYearFuturesField deliveryYearFutures() {
        return deliveryYearFutures;
    }

    /**
     * Delivery day of the future series
     *
     * @return the DeliveryDay field
     */
    public DeliveryDayField deliveryDay() {
        return deliveryDay;
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
     * Bid price for the future contract
     *
     * @return the BidPriceQuoteFuturesQuoteMessage record
     */
    public BidPriceQuoteFuturesQuoteMessage bidPriceQuoteFuturesQuoteMessage() {
        return bidPriceQuoteFuturesQuoteMessage;
    }

    /**
     * Ask Price for the future contract
     *
     * @return the AskPriceQuoteFuturesQuoteMessage record
     */
    public AskPriceQuoteFuturesQuoteMessage askPriceQuoteFuturesQuoteMessage() {
        return askPriceQuoteFuturesQuoteMessage;
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
        if (!rootSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += RootSymbolField.BYTE_LENGTH;
        if (!deliveryMonth.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryMonthField.BYTE_LENGTH;
        if (!deliveryYearFutures.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryYearFuturesField.BYTE_LENGTH;
        if (!deliveryDay.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryDayField.BYTE_LENGTH;
        if (!bidPriceQuoteFuturesQuoteMessage.parseFrom(data, cursor, end - 18)) {
            return false;
        }
        cursor += bidPriceQuoteFuturesQuoteMessage.byteLength();
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askPriceQuoteFuturesQuoteMessage.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += askPriceQuoteFuturesQuoteMessage.byteLength();
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
        cursor = rootSymbol.encode(data, cursor);
        cursor = deliveryMonth.encode(data, cursor);
        cursor = deliveryYearFutures.encode(data, cursor);
        cursor = deliveryDay.encode(data, cursor);
        cursor = bidPriceQuoteFuturesQuoteMessage.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askPriceQuoteFuturesQuoteMessage.encode(data, cursor);
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
        bidPriceQuoteFuturesQuoteMessage.clear();
        askPriceQuoteFuturesQuoteMessage.clear();
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
        if (!bidPriceQuoteFuturesQuoteMessage.isRecognized()) {
            return false;
        }
        return askPriceQuoteFuturesQuoteMessage.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!bidPriceQuoteFuturesQuoteMessage.isValid()) {
            return false;
        }
        if (!askPriceQuoteFuturesQuoteMessage.isValid()) {
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
            case "RootSymbol" -> Optional.of(rootSymbol);
            case "DeliveryMonth" -> Optional.of(deliveryMonth);
            case "DeliveryYearFutures" -> Optional.of(deliveryYearFutures);
            case "DeliveryDay" -> Optional.of(deliveryDay);
            case "BidSize" -> Optional.of(bidSize);
            case "AskSize" -> Optional.of(askSize);
            case "InstrumentStatusMarker" -> Optional.of(instrumentStatusMarker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FuturesQuoteMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(bidPriceQuoteFuturesQuoteMessage.diffFields(message.bidPriceQuoteFuturesQuoteMessage));
        changed.addAll(askPriceQuoteFuturesQuoteMessage.diffFields(message.askPriceQuoteFuturesQuoteMessage));
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
            bidPriceQuoteFuturesQuoteMessage.toFormattedString(builder, options);
            builder.append(", ");
            askPriceQuoteFuturesQuoteMessage.toFormattedString(builder, options);
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
        bidPriceQuoteFuturesQuoteMessage.toFormattedString(builder, nested);
        askPriceQuoteFuturesQuoteMessage.toFormattedString(builder, nested);
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
        if (!(other instanceof FuturesQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && bidPriceQuoteFuturesQuoteMessage.equals(message.bidPriceQuoteFuturesQuoteMessage) && askPriceQuoteFuturesQuoteMessage.equals(message.askPriceQuoteFuturesQuoteMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, bidPriceQuoteFuturesQuoteMessage, askPriceQuoteFuturesQuoteMessage);
    }
}
