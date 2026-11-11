package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MatchEventIndicatorField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityGroupField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityTradingEventField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TradSesOpenTimeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TradeDateField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TradingSessionIdField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TradingSessionSubIdField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TransactTimeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Field;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.PrintOptions;

/**
 * Represents the SecurityGroupPhase10Message message from the BinaryUmdf protocol.
 *
 * <p>SecurityGroupPhase_10Message</p>
 */
public final class SecurityGroupPhase10Message implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 32;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Group Phase 10 Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 3, 5, 14, 2 };

    /**
     * securityGroup
     */
    private final SecurityGroupField securityGroup = new SecurityGroupField();

    /**
     * MatchEventIndicator bit set
     */
    private final MatchEventIndicatorField matchEventIndicator = new MatchEventIndicatorField();

    /**
     * tradingSessionID
     */
    private final TradingSessionIdField tradingSessionId = new TradingSessionIdField();

    /**
     * tradingSessionSubID
     */
    private final TradingSessionSubIdField tradingSessionSubId = new TradingSessionSubIdField();

    /**
     * securityTradingEvent
     */
    private final SecurityTradingEventField securityTradingEvent = new SecurityTradingEventField();

    /**
     * tradeDate
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * tradSesOpenTime
     */
    private final TradSesOpenTimeField tradSesOpenTime = new TradSesOpenTimeField();

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityGroup, matchEventIndicator, tradingSessionId, tradingSessionSubId, securityTradingEvent, tradeDate, tradSesOpenTime, transactTime);

    private byte[] buffer;

    private boolean decoded;

    /**
     * securityGroup
     *
     * @return the SecurityGroup field
     */
    public SecurityGroupField securityGroup() {
        return securityGroup;
    }

    /**
     * MatchEventIndicator bit set
     *
     * @return the MatchEventIndicator field
     */
    public MatchEventIndicatorField matchEventIndicator() {
        return matchEventIndicator;
    }

    /**
     * tradingSessionID
     *
     * @return the TradingSessionId field
     */
    public TradingSessionIdField tradingSessionId() {
        return tradingSessionId;
    }

    /**
     * tradingSessionSubID
     *
     * @return the TradingSessionSubId field
     */
    public TradingSessionSubIdField tradingSessionSubId() {
        return tradingSessionSubId;
    }

    /**
     * securityTradingEvent
     *
     * @return the SecurityTradingEvent field
     */
    public SecurityTradingEventField securityTradingEvent() {
        return securityTradingEvent;
    }

    /**
     * tradeDate
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * tradSesOpenTime
     *
     * @return the TradSesOpenTime field
     */
    public TradSesOpenTimeField tradSesOpenTime() {
        return tradSesOpenTime;
    }

    /**
     * transactTime
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
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
        return Optional.ofNullable(tradSesOpenTime.value());
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
        if (!securityGroup.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityGroupField.BYTE_LENGTH;
        cursor += 5; // padding
        if (!matchEventIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MatchEventIndicatorField.BYTE_LENGTH;
        if (!tradingSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionIdField.BYTE_LENGTH;
        if (!tradingSessionSubId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionSubIdField.BYTE_LENGTH;
        if (!securityTradingEvent.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingEventField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!tradSesOpenTime.parse(data, cursor)) {
            return false;
        }
        cursor += TradSesOpenTimeField.BYTE_LENGTH;
        return transactTime.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityGroup.encode(data, cursor);
        if (buffer != null && buffer.length >= 8) {
            System.arraycopy(buffer, 3, data, cursor, 5); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 5, (byte) 0); // padding
        }
        cursor += 5;
        cursor = matchEventIndicator.encode(data, cursor);
        cursor = tradingSessionId.encode(data, cursor);
        cursor = tradingSessionSubId.encode(data, cursor);
        cursor = securityTradingEvent.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        if (buffer != null && buffer.length >= 16) {
            System.arraycopy(buffer, 14, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = tradSesOpenTime.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
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
            case "SecurityGroup" -> Optional.of(securityGroup);
            case "MatchEventIndicator" -> Optional.of(matchEventIndicator);
            case "TradingSessionId" -> Optional.of(tradingSessionId);
            case "TradingSessionSubId" -> Optional.of(tradingSessionSubId);
            case "SecurityTradingEvent" -> Optional.of(securityTradingEvent);
            case "TradeDate" -> Optional.of(tradeDate);
            case "TradSesOpenTime" -> Optional.of(tradSesOpenTime);
            case "TransactTime" -> Optional.of(transactTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityGroupPhase10Message message)) {
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
        if (!(other instanceof SecurityGroupPhase10Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
