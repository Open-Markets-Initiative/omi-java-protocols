package omi.nasdaq.iseoptions.otto.ouch.v3_0_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.iseoptions.otto.ouch.v3_0_0.fields.ClRequestIdField;
import omi.nasdaq.iseoptions.otto.ouch.v3_0_0.fields.FirmIdField;
import omi.nasdaq.iseoptions.otto.ouch.v3_0_0.fields.NumLegsField;
import omi.nasdaq.iseoptions.otto.ouch.v3_0_0.fields.ProductIdField;
import omi.nasdaq.iseoptions.otto.ouch.v3_0_0.fields.ProductNameField;
import omi.nasdaq.iseoptions.otto.ouch.v3_0_0.groups.ComplexInstrumentLegsEntry;
import omi.nasdaq.iseoptions.otto.ouch.v3_0_0.groups.ComplexInstrumentLegsList;
import omi.nasdaq.iseoptions.otto.ouch.v3_0_0.types.Field;
import omi.nasdaq.iseoptions.otto.ouch.v3_0_0.types.Message;
import omi.nasdaq.iseoptions.otto.ouch.v3_0_0.types.PrintOptions;

/**
 * Represents the AddComplexInstrumentMessage message from the Otto protocol.
 *
 * <p>This is a variable length message where length is controlled by the number of legs in the instrument. Results in Add Complex Instrument Response and Complex Instrument Directory messages, or a Reject.</p>
 */
public final class AddComplexInstrumentMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'S';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Complex Instrument Message";

    /**
     * Firm ID (e.g. ABCD, 123A)
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * Client identifier of the request. It is echoed back with either Mass Cancel Response or Reject
     */
    private final ClRequestIdField clRequestId = new ClRequestIdField();

    /**
     * Product (Underlying) ID, as specified by Option Directory notifications. Must be populated if Scope=P and UnderlyingSymbol not populated.
     */
    private final ProductIdField productId = new ProductIdField();

    /**
     * Product (Underlying) name; must be provided if ProductID = 0
     */
    private final ProductNameField productName = new ProductNameField();

    /**
     * Number of legs (2-10)
     */
    private final NumLegsField numLegs = new NumLegsField();

    /**
     * Leg Definitions (2-10) of Add Complex Instrument
     */
    private final ComplexInstrumentLegsList complexInstrumentLegs = new ComplexInstrumentLegsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(firmId, clRequestId, productId, productName, numLegs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Firm ID (e.g. ABCD, 123A)
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * Client identifier of the request. It is echoed back with either Mass Cancel Response or Reject
     *
     * @return the ClRequestId field
     */
    public ClRequestIdField clRequestId() {
        return clRequestId;
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
     * Number of legs (2-10)
     *
     * @return the NumLegs field
     */
    public NumLegsField numLegs() {
        return numLegs;
    }

    /**
     * Leg Definitions (2-10) of Add Complex Instrument
     *
     * <p>Encode writes this list's size to the NumLegs field.</p>
     *
     * @return the ComplexInstrumentLegs entries
     */
    public ComplexInstrumentLegsList complexInstrumentLegs() {
        return complexInstrumentLegs;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + complexInstrumentLegs.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!clRequestId.parse(data, cursor)) {
            return false;
        }
        cursor += ClRequestIdField.BYTE_LENGTH;
        if (!productId.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdField.BYTE_LENGTH;
        if (!productName.parse(data, cursor)) {
            return false;
        }
        cursor += ProductNameField.BYTE_LENGTH;
        if (!numLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumLegsField.BYTE_LENGTH;
        if (!complexInstrumentLegs.parse(data, cursor, end, numLegs.value())) {
            return false;
        }
        cursor += complexInstrumentLegs.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (complexInstrumentLegs.size() > 255) {
            throw new IllegalStateException("complexInstrumentLegs holds " + complexInstrumentLegs.size() + " entries, more than its count field can state");
        }
        numLegs.value((short) complexInstrumentLegs.size());
        int cursor = offset;
        cursor = firmId.encode(data, cursor);
        cursor = clRequestId.encode(data, cursor);
        cursor = productId.encode(data, cursor);
        cursor = productName.encode(data, cursor);
        cursor = numLegs.encode(data, cursor);
        cursor = complexInstrumentLegs.encode(data, cursor);
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
        complexInstrumentLegs.clear();
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
        return complexInstrumentLegs.isRecognized();
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
        if (!complexInstrumentLegs.isValid()) {
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
        if (!firmId.isDecoded()) {
            return Optional.of(firmId);
        }
        if (!clRequestId.isDecoded()) {
            return Optional.of(clRequestId);
        }
        if (!productId.isDecoded()) {
            return Optional.of(productId);
        }
        if (!productName.isDecoded()) {
            return Optional.of(productName);
        }
        if (!numLegs.isDecoded()) {
            return Optional.of(numLegs);
        }
        if (!complexInstrumentLegs.isDecoded()) {
            return Optional.of(complexInstrumentLegs.failedEntry().flatMap(ComplexInstrumentLegsEntry::failedAt).orElse(numLegs));
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
            case "FirmId" -> Optional.of(firmId);
            case "ClRequestId" -> Optional.of(clRequestId);
            case "ProductId" -> Optional.of(productId);
            case "ProductName" -> Optional.of(productName);
            case "NumLegs" -> Optional.of(numLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddComplexInstrumentMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(complexInstrumentLegs.diffFields(message.complexInstrumentLegs));
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
            complexInstrumentLegs.toFormattedString(builder, options);
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
        complexInstrumentLegs.toFormattedString(builder, nested);
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
        if (!(other instanceof AddComplexInstrumentMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && complexInstrumentLegs.equals(message.complexInstrumentLegs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, complexInstrumentLegs);
    }
}
