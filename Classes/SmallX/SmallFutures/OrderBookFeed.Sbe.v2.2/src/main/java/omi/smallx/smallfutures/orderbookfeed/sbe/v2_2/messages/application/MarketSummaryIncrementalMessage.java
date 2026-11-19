package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.ClosePriceField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.HighPriceField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.IncrementalMessageInstructionsField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentIdField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentMessageNoField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentTradingStatusField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.LowPriceField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.OpenInterestField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.OpenPriceField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.OpenPriceTypeField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.SettlementPriceField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.SettlementPriceTypeField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.TradingSessionDateField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.TransactTimeField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.Field;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.Message;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.PrintOptions;

/**
 * Represents the MarketSummaryIncrementalMessage message from the OrderBookFeed protocol.
 *
 * <p>Reflects trading session updated summary information of an instrument</p>
 */
public final class MarketSummaryIncrementalMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 75;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Summary Incremental Message";

    /**
     * Unique numeric identifier of the instrument, or of the index in the Index Snapshot Message
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Number of incremental message for the instrument. Starts with 1 on instrument creation and monotonically increases with each message sent for the instrument. In snapshot messages, the number of the instrument incremental message the snapshot reflects the instrument data for
     */
    private final InstrumentMessageNoField instrumentMessageNo = new InstrumentMessageNoField();

    /**
     * Message event timestamp; in snapshot messages, the last instrument incremental message event timestamp; in the Index Snapshot Message, the index value calculation time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Trading session business date
     */
    private final TradingSessionDateField tradingSessionDate = new TradingSessionDateField();

    /**
     * Trading session status of the instrument
     */
    private final InstrumentTradingStatusField instrumentTradingStatus = new InstrumentTradingStatusField();

    /**
     * Incremental message handling instructions flags
     */
    private final IncrementalMessageInstructionsField incrementalMessageInstructions = new IncrementalMessageInstructionsField();

    /**
     * The session opening price; can be indicative. In the Index Snapshot Message, the first index value calculated for a day
     */
    private final OpenPriceField openPrice = new OpenPriceField();

    /**
     * Open price type
     */
    private final OpenPriceTypeField openPriceType = new OpenPriceTypeField();

    /**
     * Highest traded price for the session. In the Index Snapshot Message, the highest index value for the day
     */
    private final HighPriceField highPrice = new HighPriceField();

    /**
     * Lowest trade price for the summary date. In the Index Snapshot Message, the lowest index value for the day
     */
    private final LowPriceField lowPrice = new LowPriceField();

    /**
     * Closing price for the summary date. In the Index Snapshot Message, the last index value for the day
     */
    private final ClosePriceField closePrice = new ClosePriceField();

    /**
     * Contract open interest. Total number of long (and equally short) contract positions. Published for single instruments only
     */
    private final OpenInterestField openInterest = new OpenInterestField();

    /**
     * Settlement price for the session day. Published for single instruments only
     */
    private final SettlementPriceField settlementPrice = new SettlementPriceField();

    /**
     * Settlement price type
     */
    private final SettlementPriceTypeField settlementPriceType = new SettlementPriceTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, instrumentMessageNo, transactTime, tradingSessionDate, instrumentTradingStatus, incrementalMessageInstructions, openPrice, openPriceType, highPrice, lowPrice, closePrice, openInterest, settlementPrice, settlementPriceType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique numeric identifier of the instrument, or of the index in the Index Snapshot Message
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Number of incremental message for the instrument. Starts with 1 on instrument creation and monotonically increases with each message sent for the instrument. In snapshot messages, the number of the instrument incremental message the snapshot reflects the instrument data for
     *
     * @return the InstrumentMessageNo field
     */
    public InstrumentMessageNoField instrumentMessageNo() {
        return instrumentMessageNo;
    }

    /**
     * Message event timestamp; in snapshot messages, the last instrument incremental message event timestamp; in the Index Snapshot Message, the index value calculation time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Trading session business date
     *
     * @return the TradingSessionDate field
     */
    public TradingSessionDateField tradingSessionDate() {
        return tradingSessionDate;
    }

    /**
     * Trading session status of the instrument
     *
     * @return the InstrumentTradingStatus field
     */
    public InstrumentTradingStatusField instrumentTradingStatus() {
        return instrumentTradingStatus;
    }

    /**
     * Incremental message handling instructions flags
     *
     * @return the IncrementalMessageInstructions field
     */
    public IncrementalMessageInstructionsField incrementalMessageInstructions() {
        return incrementalMessageInstructions;
    }

    /**
     * The session opening price; can be indicative. In the Index Snapshot Message, the first index value calculated for a day
     *
     * @return the OpenPrice field
     */
    public OpenPriceField openPrice() {
        return openPrice;
    }

    /**
     * Open price type
     *
     * @return the OpenPriceType field
     */
    public OpenPriceTypeField openPriceType() {
        return openPriceType;
    }

    /**
     * Highest traded price for the session. In the Index Snapshot Message, the highest index value for the day
     *
     * @return the HighPrice field
     */
    public HighPriceField highPrice() {
        return highPrice;
    }

    /**
     * Lowest trade price for the summary date. In the Index Snapshot Message, the lowest index value for the day
     *
     * @return the LowPrice field
     */
    public LowPriceField lowPrice() {
        return lowPrice;
    }

    /**
     * Closing price for the summary date. In the Index Snapshot Message, the last index value for the day
     *
     * @return the ClosePrice field
     */
    public ClosePriceField closePrice() {
        return closePrice;
    }

    /**
     * Contract open interest. Total number of long (and equally short) contract positions. Published for single instruments only
     *
     * @return the OpenInterest field
     */
    public OpenInterestField openInterest() {
        return openInterest;
    }

    /**
     * Settlement price for the session day. Published for single instruments only
     *
     * @return the SettlementPrice field
     */
    public SettlementPriceField settlementPrice() {
        return settlementPrice;
    }

    /**
     * Settlement price type
     *
     * @return the SettlementPriceType field
     */
    public SettlementPriceTypeField settlementPriceType() {
        return settlementPriceType;
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
        return Optional.ofNullable(transactTime.value());
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
        if (!instrumentMessageNo.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentMessageNoField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!tradingSessionDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionDateField.BYTE_LENGTH;
        if (!instrumentTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTradingStatusField.BYTE_LENGTH;
        if (!incrementalMessageInstructions.parse(data, cursor)) {
            return false;
        }
        cursor += IncrementalMessageInstructionsField.BYTE_LENGTH;
        if (!openPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OpenPriceField.BYTE_LENGTH;
        if (!openPriceType.parse(data, cursor)) {
            return false;
        }
        cursor += OpenPriceTypeField.BYTE_LENGTH;
        if (!highPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceField.BYTE_LENGTH;
        if (!lowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceField.BYTE_LENGTH;
        if (!closePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ClosePriceField.BYTE_LENGTH;
        if (!openInterest.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestField.BYTE_LENGTH;
        if (!settlementPrice.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPriceField.BYTE_LENGTH;
        return settlementPriceType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = instrumentMessageNo.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = tradingSessionDate.encode(data, cursor);
        cursor = instrumentTradingStatus.encode(data, cursor);
        cursor = incrementalMessageInstructions.encode(data, cursor);
        cursor = openPrice.encode(data, cursor);
        cursor = openPriceType.encode(data, cursor);
        cursor = highPrice.encode(data, cursor);
        cursor = lowPrice.encode(data, cursor);
        cursor = closePrice.encode(data, cursor);
        cursor = openInterest.encode(data, cursor);
        cursor = settlementPrice.encode(data, cursor);
        cursor = settlementPriceType.encode(data, cursor);
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
            case "InstrumentMessageNo" -> Optional.of(instrumentMessageNo);
            case "TransactTime" -> Optional.of(transactTime);
            case "TradingSessionDate" -> Optional.of(tradingSessionDate);
            case "InstrumentTradingStatus" -> Optional.of(instrumentTradingStatus);
            case "IncrementalMessageInstructions" -> Optional.of(incrementalMessageInstructions);
            case "OpenPrice" -> Optional.of(openPrice);
            case "OpenPriceType" -> Optional.of(openPriceType);
            case "HighPrice" -> Optional.of(highPrice);
            case "LowPrice" -> Optional.of(lowPrice);
            case "ClosePrice" -> Optional.of(closePrice);
            case "OpenInterest" -> Optional.of(openInterest);
            case "SettlementPrice" -> Optional.of(settlementPrice);
            case "SettlementPriceType" -> Optional.of(settlementPriceType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketSummaryIncrementalMessage message)) {
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
        if (!(other instanceof MarketSummaryIncrementalMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
