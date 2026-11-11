package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.EnteringTraderField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.OrigPosReqRefIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.PosMaintRptRefIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.PosReqIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SenderLocationField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.InboundBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.PrintOptions;

/**
 * Represents the PositionMaintenanceCancelRequestMessage message from the BinaryEntryPoint protocol.
 *
 * <p>PositionMaintenanceCancelRequestMessage</p>
 */
public final class PositionMaintenanceCancelRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 65;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Position Maintenance Cancel Request Message";

    /**
     * posReqID
     */
    private final PosReqIdField posReqId = new PosReqIdField();

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * origPosReqRefID
     */
    private final OrigPosReqRefIdField origPosReqRefId = new OrigPosReqRefIdField();

    /**
     * posMaintRptRefID
     */
    private final PosMaintRptRefIdField posMaintRptRefId = new PosMaintRptRefIdField();

    /**
     * senderLocation
     */
    private final SenderLocationField senderLocation = new SenderLocationField();

    /**
     * enteringTrader
     */
    private final EnteringTraderField enteringTrader = new EnteringTraderField();

    /**
     * InboundBusinessHeader
     */
    private final InboundBusinessHeader inboundBusinessHeader = new InboundBusinessHeader();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(inboundBusinessHeader.fields(), List.<Field>of(posReqId), List.<Field>of(securityId), List.<Field>of(origPosReqRefId), List.<Field>of(posMaintRptRefId), List.<Field>of(senderLocation), List.<Field>of(enteringTrader)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * posReqID
     *
     * @return the PosReqId field
     */
    public PosReqIdField posReqId() {
        return posReqId;
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
     * origPosReqRefID
     *
     * @return the OrigPosReqRefId field
     */
    public OrigPosReqRefIdField origPosReqRefId() {
        return origPosReqRefId;
    }

    /**
     * posMaintRptRefID
     *
     * @return the PosMaintRptRefId field
     */
    public PosMaintRptRefIdField posMaintRptRefId() {
        return posMaintRptRefId;
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
     * InboundBusinessHeader
     *
     * @return the InboundBusinessHeader record
     */
    public InboundBusinessHeader inboundBusinessHeader() {
        return inboundBusinessHeader;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!inboundBusinessHeader.parseFrom(data, cursor, end - 47)) {
            return false;
        }
        cursor += inboundBusinessHeader.byteLength();
        if (!posReqId.parse(data, cursor)) {
            return false;
        }
        cursor += PosReqIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!origPosReqRefId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigPosReqRefIdField.BYTE_LENGTH;
        if (!posMaintRptRefId.parse(data, cursor)) {
            return false;
        }
        cursor += PosMaintRptRefIdField.BYTE_LENGTH;
        if (!senderLocation.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationField.BYTE_LENGTH;
        return enteringTrader.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = inboundBusinessHeader.encode(data, cursor);
        cursor = posReqId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = origPosReqRefId.encode(data, cursor);
        cursor = posMaintRptRefId.encode(data, cursor);
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
        inboundBusinessHeader.clear();
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
            case "PosReqId" -> Optional.of(posReqId);
            case "SecurityId" -> Optional.of(securityId);
            case "OrigPosReqRefId" -> Optional.of(origPosReqRefId);
            case "PosMaintRptRefId" -> Optional.of(posMaintRptRefId);
            case "SenderLocation" -> Optional.of(senderLocation);
            case "EnteringTrader" -> Optional.of(enteringTrader);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PositionMaintenanceCancelRequestMessage message)) {
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
        if (!(other instanceof PositionMaintenanceCancelRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
