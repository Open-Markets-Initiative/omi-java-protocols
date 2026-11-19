package omi.lme.lmeselect.level1snapshot.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.AggregateAskVolumeField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.AggregateBidVolumeField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.AskPriceField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.AskQtyExplicitOrdersField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.AskQtyImpliedOrdersField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.BidPriceField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.BidQtyExplicitOrdersField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.BidQtyImpliedOrdersField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.NumberAskExplicitOrdersField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.NumberAskImpliedOrdersField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.NumberBidExplicitOrdersField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.NumberBidImpliedOrdersField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.TimeOfEventField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.TradableInstrumentIdField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.TradingVenueField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the TopOfBookMessage message from the Level1Snapshot protocol.
 *
 * <p>Generated when the top price level has been modified. There are no New, Change or Delete actions for Top Of Book: whenever the price, quantity or number of orders at the top of book changes a new message is sent. When an order book is emptied as a result of market activity, a Top Of Book message is sent with the price fields null and the aggregate quantity and number of orders zero. The TimeOfEvent is the latest incoming event timestamp regardless of the event that caused the update; for orders submitted during Pre-Open and reloaded GTC and GTD orders it reflects the uncrossing event time at market open.</p>
 */
public final class TopOfBookMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 98;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Top Of Book Message";

    /**
     * Trading venue.
     */
    private final TradingVenueField tradingVenue = new TradingVenueField();

    /**
     * Time of event.
     */
    private final TimeOfEventField timeOfEvent = new TimeOfEventField();

    /**
     * Tradable Instrument ID.
     */
    private final TradableInstrumentIdField tradableInstrumentId = new TradableInstrumentIdField();

    /**
     * Aggregated quantity available on the bid side.
     */
    private final AggregateBidVolumeField aggregateBidVolume = new AggregateBidVolumeField();

    /**
     * Aggregated quantity available on the ask side.
     */
    private final AggregateAskVolumeField aggregateAskVolume = new AggregateAskVolumeField();

    /**
     * The bid price, in implicit six decimal place format.
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * The ask price, in implicit six decimal place format.
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * The total number of bid orders in the best price level for explicit orders.
     */
    private final NumberBidExplicitOrdersField numberBidExplicitOrders = new NumberBidExplicitOrdersField();

    /**
     * The total quantity of bid orders in the best price level for explicit orders.
     */
    private final BidQtyExplicitOrdersField bidQtyExplicitOrders = new BidQtyExplicitOrdersField();

    /**
     * The total number of ask orders in the best price level for explicit orders.
     */
    private final NumberAskExplicitOrdersField numberAskExplicitOrders = new NumberAskExplicitOrdersField();

    /**
     * The total quantity of ask orders in the best price level for explicit orders.
     */
    private final AskQtyExplicitOrdersField askQtyExplicitOrders = new AskQtyExplicitOrdersField();

    /**
     * The total number of bid orders in the best price level for implied orders.
     */
    private final NumberBidImpliedOrdersField numberBidImpliedOrders = new NumberBidImpliedOrdersField();

    /**
     * The total quantity of bid orders in the best price level for implied orders.
     */
    private final BidQtyImpliedOrdersField bidQtyImpliedOrders = new BidQtyImpliedOrdersField();

    /**
     * The total number of ask orders in the best price level for implied orders.
     */
    private final NumberAskImpliedOrdersField numberAskImpliedOrders = new NumberAskImpliedOrdersField();

    /**
     * The total quantity of ask orders in the best price level for implied orders.
     */
    private final AskQtyImpliedOrdersField askQtyImpliedOrders = new AskQtyImpliedOrdersField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradingVenue, timeOfEvent, tradableInstrumentId, aggregateBidVolume, aggregateAskVolume, bidPrice, askPrice, numberBidExplicitOrders, bidQtyExplicitOrders, numberAskExplicitOrders, askQtyExplicitOrders, numberBidImpliedOrders, bidQtyImpliedOrders, numberAskImpliedOrders, askQtyImpliedOrders);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Trading venue.
     *
     * @return the TradingVenue field
     */
    public TradingVenueField tradingVenue() {
        return tradingVenue;
    }

    /**
     * Time of event.
     *
     * @return the TimeOfEvent field
     */
    public TimeOfEventField timeOfEvent() {
        return timeOfEvent;
    }

    /**
     * Tradable Instrument ID.
     *
     * @return the TradableInstrumentId field
     */
    public TradableInstrumentIdField tradableInstrumentId() {
        return tradableInstrumentId;
    }

    /**
     * Aggregated quantity available on the bid side.
     *
     * @return the AggregateBidVolume field
     */
    public AggregateBidVolumeField aggregateBidVolume() {
        return aggregateBidVolume;
    }

    /**
     * Aggregated quantity available on the ask side.
     *
     * @return the AggregateAskVolume field
     */
    public AggregateAskVolumeField aggregateAskVolume() {
        return aggregateAskVolume;
    }

    /**
     * The bid price, in implicit six decimal place format.
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * The ask price, in implicit six decimal place format.
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * The total number of bid orders in the best price level for explicit orders.
     *
     * @return the NumberBidExplicitOrders field
     */
    public NumberBidExplicitOrdersField numberBidExplicitOrders() {
        return numberBidExplicitOrders;
    }

    /**
     * The total quantity of bid orders in the best price level for explicit orders.
     *
     * @return the BidQtyExplicitOrders field
     */
    public BidQtyExplicitOrdersField bidQtyExplicitOrders() {
        return bidQtyExplicitOrders;
    }

    /**
     * The total number of ask orders in the best price level for explicit orders.
     *
     * @return the NumberAskExplicitOrders field
     */
    public NumberAskExplicitOrdersField numberAskExplicitOrders() {
        return numberAskExplicitOrders;
    }

    /**
     * The total quantity of ask orders in the best price level for explicit orders.
     *
     * @return the AskQtyExplicitOrders field
     */
    public AskQtyExplicitOrdersField askQtyExplicitOrders() {
        return askQtyExplicitOrders;
    }

    /**
     * The total number of bid orders in the best price level for implied orders.
     *
     * @return the NumberBidImpliedOrders field
     */
    public NumberBidImpliedOrdersField numberBidImpliedOrders() {
        return numberBidImpliedOrders;
    }

    /**
     * The total quantity of bid orders in the best price level for implied orders.
     *
     * @return the BidQtyImpliedOrders field
     */
    public BidQtyImpliedOrdersField bidQtyImpliedOrders() {
        return bidQtyImpliedOrders;
    }

    /**
     * The total number of ask orders in the best price level for implied orders.
     *
     * @return the NumberAskImpliedOrders field
     */
    public NumberAskImpliedOrdersField numberAskImpliedOrders() {
        return numberAskImpliedOrders;
    }

    /**
     * The total quantity of ask orders in the best price level for implied orders.
     *
     * @return the AskQtyImpliedOrders field
     */
    public AskQtyImpliedOrdersField askQtyImpliedOrders() {
        return askQtyImpliedOrders;
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
        return Optional.ofNullable(timeOfEvent.value());
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
        if (!tradingVenue.parse(data, cursor)) {
            return false;
        }
        cursor += TradingVenueField.BYTE_LENGTH;
        if (!timeOfEvent.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOfEventField.BYTE_LENGTH;
        if (!tradableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += TradableInstrumentIdField.BYTE_LENGTH;
        if (!aggregateBidVolume.parse(data, cursor)) {
            return false;
        }
        cursor += AggregateBidVolumeField.BYTE_LENGTH;
        if (!aggregateAskVolume.parse(data, cursor)) {
            return false;
        }
        cursor += AggregateAskVolumeField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        if (!numberBidExplicitOrders.parse(data, cursor)) {
            return false;
        }
        cursor += NumberBidExplicitOrdersField.BYTE_LENGTH;
        if (!bidQtyExplicitOrders.parse(data, cursor)) {
            return false;
        }
        cursor += BidQtyExplicitOrdersField.BYTE_LENGTH;
        if (!numberAskExplicitOrders.parse(data, cursor)) {
            return false;
        }
        cursor += NumberAskExplicitOrdersField.BYTE_LENGTH;
        if (!askQtyExplicitOrders.parse(data, cursor)) {
            return false;
        }
        cursor += AskQtyExplicitOrdersField.BYTE_LENGTH;
        if (!numberBidImpliedOrders.parse(data, cursor)) {
            return false;
        }
        cursor += NumberBidImpliedOrdersField.BYTE_LENGTH;
        if (!bidQtyImpliedOrders.parse(data, cursor)) {
            return false;
        }
        cursor += BidQtyImpliedOrdersField.BYTE_LENGTH;
        if (!numberAskImpliedOrders.parse(data, cursor)) {
            return false;
        }
        cursor += NumberAskImpliedOrdersField.BYTE_LENGTH;
        return askQtyImpliedOrders.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tradingVenue.encode(data, cursor);
        cursor = timeOfEvent.encode(data, cursor);
        cursor = tradableInstrumentId.encode(data, cursor);
        cursor = aggregateBidVolume.encode(data, cursor);
        cursor = aggregateAskVolume.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = numberBidExplicitOrders.encode(data, cursor);
        cursor = bidQtyExplicitOrders.encode(data, cursor);
        cursor = numberAskExplicitOrders.encode(data, cursor);
        cursor = askQtyExplicitOrders.encode(data, cursor);
        cursor = numberBidImpliedOrders.encode(data, cursor);
        cursor = bidQtyImpliedOrders.encode(data, cursor);
        cursor = numberAskImpliedOrders.encode(data, cursor);
        cursor = askQtyImpliedOrders.encode(data, cursor);
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
            case "TradingVenue" -> Optional.of(tradingVenue);
            case "TimeOfEvent" -> Optional.of(timeOfEvent);
            case "TradableInstrumentId" -> Optional.of(tradableInstrumentId);
            case "AggregateBidVolume" -> Optional.of(aggregateBidVolume);
            case "AggregateAskVolume" -> Optional.of(aggregateAskVolume);
            case "BidPrice" -> Optional.of(bidPrice);
            case "AskPrice" -> Optional.of(askPrice);
            case "NumberBidExplicitOrders" -> Optional.of(numberBidExplicitOrders);
            case "BidQtyExplicitOrders" -> Optional.of(bidQtyExplicitOrders);
            case "NumberAskExplicitOrders" -> Optional.of(numberAskExplicitOrders);
            case "AskQtyExplicitOrders" -> Optional.of(askQtyExplicitOrders);
            case "NumberBidImpliedOrders" -> Optional.of(numberBidImpliedOrders);
            case "BidQtyImpliedOrders" -> Optional.of(bidQtyImpliedOrders);
            case "NumberAskImpliedOrders" -> Optional.of(numberAskImpliedOrders);
            case "AskQtyImpliedOrders" -> Optional.of(askQtyImpliedOrders);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TopOfBookMessage message)) {
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
        if (!(other instanceof TopOfBookMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
