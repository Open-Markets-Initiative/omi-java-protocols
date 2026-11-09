package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AllocAccountField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AllocIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AllocNoOrdersTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AllocQtyField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AllocTransTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AllocTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.EnteringTraderField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.IndividualAllocIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.QuantityField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SenderLocationField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.TradeDateOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.TradeIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.DeskId;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.InboundBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.Memo;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.PrintOptions;

/**
 * Represents the AllocationInstructionMessage message from the BinaryEntryPoint protocol.
 *
 * <p>AllocationInstructionMessage</p>
 */
public final class AllocationInstructionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 88;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Allocation Instruction Message";

    /**
     * allocID
     */
    private final AllocIdField allocId = new AllocIdField();

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * allocTransType
     */
    private final AllocTransTypeField allocTransType = new AllocTransTypeField();

    /**
     * allocType
     */
    private final AllocTypeField allocType = new AllocTypeField();

    /**
     * allocNoOrdersType
     */
    private final AllocNoOrdersTypeField allocNoOrdersType = new AllocNoOrdersTypeField();

    /**
     * quantity
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * senderLocation
     */
    private final SenderLocationField senderLocation = new SenderLocationField();

    /**
     * enteringTrader
     */
    private final EnteringTraderField enteringTrader = new EnteringTraderField();

    /**
     * tradeID
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * tradeDate
     */
    private final TradeDateOptionalField tradeDateOptional = new TradeDateOptionalField();

    /**
     * individualAllocID
     */
    private final IndividualAllocIdField individualAllocId = new IndividualAllocIdField();

    /**
     * allocAccount
     */
    private final AllocAccountField allocAccount = new AllocAccountField();

    /**
     * allocQty
     */
    private final AllocQtyField allocQty = new AllocQtyField();

    /**
     * InboundBusinessHeader
     */
    private final InboundBusinessHeader inboundBusinessHeader = new InboundBusinessHeader();

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
    private final List<Field> fields = Stream.of(inboundBusinessHeader.fields(), List.<Field>of(allocId), List.<Field>of(securityId), List.<Field>of(allocTransType), List.<Field>of(allocType), List.<Field>of(allocNoOrdersType), List.<Field>of(quantity), List.<Field>of(senderLocation), List.<Field>of(enteringTrader), List.<Field>of(tradeId), List.<Field>of(tradeDateOptional), List.<Field>of(individualAllocId), List.<Field>of(allocAccount), List.<Field>of(allocQty), deskId.fields(), memo.fields()).flatMap(List::stream).toList();

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
     * allocTransType
     *
     * @return the AllocTransType field
     */
    public AllocTransTypeField allocTransType() {
        return allocTransType;
    }

    /**
     * allocType
     *
     * @return the AllocType field
     */
    public AllocTypeField allocType() {
        return allocType;
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
     * quantity
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
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
     * tradeID
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
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
     * individualAllocID
     *
     * @return the IndividualAllocId field
     */
    public IndividualAllocIdField individualAllocId() {
        return individualAllocId;
    }

    /**
     * allocAccount
     *
     * @return the AllocAccount field
     */
    public AllocAccountField allocAccount() {
        return allocAccount;
    }

    /**
     * allocQty
     *
     * @return the AllocQty field
     */
    public AllocQtyField allocQty() {
        return allocQty;
    }

    /**
     * InboundBusinessHeader
     *
     * @return the InboundBusinessHeader record
     */
    public InboundBusinessHeader inboundBusinessHeader() {
        return inboundBusinessHeader;
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
        for (int[] run = InboundBusinessHeader.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += InboundBusinessHeader.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        cursor += 10;
        cursor += 5;
        cursor += 4;
        cursor += 2;
        cursor += 8;
        cursor += 4;
        cursor += 8;
        cursor = deskId.padding(runs, cursor);
        cursor = memo.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(inboundBusinessHeader.sendingTime().value());
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
        if (!inboundBusinessHeader.parseFrom(data, cursor, end - 70)) {
            return false;
        }
        cursor += inboundBusinessHeader.byteLength();
        if (!allocId.parse(data, cursor)) {
            return false;
        }
        cursor += AllocIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!allocTransType.parse(data, cursor)) {
            return false;
        }
        cursor += AllocTransTypeField.BYTE_LENGTH;
        if (!allocType.parse(data, cursor)) {
            return false;
        }
        cursor += AllocTypeField.BYTE_LENGTH;
        if (!allocNoOrdersType.parse(data, cursor)) {
            return false;
        }
        cursor += AllocNoOrdersTypeField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!senderLocation.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationField.BYTE_LENGTH;
        if (!enteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += EnteringTraderField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!tradeDateOptional.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateOptionalField.BYTE_LENGTH;
        if (!individualAllocId.parse(data, cursor)) {
            return false;
        }
        cursor += IndividualAllocIdField.BYTE_LENGTH;
        if (!allocAccount.parse(data, cursor)) {
            return false;
        }
        cursor += AllocAccountField.BYTE_LENGTH;
        if (!allocQty.parse(data, cursor)) {
            return false;
        }
        cursor += AllocQtyField.BYTE_LENGTH;
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
        cursor = inboundBusinessHeader.encode(data, cursor);
        cursor = allocId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = allocTransType.encode(data, cursor);
        cursor = allocType.encode(data, cursor);
        cursor = allocNoOrdersType.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = senderLocation.encode(data, cursor);
        cursor = enteringTrader.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = tradeDateOptional.encode(data, cursor);
        cursor = individualAllocId.encode(data, cursor);
        cursor = allocAccount.encode(data, cursor);
        cursor = allocQty.encode(data, cursor);
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
        inboundBusinessHeader.clear();
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
            case "AllocId" -> Optional.of(allocId);
            case "SecurityId" -> Optional.of(securityId);
            case "AllocTransType" -> Optional.of(allocTransType);
            case "AllocType" -> Optional.of(allocType);
            case "AllocNoOrdersType" -> Optional.of(allocNoOrdersType);
            case "Quantity" -> Optional.of(quantity);
            case "SenderLocation" -> Optional.of(senderLocation);
            case "EnteringTrader" -> Optional.of(enteringTrader);
            case "TradeId" -> Optional.of(tradeId);
            case "TradeDateOptional" -> Optional.of(tradeDateOptional);
            case "IndividualAllocId" -> Optional.of(individualAllocId);
            case "AllocAccount" -> Optional.of(allocAccount);
            case "AllocQty" -> Optional.of(allocQty);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AllocationInstructionMessage message)) {
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
        if (!(other instanceof AllocationInstructionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
