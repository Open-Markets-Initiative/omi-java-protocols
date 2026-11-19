package omi.miax.onyxfutures.expressinterface.fei.v1_0_c.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.ApplicationProtocolField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.ComputerIdField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.RequestedSequenceNumberField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.RequestedSessionField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.SesmVersionField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.UsernameField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.types.Field;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.types.GroupEntry;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.types.PrintOptions;

/**
 * The LoginRequest record a message holds.
 *
 * <p>The SesM client must send a Login request packet immediately upon establishing a new TCP/IP socket connection to the server</p>
 */
public final class LoginRequest implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 35;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "LoginRequest";

    /**
     * Sesm Version
     */
    private final SesmVersionField sesmVersion = new SesmVersionField();

    /**
     * issued by MIAX Futures Exchange during initial setup
     */
    private final UsernameField username = new UsernameField();

    /**
     * issued by MIAX Futures Exchange during initial setup
     */
    private final ComputerIdField computerId = new ComputerIdField();

    /**
     * Miax Application Protocol
     */
    private final ApplicationProtocolField applicationProtocol = new ApplicationProtocolField();

    /**
     * Specifies the session the client would like to log into, or zero to log into the currently active session
     */
    private final RequestedSessionField requestedSession = new RequestedSessionField();

    /**
     * Specifies client requested sequence number
     */
    private final RequestedSequenceNumberField requestedSequenceNumber = new RequestedSequenceNumberField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(sesmVersion, username, computerId, applicationProtocol, requestedSession, requestedSequenceNumber);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Sesm Version
     *
     * @return the SesmVersion field
     */
    public SesmVersionField sesmVersion() {
        return sesmVersion;
    }

    /**
     * issued by MIAX Futures Exchange during initial setup
     *
     * @return the Username field
     */
    public UsernameField username() {
        return username;
    }

    /**
     * issued by MIAX Futures Exchange during initial setup
     *
     * @return the ComputerId field
     */
    public ComputerIdField computerId() {
        return computerId;
    }

    /**
     * Miax Application Protocol
     *
     * @return the ApplicationProtocol field
     */
    public ApplicationProtocolField applicationProtocol() {
        return applicationProtocol;
    }

    /**
     * Specifies the session the client would like to log into, or zero to log into the currently active session
     *
     * @return the RequestedSession field
     */
    public RequestedSessionField requestedSession() {
        return requestedSession;
    }

    /**
     * Specifies client requested sequence number
     *
     * @return the RequestedSequenceNumber field
     */
    public RequestedSequenceNumberField requestedSequenceNumber() {
        return requestedSequenceNumber;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
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
        if (!sesmVersion.parse(data, cursor)) {
            return false;
        }
        cursor += SesmVersionField.BYTE_LENGTH;
        if (!username.parse(data, cursor)) {
            return false;
        }
        cursor += UsernameField.BYTE_LENGTH;
        if (!computerId.parse(data, cursor)) {
            return false;
        }
        cursor += ComputerIdField.BYTE_LENGTH;
        if (!applicationProtocol.parse(data, cursor)) {
            return false;
        }
        cursor += ApplicationProtocolField.BYTE_LENGTH;
        if (!requestedSession.parse(data, cursor)) {
            return false;
        }
        cursor += RequestedSessionField.BYTE_LENGTH;
        return requestedSequenceNumber.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sesmVersion.encode(data, cursor);
        cursor = username.encode(data, cursor);
        cursor = computerId.encode(data, cursor);
        cursor = applicationProtocol.encode(data, cursor);
        cursor = requestedSession.encode(data, cursor);
        cursor = requestedSequenceNumber.encode(data, cursor);
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
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
            case "SesmVersion" -> Optional.of(sesmVersion);
            case "Username" -> Optional.of(username);
            case "ComputerId" -> Optional.of(computerId);
            case "ApplicationProtocol" -> Optional.of(applicationProtocol);
            case "RequestedSession" -> Optional.of(requestedSession);
            case "RequestedSequenceNumber" -> Optional.of(requestedSequenceNumber);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof LoginRequest message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof LoginRequest message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
