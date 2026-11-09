package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.ContraBrokerField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.DaysToSettlementOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.EnteringTraderField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.ExecutingTraderField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.FixedRatePercentage8OptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.OrderQtyOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.Price8OptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.QuoteIdOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.QuoteReqIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.QuoteRequestRejectReasonField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SenderLocationField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SettlTypeOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.TradeIdOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.TransactTimeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.BidirectionalBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.DeskId;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.Memo;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.SidesGroups;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.Text;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.PrintOptions;

/**
 * Represents the QuoteRequestRejectMessage message from the BinaryEntryPoint protocol.
 *
 * <p>QuoteRequestRejectMessage</p>
 */
public final class QuoteRequestRejectMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 117;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Request Reject Message";

    /**
     * quoteRequestRejectReason
     */
    private final QuoteRequestRejectReasonField quoteRequestRejectReason = new QuoteRequestRejectReasonField();

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
    private final QuoteIdOptionalField quoteIdOptional = new QuoteIdOptionalField();

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
     * enteringTrader
     */
    private final EnteringTraderField enteringTrader = new EnteringTraderField();

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
    private final OrderQtyOptionalField orderQtyOptional = new OrderQtyOptionalField();

    /**
     * senderLocation
     */
    private final SenderLocationField senderLocation = new SenderLocationField();

    /**
     * executingTrader
     */
    private final ExecutingTraderField executingTrader = new ExecutingTraderField();

    /**
     * fixedRate
     */
    private final FixedRatePercentage8OptionalField fixedRatePercentage8Optional = new FixedRatePercentage8OptionalField();

    /**
     * daysToSettlement
     */
    private final DaysToSettlementOptionalField daysToSettlementOptional = new DaysToSettlementOptionalField();

    /**
     * BidirectionalBusinessHeader
     */
    private final BidirectionalBusinessHeader bidirectionalBusinessHeader = new BidirectionalBusinessHeader();

    /**
     * noSides Block
     */
    private final SidesGroups sidesGroups = new SidesGroups();

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
    private final List<Field> fields = Stream.of(bidirectionalBusinessHeader.fields(), List.<Field>of(quoteRequestRejectReason), List.<Field>of(securityId), List.<Field>of(quoteReqId), List.<Field>of(quoteIdOptional), List.<Field>of(tradeIdOptional), List.<Field>of(contraBroker), List.<Field>of(transactTime), List.<Field>of(enteringTrader), List.<Field>of(settlTypeOptional), List.<Field>of(price8Optional), List.<Field>of(orderQtyOptional), List.<Field>of(senderLocation), List.<Field>of(executingTrader), List.<Field>of(fixedRatePercentage8Optional), List.<Field>of(daysToSettlementOptional), deskId.fields(), memo.fields(), text.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * quoteRequestRejectReason
     *
     * @return the QuoteRequestRejectReason field
     */
    public QuoteRequestRejectReasonField quoteRequestRejectReason() {
        return quoteRequestRejectReason;
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
     * @return the QuoteIdOptional field
     */
    public QuoteIdOptionalField quoteIdOptional() {
        return quoteIdOptional;
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
     * enteringTrader
     *
     * @return the EnteringTrader field
     */
    public EnteringTraderField enteringTrader() {
        return enteringTrader;
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
     * @return the OrderQtyOptional field
     */
    public OrderQtyOptionalField orderQtyOptional() {
        return orderQtyOptional;
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
     * daysToSettlement
     *
     * @return the DaysToSettlementOptional field
     */
    public DaysToSettlementOptionalField daysToSettlementOptional() {
        return daysToSettlementOptional;
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
     * noSides Block
     *
     * @return the SidesGroups record
     */
    public SidesGroups sidesGroups() {
        return sidesGroups;
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
        return MINIMUM_BYTE_LENGTH + sidesGroups.byteLength() - SidesGroups.MINIMUM_BYTE_LENGTH + deskId.byteLength() - DeskId.MINIMUM_BYTE_LENGTH + memo.byteLength() - Memo.MINIMUM_BYTE_LENGTH + text.byteLength() - Text.MINIMUM_BYTE_LENGTH;
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
        for (int[] run = BidirectionalBusinessHeader.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += BidirectionalBusinessHeader.BYTE_LENGTH;
        cursor += 4;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 8;
        cursor += 5;
        cursor += 1;
        cursor += 8;
        cursor += 8;
        cursor += 10;
        cursor += 5;
        cursor += 8;
        cursor += 2;
        cursor = sidesGroups.padding(runs, cursor);
        cursor = deskId.padding(runs, cursor);
        cursor = memo.padding(runs, cursor);
        cursor = text.padding(runs, cursor);
        return cursor;
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
        if (!bidirectionalBusinessHeader.parseFrom(data, cursor, end - 97)) {
            return false;
        }
        cursor += bidirectionalBusinessHeader.byteLength();
        if (!quoteRequestRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteRequestRejectReasonField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!quoteReqId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteReqIdField.BYTE_LENGTH;
        if (!quoteIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdOptionalField.BYTE_LENGTH;
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
        if (!enteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += EnteringTraderField.BYTE_LENGTH;
        if (!settlTypeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SettlTypeOptionalField.BYTE_LENGTH;
        if (!price8Optional.parse(data, cursor)) {
            return false;
        }
        cursor += Price8OptionalField.BYTE_LENGTH;
        if (!orderQtyOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyOptionalField.BYTE_LENGTH;
        if (!senderLocation.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationField.BYTE_LENGTH;
        if (!executingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderField.BYTE_LENGTH;
        if (!fixedRatePercentage8Optional.parse(data, cursor)) {
            return false;
        }
        cursor += FixedRatePercentage8OptionalField.BYTE_LENGTH;
        if (!daysToSettlementOptional.parse(data, cursor)) {
            return false;
        }
        cursor += DaysToSettlementOptionalField.BYTE_LENGTH;
        if (!sidesGroups.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += sidesGroups.byteLength();
        if (end - cursor < 3) {
            return false;
        }
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
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = bidirectionalBusinessHeader.encode(data, cursor);
        cursor = quoteRequestRejectReason.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = quoteReqId.encode(data, cursor);
        cursor = quoteIdOptional.encode(data, cursor);
        cursor = tradeIdOptional.encode(data, cursor);
        cursor = contraBroker.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = enteringTrader.encode(data, cursor);
        cursor = settlTypeOptional.encode(data, cursor);
        cursor = price8Optional.encode(data, cursor);
        cursor = orderQtyOptional.encode(data, cursor);
        cursor = senderLocation.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = fixedRatePercentage8Optional.encode(data, cursor);
        cursor = daysToSettlementOptional.encode(data, cursor);
        cursor = sidesGroups.encode(data, cursor);
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
        sidesGroups.clear();
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
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != deskId.deskIdLength() && field != memo.memoLength() && field != text.textLength() && !field.isRecognized()) {
                return false;
            }
        }
        if (!sidesGroups.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != deskId.deskIdLength() && field != memo.memoLength() && field != text.textLength() && !field.isValid()) {
                return false;
            }
        }
        if (!sidesGroups.isValid()) {
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
        if (!bidirectionalBusinessHeader.isDecoded()) {
            return bidirectionalBusinessHeader.failedAt();
        }
        if (!quoteRequestRejectReason.isDecoded()) {
            return Optional.of(quoteRequestRejectReason);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!quoteReqId.isDecoded()) {
            return Optional.of(quoteReqId);
        }
        if (!quoteIdOptional.isDecoded()) {
            return Optional.of(quoteIdOptional);
        }
        if (!tradeIdOptional.isDecoded()) {
            return Optional.of(tradeIdOptional);
        }
        if (!contraBroker.isDecoded()) {
            return Optional.of(contraBroker);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!enteringTrader.isDecoded()) {
            return Optional.of(enteringTrader);
        }
        if (!settlTypeOptional.isDecoded()) {
            return Optional.of(settlTypeOptional);
        }
        if (!price8Optional.isDecoded()) {
            return Optional.of(price8Optional);
        }
        if (!orderQtyOptional.isDecoded()) {
            return Optional.of(orderQtyOptional);
        }
        if (!senderLocation.isDecoded()) {
            return Optional.of(senderLocation);
        }
        if (!executingTrader.isDecoded()) {
            return Optional.of(executingTrader);
        }
        if (!fixedRatePercentage8Optional.isDecoded()) {
            return Optional.of(fixedRatePercentage8Optional);
        }
        if (!daysToSettlementOptional.isDecoded()) {
            return Optional.of(daysToSettlementOptional);
        }
        if (!sidesGroups.isDecoded()) {
            return sidesGroups.failedAt();
        }
        if (!deskId.isDecoded()) {
            return deskId.failedAt();
        }
        if (!memo.isDecoded()) {
            return memo.failedAt();
        }
        if (!text.isDecoded()) {
            return text.failedAt();
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
            case "QuoteRequestRejectReason" -> Optional.of(quoteRequestRejectReason);
            case "SecurityId" -> Optional.of(securityId);
            case "QuoteReqId" -> Optional.of(quoteReqId);
            case "QuoteIdOptional" -> Optional.of(quoteIdOptional);
            case "TradeIdOptional" -> Optional.of(tradeIdOptional);
            case "ContraBroker" -> Optional.of(contraBroker);
            case "TransactTime" -> Optional.of(transactTime);
            case "EnteringTrader" -> Optional.of(enteringTrader);
            case "SettlTypeOptional" -> Optional.of(settlTypeOptional);
            case "Price8Optional" -> Optional.of(price8Optional);
            case "OrderQtyOptional" -> Optional.of(orderQtyOptional);
            case "SenderLocation" -> Optional.of(senderLocation);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "FixedRatePercentage8Optional" -> Optional.of(fixedRatePercentage8Optional);
            case "DaysToSettlementOptional" -> Optional.of(daysToSettlementOptional);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteRequestRejectMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(sidesGroups.diffFields(message.sidesGroups));
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
            sidesGroups.toFormattedString(builder, options);
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
        sidesGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof QuoteRequestRejectMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && sidesGroups.equals(message.sidesGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, sidesGroups);
    }
}
