package omi.ice.icefutures.bgw.sbe.v7_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClOrdIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExchangeCodeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MemoField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OrdTypeOrderTypeEnumNullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OrderStatusField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OrigClOrdIDInt64NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OriginatorUserIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.RejectReasonField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.RejectResponseToField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SideSideEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SymbolIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TextField;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.ExecIDOrderExecId;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.OrigOrderId;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the ExecutionReportRejectMessage message from the Bgw protocol.
 *
 * <p>ExecutionReport_RejectMessage</p>
 */
public final class ExecutionReportRejectMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 215;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Report Reject Message";

    /**
     * originatorUserID
     */
    private final OriginatorUserIdField originatorUserId = new OriginatorUserIdField();

    /**
     * clOrdID
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * symbol
     */
    private final SymbolIntField symbolInt = new SymbolIntField();

    /**
     * ordType
     */
    private final OrdTypeOrderTypeEnumNullField ordTypeOrderTypeEnumNull = new OrdTypeOrderTypeEnumNullField();

    /**
     * side
     */
    private final SideSideEnumField sideSideEnum = new SideSideEnumField();

    /**
     * origClOrdID
     */
    private final OrigClOrdIDInt64NullField origClOrdIDInt64Null = new OrigClOrdIDInt64NullField();

    /**
     * orderStatus
     */
    private final OrderStatusField orderStatus = new OrderStatusField();

    /**
     * rejectResponseTo
     */
    private final RejectResponseToField rejectResponseTo = new RejectResponseToField();

    /**
     * rejectReason
     */
    private final RejectReasonField rejectReason = new RejectReasonField();

    /**
     * exchangeCode
     */
    private final ExchangeCodeField exchangeCode = new ExchangeCodeField();

    /**
     * memo
     */
    private final MemoField memo = new MemoField();

    /**
     * text
     */
    private final TextField text = new TextField();

    /**
     * ExecutionReport_NewMessage
     */
    private final ExecIDOrderExecId execIDOrderExecId = new ExecIDOrderExecId();

    /**
     * ExecutionReport_NewMessage
     */
    private final OrigOrderId origOrderId = new OrigOrderId();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(originatorUserId), execIDOrderExecId.fields(), List.<Field>of(clOrdId), List.<Field>of(symbolInt), List.<Field>of(ordTypeOrderTypeEnumNull), List.<Field>of(sideSideEnum), origOrderId.fields(), List.<Field>of(origClOrdIDInt64Null), List.<Field>of(orderStatus), List.<Field>of(rejectResponseTo), List.<Field>of(rejectReason), List.<Field>of(exchangeCode), List.<Field>of(memo), List.<Field>of(text)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * originatorUserID
     *
     * @return the OriginatorUserId field
     */
    public OriginatorUserIdField originatorUserId() {
        return originatorUserId;
    }

    /**
     * clOrdID
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * symbol
     *
     * @return the SymbolInt field
     */
    public SymbolIntField symbolInt() {
        return symbolInt;
    }

    /**
     * ordType
     *
     * @return the OrdTypeOrderTypeEnumNull field
     */
    public OrdTypeOrderTypeEnumNullField ordTypeOrderTypeEnumNull() {
        return ordTypeOrderTypeEnumNull;
    }

    /**
     * side
     *
     * @return the SideSideEnum field
     */
    public SideSideEnumField sideSideEnum() {
        return sideSideEnum;
    }

    /**
     * origClOrdID
     *
     * @return the OrigClOrdIDInt64Null field
     */
    public OrigClOrdIDInt64NullField origClOrdIDInt64Null() {
        return origClOrdIDInt64Null;
    }

    /**
     * orderStatus
     *
     * @return the OrderStatus field
     */
    public OrderStatusField orderStatus() {
        return orderStatus;
    }

    /**
     * rejectResponseTo
     *
     * @return the RejectResponseTo field
     */
    public RejectResponseToField rejectResponseTo() {
        return rejectResponseTo;
    }

    /**
     * rejectReason
     *
     * @return the RejectReason field
     */
    public RejectReasonField rejectReason() {
        return rejectReason;
    }

    /**
     * exchangeCode
     *
     * @return the ExchangeCode field
     */
    public ExchangeCodeField exchangeCode() {
        return exchangeCode;
    }

    /**
     * memo
     *
     * @return the Memo field
     */
    public MemoField memo() {
        return memo;
    }

    /**
     * text
     *
     * @return the Text field
     */
    public TextField text() {
        return text;
    }

    /**
     * ExecutionReport_NewMessage
     *
     * @return the ExecIDOrderExecId record
     */
    public ExecIDOrderExecId execIDOrderExecId() {
        return execIDOrderExecId;
    }

    /**
     * ExecutionReport_NewMessage
     *
     * @return the OrigOrderId record
     */
    public OrigOrderId origOrderId() {
        return origOrderId;
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
        if (!originatorUserId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginatorUserIdField.BYTE_LENGTH;
        if (!execIDOrderExecId.parseFrom(data, cursor, end - 175)) {
            return false;
        }
        cursor += execIDOrderExecId.byteLength();
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!symbolInt.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIntField.BYTE_LENGTH;
        if (!ordTypeOrderTypeEnumNull.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeOrderTypeEnumNullField.BYTE_LENGTH;
        if (!sideSideEnum.parse(data, cursor)) {
            return false;
        }
        cursor += SideSideEnumField.BYTE_LENGTH;
        if (!origOrderId.parseFrom(data, cursor, end - 145)) {
            return false;
        }
        cursor += origOrderId.byteLength();
        if (!origClOrdIDInt64Null.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIDInt64NullField.BYTE_LENGTH;
        if (!orderStatus.parse(data, cursor)) {
            return false;
        }
        cursor += OrderStatusField.BYTE_LENGTH;
        if (!rejectResponseTo.parse(data, cursor)) {
            return false;
        }
        cursor += RejectResponseToField.BYTE_LENGTH;
        if (!rejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += RejectReasonField.BYTE_LENGTH;
        if (!exchangeCode.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeCodeField.BYTE_LENGTH;
        if (!memo.parse(data, cursor)) {
            return false;
        }
        cursor += MemoField.BYTE_LENGTH;
        return text.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = originatorUserId.encode(data, cursor);
        cursor = execIDOrderExecId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = symbolInt.encode(data, cursor);
        cursor = ordTypeOrderTypeEnumNull.encode(data, cursor);
        cursor = sideSideEnum.encode(data, cursor);
        cursor = origOrderId.encode(data, cursor);
        cursor = origClOrdIDInt64Null.encode(data, cursor);
        cursor = orderStatus.encode(data, cursor);
        cursor = rejectResponseTo.encode(data, cursor);
        cursor = rejectReason.encode(data, cursor);
        cursor = exchangeCode.encode(data, cursor);
        cursor = memo.encode(data, cursor);
        cursor = text.encode(data, cursor);
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
        execIDOrderExecId.clear();
        origOrderId.clear();
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
            case "OriginatorUserId" -> Optional.of(originatorUserId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "SymbolInt" -> Optional.of(symbolInt);
            case "OrdTypeOrderTypeEnumNull" -> Optional.of(ordTypeOrderTypeEnumNull);
            case "SideSideEnum" -> Optional.of(sideSideEnum);
            case "OrigClOrdIDInt64Null" -> Optional.of(origClOrdIDInt64Null);
            case "OrderStatus" -> Optional.of(orderStatus);
            case "RejectResponseTo" -> Optional.of(rejectResponseTo);
            case "RejectReason" -> Optional.of(rejectReason);
            case "ExchangeCode" -> Optional.of(exchangeCode);
            case "Memo" -> Optional.of(memo);
            case "Text" -> Optional.of(text);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionReportRejectMessage message)) {
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
        if (!(other instanceof ExecutionReportRejectMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
