package omi.lme.lmeselect.level2.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.MatchIdField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.MatchedTimeField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.PriceField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.RecordCountField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.RemainingRecordsField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.RingSessionField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.StrategyLegCountField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.SubTypeOfTradeField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.TimeOfEventField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.TradableInstrumentIdField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.TradeAtReferencePriceTypeField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.TradeCancelFlagField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.TradingVenueField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.VolumeField;
import omi.lme.lmeselect.level2.lmesource.v4_18.groups.TradeLegsEntry;
import omi.lme.lmeselect.level2.lmesource.v4_18.groups.TradeLegsList;
import omi.lme.lmeselect.level2.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.level2.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.level2.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the MarketDataTradeMessage message from the Level2 protocol.
 *
 * <p>Generated each time a trade has been performed in the Electronic, Inter Office or Ring venues. When an incoming order matches against multiple resting orders there is one Market Data Trade published for each matched trade.</p>
 */
public final class MarketDataTradeMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 59;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Data Trade Message";

    /**
     * Time of event.
     */
    private final TimeOfEventField timeOfEvent = new TimeOfEventField();

    /**
     * Tradable Instrument ID.
     */
    private final TradableInstrumentIdField tradableInstrumentId = new TradableInstrumentIdField();

    /**
     * Trading venue.
     */
    private final TradingVenueField tradingVenue = new TradingVenueField();

    /**
     * Time the trade was matched in LMEsmart. Null until such time.
     */
    private final MatchedTimeField matchedTime = new MatchedTimeField();

    /**
     * This identifies the ring trading session. Space if not applicable.
     */
    private final RingSessionField ringSession = new RingSessionField();

    /**
     * Trade Cancel Flag.
     */
    private final TradeCancelFlagField tradeCancelFlag = new TradeCancelFlagField();

    /**
     * The price of the trade. For TaS and TaR either the differential or the substituted price. Null for a strategy from a non-electronic venue. Implicit six decimal place format.
     */
    private final PriceField price = new PriceField();

    /**
     * Amended delta quantity.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Assigned trade match identifier for the matched trade.
     */
    private final MatchIdField matchId = new MatchIdField();

    /**
     * For a TaR, indicates whether the price is differential or substituted. Defaults to space, meaning not applicable.
     */
    private final TradeAtReferencePriceTypeField tradeAtReferencePriceType = new TradeAtReferencePriceTypeField();

    /**
     * Sub type of trade.
     */
    private final SubTypeOfTradeField subTypeOfTrade = new SubTypeOfTradeField();

    /**
     * Number of leg records still to be published for this trade.
     */
    private final RemainingRecordsField remainingRecords = new RemainingRecordsField();

    /**
     * The number of leg records carried by this message.
     */
    private final RecordCountField recordCount = new RecordCountField();

    /**
     * Number of legs of the strategy.
     */
    private final StrategyLegCountField strategyLegCount = new StrategyLegCountField();

    /**
     * One leg record of a strategy trade, counted by RecordCount rather than by StrategyLegCount, which states the total legs of the strategy
     */
    private final TradeLegsList tradeLegs = new TradeLegsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOfEvent, tradableInstrumentId, tradingVenue, matchedTime, ringSession, tradeCancelFlag, price, volume, matchId, tradeAtReferencePriceType, subTypeOfTrade, remainingRecords, recordCount, strategyLegCount);

    private byte[] buffer;

    private boolean decoded;

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
     * Trading venue.
     *
     * @return the TradingVenue field
     */
    public TradingVenueField tradingVenue() {
        return tradingVenue;
    }

    /**
     * Time the trade was matched in LMEsmart. Null until such time.
     *
     * @return the MatchedTime field
     */
    public MatchedTimeField matchedTime() {
        return matchedTime;
    }

    /**
     * This identifies the ring trading session. Space if not applicable.
     *
     * @return the RingSession field
     */
    public RingSessionField ringSession() {
        return ringSession;
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
     * The price of the trade. For TaS and TaR either the differential or the substituted price. Null for a strategy from a non-electronic venue. Implicit six decimal place format.
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
     * Assigned trade match identifier for the matched trade.
     *
     * @return the MatchId field
     */
    public MatchIdField matchId() {
        return matchId;
    }

    /**
     * For a TaR, indicates whether the price is differential or substituted. Defaults to space, meaning not applicable.
     *
     * @return the TradeAtReferencePriceType field
     */
    public TradeAtReferencePriceTypeField tradeAtReferencePriceType() {
        return tradeAtReferencePriceType;
    }

    /**
     * Sub type of trade.
     *
     * @return the SubTypeOfTrade field
     */
    public SubTypeOfTradeField subTypeOfTrade() {
        return subTypeOfTrade;
    }

    /**
     * Number of leg records still to be published for this trade.
     *
     * @return the RemainingRecords field
     */
    public RemainingRecordsField remainingRecords() {
        return remainingRecords;
    }

    /**
     * The number of leg records carried by this message.
     *
     * @return the RecordCount field
     */
    public RecordCountField recordCount() {
        return recordCount;
    }

    /**
     * Number of legs of the strategy.
     *
     * @return the StrategyLegCount field
     */
    public StrategyLegCountField strategyLegCount() {
        return strategyLegCount;
    }

    /**
     * One leg record of a strategy trade, counted by RecordCount rather than by StrategyLegCount, which states the total legs of the strategy
     *
     * <p>Encode writes this list's size to the RecordCount field.</p>
     *
     * @return the TradeLegs entries
     */
    public TradeLegsList tradeLegs() {
        return tradeLegs;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + tradeLegs.byteLength();
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
        if (!timeOfEvent.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOfEventField.BYTE_LENGTH;
        if (!tradableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += TradableInstrumentIdField.BYTE_LENGTH;
        if (!tradingVenue.parse(data, cursor)) {
            return false;
        }
        cursor += TradingVenueField.BYTE_LENGTH;
        if (!matchedTime.parse(data, cursor)) {
            return false;
        }
        cursor += MatchedTimeField.BYTE_LENGTH;
        if (!ringSession.parse(data, cursor)) {
            return false;
        }
        cursor += RingSessionField.BYTE_LENGTH;
        if (!tradeCancelFlag.parse(data, cursor)) {
            return false;
        }
        cursor += TradeCancelFlagField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!matchId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchIdField.BYTE_LENGTH;
        if (!tradeAtReferencePriceType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeAtReferencePriceTypeField.BYTE_LENGTH;
        if (!subTypeOfTrade.parse(data, cursor)) {
            return false;
        }
        cursor += SubTypeOfTradeField.BYTE_LENGTH;
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
        if (!tradeLegs.parse(data, cursor, end, recordCount.value())) {
            return false;
        }
        cursor += tradeLegs.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (tradeLegs.size() > 65535) {
            throw new IllegalStateException("tradeLegs holds " + tradeLegs.size() + " entries, more than its count field can state");
        }
        recordCount.value(tradeLegs.size());
        int cursor = offset;
        cursor = timeOfEvent.encode(data, cursor);
        cursor = tradableInstrumentId.encode(data, cursor);
        cursor = tradingVenue.encode(data, cursor);
        cursor = matchedTime.encode(data, cursor);
        cursor = ringSession.encode(data, cursor);
        cursor = tradeCancelFlag.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = matchId.encode(data, cursor);
        cursor = tradeAtReferencePriceType.encode(data, cursor);
        cursor = subTypeOfTrade.encode(data, cursor);
        cursor = remainingRecords.encode(data, cursor);
        cursor = recordCount.encode(data, cursor);
        cursor = strategyLegCount.encode(data, cursor);
        cursor = tradeLegs.encode(data, cursor);
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
        tradeLegs.clear();
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
        return tradeLegs.isRecognized();
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
        if (!tradeLegs.isValid()) {
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
        if (!timeOfEvent.isDecoded()) {
            return Optional.of(timeOfEvent);
        }
        if (!tradableInstrumentId.isDecoded()) {
            return Optional.of(tradableInstrumentId);
        }
        if (!tradingVenue.isDecoded()) {
            return Optional.of(tradingVenue);
        }
        if (!matchedTime.isDecoded()) {
            return Optional.of(matchedTime);
        }
        if (!ringSession.isDecoded()) {
            return Optional.of(ringSession);
        }
        if (!tradeCancelFlag.isDecoded()) {
            return Optional.of(tradeCancelFlag);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!volume.isDecoded()) {
            return Optional.of(volume);
        }
        if (!matchId.isDecoded()) {
            return Optional.of(matchId);
        }
        if (!tradeAtReferencePriceType.isDecoded()) {
            return Optional.of(tradeAtReferencePriceType);
        }
        if (!subTypeOfTrade.isDecoded()) {
            return Optional.of(subTypeOfTrade);
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
        if (!tradeLegs.isDecoded()) {
            return Optional.of(tradeLegs.failedEntry().flatMap(TradeLegsEntry::failedAt).orElse(recordCount));
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
            case "TimeOfEvent" -> Optional.of(timeOfEvent);
            case "TradableInstrumentId" -> Optional.of(tradableInstrumentId);
            case "TradingVenue" -> Optional.of(tradingVenue);
            case "MatchedTime" -> Optional.of(matchedTime);
            case "RingSession" -> Optional.of(ringSession);
            case "TradeCancelFlag" -> Optional.of(tradeCancelFlag);
            case "Price" -> Optional.of(price);
            case "Volume" -> Optional.of(volume);
            case "MatchId" -> Optional.of(matchId);
            case "TradeAtReferencePriceType" -> Optional.of(tradeAtReferencePriceType);
            case "SubTypeOfTrade" -> Optional.of(subTypeOfTrade);
            case "RemainingRecords" -> Optional.of(remainingRecords);
            case "RecordCount" -> Optional.of(recordCount);
            case "StrategyLegCount" -> Optional.of(strategyLegCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketDataTradeMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(tradeLegs.diffFields(message.tradeLegs));
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
            tradeLegs.toFormattedString(builder, options);
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
        tradeLegs.toFormattedString(builder, nested);
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
        if (!(other instanceof MarketDataTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && tradeLegs.equals(message.tradeLegs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, tradeLegs);
    }
}
