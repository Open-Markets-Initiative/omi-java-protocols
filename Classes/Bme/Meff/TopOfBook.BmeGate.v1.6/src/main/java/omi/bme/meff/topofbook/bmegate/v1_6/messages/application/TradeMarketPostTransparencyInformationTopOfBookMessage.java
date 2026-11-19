package omi.bme.meff.topofbook.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.AlgoFlagField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.DesignationField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.GrossTradeAmtField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LastPxField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LastQtyField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.MarketMechanismField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.MarketSegmentIdField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.StrategyTrdMatchIdField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.TradeTypeField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.TradingSessionIdField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.TransactionCategoryField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.TransactionDateAndTimeField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.TrdMatchIdField;
import omi.bme.meff.topofbook.bmegate.v1_6.types.Field;
import omi.bme.meff.topofbook.bmegate.v1_6.types.Message;
import omi.bme.meff.topofbook.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the TradeMarketPostTransparencyInformationTopOfBookMessage message from the TopOfBook protocol.
 *
 * <p>Used by the server to communicate trade information related to trades resulting from order matching in channels C/D and E/F. It is also used in channels A/B when the trade is the result of order matching at the end of an auction period (where only top-of-book information is shown)</p>
 */
public final class TradeMarketPostTransparencyInformationTopOfBookMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 54;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Market Post Transparency Information Top Of Book Message";

    /**
     * Message sequence number
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Instrument (or Book) code
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     */
    private final TransactionDateAndTimeField transactionDateAndTime = new TransactionDateAndTimeField();

    /**
     * Segment MIC Code
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Trading mode
     */
    private final TradingSessionIdField tradingSessionId = new TradingSessionIdField();

    /**
     * System Trade Number
     */
    private final TrdMatchIdField trdMatchId = new TrdMatchIdField();

    /**
     * Trade type
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * Trade price
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Current trade volume
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Premium / Trade amount
     */
    private final GrossTradeAmtField grossTradeAmt = new GrossTradeAmtField();

    /**
     * Trade situation
     */
    private final DesignationField designation = new DesignationField();

    /**
     * Market Mechanism
     */
    private final MarketMechanismField marketMechanism = new MarketMechanismField();

    /**
     * Algorithmic flag indicator
     */
    private final AlgoFlagField algoFlag = new AlgoFlagField();

    /**
     * Transaction Category
     */
    private final TransactionCategoryField transactionCategory = new TransactionCategoryField();

    /**
     * System Trade Number of the time-spread or strategy
     */
    private final StrategyTrdMatchIdField strategyTrdMatchId = new StrategyTrdMatchIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, securityCode, transactionDateAndTime, marketSegmentId, tradingSessionId, trdMatchId, tradeType, lastPx, lastQty, grossTradeAmt, designation, marketMechanism, algoFlag, transactionCategory, strategyTrdMatchId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message sequence number
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Instrument (or Book) code
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     *
     * @return the TransactionDateAndTime field
     */
    public TransactionDateAndTimeField transactionDateAndTime() {
        return transactionDateAndTime;
    }

    /**
     * Segment MIC Code
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Trading mode
     *
     * @return the TradingSessionId field
     */
    public TradingSessionIdField tradingSessionId() {
        return tradingSessionId;
    }

    /**
     * System Trade Number
     *
     * @return the TrdMatchId field
     */
    public TrdMatchIdField trdMatchId() {
        return trdMatchId;
    }

    /**
     * Trade type
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * Trade price
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Current trade volume
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * Premium / Trade amount
     *
     * @return the GrossTradeAmt field
     */
    public GrossTradeAmtField grossTradeAmt() {
        return grossTradeAmt;
    }

    /**
     * Trade situation
     *
     * @return the Designation field
     */
    public DesignationField designation() {
        return designation;
    }

    /**
     * Market Mechanism
     *
     * @return the MarketMechanism field
     */
    public MarketMechanismField marketMechanism() {
        return marketMechanism;
    }

    /**
     * Algorithmic flag indicator
     *
     * @return the AlgoFlag field
     */
    public AlgoFlagField algoFlag() {
        return algoFlag;
    }

    /**
     * Transaction Category
     *
     * @return the TransactionCategory field
     */
    public TransactionCategoryField transactionCategory() {
        return transactionCategory;
    }

    /**
     * System Trade Number of the time-spread or strategy
     *
     * @return the StrategyTrdMatchId field
     */
    public StrategyTrdMatchIdField strategyTrdMatchId() {
        return strategyTrdMatchId;
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
        return Optional.ofNullable(transactionDateAndTime.value());
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
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!transactionDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionDateAndTimeField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!tradingSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionIdField.BYTE_LENGTH;
        if (!trdMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += TrdMatchIdField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!grossTradeAmt.parse(data, cursor)) {
            return false;
        }
        cursor += GrossTradeAmtField.BYTE_LENGTH;
        if (!designation.parse(data, cursor)) {
            return false;
        }
        cursor += DesignationField.BYTE_LENGTH;
        if (!marketMechanism.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMechanismField.BYTE_LENGTH;
        if (!algoFlag.parse(data, cursor)) {
            return false;
        }
        cursor += AlgoFlagField.BYTE_LENGTH;
        if (!transactionCategory.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionCategoryField.BYTE_LENGTH;
        return strategyTrdMatchId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sequenceNumber.encode(data, cursor);
        cursor = securityCode.encode(data, cursor);
        cursor = transactionDateAndTime.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = tradingSessionId.encode(data, cursor);
        cursor = trdMatchId.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = grossTradeAmt.encode(data, cursor);
        cursor = designation.encode(data, cursor);
        cursor = marketMechanism.encode(data, cursor);
        cursor = algoFlag.encode(data, cursor);
        cursor = transactionCategory.encode(data, cursor);
        cursor = strategyTrdMatchId.encode(data, cursor);
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
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "SecurityCode" -> Optional.of(securityCode);
            case "TransactionDateAndTime" -> Optional.of(transactionDateAndTime);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "TradingSessionId" -> Optional.of(tradingSessionId);
            case "TrdMatchId" -> Optional.of(trdMatchId);
            case "TradeType" -> Optional.of(tradeType);
            case "LastPx" -> Optional.of(lastPx);
            case "LastQty" -> Optional.of(lastQty);
            case "GrossTradeAmt" -> Optional.of(grossTradeAmt);
            case "Designation" -> Optional.of(designation);
            case "MarketMechanism" -> Optional.of(marketMechanism);
            case "AlgoFlag" -> Optional.of(algoFlag);
            case "TransactionCategory" -> Optional.of(transactionCategory);
            case "StrategyTrdMatchId" -> Optional.of(strategyTrdMatchId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeMarketPostTransparencyInformationTopOfBookMessage message)) {
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
        if (!(other instanceof TradeMarketPostTransparencyInformationTopOfBookMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
