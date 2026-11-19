package omi.omi.sbe.example.sbe.v2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.omi.sbe.example.sbe.v2.fields.AmendmentTypeField;
import omi.omi.sbe.example.sbe.v2.fields.CaptureTimestampField;
import omi.omi.sbe.example.sbe.v2.fields.ConsolidatedHighLowLastIndicatorField;
import omi.omi.sbe.example.sbe.v2.fields.ExchangeIdField;
import omi.omi.sbe.example.sbe.v2.fields.FinancialStatusIndicatorField;
import omi.omi.sbe.example.sbe.v2.fields.FinraTimestampField;
import omi.omi.sbe.example.sbe.v2.fields.HeldTradeIndicatorField;
import omi.omi.sbe.example.sbe.v2.fields.InstrumentIdField;
import omi.omi.sbe.example.sbe.v2.fields.InstrumentTypeField;
import omi.omi.sbe.example.sbe.v2.fields.OriginalParticipantTokenField;
import omi.omi.sbe.example.sbe.v2.fields.OriginalSaleConditionsField;
import omi.omi.sbe.example.sbe.v2.fields.OriginalSellersSaleDaysField;
import omi.omi.sbe.example.sbe.v2.fields.OriginalShortSaleRestrictionField;
import omi.omi.sbe.example.sbe.v2.fields.OriginalStopStockIndicatorField;
import omi.omi.sbe.example.sbe.v2.fields.OriginalTradeIdField;
import omi.omi.sbe.example.sbe.v2.fields.OriginalTradePriceField;
import omi.omi.sbe.example.sbe.v2.fields.OriginalTradeThroughExemptField;
import omi.omi.sbe.example.sbe.v2.fields.OriginalTradeTimestampField;
import omi.omi.sbe.example.sbe.v2.fields.OriginalTradeVolumeField;
import omi.omi.sbe.example.sbe.v2.fields.ParticipantIdField;
import omi.omi.sbe.example.sbe.v2.fields.ParticipantOpenHighLowLastIndicatorField;
import omi.omi.sbe.example.sbe.v2.fields.ParticipantTokenField;
import omi.omi.sbe.example.sbe.v2.fields.SaleConditionsField;
import omi.omi.sbe.example.sbe.v2.fields.SellersSaleDaysField;
import omi.omi.sbe.example.sbe.v2.fields.ShortSaleRestrictionField;
import omi.omi.sbe.example.sbe.v2.fields.SipTimestampField;
import omi.omi.sbe.example.sbe.v2.fields.StopStockIndicatorField;
import omi.omi.sbe.example.sbe.v2.fields.SymbolField;
import omi.omi.sbe.example.sbe.v2.fields.TradeIdField;
import omi.omi.sbe.example.sbe.v2.fields.TradePriceField;
import omi.omi.sbe.example.sbe.v2.fields.TradeReportingFacilityField;
import omi.omi.sbe.example.sbe.v2.fields.TradeThroughExemptField;
import omi.omi.sbe.example.sbe.v2.fields.TradeTimestampField;
import omi.omi.sbe.example.sbe.v2.fields.TradeVolumeField;
import omi.omi.sbe.example.sbe.v2.types.Field;
import omi.omi.sbe.example.sbe.v2.types.Message;
import omi.omi.sbe.example.sbe.v2.types.PrintOptions;

/**
 * Represents the EquityTradeMessage message from the Example protocol.
 *
 * <p>EquityTradeMessage</p>
 */
public final class EquityTradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 155;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Equity Trade Message";

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * exchangeId
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * participantId
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * tradeId
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * instrumentType
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * participantToken
     */
    private final ParticipantTokenField participantToken = new ParticipantTokenField();

    /**
     * captureTimestamp
     */
    private final CaptureTimestampField captureTimestamp = new CaptureTimestampField();

    /**
     * tradeTimestamp
     */
    private final TradeTimestampField tradeTimestamp = new TradeTimestampField();

    /**
     * sipTimestamp
     */
    private final SipTimestampField sipTimestamp = new SipTimestampField();

    /**
     * finraTimestamp
     */
    private final FinraTimestampField finraTimestamp = new FinraTimestampField();

    /**
     * originalTradeTimestamp
     */
    private final OriginalTradeTimestampField originalTradeTimestamp = new OriginalTradeTimestampField();

    /**
     * tradePrice
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * tradeVolume
     */
    private final TradeVolumeField tradeVolume = new TradeVolumeField();

    /**
     * saleConditions
     */
    private final SaleConditionsField saleConditions = new SaleConditionsField();

    /**
     * consolidatedHighLowLastIndicator
     */
    private final ConsolidatedHighLowLastIndicatorField consolidatedHighLowLastIndicator = new ConsolidatedHighLowLastIndicatorField();

    /**
     * participantOpenHighLowLastIndicator
     */
    private final ParticipantOpenHighLowLastIndicatorField participantOpenHighLowLastIndicator = new ParticipantOpenHighLowLastIndicatorField();

    /**
     * tradeThroughExempt
     */
    private final TradeThroughExemptField tradeThroughExempt = new TradeThroughExemptField();

    /**
     * shortSaleRestriction
     */
    private final ShortSaleRestrictionField shortSaleRestriction = new ShortSaleRestrictionField();

    /**
     * financialStatusIndicator
     */
    private final FinancialStatusIndicatorField financialStatusIndicator = new FinancialStatusIndicatorField();

    /**
     * heldTradeIndicator
     */
    private final HeldTradeIndicatorField heldTradeIndicator = new HeldTradeIndicatorField();

    /**
     * stopStockIndicator
     */
    private final StopStockIndicatorField stopStockIndicator = new StopStockIndicatorField();

    /**
     * sellersSaleDays
     */
    private final SellersSaleDaysField sellersSaleDays = new SellersSaleDaysField();

    /**
     * tradeReportingFacility
     */
    private final TradeReportingFacilityField tradeReportingFacility = new TradeReportingFacilityField();

    /**
     * amendmentType
     */
    private final AmendmentTypeField amendmentType = new AmendmentTypeField();

    /**
     * originalTradeId
     */
    private final OriginalTradeIdField originalTradeId = new OriginalTradeIdField();

    /**
     * originalTradePrice
     */
    private final OriginalTradePriceField originalTradePrice = new OriginalTradePriceField();

    /**
     * originalTradeVolume
     */
    private final OriginalTradeVolumeField originalTradeVolume = new OriginalTradeVolumeField();

    /**
     * originalSaleConditions
     */
    private final OriginalSaleConditionsField originalSaleConditions = new OriginalSaleConditionsField();

    /**
     * originalTradeThroughExempt
     */
    private final OriginalTradeThroughExemptField originalTradeThroughExempt = new OriginalTradeThroughExemptField();

    /**
     * originalSellersSaleDays
     */
    private final OriginalSellersSaleDaysField originalSellersSaleDays = new OriginalSellersSaleDaysField();

    /**
     * originalStopStockIndicator
     */
    private final OriginalStopStockIndicatorField originalStopStockIndicator = new OriginalStopStockIndicatorField();

    /**
     * originalShortSaleRestriction
     */
    private final OriginalShortSaleRestrictionField originalShortSaleRestriction = new OriginalShortSaleRestrictionField();

    /**
     * originalParticipantToken
     */
    private final OriginalParticipantTokenField originalParticipantToken = new OriginalParticipantTokenField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, exchangeId, symbol, participantId, tradeId, instrumentType, participantToken, captureTimestamp, tradeTimestamp, sipTimestamp, finraTimestamp, originalTradeTimestamp, tradePrice, tradeVolume, saleConditions, consolidatedHighLowLastIndicator, participantOpenHighLowLastIndicator, tradeThroughExempt, shortSaleRestriction, financialStatusIndicator, heldTradeIndicator, stopStockIndicator, sellersSaleDays, tradeReportingFacility, amendmentType, originalTradeId, originalTradePrice, originalTradeVolume, originalSaleConditions, originalTradeThroughExempt, originalSellersSaleDays, originalStopStockIndicator, originalShortSaleRestriction, originalParticipantToken);

    private byte[] buffer;

    private boolean decoded;

    /**
     * instrumentId
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * exchangeId
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * participantId
     *
     * @return the ParticipantId field
     */
    public ParticipantIdField participantId() {
        return participantId;
    }

    /**
     * tradeId
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * instrumentType
     *
     * @return the InstrumentType field
     */
    public InstrumentTypeField instrumentType() {
        return instrumentType;
    }

    /**
     * participantToken
     *
     * @return the ParticipantToken field
     */
    public ParticipantTokenField participantToken() {
        return participantToken;
    }

    /**
     * captureTimestamp
     *
     * @return the CaptureTimestamp field
     */
    public CaptureTimestampField captureTimestamp() {
        return captureTimestamp;
    }

    /**
     * tradeTimestamp
     *
     * @return the TradeTimestamp field
     */
    public TradeTimestampField tradeTimestamp() {
        return tradeTimestamp;
    }

    /**
     * sipTimestamp
     *
     * @return the SipTimestamp field
     */
    public SipTimestampField sipTimestamp() {
        return sipTimestamp;
    }

    /**
     * finraTimestamp
     *
     * @return the FinraTimestamp field
     */
    public FinraTimestampField finraTimestamp() {
        return finraTimestamp;
    }

    /**
     * originalTradeTimestamp
     *
     * @return the OriginalTradeTimestamp field
     */
    public OriginalTradeTimestampField originalTradeTimestamp() {
        return originalTradeTimestamp;
    }

    /**
     * tradePrice
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * tradeVolume
     *
     * @return the TradeVolume field
     */
    public TradeVolumeField tradeVolume() {
        return tradeVolume;
    }

    /**
     * saleConditions
     *
     * @return the SaleConditions field
     */
    public SaleConditionsField saleConditions() {
        return saleConditions;
    }

    /**
     * consolidatedHighLowLastIndicator
     *
     * @return the ConsolidatedHighLowLastIndicator field
     */
    public ConsolidatedHighLowLastIndicatorField consolidatedHighLowLastIndicator() {
        return consolidatedHighLowLastIndicator;
    }

    /**
     * participantOpenHighLowLastIndicator
     *
     * @return the ParticipantOpenHighLowLastIndicator field
     */
    public ParticipantOpenHighLowLastIndicatorField participantOpenHighLowLastIndicator() {
        return participantOpenHighLowLastIndicator;
    }

    /**
     * tradeThroughExempt
     *
     * @return the TradeThroughExempt field
     */
    public TradeThroughExemptField tradeThroughExempt() {
        return tradeThroughExempt;
    }

    /**
     * shortSaleRestriction
     *
     * @return the ShortSaleRestriction field
     */
    public ShortSaleRestrictionField shortSaleRestriction() {
        return shortSaleRestriction;
    }

    /**
     * financialStatusIndicator
     *
     * @return the FinancialStatusIndicator field
     */
    public FinancialStatusIndicatorField financialStatusIndicator() {
        return financialStatusIndicator;
    }

    /**
     * heldTradeIndicator
     *
     * @return the HeldTradeIndicator field
     */
    public HeldTradeIndicatorField heldTradeIndicator() {
        return heldTradeIndicator;
    }

    /**
     * stopStockIndicator
     *
     * @return the StopStockIndicator field
     */
    public StopStockIndicatorField stopStockIndicator() {
        return stopStockIndicator;
    }

    /**
     * sellersSaleDays
     *
     * @return the SellersSaleDays field
     */
    public SellersSaleDaysField sellersSaleDays() {
        return sellersSaleDays;
    }

    /**
     * tradeReportingFacility
     *
     * @return the TradeReportingFacility field
     */
    public TradeReportingFacilityField tradeReportingFacility() {
        return tradeReportingFacility;
    }

    /**
     * amendmentType
     *
     * @return the AmendmentType field
     */
    public AmendmentTypeField amendmentType() {
        return amendmentType;
    }

    /**
     * originalTradeId
     *
     * @return the OriginalTradeId field
     */
    public OriginalTradeIdField originalTradeId() {
        return originalTradeId;
    }

    /**
     * originalTradePrice
     *
     * @return the OriginalTradePrice field
     */
    public OriginalTradePriceField originalTradePrice() {
        return originalTradePrice;
    }

    /**
     * originalTradeVolume
     *
     * @return the OriginalTradeVolume field
     */
    public OriginalTradeVolumeField originalTradeVolume() {
        return originalTradeVolume;
    }

    /**
     * originalSaleConditions
     *
     * @return the OriginalSaleConditions field
     */
    public OriginalSaleConditionsField originalSaleConditions() {
        return originalSaleConditions;
    }

    /**
     * originalTradeThroughExempt
     *
     * @return the OriginalTradeThroughExempt field
     */
    public OriginalTradeThroughExemptField originalTradeThroughExempt() {
        return originalTradeThroughExempt;
    }

    /**
     * originalSellersSaleDays
     *
     * @return the OriginalSellersSaleDays field
     */
    public OriginalSellersSaleDaysField originalSellersSaleDays() {
        return originalSellersSaleDays;
    }

    /**
     * originalStopStockIndicator
     *
     * @return the OriginalStopStockIndicator field
     */
    public OriginalStopStockIndicatorField originalStopStockIndicator() {
        return originalStopStockIndicator;
    }

    /**
     * originalShortSaleRestriction
     *
     * @return the OriginalShortSaleRestriction field
     */
    public OriginalShortSaleRestrictionField originalShortSaleRestriction() {
        return originalShortSaleRestriction;
    }

    /**
     * originalParticipantToken
     *
     * @return the OriginalParticipantToken field
     */
    public OriginalParticipantTokenField originalParticipantToken() {
        return originalParticipantToken;
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
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!participantId.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!participantToken.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantTokenField.BYTE_LENGTH;
        if (!captureTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += CaptureTimestampField.BYTE_LENGTH;
        if (!tradeTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTimestampField.BYTE_LENGTH;
        if (!sipTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += SipTimestampField.BYTE_LENGTH;
        if (!finraTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += FinraTimestampField.BYTE_LENGTH;
        if (!originalTradeTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeTimestampField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!tradeVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TradeVolumeField.BYTE_LENGTH;
        if (!saleConditions.parse(data, cursor)) {
            return false;
        }
        cursor += SaleConditionsField.BYTE_LENGTH;
        if (!consolidatedHighLowLastIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedHighLowLastIndicatorField.BYTE_LENGTH;
        if (!participantOpenHighLowLastIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantOpenHighLowLastIndicatorField.BYTE_LENGTH;
        if (!tradeThroughExempt.parse(data, cursor)) {
            return false;
        }
        cursor += TradeThroughExemptField.BYTE_LENGTH;
        if (!shortSaleRestriction.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSaleRestrictionField.BYTE_LENGTH;
        if (!financialStatusIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialStatusIndicatorField.BYTE_LENGTH;
        if (!heldTradeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += HeldTradeIndicatorField.BYTE_LENGTH;
        if (!stopStockIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += StopStockIndicatorField.BYTE_LENGTH;
        if (!sellersSaleDays.parse(data, cursor)) {
            return false;
        }
        cursor += SellersSaleDaysField.BYTE_LENGTH;
        if (!tradeReportingFacility.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportingFacilityField.BYTE_LENGTH;
        if (!amendmentType.parse(data, cursor)) {
            return false;
        }
        cursor += AmendmentTypeField.BYTE_LENGTH;
        if (!originalTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeIdField.BYTE_LENGTH;
        if (!originalTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradePriceField.BYTE_LENGTH;
        if (!originalTradeVolume.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeVolumeField.BYTE_LENGTH;
        if (!originalSaleConditions.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalSaleConditionsField.BYTE_LENGTH;
        if (!originalTradeThroughExempt.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeThroughExemptField.BYTE_LENGTH;
        if (!originalSellersSaleDays.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalSellersSaleDaysField.BYTE_LENGTH;
        if (!originalStopStockIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalStopStockIndicatorField.BYTE_LENGTH;
        if (!originalShortSaleRestriction.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalShortSaleRestrictionField.BYTE_LENGTH;
        return originalParticipantToken.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = exchangeId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = participantId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = participantToken.encode(data, cursor);
        cursor = captureTimestamp.encode(data, cursor);
        cursor = tradeTimestamp.encode(data, cursor);
        cursor = sipTimestamp.encode(data, cursor);
        cursor = finraTimestamp.encode(data, cursor);
        cursor = originalTradeTimestamp.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = tradeVolume.encode(data, cursor);
        cursor = saleConditions.encode(data, cursor);
        cursor = consolidatedHighLowLastIndicator.encode(data, cursor);
        cursor = participantOpenHighLowLastIndicator.encode(data, cursor);
        cursor = tradeThroughExempt.encode(data, cursor);
        cursor = shortSaleRestriction.encode(data, cursor);
        cursor = financialStatusIndicator.encode(data, cursor);
        cursor = heldTradeIndicator.encode(data, cursor);
        cursor = stopStockIndicator.encode(data, cursor);
        cursor = sellersSaleDays.encode(data, cursor);
        cursor = tradeReportingFacility.encode(data, cursor);
        cursor = amendmentType.encode(data, cursor);
        cursor = originalTradeId.encode(data, cursor);
        cursor = originalTradePrice.encode(data, cursor);
        cursor = originalTradeVolume.encode(data, cursor);
        cursor = originalSaleConditions.encode(data, cursor);
        cursor = originalTradeThroughExempt.encode(data, cursor);
        cursor = originalSellersSaleDays.encode(data, cursor);
        cursor = originalStopStockIndicator.encode(data, cursor);
        cursor = originalShortSaleRestriction.encode(data, cursor);
        cursor = originalParticipantToken.encode(data, cursor);
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "ExchangeId" -> Optional.of(exchangeId);
            case "Symbol" -> Optional.of(symbol);
            case "ParticipantId" -> Optional.of(participantId);
            case "TradeId" -> Optional.of(tradeId);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "ParticipantToken" -> Optional.of(participantToken);
            case "CaptureTimestamp" -> Optional.of(captureTimestamp);
            case "TradeTimestamp" -> Optional.of(tradeTimestamp);
            case "SipTimestamp" -> Optional.of(sipTimestamp);
            case "FinraTimestamp" -> Optional.of(finraTimestamp);
            case "OriginalTradeTimestamp" -> Optional.of(originalTradeTimestamp);
            case "TradePrice" -> Optional.of(tradePrice);
            case "TradeVolume" -> Optional.of(tradeVolume);
            case "SaleConditions" -> Optional.of(saleConditions);
            case "ConsolidatedHighLowLastIndicator" -> Optional.of(consolidatedHighLowLastIndicator);
            case "ParticipantOpenHighLowLastIndicator" -> Optional.of(participantOpenHighLowLastIndicator);
            case "TradeThroughExempt" -> Optional.of(tradeThroughExempt);
            case "ShortSaleRestriction" -> Optional.of(shortSaleRestriction);
            case "FinancialStatusIndicator" -> Optional.of(financialStatusIndicator);
            case "HeldTradeIndicator" -> Optional.of(heldTradeIndicator);
            case "StopStockIndicator" -> Optional.of(stopStockIndicator);
            case "SellersSaleDays" -> Optional.of(sellersSaleDays);
            case "TradeReportingFacility" -> Optional.of(tradeReportingFacility);
            case "AmendmentType" -> Optional.of(amendmentType);
            case "OriginalTradeId" -> Optional.of(originalTradeId);
            case "OriginalTradePrice" -> Optional.of(originalTradePrice);
            case "OriginalTradeVolume" -> Optional.of(originalTradeVolume);
            case "OriginalSaleConditions" -> Optional.of(originalSaleConditions);
            case "OriginalTradeThroughExempt" -> Optional.of(originalTradeThroughExempt);
            case "OriginalSellersSaleDays" -> Optional.of(originalSellersSaleDays);
            case "OriginalStopStockIndicator" -> Optional.of(originalStopStockIndicator);
            case "OriginalShortSaleRestriction" -> Optional.of(originalShortSaleRestriction);
            case "OriginalParticipantToken" -> Optional.of(originalParticipantToken);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EquityTradeMessage message)) {
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
        if (!(other instanceof EquityTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
