package omi.cnsx.cse2.retransmission.mmd.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.CcpSessionTradeField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.ContraFirmIdField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.CrossTypeField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.ExchangeTimestampField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.ExecutedQuantityField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.ExecutionPriceField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.FirmIdField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.MatchNumberField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.MocTradeMarkerField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.OddLotFlagField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.OpeningTradeField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.SetsTheLastPriceField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.SettlementTermField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.SymbolField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.TimeOffsetField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.fields.TradeAttributeField;
import omi.cnsx.cse2.retransmission.mmd.v1_6.types.Field;
import omi.cnsx.cse2.retransmission.mmd.v1_6.types.Message;
import omi.cnsx.cse2.retransmission.mmd.v1_6.types.PrintOptions;

/**
 * Represents the TradeMessage message from the Retransmission protocol.
 *
 * <p>A trade that does not change the displayed book, carrying the full attribution and classification of the execution.</p>
 */
public final class TradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'P';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 71;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Message";

    /**
     * Nanoseconds since last Timestamp-Seconds message.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Number of shares executed.
     */
    private final ExecutedQuantityField executedQuantity = new ExecutedQuantityField();

    /**
     * Symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Price at which the execution occurred.
     */
    private final ExecutionPriceField executionPrice = new ExecutionPriceField();

    /**
     * Unique match identifier.
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * 3 digit integer FirmId. "001" means anonymous.
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * 3 digit integer FirmId. "001" means anonymous.
     */
    private final ContraFirmIdField contraFirmId = new ContraFirmIdField();

    /**
     * Override Settlement Term. "T" = Cash Today (T+0), "N" = Non-Net, "R" = Non-Resident, or a Special Settlement Date in YYYYMMDD format. Left blank " " if default settlement.
     */
    private final SettlementTermField settlementTerm = new SettlementTermField();

    /**
     * "B" for ByPass order, " " default.
     */
    private final TradeAttributeField tradeAttribute = new TradeAttributeField();

    /**
     * Type of cross the trade resulted from.
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * "Y" = Odd lot order, "N" = Not an odd lot.
     */
    private final OddLotFlagField oddLotFlag = new OddLotFlagField();

    /**
     * "Y" = Last sale, "N" = Not last sale.
     */
    private final SetsTheLastPriceField setsTheLastPrice = new SetsTheLastPriceField();

    /**
     * Official exchange time. Milliseconds since EPOCH (Jan 1, 0:0:0, 1970).
     */
    private final ExchangeTimestampField exchangeTimestamp = new ExchangeTimestampField();

    /**
     * "Y" = Opening Trade, "N" = Not Opening Trade.
     */
    private final OpeningTradeField openingTrade = new OpeningTradeField();

    /**
     * "Y" = CCP Session Trade, "N" = Not CCP Session Trade.
     */
    private final CcpSessionTradeField ccpSessionTrade = new CcpSessionTradeField();

    /**
     * To indicate which trades are MOC or LOC trades. "Y" = MOC or LOC trade, "N" = Not MOC or LOC trade.
     */
    private final MocTradeMarkerField mocTradeMarker = new MocTradeMarkerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, executedQuantity, symbol, executionPrice, matchNumber, firmId, contraFirmId, settlementTerm, tradeAttribute, crossType, oddLotFlag, setsTheLastPrice, exchangeTimestamp, openingTrade, ccpSessionTrade, mocTradeMarker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since last Timestamp-Seconds message.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Number of shares executed.
     *
     * @return the ExecutedQuantity field
     */
    public ExecutedQuantityField executedQuantity() {
        return executedQuantity;
    }

    /**
     * Symbol.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Price at which the execution occurred.
     *
     * @return the ExecutionPrice field
     */
    public ExecutionPriceField executionPrice() {
        return executionPrice;
    }

    /**
     * Unique match identifier.
     *
     * @return the MatchNumber field
     */
    public MatchNumberField matchNumber() {
        return matchNumber;
    }

    /**
     * 3 digit integer FirmId. "001" means anonymous.
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * 3 digit integer FirmId. "001" means anonymous.
     *
     * @return the ContraFirmId field
     */
    public ContraFirmIdField contraFirmId() {
        return contraFirmId;
    }

    /**
     * Override Settlement Term. "T" = Cash Today (T+0), "N" = Non-Net, "R" = Non-Resident, or a Special Settlement Date in YYYYMMDD format. Left blank " " if default settlement.
     *
     * @return the SettlementTerm field
     */
    public SettlementTermField settlementTerm() {
        return settlementTerm;
    }

    /**
     * "B" for ByPass order, " " default.
     *
     * @return the TradeAttribute field
     */
    public TradeAttributeField tradeAttribute() {
        return tradeAttribute;
    }

    /**
     * Type of cross the trade resulted from.
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * "Y" = Odd lot order, "N" = Not an odd lot.
     *
     * @return the OddLotFlag field
     */
    public OddLotFlagField oddLotFlag() {
        return oddLotFlag;
    }

    /**
     * "Y" = Last sale, "N" = Not last sale.
     *
     * @return the SetsTheLastPrice field
     */
    public SetsTheLastPriceField setsTheLastPrice() {
        return setsTheLastPrice;
    }

    /**
     * Official exchange time. Milliseconds since EPOCH (Jan 1, 0:0:0, 1970).
     *
     * @return the ExchangeTimestamp field
     */
    public ExchangeTimestampField exchangeTimestamp() {
        return exchangeTimestamp;
    }

    /**
     * "Y" = Opening Trade, "N" = Not Opening Trade.
     *
     * @return the OpeningTrade field
     */
    public OpeningTradeField openingTrade() {
        return openingTrade;
    }

    /**
     * "Y" = CCP Session Trade, "N" = Not CCP Session Trade.
     *
     * @return the CcpSessionTrade field
     */
    public CcpSessionTradeField ccpSessionTrade() {
        return ccpSessionTrade;
    }

    /**
     * To indicate which trades are MOC or LOC trades. "Y" = MOC or LOC trade, "N" = Not MOC or LOC trade.
     *
     * @return the MocTradeMarker field
     */
    public MocTradeMarkerField mocTradeMarker() {
        return mocTradeMarker;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!executedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedQuantityField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!executionPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionPriceField.BYTE_LENGTH;
        if (!matchNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MatchNumberField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!contraFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += ContraFirmIdField.BYTE_LENGTH;
        if (!settlementTerm.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTermField.BYTE_LENGTH;
        if (!tradeAttribute.parse(data, cursor)) {
            return false;
        }
        cursor += TradeAttributeField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        if (!oddLotFlag.parse(data, cursor)) {
            return false;
        }
        cursor += OddLotFlagField.BYTE_LENGTH;
        if (!setsTheLastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += SetsTheLastPriceField.BYTE_LENGTH;
        if (!exchangeTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeTimestampField.BYTE_LENGTH;
        if (!openingTrade.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningTradeField.BYTE_LENGTH;
        if (!ccpSessionTrade.parse(data, cursor)) {
            return false;
        }
        cursor += CcpSessionTradeField.BYTE_LENGTH;
        return mocTradeMarker.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = executedQuantity.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = executionPrice.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = contraFirmId.encode(data, cursor);
        cursor = settlementTerm.encode(data, cursor);
        cursor = tradeAttribute.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = oddLotFlag.encode(data, cursor);
        cursor = setsTheLastPrice.encode(data, cursor);
        cursor = exchangeTimestamp.encode(data, cursor);
        cursor = openingTrade.encode(data, cursor);
        cursor = ccpSessionTrade.encode(data, cursor);
        cursor = mocTradeMarker.encode(data, cursor);
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "ExecutedQuantity" -> Optional.of(executedQuantity);
            case "Symbol" -> Optional.of(symbol);
            case "ExecutionPrice" -> Optional.of(executionPrice);
            case "MatchNumber" -> Optional.of(matchNumber);
            case "FirmId" -> Optional.of(firmId);
            case "ContraFirmId" -> Optional.of(contraFirmId);
            case "SettlementTerm" -> Optional.of(settlementTerm);
            case "TradeAttribute" -> Optional.of(tradeAttribute);
            case "CrossType" -> Optional.of(crossType);
            case "OddLotFlag" -> Optional.of(oddLotFlag);
            case "SetsTheLastPrice" -> Optional.of(setsTheLastPrice);
            case "ExchangeTimestamp" -> Optional.of(exchangeTimestamp);
            case "OpeningTrade" -> Optional.of(openingTrade);
            case "CcpSessionTrade" -> Optional.of(ccpSessionTrade);
            case "MocTradeMarker" -> Optional.of(mocTradeMarker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeMessage message)) {
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
        if (!(other instanceof TradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
