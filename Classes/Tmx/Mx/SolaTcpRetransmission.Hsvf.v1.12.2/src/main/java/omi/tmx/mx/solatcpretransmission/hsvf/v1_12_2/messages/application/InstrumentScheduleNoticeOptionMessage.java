package omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.ExchangeIdField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.ScheduledStatusChangeTimeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.SeriesStatusField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.structs.LongMessageHeader;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.structs.OptionSymbolScheduleNotice;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.Message;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.PrintOptions;

/**
 * Represents the InstrumentScheduleNoticeOptionMessage message from the SolaTcpRetransmission protocol.
 *
 * <p>Instrument Schedule Notice Option message</p>
 */
public final class InstrumentScheduleNoticeOptionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 40;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Schedule Notice Option Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 20, 1 };

    /**
     * Exchange Id
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Series Status
     */
    private final SeriesStatusField seriesStatus = new SeriesStatusField();

    /**
     * Scheduled Status Change Time
     */
    private final ScheduledStatusChangeTimeField scheduledStatusChangeTime = new ScheduledStatusChangeTimeField();

    /**
     * The guide states these fields once, as Table 3: Long Message Header, for every message the eight Table 2 frames do not. Sequence Number and Message Type are read by the packet, so they are not repeated here.
     */
    private final LongMessageHeader longMessageHeader = new LongMessageHeader();

    /**
     * The guide states the option symbol once and every option message carries it.
     */
    private final OptionSymbolScheduleNotice optionSymbolScheduleNotice = new OptionSymbolScheduleNotice();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(longMessageHeader.fields(), List.<Field>of(exchangeId), List.<Field>of(seriesStatus), List.<Field>of(scheduledStatusChangeTime)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange Id
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Series Status
     *
     * @return the SeriesStatus field
     */
    public SeriesStatusField seriesStatus() {
        return seriesStatus;
    }

    /**
     * Scheduled Status Change Time
     *
     * @return the ScheduledStatusChangeTime field
     */
    public ScheduledStatusChangeTimeField scheduledStatusChangeTime() {
        return scheduledStatusChangeTime;
    }

    /**
     * The guide states these fields once, as Table 3: Long Message Header, for every message the eight Table 2 frames do not. Sequence Number and Message Type are read by the packet, so they are not repeated here.
     *
     * @return the LongMessageHeader record
     */
    public LongMessageHeader longMessageHeader() {
        return longMessageHeader;
    }

    /**
     * The guide states the option symbol once and every option message carries it.
     *
     * @return the OptionSymbolScheduleNotice record
     */
    public OptionSymbolScheduleNotice optionSymbolScheduleNotice() {
        return optionSymbolScheduleNotice;
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
        if (!longMessageHeader.parseFrom(data, cursor, end - 28)) {
            return false;
        }
        cursor += longMessageHeader.byteLength();
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!optionSymbolScheduleNotice.parseFrom(data, cursor, end - 7)) {
            return false;
        }
        cursor += optionSymbolScheduleNotice.byteLength();
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
        cursor = longMessageHeader.encode(data, cursor);
        cursor = exchangeId.encode(data, cursor);
        cursor = optionSymbolScheduleNotice.encode(data, cursor);
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
        longMessageHeader.clear();
        optionSymbolScheduleNotice.clear();
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
        return optionSymbolScheduleNotice.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!optionSymbolScheduleNotice.isValid()) {
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
        changed.addAll(optionSymbolScheduleNotice.diffFields(message.optionSymbolScheduleNotice));
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
            optionSymbolScheduleNotice.toFormattedString(builder, options);
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
        optionSymbolScheduleNotice.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && optionSymbolScheduleNotice.equals(message.optionSymbolScheduleNotice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, optionSymbolScheduleNotice);
    }
}
