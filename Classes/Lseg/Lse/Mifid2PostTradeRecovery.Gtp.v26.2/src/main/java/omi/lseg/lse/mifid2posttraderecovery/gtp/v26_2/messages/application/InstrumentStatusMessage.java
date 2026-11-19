package omi.lseg.lse.mifid2posttraderecovery.gtp.v26_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.lse.mifid2posttraderecovery.gtp.v26_2.fields.InstrumentField;
import omi.lseg.lse.mifid2posttraderecovery.gtp.v26_2.fields.NewEndTimeField;
import omi.lseg.lse.mifid2posttraderecovery.gtp.v26_2.fields.OrderBookTypeField;
import omi.lseg.lse.mifid2posttraderecovery.gtp.v26_2.fields.SessionChangeReasonField;
import omi.lseg.lse.mifid2posttraderecovery.gtp.v26_2.fields.SourceVenueField;
import omi.lseg.lse.mifid2posttraderecovery.gtp.v26_2.fields.TimestampField;
import omi.lseg.lse.mifid2posttraderecovery.gtp.v26_2.fields.TradingStatusField;
import omi.lseg.lse.mifid2posttraderecovery.gtp.v26_2.types.Field;
import omi.lseg.lse.mifid2posttraderecovery.gtp.v26_2.types.Message;
import omi.lseg.lse.mifid2posttraderecovery.gtp.v26_2.types.PrintOptions;

/**
 * Represents the InstrumentStatusMessage message from the Mifid2PostTradeRecovery protocol.
 *
 * <p>Used to communicate scheduled and unscheduled session changes. When sent in the recovery channel, used to indicate the current trading status of an instrument.</p>
 */
public final class InstrumentStatusMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Status Message";

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * GTP Instrument identifier if Request Level is 0. Blank if not.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Mandatory field if Request Level = 1. Not considered for other Request Levels.
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * Current Trading status of the Instrument. Populated only when the message is sent at the end of individual order book snapshots during a trading session.
     */
    private final TradingStatusField tradingStatus = new TradingStatusField();

    /**
     * Reason the trading session changed.
     */
    private final SessionChangeReasonField sessionChangeReason = new SessionChangeReasonField();

    /**
     * New time the session will end. The field will contain only spaces if Session Change Reason is '0' or the Session Change Reason is not present. New End Time will be in terms of the local time on the server (i.e., not UTC).
     */
    private final NewEndTimeField newEndTime = new NewEndTimeField();

    /**
     * Order book the status applies to.
     */
    private final OrderBookTypeField orderBookType = new OrderBookTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrument, sourceVenue, tradingStatus, sessionChangeReason, newEndTime, orderBookType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the message was generated.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * GTP Instrument identifier if Request Level is 0. Blank if not.
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * Mandatory field if Request Level = 1. Not considered for other Request Levels.
     *
     * @return the SourceVenue field
     */
    public SourceVenueField sourceVenue() {
        return sourceVenue;
    }

    /**
     * Current Trading status of the Instrument. Populated only when the message is sent at the end of individual order book snapshots during a trading session.
     *
     * @return the TradingStatus field
     */
    public TradingStatusField tradingStatus() {
        return tradingStatus;
    }

    /**
     * Reason the trading session changed.
     *
     * @return the SessionChangeReason field
     */
    public SessionChangeReasonField sessionChangeReason() {
        return sessionChangeReason;
    }

    /**
     * New time the session will end. The field will contain only spaces if Session Change Reason is '0' or the Session Change Reason is not present. New End Time will be in terms of the local time on the server (i.e., not UTC).
     *
     * @return the NewEndTime field
     */
    public NewEndTimeField newEndTime() {
        return newEndTime;
    }

    /**
     * Order book the status applies to.
     *
     * @return the OrderBookType field
     */
    public OrderBookTypeField orderBookType() {
        return orderBookType;
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
        return Optional.ofNullable(timestampField.value());
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!sourceVenue.parse(data, cursor)) {
            return false;
        }
        cursor += SourceVenueField.BYTE_LENGTH;
        if (!tradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStatusField.BYTE_LENGTH;
        if (!sessionChangeReason.parse(data, cursor)) {
            return false;
        }
        cursor += SessionChangeReasonField.BYTE_LENGTH;
        if (!newEndTime.parse(data, cursor)) {
            return false;
        }
        cursor += NewEndTimeField.BYTE_LENGTH;
        return orderBookType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = sourceVenue.encode(data, cursor);
        cursor = tradingStatus.encode(data, cursor);
        cursor = sessionChangeReason.encode(data, cursor);
        cursor = newEndTime.encode(data, cursor);
        cursor = orderBookType.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "Instrument" -> Optional.of(instrument);
            case "SourceVenue" -> Optional.of(sourceVenue);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "SessionChangeReason" -> Optional.of(sessionChangeReason);
            case "NewEndTime" -> Optional.of(newEndTime);
            case "OrderBookType" -> Optional.of(orderBookType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InstrumentStatusMessage message)) {
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
        if (!(other instanceof InstrumentStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
