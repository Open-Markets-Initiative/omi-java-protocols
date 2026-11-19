package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.IncrementalMessageInstructionsField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentIdField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentMessageNoField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.InstrumentTradingStatusField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.LastTradePriceField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.LastTradeSizeField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.LastTradeTimeTimestampOptionalField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.TotalVolumeQuantityField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.TradingSessionDateField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields.TransactTimeField;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.structs.IncrementalTradeGroups;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.Field;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.Message;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.PrintOptions;

/**
 * Represents the TradesIncrementalMessage message from the OrderBookFeed protocol.
 *
 * <p>Represents a set of trades for a single instrument resulting from a business event processing</p>
 */
public final class TradesIncrementalMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 60;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trades Incremental Message";

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
     * Last traded price for the instrument
     */
    private final LastTradePriceField lastTradePrice = new LastTradePriceField();

    /**
     * Size of the last trade
     */
    private final LastTradeSizeField lastTradeSize = new LastTradeSizeField();

    /**
     * Timestamp of the last trade for the day
     */
    private final LastTradeTimeTimestampOptionalField lastTradeTimeTimestampOptional = new LastTradeTimeTimestampOptionalField();

    /**
     * Total day traded volume for the instrument
     */
    private final TotalVolumeQuantityField totalVolumeQuantity = new TotalVolumeQuantityField();

    /**
     * Trades repeating group
     */
    private final IncrementalTradeGroups incrementalTradeGroups = new IncrementalTradeGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, instrumentMessageNo, transactTime, tradingSessionDate, instrumentTradingStatus, incrementalMessageInstructions, lastTradePrice, lastTradeSize, lastTradeTimeTimestampOptional, totalVolumeQuantity);

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
     * Last traded price for the instrument
     *
     * @return the LastTradePrice field
     */
    public LastTradePriceField lastTradePrice() {
        return lastTradePrice;
    }

    /**
     * Size of the last trade
     *
     * @return the LastTradeSize field
     */
    public LastTradeSizeField lastTradeSize() {
        return lastTradeSize;
    }

    /**
     * Timestamp of the last trade for the day
     *
     * @return the LastTradeTimeTimestampOptional field
     */
    public LastTradeTimeTimestampOptionalField lastTradeTimeTimestampOptional() {
        return lastTradeTimeTimestampOptional;
    }

    /**
     * Total day traded volume for the instrument
     *
     * @return the TotalVolumeQuantity field
     */
    public TotalVolumeQuantityField totalVolumeQuantity() {
        return totalVolumeQuantity;
    }

    /**
     * Trades repeating group
     *
     * @return the IncrementalTradeGroups record
     */
    public IncrementalTradeGroups incrementalTradeGroups() {
        return incrementalTradeGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + incrementalTradeGroups.byteLength() - IncrementalTradeGroups.MINIMUM_BYTE_LENGTH;
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
        if (!lastTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradePriceField.BYTE_LENGTH;
        if (!lastTradeSize.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeSizeField.BYTE_LENGTH;
        if (!lastTradeTimeTimestampOptional.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeTimeTimestampOptionalField.BYTE_LENGTH;
        if (!totalVolumeQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeQuantityField.BYTE_LENGTH;
        if (!incrementalTradeGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += incrementalTradeGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = instrumentMessageNo.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = tradingSessionDate.encode(data, cursor);
        cursor = instrumentTradingStatus.encode(data, cursor);
        cursor = incrementalMessageInstructions.encode(data, cursor);
        cursor = lastTradePrice.encode(data, cursor);
        cursor = lastTradeSize.encode(data, cursor);
        cursor = lastTradeTimeTimestampOptional.encode(data, cursor);
        cursor = totalVolumeQuantity.encode(data, cursor);
        cursor = incrementalTradeGroups.encode(data, cursor);
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
        incrementalTradeGroups.clear();
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
        return incrementalTradeGroups.isRecognized();
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
        if (!incrementalTradeGroups.isValid()) {
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
        if (!instrumentMessageNo.isDecoded()) {
            return Optional.of(instrumentMessageNo);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!tradingSessionDate.isDecoded()) {
            return Optional.of(tradingSessionDate);
        }
        if (!instrumentTradingStatus.isDecoded()) {
            return Optional.of(instrumentTradingStatus);
        }
        if (!incrementalMessageInstructions.isDecoded()) {
            return Optional.of(incrementalMessageInstructions);
        }
        if (!lastTradePrice.isDecoded()) {
            return Optional.of(lastTradePrice);
        }
        if (!lastTradeSize.isDecoded()) {
            return Optional.of(lastTradeSize);
        }
        if (!lastTradeTimeTimestampOptional.isDecoded()) {
            return Optional.of(lastTradeTimeTimestampOptional);
        }
        if (!totalVolumeQuantity.isDecoded()) {
            return Optional.of(totalVolumeQuantity);
        }
        if (!incrementalTradeGroups.isDecoded()) {
            return incrementalTradeGroups.failedAt();
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
            case "LastTradePrice" -> Optional.of(lastTradePrice);
            case "LastTradeSize" -> Optional.of(lastTradeSize);
            case "LastTradeTimeTimestampOptional" -> Optional.of(lastTradeTimeTimestampOptional);
            case "TotalVolumeQuantity" -> Optional.of(totalVolumeQuantity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradesIncrementalMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(incrementalTradeGroups.diffFields(message.incrementalTradeGroups));
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
            incrementalTradeGroups.toFormattedString(builder, options);
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
        incrementalTradeGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof TradesIncrementalMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && incrementalTradeGroups.equals(message.incrementalTradeGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, incrementalTradeGroups);
    }
}
