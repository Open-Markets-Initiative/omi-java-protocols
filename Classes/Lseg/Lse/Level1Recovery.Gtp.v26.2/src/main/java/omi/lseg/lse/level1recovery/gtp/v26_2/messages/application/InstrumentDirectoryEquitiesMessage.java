package omi.lseg.lse.level1recovery.gtp.v26_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.AllowedBookTypesField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.ClearingTypeField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.CountryOfRegisterField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.CurrencyField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.DescriptionField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.DynamicCircuitBreakerTolerancesField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.ExMarkerCodeField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.ExchangeMarketSizeField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.ExpirationDateField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.InstrumentField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.IsinField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.LastPriceInPrecedingSessionDateField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.LastPriceInPrecedingSessionField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.ListingEndDateField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.ListingStartDateField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.MinimumLotMinimumExecutionSizeField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.MinimumPeakSizeMultiplierField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.PartitionIdField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.PreviousDaysClosingPriceField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.SecurityExchangeField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.SecurityMaximumSpreadField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.SecurityTypeField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.SedolField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.SegmentField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.SourceVenueField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.StaticCircuitBreakerTolerancesField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.StrikePriceField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.SymbolField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.TickIdField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.TimestampField;
import omi.lseg.lse.level1recovery.gtp.v26_2.fields.VenueInstrumentIdField;
import omi.lseg.lse.level1recovery.gtp.v26_2.types.Field;
import omi.lseg.lse.level1recovery.gtp.v26_2.types.Message;
import omi.lseg.lse.level1recovery.gtp.v26_2.types.PrintOptions;

/**
 * Represents the InstrumentDirectoryEquitiesMessage message from the Level1Recovery protocol.
 *
 * <p>Used to disseminate reference data information of equity instruments.</p>
 */
public final class InstrumentDirectoryEquitiesMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 310;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Directory Equities Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 69, 8, 93, 1, 94, 1, 143, 1, 144, 8, 152, 8, 210, 12, 222, 1, 223, 8, 231, 8, 240, 8, 248, 8, 256, 4, 260, 2 };

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * GTP Instrument identifier if Request Level is 0. Blank if not.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * ISIN code of the instrument.
     */
    private final IsinField isin = new IsinField();

    /**
     * SEDOL code of the instrument.
     */
    private final SedolField sedol = new SedolField();

    /**
     * Defines the order-book types that are allowed for the instrument
     */
    private final AllowedBookTypesField allowedBookTypes = new AllowedBookTypesField();

    /**
     * Mandatory field if Request Level = 1. Not considered for other Request Levels.
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * Instrument identifier used by the source venue.
     */
    private final VenueInstrumentIdField venueInstrumentId = new VenueInstrumentIdField();

    /**
     * Segment the instrument is assigned to.
     */
    private final SegmentField segment = new SegmentField();

    /**
     * Currency code as per ISO 4217.
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * The tick structure applicable for the instrument.
     */
    private final TickIdField tickId = new TickIdField();

    /**
     * Closing price reported for the previous trading day.
     */
    private final PreviousDaysClosingPriceField previousDaysClosingPrice = new PreviousDaysClosingPriceField();

    /**
     * Dynamic Circuit Breaker Tolerance (%) of the instrument.
     */
    private final DynamicCircuitBreakerTolerancesField dynamicCircuitBreakerTolerances = new DynamicCircuitBreakerTolerancesField();

    /**
     * Static Circuit Breaker Tolerance (%) of the instrument.
     */
    private final StaticCircuitBreakerTolerancesField staticCircuitBreakerTolerances = new StaticCircuitBreakerTolerancesField();

    /**
     * Expiration date of the instrument.
     */
    private final ExpirationDateField expirationDate = new ExpirationDateField();

    /**
     * Listing start date of the instrument.
     */
    private final ListingStartDateField listingStartDate = new ListingStartDateField();

    /**
     * Listing end date of the instrument.
     */
    private final ListingEndDateField listingEndDate = new ListingEndDateField();

    /**
     * Indicates the minimum quantity/nominal value tradable on the market for a security.
     */
    private final MinimumLotMinimumExecutionSizeField minimumLotMinimumExecutionSize = new MinimumLotMinimumExecutionSizeField();

    /**
     * Last execution price in a session prior to the current trading day.
     */
    private final LastPriceInPrecedingSessionField lastPriceInPrecedingSession = new LastPriceInPrecedingSessionField();

    /**
     * Last execution date in a session prior to current trading day.
     */
    private final LastPriceInPrecedingSessionDateField lastPriceInPrecedingSessionDate = new LastPriceInPrecedingSessionDateField();

    /**
     * The value of an Ex-Marker pertaining to a tradable instrument.
     */
    private final ExMarkerCodeField exMarkerCode = new ExMarkerCodeField();

    /**
     * Type of security.
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * Country of Register.
     */
    private final CountryOfRegisterField countryOfRegister = new CountryOfRegisterField();

    /**
     * The Exchange Market Size (EMS) is set to show the minimum size a market maker must quote in an individual security for all executable and non executable quotes.
     */
    private final ExchangeMarketSizeField exchangeMarketSize = new ExchangeMarketSizeField();

    /**
     * Used to specify the minimum size of an iceberg peak for an instrument in conjunction with EMS.
     */
    private final MinimumPeakSizeMultiplierField minimumPeakSizeMultiplier = new MinimumPeakSizeMultiplierField();

    /**
     * This field informs Participants of the maximum spread allowable for an instrument when submitting quote messages, calculated as a percentage of mid-price.
     */
    private final SecurityMaximumSpreadField securityMaximumSpread = new SecurityMaximumSpreadField();

    /**
     * Indicates the settlement mode of the security.
     */
    private final ClearingTypeField clearingType = new ClearingTypeField();

    /**
     * Strike Price (exercise price for warrants).
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Not Applicable to LSE.
     */
    private final SecurityExchangeField securityExchange = new SecurityExchangeField();

    /**
     * Trading System's partition in which the instrument is traded.
     */
    private final PartitionIdField partitionId = new PartitionIdField();

    /**
     * Symbol of the instrument.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Description of the instrument.
     */
    private final DescriptionField description = new DescriptionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrument, isin, sedol, allowedBookTypes, sourceVenue, venueInstrumentId, segment, currency, tickId, previousDaysClosingPrice, dynamicCircuitBreakerTolerances, staticCircuitBreakerTolerances, expirationDate, listingStartDate, listingEndDate, minimumLotMinimumExecutionSize, lastPriceInPrecedingSession, lastPriceInPrecedingSessionDate, exMarkerCode, securityType, countryOfRegister, exchangeMarketSize, minimumPeakSizeMultiplier, securityMaximumSpread, clearingType, strikePrice, securityExchange, partitionId, symbol, description);

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
     * ISIN code of the instrument.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * SEDOL code of the instrument.
     *
     * @return the Sedol field
     */
    public SedolField sedol() {
        return sedol;
    }

    /**
     * Defines the order-book types that are allowed for the instrument
     *
     * @return the AllowedBookTypes field
     */
    public AllowedBookTypesField allowedBookTypes() {
        return allowedBookTypes;
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
     * Instrument identifier used by the source venue.
     *
     * @return the VenueInstrumentId field
     */
    public VenueInstrumentIdField venueInstrumentId() {
        return venueInstrumentId;
    }

    /**
     * Segment the instrument is assigned to.
     *
     * @return the Segment field
     */
    public SegmentField segment() {
        return segment;
    }

    /**
     * Currency code as per ISO 4217.
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * The tick structure applicable for the instrument.
     *
     * @return the TickId field
     */
    public TickIdField tickId() {
        return tickId;
    }

    /**
     * Closing price reported for the previous trading day.
     *
     * @return the PreviousDaysClosingPrice field
     */
    public PreviousDaysClosingPriceField previousDaysClosingPrice() {
        return previousDaysClosingPrice;
    }

    /**
     * Dynamic Circuit Breaker Tolerance (%) of the instrument.
     *
     * @return the DynamicCircuitBreakerTolerances field
     */
    public DynamicCircuitBreakerTolerancesField dynamicCircuitBreakerTolerances() {
        return dynamicCircuitBreakerTolerances;
    }

    /**
     * Static Circuit Breaker Tolerance (%) of the instrument.
     *
     * @return the StaticCircuitBreakerTolerances field
     */
    public StaticCircuitBreakerTolerancesField staticCircuitBreakerTolerances() {
        return staticCircuitBreakerTolerances;
    }

    /**
     * Expiration date of the instrument.
     *
     * @return the ExpirationDate field
     */
    public ExpirationDateField expirationDate() {
        return expirationDate;
    }

    /**
     * Listing start date of the instrument.
     *
     * @return the ListingStartDate field
     */
    public ListingStartDateField listingStartDate() {
        return listingStartDate;
    }

    /**
     * Listing end date of the instrument.
     *
     * @return the ListingEndDate field
     */
    public ListingEndDateField listingEndDate() {
        return listingEndDate;
    }

    /**
     * Indicates the minimum quantity/nominal value tradable on the market for a security.
     *
     * @return the MinimumLotMinimumExecutionSize field
     */
    public MinimumLotMinimumExecutionSizeField minimumLotMinimumExecutionSize() {
        return minimumLotMinimumExecutionSize;
    }

    /**
     * Last execution price in a session prior to the current trading day.
     *
     * @return the LastPriceInPrecedingSession field
     */
    public LastPriceInPrecedingSessionField lastPriceInPrecedingSession() {
        return lastPriceInPrecedingSession;
    }

    /**
     * Last execution date in a session prior to current trading day.
     *
     * @return the LastPriceInPrecedingSessionDate field
     */
    public LastPriceInPrecedingSessionDateField lastPriceInPrecedingSessionDate() {
        return lastPriceInPrecedingSessionDate;
    }

    /**
     * The value of an Ex-Marker pertaining to a tradable instrument.
     *
     * @return the ExMarkerCode field
     */
    public ExMarkerCodeField exMarkerCode() {
        return exMarkerCode;
    }

    /**
     * Type of security.
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * Country of Register.
     *
     * @return the CountryOfRegister field
     */
    public CountryOfRegisterField countryOfRegister() {
        return countryOfRegister;
    }

    /**
     * The Exchange Market Size (EMS) is set to show the minimum size a market maker must quote in an individual security for all executable and non executable quotes.
     *
     * @return the ExchangeMarketSize field
     */
    public ExchangeMarketSizeField exchangeMarketSize() {
        return exchangeMarketSize;
    }

    /**
     * Used to specify the minimum size of an iceberg peak for an instrument in conjunction with EMS.
     *
     * @return the MinimumPeakSizeMultiplier field
     */
    public MinimumPeakSizeMultiplierField minimumPeakSizeMultiplier() {
        return minimumPeakSizeMultiplier;
    }

    /**
     * This field informs Participants of the maximum spread allowable for an instrument when submitting quote messages, calculated as a percentage of mid-price.
     *
     * @return the SecurityMaximumSpread field
     */
    public SecurityMaximumSpreadField securityMaximumSpread() {
        return securityMaximumSpread;
    }

    /**
     * Indicates the settlement mode of the security.
     *
     * @return the ClearingType field
     */
    public ClearingTypeField clearingType() {
        return clearingType;
    }

    /**
     * Strike Price (exercise price for warrants).
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Not Applicable to LSE.
     *
     * @return the SecurityExchange field
     */
    public SecurityExchangeField securityExchange() {
        return securityExchange;
    }

    /**
     * Trading System's partition in which the instrument is traded.
     *
     * @return the PartitionId field
     */
    public PartitionIdField partitionId() {
        return partitionId;
    }

    /**
     * Symbol of the instrument.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Description of the instrument.
     *
     * @return the Description field
     */
    public DescriptionField description() {
        return description;
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
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!sedol.parse(data, cursor)) {
            return false;
        }
        cursor += SedolField.BYTE_LENGTH;
        if (!allowedBookTypes.parse(data, cursor)) {
            return false;
        }
        cursor += AllowedBookTypesField.BYTE_LENGTH;
        if (!sourceVenue.parse(data, cursor)) {
            return false;
        }
        cursor += SourceVenueField.BYTE_LENGTH;
        if (!venueInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += VenueInstrumentIdField.BYTE_LENGTH;
        if (!segment.parse(data, cursor)) {
            return false;
        }
        cursor += SegmentField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!tickId.parse(data, cursor)) {
            return false;
        }
        cursor += TickIdField.BYTE_LENGTH;
        if (!previousDaysClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousDaysClosingPriceField.BYTE_LENGTH;
        cursor += 8; // padding
        if (!dynamicCircuitBreakerTolerances.parse(data, cursor)) {
            return false;
        }
        cursor += DynamicCircuitBreakerTolerancesField.BYTE_LENGTH;
        if (!staticCircuitBreakerTolerances.parse(data, cursor)) {
            return false;
        }
        cursor += StaticCircuitBreakerTolerancesField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!expirationDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationDateField.BYTE_LENGTH;
        if (!listingStartDate.parse(data, cursor)) {
            return false;
        }
        cursor += ListingStartDateField.BYTE_LENGTH;
        if (!listingEndDate.parse(data, cursor)) {
            return false;
        }
        cursor += ListingEndDateField.BYTE_LENGTH;
        if (!minimumLotMinimumExecutionSize.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumLotMinimumExecutionSizeField.BYTE_LENGTH;
        if (!lastPriceInPrecedingSession.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceInPrecedingSessionField.BYTE_LENGTH;
        if (!lastPriceInPrecedingSessionDate.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceInPrecedingSessionDateField.BYTE_LENGTH;
        cursor += 17; // padding
        if (!exMarkerCode.parse(data, cursor)) {
            return false;
        }
        cursor += ExMarkerCodeField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!countryOfRegister.parse(data, cursor)) {
            return false;
        }
        cursor += CountryOfRegisterField.BYTE_LENGTH;
        if (!exchangeMarketSize.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeMarketSizeField.BYTE_LENGTH;
        if (!minimumPeakSizeMultiplier.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumPeakSizeMultiplierField.BYTE_LENGTH;
        if (!securityMaximumSpread.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityMaximumSpreadField.BYTE_LENGTH;
        if (!clearingType.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingTypeField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!securityExchange.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityExchangeField.BYTE_LENGTH;
        cursor += 29; // padding
        if (!partitionId.parse(data, cursor)) {
            return false;
        }
        cursor += PartitionIdField.BYTE_LENGTH;
        cursor += 22; // padding
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        return description.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = isin.encode(data, cursor);
        cursor = sedol.encode(data, cursor);
        cursor = allowedBookTypes.encode(data, cursor);
        cursor = sourceVenue.encode(data, cursor);
        cursor = venueInstrumentId.encode(data, cursor);
        cursor = segment.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = tickId.encode(data, cursor);
        cursor = previousDaysClosingPrice.encode(data, cursor);
        if (buffer != null && buffer.length >= 77) {
            System.arraycopy(buffer, 69, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = dynamicCircuitBreakerTolerances.encode(data, cursor);
        cursor = staticCircuitBreakerTolerances.encode(data, cursor);
        if (buffer != null && buffer.length >= 95) {
            System.arraycopy(buffer, 93, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = expirationDate.encode(data, cursor);
        cursor = listingStartDate.encode(data, cursor);
        cursor = listingEndDate.encode(data, cursor);
        cursor = minimumLotMinimumExecutionSize.encode(data, cursor);
        cursor = lastPriceInPrecedingSession.encode(data, cursor);
        cursor = lastPriceInPrecedingSessionDate.encode(data, cursor);
        if (buffer != null && buffer.length >= 160) {
            System.arraycopy(buffer, 143, data, cursor, 17); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 17, (byte) 0); // padding
        }
        cursor += 17;
        cursor = exMarkerCode.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = countryOfRegister.encode(data, cursor);
        cursor = exchangeMarketSize.encode(data, cursor);
        cursor = minimumPeakSizeMultiplier.encode(data, cursor);
        cursor = securityMaximumSpread.encode(data, cursor);
        cursor = clearingType.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = securityExchange.encode(data, cursor);
        if (buffer != null && buffer.length >= 239) {
            System.arraycopy(buffer, 210, data, cursor, 29); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 29, (byte) 0); // padding
        }
        cursor += 29;
        cursor = partitionId.encode(data, cursor);
        if (buffer != null && buffer.length >= 262) {
            System.arraycopy(buffer, 240, data, cursor, 22); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 22, (byte) 0); // padding
        }
        cursor += 22;
        cursor = symbol.encode(data, cursor);
        cursor = description.encode(data, cursor);
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
            case "Isin" -> Optional.of(isin);
            case "Sedol" -> Optional.of(sedol);
            case "AllowedBookTypes" -> Optional.of(allowedBookTypes);
            case "SourceVenue" -> Optional.of(sourceVenue);
            case "VenueInstrumentId" -> Optional.of(venueInstrumentId);
            case "Segment" -> Optional.of(segment);
            case "Currency" -> Optional.of(currency);
            case "TickId" -> Optional.of(tickId);
            case "PreviousDaysClosingPrice" -> Optional.of(previousDaysClosingPrice);
            case "DynamicCircuitBreakerTolerances" -> Optional.of(dynamicCircuitBreakerTolerances);
            case "StaticCircuitBreakerTolerances" -> Optional.of(staticCircuitBreakerTolerances);
            case "ExpirationDate" -> Optional.of(expirationDate);
            case "ListingStartDate" -> Optional.of(listingStartDate);
            case "ListingEndDate" -> Optional.of(listingEndDate);
            case "MinimumLotMinimumExecutionSize" -> Optional.of(minimumLotMinimumExecutionSize);
            case "LastPriceInPrecedingSession" -> Optional.of(lastPriceInPrecedingSession);
            case "LastPriceInPrecedingSessionDate" -> Optional.of(lastPriceInPrecedingSessionDate);
            case "ExMarkerCode" -> Optional.of(exMarkerCode);
            case "SecurityType" -> Optional.of(securityType);
            case "CountryOfRegister" -> Optional.of(countryOfRegister);
            case "ExchangeMarketSize" -> Optional.of(exchangeMarketSize);
            case "MinimumPeakSizeMultiplier" -> Optional.of(minimumPeakSizeMultiplier);
            case "SecurityMaximumSpread" -> Optional.of(securityMaximumSpread);
            case "ClearingType" -> Optional.of(clearingType);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "SecurityExchange" -> Optional.of(securityExchange);
            case "PartitionId" -> Optional.of(partitionId);
            case "Symbol" -> Optional.of(symbol);
            case "Description" -> Optional.of(description);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InstrumentDirectoryEquitiesMessage message)) {
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
        if (!(other instanceof InstrumentDirectoryEquitiesMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
