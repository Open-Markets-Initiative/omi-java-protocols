package omi.nairobi.nairobiequities.snapshot.mitch.v1_22.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.RecoverFromTimeField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.RequestIdField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.SegmentField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.SequenceNumberField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.SnapshotTypeField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.SubBookFlagsField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.SymbolField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.types.Field;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.types.Message;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.types.PrintOptions;

/**
 * Represents the SnapshotRequestMessage message from the Snapshot protocol.
 *
 * <p>Used by the client to request for a snapshot of the current order book on the Snapshot channel.</p>
 */
public final class SnapshotRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Snapshot Request Message";

    /**
     * Sequence number from which client can build the order book.
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Segment the instrument is assigned to.
     */
    private final SegmentField segment = new SegmentField();

    /**
     * Instrument's symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Order books a message relates to, one bit per book. The document labels this field Sub Book, the label it also gives the single valued order book code of the trade and statistics messages; the two are different encodings.
     */
    private final SubBookFlagsField subBookFlags = new SubBookFlagsField();

    /**
     * Type of snapshot being requested.
     */
    private final SnapshotTypeField snapshotType = new SnapshotTypeField();

    /**
     * Sending time of the last processed trade with regards to Trades (3), or of the last received announcement with regards to News (5), in local time for the server (i.e. not UTC). Ignored if the Snapshot Type is not Trades (3) or News (5).
     */
    private final RecoverFromTimeField recoverFromTime = new RecoverFromTimeField();

    /**
     * Optional identifier of the request.
     */
    private final RequestIdField requestId = new RequestIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, segment, symbol, subBookFlags, snapshotType, recoverFromTime, requestId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Sequence number from which client can build the order book.
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Segment the instrument is assigned to.
     *
     * @return the Segment field
     */
    public SegmentField segment() {
        return segment;
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
     * Order books a message relates to, one bit per book. The document labels this field Sub Book, the label it also gives the single valued order book code of the trade and statistics messages; the two are different encodings.
     *
     * @return the SubBookFlags field
     */
    public SubBookFlagsField subBookFlags() {
        return subBookFlags;
    }

    /**
     * Type of snapshot being requested.
     *
     * @return the SnapshotType field
     */
    public SnapshotTypeField snapshotType() {
        return snapshotType;
    }

    /**
     * Sending time of the last processed trade with regards to Trades (3), or of the last received announcement with regards to News (5), in local time for the server (i.e. not UTC). Ignored if the Snapshot Type is not Trades (3) or News (5).
     *
     * @return the RecoverFromTime field
     */
    public RecoverFromTimeField recoverFromTime() {
        return recoverFromTime;
    }

    /**
     * Optional identifier of the request.
     *
     * @return the RequestId field
     */
    public RequestIdField requestId() {
        return requestId;
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
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!segment.parse(data, cursor)) {
            return false;
        }
        cursor += SegmentField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!subBookFlags.parse(data, cursor)) {
            return false;
        }
        cursor += SubBookFlagsField.BYTE_LENGTH;
        if (!snapshotType.parse(data, cursor)) {
            return false;
        }
        cursor += SnapshotTypeField.BYTE_LENGTH;
        if (!recoverFromTime.parse(data, cursor)) {
            return false;
        }
        cursor += RecoverFromTimeField.BYTE_LENGTH;
        return requestId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sequenceNumber.encode(data, cursor);
        cursor = segment.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = subBookFlags.encode(data, cursor);
        cursor = snapshotType.encode(data, cursor);
        cursor = recoverFromTime.encode(data, cursor);
        cursor = requestId.encode(data, cursor);
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
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "Segment" -> Optional.of(segment);
            case "Symbol" -> Optional.of(symbol);
            case "SubBookFlags" -> Optional.of(subBookFlags);
            case "SnapshotType" -> Optional.of(snapshotType);
            case "RecoverFromTime" -> Optional.of(recoverFromTime);
            case "RequestId" -> Optional.of(requestId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SnapshotRequestMessage message)) {
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
        if (!(other instanceof SnapshotRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
