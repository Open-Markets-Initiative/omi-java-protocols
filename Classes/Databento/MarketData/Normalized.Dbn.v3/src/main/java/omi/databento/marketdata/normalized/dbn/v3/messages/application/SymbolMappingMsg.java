package omi.databento.marketdata.normalized.dbn.v3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.databento.marketdata.normalized.dbn.v3.fields.EndTsField;
import omi.databento.marketdata.normalized.dbn.v3.fields.StartTsField;
import omi.databento.marketdata.normalized.dbn.v3.fields.StypeInField;
import omi.databento.marketdata.normalized.dbn.v3.fields.StypeInSymbolField;
import omi.databento.marketdata.normalized.dbn.v3.fields.StypeOutField;
import omi.databento.marketdata.normalized.dbn.v3.fields.StypeOutSymbolField;
import omi.databento.marketdata.normalized.dbn.v3.types.Field;
import omi.databento.marketdata.normalized.dbn.v3.types.Message;
import omi.databento.marketdata.normalized.dbn.v3.types.PrintOptions;

/**
 * Represents the SymbolMappingMsg message from the Normalized protocol.
 *
 * <p>A symbol mapping message, which maps a symbol of one SType to another</p>
 */
public final class SymbolMappingMsg implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0016';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 160;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Symbol Mapping Msg";

    /**
     * The input symbology type
     */
    private final StypeInField stypeIn = new StypeInField();

    /**
     * The input symbol
     */
    private final StypeInSymbolField stypeInSymbol = new StypeInSymbolField();

    /**
     * The output symbology type
     */
    private final StypeOutField stypeOut = new StypeOutField();

    /**
     * The output symbol
     */
    private final StypeOutSymbolField stypeOutSymbol = new StypeOutSymbolField();

    /**
     * The start of the mapping interval expressed as the number of nanoseconds since the UNIX epoch
     */
    private final StartTsField startTs = new StartTsField();

    /**
     * The end of the mapping interval expressed as the number of nanoseconds since the UNIX epoch
     */
    private final EndTsField endTs = new EndTsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(stypeIn, stypeInSymbol, stypeOut, stypeOutSymbol, startTs, endTs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The input symbology type
     *
     * @return the StypeIn field
     */
    public StypeInField stypeIn() {
        return stypeIn;
    }

    /**
     * The input symbol
     *
     * @return the StypeInSymbol field
     */
    public StypeInSymbolField stypeInSymbol() {
        return stypeInSymbol;
    }

    /**
     * The output symbology type
     *
     * @return the StypeOut field
     */
    public StypeOutField stypeOut() {
        return stypeOut;
    }

    /**
     * The output symbol
     *
     * @return the StypeOutSymbol field
     */
    public StypeOutSymbolField stypeOutSymbol() {
        return stypeOutSymbol;
    }

    /**
     * The start of the mapping interval expressed as the number of nanoseconds since the UNIX epoch
     *
     * @return the StartTs field
     */
    public StartTsField startTs() {
        return startTs;
    }

    /**
     * The end of the mapping interval expressed as the number of nanoseconds since the UNIX epoch
     *
     * @return the EndTs field
     */
    public EndTsField endTs() {
        return endTs;
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
        return Optional.ofNullable(startTs.value());
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
        if (!stypeIn.parse(data, cursor)) {
            return false;
        }
        cursor += StypeInField.BYTE_LENGTH;
        if (!stypeInSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += StypeInSymbolField.BYTE_LENGTH;
        if (!stypeOut.parse(data, cursor)) {
            return false;
        }
        cursor += StypeOutField.BYTE_LENGTH;
        if (!stypeOutSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += StypeOutSymbolField.BYTE_LENGTH;
        if (!startTs.parse(data, cursor)) {
            return false;
        }
        cursor += StartTsField.BYTE_LENGTH;
        return endTs.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = stypeIn.encode(data, cursor);
        cursor = stypeInSymbol.encode(data, cursor);
        cursor = stypeOut.encode(data, cursor);
        cursor = stypeOutSymbol.encode(data, cursor);
        cursor = startTs.encode(data, cursor);
        cursor = endTs.encode(data, cursor);
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
            case "StypeIn" -> Optional.of(stypeIn);
            case "StypeInSymbol" -> Optional.of(stypeInSymbol);
            case "StypeOut" -> Optional.of(stypeOut);
            case "StypeOutSymbol" -> Optional.of(stypeOutSymbol);
            case "StartTs" -> Optional.of(startTs);
            case "EndTs" -> Optional.of(endTs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SymbolMappingMsg message)) {
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
        if (!(other instanceof SymbolMappingMsg message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
