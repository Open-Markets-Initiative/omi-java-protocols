package omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.AvgPxField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.CapacityField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ClearingAccountField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ContraFirmField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ContraOrderBookField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ExecutedPriceField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ExecutedQuantityField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ExecutionIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ExecutionReportRefIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ExecutionTypeField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.InstrumentIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.LastMarketField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.LeavesQuantityField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.OrderIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.PartitionIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.RfqExecutionReportOrderStatusField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.RfqIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.SequenceNumberField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.SideField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.TradeMatchIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.WaiverFlagsField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.structs.TransactTime;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.Message;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.PrintOptions;

/**
 * Represents the RfqExecutionReportMessage message from the NativeTradingGatewayRecovery protocol.
 *
 * <p>Allows the system to notify the Requester and the Market Maker about a trade or the status of the quote.</p>
 */
public final class RfqExecutionReportMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'g';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 153;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Rfq Execution Report Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 69, 8, 77, 8, 94, 8, 102, 8, 146, 7 };

    /**
     * The server will stamp the identifier of the matching partition for the instrument
     */
    private final PartitionIdField partitionId = new PartitionIdField();

    /**
     * The server will stamp the message sequence number of the matching partition.
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Unique ID of the Execution Report.
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * The unique identifier of the initial RFQ automatically generated via the server.
     */
    private final RfqIdField rfqId = new RfqIdField();

    /**
     * Unique identifier of the order assigned by the matching system.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Execution Type
     */
    private final ExecutionTypeField executionType = new ExecutionTypeField();

    /**
     * Identifier of the trade.
     */
    private final TradeMatchIdField tradeMatchId = new TradeMatchIdField();

    /**
     * Side of the order.
     */
    private final SideField side = new SideField();

    /**
     * Quantity executed.
     */
    private final ExecutedQuantityField executedQuantity = new ExecutedQuantityField();

    /**
     * Value of this fill.
     */
    private final ExecutedPriceField executedPrice = new ExecutedPriceField();

    /**
     * Rfq Execution Report Order Status
     */
    private final RfqExecutionReportOrderStatusField rfqExecutionReportOrderStatus = new RfqExecutionReportOrderStatusField();

    /**
     * Remaining quantity of the quote.
     */
    private final LeavesQuantityField leavesQuantity = new LeavesQuantityField();

    /**
     * Identifier of the instrument the Execution Report is sent for.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * For Named Models only, the server will stamp the Firm ID of the Requester to send to the Market Maker.
     */
    private final ContraFirmField contraFirm = new ContraFirmField();

    /**
     * Capacity of the order.
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Clearing Account Type.
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Pre-trade waiver flags
     */
    private final WaiverFlagsField waiverFlags = new WaiverFlagsField();

    /**
     * Reference to the trade being cancelled or corrected.
     */
    private final ExecutionReportRefIdField executionReportRefId = new ExecutionReportRefIdField();

    /**
     * Identifier of the order book of the contra party of an RFQ execution.
     */
    private final ContraOrderBookField contraOrderBook = new ContraOrderBookField();

    /**
     * Volume Weighted Average Price of all the executions reported so far for an RFQ on the requestor side and it will be the executed price on the quote side.
     */
    private final AvgPxField avgPx = new AvgPxField();

    /**
     * Market (Segment MIC) where execution took place.
     */
    private final LastMarketField lastMarket = new LastMarketField();

    /**
     * Composite
     */
    private final TransactTime transactTime = new TransactTime();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(partitionId), List.<Field>of(sequenceNumber), List.<Field>of(executionId), List.<Field>of(rfqId), List.<Field>of(orderId), List.<Field>of(executionType), List.<Field>of(tradeMatchId), List.<Field>of(side), List.<Field>of(executedQuantity), List.<Field>of(executedPrice), transactTime.fields(), List.<Field>of(rfqExecutionReportOrderStatus), List.<Field>of(leavesQuantity), List.<Field>of(instrumentId), List.<Field>of(contraFirm), List.<Field>of(capacity), List.<Field>of(clearingAccount), List.<Field>of(waiverFlags), List.<Field>of(executionReportRefId), List.<Field>of(contraOrderBook), List.<Field>of(avgPx), List.<Field>of(lastMarket)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * The server will stamp the identifier of the matching partition for the instrument
     *
     * @return the PartitionId field
     */
    public PartitionIdField partitionId() {
        return partitionId;
    }

    /**
     * The server will stamp the message sequence number of the matching partition.
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Unique ID of the Execution Report.
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
    }

    /**
     * The unique identifier of the initial RFQ automatically generated via the server.
     *
     * @return the RfqId field
     */
    public RfqIdField rfqId() {
        return rfqId;
    }

    /**
     * Unique identifier of the order assigned by the matching system.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Execution Type
     *
     * @return the ExecutionType field
     */
    public ExecutionTypeField executionType() {
        return executionType;
    }

    /**
     * Identifier of the trade.
     *
     * @return the TradeMatchId field
     */
    public TradeMatchIdField tradeMatchId() {
        return tradeMatchId;
    }

    /**
     * Side of the order.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Quantity executed.
     *
     * @return the ExecutedQuantity field
     */
    public ExecutedQuantityField executedQuantity() {
        return executedQuantity;
    }

    /**
     * Value of this fill.
     *
     * @return the ExecutedPrice field
     */
    public ExecutedPriceField executedPrice() {
        return executedPrice;
    }

    /**
     * Rfq Execution Report Order Status
     *
     * @return the RfqExecutionReportOrderStatus field
     */
    public RfqExecutionReportOrderStatusField rfqExecutionReportOrderStatus() {
        return rfqExecutionReportOrderStatus;
    }

    /**
     * Remaining quantity of the quote.
     *
     * @return the LeavesQuantity field
     */
    public LeavesQuantityField leavesQuantity() {
        return leavesQuantity;
    }

    /**
     * Identifier of the instrument the Execution Report is sent for.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * For Named Models only, the server will stamp the Firm ID of the Requester to send to the Market Maker.
     *
     * @return the ContraFirm field
     */
    public ContraFirmField contraFirm() {
        return contraFirm;
    }

    /**
     * Capacity of the order.
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Clearing Account Type.
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * Pre-trade waiver flags
     *
     * @return the WaiverFlags field
     */
    public WaiverFlagsField waiverFlags() {
        return waiverFlags;
    }

    /**
     * Reference to the trade being cancelled or corrected.
     *
     * @return the ExecutionReportRefId field
     */
    public ExecutionReportRefIdField executionReportRefId() {
        return executionReportRefId;
    }

    /**
     * Identifier of the order book of the contra party of an RFQ execution.
     *
     * @return the ContraOrderBook field
     */
    public ContraOrderBookField contraOrderBook() {
        return contraOrderBook;
    }

    /**
     * Volume Weighted Average Price of all the executions reported so far for an RFQ on the requestor side and it will be the executed price on the quote side.
     *
     * @return the AvgPx field
     */
    public AvgPxField avgPx() {
        return avgPx;
    }

    /**
     * Market (Segment MIC) where execution took place.
     *
     * @return the LastMarket field
     */
    public LastMarketField lastMarket() {
        return lastMarket;
    }

    /**
     * Composite
     *
     * @return the TransactTime record
     */
    public TransactTime transactTime() {
        return transactTime;
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
        return PADDING.clone();
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
        if (!partitionId.parse(data, cursor)) {
            return false;
        }
        cursor += PartitionIdField.BYTE_LENGTH;
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!executionId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionIdField.BYTE_LENGTH;
        if (!rfqId.parse(data, cursor)) {
            return false;
        }
        cursor += RfqIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!executionType.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionTypeField.BYTE_LENGTH;
        if (!tradeMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeMatchIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!executedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedQuantityField.BYTE_LENGTH;
        if (!executedPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedPriceField.BYTE_LENGTH;
        if (!transactTime.parseFrom(data, cursor, end - 84)) {
            return false;
        }
        cursor += transactTime.byteLength();
        cursor += 16; // padding
        if (!rfqExecutionReportOrderStatus.parse(data, cursor)) {
            return false;
        }
        cursor += RfqExecutionReportOrderStatusField.BYTE_LENGTH;
        if (!leavesQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQuantityField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        cursor += 16; // padding
        if (!contraFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ContraFirmField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!waiverFlags.parse(data, cursor)) {
            return false;
        }
        cursor += WaiverFlagsField.BYTE_LENGTH;
        if (!executionReportRefId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionReportRefIdField.BYTE_LENGTH;
        if (!contraOrderBook.parse(data, cursor)) {
            return false;
        }
        cursor += ContraOrderBookField.BYTE_LENGTH;
        if (!avgPx.parse(data, cursor)) {
            return false;
        }
        cursor += AvgPxField.BYTE_LENGTH;
        if (!lastMarket.parse(data, cursor)) {
            return false;
        }
        cursor += LastMarketField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = partitionId.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = rfqId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = executionType.encode(data, cursor);
        cursor = tradeMatchId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = executedQuantity.encode(data, cursor);
        cursor = executedPrice.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        if (buffer != null && buffer.length >= 85) {
            System.arraycopy(buffer, 69, data, cursor, 16); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 16, (byte) 0); // padding
        }
        cursor += 16;
        cursor = rfqExecutionReportOrderStatus.encode(data, cursor);
        cursor = leavesQuantity.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        if (buffer != null && buffer.length >= 110) {
            System.arraycopy(buffer, 94, data, cursor, 16); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 16, (byte) 0); // padding
        }
        cursor += 16;
        cursor = contraFirm.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = waiverFlags.encode(data, cursor);
        cursor = executionReportRefId.encode(data, cursor);
        cursor = contraOrderBook.encode(data, cursor);
        cursor = avgPx.encode(data, cursor);
        cursor = lastMarket.encode(data, cursor);
        if (buffer != null && buffer.length >= 153) {
            System.arraycopy(buffer, 146, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
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
        transactTime.clear();
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
            case "PartitionId" -> Optional.of(partitionId);
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "ExecutionId" -> Optional.of(executionId);
            case "RfqId" -> Optional.of(rfqId);
            case "OrderId" -> Optional.of(orderId);
            case "ExecutionType" -> Optional.of(executionType);
            case "TradeMatchId" -> Optional.of(tradeMatchId);
            case "Side" -> Optional.of(side);
            case "ExecutedQuantity" -> Optional.of(executedQuantity);
            case "ExecutedPrice" -> Optional.of(executedPrice);
            case "RfqExecutionReportOrderStatus" -> Optional.of(rfqExecutionReportOrderStatus);
            case "LeavesQuantity" -> Optional.of(leavesQuantity);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "ContraFirm" -> Optional.of(contraFirm);
            case "Capacity" -> Optional.of(capacity);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "WaiverFlags" -> Optional.of(waiverFlags);
            case "ExecutionReportRefId" -> Optional.of(executionReportRefId);
            case "ContraOrderBook" -> Optional.of(contraOrderBook);
            case "AvgPx" -> Optional.of(avgPx);
            case "LastMarket" -> Optional.of(lastMarket);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RfqExecutionReportMessage message)) {
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
        if (!(other instanceof RfqExecutionReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
