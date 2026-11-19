package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ClOrdIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ClearingFirmField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.LegPriceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.NewComplexInstrumentBitfieldField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.NoLegsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.NumberOfNewComplexInstrumentBitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.groups.ComplexLegEntry;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.groups.ComplexLegList;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.PrintOptions;

/**
 * Represents the NewComplexInstrumentMessage message from the BinaryOrderEntry protocol.
 *
 * <p>New Complex Instrument Message.</p>
 */
public final class NewComplexInstrumentMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 22;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Complex Instrument Message";

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. A leading tilde (˜) cannot be sent on any ClOrdId and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system generated ClOrdId. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfNewComplexInstrumentBitfieldsField numberOfNewComplexInstrumentBitfields = new NumberOfNewComplexInstrumentBitfieldsField();

    /**
     * BitSet NewComplexInstrument byte 1.
     */
    private final NewComplexInstrumentBitfieldField newComplexInstrumentBitfield = new NewComplexInstrumentBitfieldField();

    /**
     * Corresponds to NoLegs (555) in Cboe FIX. Indicates the number of repeating groups to fol- low. Must be a minimum of 2 and a maximum of 13. However, for orders with AccountType value of 3 (House Trader), it is possible to specify 0 here. In that case, the repeating group ComplexLe- gOrderInfo should not follow, and the LegPosi- tionEffect is defaulted to None (“N”) for each leg.
     */
    private final NoLegsField noLegs = new NoLegsField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Corresponds to LegPrice (566) in Cboe FIX. Reference price for the future leg of a Volatility Strategy. Mandatory for this case, otherwise ig- nored. See the Volatility Strategies section (p. 7) for more details.
     */
    private final LegPriceField legPrice = new LegPriceField();

    /**
     * Repeating group stated NoLegs times.
     */
    private final ComplexLegList complexLeg = new ComplexLegList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, numberOfNewComplexInstrumentBitfields, newComplexInstrumentBitfield, noLegs, clearingFirm, legPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. A leading tilde (˜) cannot be sent on any ClOrdId and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system generated ClOrdId. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
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
     * Corresponds to NoLegs (555) in Cboe FIX. Indicates the number of repeating groups to fol- low. Must be a minimum of 2 and a maximum of 13. However, for orders with AccountType value of 3 (House Trader), it is possible to specify 0 here. In that case, the repeating group ComplexLe- gOrderInfo should not follow, and the LegPosi- tionEffect is defaulted to None (“N”) for each leg.
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
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
     * Corresponds to LegPrice (566) in Cboe FIX. Reference price for the future leg of a Volatility Strategy. Mandatory for this case, otherwise ig- nored. See the Volatility Strategies section (p. 7) for more details.
     *
     * @return the LegPrice field
     */
    public LegPriceField legPrice() {
        return legPrice;
    }

    /**
     * Repeating group stated NoLegs times.
     *
     * <p>Encode writes this list's size to the NoLegs field.</p>
     *
     * @return the ComplexLeg entries
     */
    public ComplexLegList complexLeg() {
        return complexLeg;
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
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfNewComplexInstrumentBitfields.value() >= 1L) && (newComplexInstrumentBitfieldPresent() && newComplexInstrumentBitfield.newComplexInstrumentBitfield1ClearingFirm());
    }

    /**
     * Returns whether the fields before the LegPrice put it on the wire.
     *
     * <p>Decode reads the LegPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LegPrice is on the wire
     */
    public boolean legPricePresent() {
        return (numberOfNewComplexInstrumentBitfields.value() >= 1L) && (newComplexInstrumentBitfieldPresent() && newComplexInstrumentBitfield.newComplexInstrumentBitfield1LegPrice());
    }

    private boolean onWire(Field field) {
        return (field != newComplexInstrumentBitfield || newComplexInstrumentBitfieldPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != legPrice || legPricePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (newComplexInstrumentBitfieldPresent() ? NewComplexInstrumentBitfieldField.BYTE_LENGTH : 0) + complexLeg.byteLength() + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (legPricePresent() ? LegPriceField.BYTE_LENGTH : 0);
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
            if (end - 1 - cursor < NewComplexInstrumentBitfieldField.BYTE_LENGTH || !newComplexInstrumentBitfield.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexInstrumentBitfieldField.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        if (!complexLeg.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += complexLeg.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (clearingFirmPresent()) {
            if (end - cursor < ClearingFirmField.BYTE_LENGTH || !clearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (legPricePresent()) {
            if (end - cursor < LegPriceField.BYTE_LENGTH || !legPrice.parse(data, cursor)) {
                return false;
            }
            cursor += LegPriceField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (complexLeg.size() > 255) {
            throw new IllegalStateException("complexLeg holds " + complexLeg.size() + " entries, more than its count field can state");
        }
        noLegs.value((short) complexLeg.size());
        if (newComplexInstrumentBitfieldPresent() != newComplexInstrumentBitfield.hasValue()) {
            throw new IllegalStateException(newComplexInstrumentBitfield.hasValue() ? "newComplexInstrumentBitfield holds a value the fields before it leave off the wire" : "newComplexInstrumentBitfield holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (legPricePresent() != legPrice.hasValue()) {
            throw new IllegalStateException(legPrice.hasValue() ? "legPrice holds a value the fields before it leave off the wire" : "legPrice holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = numberOfNewComplexInstrumentBitfields.encode(data, cursor);
        if (newComplexInstrumentBitfieldPresent()) {
            cursor = newComplexInstrumentBitfield.encode(data, cursor);
        }
        cursor = noLegs.encode(data, cursor);
        cursor = complexLeg.encode(data, cursor);
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (legPricePresent()) {
            cursor = legPrice.encode(data, cursor);
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
        complexLeg.clear();
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
        for (Field field : fields()) {
            if (field != noLegs && !field.isRecognized()) {
                return false;
            }
        }
        return complexLeg.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != noLegs && !field.isValid()) {
                return false;
            }
        }
        if (!complexLeg.isValid()) {
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
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!numberOfNewComplexInstrumentBitfields.isDecoded()) {
            return Optional.of(numberOfNewComplexInstrumentBitfields);
        }
        if (newComplexInstrumentBitfieldPresent() && !newComplexInstrumentBitfield.isDecoded()) {
            return Optional.of(newComplexInstrumentBitfield);
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!complexLeg.isDecoded()) {
            return Optional.of(complexLeg.failedEntry().flatMap(ComplexLegEntry::failedAt).orElse(noLegs));
        }
        if (clearingFirmPresent() && !clearingFirm.isDecoded()) {
            return Optional.of(clearingFirm);
        }
        if (legPricePresent() && !legPrice.isDecoded()) {
            return Optional.of(legPrice);
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
            case "NoLegs" -> Optional.of(noLegs);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "LegPrice" -> Optional.of(legPrice);
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
        changed.addAll(complexLeg.diffFields(message.complexLeg));
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            complexLeg.toFormattedString(builder, options);
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
        complexLeg.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && complexLeg.equals(message.complexLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, complexLeg);
    }
}
