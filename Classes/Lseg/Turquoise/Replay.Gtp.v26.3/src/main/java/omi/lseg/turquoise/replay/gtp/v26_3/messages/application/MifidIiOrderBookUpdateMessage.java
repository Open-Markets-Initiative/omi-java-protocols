package omi.lseg.turquoise.replay.gtp.v26_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.AggregatedNoOfOrdersAndQuotesField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.InstrumentField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.InstrumentIdentificationCodeField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.LevelIdentifierField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.OrderBookSideField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.OrderBookUpdateField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.PriceCurrencyField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.PriceMiFidDecimalField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.PriceNotationField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.PublicationDateAndTimeField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.QuantityField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.SourceVenueField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.TimestampField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.TradingSystemField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.TradingSystemPhaseField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.UpdateDateAndTimeField;
import omi.lseg.turquoise.replay.gtp.v26_3.fields.VenueField;
import omi.lseg.turquoise.replay.gtp.v26_3.types.Field;
import omi.lseg.turquoise.replay.gtp.v26_3.types.Message;
import omi.lseg.turquoise.replay.gtp.v26_3.types.PrintOptions;

/**
 * Represents the MifidIiOrderBookUpdateMessage message from the Replay protocol.
 *
 * <p>Aggregated order book price level update published on the MiFID II Pre Trade service</p>
 */
public final class MifidIiOrderBookUpdateMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 175;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mifid Ii Order Book Update Message";

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * GTP Instrument identifier.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Venue from which market data is received for the instrument
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * For continuous trading, position of the price point in the order book. For periodic auction, this will be set to the default value.
     */
    private final LevelIdentifierField levelIdentifier = new LevelIdentifierField();

    /**
     * For continuous trading, the date and time when the aggregated bid or offer price or volume was calculated following the receipt of an order for execution, cancellation, or modification into the trading system. For periodic auction, the date and time at which the price would best satisfy the trading algorithm.
     */
    private final UpdateDateAndTimeField updateDateAndTime = new UpdateDateAndTimeField();

    /**
     * Instrument identification number (ISIN code).
     */
    private final InstrumentIdentificationCodeField instrumentIdentificationCode = new InstrumentIdentificationCodeField();

    /**
     * For continuous trading, the side corresponding to the price level in the order book. For periodic auction trading system, this will be set to the default value.
     */
    private final OrderBookSideField orderBookSide = new OrderBookSideField();

    /**
     * For continuous trading, a price of orders aggregated at a given price level. For periodic auctions, the price at which the auction trading system would best satisfy its trading algorithm. Will be set to 0 (zero) when the order book is cleared or the indicative auction price is reset.
     */
    private final PriceMiFidDecimalField priceMiFidDecimal = new PriceMiFidDecimalField();

    /**
     * Major currency unit in which the price is expressed
     */
    private final PriceCurrencyField priceCurrency = new PriceCurrencyField();

    /**
     * Price Notation
     */
    private final PriceNotationField priceNotation = new PriceNotationField();

    /**
     * For continuous trading, number of units of the financial instruments aggregated on the price level. For periodic auction, the aggregated quantity attached to the price that would best satisfy the trading algorithm. Will be set to 0 (zero) when the order book is cleared or the indicative auction price is reset.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * For continuous trading, the number of orders aggregated at a given price level. For periodic auction and empty side during continuous trading, this will be set to 0 (zero)
     */
    private final AggregatedNoOfOrdersAndQuotesField aggregatedNoOfOrdersAndQuotes = new AggregatedNoOfOrdersAndQuotesField();

    /**
     * Identification of the trading venue through the system of which orders are advertised. In accordance with ISO 10383 segment MIC or, where the segment MIC does not exist, the operating MIC
     */
    private final VenueField venue = new VenueField();

    /**
     * Type of trading system where the transaction was executed.
     */
    private final TradingSystemField tradingSystem = new TradingSystemField();

    /**
     * Type of trading system phase where the order is advertised
     */
    private final TradingSystemPhaseField tradingSystemPhase = new TradingSystemPhaseField();

    /**
     * Date and time when the transaction was published.
     */
    private final PublicationDateAndTimeField publicationDateAndTime = new PublicationDateAndTimeField();

    /**
     * Position of the price level within the order book
     */
    private final OrderBookUpdateField orderBookUpdate = new OrderBookUpdateField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrument, sourceVenue, levelIdentifier, updateDateAndTime, instrumentIdentificationCode, orderBookSide, priceMiFidDecimal, priceCurrency, priceNotation, quantity, aggregatedNoOfOrdersAndQuotes, venue, tradingSystem, tradingSystemPhase, publicationDateAndTime, orderBookUpdate);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the message was generated.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * GTP Instrument identifier.
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * Venue from which market data is received for the instrument
     *
     * @return the SourceVenue field
     */
    public SourceVenueField sourceVenue() {
        return sourceVenue;
    }

    /**
     * For continuous trading, position of the price point in the order book. For periodic auction, this will be set to the default value.
     *
     * @return the LevelIdentifier field
     */
    public LevelIdentifierField levelIdentifier() {
        return levelIdentifier;
    }

    /**
     * For continuous trading, the date and time when the aggregated bid or offer price or volume was calculated following the receipt of an order for execution, cancellation, or modification into the trading system. For periodic auction, the date and time at which the price would best satisfy the trading algorithm.
     *
     * @return the UpdateDateAndTime field
     */
    public UpdateDateAndTimeField updateDateAndTime() {
        return updateDateAndTime;
    }

    /**
     * Instrument identification number (ISIN code).
     *
     * @return the InstrumentIdentificationCode field
     */
    public InstrumentIdentificationCodeField instrumentIdentificationCode() {
        return instrumentIdentificationCode;
    }

    /**
     * For continuous trading, the side corresponding to the price level in the order book. For periodic auction trading system, this will be set to the default value.
     *
     * @return the OrderBookSide field
     */
    public OrderBookSideField orderBookSide() {
        return orderBookSide;
    }

    /**
     * For continuous trading, a price of orders aggregated at a given price level. For periodic auctions, the price at which the auction trading system would best satisfy its trading algorithm. Will be set to 0 (zero) when the order book is cleared or the indicative auction price is reset.
     *
     * @return the PriceMiFidDecimal field
     */
    public PriceMiFidDecimalField priceMiFidDecimal() {
        return priceMiFidDecimal;
    }

    /**
     * Major currency unit in which the price is expressed
     *
     * @return the PriceCurrency field
     */
    public PriceCurrencyField priceCurrency() {
        return priceCurrency;
    }

    /**
     * Price Notation
     *
     * @return the PriceNotation field
     */
    public PriceNotationField priceNotation() {
        return priceNotation;
    }

    /**
     * For continuous trading, number of units of the financial instruments aggregated on the price level. For periodic auction, the aggregated quantity attached to the price that would best satisfy the trading algorithm. Will be set to 0 (zero) when the order book is cleared or the indicative auction price is reset.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * For continuous trading, the number of orders aggregated at a given price level. For periodic auction and empty side during continuous trading, this will be set to 0 (zero)
     *
     * @return the AggregatedNoOfOrdersAndQuotes field
     */
    public AggregatedNoOfOrdersAndQuotesField aggregatedNoOfOrdersAndQuotes() {
        return aggregatedNoOfOrdersAndQuotes;
    }

    /**
     * Identification of the trading venue through the system of which orders are advertised. In accordance with ISO 10383 segment MIC or, where the segment MIC does not exist, the operating MIC
     *
     * @return the Venue field
     */
    public VenueField venue() {
        return venue;
    }

    /**
     * Type of trading system where the transaction was executed.
     *
     * @return the TradingSystem field
     */
    public TradingSystemField tradingSystem() {
        return tradingSystem;
    }

    /**
     * Type of trading system phase where the order is advertised
     *
     * @return the TradingSystemPhase field
     */
    public TradingSystemPhaseField tradingSystemPhase() {
        return tradingSystemPhase;
    }

    /**
     * Date and time when the transaction was published.
     *
     * @return the PublicationDateAndTime field
     */
    public PublicationDateAndTimeField publicationDateAndTime() {
        return publicationDateAndTime;
    }

    /**
     * Position of the price level within the order book
     *
     * @return the OrderBookUpdate field
     */
    public OrderBookUpdateField orderBookUpdate() {
        return orderBookUpdate;
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
        return Optional.ofNullable(timestampField.value());
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!sourceVenue.parse(data, cursor)) {
            return false;
        }
        cursor += SourceVenueField.BYTE_LENGTH;
        if (!levelIdentifier.parse(data, cursor)) {
            return false;
        }
        cursor += LevelIdentifierField.BYTE_LENGTH;
        if (!updateDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += UpdateDateAndTimeField.BYTE_LENGTH;
        if (!instrumentIdentificationCode.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdentificationCodeField.BYTE_LENGTH;
        if (!orderBookSide.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookSideField.BYTE_LENGTH;
        if (!priceMiFidDecimal.parse(data, cursor)) {
            return false;
        }
        cursor += PriceMiFidDecimalField.BYTE_LENGTH;
        if (!priceCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += PriceCurrencyField.BYTE_LENGTH;
        if (!priceNotation.parse(data, cursor)) {
            return false;
        }
        cursor += PriceNotationField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!aggregatedNoOfOrdersAndQuotes.parse(data, cursor)) {
            return false;
        }
        cursor += AggregatedNoOfOrdersAndQuotesField.BYTE_LENGTH;
        if (!venue.parse(data, cursor)) {
            return false;
        }
        cursor += VenueField.BYTE_LENGTH;
        if (!tradingSystem.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSystemField.BYTE_LENGTH;
        if (!tradingSystemPhase.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSystemPhaseField.BYTE_LENGTH;
        if (!publicationDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += PublicationDateAndTimeField.BYTE_LENGTH;
        return orderBookUpdate.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = sourceVenue.encode(data, cursor);
        cursor = levelIdentifier.encode(data, cursor);
        cursor = updateDateAndTime.encode(data, cursor);
        cursor = instrumentIdentificationCode.encode(data, cursor);
        cursor = orderBookSide.encode(data, cursor);
        cursor = priceMiFidDecimal.encode(data, cursor);
        cursor = priceCurrency.encode(data, cursor);
        cursor = priceNotation.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = aggregatedNoOfOrdersAndQuotes.encode(data, cursor);
        cursor = venue.encode(data, cursor);
        cursor = tradingSystem.encode(data, cursor);
        cursor = tradingSystemPhase.encode(data, cursor);
        cursor = publicationDateAndTime.encode(data, cursor);
        cursor = orderBookUpdate.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "Instrument" -> Optional.of(instrument);
            case "SourceVenue" -> Optional.of(sourceVenue);
            case "LevelIdentifier" -> Optional.of(levelIdentifier);
            case "UpdateDateAndTime" -> Optional.of(updateDateAndTime);
            case "InstrumentIdentificationCode" -> Optional.of(instrumentIdentificationCode);
            case "OrderBookSide" -> Optional.of(orderBookSide);
            case "PriceMiFidDecimal" -> Optional.of(priceMiFidDecimal);
            case "PriceCurrency" -> Optional.of(priceCurrency);
            case "PriceNotation" -> Optional.of(priceNotation);
            case "Quantity" -> Optional.of(quantity);
            case "AggregatedNoOfOrdersAndQuotes" -> Optional.of(aggregatedNoOfOrdersAndQuotes);
            case "Venue" -> Optional.of(venue);
            case "TradingSystem" -> Optional.of(tradingSystem);
            case "TradingSystemPhase" -> Optional.of(tradingSystemPhase);
            case "PublicationDateAndTime" -> Optional.of(publicationDateAndTime);
            case "OrderBookUpdate" -> Optional.of(orderBookUpdate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MifidIiOrderBookUpdateMessage message)) {
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
        if (!(other instanceof MifidIiOrderBookUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
