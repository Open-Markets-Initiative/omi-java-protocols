package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.AccountField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.ClordidField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.CrossidOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.ExecIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.ExpireDateField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.MarketSegmentReceivedTimeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.MaxFloorField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.MinQtyField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.MultiLegReportingTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.OrdStatusField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.OrderIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.OrderQtyField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.OrdtypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.PriceOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.ProtectionPriceField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.SecondaryOrderIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.SideField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.StopPxField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.TimeInForceField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.TradeDateField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.TransactTimeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.WorkingIndicatorField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.structs.DeskId;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.structs.Memo;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.structs.OutboundBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.types.PrintOptions;

/**
 * Represents the ExecutionReportNewMessage message from the BinaryEntryPoint protocol.
 *
 * <p>ExecutionReport_NewMessage</p>
 */
public final class ExecutionReportNewMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 146;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Report New Message";

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * ordStatus
     */
    private final OrdStatusField ordStatus = new OrdStatusField();

    /**
     * clOrdID
     */
    private final ClordidField clordid = new ClordidField();

    /**
     * secondaryOrderID
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * orderID
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * account
     */
    private final AccountField account = new AccountField();

    /**
     * execID
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * marketSegmentReceivedTime
     */
    private final MarketSegmentReceivedTimeField marketSegmentReceivedTime = new MarketSegmentReceivedTimeField();

    /**
     * protectionPrice
     */
    private final ProtectionPriceField protectionPrice = new ProtectionPriceField();

    /**
     * tradeDate
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * workingIndicator
     */
    private final WorkingIndicatorField workingIndicator = new WorkingIndicatorField();

    /**
     * multiLegReportingType
     */
    private final MultiLegReportingTypeField multiLegReportingType = new MultiLegReportingTypeField();

    /**
     * ordType
     */
    private final OrdtypeField ordtype = new OrdtypeField();

    /**
     * timeInForce
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * expireDate
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * orderQty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * price
     */
    private final PriceOptionalField priceOptional = new PriceOptionalField();

    /**
     * stopPx
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * minQty
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * maxFloor
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * crossID
     */
    private final CrossidOptionalField crossidOptional = new CrossidOptionalField();

    /**
     * OutboundBusinessHeader
     */
    private final OutboundBusinessHeader outboundBusinessHeader = new OutboundBusinessHeader();

    /**
     * deskID data struct
     */
    private final DeskId deskId = new DeskId();

    /**
     * memo data struct
     */
    private final Memo memo = new Memo();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(outboundBusinessHeader.fields(), List.<Field>of(side), List.<Field>of(ordStatus), List.<Field>of(clordid), List.<Field>of(secondaryOrderId), List.<Field>of(securityId), List.<Field>of(orderId), List.<Field>of(account), List.<Field>of(execId), List.<Field>of(transactTime), List.<Field>of(marketSegmentReceivedTime), List.<Field>of(protectionPrice), List.<Field>of(tradeDate), List.<Field>of(workingIndicator), List.<Field>of(multiLegReportingType), List.<Field>of(ordtype), List.<Field>of(timeInForce), List.<Field>of(expireDate), List.<Field>of(orderQty), List.<Field>of(priceOptional), List.<Field>of(stopPx), List.<Field>of(minQty), List.<Field>of(maxFloor), List.<Field>of(crossidOptional), deskId.fields(), memo.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * ordStatus
     *
     * @return the OrdStatus field
     */
    public OrdStatusField ordStatus() {
        return ordStatus;
    }

    /**
     * clOrdID
     *
     * @return the Clordid field
     */
    public ClordidField clordid() {
        return clordid;
    }

    /**
     * secondaryOrderID
     *
     * @return the SecondaryOrderId field
     */
    public SecondaryOrderIdField secondaryOrderId() {
        return secondaryOrderId;
    }

    /**
     * securityID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * orderID
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * execID
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * transactTime
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * marketSegmentReceivedTime
     *
     * @return the MarketSegmentReceivedTime field
     */
    public MarketSegmentReceivedTimeField marketSegmentReceivedTime() {
        return marketSegmentReceivedTime;
    }

    /**
     * protectionPrice
     *
     * @return the ProtectionPrice field
     */
    public ProtectionPriceField protectionPrice() {
        return protectionPrice;
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
     * workingIndicator
     *
     * @return the WorkingIndicator field
     */
    public WorkingIndicatorField workingIndicator() {
        return workingIndicator;
    }

    /**
     * multiLegReportingType
     *
     * @return the MultiLegReportingType field
     */
    public MultiLegReportingTypeField multiLegReportingType() {
        return multiLegReportingType;
    }

    /**
     * ordType
     *
     * @return the Ordtype field
     */
    public OrdtypeField ordtype() {
        return ordtype;
    }

    /**
     * timeInForce
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * expireDate
     *
     * @return the ExpireDate field
     */
    public ExpireDateField expireDate() {
        return expireDate;
    }

    /**
     * orderQty
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * price
     *
     * @return the PriceOptional field
     */
    public PriceOptionalField priceOptional() {
        return priceOptional;
    }

    /**
     * stopPx
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * minQty
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * maxFloor
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
    }

    /**
     * crossID
     *
     * @return the CrossidOptional field
     */
    public CrossidOptionalField crossidOptional() {
        return crossidOptional;
    }

    /**
     * OutboundBusinessHeader
     *
     * @return the OutboundBusinessHeader record
     */
    public OutboundBusinessHeader outboundBusinessHeader() {
        return outboundBusinessHeader;
    }

    /**
     * deskID data struct
     *
     * @return the DeskId record
     */
    public DeskId deskId() {
        return deskId;
    }

    /**
     * memo data struct
     *
     * @return the Memo record
     */
    public Memo memo() {
        return memo;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + deskId.byteLength() - DeskId.MINIMUM_BYTE_LENGTH + memo.byteLength() - Memo.MINIMUM_BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        for (int[] run = OutboundBusinessHeader.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += OutboundBusinessHeader.BYTE_LENGTH;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 2;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor = deskId.padding(runs, cursor);
        cursor = memo.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(outboundBusinessHeader.sendingTime().value());
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
        if (!outboundBusinessHeader.parseFrom(data, cursor, end - 128)) {
            return false;
        }
        cursor += outboundBusinessHeader.byteLength();
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!ordStatus.parse(data, cursor)) {
            return false;
        }
        cursor += OrdStatusField.BYTE_LENGTH;
        if (!clordid.parse(data, cursor)) {
            return false;
        }
        cursor += ClordidField.BYTE_LENGTH;
        if (!secondaryOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryOrderIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!marketSegmentReceivedTime.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentReceivedTimeField.BYTE_LENGTH;
        if (!protectionPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ProtectionPriceField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!workingIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += WorkingIndicatorField.BYTE_LENGTH;
        if (!multiLegReportingType.parse(data, cursor)) {
            return false;
        }
        cursor += MultiLegReportingTypeField.BYTE_LENGTH;
        if (!ordtype.parse(data, cursor)) {
            return false;
        }
        cursor += OrdtypeField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!expireDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!priceOptional.parse(data, cursor)) {
            return false;
        }
        cursor += PriceOptionalField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!maxFloor.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorField.BYTE_LENGTH;
        if (!crossidOptional.parse(data, cursor)) {
            return false;
        }
        cursor += CrossidOptionalField.BYTE_LENGTH;
        if (!deskId.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += deskId.byteLength();
        if (end - cursor < 1) {
            return false;
        }
        if (!memo.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += memo.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = outboundBusinessHeader.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = ordStatus.encode(data, cursor);
        cursor = clordid.encode(data, cursor);
        cursor = secondaryOrderId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = marketSegmentReceivedTime.encode(data, cursor);
        cursor = protectionPrice.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = workingIndicator.encode(data, cursor);
        cursor = multiLegReportingType.encode(data, cursor);
        cursor = ordtype.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = priceOptional.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = crossidOptional.encode(data, cursor);
        cursor = deskId.encode(data, cursor);
        cursor = memo.encode(data, cursor);
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
        outboundBusinessHeader.clear();
        deskId.clear();
        memo.clear();
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
            if (field != deskId.deskIdLength() && field != memo.memoLength() && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != deskId.deskIdLength() && field != memo.memoLength() && !field.isValid()) {
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
            case "Side" -> Optional.of(side);
            case "OrdStatus" -> Optional.of(ordStatus);
            case "Clordid" -> Optional.of(clordid);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "SecurityId" -> Optional.of(securityId);
            case "OrderId" -> Optional.of(orderId);
            case "Account" -> Optional.of(account);
            case "ExecId" -> Optional.of(execId);
            case "TransactTime" -> Optional.of(transactTime);
            case "MarketSegmentReceivedTime" -> Optional.of(marketSegmentReceivedTime);
            case "ProtectionPrice" -> Optional.of(protectionPrice);
            case "TradeDate" -> Optional.of(tradeDate);
            case "WorkingIndicator" -> Optional.of(workingIndicator);
            case "MultiLegReportingType" -> Optional.of(multiLegReportingType);
            case "Ordtype" -> Optional.of(ordtype);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "ExpireDate" -> Optional.of(expireDate);
            case "OrderQty" -> Optional.of(orderQty);
            case "PriceOptional" -> Optional.of(priceOptional);
            case "StopPx" -> Optional.of(stopPx);
            case "MinQty" -> Optional.of(minQty);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "CrossidOptional" -> Optional.of(crossidOptional);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionReportNewMessage message)) {
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
        if (!(other instanceof ExecutionReportNewMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
