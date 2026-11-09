package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.cme.globex.ilink3.sbe.v8_5.fields.FaultToleranceIndicatorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PreviousSeqNoField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PreviousUuidField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.RequestTimestampField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecretKeySecureIdExpirationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SplitMsgField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.UuidField;
import omi.cme.globex.ilink3.sbe.v8_5.structs.Credentials;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the NegotiationResponse message from the iLink3 protocol.
 *
 * <p>The Negotiation Response message is sent when a Negotiate message from the customer is accepted by CME.</p>
 */
public final class NegotiationResponse implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Negotiation Response";

    /**
     * Session Identifier defined as type long (uInt64); recommended to use timestamp as number of microseconds since epoch (Jan 1, 1970)
     */
    private final UuidField uuid = new UuidField();

    /**
     * Time of request; recommended to use timestamp as number of nanoseconds since epoch (Jan 1, 1970)
     */
    private final RequestTimestampField requestTimestamp = new RequestTimestampField();

    /**
     * This indicates in how many days the HMAC secret key will expire
     */
    private final SecretKeySecureIdExpirationField secretKeySecureIdExpiration = new SecretKeySecureIdExpirationField();

    /**
     * Indicates whether the connection is primary or backup
     */
    private final FaultToleranceIndicatorField faultToleranceIndicator = new FaultToleranceIndicatorField();

    /**
     * Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order
     */
    private final SplitMsgField splitMsg = new SplitMsgField();

    /**
     * Refers to the SeqNum sent in the previous message before this one from CME
     */
    private final PreviousSeqNoField previousSeqNo = new PreviousSeqNoField();

    /**
     * Refers to the UUID sent in the previous message before this one from CME
     */
    private final PreviousUuidField previousUuid = new PreviousUuidField();

    /**
     * Not used and will be set to 0
     */
    private final Credentials credentials = new Credentials();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(uuid), List.<Field>of(requestTimestamp), List.<Field>of(secretKeySecureIdExpiration), List.<Field>of(faultToleranceIndicator), List.<Field>of(splitMsg), List.<Field>of(previousSeqNo), List.<Field>of(previousUuid), credentials.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

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
     * This indicates in how many days the HMAC secret key will expire
     *
     * @return the SecretKeySecureIdExpiration field
     */
    public SecretKeySecureIdExpirationField secretKeySecureIdExpiration() {
        return secretKeySecureIdExpiration;
    }

    /**
     * Indicates whether the connection is primary or backup
     *
     * @return the FaultToleranceIndicator field
     */
    public FaultToleranceIndicatorField faultToleranceIndicator() {
        return faultToleranceIndicator;
    }

    /**
     * Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order
     *
     * @return the SplitMsg field
     */
    public SplitMsgField splitMsg() {
        return splitMsg;
    }

    /**
     * Refers to the SeqNum sent in the previous message before this one from CME
     *
     * @return the PreviousSeqNo field
     */
    public PreviousSeqNoField previousSeqNo() {
        return previousSeqNo;
    }

    /**
     * Refers to the UUID sent in the previous message before this one from CME
     *
     * @return the PreviousUuid field
     */
    public PreviousUuidField previousUuid() {
        return previousUuid;
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
        cursor += 8;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        cursor += 8;
        cursor = credentials.padding(runs, cursor);
        return cursor;
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
        if (!uuid.parse(data, cursor)) {
            return false;
        }
        cursor += UuidField.BYTE_LENGTH;
        if (!requestTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += RequestTimestampField.BYTE_LENGTH;
        if (!secretKeySecureIdExpiration.parse(data, cursor)) {
            return false;
        }
        cursor += SecretKeySecureIdExpirationField.BYTE_LENGTH;
        if (!faultToleranceIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FaultToleranceIndicatorField.BYTE_LENGTH;
        if (!splitMsg.parse(data, cursor)) {
            return false;
        }
        cursor += SplitMsgField.BYTE_LENGTH;
        if (!previousSeqNo.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousSeqNoField.BYTE_LENGTH;
        if (!previousUuid.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousUuidField.BYTE_LENGTH;
        if (!credentials.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += credentials.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = uuid.encode(data, cursor);
        cursor = requestTimestamp.encode(data, cursor);
        cursor = secretKeySecureIdExpiration.encode(data, cursor);
        cursor = faultToleranceIndicator.encode(data, cursor);
        cursor = splitMsg.encode(data, cursor);
        cursor = previousSeqNo.encode(data, cursor);
        cursor = previousUuid.encode(data, cursor);
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
            case "Uuid" -> Optional.of(uuid);
            case "RequestTimestamp" -> Optional.of(requestTimestamp);
            case "SecretKeySecureIdExpiration" -> Optional.of(secretKeySecureIdExpiration);
            case "FaultToleranceIndicator" -> Optional.of(faultToleranceIndicator);
            case "SplitMsg" -> Optional.of(splitMsg);
            case "PreviousSeqNo" -> Optional.of(previousSeqNo);
            case "PreviousUuid" -> Optional.of(previousUuid);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NegotiationResponse message)) {
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
        if (!(other instanceof NegotiationResponse message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
