package omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.EventReasonField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.ExpectedEventTimeNanoSecondsPartField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.NanosecondsField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.SecondsPartField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.TradingStatusField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.UnderlyingSymbolField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.Field;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.Message;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.PrintOptions;

/**
 * Represents the UnderlyingTradingStatusMessage message from the ComplexTopOfMarket protocol.
 *
 * <p>This message format will be used to notify firms of changes to the trading status of all the options of an underlying</p>
 */
public final class UnderlyingTradingStatusMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'H';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 25;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Underlying Trading Status Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Time at which this product is added/updated on MIAX system today.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Stock Symbol for the option.
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * “H” = MIAX has halted trading for this Underlying Symbol, “R” = MIAX will resume trading (reopen) for this Underlying Symbol, “O” = MIAX will open trading for this Underlying Symbol
     */
    private final TradingStatusField tradingStatus = new TradingStatusField();

    /**
     * Values: “A” = This event resulted from automatic/market driven event “M” = MIAX manually initiated this event
     */
    private final EventReasonField eventReason = new EventReasonField();

    /**
     * Seconds portion of the expected time of the event. Always use in conjunction with the Nano-seconds part field.
     */
    private final SecondsPartField secondsPart = new SecondsPartField();

    /**
     * Nano-seconds portion of the expected time of the event. Specifies number of nano-seconds since the seconds specified in “Expected Event Time Seconds” field.
     */
    private final ExpectedEventTimeNanoSecondsPartField expectedEventTimeNanoSecondsPart = new ExpectedEventTimeNanoSecondsPartField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, underlyingSymbol, tradingStatus, eventReason, secondsPart, expectedEventTimeNanoSecondsPart);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time at which this product is added/updated on MIAX system today.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Stock Symbol for the option.
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * “H” = MIAX has halted trading for this Underlying Symbol, “R” = MIAX will resume trading (reopen) for this Underlying Symbol, “O” = MIAX will open trading for this Underlying Symbol
     *
     * @return the TradingStatus field
     */
    public TradingStatusField tradingStatus() {
        return tradingStatus;
    }

    /**
     * Values: “A” = This event resulted from automatic/market driven event “M” = MIAX manually initiated this event
     *
     * @return the EventReason field
     */
    public EventReasonField eventReason() {
        return eventReason;
    }

    /**
     * Seconds portion of the expected time of the event. Always use in conjunction with the Nano-seconds part field.
     *
     * @return the SecondsPart field
     */
    public SecondsPartField secondsPart() {
        return secondsPart;
    }

    /**
     * Nano-seconds portion of the expected time of the event. Specifies number of nano-seconds since the seconds specified in “Expected Event Time Seconds” field.
     *
     * @return the ExpectedEventTimeNanoSecondsPart field
     */
    public ExpectedEventTimeNanoSecondsPartField expectedEventTimeNanoSecondsPart() {
        return expectedEventTimeNanoSecondsPart;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!tradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStatusField.BYTE_LENGTH;
        if (!eventReason.parse(data, cursor)) {
            return false;
        }
        cursor += EventReasonField.BYTE_LENGTH;
        if (!secondsPart.parse(data, cursor)) {
            return false;
        }
        cursor += SecondsPartField.BYTE_LENGTH;
        if (!expectedEventTimeNanoSecondsPart.parse(data, cursor)) {
            return false;
        }
        cursor += ExpectedEventTimeNanoSecondsPartField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = tradingStatus.encode(data, cursor);
        cursor = eventReason.encode(data, cursor);
        cursor = secondsPart.encode(data, cursor);
        cursor = expectedEventTimeNanoSecondsPart.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "EventReason" -> Optional.of(eventReason);
            case "SecondsPart" -> Optional.of(secondsPart);
            case "ExpectedEventTimeNanoSecondsPart" -> Optional.of(expectedEventTimeNanoSecondsPart);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof UnderlyingTradingStatusMessage message)) {
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
        if (!(other instanceof UnderlyingTradingStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
