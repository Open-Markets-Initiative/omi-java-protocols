package omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.ClientOrderIdField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.ClientSendTimeField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.MpIdField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.NumberOfLegsField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.OperatorIdField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.OperatorLocationField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.groups.StrategyLegEntry;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.groups.StrategyLegList;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.types.Field;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.types.Message;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.types.PrintOptions;

/**
 * Represents the StrategyCreationRequest message from the ExpressInterface protocol.
 *
 * <p>create a Complex Strategy order</p>
 */
public final class StrategyCreationRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 74;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Strategy Creation Request";

    /**
     * Firm’s send time
     */
    private final ClientSendTimeField clientSendTime = new ClientSendTimeField();

    /**
     * Five character MPID of the Firm whose order is sent
     */
    private final MpIdField mpId = new MpIdField();

    /**
     * This must contain a 2 to 18 character Operator.
     */
    private final OperatorIdField operatorId = new OperatorIdField();

    /**
     * The location associated with Operator ID
     */
    private final OperatorLocationField operatorLocation = new OperatorLocationField();

    /**
     * Firm specified unique order ID
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Number of strategy legs. The fields below
     */
    private final NumberOfLegsField numberOfLegs = new NumberOfLegsField();

    /**
     * Number of Legs
     */
    private final StrategyLegList strategyLeg = new StrategyLegList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clientSendTime, mpId, operatorId, operatorLocation, clientOrderId, numberOfLegs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Firm’s send time
     *
     * @return the ClientSendTime field
     */
    public ClientSendTimeField clientSendTime() {
        return clientSendTime;
    }

    /**
     * Five character MPID of the Firm whose order is sent
     *
     * @return the MpId field
     */
    public MpIdField mpId() {
        return mpId;
    }

    /**
     * This must contain a 2 to 18 character Operator.
     *
     * @return the OperatorId field
     */
    public OperatorIdField operatorId() {
        return operatorId;
    }

    /**
     * The location associated with Operator ID
     *
     * @return the OperatorLocation field
     */
    public OperatorLocationField operatorLocation() {
        return operatorLocation;
    }

    /**
     * Firm specified unique order ID
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * Number of strategy legs. The fields below
     *
     * @return the NumberOfLegs field
     */
    public NumberOfLegsField numberOfLegs() {
        return numberOfLegs;
    }

    /**
     * Number of Legs
     *
     * <p>Encode writes this list's size to the NumberOfLegs field.</p>
     *
     * @return the StrategyLeg entries
     */
    public StrategyLegList strategyLeg() {
        return strategyLeg;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + strategyLeg.byteLength();
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
        cursor += 8;
        cursor += 5;
        cursor += 18;
        cursor += 6;
        cursor += 20;
        runs.add(cursor).add(16);
        cursor += 16;
        cursor += 1;
        cursor = strategyLeg.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(clientSendTime.value());
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
        if (!clientSendTime.parse(data, cursor)) {
            return false;
        }
        cursor += ClientSendTimeField.BYTE_LENGTH;
        if (!mpId.parse(data, cursor)) {
            return false;
        }
        cursor += MpIdField.BYTE_LENGTH;
        if (!operatorId.parse(data, cursor)) {
            return false;
        }
        cursor += OperatorIdField.BYTE_LENGTH;
        if (!operatorLocation.parse(data, cursor)) {
            return false;
        }
        cursor += OperatorLocationField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        cursor += 16; // padding
        if (!numberOfLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLegsField.BYTE_LENGTH;
        if (!strategyLeg.parse(data, cursor, end, numberOfLegs.value())) {
            return false;
        }
        cursor += strategyLeg.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (strategyLeg.size() > 255) {
            throw new IllegalStateException("strategyLeg holds " + strategyLeg.size() + " entries, more than its count field can state");
        }
        numberOfLegs.value((short) strategyLeg.size());
        int cursor = offset;
        cursor = clientSendTime.encode(data, cursor);
        cursor = mpId.encode(data, cursor);
        cursor = operatorId.encode(data, cursor);
        cursor = operatorLocation.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        if (buffer != null && buffer.length >= 73) {
            System.arraycopy(buffer, 57, data, cursor, 16); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 16, (byte) 0); // padding
        }
        cursor += 16;
        cursor = numberOfLegs.encode(data, cursor);
        cursor = strategyLeg.encode(data, cursor);
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
        strategyLeg.clear();
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
            if (field != numberOfLegs && !field.isRecognized()) {
                return false;
            }
        }
        return strategyLeg.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfLegs && !field.isValid()) {
                return false;
            }
        }
        if (!strategyLeg.isValid()) {
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
        if (!clientSendTime.isDecoded()) {
            return Optional.of(clientSendTime);
        }
        if (!mpId.isDecoded()) {
            return Optional.of(mpId);
        }
        if (!operatorId.isDecoded()) {
            return Optional.of(operatorId);
        }
        if (!operatorLocation.isDecoded()) {
            return Optional.of(operatorLocation);
        }
        if (!clientOrderId.isDecoded()) {
            return Optional.of(clientOrderId);
        }
        if (!numberOfLegs.isDecoded()) {
            return Optional.of(numberOfLegs);
        }
        if (!strategyLeg.isDecoded()) {
            return Optional.of(strategyLeg.failedEntry().flatMap(StrategyLegEntry::failedAt).orElse(numberOfLegs));
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
            case "ClientSendTime" -> Optional.of(clientSendTime);
            case "MpId" -> Optional.of(mpId);
            case "OperatorId" -> Optional.of(operatorId);
            case "OperatorLocation" -> Optional.of(operatorLocation);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "NumberOfLegs" -> Optional.of(numberOfLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StrategyCreationRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(strategyLeg.diffFields(message.strategyLeg));
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
            strategyLeg.toFormattedString(builder, options);
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
        strategyLeg.toFormattedString(builder, nested);
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
        if (!(other instanceof StrategyCreationRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && strategyLeg.equals(message.strategyLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, strategyLeg);
    }
}
