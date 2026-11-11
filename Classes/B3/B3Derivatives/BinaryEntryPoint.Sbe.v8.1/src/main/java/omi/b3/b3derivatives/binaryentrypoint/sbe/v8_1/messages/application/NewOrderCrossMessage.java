package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.CrossPrioritizationField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.CrossTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.CrossedIndicatorField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.CrossidField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.EnteringTraderField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.ExecutingTraderOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.MaxSweepQtyField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.OrderQtyField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.PriceField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SenderLocationField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.CrossSidesGroups;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.DeskId;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.InboundBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.Memo;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.PrintOptions;

/**
 * Represents the NewOrderCrossMessage message from the BinaryEntryPoint protocol.
 *
 * <p>NewOrderCrossMessage</p>
 */
public final class NewOrderCrossMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 89;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Cross Message";

    /**
     * crossID
     */
    private final CrossidField crossid = new CrossidField();

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
    private final ExecutingTraderOptionalField executingTraderOptional = new ExecutingTraderOptionalField();

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * orderQty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * price
     */
    private final PriceField price = new PriceField();

    /**
     * crossedIndicator
     */
    private final CrossedIndicatorField crossedIndicator = new CrossedIndicatorField();

    /**
     * crossType
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * crossPrioritization
     */
    private final CrossPrioritizationField crossPrioritization = new CrossPrioritizationField();

    /**
     * maxSweepQty
     */
    private final MaxSweepQtyField maxSweepQty = new MaxSweepQtyField();

    /**
     * InboundBusinessHeader
     */
    private final InboundBusinessHeader inboundBusinessHeader = new InboundBusinessHeader();

    /**
     * noSides Block
     */
    private final CrossSidesGroups crossSidesGroups = new CrossSidesGroups();

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
    private final List<Field> fields = Stream.of(inboundBusinessHeader.fields(), List.<Field>of(crossid), List.<Field>of(senderLocation), List.<Field>of(enteringTrader), List.<Field>of(executingTraderOptional), List.<Field>of(securityId), List.<Field>of(orderQty), List.<Field>of(price), List.<Field>of(crossedIndicator), List.<Field>of(crossType), List.<Field>of(crossPrioritization), List.<Field>of(maxSweepQty), deskId.fields(), memo.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * crossID
     *
     * @return the Crossid field
     */
    public CrossidField crossid() {
        return crossid;
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
     * @return the ExecutingTraderOptional field
     */
    public ExecutingTraderOptionalField executingTraderOptional() {
        return executingTraderOptional;
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
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
     * crossType
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * crossPrioritization
     *
     * @return the CrossPrioritization field
     */
    public CrossPrioritizationField crossPrioritization() {
        return crossPrioritization;
    }

    /**
     * maxSweepQty
     *
     * @return the MaxSweepQty field
     */
    public MaxSweepQtyField maxSweepQty() {
        return maxSweepQty;
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
     * noSides Block
     *
     * @return the CrossSidesGroups record
     */
    public CrossSidesGroups crossSidesGroups() {
        return crossSidesGroups;
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
        return MINIMUM_BYTE_LENGTH + crossSidesGroups.byteLength() - CrossSidesGroups.MINIMUM_BYTE_LENGTH + deskId.byteLength() - DeskId.MINIMUM_BYTE_LENGTH + memo.byteLength() - Memo.MINIMUM_BYTE_LENGTH;
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
        runs.add(cursor).add(2);
        cursor += 2;
        cursor += 8;
        cursor += 10;
        cursor += 5;
        cursor += 5;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        cursor = crossSidesGroups.padding(runs, cursor);
        cursor += deskId.byteLength();
        cursor += memo.byteLength();
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
        if (!inboundBusinessHeader.parseFrom(data, cursor, end - 71)) {
            return false;
        }
        cursor += inboundBusinessHeader.byteLength();
        cursor += 2; // padding
        if (!crossid.parse(data, cursor)) {
            return false;
        }
        cursor += CrossidField.BYTE_LENGTH;
        if (!senderLocation.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationField.BYTE_LENGTH;
        if (!enteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += EnteringTraderField.BYTE_LENGTH;
        if (!executingTraderOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderOptionalField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!crossedIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CrossedIndicatorField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        if (!crossPrioritization.parse(data, cursor)) {
            return false;
        }
        cursor += CrossPrioritizationField.BYTE_LENGTH;
        if (!maxSweepQty.parse(data, cursor)) {
            return false;
        }
        cursor += MaxSweepQtyField.BYTE_LENGTH;
        if (!crossSidesGroups.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += crossSidesGroups.byteLength();
        if (end - cursor < 2) {
            return false;
        }
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
        cursor = inboundBusinessHeader.encode(data, cursor);
        if (buffer != null && buffer.length >= 20) {
            System.arraycopy(buffer, 18, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = crossid.encode(data, cursor);
        cursor = senderLocation.encode(data, cursor);
        cursor = enteringTrader.encode(data, cursor);
        cursor = executingTraderOptional.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = crossedIndicator.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = crossPrioritization.encode(data, cursor);
        cursor = maxSweepQty.encode(data, cursor);
        cursor = crossSidesGroups.encode(data, cursor);
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
        crossSidesGroups.clear();
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
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != deskId.deskIdLength() && field != memo.memoLength() && !field.isRecognized()) {
                return false;
            }
        }
        return crossSidesGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != deskId.deskIdLength() && field != memo.memoLength() && !field.isValid()) {
                return false;
            }
        }
        if (!crossSidesGroups.isValid()) {
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
        if (!inboundBusinessHeader.isDecoded()) {
            return inboundBusinessHeader.failedAt();
        }
        if (!crossid.isDecoded()) {
            return Optional.of(crossid);
        }
        if (!senderLocation.isDecoded()) {
            return Optional.of(senderLocation);
        }
        if (!enteringTrader.isDecoded()) {
            return Optional.of(enteringTrader);
        }
        if (!executingTraderOptional.isDecoded()) {
            return Optional.of(executingTraderOptional);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!crossedIndicator.isDecoded()) {
            return Optional.of(crossedIndicator);
        }
        if (!crossType.isDecoded()) {
            return Optional.of(crossType);
        }
        if (!crossPrioritization.isDecoded()) {
            return Optional.of(crossPrioritization);
        }
        if (!maxSweepQty.isDecoded()) {
            return Optional.of(maxSweepQty);
        }
        if (!crossSidesGroups.isDecoded()) {
            return crossSidesGroups.failedAt();
        }
        if (!deskId.isDecoded()) {
            return deskId.failedAt();
        }
        if (!memo.isDecoded()) {
            return memo.failedAt();
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
            case "Crossid" -> Optional.of(crossid);
            case "SenderLocation" -> Optional.of(senderLocation);
            case "EnteringTrader" -> Optional.of(enteringTrader);
            case "ExecutingTraderOptional" -> Optional.of(executingTraderOptional);
            case "SecurityId" -> Optional.of(securityId);
            case "OrderQty" -> Optional.of(orderQty);
            case "Price" -> Optional.of(price);
            case "CrossedIndicator" -> Optional.of(crossedIndicator);
            case "CrossType" -> Optional.of(crossType);
            case "CrossPrioritization" -> Optional.of(crossPrioritization);
            case "MaxSweepQty" -> Optional.of(maxSweepQty);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderCrossMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(crossSidesGroups.diffFields(message.crossSidesGroups));
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
            crossSidesGroups.toFormattedString(builder, options);
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
        crossSidesGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof NewOrderCrossMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && crossSidesGroups.equals(message.crossSidesGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, crossSidesGroups);
    }
}
