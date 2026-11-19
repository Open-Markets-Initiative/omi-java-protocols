package omi.lseg.millennium.level2recovery.mitch.v11_9.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.millennium.level2recovery.mitch.v11_9.fields.BookTypeField;
import omi.lseg.millennium.level2recovery.mitch.v11_9.fields.InstrumentIdField;
import omi.lseg.millennium.level2recovery.mitch.v11_9.fields.NanosecondField;
import omi.lseg.millennium.level2recovery.mitch.v11_9.fields.NewEndTimeField;
import omi.lseg.millennium.level2recovery.mitch.v11_9.fields.ReasonField;
import omi.lseg.millennium.level2recovery.mitch.v11_9.fields.SessionChangeReasonField;
import omi.lseg.millennium.level2recovery.mitch.v11_9.fields.SymbolStatusFlagsField;
import omi.lseg.millennium.level2recovery.mitch.v11_9.fields.TradingStatusField;
import omi.lseg.millennium.level2recovery.mitch.v11_9.types.Field;
import omi.lseg.millennium.level2recovery.mitch.v11_9.types.Message;
import omi.lseg.millennium.level2recovery.mitch.v11_9.types.PrintOptions;

/**
 * Represents the SymbolStatusMessage message from the Level2Recovery protocol.
 *
 * <p>Indicates the trading session (pre-opening, regular trading, etc.) that currently applies to an instrument.</p>
 */
public final class SymbolStatusMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Symbol Status Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 1, 9, 1 };

    /**
     * Nanoseconds since last Time message, accurate to the nearest microsecond.
     */
    private final NanosecondField nanosecond = new NanosecondField();

    /**
     * Instrument the request relates to. The field should contain only zeros if it does not relate to an instrument.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Trading Status
     */
    private final TradingStatusField tradingStatus = new TradingStatusField();

    /**
     * Symbol Status Flags
     */
    private final SymbolStatusFlagsField symbolStatusFlags = new SymbolStatusFlagsField();

    /**
     * Reason for the manual session change or the trading halt.
     */
    private final ReasonField reason = new ReasonField();

    /**
     * Session Change Reason
     */
    private final SessionChangeReasonField sessionChangeReason = new SessionChangeReasonField();

    /**
     * New time the session will end. Will only be stamped if the session change was not in the original schedule e.g. AESP auction call or unscheduled session.
     */
    private final NewEndTimeField newEndTime = new NewEndTimeField();

    /**
     * Book Type
     */
    private final BookTypeField bookType = new BookTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanosecond, instrumentId, tradingStatus, symbolStatusFlags, reason, sessionChangeReason, newEndTime, bookType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since last Time message, accurate to the nearest microsecond.
     *
     * @return the Nanosecond field
     */
    public NanosecondField nanosecond() {
        return nanosecond;
    }

    /**
     * Instrument the request relates to. The field should contain only zeros if it does not relate to an instrument.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Trading Status
     *
     * @return the TradingStatus field
     */
    public TradingStatusField tradingStatus() {
        return tradingStatus;
    }

    /**
     * Symbol Status Flags
     *
     * @return the SymbolStatusFlags field
     */
    public SymbolStatusFlagsField symbolStatusFlags() {
        return symbolStatusFlags;
    }

    /**
     * Reason for the manual session change or the trading halt.
     *
     * @return the Reason field
     */
    public ReasonField reason() {
        return reason;
    }

    /**
     * Session Change Reason
     *
     * @return the SessionChangeReason field
     */
    public SessionChangeReasonField sessionChangeReason() {
        return sessionChangeReason;
    }

    /**
     * New time the session will end. Will only be stamped if the session change was not in the original schedule e.g. AESP auction call or unscheduled session.
     *
     * @return the NewEndTime field
     */
    public NewEndTimeField newEndTime() {
        return newEndTime;
    }

    /**
     * Book Type
     *
     * @return the BookType field
     */
    public BookTypeField bookType() {
        return bookType;
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
        if (!nanosecond.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!tradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStatusField.BYTE_LENGTH;
        if (!symbolStatusFlags.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolStatusFlagsField.BYTE_LENGTH;
        if (!reason.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonField.BYTE_LENGTH;
        if (!sessionChangeReason.parse(data, cursor)) {
            return false;
        }
        cursor += SessionChangeReasonField.BYTE_LENGTH;
        if (!newEndTime.parse(data, cursor)) {
            return false;
        }
        cursor += NewEndTimeField.BYTE_LENGTH;
        return bookType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanosecond.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = tradingStatus.encode(data, cursor);
        cursor = symbolStatusFlags.encode(data, cursor);
        cursor = reason.encode(data, cursor);
        cursor = sessionChangeReason.encode(data, cursor);
        cursor = newEndTime.encode(data, cursor);
        cursor = bookType.encode(data, cursor);
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
            case "Nanosecond" -> Optional.of(nanosecond);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "SymbolStatusFlags" -> Optional.of(symbolStatusFlags);
            case "Reason" -> Optional.of(reason);
            case "SessionChangeReason" -> Optional.of(sessionChangeReason);
            case "NewEndTime" -> Optional.of(newEndTime);
            case "BookType" -> Optional.of(bookType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SymbolStatusMessage message)) {
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
        if (!(other instanceof SymbolStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
