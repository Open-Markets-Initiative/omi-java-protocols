package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.EnteringTraderField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SecurityIdOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SecurityReqIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SecurityResponseIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SecurityResponseTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SecurityStrategyTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SenderLocationField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SymbolField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.OutboundBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.PrintOptions;

/**
 * Represents the SecurityDefinitionResponseMessage message from the BinaryEntryPoint protocol.
 *
 * <p>SecurityDefinitionResponseMessage</p>
 */
public final class SecurityDefinitionResponseMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 83;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Definition Response Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 18, 2 };

    /**
     * securityReqID
     */
    private final SecurityReqIdField securityReqId = new SecurityReqIdField();

    /**
     * securityID
     */
    private final SecurityIdOptionalField securityIdOptional = new SecurityIdOptionalField();

    /**
     * securityResponseType
     */
    private final SecurityResponseTypeField securityResponseType = new SecurityResponseTypeField();

    /**
     * securityStrategyType
     */
    private final SecurityStrategyTypeField securityStrategyType = new SecurityStrategyTypeField();

    /**
     * symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * securityResponseID
     */
    private final SecurityResponseIdField securityResponseId = new SecurityResponseIdField();

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
    private final List<Field> fields = Stream.of(outboundBusinessHeader.fields(), List.<Field>of(securityReqId), List.<Field>of(securityIdOptional), List.<Field>of(securityResponseType), List.<Field>of(securityStrategyType), List.<Field>of(symbol), List.<Field>of(securityResponseId), List.<Field>of(senderLocation), List.<Field>of(enteringTrader)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * securityReqID
     *
     * @return the SecurityReqId field
     */
    public SecurityReqIdField securityReqId() {
        return securityReqId;
    }

    /**
     * securityID
     *
     * @return the SecurityIdOptional field
     */
    public SecurityIdOptionalField securityIdOptional() {
        return securityIdOptional;
    }

    /**
     * securityResponseType
     *
     * @return the SecurityResponseType field
     */
    public SecurityResponseTypeField securityResponseType() {
        return securityResponseType;
    }

    /**
     * securityStrategyType
     *
     * @return the SecurityStrategyType field
     */
    public SecurityStrategyTypeField securityStrategyType() {
        return securityStrategyType;
    }

    /**
     * symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * securityResponseID
     *
     * @return the SecurityResponseId field
     */
    public SecurityResponseIdField securityResponseId() {
        return securityResponseId;
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
        if (!outboundBusinessHeader.parseFrom(data, cursor, end - 65)) {
            return false;
        }
        cursor += outboundBusinessHeader.byteLength();
        cursor += 2; // padding
        if (!securityReqId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityReqIdField.BYTE_LENGTH;
        if (!securityIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdOptionalField.BYTE_LENGTH;
        if (!securityResponseType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityResponseTypeField.BYTE_LENGTH;
        if (!securityStrategyType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityStrategyTypeField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!securityResponseId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityResponseIdField.BYTE_LENGTH;
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
        cursor = outboundBusinessHeader.encode(data, cursor);
        if (buffer != null && buffer.length >= 20) {
            System.arraycopy(buffer, 18, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = securityReqId.encode(data, cursor);
        cursor = securityIdOptional.encode(data, cursor);
        cursor = securityResponseType.encode(data, cursor);
        cursor = securityStrategyType.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = securityResponseId.encode(data, cursor);
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
            case "SecurityReqId" -> Optional.of(securityReqId);
            case "SecurityIdOptional" -> Optional.of(securityIdOptional);
            case "SecurityResponseType" -> Optional.of(securityResponseType);
            case "SecurityStrategyType" -> Optional.of(securityStrategyType);
            case "Symbol" -> Optional.of(symbol);
            case "SecurityResponseId" -> Optional.of(securityResponseId);
            case "SenderLocation" -> Optional.of(senderLocation);
            case "EnteringTrader" -> Optional.of(enteringTrader);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityDefinitionResponseMessage message)) {
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
        if (!(other instanceof SecurityDefinitionResponseMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
