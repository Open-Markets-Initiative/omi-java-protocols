package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.AccountField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.ClordidField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.CrossedIndicatorField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.CrossidOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.CxlRejResponseToField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.ExecIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.ExpireDateField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.MaxFloorField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.MinQtyField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.OrdRejReasonField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.OrderIdOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.OrderQtyField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.OrdtypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.OrigclordidField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.PriceOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.SecondaryOrderIdOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.SideField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.StopPxField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.TimeInForceField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.TransactTimeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.structs.DeskId;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.structs.Memo;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.structs.OutboundBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.structs.Text;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.types.PrintOptions;

/**
 * Represents the ExecutionReportRejectMessage message from the BinaryEntryPoint protocol.
 *
 * <p>ExecutionReport_RejectMessage</p>
 */
public final class ExecutionReportRejectMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 141;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Report Reject Message";

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * cxlRejResponseTo
     */
    private final CxlRejResponseToField cxlRejResponseTo = new CxlRejResponseToField();

    /**
     * clOrdID
     */
    private final ClordidField clordid = new ClordidField();

    /**
     * secondaryOrderID
     */
    private final SecondaryOrderIdOptionalField secondaryOrderIdOptional = new SecondaryOrderIdOptionalField();

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * ordRejReason
     */
    private final OrdRejReasonField ordRejReason = new OrdRejReasonField();

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * execID
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * orderID
     */
    private final OrderIdOptionalField orderIdOptional = new OrderIdOptionalField();

    /**
     * origClOrdID
     */
    private final OrigclordidField origclordid = new OrigclordidField();

    /**
     * account
     */
    private final AccountField account = new AccountField();

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
     * crossedIndicator
     */
    private final CrossedIndicatorField crossedIndicator = new CrossedIndicatorField();

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
     * text data struct
     */
    private final Text text = new Text();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(outboundBusinessHeader.fields(), List.<Field>of(side), List.<Field>of(cxlRejResponseTo), List.<Field>of(clordid), List.<Field>of(secondaryOrderIdOptional), List.<Field>of(securityId), List.<Field>of(ordRejReason), List.<Field>of(transactTime), List.<Field>of(execId), List.<Field>of(orderIdOptional), List.<Field>of(origclordid), List.<Field>of(account), List.<Field>of(ordtype), List.<Field>of(timeInForce), List.<Field>of(expireDate), List.<Field>of(orderQty), List.<Field>of(priceOptional), List.<Field>of(stopPx), List.<Field>of(minQty), List.<Field>of(maxFloor), List.<Field>of(crossidOptional), List.<Field>of(crossedIndicator), deskId.fields(), memo.fields(), text.fields()).flatMap(List::stream).toList();

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
     * cxlRejResponseTo
     *
     * @return the CxlRejResponseTo field
     */
    public CxlRejResponseToField cxlRejResponseTo() {
        return cxlRejResponseTo;
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
     * @return the SecondaryOrderIdOptional field
     */
    public SecondaryOrderIdOptionalField secondaryOrderIdOptional() {
        return secondaryOrderIdOptional;
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
     * ordRejReason
     *
     * @return the OrdRejReason field
     */
    public OrdRejReasonField ordRejReason() {
        return ordRejReason;
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
     * execID
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * orderID
     *
     * @return the OrderIdOptional field
     */
    public OrderIdOptionalField orderIdOptional() {
        return orderIdOptional;
    }

    /**
     * origClOrdID
     *
     * @return the Origclordid field
     */
    public OrigclordidField origclordid() {
        return origclordid;
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
     * crossedIndicator
     *
     * @return the CrossedIndicator field
     */
    public CrossedIndicatorField crossedIndicator() {
        return crossedIndicator;
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
        if (!outboundBusinessHeader.parseFrom(data, cursor, end - 123)) {
            return false;
        }
        cursor += outboundBusinessHeader.byteLength();
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!cxlRejResponseTo.parse(data, cursor)) {
            return false;
        }
        cursor += CxlRejResponseToField.BYTE_LENGTH;
        if (!clordid.parse(data, cursor)) {
            return false;
        }
        cursor += ClordidField.BYTE_LENGTH;
        if (!secondaryOrderIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryOrderIdOptionalField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!ordRejReason.parse(data, cursor)) {
            return false;
        }
        cursor += OrdRejReasonField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!orderIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdOptionalField.BYTE_LENGTH;
        if (!origclordid.parse(data, cursor)) {
            return false;
        }
        cursor += OrigclordidField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
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
        if (!crossedIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CrossedIndicatorField.BYTE_LENGTH;
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
        cursor = outboundBusinessHeader.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = cxlRejResponseTo.encode(data, cursor);
        cursor = clordid.encode(data, cursor);
        cursor = secondaryOrderIdOptional.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = ordRejReason.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = orderIdOptional.encode(data, cursor);
        cursor = origclordid.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = ordtype.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = priceOptional.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = crossidOptional.encode(data, cursor);
        cursor = crossedIndicator.encode(data, cursor);
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
        outboundBusinessHeader.clear();
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
            case "Side" -> Optional.of(side);
            case "CxlRejResponseTo" -> Optional.of(cxlRejResponseTo);
            case "Clordid" -> Optional.of(clordid);
            case "SecondaryOrderIdOptional" -> Optional.of(secondaryOrderIdOptional);
            case "SecurityId" -> Optional.of(securityId);
            case "OrdRejReason" -> Optional.of(ordRejReason);
            case "TransactTime" -> Optional.of(transactTime);
            case "ExecId" -> Optional.of(execId);
            case "OrderIdOptional" -> Optional.of(orderIdOptional);
            case "Origclordid" -> Optional.of(origclordid);
            case "Account" -> Optional.of(account);
            case "Ordtype" -> Optional.of(ordtype);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "ExpireDate" -> Optional.of(expireDate);
            case "OrderQty" -> Optional.of(orderQty);
            case "PriceOptional" -> Optional.of(priceOptional);
            case "StopPx" -> Optional.of(stopPx);
            case "MinQty" -> Optional.of(minQty);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "CrossidOptional" -> Optional.of(crossidOptional);
            case "CrossedIndicator" -> Optional.of(crossedIndicator);
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
