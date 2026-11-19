package omi.nasdaq.utdf.output.utp.v3_0_c.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.ConsolidatedPriceChangeIndicatorField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.MarketCenterOriginatorField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.ParticipantPriceChangeIndicatorField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.ParticipantTokenField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.SaleConditionField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.SellersSaleDaysField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.SipTimestampField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.SubMarketCenterIdField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.SymbolLongField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.Timestamp1Field;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.Timestamp2Field;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.TradeIdField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.TradePriceLongField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.TradeThroughExemptFlagField;
import omi.nasdaq.utdf.output.utp.v3_0_c.fields.TradeVolumeLongField;
import omi.nasdaq.utdf.output.utp.v3_0_c.types.Field;
import omi.nasdaq.utdf.output.utp.v3_0_c.types.Message;
import omi.nasdaq.utdf.output.utp.v3_0_c.types.PrintOptions;

/**
 * Represents the TradeReportMessageLongFormMessage message from the Output protocol.
 *
 * <p>Long-format Trade Report Message. To be retired with the Fractional Share Release on February 23, 2026.</p>
 */
public final class TradeReportMessageLongFormMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'W';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 74;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Report Message Long Form Message";

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
     * Trade Id, unique per participant per sub market center per symbol per session
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Trade Price, 6 implied decimal places
     */
    private final TradePriceLongField tradePriceLong = new TradePriceLongField();

    /**
     * Trade Volume
     */
    private final TradeVolumeLongField tradeVolumeLong = new TradeVolumeLongField();

    /**
     * Sale Condition, Level1/Level2/Level3/Level4 byte values
     */
    private final SaleConditionField saleCondition = new SaleConditionField();

    /**
     * Trade Through Exempt Flag
     */
    private final TradeThroughExemptFlagField tradeThroughExemptFlag = new TradeThroughExemptFlagField();

    /**
     * Seller's Sale Days. Zero filled unless Sale Condition is R (Seller)
     */
    private final SellersSaleDaysField sellersSaleDays = new SellersSaleDaysField();

    /**
     * Consolidated Price Change Indicator
     */
    private final ConsolidatedPriceChangeIndicatorField consolidatedPriceChangeIndicator = new ConsolidatedPriceChangeIndicatorField();

    /**
     * Participant Price Change Indicator
     */
    private final ParticipantPriceChangeIndicatorField participantPriceChangeIndicator = new ParticipantPriceChangeIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketCenterOriginator, subMarketCenterId, sipTimestamp, timestamp1, participantToken, timestamp2, symbolLong, tradeId, tradePriceLong, tradeVolumeLong, saleCondition, tradeThroughExemptFlag, sellersSaleDays, consolidatedPriceChangeIndicator, participantPriceChangeIndicator);

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
     * Trade Id, unique per participant per sub market center per symbol per session
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Trade Price, 6 implied decimal places
     *
     * @return the TradePriceLong field
     */
    public TradePriceLongField tradePriceLong() {
        return tradePriceLong;
    }

    /**
     * Trade Volume
     *
     * @return the TradeVolumeLong field
     */
    public TradeVolumeLongField tradeVolumeLong() {
        return tradeVolumeLong;
    }

    /**
     * Sale Condition, Level1/Level2/Level3/Level4 byte values
     *
     * @return the SaleCondition field
     */
    public SaleConditionField saleCondition() {
        return saleCondition;
    }

    /**
     * Trade Through Exempt Flag
     *
     * @return the TradeThroughExemptFlag field
     */
    public TradeThroughExemptFlagField tradeThroughExemptFlag() {
        return tradeThroughExemptFlag;
    }

    /**
     * Seller's Sale Days. Zero filled unless Sale Condition is R (Seller)
     *
     * @return the SellersSaleDays field
     */
    public SellersSaleDaysField sellersSaleDays() {
        return sellersSaleDays;
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
     * Participant Price Change Indicator
     *
     * @return the ParticipantPriceChangeIndicator field
     */
    public ParticipantPriceChangeIndicatorField participantPriceChangeIndicator() {
        return participantPriceChangeIndicator;
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
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!tradePriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceLongField.BYTE_LENGTH;
        if (!tradeVolumeLong.parse(data, cursor)) {
            return false;
        }
        cursor += TradeVolumeLongField.BYTE_LENGTH;
        if (!saleCondition.parse(data, cursor)) {
            return false;
        }
        cursor += SaleConditionField.BYTE_LENGTH;
        if (!tradeThroughExemptFlag.parse(data, cursor)) {
            return false;
        }
        cursor += TradeThroughExemptFlagField.BYTE_LENGTH;
        if (!sellersSaleDays.parse(data, cursor)) {
            return false;
        }
        cursor += SellersSaleDaysField.BYTE_LENGTH;
        if (!consolidatedPriceChangeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedPriceChangeIndicatorField.BYTE_LENGTH;
        return participantPriceChangeIndicator.parse(data, cursor);
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
        cursor = tradeId.encode(data, cursor);
        cursor = tradePriceLong.encode(data, cursor);
        cursor = tradeVolumeLong.encode(data, cursor);
        cursor = saleCondition.encode(data, cursor);
        cursor = tradeThroughExemptFlag.encode(data, cursor);
        cursor = sellersSaleDays.encode(data, cursor);
        cursor = consolidatedPriceChangeIndicator.encode(data, cursor);
        cursor = participantPriceChangeIndicator.encode(data, cursor);
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
            case "TradeId" -> Optional.of(tradeId);
            case "TradePriceLong" -> Optional.of(tradePriceLong);
            case "TradeVolumeLong" -> Optional.of(tradeVolumeLong);
            case "SaleCondition" -> Optional.of(saleCondition);
            case "TradeThroughExemptFlag" -> Optional.of(tradeThroughExemptFlag);
            case "SellersSaleDays" -> Optional.of(sellersSaleDays);
            case "ConsolidatedPriceChangeIndicator" -> Optional.of(consolidatedPriceChangeIndicator);
            case "ParticipantPriceChangeIndicator" -> Optional.of(participantPriceChangeIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeReportMessageLongFormMessage message)) {
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
        if (!(other instanceof TradeReportMessageLongFormMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
