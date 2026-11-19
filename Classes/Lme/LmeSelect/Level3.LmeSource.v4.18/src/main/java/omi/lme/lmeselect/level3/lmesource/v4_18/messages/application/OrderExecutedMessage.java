package omi.lme.lmeselect.level3.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.level3.lmesource.v4_18.fields.MatchIdField;
import omi.lme.lmeselect.level3.lmesource.v4_18.fields.OrderIdField;
import omi.lme.lmeselect.level3.lmesource.v4_18.fields.PriceField;
import omi.lme.lmeselect.level3.lmesource.v4_18.fields.StrategyLegCountField;
import omi.lme.lmeselect.level3.lmesource.v4_18.fields.SubTypeOfTradeField;
import omi.lme.lmeselect.level3.lmesource.v4_18.fields.TimeOfEventField;
import omi.lme.lmeselect.level3.lmesource.v4_18.fields.TradableInstrumentIdField;
import omi.lme.lmeselect.level3.lmesource.v4_18.fields.TradeBuySellField;
import omi.lme.lmeselect.level3.lmesource.v4_18.fields.TradeCancelFlagField;
import omi.lme.lmeselect.level3.lmesource.v4_18.fields.TradingVenueField;
import omi.lme.lmeselect.level3.lmesource.v4_18.fields.VolumeField;
import omi.lme.lmeselect.level3.lmesource.v4_18.groups.ExecutedLegsEntry;
import omi.lme.lmeselect.level3.lmesource.v4_18.groups.ExecutedLegsList;
import omi.lme.lmeselect.level3.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.level3.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.level3.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the OrderExecutedMessage message from the Level3 protocol.
 *
 * <p>Generated when an order is executed. Not published for an aggressing order unless it matches with a resting implied order; publishing for a resting implied order occurs only when two implied orders are matched. If an electronic cross order is matched against itself off book, the message is published with a SubTypeOfTrade of nine.</p>
 */
public final class OrderExecutedMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 53;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Executed Message";

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
     * Price of order, in implicit six decimal place format.
     */
    private final PriceField price = new PriceField();

    /**
     * Amended delta quantity.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Order ID assigned by LMEselect.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * An id that can be used to identify all orders that matched against each other.
     */
    private final MatchIdField matchId = new MatchIdField();

    /**
     * Trade Cancel Flag.
     */
    private final TradeCancelFlagField tradeCancelFlag = new TradeCancelFlagField();

    /**
     * Sub type of trade. The specification types this field UiInt8, a typo for Uint8; the stated length of one byte agrees.
     */
    private final SubTypeOfTradeField subTypeOfTrade = new SubTypeOfTradeField();

    /**
     * The side of the trade for this order.
     */
    private final TradeBuySellField tradeBuySell = new TradeBuySellField();

    /**
     * Number of legs present.
     */
    private final StrategyLegCountField strategyLegCount = new StrategyLegCountField();

    /**
     * One leg of an executed strategy trade
     */
    private final ExecutedLegsList executedLegs = new ExecutedLegsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradingVenue, timeOfEvent, tradableInstrumentId, price, volume, orderId, matchId, tradeCancelFlag, subTypeOfTrade, tradeBuySell, strategyLegCount);

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
     * Price of order, in implicit six decimal place format.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Amended delta quantity.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Order ID assigned by LMEselect.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * An id that can be used to identify all orders that matched against each other.
     *
     * @return the MatchId field
     */
    public MatchIdField matchId() {
        return matchId;
    }

    /**
     * Trade Cancel Flag.
     *
     * @return the TradeCancelFlag field
     */
    public TradeCancelFlagField tradeCancelFlag() {
        return tradeCancelFlag;
    }

    /**
     * Sub type of trade. The specification types this field UiInt8, a typo for Uint8; the stated length of one byte agrees.
     *
     * @return the SubTypeOfTrade field
     */
    public SubTypeOfTradeField subTypeOfTrade() {
        return subTypeOfTrade;
    }

    /**
     * The side of the trade for this order.
     *
     * @return the TradeBuySell field
     */
    public TradeBuySellField tradeBuySell() {
        return tradeBuySell;
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
     * One leg of an executed strategy trade
     *
     * <p>Encode writes this list's size to the StrategyLegCount field.</p>
     *
     * @return the ExecutedLegs entries
     */
    public ExecutedLegsList executedLegs() {
        return executedLegs;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + executedLegs.byteLength();
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
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
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!matchId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchIdField.BYTE_LENGTH;
        if (!tradeCancelFlag.parse(data, cursor)) {
            return false;
        }
        cursor += TradeCancelFlagField.BYTE_LENGTH;
        if (!subTypeOfTrade.parse(data, cursor)) {
            return false;
        }
        cursor += SubTypeOfTradeField.BYTE_LENGTH;
        if (!tradeBuySell.parse(data, cursor)) {
            return false;
        }
        cursor += TradeBuySellField.BYTE_LENGTH;
        if (!strategyLegCount.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyLegCountField.BYTE_LENGTH;
        if (!executedLegs.parse(data, cursor, end, strategyLegCount.value())) {
            return false;
        }
        cursor += executedLegs.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        strategyLegCount.value(executedLegs.size());
        int cursor = offset;
        cursor = tradingVenue.encode(data, cursor);
        cursor = timeOfEvent.encode(data, cursor);
        cursor = tradableInstrumentId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = matchId.encode(data, cursor);
        cursor = tradeCancelFlag.encode(data, cursor);
        cursor = subTypeOfTrade.encode(data, cursor);
        cursor = tradeBuySell.encode(data, cursor);
        cursor = strategyLegCount.encode(data, cursor);
        cursor = executedLegs.encode(data, cursor);
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
        executedLegs.clear();
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
            if (field != strategyLegCount && !field.isRecognized()) {
                return false;
            }
        }
        return executedLegs.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != strategyLegCount && !field.isValid()) {
                return false;
            }
        }
        if (!executedLegs.isValid()) {
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
        if (!tradingVenue.isDecoded()) {
            return Optional.of(tradingVenue);
        }
        if (!timeOfEvent.isDecoded()) {
            return Optional.of(timeOfEvent);
        }
        if (!tradableInstrumentId.isDecoded()) {
            return Optional.of(tradableInstrumentId);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!volume.isDecoded()) {
            return Optional.of(volume);
        }
        if (!orderId.isDecoded()) {
            return Optional.of(orderId);
        }
        if (!matchId.isDecoded()) {
            return Optional.of(matchId);
        }
        if (!tradeCancelFlag.isDecoded()) {
            return Optional.of(tradeCancelFlag);
        }
        if (!subTypeOfTrade.isDecoded()) {
            return Optional.of(subTypeOfTrade);
        }
        if (!tradeBuySell.isDecoded()) {
            return Optional.of(tradeBuySell);
        }
        if (!strategyLegCount.isDecoded()) {
            return Optional.of(strategyLegCount);
        }
        if (!executedLegs.isDecoded()) {
            return Optional.of(executedLegs.failedEntry().flatMap(ExecutedLegsEntry::failedAt).orElse(strategyLegCount));
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
            case "Price" -> Optional.of(price);
            case "Volume" -> Optional.of(volume);
            case "OrderId" -> Optional.of(orderId);
            case "MatchId" -> Optional.of(matchId);
            case "TradeCancelFlag" -> Optional.of(tradeCancelFlag);
            case "SubTypeOfTrade" -> Optional.of(subTypeOfTrade);
            case "TradeBuySell" -> Optional.of(tradeBuySell);
            case "StrategyLegCount" -> Optional.of(strategyLegCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderExecutedMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(executedLegs.diffFields(message.executedLegs));
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
            executedLegs.toFormattedString(builder, options);
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
        executedLegs.toFormattedString(builder, nested);
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
        if (!(other instanceof OrderExecutedMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && executedLegs.equals(message.executedLegs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, executedLegs);
    }
}
