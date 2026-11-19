package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AccountField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.ContraBrokerField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.DaysToSettlementOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.EnteringTraderField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.ExecuteUnderlyingTradeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.ExecutingTraderField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.FixedRatePercentage8OptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.OrderQtyField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.Price8OptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.QuoteIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.QuoteRejectReasonField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.QuoteReqIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.QuoteStatusField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.QuoteStatusResponseToField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SenderLocationField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SettlTypeOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SideOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.TradeIdOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.TradingSubAccountField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.TransactTimeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.BidirectionalBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.DeskId;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.Memo;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.Text;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.PrintOptions;

/**
 * Represents the QuoteStatusReportMessage message from the BinaryEntryPoint protocol.
 *
 * <p>QuoteStatusReportMessage</p>
 */
public final class QuoteStatusReportMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 126;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Status Report Message";

    /**
     * quoteRejectReason
     */
    private final QuoteRejectReasonField quoteRejectReason = new QuoteRejectReasonField();

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * quoteReqID
     */
    private final QuoteReqIdField quoteReqId = new QuoteReqIdField();

    /**
     * quoteID
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * tradeID
     */
    private final TradeIdOptionalField tradeIdOptional = new TradeIdOptionalField();

    /**
     * contraBroker
     */
    private final ContraBrokerField contraBroker = new ContraBrokerField();

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * quoteStatus
     */
    private final QuoteStatusField quoteStatus = new QuoteStatusField();

    /**
     * quoteStatusResponseTo
     */
    private final QuoteStatusResponseToField quoteStatusResponseTo = new QuoteStatusResponseToField();

    /**
     * account
     */
    private final AccountField account = new AccountField();

    /**
     * side
     */
    private final SideOptionalField sideOptional = new SideOptionalField();

    /**
     * settlType
     */
    private final SettlTypeOptionalField settlTypeOptional = new SettlTypeOptionalField();

    /**
     * price
     */
    private final Price8OptionalField price8Optional = new Price8OptionalField();

    /**
     * orderQty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * senderLocation
     */
    private final SenderLocationField senderLocation = new SenderLocationField();

    /**
     * enteringTrader
     */
    private final EnteringTraderField enteringTrader = new EnteringTraderField();

    /**
     * executingTrader
     */
    private final ExecutingTraderField executingTrader = new ExecutingTraderField();

    /**
     * fixedRate
     */
    private final FixedRatePercentage8OptionalField fixedRatePercentage8Optional = new FixedRatePercentage8OptionalField();

    /**
     * executeUnderlyingTrade
     */
    private final ExecuteUnderlyingTradeField executeUnderlyingTrade = new ExecuteUnderlyingTradeField();

    /**
     * daysToSettlement
     */
    private final DaysToSettlementOptionalField daysToSettlementOptional = new DaysToSettlementOptionalField();

    /**
     * tradingSubAccount
     */
    private final TradingSubAccountField tradingSubAccount = new TradingSubAccountField();

    /**
     * BidirectionalBusinessHeader
     */
    private final BidirectionalBusinessHeader bidirectionalBusinessHeader = new BidirectionalBusinessHeader();

    /**
     * deskID data struct
     */
    private final DeskId deskId = new DeskId();

    /**
     * memo data struct
     */
    private final Memo memo = new Memo();

    /**
     * text data struct
     */
    private final Text text = new Text();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(bidirectionalBusinessHeader.fields(), List.<Field>of(quoteRejectReason), List.<Field>of(securityId), List.<Field>of(quoteReqId), List.<Field>of(quoteId), List.<Field>of(tradeIdOptional), List.<Field>of(contraBroker), List.<Field>of(transactTime), List.<Field>of(quoteStatus), List.<Field>of(quoteStatusResponseTo), List.<Field>of(account), List.<Field>of(sideOptional), List.<Field>of(settlTypeOptional), List.<Field>of(price8Optional), List.<Field>of(orderQty), List.<Field>of(senderLocation), List.<Field>of(enteringTrader), List.<Field>of(executingTrader), List.<Field>of(fixedRatePercentage8Optional), List.<Field>of(executeUnderlyingTrade), List.<Field>of(daysToSettlementOptional), List.<Field>of(tradingSubAccount), deskId.fields(), memo.fields(), text.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * quoteRejectReason
     *
     * @return the QuoteRejectReason field
     */
    public QuoteRejectReasonField quoteRejectReason() {
        return quoteRejectReason;
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
     * quoteReqID
     *
     * @return the QuoteReqId field
     */
    public QuoteReqIdField quoteReqId() {
        return quoteReqId;
    }

    /**
     * quoteID
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * tradeID
     *
     * @return the TradeIdOptional field
     */
    public TradeIdOptionalField tradeIdOptional() {
        return tradeIdOptional;
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
     * transactTime
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * quoteStatus
     *
     * @return the QuoteStatus field
     */
    public QuoteStatusField quoteStatus() {
        return quoteStatus;
    }

    /**
     * quoteStatusResponseTo
     *
     * @return the QuoteStatusResponseTo field
     */
    public QuoteStatusResponseToField quoteStatusResponseTo() {
        return quoteStatusResponseTo;
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
     * side
     *
     * @return the SideOptional field
     */
    public SideOptionalField sideOptional() {
        return sideOptional;
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
     * price
     *
     * @return the Price8Optional field
     */
    public Price8OptionalField price8Optional() {
        return price8Optional;
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
     * senderLocation
     *
     * @return the SenderLocation field
     */
    public SenderLocationField senderLocation() {
        return senderLocation;
    }

    /**
     * enteringTrader
     *
     * @return the EnteringTrader field
     */
    public EnteringTraderField enteringTrader() {
        return enteringTrader;
    }

    /**
     * executingTrader
     *
     * @return the ExecutingTrader field
     */
    public ExecutingTraderField executingTrader() {
        return executingTrader;
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
     * executeUnderlyingTrade
     *
     * @return the ExecuteUnderlyingTrade field
     */
    public ExecuteUnderlyingTradeField executeUnderlyingTrade() {
        return executeUnderlyingTrade;
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
     * tradingSubAccount
     *
     * @return the TradingSubAccount field
     */
    public TradingSubAccountField tradingSubAccount() {
        return tradingSubAccount;
    }

    /**
     * BidirectionalBusinessHeader
     *
     * @return the BidirectionalBusinessHeader record
     */
    public BidirectionalBusinessHeader bidirectionalBusinessHeader() {
        return bidirectionalBusinessHeader;
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

    /**
     * text data struct
     *
     * @return the Text record
     */
    public Text text() {
        return text;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + deskId.byteLength() - DeskId.MINIMUM_BYTE_LENGTH + memo.byteLength() - Memo.MINIMUM_BYTE_LENGTH + text.byteLength() - Text.MINIMUM_BYTE_LENGTH;
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
        return Optional.ofNullable(bidirectionalBusinessHeader.sendingTime().value());
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
        if (!bidirectionalBusinessHeader.parseFrom(data, cursor, end - 106)) {
            return false;
        }
        cursor += bidirectionalBusinessHeader.byteLength();
        if (!quoteRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteRejectReasonField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!quoteReqId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteReqIdField.BYTE_LENGTH;
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!tradeIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdOptionalField.BYTE_LENGTH;
        if (!contraBroker.parse(data, cursor)) {
            return false;
        }
        cursor += ContraBrokerField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!quoteStatus.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteStatusField.BYTE_LENGTH;
        if (!quoteStatusResponseTo.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteStatusResponseToField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!sideOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SideOptionalField.BYTE_LENGTH;
        if (!settlTypeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SettlTypeOptionalField.BYTE_LENGTH;
        if (!price8Optional.parse(data, cursor)) {
            return false;
        }
        cursor += Price8OptionalField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!senderLocation.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationField.BYTE_LENGTH;
        if (!enteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += EnteringTraderField.BYTE_LENGTH;
        if (!executingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderField.BYTE_LENGTH;
        if (!fixedRatePercentage8Optional.parse(data, cursor)) {
            return false;
        }
        cursor += FixedRatePercentage8OptionalField.BYTE_LENGTH;
        if (!executeUnderlyingTrade.parse(data, cursor)) {
            return false;
        }
        cursor += ExecuteUnderlyingTradeField.BYTE_LENGTH;
        if (!daysToSettlementOptional.parse(data, cursor)) {
            return false;
        }
        cursor += DaysToSettlementOptionalField.BYTE_LENGTH;
        if (!tradingSubAccount.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSubAccountField.BYTE_LENGTH;
        if (!deskId.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += deskId.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!memo.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += memo.byteLength();
        if (end - cursor < 1) {
            return false;
        }
        if (!text.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += text.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = bidirectionalBusinessHeader.encode(data, cursor);
        cursor = quoteRejectReason.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = quoteReqId.encode(data, cursor);
        cursor = quoteId.encode(data, cursor);
        cursor = tradeIdOptional.encode(data, cursor);
        cursor = contraBroker.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = quoteStatus.encode(data, cursor);
        cursor = quoteStatusResponseTo.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = sideOptional.encode(data, cursor);
        cursor = settlTypeOptional.encode(data, cursor);
        cursor = price8Optional.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = senderLocation.encode(data, cursor);
        cursor = enteringTrader.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = fixedRatePercentage8Optional.encode(data, cursor);
        cursor = executeUnderlyingTrade.encode(data, cursor);
        cursor = daysToSettlementOptional.encode(data, cursor);
        cursor = tradingSubAccount.encode(data, cursor);
        cursor = deskId.encode(data, cursor);
        cursor = memo.encode(data, cursor);
        cursor = text.encode(data, cursor);
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
        bidirectionalBusinessHeader.clear();
        deskId.clear();
        memo.clear();
        text.clear();
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
            if (field != deskId.deskIdLength() && field != memo.memoLength() && field != text.textLength() && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != deskId.deskIdLength() && field != memo.memoLength() && field != text.textLength() && !field.isValid()) {
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
            case "QuoteRejectReason" -> Optional.of(quoteRejectReason);
            case "SecurityId" -> Optional.of(securityId);
            case "QuoteReqId" -> Optional.of(quoteReqId);
            case "QuoteId" -> Optional.of(quoteId);
            case "TradeIdOptional" -> Optional.of(tradeIdOptional);
            case "ContraBroker" -> Optional.of(contraBroker);
            case "TransactTime" -> Optional.of(transactTime);
            case "QuoteStatus" -> Optional.of(quoteStatus);
            case "QuoteStatusResponseTo" -> Optional.of(quoteStatusResponseTo);
            case "Account" -> Optional.of(account);
            case "SideOptional" -> Optional.of(sideOptional);
            case "SettlTypeOptional" -> Optional.of(settlTypeOptional);
            case "Price8Optional" -> Optional.of(price8Optional);
            case "OrderQty" -> Optional.of(orderQty);
            case "SenderLocation" -> Optional.of(senderLocation);
            case "EnteringTrader" -> Optional.of(enteringTrader);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "FixedRatePercentage8Optional" -> Optional.of(fixedRatePercentage8Optional);
            case "ExecuteUnderlyingTrade" -> Optional.of(executeUnderlyingTrade);
            case "DaysToSettlementOptional" -> Optional.of(daysToSettlementOptional);
            case "TradingSubAccount" -> Optional.of(tradingSubAccount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteStatusReportMessage message)) {
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
        if (!(other instanceof QuoteStatusReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
