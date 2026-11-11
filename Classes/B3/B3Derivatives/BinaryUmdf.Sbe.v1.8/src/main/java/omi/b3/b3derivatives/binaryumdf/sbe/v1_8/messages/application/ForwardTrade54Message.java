package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MatchEventIndicatorField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MdEntryBuyerField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MdEntryInterestRateField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MdEntrySellerField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MdEntrySizeQuantityField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MdEntryTimestampField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MdFuturePriceField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.RptSeqField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SellerDaysField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TradeConditionField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TradeDateField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TradeIdField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TradingSessionIdField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TrdSubTypeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Field;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.PrintOptions;

/**
 * Represents the ForwardTrade54Message message from the BinaryUmdf protocol.
 *
 * <p>ForwardTrade_54Message</p>
 */
public final class ForwardTrade54Message implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 68;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Forward Trade 54 Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 65, 3 };

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * MatchEventIndicator bit set
     */
    private final MatchEventIndicatorField matchEventIndicator = new MatchEventIndicatorField();

    /**
     * tradingSessionID
     */
    private final TradingSessionIdField tradingSessionId = new TradingSessionIdField();

    /**
     * TradeCondition bit set
     */
    private final TradeConditionField tradeCondition = new TradeConditionField();

    /**
     * mDEntryPx
     */
    private final MdFuturePriceField mdFuturePrice = new MdFuturePriceField();

    /**
     * mDEntrySize
     */
    private final MdEntrySizeQuantityField mdEntrySizeQuantity = new MdEntrySizeQuantityField();

    /**
     * tradeID
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * mDEntryBuyer
     */
    private final MdEntryBuyerField mdEntryBuyer = new MdEntryBuyerField();

    /**
     * mDEntrySeller
     */
    private final MdEntrySellerField mdEntrySeller = new MdEntrySellerField();

    /**
     * tradeDate
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * mDEntryTimestamp
     */
    private final MdEntryTimestampField mdEntryTimestamp = new MdEntryTimestampField();

    /**
     * rptSeq
     */
    private final RptSeqField rptSeq = new RptSeqField();

    /**
     * sellerDays
     */
    private final SellerDaysField sellerDays = new SellerDaysField();

    /**
     * mDEntryInterestRate
     */
    private final MdEntryInterestRateField mdEntryInterestRate = new MdEntryInterestRateField();

    /**
     * trdSubType
     */
    private final TrdSubTypeField trdSubType = new TrdSubTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, matchEventIndicator, tradingSessionId, tradeCondition, mdFuturePrice, mdEntrySizeQuantity, tradeId, mdEntryBuyer, mdEntrySeller, tradeDate, mdEntryTimestamp, rptSeq, sellerDays, mdEntryInterestRate, trdSubType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * securityID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * MatchEventIndicator bit set
     *
     * @return the MatchEventIndicator field
     */
    public MatchEventIndicatorField matchEventIndicator() {
        return matchEventIndicator;
    }

    /**
     * tradingSessionID
     *
     * @return the TradingSessionId field
     */
    public TradingSessionIdField tradingSessionId() {
        return tradingSessionId;
    }

    /**
     * TradeCondition bit set
     *
     * @return the TradeCondition field
     */
    public TradeConditionField tradeCondition() {
        return tradeCondition;
    }

    /**
     * mDEntryPx
     *
     * @return the MdFuturePrice field
     */
    public MdFuturePriceField mdFuturePrice() {
        return mdFuturePrice;
    }

    /**
     * mDEntrySize
     *
     * @return the MdEntrySizeQuantity field
     */
    public MdEntrySizeQuantityField mdEntrySizeQuantity() {
        return mdEntrySizeQuantity;
    }

    /**
     * tradeID
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * mDEntryBuyer
     *
     * @return the MdEntryBuyer field
     */
    public MdEntryBuyerField mdEntryBuyer() {
        return mdEntryBuyer;
    }

    /**
     * mDEntrySeller
     *
     * @return the MdEntrySeller field
     */
    public MdEntrySellerField mdEntrySeller() {
        return mdEntrySeller;
    }

    /**
     * tradeDate
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * mDEntryTimestamp
     *
     * @return the MdEntryTimestamp field
     */
    public MdEntryTimestampField mdEntryTimestamp() {
        return mdEntryTimestamp;
    }

    /**
     * rptSeq
     *
     * @return the RptSeq field
     */
    public RptSeqField rptSeq() {
        return rptSeq;
    }

    /**
     * sellerDays
     *
     * @return the SellerDays field
     */
    public SellerDaysField sellerDays() {
        return sellerDays;
    }

    /**
     * mDEntryInterestRate
     *
     * @return the MdEntryInterestRate field
     */
    public MdEntryInterestRateField mdEntryInterestRate() {
        return mdEntryInterestRate;
    }

    /**
     * trdSubType
     *
     * @return the TrdSubType field
     */
    public TrdSubTypeField trdSubType() {
        return trdSubType;
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
        return Optional.ofNullable(mdEntryTimestamp.value());
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!matchEventIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MatchEventIndicatorField.BYTE_LENGTH;
        if (!tradingSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionIdField.BYTE_LENGTH;
        if (!tradeCondition.parse(data, cursor)) {
            return false;
        }
        cursor += TradeConditionField.BYTE_LENGTH;
        if (!mdFuturePrice.parse(data, cursor)) {
            return false;
        }
        cursor += MdFuturePriceField.BYTE_LENGTH;
        if (!mdEntrySizeQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += MdEntrySizeQuantityField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!mdEntryBuyer.parse(data, cursor)) {
            return false;
        }
        cursor += MdEntryBuyerField.BYTE_LENGTH;
        if (!mdEntrySeller.parse(data, cursor)) {
            return false;
        }
        cursor += MdEntrySellerField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!mdEntryTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += MdEntryTimestampField.BYTE_LENGTH;
        if (!rptSeq.parse(data, cursor)) {
            return false;
        }
        cursor += RptSeqField.BYTE_LENGTH;
        if (!sellerDays.parse(data, cursor)) {
            return false;
        }
        cursor += SellerDaysField.BYTE_LENGTH;
        if (!mdEntryInterestRate.parse(data, cursor)) {
            return false;
        }
        cursor += MdEntryInterestRateField.BYTE_LENGTH;
        if (!trdSubType.parse(data, cursor)) {
            return false;
        }
        cursor += TrdSubTypeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = matchEventIndicator.encode(data, cursor);
        cursor = tradingSessionId.encode(data, cursor);
        cursor = tradeCondition.encode(data, cursor);
        cursor = mdFuturePrice.encode(data, cursor);
        cursor = mdEntrySizeQuantity.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = mdEntryBuyer.encode(data, cursor);
        cursor = mdEntrySeller.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = mdEntryTimestamp.encode(data, cursor);
        cursor = rptSeq.encode(data, cursor);
        cursor = sellerDays.encode(data, cursor);
        cursor = mdEntryInterestRate.encode(data, cursor);
        cursor = trdSubType.encode(data, cursor);
        if (buffer != null && buffer.length >= 68) {
            System.arraycopy(buffer, 65, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
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
            case "SecurityId" -> Optional.of(securityId);
            case "MatchEventIndicator" -> Optional.of(matchEventIndicator);
            case "TradingSessionId" -> Optional.of(tradingSessionId);
            case "TradeCondition" -> Optional.of(tradeCondition);
            case "MdFuturePrice" -> Optional.of(mdFuturePrice);
            case "MdEntrySizeQuantity" -> Optional.of(mdEntrySizeQuantity);
            case "TradeId" -> Optional.of(tradeId);
            case "MdEntryBuyer" -> Optional.of(mdEntryBuyer);
            case "MdEntrySeller" -> Optional.of(mdEntrySeller);
            case "TradeDate" -> Optional.of(tradeDate);
            case "MdEntryTimestamp" -> Optional.of(mdEntryTimestamp);
            case "RptSeq" -> Optional.of(rptSeq);
            case "SellerDays" -> Optional.of(sellerDays);
            case "MdEntryInterestRate" -> Optional.of(mdEntryInterestRate);
            case "TrdSubType" -> Optional.of(trdSubType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ForwardTrade54Message message)) {
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
        if (!(other instanceof ForwardTrade54Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
