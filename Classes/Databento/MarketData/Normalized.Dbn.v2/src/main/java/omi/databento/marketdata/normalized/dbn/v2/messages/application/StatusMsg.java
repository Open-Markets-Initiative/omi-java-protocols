package omi.databento.marketdata.normalized.dbn.v2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.databento.marketdata.normalized.dbn.v2.fields.IsQuotingField;
import omi.databento.marketdata.normalized.dbn.v2.fields.IsShortSellRestrictedField;
import omi.databento.marketdata.normalized.dbn.v2.fields.IsTradingField;
import omi.databento.marketdata.normalized.dbn.v2.fields.StatusActionField;
import omi.databento.marketdata.normalized.dbn.v2.fields.StatusReasonField;
import omi.databento.marketdata.normalized.dbn.v2.fields.TradingEventField;
import omi.databento.marketdata.normalized.dbn.v2.fields.TsRecvField;
import omi.databento.marketdata.normalized.dbn.v2.types.Field;
import omi.databento.marketdata.normalized.dbn.v2.types.Message;
import omi.databento.marketdata.normalized.dbn.v2.types.PrintOptions;

/**
 * Represents the StatusMsg message from the Normalized protocol.
 *
 * <p>A trading status update message; the record of the status schema</p>
 */
public final class StatusMsg implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0012';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 24;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Status Msg";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 17, 7 };

    /**
     * The capture-server-received timestamp expressed as the number of nanoseconds since the UNIX epoch
     */
    private final TsRecvField tsRecv = new TsRecvField();

    /**
     * The type of status change
     */
    private final StatusActionField statusAction = new StatusActionField();

    /**
     * Additional details about the cause of the status change
     */
    private final StatusReasonField statusReason = new StatusReasonField();

    /**
     * Further information about a status update
     */
    private final TradingEventField tradingEvent = new TradingEventField();

    /**
     * The state of trading in the instrument
     */
    private final IsTradingField isTrading = new IsTradingField();

    /**
     * The state of quoting in the instrument
     */
    private final IsQuotingField isQuoting = new IsQuotingField();

    /**
     * The state of short sell restrictions for the instrument
     */
    private final IsShortSellRestrictedField isShortSellRestricted = new IsShortSellRestrictedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tsRecv, statusAction, statusReason, tradingEvent, isTrading, isQuoting, isShortSellRestricted);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The capture-server-received timestamp expressed as the number of nanoseconds since the UNIX epoch
     *
     * @return the TsRecv field
     */
    public TsRecvField tsRecv() {
        return tsRecv;
    }

    /**
     * The type of status change
     *
     * @return the StatusAction field
     */
    public StatusActionField statusAction() {
        return statusAction;
    }

    /**
     * Additional details about the cause of the status change
     *
     * @return the StatusReason field
     */
    public StatusReasonField statusReason() {
        return statusReason;
    }

    /**
     * Further information about a status update
     *
     * @return the TradingEvent field
     */
    public TradingEventField tradingEvent() {
        return tradingEvent;
    }

    /**
     * The state of trading in the instrument
     *
     * @return the IsTrading field
     */
    public IsTradingField isTrading() {
        return isTrading;
    }

    /**
     * The state of quoting in the instrument
     *
     * @return the IsQuoting field
     */
    public IsQuotingField isQuoting() {
        return isQuoting;
    }

    /**
     * The state of short sell restrictions for the instrument
     *
     * @return the IsShortSellRestricted field
     */
    public IsShortSellRestrictedField isShortSellRestricted() {
        return isShortSellRestricted;
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
        return PADDING.clone();
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(tsRecv.value());
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
        if (!tsRecv.parse(data, cursor)) {
            return false;
        }
        cursor += TsRecvField.BYTE_LENGTH;
        if (!statusAction.parse(data, cursor)) {
            return false;
        }
        cursor += StatusActionField.BYTE_LENGTH;
        if (!statusReason.parse(data, cursor)) {
            return false;
        }
        cursor += StatusReasonField.BYTE_LENGTH;
        if (!tradingEvent.parse(data, cursor)) {
            return false;
        }
        cursor += TradingEventField.BYTE_LENGTH;
        if (!isTrading.parse(data, cursor)) {
            return false;
        }
        cursor += IsTradingField.BYTE_LENGTH;
        if (!isQuoting.parse(data, cursor)) {
            return false;
        }
        cursor += IsQuotingField.BYTE_LENGTH;
        if (!isShortSellRestricted.parse(data, cursor)) {
            return false;
        }
        cursor += IsShortSellRestrictedField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tsRecv.encode(data, cursor);
        cursor = statusAction.encode(data, cursor);
        cursor = statusReason.encode(data, cursor);
        cursor = tradingEvent.encode(data, cursor);
        cursor = isTrading.encode(data, cursor);
        cursor = isQuoting.encode(data, cursor);
        cursor = isShortSellRestricted.encode(data, cursor);
        if (buffer != null && buffer.length >= 24) {
            System.arraycopy(buffer, 17, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
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
            case "TsRecv" -> Optional.of(tsRecv);
            case "StatusAction" -> Optional.of(statusAction);
            case "StatusReason" -> Optional.of(statusReason);
            case "TradingEvent" -> Optional.of(tradingEvent);
            case "IsTrading" -> Optional.of(isTrading);
            case "IsQuoting" -> Optional.of(isQuoting);
            case "IsShortSellRestricted" -> Optional.of(isShortSellRestricted);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StatusMsg message)) {
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
        if (!(other instanceof StatusMsg message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
