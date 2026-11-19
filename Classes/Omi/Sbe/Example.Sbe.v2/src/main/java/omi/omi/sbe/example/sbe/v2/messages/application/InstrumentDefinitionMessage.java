package omi.omi.sbe.example.sbe.v2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.omi.sbe.example.sbe.v2.fields.AdjustedPocPriceField;
import omi.omi.sbe.example.sbe.v2.fields.DirectBookDepthField;
import omi.omi.sbe.example.sbe.v2.fields.ExchangeIdField;
import omi.omi.sbe.example.sbe.v2.fields.ImpliedBookDepthField;
import omi.omi.sbe.example.sbe.v2.fields.InstrumentIdField;
import omi.omi.sbe.example.sbe.v2.fields.InstrumentTypeField;
import omi.omi.sbe.example.sbe.v2.fields.LuldTierField;
import omi.omi.sbe.example.sbe.v2.fields.MatchAlgorithmField;
import omi.omi.sbe.example.sbe.v2.fields.MinPriceIncrementField;
import omi.omi.sbe.example.sbe.v2.fields.NormalizationTermField;
import omi.omi.sbe.example.sbe.v2.fields.OperationalHaltStatusField;
import omi.omi.sbe.example.sbe.v2.fields.ReasonField;
import omi.omi.sbe.example.sbe.v2.fields.RetailLiquidityIndicatorField;
import omi.omi.sbe.example.sbe.v2.fields.RoundLotSizeField;
import omi.omi.sbe.example.sbe.v2.fields.SecurityDirectoryFlagsField;
import omi.omi.sbe.example.sbe.v2.fields.SecurityEventField;
import omi.omi.sbe.example.sbe.v2.fields.SecurityExchangeField;
import omi.omi.sbe.example.sbe.v2.fields.SecurityGroupCodeField;
import omi.omi.sbe.example.sbe.v2.fields.SecurityIdField;
import omi.omi.sbe.example.sbe.v2.fields.ShortSaleDetailField;
import omi.omi.sbe.example.sbe.v2.fields.ShortSalePriceTestStatusField;
import omi.omi.sbe.example.sbe.v2.fields.SymbolField;
import omi.omi.sbe.example.sbe.v2.fields.TimestampField;
import omi.omi.sbe.example.sbe.v2.fields.TradingReferencePriceField;
import omi.omi.sbe.example.sbe.v2.fields.TradingStatusField;
import omi.omi.sbe.example.sbe.v2.fields.UnderlyingInstrumentIdField;
import omi.omi.sbe.example.sbe.v2.fields.UnderlyingSecurityIdField;
import omi.omi.sbe.example.sbe.v2.structs.InstrumentDefinitionMessageNoLegsGroups;
import omi.omi.sbe.example.sbe.v2.structs.OptionKey;
import omi.omi.sbe.example.sbe.v2.types.Field;
import omi.omi.sbe.example.sbe.v2.types.Message;
import omi.omi.sbe.example.sbe.v2.types.PrintOptions;

/**
 * Represents the InstrumentDefinitionMessage message from the Example protocol.
 *
 * <p>InstrumentDefinitionMessage</p>
 */
public final class InstrumentDefinitionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 145;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Definition Message";

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
     * timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * tradingStatus
     */
    private final TradingStatusField tradingStatus = new TradingStatusField();

    /**
     * securityId
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * matchAlgorithm
     */
    private final MatchAlgorithmField matchAlgorithm = new MatchAlgorithmField();

    /**
     * directBookDepth
     */
    private final DirectBookDepthField directBookDepth = new DirectBookDepthField();

    /**
     * impliedBookDepth
     */
    private final ImpliedBookDepthField impliedBookDepth = new ImpliedBookDepthField();

    /**
     * underlyingSecurityId
     */
    private final UnderlyingSecurityIdField underlyingSecurityId = new UnderlyingSecurityIdField();

    /**
     * underlyingInstrumentId
     */
    private final UnderlyingInstrumentIdField underlyingInstrumentId = new UnderlyingInstrumentIdField();

    /**
     * normalizationTerm
     */
    private final NormalizationTermField normalizationTerm = new NormalizationTermField();

    /**
     * tradingReferencePrice
     */
    private final TradingReferencePriceField tradingReferencePrice = new TradingReferencePriceField();

    /**
     * minPriceIncrement
     */
    private final MinPriceIncrementField minPriceIncrement = new MinPriceIncrementField();

    /**
     * securityExchange
     */
    private final SecurityExchangeField securityExchange = new SecurityExchangeField();

    /**
     * securityGroupCode
     */
    private final SecurityGroupCodeField securityGroupCode = new SecurityGroupCodeField();

    /**
     * instrumentType
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * roundLotSize
     */
    private final RoundLotSizeField roundLotSize = new RoundLotSizeField();

    /**
     * adjustedPocPrice
     */
    private final AdjustedPocPriceField adjustedPocPrice = new AdjustedPocPriceField();

    /**
     * luldTier
     */
    private final LuldTierField luldTier = new LuldTierField();

    /**
     * SecurityFlags bit set
     */
    private final SecurityDirectoryFlagsField securityDirectoryFlags = new SecurityDirectoryFlagsField();

    /**
     * reason
     */
    private final ReasonField reason = new ReasonField();

    /**
     * retailLiquidityIndicator
     */
    private final RetailLiquidityIndicatorField retailLiquidityIndicator = new RetailLiquidityIndicatorField();

    /**
     * operationalHaltStatus
     */
    private final OperationalHaltStatusField operationalHaltStatus = new OperationalHaltStatusField();

    /**
     * shortSalePriceTestStatus
     */
    private final ShortSalePriceTestStatusField shortSalePriceTestStatus = new ShortSalePriceTestStatusField();

    /**
     * shortSaleDetail
     */
    private final ShortSaleDetailField shortSaleDetail = new ShortSaleDetailField();

    /**
     * securityEvent
     */
    private final SecurityEventField securityEvent = new SecurityEventField();

    /**
     * OpraNbboQuoteMessage
     */
    private final OptionKey optionKey = new OptionKey();

    /**
     * noLegs Block
     */
    private final InstrumentDefinitionMessageNoLegsGroups instrumentDefinitionMessageNoLegsGroups = new InstrumentDefinitionMessageNoLegsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(instrumentId), List.<Field>of(exchangeId), List.<Field>of(symbol), List.<Field>of(timestampField), List.<Field>of(tradingStatus), optionKey.fields(), List.<Field>of(securityId), List.<Field>of(matchAlgorithm), List.<Field>of(directBookDepth), List.<Field>of(impliedBookDepth), List.<Field>of(underlyingSecurityId), List.<Field>of(underlyingInstrumentId), List.<Field>of(normalizationTerm), List.<Field>of(tradingReferencePrice), List.<Field>of(minPriceIncrement), List.<Field>of(securityExchange), List.<Field>of(securityGroupCode), List.<Field>of(instrumentType), List.<Field>of(roundLotSize), List.<Field>of(adjustedPocPrice), List.<Field>of(luldTier), List.<Field>of(securityDirectoryFlags), List.<Field>of(reason), List.<Field>of(retailLiquidityIndicator), List.<Field>of(operationalHaltStatus), List.<Field>of(shortSalePriceTestStatus), List.<Field>of(shortSaleDetail), List.<Field>of(securityEvent)).flatMap(List::stream).toList();

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
     * timestamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * tradingStatus
     *
     * @return the TradingStatus field
     */
    public TradingStatusField tradingStatus() {
        return tradingStatus;
    }

    /**
     * securityId
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * matchAlgorithm
     *
     * @return the MatchAlgorithm field
     */
    public MatchAlgorithmField matchAlgorithm() {
        return matchAlgorithm;
    }

    /**
     * directBookDepth
     *
     * @return the DirectBookDepth field
     */
    public DirectBookDepthField directBookDepth() {
        return directBookDepth;
    }

    /**
     * impliedBookDepth
     *
     * @return the ImpliedBookDepth field
     */
    public ImpliedBookDepthField impliedBookDepth() {
        return impliedBookDepth;
    }

    /**
     * underlyingSecurityId
     *
     * @return the UnderlyingSecurityId field
     */
    public UnderlyingSecurityIdField underlyingSecurityId() {
        return underlyingSecurityId;
    }

    /**
     * underlyingInstrumentId
     *
     * @return the UnderlyingInstrumentId field
     */
    public UnderlyingInstrumentIdField underlyingInstrumentId() {
        return underlyingInstrumentId;
    }

    /**
     * normalizationTerm
     *
     * @return the NormalizationTerm field
     */
    public NormalizationTermField normalizationTerm() {
        return normalizationTerm;
    }

    /**
     * tradingReferencePrice
     *
     * @return the TradingReferencePrice field
     */
    public TradingReferencePriceField tradingReferencePrice() {
        return tradingReferencePrice;
    }

    /**
     * minPriceIncrement
     *
     * @return the MinPriceIncrement field
     */
    public MinPriceIncrementField minPriceIncrement() {
        return minPriceIncrement;
    }

    /**
     * securityExchange
     *
     * @return the SecurityExchange field
     */
    public SecurityExchangeField securityExchange() {
        return securityExchange;
    }

    /**
     * securityGroupCode
     *
     * @return the SecurityGroupCode field
     */
    public SecurityGroupCodeField securityGroupCode() {
        return securityGroupCode;
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
     * roundLotSize
     *
     * @return the RoundLotSize field
     */
    public RoundLotSizeField roundLotSize() {
        return roundLotSize;
    }

    /**
     * adjustedPocPrice
     *
     * @return the AdjustedPocPrice field
     */
    public AdjustedPocPriceField adjustedPocPrice() {
        return adjustedPocPrice;
    }

    /**
     * luldTier
     *
     * @return the LuldTier field
     */
    public LuldTierField luldTier() {
        return luldTier;
    }

    /**
     * SecurityFlags bit set
     *
     * @return the SecurityDirectoryFlags field
     */
    public SecurityDirectoryFlagsField securityDirectoryFlags() {
        return securityDirectoryFlags;
    }

    /**
     * reason
     *
     * @return the Reason field
     */
    public ReasonField reason() {
        return reason;
    }

    /**
     * retailLiquidityIndicator
     *
     * @return the RetailLiquidityIndicator field
     */
    public RetailLiquidityIndicatorField retailLiquidityIndicator() {
        return retailLiquidityIndicator;
    }

    /**
     * operationalHaltStatus
     *
     * @return the OperationalHaltStatus field
     */
    public OperationalHaltStatusField operationalHaltStatus() {
        return operationalHaltStatus;
    }

    /**
     * shortSalePriceTestStatus
     *
     * @return the ShortSalePriceTestStatus field
     */
    public ShortSalePriceTestStatusField shortSalePriceTestStatus() {
        return shortSalePriceTestStatus;
    }

    /**
     * shortSaleDetail
     *
     * @return the ShortSaleDetail field
     */
    public ShortSaleDetailField shortSaleDetail() {
        return shortSaleDetail;
    }

    /**
     * securityEvent
     *
     * @return the SecurityEvent field
     */
    public SecurityEventField securityEvent() {
        return securityEvent;
    }

    /**
     * OpraNbboQuoteMessage
     *
     * @return the OptionKey record
     */
    public OptionKey optionKey() {
        return optionKey;
    }

    /**
     * noLegs Block
     *
     * @return the InstrumentDefinitionMessageNoLegsGroups record
     */
    public InstrumentDefinitionMessageNoLegsGroups instrumentDefinitionMessageNoLegsGroups() {
        return instrumentDefinitionMessageNoLegsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + instrumentDefinitionMessageNoLegsGroups.byteLength() - InstrumentDefinitionMessageNoLegsGroups.MINIMUM_BYTE_LENGTH;
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!tradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStatusField.BYTE_LENGTH;
        if (!optionKey.parseFrom(data, cursor, end - 74)) {
            return false;
        }
        cursor += optionKey.byteLength();
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!matchAlgorithm.parse(data, cursor)) {
            return false;
        }
        cursor += MatchAlgorithmField.BYTE_LENGTH;
        if (!directBookDepth.parse(data, cursor)) {
            return false;
        }
        cursor += DirectBookDepthField.BYTE_LENGTH;
        if (!impliedBookDepth.parse(data, cursor)) {
            return false;
        }
        cursor += ImpliedBookDepthField.BYTE_LENGTH;
        if (!underlyingSecurityId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSecurityIdField.BYTE_LENGTH;
        if (!underlyingInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingInstrumentIdField.BYTE_LENGTH;
        if (!normalizationTerm.parse(data, cursor)) {
            return false;
        }
        cursor += NormalizationTermField.BYTE_LENGTH;
        if (!tradingReferencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradingReferencePriceField.BYTE_LENGTH;
        if (!minPriceIncrement.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceIncrementField.BYTE_LENGTH;
        if (!securityExchange.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityExchangeField.BYTE_LENGTH;
        if (!securityGroupCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityGroupCodeField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!roundLotSize.parse(data, cursor)) {
            return false;
        }
        cursor += RoundLotSizeField.BYTE_LENGTH;
        if (!adjustedPocPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AdjustedPocPriceField.BYTE_LENGTH;
        if (!luldTier.parse(data, cursor)) {
            return false;
        }
        cursor += LuldTierField.BYTE_LENGTH;
        if (!securityDirectoryFlags.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityDirectoryFlagsField.BYTE_LENGTH;
        if (!reason.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonField.BYTE_LENGTH;
        if (!retailLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += RetailLiquidityIndicatorField.BYTE_LENGTH;
        if (!operationalHaltStatus.parse(data, cursor)) {
            return false;
        }
        cursor += OperationalHaltStatusField.BYTE_LENGTH;
        if (!shortSalePriceTestStatus.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSalePriceTestStatusField.BYTE_LENGTH;
        if (!shortSaleDetail.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSaleDetailField.BYTE_LENGTH;
        if (!securityEvent.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityEventField.BYTE_LENGTH;
        if (!instrumentDefinitionMessageNoLegsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += instrumentDefinitionMessageNoLegsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = exchangeId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = tradingStatus.encode(data, cursor);
        cursor = optionKey.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = matchAlgorithm.encode(data, cursor);
        cursor = directBookDepth.encode(data, cursor);
        cursor = impliedBookDepth.encode(data, cursor);
        cursor = underlyingSecurityId.encode(data, cursor);
        cursor = underlyingInstrumentId.encode(data, cursor);
        cursor = normalizationTerm.encode(data, cursor);
        cursor = tradingReferencePrice.encode(data, cursor);
        cursor = minPriceIncrement.encode(data, cursor);
        cursor = securityExchange.encode(data, cursor);
        cursor = securityGroupCode.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = roundLotSize.encode(data, cursor);
        cursor = adjustedPocPrice.encode(data, cursor);
        cursor = luldTier.encode(data, cursor);
        cursor = securityDirectoryFlags.encode(data, cursor);
        cursor = reason.encode(data, cursor);
        cursor = retailLiquidityIndicator.encode(data, cursor);
        cursor = operationalHaltStatus.encode(data, cursor);
        cursor = shortSalePriceTestStatus.encode(data, cursor);
        cursor = shortSaleDetail.encode(data, cursor);
        cursor = securityEvent.encode(data, cursor);
        cursor = instrumentDefinitionMessageNoLegsGroups.encode(data, cursor);
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
        optionKey.clear();
        instrumentDefinitionMessageNoLegsGroups.clear();
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        return instrumentDefinitionMessageNoLegsGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!instrumentDefinitionMessageNoLegsGroups.isValid()) {
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
        if (!instrumentId.isDecoded()) {
            return Optional.of(instrumentId);
        }
        if (!exchangeId.isDecoded()) {
            return Optional.of(exchangeId);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!tradingStatus.isDecoded()) {
            return Optional.of(tradingStatus);
        }
        if (!optionKey.isDecoded()) {
            return optionKey.failedAt();
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!matchAlgorithm.isDecoded()) {
            return Optional.of(matchAlgorithm);
        }
        if (!directBookDepth.isDecoded()) {
            return Optional.of(directBookDepth);
        }
        if (!impliedBookDepth.isDecoded()) {
            return Optional.of(impliedBookDepth);
        }
        if (!underlyingSecurityId.isDecoded()) {
            return Optional.of(underlyingSecurityId);
        }
        if (!underlyingInstrumentId.isDecoded()) {
            return Optional.of(underlyingInstrumentId);
        }
        if (!normalizationTerm.isDecoded()) {
            return Optional.of(normalizationTerm);
        }
        if (!tradingReferencePrice.isDecoded()) {
            return Optional.of(tradingReferencePrice);
        }
        if (!minPriceIncrement.isDecoded()) {
            return Optional.of(minPriceIncrement);
        }
        if (!securityExchange.isDecoded()) {
            return Optional.of(securityExchange);
        }
        if (!securityGroupCode.isDecoded()) {
            return Optional.of(securityGroupCode);
        }
        if (!instrumentType.isDecoded()) {
            return Optional.of(instrumentType);
        }
        if (!roundLotSize.isDecoded()) {
            return Optional.of(roundLotSize);
        }
        if (!adjustedPocPrice.isDecoded()) {
            return Optional.of(adjustedPocPrice);
        }
        if (!luldTier.isDecoded()) {
            return Optional.of(luldTier);
        }
        if (!securityDirectoryFlags.isDecoded()) {
            return Optional.of(securityDirectoryFlags);
        }
        if (!reason.isDecoded()) {
            return Optional.of(reason);
        }
        if (!retailLiquidityIndicator.isDecoded()) {
            return Optional.of(retailLiquidityIndicator);
        }
        if (!operationalHaltStatus.isDecoded()) {
            return Optional.of(operationalHaltStatus);
        }
        if (!shortSalePriceTestStatus.isDecoded()) {
            return Optional.of(shortSalePriceTestStatus);
        }
        if (!shortSaleDetail.isDecoded()) {
            return Optional.of(shortSaleDetail);
        }
        if (!securityEvent.isDecoded()) {
            return Optional.of(securityEvent);
        }
        if (!instrumentDefinitionMessageNoLegsGroups.isDecoded()) {
            return instrumentDefinitionMessageNoLegsGroups.failedAt();
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
            case "Timestamp" -> Optional.of(timestampField);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "SecurityId" -> Optional.of(securityId);
            case "MatchAlgorithm" -> Optional.of(matchAlgorithm);
            case "DirectBookDepth" -> Optional.of(directBookDepth);
            case "ImpliedBookDepth" -> Optional.of(impliedBookDepth);
            case "UnderlyingSecurityId" -> Optional.of(underlyingSecurityId);
            case "UnderlyingInstrumentId" -> Optional.of(underlyingInstrumentId);
            case "NormalizationTerm" -> Optional.of(normalizationTerm);
            case "TradingReferencePrice" -> Optional.of(tradingReferencePrice);
            case "MinPriceIncrement" -> Optional.of(minPriceIncrement);
            case "SecurityExchange" -> Optional.of(securityExchange);
            case "SecurityGroupCode" -> Optional.of(securityGroupCode);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "RoundLotSize" -> Optional.of(roundLotSize);
            case "AdjustedPocPrice" -> Optional.of(adjustedPocPrice);
            case "LuldTier" -> Optional.of(luldTier);
            case "SecurityDirectoryFlags" -> Optional.of(securityDirectoryFlags);
            case "Reason" -> Optional.of(reason);
            case "RetailLiquidityIndicator" -> Optional.of(retailLiquidityIndicator);
            case "OperationalHaltStatus" -> Optional.of(operationalHaltStatus);
            case "ShortSalePriceTestStatus" -> Optional.of(shortSalePriceTestStatus);
            case "ShortSaleDetail" -> Optional.of(shortSaleDetail);
            case "SecurityEvent" -> Optional.of(securityEvent);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InstrumentDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(instrumentDefinitionMessageNoLegsGroups.diffFields(message.instrumentDefinitionMessageNoLegsGroups));
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
            instrumentDefinitionMessageNoLegsGroups.toFormattedString(builder, options);
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
        instrumentDefinitionMessageNoLegsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof InstrumentDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && instrumentDefinitionMessageNoLegsGroups.equals(message.instrumentDefinitionMessageNoLegsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, instrumentDefinitionMessageNoLegsGroups);
    }
}
