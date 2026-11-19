package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.StrikePriceScheduleNoticeFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ExchangeIdField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ExpiryDayField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ExpiryMonthField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ExpiryYearField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.RootSymbolField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ScheduledStatusChangeTimeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.SeriesStatusField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Message;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.PrintOptions;

/**
 * Represents the InstrumentScheduleNoticeOptionMessage message from the SolaTcpRetransmission protocol.
 *
 * <p>Instrument Schedule Notice Option message</p>
 */
public final class InstrumentScheduleNoticeOptionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 28;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Schedule Notice Option Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 1 };

    /**
     * Exchange on which the quote occurred Q = Montreal
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Option base symbol (symbol of the underlying)
     */
    private final RootSymbolField rootSymbol = new RootSymbolField();

    /**
     * Expiry month code of the option
     */
    private final ExpiryMonthField expiryMonth = new ExpiryMonthField();

    /**
     * Last two digits of the option expiry year
     */
    private final ExpiryYearField expiryYear = new ExpiryYearField();

    /**
     * Expiry day of the option
     */
    private final ExpiryDayField expiryDay = new ExpiryDayField();

    /**
     * Series status of the trading instrument
     */
    private final SeriesStatusField seriesStatus = new SeriesStatusField();

    /**
     * Time at which the status change is scheduled. HHMMSS
     */
    private final ScheduledStatusChangeTimeField scheduledStatusChangeTime = new ScheduledStatusChangeTimeField();

    /**
     * Branch
     */
    private final StrikePriceScheduleNoticeFractionPair strikePriceScheduleNoticeFractionPair = new StrikePriceScheduleNoticeFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, rootSymbol, expiryMonth, expiryYear, expiryDay, seriesStatus, scheduledStatusChangeTime);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange on which the quote occurred Q = Montreal
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Option base symbol (symbol of the underlying)
     *
     * @return the RootSymbol field
     */
    public RootSymbolField rootSymbol() {
        return rootSymbol;
    }

    /**
     * Expiry month code of the option
     *
     * @return the ExpiryMonth field
     */
    public ExpiryMonthField expiryMonth() {
        return expiryMonth;
    }

    /**
     * Last two digits of the option expiry year
     *
     * @return the ExpiryYear field
     */
    public ExpiryYearField expiryYear() {
        return expiryYear;
    }

    /**
     * Expiry day of the option
     *
     * @return the ExpiryDay field
     */
    public ExpiryDayField expiryDay() {
        return expiryDay;
    }

    /**
     * Series status of the trading instrument
     *
     * @return the SeriesStatus field
     */
    public SeriesStatusField seriesStatus() {
        return seriesStatus;
    }

    /**
     * Time at which the status change is scheduled. HHMMSS
     *
     * @return the ScheduledStatusChangeTime field
     */
    public ScheduledStatusChangeTimeField scheduledStatusChangeTime() {
        return scheduledStatusChangeTime;
    }

    /**
     * Branch
     *
     * @return the StrikePriceScheduleNoticeFractionPair record
     */
    public StrikePriceScheduleNoticeFractionPair strikePriceScheduleNoticeFractionPair() {
        return strikePriceScheduleNoticeFractionPair;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!rootSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += RootSymbolField.BYTE_LENGTH;
        if (!expiryMonth.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryMonthField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!strikePriceScheduleNoticeFractionPair.parseFrom(data, cursor, end - 11)) {
            return false;
        }
        cursor += strikePriceScheduleNoticeFractionPair.byteLength();
        if (!expiryYear.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryYearField.BYTE_LENGTH;
        if (!expiryDay.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDayField.BYTE_LENGTH;
        if (!seriesStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SeriesStatusField.BYTE_LENGTH;
        return scheduledStatusChangeTime.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = rootSymbol.encode(data, cursor);
        cursor = expiryMonth.encode(data, cursor);
        if (buffer != null && buffer.length >= 9) {
            System.arraycopy(buffer, 8, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = strikePriceScheduleNoticeFractionPair.encode(data, cursor);
        cursor = expiryYear.encode(data, cursor);
        cursor = expiryDay.encode(data, cursor);
        cursor = seriesStatus.encode(data, cursor);
        cursor = scheduledStatusChangeTime.encode(data, cursor);
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
        strikePriceScheduleNoticeFractionPair.clear();
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
        return strikePriceScheduleNoticeFractionPair.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!strikePriceScheduleNoticeFractionPair.isValid()) {
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "RootSymbol" -> Optional.of(rootSymbol);
            case "ExpiryMonth" -> Optional.of(expiryMonth);
            case "ExpiryYear" -> Optional.of(expiryYear);
            case "ExpiryDay" -> Optional.of(expiryDay);
            case "SeriesStatus" -> Optional.of(seriesStatus);
            case "ScheduledStatusChangeTime" -> Optional.of(scheduledStatusChangeTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InstrumentScheduleNoticeOptionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(strikePriceScheduleNoticeFractionPair.diffFields(message.strikePriceScheduleNoticeFractionPair));
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
            builder.append(", ");
            strikePriceScheduleNoticeFractionPair.toFormattedString(builder, options);
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
        strikePriceScheduleNoticeFractionPair.toFormattedString(builder, nested);
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
        if (!(other instanceof InstrumentScheduleNoticeOptionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && strikePriceScheduleNoticeFractionPair.equals(message.strikePriceScheduleNoticeFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, strikePriceScheduleNoticeFractionPair);
    }
}
