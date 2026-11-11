package omi.cme.globex.mdp3.sbe.v1_9.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.mdp3.sbe.v1_9.fields.MdReqIdField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.SubscriptionReqTypeField;
import omi.cme.globex.mdp3.sbe.v1_9.structs.SecurityStatusRequestRelatedSymbolGroups;
import omi.cme.globex.mdp3.sbe.v1_9.structs.SecurityStatusRequestSecurityGroups;
import omi.cme.globex.mdp3.sbe.v1_9.types.Field;
import omi.cme.globex.mdp3.sbe.v1_9.types.Message;
import omi.cme.globex.mdp3.sbe.v1_9.types.PrintOptions;

/**
 * Represents the SecurityStatusRequest message from the Mdp3 protocol.
 *
 * <p>SecurityStatusRequest</p>
 */
public final class SecurityStatusRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 11;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Status Request";

    /**
     * Unique identifier for Market Data Request. Must be unique per session so it can be referenced in Request Ack or Request Reject responses from the exchange
     */
    private final MdReqIdField mdReqId = new MdReqIdField();

    /**
     * Subscription Request Type indicates to the type of response expected
     */
    private final SubscriptionReqTypeField subscriptionReqType = new SubscriptionReqTypeField();

    /**
     * NoSecurityGroups Block
     */
    private final SecurityStatusRequestSecurityGroups securityStatusRequestSecurityGroups = new SecurityStatusRequestSecurityGroups();

    /**
     * NoRelatedSym Block
     */
    private final SecurityStatusRequestRelatedSymbolGroups securityStatusRequestRelatedSymbolGroups = new SecurityStatusRequestRelatedSymbolGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(mdReqId, subscriptionReqType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique identifier for Market Data Request. Must be unique per session so it can be referenced in Request Ack or Request Reject responses from the exchange
     *
     * @return the MdReqId field
     */
    public MdReqIdField mdReqId() {
        return mdReqId;
    }

    /**
     * Subscription Request Type indicates to the type of response expected
     *
     * @return the SubscriptionReqType field
     */
    public SubscriptionReqTypeField subscriptionReqType() {
        return subscriptionReqType;
    }

    /**
     * NoSecurityGroups Block
     *
     * @return the SecurityStatusRequestSecurityGroups record
     */
    public SecurityStatusRequestSecurityGroups securityStatusRequestSecurityGroups() {
        return securityStatusRequestSecurityGroups;
    }

    /**
     * NoRelatedSym Block
     *
     * @return the SecurityStatusRequestRelatedSymbolGroups record
     */
    public SecurityStatusRequestRelatedSymbolGroups securityStatusRequestRelatedSymbolGroups() {
        return securityStatusRequestRelatedSymbolGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + securityStatusRequestSecurityGroups.byteLength() - SecurityStatusRequestSecurityGroups.MINIMUM_BYTE_LENGTH + securityStatusRequestRelatedSymbolGroups.byteLength() - SecurityStatusRequestRelatedSymbolGroups.MINIMUM_BYTE_LENGTH;
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
        return Optional.empty();
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
        if (!mdReqId.parse(data, cursor)) {
            return false;
        }
        cursor += MdReqIdField.BYTE_LENGTH;
        if (!subscriptionReqType.parse(data, cursor)) {
            return false;
        }
        cursor += SubscriptionReqTypeField.BYTE_LENGTH;
        if (!securityStatusRequestSecurityGroups.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += securityStatusRequestSecurityGroups.byteLength();
        if (end - cursor < 3) {
            return false;
        }
        if (!securityStatusRequestRelatedSymbolGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += securityStatusRequestRelatedSymbolGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = mdReqId.encode(data, cursor);
        cursor = subscriptionReqType.encode(data, cursor);
        cursor = securityStatusRequestSecurityGroups.encode(data, cursor);
        cursor = securityStatusRequestRelatedSymbolGroups.encode(data, cursor);
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
        securityStatusRequestSecurityGroups.clear();
        securityStatusRequestRelatedSymbolGroups.clear();
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        if (!securityStatusRequestSecurityGroups.isRecognized()) {
            return false;
        }
        return securityStatusRequestRelatedSymbolGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!securityStatusRequestSecurityGroups.isValid()) {
            return false;
        }
        if (!securityStatusRequestRelatedSymbolGroups.isValid()) {
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
        if (!mdReqId.isDecoded()) {
            return Optional.of(mdReqId);
        }
        if (!subscriptionReqType.isDecoded()) {
            return Optional.of(subscriptionReqType);
        }
        if (!securityStatusRequestSecurityGroups.isDecoded()) {
            return securityStatusRequestSecurityGroups.failedAt();
        }
        if (!securityStatusRequestRelatedSymbolGroups.isDecoded()) {
            return securityStatusRequestRelatedSymbolGroups.failedAt();
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
            case "MdReqId" -> Optional.of(mdReqId);
            case "SubscriptionReqType" -> Optional.of(subscriptionReqType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityStatusRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(securityStatusRequestSecurityGroups.diffFields(message.securityStatusRequestSecurityGroups));
        changed.addAll(securityStatusRequestRelatedSymbolGroups.diffFields(message.securityStatusRequestRelatedSymbolGroups));
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
            securityStatusRequestSecurityGroups.toFormattedString(builder, options);
            builder.append(", ");
            securityStatusRequestRelatedSymbolGroups.toFormattedString(builder, options);
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
        securityStatusRequestSecurityGroups.toFormattedString(builder, nested);
        securityStatusRequestRelatedSymbolGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof SecurityStatusRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && securityStatusRequestSecurityGroups.equals(message.securityStatusRequestSecurityGroups) && securityStatusRequestRelatedSymbolGroups.equals(message.securityStatusRequestRelatedSymbolGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, securityStatusRequestSecurityGroups, securityStatusRequestRelatedSymbolGroups);
    }
}
