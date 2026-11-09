package omi.eurex.t7.eti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v6_1.fields.GatewayIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.GatewayStatusField;
import omi.eurex.t7.eti.fbe.v6_1.fields.GatewaySubIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SecondaryGatewayIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SecondaryGatewayStatusField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SecondaryGatewaySubIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SessionModeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradSesModeField;
import omi.eurex.t7.eti.fbe.v6_1.structs.ResponseHeaderComp;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the GatewayResponse message from the Eti protocol.
 */
public final class GatewayResponse implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 50;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Gateway Response";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 22, 4, 46, 4 };

    /**
     * Gateway Id
     */
    private final GatewayIdField gatewayId = new GatewayIdField();

    /**
     * Gateway Sub Id
     */
    private final GatewaySubIdField gatewaySubId = new GatewaySubIdField();

    /**
     * Secondary Gateway Id
     */
    private final SecondaryGatewayIdField secondaryGatewayId = new SecondaryGatewayIdField();

    /**
     * Secondary Gateway Sub Id
     */
    private final SecondaryGatewaySubIdField secondaryGatewaySubId = new SecondaryGatewaySubIdField();

    /**
     * Gateway Status
     */
    private final GatewayStatusField gatewayStatus = new GatewayStatusField();

    /**
     * Secondary Gateway Status
     */
    private final SecondaryGatewayStatusField secondaryGatewayStatus = new SecondaryGatewayStatusField();

    /**
     * Session Mode
     */
    private final SessionModeField sessionMode = new SessionModeField();

    /**
     * Trad Ses Mode
     */
    private final TradSesModeField tradSesMode = new TradSesModeField();

    /**
     * Response Header Comp
     */
    private final ResponseHeaderComp responseHeaderComp = new ResponseHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(responseHeaderComp.fields(), List.<Field>of(gatewayId), List.<Field>of(gatewaySubId), List.<Field>of(secondaryGatewayId), List.<Field>of(secondaryGatewaySubId), List.<Field>of(gatewayStatus), List.<Field>of(secondaryGatewayStatus), List.<Field>of(sessionMode), List.<Field>of(tradSesMode)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Gateway Id
     *
     * @return the GatewayId field
     */
    public GatewayIdField gatewayId() {
        return gatewayId;
    }

    /**
     * Gateway Sub Id
     *
     * @return the GatewaySubId field
     */
    public GatewaySubIdField gatewaySubId() {
        return gatewaySubId;
    }

    /**
     * Secondary Gateway Id
     *
     * @return the SecondaryGatewayId field
     */
    public SecondaryGatewayIdField secondaryGatewayId() {
        return secondaryGatewayId;
    }

    /**
     * Secondary Gateway Sub Id
     *
     * @return the SecondaryGatewaySubId field
     */
    public SecondaryGatewaySubIdField secondaryGatewaySubId() {
        return secondaryGatewaySubId;
    }

    /**
     * Gateway Status
     *
     * @return the GatewayStatus field
     */
    public GatewayStatusField gatewayStatus() {
        return gatewayStatus;
    }

    /**
     * Secondary Gateway Status
     *
     * @return the SecondaryGatewayStatus field
     */
    public SecondaryGatewayStatusField secondaryGatewayStatus() {
        return secondaryGatewayStatus;
    }

    /**
     * Session Mode
     *
     * @return the SessionMode field
     */
    public SessionModeField sessionMode() {
        return sessionMode;
    }

    /**
     * Trad Ses Mode
     *
     * @return the TradSesMode field
     */
    public TradSesModeField tradSesMode() {
        return tradSesMode;
    }

    /**
     * Response Header Comp
     *
     * @return the ResponseHeaderComp record
     */
    public ResponseHeaderComp responseHeaderComp() {
        return responseHeaderComp;
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
        return Optional.ofNullable(responseHeaderComp.requestTime().value());
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
        cursor += 2; // padding
        if (!responseHeaderComp.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += responseHeaderComp.byteLength();
        if (!gatewayId.parse(data, cursor)) {
            return false;
        }
        cursor += GatewayIdField.BYTE_LENGTH;
        if (!gatewaySubId.parse(data, cursor)) {
            return false;
        }
        cursor += GatewaySubIdField.BYTE_LENGTH;
        if (!secondaryGatewayId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryGatewayIdField.BYTE_LENGTH;
        if (!secondaryGatewaySubId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryGatewaySubIdField.BYTE_LENGTH;
        if (!gatewayStatus.parse(data, cursor)) {
            return false;
        }
        cursor += GatewayStatusField.BYTE_LENGTH;
        if (!secondaryGatewayStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryGatewayStatusField.BYTE_LENGTH;
        if (!sessionMode.parse(data, cursor)) {
            return false;
        }
        cursor += SessionModeField.BYTE_LENGTH;
        if (!tradSesMode.parse(data, cursor)) {
            return false;
        }
        cursor += TradSesModeField.BYTE_LENGTH;
        cursor += 4; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = responseHeaderComp.encode(data, cursor);
        cursor = gatewayId.encode(data, cursor);
        cursor = gatewaySubId.encode(data, cursor);
        cursor = secondaryGatewayId.encode(data, cursor);
        cursor = secondaryGatewaySubId.encode(data, cursor);
        cursor = gatewayStatus.encode(data, cursor);
        cursor = secondaryGatewayStatus.encode(data, cursor);
        cursor = sessionMode.encode(data, cursor);
        cursor = tradSesMode.encode(data, cursor);
        if (buffer != null && buffer.length >= 46 + 4) {
            System.arraycopy(buffer, 46, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
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
        responseHeaderComp.clear();
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
            case "GatewayId" -> Optional.of(gatewayId);
            case "GatewaySubId" -> Optional.of(gatewaySubId);
            case "SecondaryGatewayId" -> Optional.of(secondaryGatewayId);
            case "SecondaryGatewaySubId" -> Optional.of(secondaryGatewaySubId);
            case "GatewayStatus" -> Optional.of(gatewayStatus);
            case "SecondaryGatewayStatus" -> Optional.of(secondaryGatewayStatus);
            case "SessionMode" -> Optional.of(sessionMode);
            case "TradSesMode" -> Optional.of(tradSesMode);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof GatewayResponse message)) {
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
        if (!(other instanceof GatewayResponse message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
