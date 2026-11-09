package omi.miax.pearlequities.expressorders.meo.v2_6.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.ApplicationProtocolField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.ComputerIdField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.EsesmVersionField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.NumberOfMatchingEnginesField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.UsernameField;
import omi.miax.pearlequities.expressorders.meo.v2_6.groups.RequestedMatchingEngineEntry;
import omi.miax.pearlequities.expressorders.meo.v2_6.groups.RequestedMatchingEngineList;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.Field;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.GroupEntry;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.PrintOptions;

/**
 * The LoginRequest record a message holds.
 *
 * <p>The SesM client must send a Login request packet immediately upon establishing a new TCP/IP socket connection to the server</p>
 */
public final class LoginRequest implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 27;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "LoginRequest";

    /**
     * Protocol version
     */
    private final EsesmVersionField esesmVersion = new EsesmVersionField();

    /**
     * issued by MIAX during initial setup
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
     * 24 This is the number of Matching Engines in
     */
    private final NumberOfMatchingEnginesField numberOfMatchingEngines = new NumberOfMatchingEnginesField();

    /**
     * The trading session and sequence number the client asks of one matching engine, repeated once for each the login request counts
     */
    private final RequestedMatchingEngineList requestedMatchingEngine = new RequestedMatchingEngineList();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(esesmVersion, username, computerId, applicationProtocol, numberOfMatchingEngines);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Protocol version
     *
     * @return the EsesmVersion field
     */
    public EsesmVersionField esesmVersion() {
        return esesmVersion;
    }

    /**
     * issued by MIAX during initial setup
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
     * 24 This is the number of Matching Engines in
     *
     * @return the NumberOfMatchingEngines field
     */
    public NumberOfMatchingEnginesField numberOfMatchingEngines() {
        return numberOfMatchingEngines;
    }

    /**
     * The trading session and sequence number the client asks of one matching engine, repeated once for each the login request counts
     *
     * <p>Encode writes this list's size to the NumberOfMatchingEngines field.</p>
     *
     * @return the RequestedMatchingEngine entries
     */
    public RequestedMatchingEngineList requestedMatchingEngine() {
        return requestedMatchingEngine;
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + requestedMatchingEngine.byteLength();
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
        cursor += 5;
        cursor += 5;
        cursor += 8;
        cursor += 8;
        cursor += 1;
        cursor = requestedMatchingEngine.padding(runs, cursor);
        return cursor;
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
        if (!esesmVersion.parse(data, cursor)) {
            return false;
        }
        cursor += EsesmVersionField.BYTE_LENGTH;
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
        if (!numberOfMatchingEngines.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfMatchingEnginesField.BYTE_LENGTH;
        if (!requestedMatchingEngine.parse(data, cursor, end, numberOfMatchingEngines.value())) {
            return false;
        }
        cursor += requestedMatchingEngine.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (requestedMatchingEngine.size() > 255) {
            throw new IllegalStateException("requestedMatchingEngine holds " + requestedMatchingEngine.size() + " entries, more than its count field can state");
        }
        numberOfMatchingEngines.value((short) requestedMatchingEngine.size());
        int cursor = offset;
        cursor = esesmVersion.encode(data, cursor);
        cursor = username.encode(data, cursor);
        cursor = computerId.encode(data, cursor);
        cursor = applicationProtocol.encode(data, cursor);
        cursor = numberOfMatchingEngines.encode(data, cursor);
        cursor = requestedMatchingEngine.encode(data, cursor);
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
        requestedMatchingEngine.clear();
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
            if (field != numberOfMatchingEngines && !field.isRecognized()) {
                return false;
            }
        }
        if (!requestedMatchingEngine.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfMatchingEngines && !field.isValid()) {
                return false;
            }
        }
        if (!requestedMatchingEngine.isValid()) {
            return false;
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
        if (!esesmVersion.isDecoded()) {
            return Optional.of(esesmVersion);
        }
        if (!username.isDecoded()) {
            return Optional.of(username);
        }
        if (!computerId.isDecoded()) {
            return Optional.of(computerId);
        }
        if (!applicationProtocol.isDecoded()) {
            return Optional.of(applicationProtocol);
        }
        if (!numberOfMatchingEngines.isDecoded()) {
            return Optional.of(numberOfMatchingEngines);
        }
        if (!requestedMatchingEngine.isDecoded()) {
            return Optional.of(requestedMatchingEngine.failedEntry().flatMap(RequestedMatchingEngineEntry::failedAt).orElse(numberOfMatchingEngines));
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
            case "EsesmVersion" -> Optional.of(esesmVersion);
            case "Username" -> Optional.of(username);
            case "ComputerId" -> Optional.of(computerId);
            case "ApplicationProtocol" -> Optional.of(applicationProtocol);
            case "NumberOfMatchingEngines" -> Optional.of(numberOfMatchingEngines);
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
        changed.addAll(requestedMatchingEngine.diffFields(message.requestedMatchingEngine));
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
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            requestedMatchingEngine.toFormattedString(builder, options);
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
        requestedMatchingEngine.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && requestedMatchingEngine.equals(message.requestedMatchingEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, requestedMatchingEngine);
    }
}
