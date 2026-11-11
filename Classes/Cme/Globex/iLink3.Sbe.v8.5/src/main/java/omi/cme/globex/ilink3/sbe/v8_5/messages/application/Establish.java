package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cme.globex.ilink3.sbe.v8_5.fields.AccessKeyIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.FirmField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.HmacSignatureField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.KeepAliveIntervalField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.NextSeqNoField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.RequestTimestampField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SessionField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TradingSystemNameField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TradingSystemVendorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TradingSystemVersionField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.UuidField;
import omi.cme.globex.ilink3.sbe.v8_5.structs.Credentials;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the Establish message from the iLink3 protocol.
 *
 * <p>After negotiation is complete, the customer must send an Establish message to start assigning sequence numbers. Once established, customers can submit orders and quotes.</p>
 */
public final class Establish implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 134;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Establish";

    /**
     * Hmac Signature
     */
    private final HmacSignatureField hmacSignature = new HmacSignatureField();

    /**
     * Contains the AccessKeyID assigned to this session on this port.
     */
    private final AccessKeyIdField accessKeyId = new AccessKeyIdField();

    /**
     * Provides the name of the application system being used to generate FIX application messages.
     */
    private final TradingSystemNameField tradingSystemName = new TradingSystemNameField();

    /**
     * Provides the version of the application system being used to initiate FIX application messages.
     */
    private final TradingSystemVersionField tradingSystemVersion = new TradingSystemVersionField();

    /**
     * Provides the vendor of the application system
     */
    private final TradingSystemVendorField tradingSystemVendor = new TradingSystemVendorField();

    /**
     * Session Identifier defined as type long (uInt64); recommended to use timestamp as number of microseconds since epoch (Jan 1, 1970)
     */
    private final UuidField uuid = new UuidField();

    /**
     * Time of request; recommended to use timestamp as number of nanoseconds since epoch (Jan 1, 1970)
     */
    private final RequestTimestampField requestTimestamp = new RequestTimestampField();

    /**
     * Next expected message sequence number
     */
    private final NextSeqNoField nextSeqNo = new NextSeqNoField();

    /**
     * Session ID
     */
    private final SessionField session = new SessionField();

    /**
     * Firm ID
     */
    private final FirmField firm = new FirmField();

    /**
     * The longest time in milliseconds the customer or CME could remain silent before sending a keep alive message
     */
    private final KeepAliveIntervalField keepAliveInterval = new KeepAliveIntervalField();

    /**
     * Not used and will be set to 0
     */
    private final Credentials credentials = new Credentials();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(hmacSignature), List.<Field>of(accessKeyId), List.<Field>of(tradingSystemName), List.<Field>of(tradingSystemVersion), List.<Field>of(tradingSystemVendor), List.<Field>of(uuid), List.<Field>of(requestTimestamp), List.<Field>of(nextSeqNo), List.<Field>of(session), List.<Field>of(firm), List.<Field>of(keepAliveInterval), credentials.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Hmac Signature
     *
     * @return the HmacSignature field
     */
    public HmacSignatureField hmacSignature() {
        return hmacSignature;
    }

    /**
     * Contains the AccessKeyID assigned to this session on this port.
     *
     * @return the AccessKeyId field
     */
    public AccessKeyIdField accessKeyId() {
        return accessKeyId;
    }

    /**
     * Provides the name of the application system being used to generate FIX application messages.
     *
     * @return the TradingSystemName field
     */
    public TradingSystemNameField tradingSystemName() {
        return tradingSystemName;
    }

    /**
     * Provides the version of the application system being used to initiate FIX application messages.
     *
     * @return the TradingSystemVersion field
     */
    public TradingSystemVersionField tradingSystemVersion() {
        return tradingSystemVersion;
    }

    /**
     * Provides the vendor of the application system
     *
     * @return the TradingSystemVendor field
     */
    public TradingSystemVendorField tradingSystemVendor() {
        return tradingSystemVendor;
    }

    /**
     * Session Identifier defined as type long (uInt64); recommended to use timestamp as number of microseconds since epoch (Jan 1, 1970)
     *
     * @return the Uuid field
     */
    public UuidField uuid() {
        return uuid;
    }

    /**
     * Time of request; recommended to use timestamp as number of nanoseconds since epoch (Jan 1, 1970)
     *
     * @return the RequestTimestamp field
     */
    public RequestTimestampField requestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Next expected message sequence number
     *
     * @return the NextSeqNo field
     */
    public NextSeqNoField nextSeqNo() {
        return nextSeqNo;
    }

    /**
     * Session ID
     *
     * @return the Session field
     */
    public SessionField session() {
        return session;
    }

    /**
     * Firm ID
     *
     * @return the Firm field
     */
    public FirmField firm() {
        return firm;
    }

    /**
     * The longest time in milliseconds the customer or CME could remain silent before sending a keep alive message
     *
     * @return the KeepAliveInterval field
     */
    public KeepAliveIntervalField keepAliveInterval() {
        return keepAliveInterval;
    }

    /**
     * Not used and will be set to 0
     *
     * @return the Credentials record
     */
    public Credentials credentials() {
        return credentials;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + credentials.byteLength() - Credentials.MINIMUM_BYTE_LENGTH;
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
        return Optional.ofNullable(requestTimestamp.value());
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
        if (!hmacSignature.parse(data, cursor)) {
            return false;
        }
        cursor += HmacSignatureField.BYTE_LENGTH;
        if (!accessKeyId.parse(data, cursor)) {
            return false;
        }
        cursor += AccessKeyIdField.BYTE_LENGTH;
        if (!tradingSystemName.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSystemNameField.BYTE_LENGTH;
        if (!tradingSystemVersion.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSystemVersionField.BYTE_LENGTH;
        if (!tradingSystemVendor.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSystemVendorField.BYTE_LENGTH;
        if (!uuid.parse(data, cursor)) {
            return false;
        }
        cursor += UuidField.BYTE_LENGTH;
        if (!requestTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += RequestTimestampField.BYTE_LENGTH;
        if (!nextSeqNo.parse(data, cursor)) {
            return false;
        }
        cursor += NextSeqNoField.BYTE_LENGTH;
        if (!session.parse(data, cursor)) {
            return false;
        }
        cursor += SessionField.BYTE_LENGTH;
        if (!firm.parse(data, cursor)) {
            return false;
        }
        cursor += FirmField.BYTE_LENGTH;
        if (!keepAliveInterval.parse(data, cursor)) {
            return false;
        }
        cursor += KeepAliveIntervalField.BYTE_LENGTH;
        if (!credentials.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += credentials.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = hmacSignature.encode(data, cursor);
        cursor = accessKeyId.encode(data, cursor);
        cursor = tradingSystemName.encode(data, cursor);
        cursor = tradingSystemVersion.encode(data, cursor);
        cursor = tradingSystemVendor.encode(data, cursor);
        cursor = uuid.encode(data, cursor);
        cursor = requestTimestamp.encode(data, cursor);
        cursor = nextSeqNo.encode(data, cursor);
        cursor = session.encode(data, cursor);
        cursor = firm.encode(data, cursor);
        cursor = keepAliveInterval.encode(data, cursor);
        cursor = credentials.encode(data, cursor);
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
        credentials.clear();
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
            if (field != credentials.credentialsLength() && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != credentials.credentialsLength() && !field.isValid()) {
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
            case "HmacSignature" -> Optional.of(hmacSignature);
            case "AccessKeyId" -> Optional.of(accessKeyId);
            case "TradingSystemName" -> Optional.of(tradingSystemName);
            case "TradingSystemVersion" -> Optional.of(tradingSystemVersion);
            case "TradingSystemVendor" -> Optional.of(tradingSystemVendor);
            case "Uuid" -> Optional.of(uuid);
            case "RequestTimestamp" -> Optional.of(requestTimestamp);
            case "NextSeqNo" -> Optional.of(nextSeqNo);
            case "Session" -> Optional.of(session);
            case "Firm" -> Optional.of(firm);
            case "KeepAliveInterval" -> Optional.of(keepAliveInterval);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof Establish message)) {
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
        if (!(other instanceof Establish message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
