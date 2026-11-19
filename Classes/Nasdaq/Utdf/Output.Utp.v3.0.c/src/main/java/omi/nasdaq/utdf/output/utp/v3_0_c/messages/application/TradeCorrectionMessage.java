package omi.nasdaq.utdf.output.utp.v3_0_c.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.ConsolidatedHighPriceField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.ConsolidatedLastPriceField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.ConsolidatedLastPriceOriginatorField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.ConsolidatedLowPriceField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.ConsolidatedPriceChangeIndicatorField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.ConsolidatedVolumeField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.CorrectedSaleConditionField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.CorrectedSellersSaleDaysField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.CorrectedTradeIdField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.CorrectedTradePriceField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.CorrectedTradeThroughExemptFlagField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.CorrectedVolumeShortField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.MarketCenterOriginatorField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.MarketParticipantHighPriceField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.MarketParticipantLastPriceField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.MarketParticipantLowPriceField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.MarketParticipantVolumeField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.OriginalSaleConditionField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.OriginalSellersSaleDaysField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.OriginalTradeIdField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.OriginalTradePriceField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.OriginalTradeThroughExemptFlagField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.OriginalVolumeShortField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.ParticipantTokenField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.SipTimestampField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.SubMarketCenterIdField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.SymbolLongField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.Timestamp1Field;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.Timestamp2Field;
import omi.nasdaq.utdf.output.utp.v3_0_c.types.Field;
import omi.nasdaq.utdf.output.utp.v3_0_c.types.Message;
import omi.nasdaq.utdf.output.utp.v3_0_c.types.PrintOptions;

/**
 * Represents the TradeCorrectionMessage message from the Output protocol.
 *
 * <p>Trade Correction Message. To be retired with the Fractional Share Release on February 23, 2026.</p>
 */
public final class TradeCorrectionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Y';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 165;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Correction Message";

    /**
     * Market Center Originator
     */
    private final MarketCenterOriginatorField marketCenterOriginator = new MarketCenterOriginatorField();

    /**
     * Sub-Market Center ID
     */
    private final SubMarketCenterIdField subMarketCenterId = new SubMarketCenterIdField();

    /**
     * SIP Timestamp
     */
    private final SipTimestampField sipTimestamp = new SipTimestampField();

    /**
     * Participant Timestamp
     */
    private final Timestamp1Field timestamp1 = new Timestamp1Field();

    /**
     * Participant Token
     */
    private final ParticipantTokenField participantToken = new ParticipantTokenField();

    /**
     * FINRA Timestamp, nanoseconds since Epoch. Set to 0 if from an exchange
     */
    private final Timestamp2Field timestamp2 = new Timestamp2Field();

    /**
     * Security symbol
     */
    private final SymbolLongField symbolLong = new SymbolLongField();

    /**
     * Original Trade Id of the trade being canceled
     */
    private final OriginalTradeIdField originalTradeId = new OriginalTradeIdField();

    /**
     * Original Trade Price, 6 implied decimal places
     */
    private final OriginalTradePriceField originalTradePrice = new OriginalTradePriceField();

    /**
     * Original Volume
     */
    private final OriginalVolumeShortField originalVolumeShort = new OriginalVolumeShortField();

    /**
     * Original Sale Condition
     */
    private final OriginalSaleConditionField originalSaleCondition = new OriginalSaleConditionField();

    /**
     * Original Trade Through Exempt Flag
     */
    private final OriginalTradeThroughExemptFlagField originalTradeThroughExemptFlag = new OriginalTradeThroughExemptFlagField();

    /**
     * Original Seller's Sale Days
     */
    private final OriginalSellersSaleDaysField originalSellersSaleDays = new OriginalSellersSaleDaysField();

    /**
     * Corrected Trade Id
     */
    private final CorrectedTradeIdField correctedTradeId = new CorrectedTradeIdField();

    /**
     * Corrected Trade Price
     */
    private final CorrectedTradePriceField correctedTradePrice = new CorrectedTradePriceField();

    /**
     * Corrected Volume
     */
    private final CorrectedVolumeShortField correctedVolumeShort = new CorrectedVolumeShortField();

    /**
     * Corrected Sale Condition
     */
    private final CorrectedSaleConditionField correctedSaleCondition = new CorrectedSaleConditionField();

    /**
     * Corrected Trade Through Exempt Flag
     */
    private final CorrectedTradeThroughExemptFlagField correctedTradeThroughExemptFlag = new CorrectedTradeThroughExemptFlagField();

    /**
     * Corrected Seller's Sale Days
     */
    private final CorrectedSellersSaleDaysField correctedSellersSaleDays = new CorrectedSellersSaleDaysField();

    /**
     * Consolidated High Price
     */
    private final ConsolidatedHighPriceField consolidatedHighPrice = new ConsolidatedHighPriceField();

    /**
     * Consolidated Low Price
     */
    private final ConsolidatedLowPriceField consolidatedLowPrice = new ConsolidatedLowPriceField();

    /**
     * Consolidated Last Price
     */
    private final ConsolidatedLastPriceField consolidatedLastPrice = new ConsolidatedLastPriceField();

    /**
     * Consolidated Volume
     */
    private final ConsolidatedVolumeField consolidatedVolume = new ConsolidatedVolumeField();

    /**
     * Consolidated Price Change Indicator
     */
    private final ConsolidatedPriceChangeIndicatorField consolidatedPriceChangeIndicator = new ConsolidatedPriceChangeIndicatorField();

    /**
     * Market Center Originator for consolidated last price
     */
    private final ConsolidatedLastPriceOriginatorField consolidatedLastPriceOriginator = new ConsolidatedLastPriceOriginatorField();

    /**
     * Market Participant High Price
     */
    private final MarketParticipantHighPriceField marketParticipantHighPrice = new MarketParticipantHighPriceField();

    /**
     * Market Participant Low Price
     */
    private final MarketParticipantLowPriceField marketParticipantLowPrice = new MarketParticipantLowPriceField();

    /**
     * Market Participant Last Price
     */
    private final MarketParticipantLastPriceField marketParticipantLastPrice = new MarketParticipantLastPriceField();

    /**
     * Market Participant Volume
     */
    private final MarketParticipantVolumeField marketParticipantVolume = new MarketParticipantVolumeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketCenterOriginator, subMarketCenterId, sipTimestamp, timestamp1, participantToken, timestamp2, symbolLong, originalTradeId, originalTradePrice, originalVolumeShort, originalSaleCondition, originalTradeThroughExemptFlag, originalSellersSaleDays, correctedTradeId, correctedTradePrice, correctedVolumeShort, correctedSaleCondition, correctedTradeThroughExemptFlag, correctedSellersSaleDays, consolidatedHighPrice, consolidatedLowPrice, consolidatedLastPrice, consolidatedVolume, consolidatedPriceChangeIndicator, consolidatedLastPriceOriginator, marketParticipantHighPrice, marketParticipantLowPrice, marketParticipantLastPrice, marketParticipantVolume);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Market Center Originator
     *
     * @return the MarketCenterOriginator field
     */
    public MarketCenterOriginatorField marketCenterOriginator() {
        return marketCenterOriginator;
    }

    /**
     * Sub-Market Center ID
     *
     * @return the SubMarketCenterId field
     */
    public SubMarketCenterIdField subMarketCenterId() {
        return subMarketCenterId;
    }

    /**
     * SIP Timestamp
     *
     * @return the SipTimestamp field
     */
    public SipTimestampField sipTimestamp() {
        return sipTimestamp;
    }

    /**
     * Participant Timestamp
     *
     * @return the Timestamp1 field
     */
    public Timestamp1Field timestamp1() {
        return timestamp1;
    }

    /**
     * Participant Token
     *
     * @return the ParticipantToken field
     */
    public ParticipantTokenField participantToken() {
        return participantToken;
    }

    /**
     * FINRA Timestamp, nanoseconds since Epoch. Set to 0 if from an exchange
     *
     * @return the Timestamp2 field
     */
    public Timestamp2Field timestamp2() {
        return timestamp2;
    }

    /**
     * Security symbol
     *
     * @return the SymbolLong field
     */
    public SymbolLongField symbolLong() {
        return symbolLong;
    }

    /**
     * Original Trade Id of the trade being canceled
     *
     * @return the OriginalTradeId field
     */
    public OriginalTradeIdField originalTradeId() {
        return originalTradeId;
    }

    /**
     * Original Trade Price, 6 implied decimal places
     *
     * @return the OriginalTradePrice field
     */
    public OriginalTradePriceField originalTradePrice() {
        return originalTradePrice;
    }

    /**
     * Original Volume
     *
     * @return the OriginalVolumeShort field
     */
    public OriginalVolumeShortField originalVolumeShort() {
        return originalVolumeShort;
    }

    /**
     * Original Sale Condition
     *
     * @return the OriginalSaleCondition field
     */
    public OriginalSaleConditionField originalSaleCondition() {
        return originalSaleCondition;
    }

    /**
     * Original Trade Through Exempt Flag
     *
     * @return the OriginalTradeThroughExemptFlag field
     */
    public OriginalTradeThroughExemptFlagField originalTradeThroughExemptFlag() {
        return originalTradeThroughExemptFlag;
    }

    /**
     * Original Seller's Sale Days
     *
     * @return the OriginalSellersSaleDays field
     */
    public OriginalSellersSaleDaysField originalSellersSaleDays() {
        return originalSellersSaleDays;
    }

    /**
     * Corrected Trade Id
     *
     * @return the CorrectedTradeId field
     */
    public CorrectedTradeIdField correctedTradeId() {
        return correctedTradeId;
    }

    /**
     * Corrected Trade Price
     *
     * @return the CorrectedTradePrice field
     */
    public CorrectedTradePriceField correctedTradePrice() {
        return correctedTradePrice;
    }

    /**
     * Corrected Volume
     *
     * @return the CorrectedVolumeShort field
     */
    public CorrectedVolumeShortField correctedVolumeShort() {
        return correctedVolumeShort;
    }

    /**
     * Corrected Sale Condition
     *
     * @return the CorrectedSaleCondition field
     */
    public CorrectedSaleConditionField correctedSaleCondition() {
        return correctedSaleCondition;
    }

    /**
     * Corrected Trade Through Exempt Flag
     *
     * @return the CorrectedTradeThroughExemptFlag field
     */
    public CorrectedTradeThroughExemptFlagField correctedTradeThroughExemptFlag() {
        return correctedTradeThroughExemptFlag;
    }

    /**
     * Corrected Seller's Sale Days
     *
     * @return the CorrectedSellersSaleDays field
     */
    public CorrectedSellersSaleDaysField correctedSellersSaleDays() {
        return correctedSellersSaleDays;
    }

    /**
     * Consolidated High Price
     *
     * @return the ConsolidatedHighPrice field
     */
    public ConsolidatedHighPriceField consolidatedHighPrice() {
        return consolidatedHighPrice;
    }

    /**
     * Consolidated Low Price
     *
     * @return the ConsolidatedLowPrice field
     */
    public ConsolidatedLowPriceField consolidatedLowPrice() {
        return consolidatedLowPrice;
    }

    /**
     * Consolidated Last Price
     *
     * @return the ConsolidatedLastPrice field
     */
    public ConsolidatedLastPriceField consolidatedLastPrice() {
        return consolidatedLastPrice;
    }

    /**
     * Consolidated Volume
     *
     * @return the ConsolidatedVolume field
     */
    public ConsolidatedVolumeField consolidatedVolume() {
        return consolidatedVolume;
    }

    /**
     * Consolidated Price Change Indicator
     *
     * @return the ConsolidatedPriceChangeIndicator field
     */
    public ConsolidatedPriceChangeIndicatorField consolidatedPriceChangeIndicator() {
        return consolidatedPriceChangeIndicator;
    }

    /**
     * Market Center Originator for consolidated last price
     *
     * @return the ConsolidatedLastPriceOriginator field
     */
    public ConsolidatedLastPriceOriginatorField consolidatedLastPriceOriginator() {
        return consolidatedLastPriceOriginator;
    }

    /**
     * Market Participant High Price
     *
     * @return the MarketParticipantHighPrice field
     */
    public MarketParticipantHighPriceField marketParticipantHighPrice() {
        return marketParticipantHighPrice;
    }

    /**
     * Market Participant Low Price
     *
     * @return the MarketParticipantLowPrice field
     */
    public MarketParticipantLowPriceField marketParticipantLowPrice() {
        return marketParticipantLowPrice;
    }

    /**
     * Market Participant Last Price
     *
     * @return the MarketParticipantLastPrice field
     */
    public MarketParticipantLastPriceField marketParticipantLastPrice() {
        return marketParticipantLastPrice;
    }

    /**
     * Market Participant Volume
     *
     * @return the MarketParticipantVolume field
     */
    public MarketParticipantVolumeField marketParticipantVolume() {
        return marketParticipantVolume;
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
        return Optional.ofNullable(sipTimestamp.value());
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
        if (!marketCenterOriginator.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCenterOriginatorField.BYTE_LENGTH;
        if (!subMarketCenterId.parse(data, cursor)) {
            return false;
        }
        cursor += SubMarketCenterIdField.BYTE_LENGTH;
        if (!sipTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += SipTimestampField.BYTE_LENGTH;
        if (!timestamp1.parse(data, cursor)) {
            return false;
        }
        cursor += Timestamp1Field.BYTE_LENGTH;
        if (!participantToken.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantTokenField.BYTE_LENGTH;
        if (!timestamp2.parse(data, cursor)) {
            return false;
        }
        cursor += Timestamp2Field.BYTE_LENGTH;
        if (!symbolLong.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolLongField.BYTE_LENGTH;
        if (!originalTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeIdField.BYTE_LENGTH;
        if (!originalTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradePriceField.BYTE_LENGTH;
        if (!originalVolumeShort.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalVolumeShortField.BYTE_LENGTH;
        if (!originalSaleCondition.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalSaleConditionField.BYTE_LENGTH;
        if (!originalTradeThroughExemptFlag.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeThroughExemptFlagField.BYTE_LENGTH;
        if (!originalSellersSaleDays.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalSellersSaleDaysField.BYTE_LENGTH;
        if (!correctedTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedTradeIdField.BYTE_LENGTH;
        if (!correctedTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedTradePriceField.BYTE_LENGTH;
        if (!correctedVolumeShort.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedVolumeShortField.BYTE_LENGTH;
        if (!correctedSaleCondition.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedSaleConditionField.BYTE_LENGTH;
        if (!correctedTradeThroughExemptFlag.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedTradeThroughExemptFlagField.BYTE_LENGTH;
        if (!correctedSellersSaleDays.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedSellersSaleDaysField.BYTE_LENGTH;
        if (!consolidatedHighPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedHighPriceField.BYTE_LENGTH;
        if (!consolidatedLowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedLowPriceField.BYTE_LENGTH;
        if (!consolidatedLastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedLastPriceField.BYTE_LENGTH;
        if (!consolidatedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedVolumeField.BYTE_LENGTH;
        if (!consolidatedPriceChangeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedPriceChangeIndicatorField.BYTE_LENGTH;
        if (!consolidatedLastPriceOriginator.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedLastPriceOriginatorField.BYTE_LENGTH;
        if (!marketParticipantHighPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantHighPriceField.BYTE_LENGTH;
        if (!marketParticipantLowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantLowPriceField.BYTE_LENGTH;
        if (!marketParticipantLastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantLastPriceField.BYTE_LENGTH;
        return marketParticipantVolume.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketCenterOriginator.encode(data, cursor);
        cursor = subMarketCenterId.encode(data, cursor);
        cursor = sipTimestamp.encode(data, cursor);
        cursor = timestamp1.encode(data, cursor);
        cursor = participantToken.encode(data, cursor);
        cursor = timestamp2.encode(data, cursor);
        cursor = symbolLong.encode(data, cursor);
        cursor = originalTradeId.encode(data, cursor);
        cursor = originalTradePrice.encode(data, cursor);
        cursor = originalVolumeShort.encode(data, cursor);
        cursor = originalSaleCondition.encode(data, cursor);
        cursor = originalTradeThroughExemptFlag.encode(data, cursor);
        cursor = originalSellersSaleDays.encode(data, cursor);
        cursor = correctedTradeId.encode(data, cursor);
        cursor = correctedTradePrice.encode(data, cursor);
        cursor = correctedVolumeShort.encode(data, cursor);
        cursor = correctedSaleCondition.encode(data, cursor);
        cursor = correctedTradeThroughExemptFlag.encode(data, cursor);
        cursor = correctedSellersSaleDays.encode(data, cursor);
        cursor = consolidatedHighPrice.encode(data, cursor);
        cursor = consolidatedLowPrice.encode(data, cursor);
        cursor = consolidatedLastPrice.encode(data, cursor);
        cursor = consolidatedVolume.encode(data, cursor);
        cursor = consolidatedPriceChangeIndicator.encode(data, cursor);
        cursor = consolidatedLastPriceOriginator.encode(data, cursor);
        cursor = marketParticipantHighPrice.encode(data, cursor);
        cursor = marketParticipantLowPrice.encode(data, cursor);
        cursor = marketParticipantLastPrice.encode(data, cursor);
        cursor = marketParticipantVolume.encode(data, cursor);
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
            case "MarketCenterOriginator" -> Optional.of(marketCenterOriginator);
            case "SubMarketCenterId" -> Optional.of(subMarketCenterId);
            case "SipTimestamp" -> Optional.of(sipTimestamp);
            case "Timestamp1" -> Optional.of(timestamp1);
            case "ParticipantToken" -> Optional.of(participantToken);
            case "Timestamp2" -> Optional.of(timestamp2);
            case "SymbolLong" -> Optional.of(symbolLong);
            case "OriginalTradeId" -> Optional.of(originalTradeId);
            case "OriginalTradePrice" -> Optional.of(originalTradePrice);
            case "OriginalVolumeShort" -> Optional.of(originalVolumeShort);
            case "OriginalSaleCondition" -> Optional.of(originalSaleCondition);
            case "OriginalTradeThroughExemptFlag" -> Optional.of(originalTradeThroughExemptFlag);
            case "OriginalSellersSaleDays" -> Optional.of(originalSellersSaleDays);
            case "CorrectedTradeId" -> Optional.of(correctedTradeId);
            case "CorrectedTradePrice" -> Optional.of(correctedTradePrice);
            case "CorrectedVolumeShort" -> Optional.of(correctedVolumeShort);
            case "CorrectedSaleCondition" -> Optional.of(correctedSaleCondition);
            case "CorrectedTradeThroughExemptFlag" -> Optional.of(correctedTradeThroughExemptFlag);
            case "CorrectedSellersSaleDays" -> Optional.of(correctedSellersSaleDays);
            case "ConsolidatedHighPrice" -> Optional.of(consolidatedHighPrice);
            case "ConsolidatedLowPrice" -> Optional.of(consolidatedLowPrice);
            case "ConsolidatedLastPrice" -> Optional.of(consolidatedLastPrice);
            case "ConsolidatedVolume" -> Optional.of(consolidatedVolume);
            case "ConsolidatedPriceChangeIndicator" -> Optional.of(consolidatedPriceChangeIndicator);
            case "ConsolidatedLastPriceOriginator" -> Optional.of(consolidatedLastPriceOriginator);
            case "MarketParticipantHighPrice" -> Optional.of(marketParticipantHighPrice);
            case "MarketParticipantLowPrice" -> Optional.of(marketParticipantLowPrice);
            case "MarketParticipantLastPrice" -> Optional.of(marketParticipantLastPrice);
            case "MarketParticipantVolume" -> Optional.of(marketParticipantVolume);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCorrectionMessage message)) {
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
        if (!(other instanceof TradeCorrectionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
