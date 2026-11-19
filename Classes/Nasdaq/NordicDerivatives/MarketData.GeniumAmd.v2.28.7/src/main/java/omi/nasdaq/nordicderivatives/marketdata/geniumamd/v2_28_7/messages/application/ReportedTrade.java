package omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.ComboGroupIdField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.MatchIdField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.OrderBookIdField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.ReservedAlphaField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.SecondReservedField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.TimeOfTradeAgreementField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.TimeOfTradeDisseminationField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.TimeOfTradeExecutionField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.TimestampNanosecondsField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.TradePriceField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.TradeTypeField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.TradedQuantityField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.types.Field;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.types.Message;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.types.PrintOptions;

/**
 * Represents the ReportedTrade message from the MarketData protocol.
 */
public final class ReportedTrade implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'r';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 72;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Reported Trade";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final TimestampNanosecondsField timestampNanoseconds = new TimestampNanosecondsField();

    /**
     * Denotes the primary identifier of an order book. NOTE: Expired Order book IDs may be reused for new instruments.
     */
    private final OrderBookIdField orderBookId = new OrderBookIdField();

    /**
     * Traded Quantity
     */
    private final TradedQuantityField tradedQuantity = new TradedQuantityField();

    /**
     * Match Id
     */
    private final MatchIdField matchId = new MatchIdField();

    /**
     * Used to group combination order book executions and the trades in the constituent order books to- gether.
     */
    private final ComboGroupIdField comboGroupId = new ComboGroupIdField();

    /**
     * Time Of Trade Execution
     */
    private final TimeOfTradeExecutionField timeOfTradeExecution = new TimeOfTradeExecutionField();

    /**
     * Time Of Trade Agreement
     */
    private final TimeOfTradeAgreementField timeOfTradeAgreement = new TimeOfTradeAgreementField();

    /**
     * Time Of Trade Dissemination
     */
    private final TimeOfTradeDisseminationField timeOfTradeDissemination = new TimeOfTradeDisseminationField();

    /**
     * Trade Price
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * Values: Trade Types as configured for the exchange.
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * Reserved Alpha
     */
    private final ReservedAlphaField reservedAlpha = new ReservedAlphaField();

    /**
     * Second Reserved
     */
    private final SecondReservedField secondReserved = new SecondReservedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampNanoseconds, orderBookId, tradedQuantity, matchId, comboGroupId, timeOfTradeExecution, timeOfTradeAgreement, timeOfTradeDissemination, tradePrice, tradeType, reservedAlpha, secondReserved);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the TimestampNanoseconds field
     */
    public TimestampNanosecondsField timestampNanoseconds() {
        return timestampNanoseconds;
    }

    /**
     * Denotes the primary identifier of an order book. NOTE: Expired Order book IDs may be reused for new instruments.
     *
     * @return the OrderBookId field
     */
    public OrderBookIdField orderBookId() {
        return orderBookId;
    }

    /**
     * Traded Quantity
     *
     * @return the TradedQuantity field
     */
    public TradedQuantityField tradedQuantity() {
        return tradedQuantity;
    }

    /**
     * Match Id
     *
     * @return the MatchId field
     */
    public MatchIdField matchId() {
        return matchId;
    }

    /**
     * Used to group combination order book executions and the trades in the constituent order books to- gether.
     *
     * @return the ComboGroupId field
     */
    public ComboGroupIdField comboGroupId() {
        return comboGroupId;
    }

    /**
     * Time Of Trade Execution
     *
     * @return the TimeOfTradeExecution field
     */
    public TimeOfTradeExecutionField timeOfTradeExecution() {
        return timeOfTradeExecution;
    }

    /**
     * Time Of Trade Agreement
     *
     * @return the TimeOfTradeAgreement field
     */
    public TimeOfTradeAgreementField timeOfTradeAgreement() {
        return timeOfTradeAgreement;
    }

    /**
     * Time Of Trade Dissemination
     *
     * @return the TimeOfTradeDissemination field
     */
    public TimeOfTradeDisseminationField timeOfTradeDissemination() {
        return timeOfTradeDissemination;
    }

    /**
     * Trade Price
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * Values: Trade Types as configured for the exchange.
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * Reserved Alpha
     *
     * @return the ReservedAlpha field
     */
    public ReservedAlphaField reservedAlpha() {
        return reservedAlpha;
    }

    /**
     * Second Reserved
     *
     * @return the SecondReserved field
     */
    public SecondReservedField secondReserved() {
        return secondReserved;
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
        if (!timestampNanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampNanosecondsField.BYTE_LENGTH;
        if (!orderBookId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookIdField.BYTE_LENGTH;
        if (!tradedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += TradedQuantityField.BYTE_LENGTH;
        if (!matchId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchIdField.BYTE_LENGTH;
        if (!comboGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += ComboGroupIdField.BYTE_LENGTH;
        if (!timeOfTradeExecution.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOfTradeExecutionField.BYTE_LENGTH;
        if (!timeOfTradeAgreement.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOfTradeAgreementField.BYTE_LENGTH;
        if (!timeOfTradeDissemination.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOfTradeDisseminationField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!reservedAlpha.parse(data, cursor)) {
            return false;
        }
        cursor += ReservedAlphaField.BYTE_LENGTH;
        return secondReserved.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampNanoseconds.encode(data, cursor);
        cursor = orderBookId.encode(data, cursor);
        cursor = tradedQuantity.encode(data, cursor);
        cursor = matchId.encode(data, cursor);
        cursor = comboGroupId.encode(data, cursor);
        cursor = timeOfTradeExecution.encode(data, cursor);
        cursor = timeOfTradeAgreement.encode(data, cursor);
        cursor = timeOfTradeDissemination.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = reservedAlpha.encode(data, cursor);
        cursor = secondReserved.encode(data, cursor);
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
            case "TimestampNanoseconds" -> Optional.of(timestampNanoseconds);
            case "OrderBookId" -> Optional.of(orderBookId);
            case "TradedQuantity" -> Optional.of(tradedQuantity);
            case "MatchId" -> Optional.of(matchId);
            case "ComboGroupId" -> Optional.of(comboGroupId);
            case "TimeOfTradeExecution" -> Optional.of(timeOfTradeExecution);
            case "TimeOfTradeAgreement" -> Optional.of(timeOfTradeAgreement);
            case "TimeOfTradeDissemination" -> Optional.of(timeOfTradeDissemination);
            case "TradePrice" -> Optional.of(tradePrice);
            case "TradeType" -> Optional.of(tradeType);
            case "ReservedAlpha" -> Optional.of(reservedAlpha);
            case "SecondReserved" -> Optional.of(secondReserved);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ReportedTrade message)) {
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
        if (!(other instanceof ReportedTrade message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
