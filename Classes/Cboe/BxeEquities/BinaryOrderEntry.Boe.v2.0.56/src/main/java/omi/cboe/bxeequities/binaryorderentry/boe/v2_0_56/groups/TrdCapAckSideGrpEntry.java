package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_56.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_56.fields.AccountField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_56.fields.CapacityField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_56.fields.PartyIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_56.fields.PartyRoleField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_56.fields.SideField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_56.types.Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_56.types.GroupEntry;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_56.types.PrintOptions;

/**
 * One entry of the TrdCapAckSideGrp repeating group.
 *
 * <p>Repeating group stated NoSides times.</p>
 */
public final class TrdCapAckSideGrpEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "TrdCapAckSideGrp";

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell 5 = Sell Short 6 = Sell Short Exempt H = Sell Undisclosed
     */
    private final SideField side = new SideField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Corresponds to PartyID (448) in Cboe FIX. The end-client responsible for the trade. Must be an identifier (4 uppercase letters) known to Cboe.
     */
    private final PartyIdField partyId = new PartyIdField();

    /**
     * Corresponds to PartyRole (452) in Cboe FIX. Contains the PartyRole specified on this leg on the trade capture, if any. Reflected back on trade capture report confirmations. 1 = ExecutingFirm (default) (if used, must be set on both sides. Is not permitted for bilateral trades) 2 = EnteringFirm (the party reporting the trade. Should not be used for the second leg) 3 = ContraFirm (the party the trade is alleged against)
     */
    private final PartyRoleField partyRole = new PartyRoleField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(side, capacity, account, partyId, partyRole);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell 5 = Sell Short 6 = Sell Short Exempt H = Sell Undisclosed
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
     * Account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Corresponds to PartyID (448) in Cboe FIX. The end-client responsible for the trade. Must be an identifier (4 uppercase letters) known to Cboe.
     *
     * @return the PartyId field
     */
    public PartyIdField partyId() {
        return partyId;
    }

    /**
     * Corresponds to PartyRole (452) in Cboe FIX. Contains the PartyRole specified on this leg on the trade capture, if any. Reflected back on trade capture report confirmations. 1 = ExecutingFirm (default) (if used, must be set on both sides. Is not permitted for bilateral trades) 2 = EnteringFirm (the party reporting the trade. Should not be used for the second leg) 3 = ContraFirm (the party the trade is alleged against)
     *
     * @return the PartyRole field
     */
    public PartyRoleField partyRole() {
        return partyRole;
    }

    /**
     * Returns whether the fields before the Side put it on the wire.
     *
     * <p>Decode reads the Side where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Side is on the wire
     */
    public boolean sidePresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 1L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield1InputKnown && ((tradeCaptureReportAcknowledgmentV2ReturnBitfield1Input >>> 0) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 2L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield2InputKnown && ((tradeCaptureReportAcknowledgmentV2ReturnBitfield2Input >>> 6) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 3L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield3InputKnown && ((tradeCaptureReportAcknowledgmentV2ReturnBitfield3Input >>> 0) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the PartyId put it on the wire.
     *
     * <p>Decode reads the PartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PartyId is on the wire
     */
    public boolean partyIdPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 4L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield4InputKnown && ((tradeCaptureReportAcknowledgmentV2ReturnBitfield4Input >>> 6) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the PartyRole put it on the wire.
     *
     * <p>Decode reads the PartyRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PartyRole is on the wire
     */
    public boolean partyRolePresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 6L) && (tradeCaptureReportAcknowledgmentV2ReturnBitfield6InputKnown && ((tradeCaptureReportAcknowledgmentV2ReturnBitfield6Input >>> 7) & 0x1L) > 0L);
    }

    private boolean onWire(Field field) {
        return (field != side || sidePresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != partyId || partyIdPresent()) && (field != partyRole || partyRolePresent());
    }

    private long numberOfReturnBitfieldsInput;

    private boolean numberOfReturnBitfieldsInputGiven;

    private boolean numberOfReturnBitfieldsInputKnown;

    /**
     * Gives this message the NumberOfReturnBitfields that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NumberOfReturnBitfields
     */
    public void numberOfReturnBitfieldsInput(long value) {
        this.numberOfReturnBitfieldsInput = value;
        this.numberOfReturnBitfieldsInputGiven = true;
        this.numberOfReturnBitfieldsInputKnown = true;
    }

    /**
     * Gives this entry the NumberOfReturnBitfields its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NumberOfReturnBitfields, or empty
     */
    public void numberOfReturnBitfieldsInput(OptionalLong value) {
        this.numberOfReturnBitfieldsInput = value.orElse(0L);
        this.numberOfReturnBitfieldsInputGiven = value.isPresent();
        this.numberOfReturnBitfieldsInputKnown = value.isPresent();
    }

    /**
     * Returns the NumberOfReturnBitfields this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NumberOfReturnBitfields, or empty when none is given or known
     */
    public OptionalLong numberOfReturnBitfieldsInput() {
        return numberOfReturnBitfieldsInputKnown ? OptionalLong.of(numberOfReturnBitfieldsInput) : OptionalLong.empty();
    }

    private long tradeCaptureReportAcknowledgmentV2ReturnBitfield1Input;

    private boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield1InputGiven;

    private boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield1InputKnown;

    /**
     * Gives this message the TradeCaptureReportAcknowledgmentV2ReturnBitfield1 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the TradeCaptureReportAcknowledgmentV2ReturnBitfield1
     */
    public void tradeCaptureReportAcknowledgmentV2ReturnBitfield1Input(long value) {
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield1Input = value;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield1InputGiven = true;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield1InputKnown = true;
    }

    /**
     * Gives this entry the TradeCaptureReportAcknowledgmentV2ReturnBitfield1 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the TradeCaptureReportAcknowledgmentV2ReturnBitfield1, or empty
     */
    public void tradeCaptureReportAcknowledgmentV2ReturnBitfield1Input(OptionalLong value) {
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield1Input = value.orElse(0L);
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield1InputGiven = value.isPresent();
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield1InputKnown = value.isPresent();
    }

    /**
     * Returns the TradeCaptureReportAcknowledgmentV2ReturnBitfield1 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield1, or empty when none is given or known
     */
    public OptionalLong tradeCaptureReportAcknowledgmentV2ReturnBitfield1Input() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield1InputKnown ? OptionalLong.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield1Input) : OptionalLong.empty();
    }

    private long tradeCaptureReportAcknowledgmentV2ReturnBitfield2Input;

    private boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield2InputGiven;

    private boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield2InputKnown;

    /**
     * Gives this message the TradeCaptureReportAcknowledgmentV2ReturnBitfield2 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the TradeCaptureReportAcknowledgmentV2ReturnBitfield2
     */
    public void tradeCaptureReportAcknowledgmentV2ReturnBitfield2Input(long value) {
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield2Input = value;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield2InputGiven = true;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield2InputKnown = true;
    }

    /**
     * Gives this entry the TradeCaptureReportAcknowledgmentV2ReturnBitfield2 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the TradeCaptureReportAcknowledgmentV2ReturnBitfield2, or empty
     */
    public void tradeCaptureReportAcknowledgmentV2ReturnBitfield2Input(OptionalLong value) {
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield2Input = value.orElse(0L);
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield2InputGiven = value.isPresent();
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield2InputKnown = value.isPresent();
    }

    /**
     * Returns the TradeCaptureReportAcknowledgmentV2ReturnBitfield2 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield2, or empty when none is given or known
     */
    public OptionalLong tradeCaptureReportAcknowledgmentV2ReturnBitfield2Input() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield2InputKnown ? OptionalLong.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield2Input) : OptionalLong.empty();
    }

    private long tradeCaptureReportAcknowledgmentV2ReturnBitfield3Input;

    private boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield3InputGiven;

    private boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield3InputKnown;

    /**
     * Gives this message the TradeCaptureReportAcknowledgmentV2ReturnBitfield3 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the TradeCaptureReportAcknowledgmentV2ReturnBitfield3
     */
    public void tradeCaptureReportAcknowledgmentV2ReturnBitfield3Input(long value) {
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield3Input = value;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield3InputGiven = true;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield3InputKnown = true;
    }

    /**
     * Gives this entry the TradeCaptureReportAcknowledgmentV2ReturnBitfield3 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the TradeCaptureReportAcknowledgmentV2ReturnBitfield3, or empty
     */
    public void tradeCaptureReportAcknowledgmentV2ReturnBitfield3Input(OptionalLong value) {
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield3Input = value.orElse(0L);
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield3InputGiven = value.isPresent();
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield3InputKnown = value.isPresent();
    }

    /**
     * Returns the TradeCaptureReportAcknowledgmentV2ReturnBitfield3 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield3, or empty when none is given or known
     */
    public OptionalLong tradeCaptureReportAcknowledgmentV2ReturnBitfield3Input() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield3InputKnown ? OptionalLong.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield3Input) : OptionalLong.empty();
    }

    private long tradeCaptureReportAcknowledgmentV2ReturnBitfield4Input;

    private boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield4InputGiven;

    private boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield4InputKnown;

    /**
     * Gives this message the TradeCaptureReportAcknowledgmentV2ReturnBitfield4 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the TradeCaptureReportAcknowledgmentV2ReturnBitfield4
     */
    public void tradeCaptureReportAcknowledgmentV2ReturnBitfield4Input(long value) {
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield4Input = value;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield4InputGiven = true;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield4InputKnown = true;
    }

    /**
     * Gives this entry the TradeCaptureReportAcknowledgmentV2ReturnBitfield4 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the TradeCaptureReportAcknowledgmentV2ReturnBitfield4, or empty
     */
    public void tradeCaptureReportAcknowledgmentV2ReturnBitfield4Input(OptionalLong value) {
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield4Input = value.orElse(0L);
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield4InputGiven = value.isPresent();
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield4InputKnown = value.isPresent();
    }

    /**
     * Returns the TradeCaptureReportAcknowledgmentV2ReturnBitfield4 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield4, or empty when none is given or known
     */
    public OptionalLong tradeCaptureReportAcknowledgmentV2ReturnBitfield4Input() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield4InputKnown ? OptionalLong.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield4Input) : OptionalLong.empty();
    }

    private long tradeCaptureReportAcknowledgmentV2ReturnBitfield6Input;

    private boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield6InputGiven;

    private boolean tradeCaptureReportAcknowledgmentV2ReturnBitfield6InputKnown;

    /**
     * Gives this message the TradeCaptureReportAcknowledgmentV2ReturnBitfield6 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the TradeCaptureReportAcknowledgmentV2ReturnBitfield6
     */
    public void tradeCaptureReportAcknowledgmentV2ReturnBitfield6Input(long value) {
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield6Input = value;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield6InputGiven = true;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield6InputKnown = true;
    }

    /**
     * Gives this entry the TradeCaptureReportAcknowledgmentV2ReturnBitfield6 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the TradeCaptureReportAcknowledgmentV2ReturnBitfield6, or empty
     */
    public void tradeCaptureReportAcknowledgmentV2ReturnBitfield6Input(OptionalLong value) {
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield6Input = value.orElse(0L);
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield6InputGiven = value.isPresent();
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield6InputKnown = value.isPresent();
    }

    /**
     * Returns the TradeCaptureReportAcknowledgmentV2ReturnBitfield6 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the TradeCaptureReportAcknowledgmentV2ReturnBitfield6, or empty when none is given or known
     */
    public OptionalLong tradeCaptureReportAcknowledgmentV2ReturnBitfield6Input() {
        return tradeCaptureReportAcknowledgmentV2ReturnBitfield6InputKnown ? OptionalLong.of(tradeCaptureReportAcknowledgmentV2ReturnBitfield6Input) : OptionalLong.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (partyIdPresent() ? PartyIdField.BYTE_LENGTH : 0) + (partyRolePresent() ? PartyRoleField.BYTE_LENGTH : 0);
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
        if (sidePresent()) {
            if (end - cursor < SideField.BYTE_LENGTH || !side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (capacityPresent()) {
            if (end - cursor < CapacityField.BYTE_LENGTH || !capacity.parse(data, cursor)) {
                return false;
            }
            cursor += CapacityField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (accountPresent()) {
            if (end - cursor < AccountField.BYTE_LENGTH || !account.parse(data, cursor)) {
                return false;
            }
            cursor += AccountField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (partyIdPresent()) {
            if (end - cursor < PartyIdField.BYTE_LENGTH || !partyId.parse(data, cursor)) {
                return false;
            }
            cursor += PartyIdField.BYTE_LENGTH;
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
        if (sidePresent() != side.hasValue()) {
            throw new IllegalStateException(side.hasValue() ? "side holds a value the fields before it leave off the wire" : "side holds no value, though the fields before it put it on the wire");
        }
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (accountPresent() != account.hasValue()) {
            throw new IllegalStateException(account.hasValue() ? "account holds a value the fields before it leave off the wire" : "account holds no value, though the fields before it put it on the wire");
        }
        if (partyIdPresent() != partyId.hasValue()) {
            throw new IllegalStateException(partyId.hasValue() ? "partyId holds a value the fields before it leave off the wire" : "partyId holds no value, though the fields before it put it on the wire");
        }
        if (partyRolePresent() != partyRole.hasValue()) {
            throw new IllegalStateException(partyRole.hasValue() ? "partyRole holds a value the fields before it leave off the wire" : "partyRole holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        if (sidePresent()) {
            cursor = side.encode(data, cursor);
        }
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        if (accountPresent()) {
            cursor = account.encode(data, cursor);
        }
        if (partyIdPresent()) {
            cursor = partyId.encode(data, cursor);
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
        this.numberOfReturnBitfieldsInputKnown = numberOfReturnBitfieldsInputGiven;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield1InputKnown = tradeCaptureReportAcknowledgmentV2ReturnBitfield1InputGiven;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield2InputKnown = tradeCaptureReportAcknowledgmentV2ReturnBitfield2InputGiven;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield3InputKnown = tradeCaptureReportAcknowledgmentV2ReturnBitfield3InputGiven;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield4InputKnown = tradeCaptureReportAcknowledgmentV2ReturnBitfield4InputGiven;
        this.tradeCaptureReportAcknowledgmentV2ReturnBitfield6InputKnown = tradeCaptureReportAcknowledgmentV2ReturnBitfield6InputGiven;
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
            case "Account" -> Optional.of(account);
            case "PartyId" -> Optional.of(partyId);
            case "PartyRole" -> Optional.of(partyRole);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof TrdCapAckSideGrpEntry message)) {
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
        if (!(other instanceof TrdCapAckSideGrpEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
