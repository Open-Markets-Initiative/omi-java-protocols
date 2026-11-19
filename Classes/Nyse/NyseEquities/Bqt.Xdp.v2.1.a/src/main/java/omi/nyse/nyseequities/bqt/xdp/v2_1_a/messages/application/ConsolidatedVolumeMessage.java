package omi.nyse.nyseequities.bqt.xdp.v2_1_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.bqt.xdp.v2_1_a.fields.CompleteField;
import omi.nyse.nyseequities.bqt.xdp.v2_1_a.fields.ReasonField;
import omi.nyse.nyseequities.bqt.xdp.v2_1_a.fields.SymbolIndexField;
import omi.nyse.nyseequities.bqt.xdp.v2_1_a.fields.SymbolSeqNumberField;
import omi.nyse.nyseequities.bqt.xdp.v2_1_a.fields.TotalVolumeField;
import omi.nyse.nyseequities.bqt.xdp.v2_1_a.types.Field;
import omi.nyse.nyseequities.bqt.xdp.v2_1_a.types.Message;
import omi.nyse.nyseequities.bqt.xdp.v2_1_a.types.PrintOptions;

/**
 * Represents the ConsolidatedVolumeMessage message from the Bqt protocol.
 *
 * <p>Published on consolidated volume channels</p>
 */
public final class ConsolidatedVolumeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 14;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Consolidated Volume Message";

    /**
     * The unique ID of this symbol for all products within this market. This ID cannot be used to cross reference a security between markets.
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * The unique ID of this message in the sequence of messages published for this specific symbol.
     */
    private final SymbolSeqNumberField symbolSeqNumber = new SymbolSeqNumberField();

    /**
     * The cumulative volume for the stock throughout the day.
     */
    private final TotalVolumeField totalVolume = new TotalVolumeField();

    /**
     * Reason for this update
     */
    private final ReasonField reason = new ReasonField();

    /**
     * Completion indicator
     */
    private final CompleteField complete = new CompleteField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbolIndex, symbolSeqNumber, totalVolume, reason, complete);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The unique ID of this symbol for all products within this market. This ID cannot be used to cross reference a security between markets.
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * The unique ID of this message in the sequence of messages published for this specific symbol.
     *
     * @return the SymbolSeqNumber field
     */
    public SymbolSeqNumberField symbolSeqNumber() {
        return symbolSeqNumber;
    }

    /**
     * The cumulative volume for the stock throughout the day.
     *
     * @return the TotalVolume field
     */
    public TotalVolumeField totalVolume() {
        return totalVolume;
    }

    /**
     * Reason for this update
     *
     * @return the Reason field
     */
    public ReasonField reason() {
        return reason;
    }

    /**
     * Completion indicator
     *
     * @return the Complete field
     */
    public CompleteField complete() {
        return complete;
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
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!symbolSeqNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolSeqNumberField.BYTE_LENGTH;
        if (!totalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeField.BYTE_LENGTH;
        if (!reason.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonField.BYTE_LENGTH;
        return complete.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = symbolIndex.encode(data, cursor);
        cursor = symbolSeqNumber.encode(data, cursor);
        cursor = totalVolume.encode(data, cursor);
        cursor = reason.encode(data, cursor);
        cursor = complete.encode(data, cursor);
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
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "SymbolSeqNumber" -> Optional.of(symbolSeqNumber);
            case "TotalVolume" -> Optional.of(totalVolume);
            case "Reason" -> Optional.of(reason);
            case "Complete" -> Optional.of(complete);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ConsolidatedVolumeMessage message)) {
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
        if (!(other instanceof ConsolidatedVolumeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
