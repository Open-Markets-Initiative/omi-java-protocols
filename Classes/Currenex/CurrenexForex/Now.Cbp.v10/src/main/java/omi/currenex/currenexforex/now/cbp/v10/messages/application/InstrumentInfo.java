package omi.currenex.currenexforex.now.cbp.v10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.currenex.currenexforex.now.cbp.v10.fields.InstrumentIdField;
import omi.currenex.currenexforex.now.cbp.v10.fields.InstrumentIndexField;
import omi.currenex.currenexforex.now.cbp.v10.fields.InstrumentTypeField;
import omi.currenex.currenexforex.now.cbp.v10.fields.SessionIdField;
import omi.currenex.currenexforex.now.cbp.v10.fields.SettlementDateField;
import omi.currenex.currenexforex.now.cbp.v10.types.Field;
import omi.currenex.currenexforex.now.cbp.v10.types.Message;
import omi.currenex.currenexforex.now.cbp.v10.types.PrintOptions;

/**
 * Represents the InstrumentInfo message from the Now protocol.
 *
 * <p>Definition of a currency or metal instrument</p>
 */
public final class InstrumentInfo implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'D';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 35;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Info";

    /**
     * Unique session ID
     */
    private final SessionIdField sessionId = new SessionIdField();

    /**
     * Instrument numeric index
     */
    private final InstrumentIndexField instrumentIndex = new InstrumentIndexField();

    /**
     * 1=Foreign Exchange,2=Cash Metals
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * Currency pair or metal code
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Epoch ms for settlement date
     */
    private final SettlementDateField settlementDate = new SettlementDateField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sessionId, instrumentIndex, instrumentType, instrumentId, settlementDate);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique session ID
     *
     * @return the SessionId field
     */
    public SessionIdField sessionId() {
        return sessionId;
    }

    /**
     * Instrument numeric index
     *
     * @return the InstrumentIndex field
     */
    public InstrumentIndexField instrumentIndex() {
        return instrumentIndex;
    }

    /**
     * 1=Foreign Exchange,2=Cash Metals
     *
     * @return the InstrumentType field
     */
    public InstrumentTypeField instrumentType() {
        return instrumentType;
    }

    /**
     * Currency pair or metal code
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Epoch ms for settlement date
     *
     * @return the SettlementDate field
     */
    public SettlementDateField settlementDate() {
        return settlementDate;
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
        if (!sessionId.parse(data, cursor)) {
            return false;
        }
        cursor += SessionIdField.BYTE_LENGTH;
        if (!instrumentIndex.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIndexField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        return settlementDate.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sessionId.encode(data, cursor);
        cursor = instrumentIndex.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = settlementDate.encode(data, cursor);
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
            case "SessionId" -> Optional.of(sessionId);
            case "InstrumentIndex" -> Optional.of(instrumentIndex);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "SettlementDate" -> Optional.of(settlementDate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InstrumentInfo message)) {
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
        if (!(other instanceof InstrumentInfo message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
