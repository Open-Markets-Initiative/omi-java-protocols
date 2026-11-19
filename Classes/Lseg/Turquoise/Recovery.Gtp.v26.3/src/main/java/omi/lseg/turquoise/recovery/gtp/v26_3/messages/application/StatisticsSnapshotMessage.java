package omi.lseg.turquoise.recovery.gtp.v26_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.AuctionTypeField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.BestClosingAskPriceField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.BestClosingAskSizeField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.BestClosingBidPriceField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.BestClosingBidSizeField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.ClosingPriceIndicatorField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.DynamicReferencePriceField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.FiftyTwoWeekTradeHighField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.FiftyTwoWeekTradeLowField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.IauPairedSizeField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.IauPriceField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.ImbalanceDirectionField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.ImbalanceQuantityField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.InstrumentField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.LastTradePriceField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.LastTradeQuantityField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.LastTradeTimeField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.NumberOfTradesField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.NumberOfTradesOnBookOnlyField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.OfficialClosingPriceField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.OfficialOpeningPriceField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.OpeningPriceIndicatorField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.SourceVenueField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.StaticReferencePriceField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.TimestampField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.TradeHighField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.TradeHighOnBookOnlyField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.TradeLowField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.TradeLowOnBookOnlyField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.TurnoverField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.TurnoverOnBookOnlyField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.VolumeField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.VolumeOnBookOnlyField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.VwapField;
import omi.lseg.turquoise.recovery.gtp.v26_3.fields.VwapOnBookOnlyField;
import omi.lseg.turquoise.recovery.gtp.v26_3.types.Field;
import omi.lseg.turquoise.recovery.gtp.v26_3.types.Message;
import omi.lseg.turquoise.recovery.gtp.v26_3.types.PrintOptions;

/**
 * Represents the StatisticsSnapshotMessage message from the Recovery protocol.
 *
 * <p>A snapshot of an instrument's statistics that is used for recovery</p>
 */
public final class StatisticsSnapshotMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 270;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Statistics Snapshot Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 197, 8, 205, 8, 213, 8, 221, 8 };

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * GTP Instrument identifier if Request Level is 0. Blank if not.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Mandatory field if Request Level = 1. Not considered for other Request Levels.
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * Cumulative volume of all trades for the trading day.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Cumulative volume for the trading day excluding off-book trades.
     */
    private final VolumeOnBookOnlyField volumeOnBookOnly = new VolumeOnBookOnlyField();

    /**
     * Volume weighted average price for the day for all trades.
     */
    private final VwapField vwap = new VwapField();

    /**
     * Volume weighted average price for the day excluding off-book trades.
     */
    private final VwapOnBookOnlyField vwapOnBookOnly = new VwapOnBookOnlyField();

    /**
     * Count of all trades for the day.
     */
    private final NumberOfTradesField numberOfTrades = new NumberOfTradesField();

    /**
     * Count of trades for the day excluding off-book trades.
     */
    private final NumberOfTradesOnBookOnlyField numberOfTradesOnBookOnly = new NumberOfTradesOnBookOnlyField();

    /**
     * Turnover of all trades for the day.
     */
    private final TurnoverField turnover = new TurnoverField();

    /**
     * Turnover for the day excluding off-book trades.
     */
    private final TurnoverOnBookOnlyField turnoverOnBookOnly = new TurnoverOnBookOnlyField();

    /**
     * Not Applicable to Turquoise
     */
    private final OfficialOpeningPriceField officialOpeningPrice = new OfficialOpeningPriceField();

    /**
     * Not Applicable to Turquoise
     */
    private final OfficialClosingPriceField officialClosingPrice = new OfficialClosingPriceField();

    /**
     * Current trading day high price excluding off-book trades.
     */
    private final TradeHighOnBookOnlyField tradeHighOnBookOnly = new TradeHighOnBookOnlyField();

    /**
     * Current trading day low price excluding off-book trades.
     */
    private final TradeLowOnBookOnlyField tradeLowOnBookOnly = new TradeLowOnBookOnlyField();

    /**
     * Current trading day high price of all trades.
     */
    private final TradeHighField tradeHigh = new TradeHighField();

    /**
     * Current trading day low price of all trades.
     */
    private final TradeLowField tradeLow = new TradeLowField();

    /**
     * 52-week high price of all trades.
     */
    private final FiftyTwoWeekTradeHighField fiftyTwoWeekTradeHigh = new FiftyTwoWeekTradeHighField();

    /**
     * 52-week low price of all trades.
     */
    private final FiftyTwoWeekTradeLowField fiftyTwoWeekTradeLow = new FiftyTwoWeekTradeLowField();

    /**
     * Not Applicable to Turquoise
     */
    private final OpeningPriceIndicatorField openingPriceIndicator = new OpeningPriceIndicatorField();

    /**
     * Not Applicable to Turquoise
     */
    private final ClosingPriceIndicatorField closingPriceIndicator = new ClosingPriceIndicatorField();

    /**
     * Contains the last reported Indicative Auction Crossing Price.
     */
    private final IauPriceField iauPrice = new IauPriceField();

    /**
     * Quantity to be matched at the last reported indicative price.
     */
    private final IauPairedSizeField iauPairedSize = new IauPairedSizeField();

    /**
     * Not Applicable to Turquoise
     */
    private final ImbalanceQuantityField imbalanceQuantity = new ImbalanceQuantityField();

    /**
     * Not Applicable to Turquoise
     */
    private final ImbalanceDirectionField imbalanceDirection = new ImbalanceDirectionField();

    /**
     * Not Applicable to Turquoise
     */
    private final BestClosingBidPriceField bestClosingBidPrice = new BestClosingBidPriceField();

    /**
     * Not Applicable to Turquoise
     */
    private final BestClosingAskPriceField bestClosingAskPrice = new BestClosingAskPriceField();

    /**
     * Not Applicable to Turquoise
     */
    private final BestClosingBidSizeField bestClosingBidSize = new BestClosingBidSizeField();

    /**
     * Not Applicable to Turquoise
     */
    private final BestClosingAskSizeField bestClosingAskSize = new BestClosingAskSizeField();

    /**
     * Not Applicable to Turquoise
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Executed price at which the instrument was last traded. If no relevant trades have taken place the value '0' will be populated.
     */
    private final LastTradePriceField lastTradePrice = new LastTradePriceField();

    /**
     * Executed quantity of the trade which set the Last Trade Price. If no relevant trades have taken place the value '0' will be populated.
     */
    private final LastTradeQuantityField lastTradeQuantity = new LastTradeQuantityField();

    /**
     * Transaction time of the trade which set the Last Trade Price. If no relevant trades have taken place the value '0' will be populated.
     */
    private final LastTradeTimeField lastTradeTime = new LastTradeTimeField();

    /**
     * Not Applicable to Turquoise
     */
    private final StaticReferencePriceField staticReferencePrice = new StaticReferencePriceField();

    /**
     * Not Applicable to Turquoise
     */
    private final DynamicReferencePriceField dynamicReferencePrice = new DynamicReferencePriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrument, sourceVenue, volume, volumeOnBookOnly, vwap, vwapOnBookOnly, numberOfTrades, numberOfTradesOnBookOnly, turnover, turnoverOnBookOnly, officialOpeningPrice, officialClosingPrice, tradeHighOnBookOnly, tradeLowOnBookOnly, tradeHigh, tradeLow, fiftyTwoWeekTradeHigh, fiftyTwoWeekTradeLow, openingPriceIndicator, closingPriceIndicator, iauPrice, iauPairedSize, imbalanceQuantity, imbalanceDirection, bestClosingBidPrice, bestClosingAskPrice, bestClosingBidSize, bestClosingAskSize, auctionType, lastTradePrice, lastTradeQuantity, lastTradeTime, staticReferencePrice, dynamicReferencePrice);

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
     * GTP Instrument identifier if Request Level is 0. Blank if not.
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * Mandatory field if Request Level = 1. Not considered for other Request Levels.
     *
     * @return the SourceVenue field
     */
    public SourceVenueField sourceVenue() {
        return sourceVenue;
    }

    /**
     * Cumulative volume of all trades for the trading day.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Cumulative volume for the trading day excluding off-book trades.
     *
     * @return the VolumeOnBookOnly field
     */
    public VolumeOnBookOnlyField volumeOnBookOnly() {
        return volumeOnBookOnly;
    }

    /**
     * Volume weighted average price for the day for all trades.
     *
     * @return the Vwap field
     */
    public VwapField vwap() {
        return vwap;
    }

    /**
     * Volume weighted average price for the day excluding off-book trades.
     *
     * @return the VwapOnBookOnly field
     */
    public VwapOnBookOnlyField vwapOnBookOnly() {
        return vwapOnBookOnly;
    }

    /**
     * Count of all trades for the day.
     *
     * @return the NumberOfTrades field
     */
    public NumberOfTradesField numberOfTrades() {
        return numberOfTrades;
    }

    /**
     * Count of trades for the day excluding off-book trades.
     *
     * @return the NumberOfTradesOnBookOnly field
     */
    public NumberOfTradesOnBookOnlyField numberOfTradesOnBookOnly() {
        return numberOfTradesOnBookOnly;
    }

    /**
     * Turnover of all trades for the day.
     *
     * @return the Turnover field
     */
    public TurnoverField turnover() {
        return turnover;
    }

    /**
     * Turnover for the day excluding off-book trades.
     *
     * @return the TurnoverOnBookOnly field
     */
    public TurnoverOnBookOnlyField turnoverOnBookOnly() {
        return turnoverOnBookOnly;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the OfficialOpeningPrice field
     */
    public OfficialOpeningPriceField officialOpeningPrice() {
        return officialOpeningPrice;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the OfficialClosingPrice field
     */
    public OfficialClosingPriceField officialClosingPrice() {
        return officialClosingPrice;
    }

    /**
     * Current trading day high price excluding off-book trades.
     *
     * @return the TradeHighOnBookOnly field
     */
    public TradeHighOnBookOnlyField tradeHighOnBookOnly() {
        return tradeHighOnBookOnly;
    }

    /**
     * Current trading day low price excluding off-book trades.
     *
     * @return the TradeLowOnBookOnly field
     */
    public TradeLowOnBookOnlyField tradeLowOnBookOnly() {
        return tradeLowOnBookOnly;
    }

    /**
     * Current trading day high price of all trades.
     *
     * @return the TradeHigh field
     */
    public TradeHighField tradeHigh() {
        return tradeHigh;
    }

    /**
     * Current trading day low price of all trades.
     *
     * @return the TradeLow field
     */
    public TradeLowField tradeLow() {
        return tradeLow;
    }

    /**
     * 52-week high price of all trades.
     *
     * @return the FiftyTwoWeekTradeHigh field
     */
    public FiftyTwoWeekTradeHighField fiftyTwoWeekTradeHigh() {
        return fiftyTwoWeekTradeHigh;
    }

    /**
     * 52-week low price of all trades.
     *
     * @return the FiftyTwoWeekTradeLow field
     */
    public FiftyTwoWeekTradeLowField fiftyTwoWeekTradeLow() {
        return fiftyTwoWeekTradeLow;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the OpeningPriceIndicator field
     */
    public OpeningPriceIndicatorField openingPriceIndicator() {
        return openingPriceIndicator;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the ClosingPriceIndicator field
     */
    public ClosingPriceIndicatorField closingPriceIndicator() {
        return closingPriceIndicator;
    }

    /**
     * Contains the last reported Indicative Auction Crossing Price.
     *
     * @return the IauPrice field
     */
    public IauPriceField iauPrice() {
        return iauPrice;
    }

    /**
     * Quantity to be matched at the last reported indicative price.
     *
     * @return the IauPairedSize field
     */
    public IauPairedSizeField iauPairedSize() {
        return iauPairedSize;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the ImbalanceQuantity field
     */
    public ImbalanceQuantityField imbalanceQuantity() {
        return imbalanceQuantity;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the ImbalanceDirection field
     */
    public ImbalanceDirectionField imbalanceDirection() {
        return imbalanceDirection;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the BestClosingBidPrice field
     */
    public BestClosingBidPriceField bestClosingBidPrice() {
        return bestClosingBidPrice;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the BestClosingAskPrice field
     */
    public BestClosingAskPriceField bestClosingAskPrice() {
        return bestClosingAskPrice;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the BestClosingBidSize field
     */
    public BestClosingBidSizeField bestClosingBidSize() {
        return bestClosingBidSize;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the BestClosingAskSize field
     */
    public BestClosingAskSizeField bestClosingAskSize() {
        return bestClosingAskSize;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Executed price at which the instrument was last traded. If no relevant trades have taken place the value '0' will be populated.
     *
     * @return the LastTradePrice field
     */
    public LastTradePriceField lastTradePrice() {
        return lastTradePrice;
    }

    /**
     * Executed quantity of the trade which set the Last Trade Price. If no relevant trades have taken place the value '0' will be populated.
     *
     * @return the LastTradeQuantity field
     */
    public LastTradeQuantityField lastTradeQuantity() {
        return lastTradeQuantity;
    }

    /**
     * Transaction time of the trade which set the Last Trade Price. If no relevant trades have taken place the value '0' will be populated.
     *
     * @return the LastTradeTime field
     */
    public LastTradeTimeField lastTradeTime() {
        return lastTradeTime;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the StaticReferencePrice field
     */
    public StaticReferencePriceField staticReferencePrice() {
        return staticReferencePrice;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the DynamicReferencePrice field
     */
    public DynamicReferencePriceField dynamicReferencePrice() {
        return dynamicReferencePrice;
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
        return PADDING.clone();
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
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!volumeOnBookOnly.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeOnBookOnlyField.BYTE_LENGTH;
        if (!vwap.parse(data, cursor)) {
            return false;
        }
        cursor += VwapField.BYTE_LENGTH;
        if (!vwapOnBookOnly.parse(data, cursor)) {
            return false;
        }
        cursor += VwapOnBookOnlyField.BYTE_LENGTH;
        if (!numberOfTrades.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfTradesField.BYTE_LENGTH;
        if (!numberOfTradesOnBookOnly.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfTradesOnBookOnlyField.BYTE_LENGTH;
        if (!turnover.parse(data, cursor)) {
            return false;
        }
        cursor += TurnoverField.BYTE_LENGTH;
        if (!turnoverOnBookOnly.parse(data, cursor)) {
            return false;
        }
        cursor += TurnoverOnBookOnlyField.BYTE_LENGTH;
        if (!officialOpeningPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OfficialOpeningPriceField.BYTE_LENGTH;
        if (!officialClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OfficialClosingPriceField.BYTE_LENGTH;
        if (!tradeHighOnBookOnly.parse(data, cursor)) {
            return false;
        }
        cursor += TradeHighOnBookOnlyField.BYTE_LENGTH;
        if (!tradeLowOnBookOnly.parse(data, cursor)) {
            return false;
        }
        cursor += TradeLowOnBookOnlyField.BYTE_LENGTH;
        if (!tradeHigh.parse(data, cursor)) {
            return false;
        }
        cursor += TradeHighField.BYTE_LENGTH;
        if (!tradeLow.parse(data, cursor)) {
            return false;
        }
        cursor += TradeLowField.BYTE_LENGTH;
        if (!fiftyTwoWeekTradeHigh.parse(data, cursor)) {
            return false;
        }
        cursor += FiftyTwoWeekTradeHighField.BYTE_LENGTH;
        if (!fiftyTwoWeekTradeLow.parse(data, cursor)) {
            return false;
        }
        cursor += FiftyTwoWeekTradeLowField.BYTE_LENGTH;
        if (!openingPriceIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningPriceIndicatorField.BYTE_LENGTH;
        if (!closingPriceIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingPriceIndicatorField.BYTE_LENGTH;
        if (!iauPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IauPriceField.BYTE_LENGTH;
        if (!iauPairedSize.parse(data, cursor)) {
            return false;
        }
        cursor += IauPairedSizeField.BYTE_LENGTH;
        if (!imbalanceQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceQuantityField.BYTE_LENGTH;
        if (!imbalanceDirection.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceDirectionField.BYTE_LENGTH;
        if (!bestClosingBidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BestClosingBidPriceField.BYTE_LENGTH;
        if (!bestClosingAskPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BestClosingAskPriceField.BYTE_LENGTH;
        if (!bestClosingBidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BestClosingBidSizeField.BYTE_LENGTH;
        if (!bestClosingAskSize.parse(data, cursor)) {
            return false;
        }
        cursor += BestClosingAskSizeField.BYTE_LENGTH;
        cursor += 32; // padding
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!lastTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradePriceField.BYTE_LENGTH;
        if (!lastTradeQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeQuantityField.BYTE_LENGTH;
        if (!lastTradeTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeTimeField.BYTE_LENGTH;
        if (!staticReferencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StaticReferencePriceField.BYTE_LENGTH;
        return dynamicReferencePrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = sourceVenue.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = volumeOnBookOnly.encode(data, cursor);
        cursor = vwap.encode(data, cursor);
        cursor = vwapOnBookOnly.encode(data, cursor);
        cursor = numberOfTrades.encode(data, cursor);
        cursor = numberOfTradesOnBookOnly.encode(data, cursor);
        cursor = turnover.encode(data, cursor);
        cursor = turnoverOnBookOnly.encode(data, cursor);
        cursor = officialOpeningPrice.encode(data, cursor);
        cursor = officialClosingPrice.encode(data, cursor);
        cursor = tradeHighOnBookOnly.encode(data, cursor);
        cursor = tradeLowOnBookOnly.encode(data, cursor);
        cursor = tradeHigh.encode(data, cursor);
        cursor = tradeLow.encode(data, cursor);
        cursor = fiftyTwoWeekTradeHigh.encode(data, cursor);
        cursor = fiftyTwoWeekTradeLow.encode(data, cursor);
        cursor = openingPriceIndicator.encode(data, cursor);
        cursor = closingPriceIndicator.encode(data, cursor);
        cursor = iauPrice.encode(data, cursor);
        cursor = iauPairedSize.encode(data, cursor);
        cursor = imbalanceQuantity.encode(data, cursor);
        cursor = imbalanceDirection.encode(data, cursor);
        cursor = bestClosingBidPrice.encode(data, cursor);
        cursor = bestClosingAskPrice.encode(data, cursor);
        cursor = bestClosingBidSize.encode(data, cursor);
        cursor = bestClosingAskSize.encode(data, cursor);
        if (buffer != null && buffer.length >= 229) {
            System.arraycopy(buffer, 197, data, cursor, 32); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 32, (byte) 0); // padding
        }
        cursor += 32;
        cursor = auctionType.encode(data, cursor);
        cursor = lastTradePrice.encode(data, cursor);
        cursor = lastTradeQuantity.encode(data, cursor);
        cursor = lastTradeTime.encode(data, cursor);
        cursor = staticReferencePrice.encode(data, cursor);
        cursor = dynamicReferencePrice.encode(data, cursor);
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
            case "Volume" -> Optional.of(volume);
            case "VolumeOnBookOnly" -> Optional.of(volumeOnBookOnly);
            case "Vwap" -> Optional.of(vwap);
            case "VwapOnBookOnly" -> Optional.of(vwapOnBookOnly);
            case "NumberOfTrades" -> Optional.of(numberOfTrades);
            case "NumberOfTradesOnBookOnly" -> Optional.of(numberOfTradesOnBookOnly);
            case "Turnover" -> Optional.of(turnover);
            case "TurnoverOnBookOnly" -> Optional.of(turnoverOnBookOnly);
            case "OfficialOpeningPrice" -> Optional.of(officialOpeningPrice);
            case "OfficialClosingPrice" -> Optional.of(officialClosingPrice);
            case "TradeHighOnBookOnly" -> Optional.of(tradeHighOnBookOnly);
            case "TradeLowOnBookOnly" -> Optional.of(tradeLowOnBookOnly);
            case "TradeHigh" -> Optional.of(tradeHigh);
            case "TradeLow" -> Optional.of(tradeLow);
            case "FiftyTwoWeekTradeHigh" -> Optional.of(fiftyTwoWeekTradeHigh);
            case "FiftyTwoWeekTradeLow" -> Optional.of(fiftyTwoWeekTradeLow);
            case "OpeningPriceIndicator" -> Optional.of(openingPriceIndicator);
            case "ClosingPriceIndicator" -> Optional.of(closingPriceIndicator);
            case "IauPrice" -> Optional.of(iauPrice);
            case "IauPairedSize" -> Optional.of(iauPairedSize);
            case "ImbalanceQuantity" -> Optional.of(imbalanceQuantity);
            case "ImbalanceDirection" -> Optional.of(imbalanceDirection);
            case "BestClosingBidPrice" -> Optional.of(bestClosingBidPrice);
            case "BestClosingAskPrice" -> Optional.of(bestClosingAskPrice);
            case "BestClosingBidSize" -> Optional.of(bestClosingBidSize);
            case "BestClosingAskSize" -> Optional.of(bestClosingAskSize);
            case "AuctionType" -> Optional.of(auctionType);
            case "LastTradePrice" -> Optional.of(lastTradePrice);
            case "LastTradeQuantity" -> Optional.of(lastTradeQuantity);
            case "LastTradeTime" -> Optional.of(lastTradeTime);
            case "StaticReferencePrice" -> Optional.of(staticReferencePrice);
            case "DynamicReferencePrice" -> Optional.of(dynamicReferencePrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StatisticsSnapshotMessage message)) {
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
        if (!(other instanceof StatisticsSnapshotMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
