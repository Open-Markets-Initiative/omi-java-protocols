package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AllocIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AllocNoOrdersTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AllocRejCodeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AllocReportIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AllocReportTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AllocStatusField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AllocTransTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.EnteringTraderField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.QuantityField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SenderLocationField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SideField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.TradeDateOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.TransactTimeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.OutboundBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.PrintOptions;

/**
 * Represents the AllocationReportMessage message from the BinaryEntryPoint protocol.
 *
 * <p>AllocationReportMessage</p>
 */
public final class AllocationReportMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 84;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Allocation Report Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * allocID
     */
    private final AllocIdField allocId = new AllocIdField();

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * allocReportID
     */
    private final AllocReportIdField allocReportId = new AllocReportIdField();

    /**
     * allocTransType
     */
    private final AllocTransTypeField allocTransType = new AllocTransTypeField();

    /**
     * allocReportType
     */
    private final AllocReportTypeField allocReportType = new AllocReportTypeField();

    /**
     * allocNoOrdersType
     */
    private final AllocNoOrdersTypeField allocNoOrdersType = new AllocNoOrdersTypeField();

    /**
     * allocRejCode
     */
    private final AllocRejCodeField allocRejCode = new AllocRejCodeField();

    /**
     * quantity
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * allocStatus
     */
    private final AllocStatusField allocStatus = new AllocStatusField();

    /**
     * tradeDate
     */
    private final TradeDateOptionalField tradeDateOptional = new TradeDateOptionalField();

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * senderLocation
     */
    private final SenderLocationField senderLocation = new SenderLocationField();

    /**
     * enteringTrader
     */
    private final EnteringTraderField enteringTrader = new EnteringTraderField();

    /**
     * OutboundBusinessHeader
     */
    private final OutboundBusinessHeader outboundBusinessHeader = new OutboundBusinessHeader();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(outboundBusinessHeader.fields(), List.<Field>of(allocId), List.<Field>of(securityId), List.<Field>of(allocReportId), List.<Field>of(allocTransType), List.<Field>of(allocReportType), List.<Field>of(allocNoOrdersType), List.<Field>of(allocRejCode), List.<Field>of(quantity), List.<Field>of(allocStatus), List.<Field>of(tradeDateOptional), List.<Field>of(transactTime), List.<Field>of(side), List.<Field>of(senderLocation), List.<Field>of(enteringTrader)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * allocID
     *
     * @return the AllocId field
     */
    public AllocIdField allocId() {
        return allocId;
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
     * allocReportID
     *
     * @return the AllocReportId field
     */
    public AllocReportIdField allocReportId() {
        return allocReportId;
    }

    /**
     * allocTransType
     *
     * @return the AllocTransType field
     */
    public AllocTransTypeField allocTransType() {
        return allocTransType;
    }

    /**
     * allocReportType
     *
     * @return the AllocReportType field
     */
    public AllocReportTypeField allocReportType() {
        return allocReportType;
    }

    /**
     * allocNoOrdersType
     *
     * @return the AllocNoOrdersType field
     */
    public AllocNoOrdersTypeField allocNoOrdersType() {
        return allocNoOrdersType;
    }

    /**
     * allocRejCode
     *
     * @return the AllocRejCode field
     */
    public AllocRejCodeField allocRejCode() {
        return allocRejCode;
    }

    /**
     * quantity
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * allocStatus
     *
     * @return the AllocStatus field
     */
    public AllocStatusField allocStatus() {
        return allocStatus;
    }

    /**
     * tradeDate
     *
     * @return the TradeDateOptional field
     */
    public TradeDateOptionalField tradeDateOptional() {
        return tradeDateOptional;
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
     * side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
     * OutboundBusinessHeader
     *
     * @return the OutboundBusinessHeader record
     */
    public OutboundBusinessHeader outboundBusinessHeader() {
        return outboundBusinessHeader;
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
        return PADDING.clone();
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!outboundBusinessHeader.parseFrom(data, cursor, end - 66)) {
            return false;
        }
        cursor += outboundBusinessHeader.byteLength();
        if (!allocId.parse(data, cursor)) {
            return false;
        }
        cursor += AllocIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!allocReportId.parse(data, cursor)) {
            return false;
        }
        cursor += AllocReportIdField.BYTE_LENGTH;
        if (!allocTransType.parse(data, cursor)) {
            return false;
        }
        cursor += AllocTransTypeField.BYTE_LENGTH;
        if (!allocReportType.parse(data, cursor)) {
            return false;
        }
        cursor += AllocReportTypeField.BYTE_LENGTH;
        if (!allocNoOrdersType.parse(data, cursor)) {
            return false;
        }
        cursor += AllocNoOrdersTypeField.BYTE_LENGTH;
        if (!allocRejCode.parse(data, cursor)) {
            return false;
        }
        cursor += AllocRejCodeField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!allocStatus.parse(data, cursor)) {
            return false;
        }
        cursor += AllocStatusField.BYTE_LENGTH;
        if (!tradeDateOptional.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateOptionalField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!senderLocation.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationField.BYTE_LENGTH;
        if (!enteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += EnteringTraderField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = outboundBusinessHeader.encode(data, cursor);
        cursor = allocId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = allocReportId.encode(data, cursor);
        cursor = allocTransType.encode(data, cursor);
        cursor = allocReportType.encode(data, cursor);
        cursor = allocNoOrdersType.encode(data, cursor);
        cursor = allocRejCode.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = allocStatus.encode(data, cursor);
        cursor = tradeDateOptional.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = senderLocation.encode(data, cursor);
        cursor = enteringTrader.encode(data, cursor);
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
        outboundBusinessHeader.clear();
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
            case "AllocId" -> Optional.of(allocId);
            case "SecurityId" -> Optional.of(securityId);
            case "AllocReportId" -> Optional.of(allocReportId);
            case "AllocTransType" -> Optional.of(allocTransType);
            case "AllocReportType" -> Optional.of(allocReportType);
            case "AllocNoOrdersType" -> Optional.of(allocNoOrdersType);
            case "AllocRejCode" -> Optional.of(allocRejCode);
            case "Quantity" -> Optional.of(quantity);
            case "AllocStatus" -> Optional.of(allocStatus);
            case "TradeDateOptional" -> Optional.of(tradeDateOptional);
            case "TransactTime" -> Optional.of(transactTime);
            case "Side" -> Optional.of(side);
            case "SenderLocation" -> Optional.of(senderLocation);
            case "EnteringTrader" -> Optional.of(enteringTrader);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AllocationReportMessage message)) {
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
        if (!(other instanceof AllocationReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
