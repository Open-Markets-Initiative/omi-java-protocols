package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.AccountField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.AggressorIndicatorField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.ClordidOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.ContraBrokerField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.CumQtyField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.DaysToSettlementOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.ExecIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.ExecRefIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.FixedRatePercentage8OptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.LastPxField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.LastQtyField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.LeavesQtyField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.OrdStatusField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.OrderIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.OrderQtyField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SecondaryExecIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SecondaryOrderIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SecurityTradingStatusField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SettlTypeOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SideField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.TradeDateField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.TradeIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.TradingSessionIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.TradingSessionSubIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.TransactTimeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.DeskId;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.Memo;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.OutboundBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.PrintOptions;

/**
 * Represents the ExecutionReportForwardMessage message from the BinaryEntryPoint protocol.
 *
 * <p>ExecutionReport_ForwardMessage</p>
 */
public final class ExecutionReportForwardMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 157;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Report Forward Message";

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
    private final ClordidOptionalField clordidOptional = new ClordidOptionalField();

    /**
     * secondaryOrderID
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * account
     */
    private final AccountField account = new AccountField();

    /**
     * lastQty
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * lastPx
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * execID
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * leavesQty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * cumQty
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * tradeID
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * contraBroker
     */
    private final ContraBrokerField contraBroker = new ContraBrokerField();

    /**
     * orderID
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * aggressorIndicator
     */
    private final AggressorIndicatorField aggressorIndicator = new AggressorIndicatorField();

    /**
     * settlType
     */
    private final SettlTypeOptionalField settlTypeOptional = new SettlTypeOptionalField();

    /**
     * tradeDate
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * daysToSettlement
     */
    private final DaysToSettlementOptionalField daysToSettlementOptional = new DaysToSettlementOptionalField();

    /**
     * secondaryExecID
     */
    private final SecondaryExecIdField secondaryExecId = new SecondaryExecIdField();

    /**
     * execRefID
     */
    private final ExecRefIdField execRefId = new ExecRefIdField();

    /**
     * fixedRate
     */
    private final FixedRatePercentage8OptionalField fixedRatePercentage8Optional = new FixedRatePercentage8OptionalField();

    /**
     * orderQty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * tradingSessionID
     */
    private final TradingSessionIdField tradingSessionId = new TradingSessionIdField();

    /**
     * tradingSessionSubID
     */
    private final TradingSessionSubIdField tradingSessionSubId = new TradingSessionSubIdField();

    /**
     * securityTradingStatus
     */
    private final SecurityTradingStatusField securityTradingStatus = new SecurityTradingStatusField();

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
    private final List<Field> fields = Stream.of(outboundBusinessHeader.fields(), List.<Field>of(side), List.<Field>of(ordStatus), List.<Field>of(clordidOptional), List.<Field>of(secondaryOrderId), List.<Field>of(securityId), List.<Field>of(account), List.<Field>of(lastQty), List.<Field>of(lastPx), List.<Field>of(execId), List.<Field>of(transactTime), List.<Field>of(leavesQty), List.<Field>of(cumQty), List.<Field>of(tradeId), List.<Field>of(contraBroker), List.<Field>of(orderId), List.<Field>of(aggressorIndicator), List.<Field>of(settlTypeOptional), List.<Field>of(tradeDate), List.<Field>of(daysToSettlementOptional), List.<Field>of(secondaryExecId), List.<Field>of(execRefId), List.<Field>of(fixedRatePercentage8Optional), List.<Field>of(orderQty), List.<Field>of(tradingSessionId), List.<Field>of(tradingSessionSubId), List.<Field>of(securityTradingStatus), deskId.fields(), memo.fields()).flatMap(List::stream).toList();

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
     * @return the ClordidOptional field
     */
    public ClordidOptionalField clordidOptional() {
        return clordidOptional;
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
     * account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * lastQty
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * lastPx
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
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
     * leavesQty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * cumQty
     *
     * @return the CumQty field
     */
    public CumQtyField cumQty() {
        return cumQty;
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
     * contraBroker
     *
     * @return the ContraBroker field
     */
    public ContraBrokerField contraBroker() {
        return contraBroker;
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
     * aggressorIndicator
     *
     * @return the AggressorIndicator field
     */
    public AggressorIndicatorField aggressorIndicator() {
        return aggressorIndicator;
    }

    /**
     * settlType
     *
     * @return the SettlTypeOptional field
     */
    public SettlTypeOptionalField settlTypeOptional() {
        return settlTypeOptional;
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
     * daysToSettlement
     *
     * @return the DaysToSettlementOptional field
     */
    public DaysToSettlementOptionalField daysToSettlementOptional() {
        return daysToSettlementOptional;
    }

    /**
     * secondaryExecID
     *
     * @return the SecondaryExecId field
     */
    public SecondaryExecIdField secondaryExecId() {
        return secondaryExecId;
    }

    /**
     * execRefID
     *
     * @return the ExecRefId field
     */
    public ExecRefIdField execRefId() {
        return execRefId;
    }

    /**
     * fixedRate
     *
     * @return the FixedRatePercentage8Optional field
     */
    public FixedRatePercentage8OptionalField fixedRatePercentage8Optional() {
        return fixedRatePercentage8Optional;
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
     * tradingSessionID
     *
     * @return the TradingSessionId field
     */
    public TradingSessionIdField tradingSessionId() {
        return tradingSessionId;
    }

    /**
     * tradingSessionSubID
     *
     * @return the TradingSessionSubId field
     */
    public TradingSessionSubIdField tradingSessionSubId() {
        return tradingSessionSubId;
    }

    /**
     * securityTradingStatus
     *
     * @return the SecurityTradingStatus field
     */
    public SecurityTradingStatusField securityTradingStatus() {
        return securityTradingStatus;
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
        cursor += 4;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 2;
        cursor += 2;
        runs.add(cursor).add(2);
        cursor += 2;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += deskId.byteLength();
        cursor += memo.byteLength();
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
        if (!outboundBusinessHeader.parseFrom(data, cursor, end - 139)) {
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
        if (!clordidOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ClordidOptionalField.BYTE_LENGTH;
        if (!secondaryOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryOrderIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!cumQty.parse(data, cursor)) {
            return false;
        }
        cursor += CumQtyField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!contraBroker.parse(data, cursor)) {
            return false;
        }
        cursor += ContraBrokerField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!aggressorIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AggressorIndicatorField.BYTE_LENGTH;
        if (!settlTypeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SettlTypeOptionalField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!daysToSettlementOptional.parse(data, cursor)) {
            return false;
        }
        cursor += DaysToSettlementOptionalField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!secondaryExecId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryExecIdField.BYTE_LENGTH;
        if (!execRefId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecRefIdField.BYTE_LENGTH;
        if (!fixedRatePercentage8Optional.parse(data, cursor)) {
            return false;
        }
        cursor += FixedRatePercentage8OptionalField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!tradingSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionIdField.BYTE_LENGTH;
        if (!tradingSessionSubId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionSubIdField.BYTE_LENGTH;
        if (!securityTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingStatusField.BYTE_LENGTH;
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

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = outboundBusinessHeader.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = ordStatus.encode(data, cursor);
        cursor = clordidOptional.encode(data, cursor);
        cursor = secondaryOrderId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = contraBroker.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = aggressorIndicator.encode(data, cursor);
        cursor = settlTypeOptional.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = daysToSettlementOptional.encode(data, cursor);
        if (buffer != null && buffer.length >= 120) {
            System.arraycopy(buffer, 118, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = secondaryExecId.encode(data, cursor);
        cursor = execRefId.encode(data, cursor);
        cursor = fixedRatePercentage8Optional.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = tradingSessionId.encode(data, cursor);
        cursor = tradingSessionSubId.encode(data, cursor);
        cursor = securityTradingStatus.encode(data, cursor);
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
            case "ClordidOptional" -> Optional.of(clordidOptional);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "SecurityId" -> Optional.of(securityId);
            case "Account" -> Optional.of(account);
            case "LastQty" -> Optional.of(lastQty);
            case "LastPx" -> Optional.of(lastPx);
            case "ExecId" -> Optional.of(execId);
            case "TransactTime" -> Optional.of(transactTime);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "CumQty" -> Optional.of(cumQty);
            case "TradeId" -> Optional.of(tradeId);
            case "ContraBroker" -> Optional.of(contraBroker);
            case "OrderId" -> Optional.of(orderId);
            case "AggressorIndicator" -> Optional.of(aggressorIndicator);
            case "SettlTypeOptional" -> Optional.of(settlTypeOptional);
            case "TradeDate" -> Optional.of(tradeDate);
            case "DaysToSettlementOptional" -> Optional.of(daysToSettlementOptional);
            case "SecondaryExecId" -> Optional.of(secondaryExecId);
            case "ExecRefId" -> Optional.of(execRefId);
            case "FixedRatePercentage8Optional" -> Optional.of(fixedRatePercentage8Optional);
            case "OrderQty" -> Optional.of(orderQty);
            case "TradingSessionId" -> Optional.of(tradingSessionId);
            case "TradingSessionSubId" -> Optional.of(tradingSessionSubId);
            case "SecurityTradingStatus" -> Optional.of(securityTradingStatus);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionReportForwardMessage message)) {
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
        if (!(other instanceof ExecutionReportForwardMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
