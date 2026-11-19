package omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.ClOrdIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.ClearingFirmField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.LegCfiCodeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.LegMaturityDateField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.LegStrikePriceField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.NewComplexInstrumentBitfieldField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.NumberOfNewComplexInstrumentBitfieldsField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.types.Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.types.Message;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.types.PrintOptions;

/**
 * Represents the NewComplexInstrumentMessage message from the BinaryOrderEntry protocol.
 *
 * <p>A New Complex Instrument message is used to request that the system create a complex strategy.</p>
 */
public final class NewComplexInstrumentMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 21;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Complex Instrument Message";

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
     */
    private final NumberOfNewComplexInstrumentBitfieldsField numberOfNewComplexInstrumentBitfields = new NumberOfNewComplexInstrumentBitfieldsField();

    /**
     * BitSet NewComplexInstrument byte 1.
     */
    private final NewComplexInstrumentBitfieldField newComplexInstrumentBitfield = new NewComplexInstrumentBitfieldField();

    /**
     * Leg Cfi Code
     */
    private final LegCfiCodeField legCfiCode = new LegCfiCodeField();

    /**
     * Leg Maturity Date
     */
    private final LegMaturityDateField legMaturityDate = new LegMaturityDateField();

    /**
     * Leg Strike Price
     */
    private final LegStrikePriceField legStrikePrice = new LegStrikePriceField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, numberOfNewComplexInstrumentBitfields, newComplexInstrumentBitfield, legCfiCode, legMaturityDate, legStrikePrice, clearingFirm);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
     *
     * @return the NumberOfNewComplexInstrumentBitfields field
     */
    public NumberOfNewComplexInstrumentBitfieldsField numberOfNewComplexInstrumentBitfields() {
        return numberOfNewComplexInstrumentBitfields;
    }

    /**
     * BitSet NewComplexInstrument byte 1.
     *
     * @return the NewComplexInstrumentBitfield field
     */
    public NewComplexInstrumentBitfieldField newComplexInstrumentBitfield() {
        return newComplexInstrumentBitfield;
    }

    /**
     * Leg Cfi Code
     *
     * @return the LegCfiCode field
     */
    public LegCfiCodeField legCfiCode() {
        return legCfiCode;
    }

    /**
     * Leg Maturity Date
     *
     * @return the LegMaturityDate field
     */
    public LegMaturityDateField legMaturityDate() {
        return legMaturityDate;
    }

    /**
     * Leg Strike Price
     *
     * @return the LegStrikePrice field
     */
    public LegStrikePriceField legStrikePrice() {
        return legStrikePrice;
    }

    /**
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Returns whether the fields before the NewComplexInstrumentBitfield put it on the wire.
     *
     * <p>Decode reads the NewComplexInstrumentBitfield where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexInstrumentBitfield is on the wire
     */
    public boolean newComplexInstrumentBitfieldPresent() {
        return numberOfNewComplexInstrumentBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the LegCfiCode put it on the wire.
     *
     * <p>Decode reads the LegCfiCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LegCfiCode is on the wire
     */
    public boolean legCfiCodePresent() {
        return (numberOfNewComplexInstrumentBitfields.value() >= 1L) && (newComplexInstrumentBitfieldPresent() && newComplexInstrumentBitfield.newComplexInstrumentBitfield1LegCfiCode());
    }

    /**
     * Returns whether the fields before the LegMaturityDate put it on the wire.
     *
     * <p>Decode reads the LegMaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LegMaturityDate is on the wire
     */
    public boolean legMaturityDatePresent() {
        return (numberOfNewComplexInstrumentBitfields.value() >= 1L) && (newComplexInstrumentBitfieldPresent() && newComplexInstrumentBitfield.newComplexInstrumentBitfield1LegMaturityDate());
    }

    /**
     * Returns whether the fields before the LegStrikePrice put it on the wire.
     *
     * <p>Decode reads the LegStrikePrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LegStrikePrice is on the wire
     */
    public boolean legStrikePricePresent() {
        return (numberOfNewComplexInstrumentBitfields.value() >= 1L) && (newComplexInstrumentBitfieldPresent() && newComplexInstrumentBitfield.newComplexInstrumentBitfield1LegStrikePrice());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfNewComplexInstrumentBitfields.value() >= 1L) && (newComplexInstrumentBitfieldPresent() && newComplexInstrumentBitfield.newComplexInstrumentBitfield1ClearingFirm());
    }

    private boolean onWire(Field field) {
        return (field != newComplexInstrumentBitfield || newComplexInstrumentBitfieldPresent()) && (field != legCfiCode || legCfiCodePresent()) && (field != legMaturityDate || legMaturityDatePresent()) && (field != legStrikePrice || legStrikePricePresent()) && (field != clearingFirm || clearingFirmPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (newComplexInstrumentBitfieldPresent() ? NewComplexInstrumentBitfieldField.BYTE_LENGTH : 0) + (legCfiCodePresent() ? LegCfiCodeField.BYTE_LENGTH : 0) + (legMaturityDatePresent() ? LegMaturityDateField.BYTE_LENGTH : 0) + (legStrikePricePresent() ? LegStrikePriceField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0);
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!numberOfNewComplexInstrumentBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfNewComplexInstrumentBitfieldsField.BYTE_LENGTH;
        if (newComplexInstrumentBitfieldPresent()) {
            if (end - cursor < NewComplexInstrumentBitfieldField.BYTE_LENGTH || !newComplexInstrumentBitfield.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexInstrumentBitfieldField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (legCfiCodePresent()) {
            if (end - cursor < LegCfiCodeField.BYTE_LENGTH || !legCfiCode.parse(data, cursor)) {
                return false;
            }
            cursor += LegCfiCodeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (legMaturityDatePresent()) {
            if (end - cursor < LegMaturityDateField.BYTE_LENGTH || !legMaturityDate.parse(data, cursor)) {
                return false;
            }
            cursor += LegMaturityDateField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (legStrikePricePresent()) {
            if (end - cursor < LegStrikePriceField.BYTE_LENGTH || !legStrikePrice.parse(data, cursor)) {
                return false;
            }
            cursor += LegStrikePriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingFirmPresent()) {
            if (end - cursor < ClearingFirmField.BYTE_LENGTH || !clearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (newComplexInstrumentBitfieldPresent() != newComplexInstrumentBitfield.hasValue()) {
            throw new IllegalStateException(newComplexInstrumentBitfield.hasValue() ? "newComplexInstrumentBitfield holds a value the fields before it leave off the wire" : "newComplexInstrumentBitfield holds no value, though the fields before it put it on the wire");
        }
        if (legCfiCodePresent() != legCfiCode.hasValue()) {
            throw new IllegalStateException(legCfiCode.hasValue() ? "legCfiCode holds a value the fields before it leave off the wire" : "legCfiCode holds no value, though the fields before it put it on the wire");
        }
        if (legMaturityDatePresent() != legMaturityDate.hasValue()) {
            throw new IllegalStateException(legMaturityDate.hasValue() ? "legMaturityDate holds a value the fields before it leave off the wire" : "legMaturityDate holds no value, though the fields before it put it on the wire");
        }
        if (legStrikePricePresent() != legStrikePrice.hasValue()) {
            throw new IllegalStateException(legStrikePrice.hasValue() ? "legStrikePrice holds a value the fields before it leave off the wire" : "legStrikePrice holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = numberOfNewComplexInstrumentBitfields.encode(data, cursor);
        if (newComplexInstrumentBitfieldPresent()) {
            cursor = newComplexInstrumentBitfield.encode(data, cursor);
        }
        if (legCfiCodePresent()) {
            cursor = legCfiCode.encode(data, cursor);
        }
        if (legMaturityDatePresent()) {
            cursor = legMaturityDate.encode(data, cursor);
        }
        if (legStrikePricePresent()) {
            cursor = legStrikePrice.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
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
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields()) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields()) {
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
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "ClOrdId" -> Optional.of(clOrdId);
            case "NumberOfNewComplexInstrumentBitfields" -> Optional.of(numberOfNewComplexInstrumentBitfields);
            case "NewComplexInstrumentBitfield" -> Optional.of(newComplexInstrumentBitfield);
            case "LegCfiCode" -> Optional.of(legCfiCode);
            case "LegMaturityDate" -> Optional.of(legMaturityDate);
            case "LegStrikePrice" -> Optional.of(legStrikePrice);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewComplexInstrumentMessage message)) {
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
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
        if (!(other instanceof NewComplexInstrumentMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
