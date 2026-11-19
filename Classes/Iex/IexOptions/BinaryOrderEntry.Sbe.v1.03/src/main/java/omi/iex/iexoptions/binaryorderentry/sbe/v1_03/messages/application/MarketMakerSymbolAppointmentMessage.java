package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.AppointmentStatusField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.AppointmentTypeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.MarketParticipantIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.MaxAllowableWidthField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.QuoteReliefMultField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.TransactTimeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.UnderlyingIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Message;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.PrintOptions;

/**
 * Represents the MarketMakerSymbolAppointmentMessage message from the BinaryOrderEntry protocol.
 *
 * <p>MarketMakerSymbolAppointmentMessage</p>
 */
public final class MarketMakerSymbolAppointmentMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Maker Symbol Appointment Message";

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * underlyingId
     */
    private final UnderlyingIdField underlyingId = new UnderlyingIdField();

    /**
     * marketParticipantId
     */
    private final MarketParticipantIdField marketParticipantId = new MarketParticipantIdField();

    /**
     * appointmentType
     */
    private final AppointmentTypeField appointmentType = new AppointmentTypeField();

    /**
     * appointmentStatus
     */
    private final AppointmentStatusField appointmentStatus = new AppointmentStatusField();

    /**
     * maxAllowableWidth
     */
    private final MaxAllowableWidthField maxAllowableWidth = new MaxAllowableWidthField();

    /**
     * quoteReliefMult
     */
    private final QuoteReliefMultField quoteReliefMult = new QuoteReliefMultField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, underlyingId, marketParticipantId, appointmentType, appointmentStatus, maxAllowableWidth, quoteReliefMult);

    private byte[] buffer;

    private boolean decoded;

    /**
     * transactTime
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * underlyingId
     *
     * @return the UnderlyingId field
     */
    public UnderlyingIdField underlyingId() {
        return underlyingId;
    }

    /**
     * marketParticipantId
     *
     * @return the MarketParticipantId field
     */
    public MarketParticipantIdField marketParticipantId() {
        return marketParticipantId;
    }

    /**
     * appointmentType
     *
     * @return the AppointmentType field
     */
    public AppointmentTypeField appointmentType() {
        return appointmentType;
    }

    /**
     * appointmentStatus
     *
     * @return the AppointmentStatus field
     */
    public AppointmentStatusField appointmentStatus() {
        return appointmentStatus;
    }

    /**
     * maxAllowableWidth
     *
     * @return the MaxAllowableWidth field
     */
    public MaxAllowableWidthField maxAllowableWidth() {
        return maxAllowableWidth;
    }

    /**
     * quoteReliefMult
     *
     * @return the QuoteReliefMult field
     */
    public QuoteReliefMultField quoteReliefMult() {
        return quoteReliefMult;
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
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!underlyingId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingIdField.BYTE_LENGTH;
        if (!marketParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantIdField.BYTE_LENGTH;
        if (!appointmentType.parse(data, cursor)) {
            return false;
        }
        cursor += AppointmentTypeField.BYTE_LENGTH;
        if (!appointmentStatus.parse(data, cursor)) {
            return false;
        }
        cursor += AppointmentStatusField.BYTE_LENGTH;
        if (!maxAllowableWidth.parse(data, cursor)) {
            return false;
        }
        cursor += MaxAllowableWidthField.BYTE_LENGTH;
        return quoteReliefMult.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = underlyingId.encode(data, cursor);
        cursor = marketParticipantId.encode(data, cursor);
        cursor = appointmentType.encode(data, cursor);
        cursor = appointmentStatus.encode(data, cursor);
        cursor = maxAllowableWidth.encode(data, cursor);
        cursor = quoteReliefMult.encode(data, cursor);
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
            case "TransactTime" -> Optional.of(transactTime);
            case "UnderlyingId" -> Optional.of(underlyingId);
            case "MarketParticipantId" -> Optional.of(marketParticipantId);
            case "AppointmentType" -> Optional.of(appointmentType);
            case "AppointmentStatus" -> Optional.of(appointmentStatus);
            case "MaxAllowableWidth" -> Optional.of(maxAllowableWidth);
            case "QuoteReliefMult" -> Optional.of(quoteReliefMult);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketMakerSymbolAppointmentMessage message)) {
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
        if (!(other instanceof MarketMakerSymbolAppointmentMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
