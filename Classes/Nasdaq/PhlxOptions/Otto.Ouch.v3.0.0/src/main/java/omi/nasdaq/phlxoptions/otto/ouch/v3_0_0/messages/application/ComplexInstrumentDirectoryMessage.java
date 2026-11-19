package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.InstrumentIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.NumLegsField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ProductIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ProductNameField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.TimestampField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.groups.ComplexDirectoryLegsEntry;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.groups.ComplexDirectoryLegsList;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Field;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Message;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.PrintOptions;

/**
 * Represents the ComplexInstrumentDirectoryMessage message from the Otto protocol.
 *
 * <p>This message is sent whenever new complex strategy is created on the system. InstrumentId of a complex strategy is unique for the trading day across both simple and complex instruments.</p>
 */
public final class ComplexInstrumentDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 's';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 29;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Instrument Directory Message";

    /**
     * Nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Product (Underlying) ID, as specified by Option Directory notifications. Must be populated if Scope=P and UnderlyingSymbol not populated.
     */
    private final ProductIdField productId = new ProductIdField();

    /**
     * Product (Underlying) name; must be provided if ProductID = 0
     */
    private final ProductNameField productName = new ProductNameField();

    /**
     * Instrument ID, as specified by Option Directory notifications
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Number of legs (2-10)
     */
    private final NumLegsField numLegs = new NumLegsField();

    /**
     * Leg Definitions (2-10) of Complex Instrument Directory
     */
    private final ComplexDirectoryLegsList complexDirectoryLegs = new ComplexDirectoryLegsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, productId, productName, instrumentId, numLegs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Product (Underlying) ID, as specified by Option Directory notifications. Must be populated if Scope=P and UnderlyingSymbol not populated.
     *
     * @return the ProductId field
     */
    public ProductIdField productId() {
        return productId;
    }

    /**
     * Product (Underlying) name; must be provided if ProductID = 0
     *
     * @return the ProductName field
     */
    public ProductNameField productName() {
        return productName;
    }

    /**
     * Instrument ID, as specified by Option Directory notifications
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Number of legs (2-10)
     *
     * @return the NumLegs field
     */
    public NumLegsField numLegs() {
        return numLegs;
    }

    /**
     * Leg Definitions (2-10) of Complex Instrument Directory
     *
     * <p>Encode writes this list's size to the NumLegs field.</p>
     *
     * @return the ComplexDirectoryLegs entries
     */
    public ComplexDirectoryLegsList complexDirectoryLegs() {
        return complexDirectoryLegs;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + complexDirectoryLegs.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 8;
        cursor += 2;
        cursor += 13;
        cursor += 4;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        cursor += complexDirectoryLegs.byteLength();
        return cursor;
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!productId.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdField.BYTE_LENGTH;
        if (!productName.parse(data, cursor)) {
            return false;
        }
        cursor += ProductNameField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumLegsField.BYTE_LENGTH;
        if (!complexDirectoryLegs.parse(data, cursor, end, numLegs.value())) {
            return false;
        }
        cursor += complexDirectoryLegs.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (complexDirectoryLegs.size() > 255) {
            throw new IllegalStateException("complexDirectoryLegs holds " + complexDirectoryLegs.size() + " entries, more than its count field can state");
        }
        numLegs.value((short) complexDirectoryLegs.size());
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = productId.encode(data, cursor);
        cursor = productName.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        if (buffer != null && buffer.length >= 28) {
            System.arraycopy(buffer, 27, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numLegs.encode(data, cursor);
        cursor = complexDirectoryLegs.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        complexDirectoryLegs.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numLegs && !field.isRecognized()) {
                return false;
            }
        }
        return complexDirectoryLegs.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numLegs && !field.isValid()) {
                return false;
            }
        }
        if (!complexDirectoryLegs.isValid()) {
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
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!productId.isDecoded()) {
            return Optional.of(productId);
        }
        if (!productName.isDecoded()) {
            return Optional.of(productName);
        }
        if (!instrumentId.isDecoded()) {
            return Optional.of(instrumentId);
        }
        if (!numLegs.isDecoded()) {
            return Optional.of(numLegs);
        }
        if (!complexDirectoryLegs.isDecoded()) {
            return Optional.of(complexDirectoryLegs.failedEntry().flatMap(ComplexDirectoryLegsEntry::failedAt).orElse(numLegs));
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
            case "ProductId" -> Optional.of(productId);
            case "ProductName" -> Optional.of(productName);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "NumLegs" -> Optional.of(numLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexInstrumentDirectoryMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(complexDirectoryLegs.diffFields(message.complexDirectoryLegs));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            complexDirectoryLegs.toFormattedString(builder, options);
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
        complexDirectoryLegs.toFormattedString(builder, nested);
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
        if (!(other instanceof ComplexInstrumentDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && complexDirectoryLegs.equals(message.complexDirectoryLegs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, complexDirectoryLegs);
    }
}
