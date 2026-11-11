package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.BoldDesignationField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.CancelOnDisconnectField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.OrderPriorityUpdateAckSubscriptionField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.SelfTradePreventionField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.ThrottlePreferenceField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.UsernameField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Message;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.PrintOptions;

/**
 * Represents the SessionConfigurationRequestMessage message from the BinaryGateway protocol.
 *
 * <p>This message may be sent by the firm to change their configuration settings for a given gateway session, as defined by its Username). If accepted by the gateway, the updated settings will be applied on a go forward basis only.</p>
 */
public final class SessionConfigurationRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 70;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Session Configuration Request Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 21, 49 };

    /**
     * Unique identifier of the gateway session – SenderCompID.
     */
    private final UsernameField username = new UsernameField();

    /**
     * CancelOnDisconnect enum
     */
    private final CancelOnDisconnectField cancelOnDisconnect = new CancelOnDisconnectField();

    /**
     * ThrottlePreference enum
     */
    private final ThrottlePreferenceField throttlePreference = new ThrottlePreferenceField();

    /**
     * SelfTradePrevention enum
     */
    private final SelfTradePreventionField selfTradePrevention = new SelfTradePreventionField();

    /**
     * OrderPriorityUpdateAckSubscription enum
     */
    private final OrderPriorityUpdateAckSubscriptionField orderPriorityUpdateAckSubscription = new OrderPriorityUpdateAckSubscriptionField();

    /**
     * NYSE American Options - Session level default for the BOLD setting on all Order and Cancel/Replace requests entered on the session. For all other markets - this field will be treated as filler. Any value specified will not be processed
     */
    private final BoldDesignationField boldDesignation = new BoldDesignationField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(username, cancelOnDisconnect, throttlePreference, selfTradePrevention, orderPriorityUpdateAckSubscription, boldDesignation);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique identifier of the gateway session – SenderCompID.
     *
     * @return the Username field
     */
    public UsernameField username() {
        return username;
    }

    /**
     * CancelOnDisconnect enum
     *
     * @return the CancelOnDisconnect field
     */
    public CancelOnDisconnectField cancelOnDisconnect() {
        return cancelOnDisconnect;
    }

    /**
     * ThrottlePreference enum
     *
     * @return the ThrottlePreference field
     */
    public ThrottlePreferenceField throttlePreference() {
        return throttlePreference;
    }

    /**
     * SelfTradePrevention enum
     *
     * @return the SelfTradePrevention field
     */
    public SelfTradePreventionField selfTradePrevention() {
        return selfTradePrevention;
    }

    /**
     * OrderPriorityUpdateAckSubscription enum
     *
     * @return the OrderPriorityUpdateAckSubscription field
     */
    public OrderPriorityUpdateAckSubscriptionField orderPriorityUpdateAckSubscription() {
        return orderPriorityUpdateAckSubscription;
    }

    /**
     * NYSE American Options - Session level default for the BOLD setting on all Order and Cancel/Replace requests entered on the session. For all other markets - this field will be treated as filler. Any value specified will not be processed
     *
     * @return the BoldDesignation field
     */
    public BoldDesignationField boldDesignation() {
        return boldDesignation;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!username.parse(data, cursor)) {
            return false;
        }
        cursor += UsernameField.BYTE_LENGTH;
        if (!cancelOnDisconnect.parse(data, cursor)) {
            return false;
        }
        cursor += CancelOnDisconnectField.BYTE_LENGTH;
        if (!throttlePreference.parse(data, cursor)) {
            return false;
        }
        cursor += ThrottlePreferenceField.BYTE_LENGTH;
        if (!selfTradePrevention.parse(data, cursor)) {
            return false;
        }
        cursor += SelfTradePreventionField.BYTE_LENGTH;
        if (!orderPriorityUpdateAckSubscription.parse(data, cursor)) {
            return false;
        }
        cursor += OrderPriorityUpdateAckSubscriptionField.BYTE_LENGTH;
        if (!boldDesignation.parse(data, cursor)) {
            return false;
        }
        cursor += BoldDesignationField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = username.encode(data, cursor);
        cursor = cancelOnDisconnect.encode(data, cursor);
        cursor = throttlePreference.encode(data, cursor);
        cursor = selfTradePrevention.encode(data, cursor);
        cursor = orderPriorityUpdateAckSubscription.encode(data, cursor);
        cursor = boldDesignation.encode(data, cursor);
        if (buffer != null && buffer.length >= 70) {
            System.arraycopy(buffer, 21, data, cursor, 49); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 49, (byte) 0); // padding
        }
        cursor += 49;
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
            case "Username" -> Optional.of(username);
            case "CancelOnDisconnect" -> Optional.of(cancelOnDisconnect);
            case "ThrottlePreference" -> Optional.of(throttlePreference);
            case "SelfTradePrevention" -> Optional.of(selfTradePrevention);
            case "OrderPriorityUpdateAckSubscription" -> Optional.of(orderPriorityUpdateAckSubscription);
            case "BoldDesignation" -> Optional.of(boldDesignation);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SessionConfigurationRequestMessage message)) {
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
        if (!(other instanceof SessionConfigurationRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
