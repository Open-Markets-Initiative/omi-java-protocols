package omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.fields.AccountField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.fields.CapacityField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.fields.PartyIdField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.fields.PartyRoleField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.fields.SideField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.types.Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.types.GroupEntry;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.types.PrintOptions;

/**
 * One entry of the TrdCapRptSideGrp repeating group.
 *
 * <p>Repeating group stated NoSides times.</p>
 */
public final class TrdCapRptSideGrpEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 5;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "TrdCapRptSideGrp";

    /**
     * Corresponds to Side (54) in Bats FIX. 1 = Buy 2 = Sell 8 = Cross
     */
    private final SideField side = new SideField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Corresponds to PartyID (448) in Bats FIX. The end-client responsible for the trade. Must be an identifier (4 uppercase letters) known to Bats.
     */
    private final PartyIdField partyId = new PartyIdField();

    /**
     * Corresponds to Account (1) in Bats FIX. Contains the Account specified on this leg on the trade capture, if any. Reflected back on trade capture report confirmations. Allowed charac- ters are alphanumeric and colon.
     */
    private final AccountField account = new AccountField();

    /**
     * Corresponds to PartyRole (452) in Bats FIX. Contains the PartyRole specified on this leg on the trade capture, if any. Reflected back on trade capture report confirmations. 2 = EnteringFirm (the party reporting the trade)
     */
    private final PartyRoleField partyRole = new PartyRoleField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(side, capacity, partyId, account, partyRole);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to Side (54) in Bats FIX. 1 = Buy 2 = Sell 8 = Cross
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Corresponds to PartyID (448) in Bats FIX. The end-client responsible for the trade. Must be an identifier (4 uppercase letters) known to Bats.
     *
     * @return the PartyId field
     */
    public PartyIdField partyId() {
        return partyId;
    }

    /**
     * Corresponds to Account (1) in Bats FIX. Contains the Account specified on this leg on the trade capture, if any. Reflected back on trade capture report confirmations. Allowed charac- ters are alphanumeric and colon.
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Corresponds to PartyRole (452) in Bats FIX. Contains the PartyRole specified on this leg on the trade capture, if any. Reflected back on trade capture report confirmations. 2 = EnteringFirm (the party reporting the trade)
     *
     * @return the PartyRole field
     */
    public PartyRoleField partyRole() {
        return partyRole;
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfTradeCaptureReportV2BitfieldsInputKnown && numberOfTradeCaptureReportV2BitfieldsInput >= 2L) && (tradeCaptureReportV2Bitfield2InputKnown && ((tradeCaptureReportV2Bitfield2Input >>> 0) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfTradeCaptureReportV2BitfieldsInputKnown && numberOfTradeCaptureReportV2BitfieldsInput >= 2L) && (tradeCaptureReportV2Bitfield2InputKnown && ((tradeCaptureReportV2Bitfield2Input >>> 1) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the PartyRole put it on the wire.
     *
     * <p>Decode reads the PartyRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PartyRole is on the wire
     */
    public boolean partyRolePresent() {
        return (numberOfTradeCaptureReportV2BitfieldsInputKnown && numberOfTradeCaptureReportV2BitfieldsInput >= 2L) && (tradeCaptureReportV2Bitfield2InputKnown && ((tradeCaptureReportV2Bitfield2Input >>> 4) & 0x1L) > 0L);
    }

    private boolean onWire(Field field) {
        return (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != partyRole || partyRolePresent());
    }

    private long numberOfTradeCaptureReportV2BitfieldsInput;

    private boolean numberOfTradeCaptureReportV2BitfieldsInputGiven;

    private boolean numberOfTradeCaptureReportV2BitfieldsInputKnown;

    /**
     * Gives this message the NumberOfTradeCaptureReportV2Bitfields that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NumberOfTradeCaptureReportV2Bitfields
     */
    public void numberOfTradeCaptureReportV2BitfieldsInput(long value) {
        this.numberOfTradeCaptureReportV2BitfieldsInput = value;
        this.numberOfTradeCaptureReportV2BitfieldsInputGiven = true;
        this.numberOfTradeCaptureReportV2BitfieldsInputKnown = true;
    }

    /**
     * Gives this entry the NumberOfTradeCaptureReportV2Bitfields its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NumberOfTradeCaptureReportV2Bitfields, or empty
     */
    public void numberOfTradeCaptureReportV2BitfieldsInput(OptionalLong value) {
        this.numberOfTradeCaptureReportV2BitfieldsInput = value.orElse(0L);
        this.numberOfTradeCaptureReportV2BitfieldsInputGiven = value.isPresent();
        this.numberOfTradeCaptureReportV2BitfieldsInputKnown = value.isPresent();
    }

    /**
     * Returns the NumberOfTradeCaptureReportV2Bitfields this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NumberOfTradeCaptureReportV2Bitfields, or empty when none is given or known
     */
    public OptionalLong numberOfTradeCaptureReportV2BitfieldsInput() {
        return numberOfTradeCaptureReportV2BitfieldsInputKnown ? OptionalLong.of(numberOfTradeCaptureReportV2BitfieldsInput) : OptionalLong.empty();
    }

    private long tradeCaptureReportV2Bitfield2Input;

    private boolean tradeCaptureReportV2Bitfield2InputGiven;

    private boolean tradeCaptureReportV2Bitfield2InputKnown;

    /**
     * Gives this message the TradeCaptureReportV2Bitfield2 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the TradeCaptureReportV2Bitfield2
     */
    public void tradeCaptureReportV2Bitfield2Input(long value) {
        this.tradeCaptureReportV2Bitfield2Input = value;
        this.tradeCaptureReportV2Bitfield2InputGiven = true;
        this.tradeCaptureReportV2Bitfield2InputKnown = true;
    }

    /**
     * Gives this entry the TradeCaptureReportV2Bitfield2 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the TradeCaptureReportV2Bitfield2, or empty
     */
    public void tradeCaptureReportV2Bitfield2Input(OptionalLong value) {
        this.tradeCaptureReportV2Bitfield2Input = value.orElse(0L);
        this.tradeCaptureReportV2Bitfield2InputGiven = value.isPresent();
        this.tradeCaptureReportV2Bitfield2InputKnown = value.isPresent();
    }

    /**
     * Returns the TradeCaptureReportV2Bitfield2 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the TradeCaptureReportV2Bitfield2, or empty when none is given or known
     */
    public OptionalLong tradeCaptureReportV2Bitfield2Input() {
        return tradeCaptureReportV2Bitfield2InputKnown ? OptionalLong.of(tradeCaptureReportV2Bitfield2Input) : OptionalLong.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (partyRolePresent() ? PartyRoleField.BYTE_LENGTH : 0);
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
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (capacityPresent()) {
            if (end - 4 - cursor < CapacityField.BYTE_LENGTH || !capacity.parse(data, cursor)) {
                return false;
            }
            cursor += CapacityField.BYTE_LENGTH;
        }
        if (end - cursor < 4) {
            return false;
        }
        if (!partyId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdField.BYTE_LENGTH;
        if (accountPresent()) {
            if (end - cursor < AccountField.BYTE_LENGTH || !account.parse(data, cursor)) {
                return false;
            }
            cursor += AccountField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (partyRolePresent()) {
            if (end - cursor < PartyRoleField.BYTE_LENGTH || !partyRole.parse(data, cursor)) {
                return false;
            }
            cursor += PartyRoleField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (accountPresent() != account.hasValue()) {
            throw new IllegalStateException(account.hasValue() ? "account holds a value the fields before it leave off the wire" : "account holds no value, though the fields before it put it on the wire");
        }
        if (partyRolePresent() != partyRole.hasValue()) {
            throw new IllegalStateException(partyRole.hasValue() ? "partyRole holds a value the fields before it leave off the wire" : "partyRole holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = side.encode(data, cursor);
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        cursor = partyId.encode(data, cursor);
        if (accountPresent()) {
            cursor = account.encode(data, cursor);
        }
        if (partyRolePresent()) {
            cursor = partyRole.encode(data, cursor);
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
        this.numberOfTradeCaptureReportV2BitfieldsInputKnown = numberOfTradeCaptureReportV2BitfieldsInputGiven;
        this.tradeCaptureReportV2Bitfield2InputKnown = tradeCaptureReportV2Bitfield2InputGiven;
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
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
            case "Side" -> Optional.of(side);
            case "Capacity" -> Optional.of(capacity);
            case "PartyId" -> Optional.of(partyId);
            case "Account" -> Optional.of(account);
            case "PartyRole" -> Optional.of(partyRole);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof TrdCapRptSideGrpEntry message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof TrdCapRptSideGrpEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
