package omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.BuySellField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.CancellationReasonField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.PriceField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.ProductCodeField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.RecordCountField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.RemainingRecordsField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.RingSessionField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.StrategyLegCountField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.TimeofEventField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.TradableInstrumentIdField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.TradingVenueField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.VolumeField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.groups.OrderLegsEntry;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.groups.OrderLegsList;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the MarketDataOrderMessage message from the RingDataSnapshot protocol.
 *
 * <p>Generated each time there is a new order price and when Ring prices are withdrawn or deleted. Prices can be withdrawn if they are no longer being quoted by traders in the Ring, and deleted if incorrectly entered.</p>
 */
public final class MarketDataOrderMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 45;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Data Order Message";

    /**
     * Time of event. The specification spells this field TimeofEvent, where every other message spells it TimeOfEvent; the name is carried as the specification gives it.
     */
    private final TimeofEventField timeofEvent = new TimeofEventField();

    /**
     * Tradable Instrument ID.
     */
    private final TradableInstrumentIdField tradableInstrumentId = new TradableInstrumentIdField();

    /**
     * Trading venue.
     */
    private final TradingVenueField tradingVenue = new TradingVenueField();

    /**
     * This identifies the ring trading session.
     */
    private final RingSessionField ringSession = new RingSessionField();

    /**
     * Indicates that the event relates to an order cancellation. Space if not applicable.
     */
    private final CancellationReasonField cancellationReason = new CancellationReasonField();

    /**
     * Product code.
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * Buy or Sell.
     */
    private final BuySellField buySell = new BuySellField();

    /**
     * Price of the order, in implicit six decimal place format. Can be null for a strategy market data order originating from LMEsmart.
     */
    private final PriceField price = new PriceField();

    /**
     * Order quantity. Can be null for a strategy market data order originating from LMEsmart.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Number of remaining records to be published. When the value of RemainingRecords equals RecordCount this is the last message.
     */
    private final RemainingRecordsField remainingRecords = new RemainingRecordsField();

    /**
     * The number of records in this message.
     */
    private final RecordCountField recordCount = new RecordCountField();

    /**
     * Number of legs present.
     */
    private final StrategyLegCountField strategyLegCount = new StrategyLegCountField();

    /**
     * One strategy leg record of a market data order, counted by RecordCount rather than by StrategyLegCount: the specification's length formula gives the repeat as the value of RecordCount, StrategyLegCount being the number of legs present in the strategy
     */
    private final OrderLegsList orderLegs = new OrderLegsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeofEvent, tradableInstrumentId, tradingVenue, ringSession, cancellationReason, productCode, buySell, price, volume, remainingRecords, recordCount, strategyLegCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time of event. The specification spells this field TimeofEvent, where every other message spells it TimeOfEvent; the name is carried as the specification gives it.
     *
     * @return the TimeofEvent field
     */
    public TimeofEventField timeofEvent() {
        return timeofEvent;
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
     * Trading venue.
     *
     * @return the TradingVenue field
     */
    public TradingVenueField tradingVenue() {
        return tradingVenue;
    }

    /**
     * This identifies the ring trading session.
     *
     * @return the RingSession field
     */
    public RingSessionField ringSession() {
        return ringSession;
    }

    /**
     * Indicates that the event relates to an order cancellation. Space if not applicable.
     *
     * @return the CancellationReason field
     */
    public CancellationReasonField cancellationReason() {
        return cancellationReason;
    }

    /**
     * Product code.
     *
     * @return the ProductCode field
     */
    public ProductCodeField productCode() {
        return productCode;
    }

    /**
     * Buy or Sell.
     *
     * @return the BuySell field
     */
    public BuySellField buySell() {
        return buySell;
    }

    /**
     * Price of the order, in implicit six decimal place format. Can be null for a strategy market data order originating from LMEsmart.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Order quantity. Can be null for a strategy market data order originating from LMEsmart.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Number of remaining records to be published. When the value of RemainingRecords equals RecordCount this is the last message.
     *
     * @return the RemainingRecords field
     */
    public RemainingRecordsField remainingRecords() {
        return remainingRecords;
    }

    /**
     * The number of records in this message.
     *
     * @return the RecordCount field
     */
    public RecordCountField recordCount() {
        return recordCount;
    }

    /**
     * Number of legs present.
     *
     * @return the StrategyLegCount field
     */
    public StrategyLegCountField strategyLegCount() {
        return strategyLegCount;
    }

    /**
     * One strategy leg record of a market data order, counted by RecordCount rather than by StrategyLegCount: the specification's length formula gives the repeat as the value of RecordCount, StrategyLegCount being the number of legs present in the strategy
     *
     * <p>Encode writes this list's size to the RecordCount field.</p>
     *
     * @return the OrderLegs entries
     */
    public OrderLegsList orderLegs() {
        return orderLegs;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + orderLegs.byteLength();
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
        return Optional.ofNullable(timeofEvent.value());
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
        if (!timeofEvent.parse(data, cursor)) {
            return false;
        }
        cursor += TimeofEventField.BYTE_LENGTH;
        if (!tradableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += TradableInstrumentIdField.BYTE_LENGTH;
        if (!tradingVenue.parse(data, cursor)) {
            return false;
        }
        cursor += TradingVenueField.BYTE_LENGTH;
        if (!ringSession.parse(data, cursor)) {
            return false;
        }
        cursor += RingSessionField.BYTE_LENGTH;
        if (!cancellationReason.parse(data, cursor)) {
            return false;
        }
        cursor += CancellationReasonField.BYTE_LENGTH;
        if (!productCode.parse(data, cursor)) {
            return false;
        }
        cursor += ProductCodeField.BYTE_LENGTH;
        if (!buySell.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!remainingRecords.parse(data, cursor)) {
            return false;
        }
        cursor += RemainingRecordsField.BYTE_LENGTH;
        if (!recordCount.parse(data, cursor)) {
            return false;
        }
        cursor += RecordCountField.BYTE_LENGTH;
        if (!strategyLegCount.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyLegCountField.BYTE_LENGTH;
        if (!orderLegs.parse(data, cursor, end, recordCount.value())) {
            return false;
        }
        cursor += orderLegs.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderLegs.size() > 65535) {
            throw new IllegalStateException("orderLegs holds " + orderLegs.size() + " entries, more than its count field can state");
        }
        recordCount.value(orderLegs.size());
        int cursor = offset;
        cursor = timeofEvent.encode(data, cursor);
        cursor = tradableInstrumentId.encode(data, cursor);
        cursor = tradingVenue.encode(data, cursor);
        cursor = ringSession.encode(data, cursor);
        cursor = cancellationReason.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
        cursor = buySell.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = remainingRecords.encode(data, cursor);
        cursor = recordCount.encode(data, cursor);
        cursor = strategyLegCount.encode(data, cursor);
        cursor = orderLegs.encode(data, cursor);
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
        orderLegs.clear();
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
            if (field != recordCount && !field.isRecognized()) {
                return false;
            }
        }
        return orderLegs.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != recordCount && !field.isValid()) {
                return false;
            }
        }
        if (!orderLegs.isValid()) {
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
        if (!timeofEvent.isDecoded()) {
            return Optional.of(timeofEvent);
        }
        if (!tradableInstrumentId.isDecoded()) {
            return Optional.of(tradableInstrumentId);
        }
        if (!tradingVenue.isDecoded()) {
            return Optional.of(tradingVenue);
        }
        if (!ringSession.isDecoded()) {
            return Optional.of(ringSession);
        }
        if (!cancellationReason.isDecoded()) {
            return Optional.of(cancellationReason);
        }
        if (!productCode.isDecoded()) {
            return Optional.of(productCode);
        }
        if (!buySell.isDecoded()) {
            return Optional.of(buySell);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!volume.isDecoded()) {
            return Optional.of(volume);
        }
        if (!remainingRecords.isDecoded()) {
            return Optional.of(remainingRecords);
        }
        if (!recordCount.isDecoded()) {
            return Optional.of(recordCount);
        }
        if (!strategyLegCount.isDecoded()) {
            return Optional.of(strategyLegCount);
        }
        if (!orderLegs.isDecoded()) {
            return Optional.of(orderLegs.failedEntry().flatMap(OrderLegsEntry::failedAt).orElse(recordCount));
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
            case "TimeofEvent" -> Optional.of(timeofEvent);
            case "TradableInstrumentId" -> Optional.of(tradableInstrumentId);
            case "TradingVenue" -> Optional.of(tradingVenue);
            case "RingSession" -> Optional.of(ringSession);
            case "CancellationReason" -> Optional.of(cancellationReason);
            case "ProductCode" -> Optional.of(productCode);
            case "BuySell" -> Optional.of(buySell);
            case "Price" -> Optional.of(price);
            case "Volume" -> Optional.of(volume);
            case "RemainingRecords" -> Optional.of(remainingRecords);
            case "RecordCount" -> Optional.of(recordCount);
            case "StrategyLegCount" -> Optional.of(strategyLegCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketDataOrderMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(orderLegs.diffFields(message.orderLegs));
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
            orderLegs.toFormattedString(builder, options);
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
        orderLegs.toFormattedString(builder, nested);
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
        if (!(other instanceof MarketDataOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && orderLegs.equals(message.orderLegs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, orderLegs);
    }
}
