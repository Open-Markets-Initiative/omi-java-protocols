package omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.HaltReasonField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.NanosecondField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.NewEndTimeField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.SessionChangeReasonField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.SubBookField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.SymbolField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.SymbolStatusFlagsField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.TradingStatusField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.types.Field;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.types.Message;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.types.PrintOptions;

/**
 * Represents the SymbolStatusMessage message from the Replay protocol.
 *
 * <p>Indicates the trading session (e.g. pre-opening, regular trading, etc.) that currently applies to an instrument.</p>
 */
public final class SymbolStatusMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 32;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Symbol Status Message";

    /**
     * Nanoseconds offset from the last Time message.
     */
    private final NanosecondField nanosecond = new NanosecondField();

    /**
     * Instrument's symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Trading session that applies to the instrument.
     */
    private final TradingStatusField tradingStatus = new TradingStatusField();

    /**
     * Flags of the Symbol Status message, which the document labels Flags and reserves for future use.
     */
    private final SymbolStatusFlagsField symbolStatusFlags = new SymbolStatusFlagsField();

    /**
     * Reason for the trading halt. This field will contain only spaces if Trading Status is not "H".
     */
    private final HaltReasonField haltReason = new HaltReasonField();

    /**
     * Reason for the session change.
     */
    private final SessionChangeReasonField sessionChangeReason = new SessionChangeReasonField();

    /**
     * New session end time specified in terms of local time for server (i.e. not UTC). The field will contain only spaces if Session Change Reason is "0" or "9".
     */
    private final NewEndTimeField newEndTime = new NewEndTimeField();

    /**
     * Order book the status relates to.
     */
    private final SubBookField subBook = new SubBookField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanosecond, symbol, tradingStatus, symbolStatusFlags, haltReason, sessionChangeReason, newEndTime, subBook);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds offset from the last Time message.
     *
     * @return the Nanosecond field
     */
    public NanosecondField nanosecond() {
        return nanosecond;
    }

    /**
     * Instrument's symbol.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Trading session that applies to the instrument.
     *
     * @return the TradingStatus field
     */
    public TradingStatusField tradingStatus() {
        return tradingStatus;
    }

    /**
     * Flags of the Symbol Status message, which the document labels Flags and reserves for future use.
     *
     * @return the SymbolStatusFlags field
     */
    public SymbolStatusFlagsField symbolStatusFlags() {
        return symbolStatusFlags;
    }

    /**
     * Reason for the trading halt. This field will contain only spaces if Trading Status is not "H".
     *
     * @return the HaltReason field
     */
    public HaltReasonField haltReason() {
        return haltReason;
    }

    /**
     * Reason for the session change.
     *
     * @return the SessionChangeReason field
     */
    public SessionChangeReasonField sessionChangeReason() {
        return sessionChangeReason;
    }

    /**
     * New session end time specified in terms of local time for server (i.e. not UTC). The field will contain only spaces if Session Change Reason is "0" or "9".
     *
     * @return the NewEndTime field
     */
    public NewEndTimeField newEndTime() {
        return newEndTime;
    }

    /**
     * Order book the status relates to.
     *
     * @return the SubBook field
     */
    public SubBookField subBook() {
        return subBook;
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
        if (!nanosecond.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!tradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStatusField.BYTE_LENGTH;
        if (!symbolStatusFlags.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolStatusFlagsField.BYTE_LENGTH;
        if (!haltReason.parse(data, cursor)) {
            return false;
        }
        cursor += HaltReasonField.BYTE_LENGTH;
        if (!sessionChangeReason.parse(data, cursor)) {
            return false;
        }
        cursor += SessionChangeReasonField.BYTE_LENGTH;
        if (!newEndTime.parse(data, cursor)) {
            return false;
        }
        cursor += NewEndTimeField.BYTE_LENGTH;
        return subBook.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanosecond.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = tradingStatus.encode(data, cursor);
        cursor = symbolStatusFlags.encode(data, cursor);
        cursor = haltReason.encode(data, cursor);
        cursor = sessionChangeReason.encode(data, cursor);
        cursor = newEndTime.encode(data, cursor);
        cursor = subBook.encode(data, cursor);
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
            case "Symbol" -> Optional.of(symbol);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "SymbolStatusFlags" -> Optional.of(symbolStatusFlags);
            case "HaltReason" -> Optional.of(haltReason);
            case "SessionChangeReason" -> Optional.of(sessionChangeReason);
            case "NewEndTime" -> Optional.of(newEndTime);
            case "SubBook" -> Optional.of(subBook);
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
