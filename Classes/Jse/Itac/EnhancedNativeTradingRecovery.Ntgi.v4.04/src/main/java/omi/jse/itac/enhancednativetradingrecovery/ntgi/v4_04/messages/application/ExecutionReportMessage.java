package omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.AccountField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.ClientOrderIdField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.ExecutedPriceField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.ExecutedQuantityField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.ExecutionIdField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.ExecutionInstructionField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.ExecutionTypeField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.IndicatorFlagsField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.IsMarketOpsRequestField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.LastOptPxField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.LeavesQuantityField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.MultiLegReportingTypeField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.OrderBookField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.OrderIdField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.OrderStatusField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.PartitionIdField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.RejectCodeField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.SecondaryTradeReportIdField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.SecurityIdField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.SequenceNumberField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.SideField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.TraderMnemonicField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.VolatilityField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.WorkingIndicatorField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.structs.TransactTime;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.types.Field;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.types.Message;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.types.PrintOptions;

/**
 * Represents the ExecutionReportMessage message from the EnhancedNativeTradingRecovery protocol.
 *
 * <p>Indicates the status of an order.</p>
 */
public final class ExecutionReportMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '8';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 152;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Report Message";

    /**
     * Identity of the matching partition the request relates to
     */
    private final PartitionIdField partitionId = new PartitionIdField();

    /**
     * Sequence number immediately after that of the last message received from the partition
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Unique Identifier of the Execution Report
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * Client specified identifier of the rejected message if it is available
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Server specified identifier of the order
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Execution Type of the order
     */
    private final ExecutionTypeField executionType = new ExecutionTypeField();

    /**
     * Status of the order
     */
    private final OrderStatusField orderStatus = new OrderStatusField();

    /**
     * Will be zero or three if login is accepted
     */
    private final RejectCodeField rejectCode = new RejectCodeField();

    /**
     * Executed price of the trade in Zac
     */
    private final ExecutedPriceField executedPrice = new ExecutedPriceField();

    /**
     * Executed quantity
     */
    private final ExecutedQuantityField executedQuantity = new ExecutedQuantityField();

    /**
     * Quantity available for further execution
     */
    private final LeavesQuantityField leavesQuantity = new LeavesQuantityField();

    /**
     * Whether the order is currently being worked on
     */
    private final WorkingIndicatorField workingIndicator = new WorkingIndicatorField();

    /**
     * Identifier of the instrument the Execution Report is sent for
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Side of the order
     */
    private final SideField side = new SideField();

    /**
     * Concatenated identifier of the Trader Group and the JSE Trader ID
     */
    private final TraderMnemonicField traderMnemonic = new TraderMnemonicField();

    /**
     * Client Account information
     */
    private final AccountField account = new AccountField();

    /**
     * Whether the request was submitted by Market Operations
     */
    private final IsMarketOpsRequestField isMarketOpsRequest = new IsMarketOpsRequestField();

    /**
     * Order book the order belongs to
     */
    private final OrderBookField orderBook = new OrderBookField();

    /**
     * Whether hidden limit orders are excluded
     */
    private final ExecutionInstructionField executionInstruction = new ExecutionInstructionField();

    /**
     * Type of trade
     */
    private final MultiLegReportingTypeField multiLegReportingType = new MultiLegReportingTypeField();

    /**
     * Price or Converted volatility of the executed options instrument
     */
    private final LastOptPxField lastOptPx = new LastOptPxField();

    /**
     * Volatility or Converted Volatility of the executed price of the options instrument
     */
    private final VolatilityField volatility = new VolatilityField();

    /**
     * Client specified additional order identifier of the new order or order cancel replace request
     */
    private final SecondaryTradeReportIdField secondaryTradeReportId = new SecondaryTradeReportIdField();

    /**
     * Aggressor or passive side of the trade
     */
    private final IndicatorFlagsField indicatorFlags = new IndicatorFlagsField();

    /**
     * Time the Execution Report was generated
     */
    private final TransactTime transactTime = new TransactTime();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(partitionId), List.<Field>of(sequenceNumber), List.<Field>of(executionId), List.<Field>of(clientOrderId), List.<Field>of(orderId), List.<Field>of(executionType), List.<Field>of(orderStatus), List.<Field>of(rejectCode), List.<Field>of(executedPrice), List.<Field>of(executedQuantity), List.<Field>of(leavesQuantity), List.<Field>of(workingIndicator), List.<Field>of(securityId), List.<Field>of(side), List.<Field>of(traderMnemonic), List.<Field>of(account), List.<Field>of(isMarketOpsRequest), transactTime.fields(), List.<Field>of(orderBook), List.<Field>of(executionInstruction), List.<Field>of(multiLegReportingType), List.<Field>of(lastOptPx), List.<Field>of(volatility), List.<Field>of(secondaryTradeReportId), List.<Field>of(indicatorFlags)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identity of the matching partition the request relates to
     *
     * @return the PartitionId field
     */
    public PartitionIdField partitionId() {
        return partitionId;
    }

    /**
     * Sequence number immediately after that of the last message received from the partition
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Unique Identifier of the Execution Report
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
    }

    /**
     * Client specified identifier of the rejected message if it is available
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * Server specified identifier of the order
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Execution Type of the order
     *
     * @return the ExecutionType field
     */
    public ExecutionTypeField executionType() {
        return executionType;
    }

    /**
     * Status of the order
     *
     * @return the OrderStatus field
     */
    public OrderStatusField orderStatus() {
        return orderStatus;
    }

    /**
     * Will be zero or three if login is accepted
     *
     * @return the RejectCode field
     */
    public RejectCodeField rejectCode() {
        return rejectCode;
    }

    /**
     * Executed price of the trade in Zac
     *
     * @return the ExecutedPrice field
     */
    public ExecutedPriceField executedPrice() {
        return executedPrice;
    }

    /**
     * Executed quantity
     *
     * @return the ExecutedQuantity field
     */
    public ExecutedQuantityField executedQuantity() {
        return executedQuantity;
    }

    /**
     * Quantity available for further execution
     *
     * @return the LeavesQuantity field
     */
    public LeavesQuantityField leavesQuantity() {
        return leavesQuantity;
    }

    /**
     * Whether the order is currently being worked on
     *
     * @return the WorkingIndicator field
     */
    public WorkingIndicatorField workingIndicator() {
        return workingIndicator;
    }

    /**
     * Identifier of the instrument the Execution Report is sent for
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Side of the order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Concatenated identifier of the Trader Group and the JSE Trader ID
     *
     * @return the TraderMnemonic field
     */
    public TraderMnemonicField traderMnemonic() {
        return traderMnemonic;
    }

    /**
     * Client Account information
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Whether the request was submitted by Market Operations
     *
     * @return the IsMarketOpsRequest field
     */
    public IsMarketOpsRequestField isMarketOpsRequest() {
        return isMarketOpsRequest;
    }

    /**
     * Order book the order belongs to
     *
     * @return the OrderBook field
     */
    public OrderBookField orderBook() {
        return orderBook;
    }

    /**
     * Whether hidden limit orders are excluded
     *
     * @return the ExecutionInstruction field
     */
    public ExecutionInstructionField executionInstruction() {
        return executionInstruction;
    }

    /**
     * Type of trade
     *
     * @return the MultiLegReportingType field
     */
    public MultiLegReportingTypeField multiLegReportingType() {
        return multiLegReportingType;
    }

    /**
     * Price or Converted volatility of the executed options instrument
     *
     * @return the LastOptPx field
     */
    public LastOptPxField lastOptPx() {
        return lastOptPx;
    }

    /**
     * Volatility or Converted Volatility of the executed price of the options instrument
     *
     * @return the Volatility field
     */
    public VolatilityField volatility() {
        return volatility;
    }

    /**
     * Client specified additional order identifier of the new order or order cancel replace request
     *
     * @return the SecondaryTradeReportId field
     */
    public SecondaryTradeReportIdField secondaryTradeReportId() {
        return secondaryTradeReportId;
    }

    /**
     * Aggressor or passive side of the trade
     *
     * @return the IndicatorFlags field
     */
    public IndicatorFlagsField indicatorFlags() {
        return indicatorFlags;
    }

    /**
     * Time the Execution Report was generated
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
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!executionType.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionTypeField.BYTE_LENGTH;
        if (!orderStatus.parse(data, cursor)) {
            return false;
        }
        cursor += OrderStatusField.BYTE_LENGTH;
        if (!rejectCode.parse(data, cursor)) {
            return false;
        }
        cursor += RejectCodeField.BYTE_LENGTH;
        if (!executedPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedPriceField.BYTE_LENGTH;
        if (!executedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedQuantityField.BYTE_LENGTH;
        if (!leavesQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQuantityField.BYTE_LENGTH;
        if (!workingIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += WorkingIndicatorField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!traderMnemonic.parse(data, cursor)) {
            return false;
        }
        cursor += TraderMnemonicField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!isMarketOpsRequest.parse(data, cursor)) {
            return false;
        }
        cursor += IsMarketOpsRequestField.BYTE_LENGTH;
        if (!transactTime.parseFrom(data, cursor, end - 30)) {
            return false;
        }
        cursor += transactTime.byteLength();
        if (!orderBook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookField.BYTE_LENGTH;
        if (!executionInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionInstructionField.BYTE_LENGTH;
        if (!multiLegReportingType.parse(data, cursor)) {
            return false;
        }
        cursor += MultiLegReportingTypeField.BYTE_LENGTH;
        if (!lastOptPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastOptPxField.BYTE_LENGTH;
        if (!volatility.parse(data, cursor)) {
            return false;
        }
        cursor += VolatilityField.BYTE_LENGTH;
        if (!secondaryTradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryTradeReportIdField.BYTE_LENGTH;
        return indicatorFlags.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = partitionId.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = executionType.encode(data, cursor);
        cursor = orderStatus.encode(data, cursor);
        cursor = rejectCode.encode(data, cursor);
        cursor = executedPrice.encode(data, cursor);
        cursor = executedQuantity.encode(data, cursor);
        cursor = leavesQuantity.encode(data, cursor);
        cursor = workingIndicator.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = traderMnemonic.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = isMarketOpsRequest.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = orderBook.encode(data, cursor);
        cursor = executionInstruction.encode(data, cursor);
        cursor = multiLegReportingType.encode(data, cursor);
        cursor = lastOptPx.encode(data, cursor);
        cursor = volatility.encode(data, cursor);
        cursor = secondaryTradeReportId.encode(data, cursor);
        cursor = indicatorFlags.encode(data, cursor);
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
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "OrderId" -> Optional.of(orderId);
            case "ExecutionType" -> Optional.of(executionType);
            case "OrderStatus" -> Optional.of(orderStatus);
            case "RejectCode" -> Optional.of(rejectCode);
            case "ExecutedPrice" -> Optional.of(executedPrice);
            case "ExecutedQuantity" -> Optional.of(executedQuantity);
            case "LeavesQuantity" -> Optional.of(leavesQuantity);
            case "WorkingIndicator" -> Optional.of(workingIndicator);
            case "SecurityId" -> Optional.of(securityId);
            case "Side" -> Optional.of(side);
            case "TraderMnemonic" -> Optional.of(traderMnemonic);
            case "Account" -> Optional.of(account);
            case "IsMarketOpsRequest" -> Optional.of(isMarketOpsRequest);
            case "OrderBook" -> Optional.of(orderBook);
            case "ExecutionInstruction" -> Optional.of(executionInstruction);
            case "MultiLegReportingType" -> Optional.of(multiLegReportingType);
            case "LastOptPx" -> Optional.of(lastOptPx);
            case "Volatility" -> Optional.of(volatility);
            case "SecondaryTradeReportId" -> Optional.of(secondaryTradeReportId);
            case "IndicatorFlags" -> Optional.of(indicatorFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionReportMessage message)) {
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
        if (!(other instanceof ExecutionReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
