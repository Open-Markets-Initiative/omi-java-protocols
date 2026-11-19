package omi.ice.icefutures.mdf.impact.v1_1_51.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_51.fields.IplTplDownField;
import omi.ice.icefutures.mdf.impact.v1_1_51.fields.IplTplHoldDurationField;
import omi.ice.icefutures.mdf.impact.v1_1_51.fields.IplTplHoldTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_51.fields.IplTplTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_51.fields.IplTplUpField;
import omi.ice.icefutures.mdf.impact.v1_1_51.fields.IsUpField;
import omi.ice.icefutures.mdf.impact.v1_1_51.fields.MarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_51.fields.NotificationDateTimeField;
import omi.ice.icefutures.mdf.impact.v1_1_51.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_51.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_51.types.PrintOptions;

/**
 * Represents the IntervalPriceLimitNotificationMessage message from the Mdf protocol.
 *
 * <p>Interval Price Limit (IPL) might be enabled for certain markets. IPL check is to prevent sudden movements (in both directions) in the market during a short period of time.</p>
 */
public final class IntervalPriceLimitNotificationMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'V';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 35;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Interval Price Limit Notification Message";

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * IPL/TPLHoldType
     */
    private final IplTplHoldTypeField iplTplHoldType = new IplTplHoldTypeField();

    /**
     * Date time of the IPL Hold notification
     */
    private final NotificationDateTimeField notificationDateTime = new NotificationDateTimeField();

    /**
     * Upper/Lower bound violation
     */
    private final IsUpField isUp = new IsUpField();

    /**
     * Hold duration, in milliseconds
     */
    private final IplTplHoldDurationField iplTplHoldDuration = new IplTplHoldDurationField();

    /**
     * IPL upper bound
     */
    private final IplTplUpField iplTplUp = new IplTplUpField();

    /**
     * IPL lower bound
     */
    private final IplTplDownField iplTplDown = new IplTplDownField();

    /**
     * IPL TPL Type
     */
    private final IplTplTypeField iplTplType = new IplTplTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketId, iplTplHoldType, notificationDateTime, isUp, iplTplHoldDuration, iplTplUp, iplTplDown, iplTplType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Market Id
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * IPL/TPLHoldType
     *
     * @return the IplTplHoldType field
     */
    public IplTplHoldTypeField iplTplHoldType() {
        return iplTplHoldType;
    }

    /**
     * Date time of the IPL Hold notification
     *
     * @return the NotificationDateTime field
     */
    public NotificationDateTimeField notificationDateTime() {
        return notificationDateTime;
    }

    /**
     * Upper/Lower bound violation
     *
     * @return the IsUp field
     */
    public IsUpField isUp() {
        return isUp;
    }

    /**
     * Hold duration, in milliseconds
     *
     * @return the IplTplHoldDuration field
     */
    public IplTplHoldDurationField iplTplHoldDuration() {
        return iplTplHoldDuration;
    }

    /**
     * IPL upper bound
     *
     * @return the IplTplUp field
     */
    public IplTplUpField iplTplUp() {
        return iplTplUp;
    }

    /**
     * IPL lower bound
     *
     * @return the IplTplDown field
     */
    public IplTplDownField iplTplDown() {
        return iplTplDown;
    }

    /**
     * IPL TPL Type
     *
     * @return the IplTplType field
     */
    public IplTplTypeField iplTplType() {
        return iplTplType;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!iplTplHoldType.parse(data, cursor)) {
            return false;
        }
        cursor += IplTplHoldTypeField.BYTE_LENGTH;
        if (!notificationDateTime.parse(data, cursor)) {
            return false;
        }
        cursor += NotificationDateTimeField.BYTE_LENGTH;
        if (!isUp.parse(data, cursor)) {
            return false;
        }
        cursor += IsUpField.BYTE_LENGTH;
        if (!iplTplHoldDuration.parse(data, cursor)) {
            return false;
        }
        cursor += IplTplHoldDurationField.BYTE_LENGTH;
        if (!iplTplUp.parse(data, cursor)) {
            return false;
        }
        cursor += IplTplUpField.BYTE_LENGTH;
        if (!iplTplDown.parse(data, cursor)) {
            return false;
        }
        cursor += IplTplDownField.BYTE_LENGTH;
        return iplTplType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketId.encode(data, cursor);
        cursor = iplTplHoldType.encode(data, cursor);
        cursor = notificationDateTime.encode(data, cursor);
        cursor = isUp.encode(data, cursor);
        cursor = iplTplHoldDuration.encode(data, cursor);
        cursor = iplTplUp.encode(data, cursor);
        cursor = iplTplDown.encode(data, cursor);
        cursor = iplTplType.encode(data, cursor);
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
            case "MarketId" -> Optional.of(marketId);
            case "IplTplHoldType" -> Optional.of(iplTplHoldType);
            case "NotificationDateTime" -> Optional.of(notificationDateTime);
            case "IsUp" -> Optional.of(isUp);
            case "IplTplHoldDuration" -> Optional.of(iplTplHoldDuration);
            case "IplTplUp" -> Optional.of(iplTplUp);
            case "IplTplDown" -> Optional.of(iplTplDown);
            case "IplTplType" -> Optional.of(iplTplType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IntervalPriceLimitNotificationMessage message)) {
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
        if (!(other instanceof IntervalPriceLimitNotificationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
