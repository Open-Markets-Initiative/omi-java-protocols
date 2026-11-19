package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.AccountField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.CapacityField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.CentralCounterpartyField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.FeeCodeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.PartyIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.PartyRoleField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.SideField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.types.Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.types.GroupEntry;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.types.PrintOptions;

/**
 * One entry of the TradeCaptureConfirmV2TrdCapAckSideGrp repeating group.
 *
 * <p>Repeating group stated NoSides times.</p>
 */
public final class TradeCaptureConfirmV2TrdCapAckSideGrpEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "TradeCaptureConfirmV2TrdCapAckSideGrp";

    /**
     * Corresponds to Side (54) in Bats FIX. 1 = Buy 2 = Sell 5 = Sell Short 6 = Sell Short Exempt H = Sell Undisclosed
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
     * Party Id
     */
    private final PartyIdField partyId = new PartyIdField();

    /**
     * Central Counterparty
     */
    private final CentralCounterpartyField centralCounterparty = new CentralCounterpartyField();

    /**
     * Corresponds to PartyRole (452) in Bats FIX. Contains the PartyRole specified on this leg on the trade capture, if any. Reflected back on trade capture report confirmations. 1 = ExecutingFirm (default) (if used, must be set on both sides. Is not permitted for bilateral trades) 2 = EnteringFirm (the party reporting the trade. Should not be used for the second leg) 3 = ContraFirm (the party the trade is alleged against)
     */
    private final PartyRoleField partyRole = new PartyRoleField();

    /**
     * Fee Code
     */
    private final FeeCodeField feeCode = new FeeCodeField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(side, capacity, account, partyId, centralCounterparty, partyRole, feeCode);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to Side (54) in Bats FIX. 1 = Buy 2 = Sell 5 = Sell Short 6 = Sell Short Exempt H = Sell Undisclosed
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
     * Party Id
     *
     * @return the PartyId field
     */
    public PartyIdField partyId() {
        return partyId;
    }

    /**
     * Central Counterparty
     *
     * @return the CentralCounterparty field
     */
    public CentralCounterpartyField centralCounterparty() {
        return centralCounterparty;
    }

    /**
     * Corresponds to PartyRole (452) in Bats FIX. Contains the PartyRole specified on this leg on the trade capture, if any. Reflected back on trade capture report confirmations. 1 = ExecutingFirm (default) (if used, must be set on both sides. Is not permitted for bilateral trades) 2 = EnteringFirm (the party reporting the trade. Should not be used for the second leg) 3 = ContraFirm (the party the trade is alleged against)
     *
     * @return the PartyRole field
     */
    public PartyRoleField partyRole() {
        return partyRole;
    }

    /**
     * Fee Code
     *
     * @return the FeeCode field
     */
    public FeeCodeField feeCode() {
        return feeCode;
    }

    /**
     * Returns whether the fields before the Side put it on the wire.
     *
     * <p>Decode reads the Side where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Side is on the wire
     */
    public boolean sidePresent() {
        return (numberOfTradeCaptureConfirmV2BitfieldsInputKnown && numberOfTradeCaptureConfirmV2BitfieldsInput >= 1L) && (tradeCaptureConfirmV2Bitfield1InputKnown && ((tradeCaptureConfirmV2Bitfield1Input >>> 0) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfTradeCaptureConfirmV2BitfieldsInputKnown && numberOfTradeCaptureConfirmV2BitfieldsInput >= 2L) && (tradeCaptureConfirmV2Bitfield2InputKnown && ((tradeCaptureConfirmV2Bitfield2Input >>> 6) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfTradeCaptureConfirmV2BitfieldsInputKnown && numberOfTradeCaptureConfirmV2BitfieldsInput >= 3L) && (tradeCaptureConfirmV2Bitfield3InputKnown && ((tradeCaptureConfirmV2Bitfield3Input >>> 0) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the PartyId put it on the wire.
     *
     * <p>Decode reads the PartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PartyId is on the wire
     */
    public boolean partyIdPresent() {
        return (numberOfTradeCaptureConfirmV2BitfieldsInputKnown && numberOfTradeCaptureConfirmV2BitfieldsInput >= 4L) && (tradeCaptureConfirmV2Bitfield4InputKnown && ((tradeCaptureConfirmV2Bitfield4Input >>> 6) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the CentralCounterparty put it on the wire.
     *
     * <p>Decode reads the CentralCounterparty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CentralCounterparty is on the wire
     */
    public boolean centralCounterpartyPresent() {
        return (numberOfTradeCaptureConfirmV2BitfieldsInputKnown && numberOfTradeCaptureConfirmV2BitfieldsInput >= 6L) && (tradeCaptureConfirmV2Bitfield6InputKnown && ((tradeCaptureConfirmV2Bitfield6Input >>> 1) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the PartyRole put it on the wire.
     *
     * <p>Decode reads the PartyRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PartyRole is on the wire
     */
    public boolean partyRolePresent() {
        return (numberOfTradeCaptureConfirmV2BitfieldsInputKnown && numberOfTradeCaptureConfirmV2BitfieldsInput >= 6L) && (tradeCaptureConfirmV2Bitfield6InputKnown && ((tradeCaptureConfirmV2Bitfield6Input >>> 7) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the FeeCode put it on the wire.
     *
     * <p>Decode reads the FeeCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FeeCode is on the wire
     */
    public boolean feeCodePresent() {
        return (numberOfTradeCaptureConfirmV2BitfieldsInputKnown && numberOfTradeCaptureConfirmV2BitfieldsInput >= 8L) && (tradeCaptureConfirmV2Bitfield8InputKnown && ((tradeCaptureConfirmV2Bitfield8Input >>> 0) & 0x1L) > 0L);
    }

    private boolean onWire(Field field) {
        return (field != side || sidePresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != partyId || partyIdPresent()) && (field != centralCounterparty || centralCounterpartyPresent()) && (field != partyRole || partyRolePresent()) && (field != feeCode || feeCodePresent());
    }

    private long numberOfTradeCaptureConfirmV2BitfieldsInput;

    private boolean numberOfTradeCaptureConfirmV2BitfieldsInputGiven;

    private boolean numberOfTradeCaptureConfirmV2BitfieldsInputKnown;

    /**
     * Gives this message the NumberOfTradeCaptureConfirmV2Bitfields that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NumberOfTradeCaptureConfirmV2Bitfields
     */
    public void numberOfTradeCaptureConfirmV2BitfieldsInput(long value) {
        this.numberOfTradeCaptureConfirmV2BitfieldsInput = value;
        this.numberOfTradeCaptureConfirmV2BitfieldsInputGiven = true;
        this.numberOfTradeCaptureConfirmV2BitfieldsInputKnown = true;
    }

    /**
     * Gives this entry the NumberOfTradeCaptureConfirmV2Bitfields its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NumberOfTradeCaptureConfirmV2Bitfields, or empty
     */
    public void numberOfTradeCaptureConfirmV2BitfieldsInput(OptionalLong value) {
        this.numberOfTradeCaptureConfirmV2BitfieldsInput = value.orElse(0L);
        this.numberOfTradeCaptureConfirmV2BitfieldsInputGiven = value.isPresent();
        this.numberOfTradeCaptureConfirmV2BitfieldsInputKnown = value.isPresent();
    }

    /**
     * Returns the NumberOfTradeCaptureConfirmV2Bitfields this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NumberOfTradeCaptureConfirmV2Bitfields, or empty when none is given or known
     */
    public OptionalLong numberOfTradeCaptureConfirmV2BitfieldsInput() {
        return numberOfTradeCaptureConfirmV2BitfieldsInputKnown ? OptionalLong.of(numberOfTradeCaptureConfirmV2BitfieldsInput) : OptionalLong.empty();
    }

    private long tradeCaptureConfirmV2Bitfield1Input;

    private boolean tradeCaptureConfirmV2Bitfield1InputGiven;

    private boolean tradeCaptureConfirmV2Bitfield1InputKnown;

    /**
     * Gives this message the TradeCaptureConfirmV2Bitfield1 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the TradeCaptureConfirmV2Bitfield1
     */
    public void tradeCaptureConfirmV2Bitfield1Input(long value) {
        this.tradeCaptureConfirmV2Bitfield1Input = value;
        this.tradeCaptureConfirmV2Bitfield1InputGiven = true;
        this.tradeCaptureConfirmV2Bitfield1InputKnown = true;
    }

    /**
     * Gives this entry the TradeCaptureConfirmV2Bitfield1 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the TradeCaptureConfirmV2Bitfield1, or empty
     */
    public void tradeCaptureConfirmV2Bitfield1Input(OptionalLong value) {
        this.tradeCaptureConfirmV2Bitfield1Input = value.orElse(0L);
        this.tradeCaptureConfirmV2Bitfield1InputGiven = value.isPresent();
        this.tradeCaptureConfirmV2Bitfield1InputKnown = value.isPresent();
    }

    /**
     * Returns the TradeCaptureConfirmV2Bitfield1 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the TradeCaptureConfirmV2Bitfield1, or empty when none is given or known
     */
    public OptionalLong tradeCaptureConfirmV2Bitfield1Input() {
        return tradeCaptureConfirmV2Bitfield1InputKnown ? OptionalLong.of(tradeCaptureConfirmV2Bitfield1Input) : OptionalLong.empty();
    }

    private long tradeCaptureConfirmV2Bitfield2Input;

    private boolean tradeCaptureConfirmV2Bitfield2InputGiven;

    private boolean tradeCaptureConfirmV2Bitfield2InputKnown;

    /**
     * Gives this message the TradeCaptureConfirmV2Bitfield2 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the TradeCaptureConfirmV2Bitfield2
     */
    public void tradeCaptureConfirmV2Bitfield2Input(long value) {
        this.tradeCaptureConfirmV2Bitfield2Input = value;
        this.tradeCaptureConfirmV2Bitfield2InputGiven = true;
        this.tradeCaptureConfirmV2Bitfield2InputKnown = true;
    }

    /**
     * Gives this entry the TradeCaptureConfirmV2Bitfield2 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the TradeCaptureConfirmV2Bitfield2, or empty
     */
    public void tradeCaptureConfirmV2Bitfield2Input(OptionalLong value) {
        this.tradeCaptureConfirmV2Bitfield2Input = value.orElse(0L);
        this.tradeCaptureConfirmV2Bitfield2InputGiven = value.isPresent();
        this.tradeCaptureConfirmV2Bitfield2InputKnown = value.isPresent();
    }

    /**
     * Returns the TradeCaptureConfirmV2Bitfield2 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the TradeCaptureConfirmV2Bitfield2, or empty when none is given or known
     */
    public OptionalLong tradeCaptureConfirmV2Bitfield2Input() {
        return tradeCaptureConfirmV2Bitfield2InputKnown ? OptionalLong.of(tradeCaptureConfirmV2Bitfield2Input) : OptionalLong.empty();
    }

    private long tradeCaptureConfirmV2Bitfield3Input;

    private boolean tradeCaptureConfirmV2Bitfield3InputGiven;

    private boolean tradeCaptureConfirmV2Bitfield3InputKnown;

    /**
     * Gives this message the TradeCaptureConfirmV2Bitfield3 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the TradeCaptureConfirmV2Bitfield3
     */
    public void tradeCaptureConfirmV2Bitfield3Input(long value) {
        this.tradeCaptureConfirmV2Bitfield3Input = value;
        this.tradeCaptureConfirmV2Bitfield3InputGiven = true;
        this.tradeCaptureConfirmV2Bitfield3InputKnown = true;
    }

    /**
     * Gives this entry the TradeCaptureConfirmV2Bitfield3 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the TradeCaptureConfirmV2Bitfield3, or empty
     */
    public void tradeCaptureConfirmV2Bitfield3Input(OptionalLong value) {
        this.tradeCaptureConfirmV2Bitfield3Input = value.orElse(0L);
        this.tradeCaptureConfirmV2Bitfield3InputGiven = value.isPresent();
        this.tradeCaptureConfirmV2Bitfield3InputKnown = value.isPresent();
    }

    /**
     * Returns the TradeCaptureConfirmV2Bitfield3 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the TradeCaptureConfirmV2Bitfield3, or empty when none is given or known
     */
    public OptionalLong tradeCaptureConfirmV2Bitfield3Input() {
        return tradeCaptureConfirmV2Bitfield3InputKnown ? OptionalLong.of(tradeCaptureConfirmV2Bitfield3Input) : OptionalLong.empty();
    }

    private long tradeCaptureConfirmV2Bitfield4Input;

    private boolean tradeCaptureConfirmV2Bitfield4InputGiven;

    private boolean tradeCaptureConfirmV2Bitfield4InputKnown;

    /**
     * Gives this message the TradeCaptureConfirmV2Bitfield4 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the TradeCaptureConfirmV2Bitfield4
     */
    public void tradeCaptureConfirmV2Bitfield4Input(long value) {
        this.tradeCaptureConfirmV2Bitfield4Input = value;
        this.tradeCaptureConfirmV2Bitfield4InputGiven = true;
        this.tradeCaptureConfirmV2Bitfield4InputKnown = true;
    }

    /**
     * Gives this entry the TradeCaptureConfirmV2Bitfield4 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the TradeCaptureConfirmV2Bitfield4, or empty
     */
    public void tradeCaptureConfirmV2Bitfield4Input(OptionalLong value) {
        this.tradeCaptureConfirmV2Bitfield4Input = value.orElse(0L);
        this.tradeCaptureConfirmV2Bitfield4InputGiven = value.isPresent();
        this.tradeCaptureConfirmV2Bitfield4InputKnown = value.isPresent();
    }

    /**
     * Returns the TradeCaptureConfirmV2Bitfield4 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the TradeCaptureConfirmV2Bitfield4, or empty when none is given or known
     */
    public OptionalLong tradeCaptureConfirmV2Bitfield4Input() {
        return tradeCaptureConfirmV2Bitfield4InputKnown ? OptionalLong.of(tradeCaptureConfirmV2Bitfield4Input) : OptionalLong.empty();
    }

    private long tradeCaptureConfirmV2Bitfield6Input;

    private boolean tradeCaptureConfirmV2Bitfield6InputGiven;

    private boolean tradeCaptureConfirmV2Bitfield6InputKnown;

    /**
     * Gives this message the TradeCaptureConfirmV2Bitfield6 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the TradeCaptureConfirmV2Bitfield6
     */
    public void tradeCaptureConfirmV2Bitfield6Input(long value) {
        this.tradeCaptureConfirmV2Bitfield6Input = value;
        this.tradeCaptureConfirmV2Bitfield6InputGiven = true;
        this.tradeCaptureConfirmV2Bitfield6InputKnown = true;
    }

    /**
     * Gives this entry the TradeCaptureConfirmV2Bitfield6 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the TradeCaptureConfirmV2Bitfield6, or empty
     */
    public void tradeCaptureConfirmV2Bitfield6Input(OptionalLong value) {
        this.tradeCaptureConfirmV2Bitfield6Input = value.orElse(0L);
        this.tradeCaptureConfirmV2Bitfield6InputGiven = value.isPresent();
        this.tradeCaptureConfirmV2Bitfield6InputKnown = value.isPresent();
    }

    /**
     * Returns the TradeCaptureConfirmV2Bitfield6 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the TradeCaptureConfirmV2Bitfield6, or empty when none is given or known
     */
    public OptionalLong tradeCaptureConfirmV2Bitfield6Input() {
        return tradeCaptureConfirmV2Bitfield6InputKnown ? OptionalLong.of(tradeCaptureConfirmV2Bitfield6Input) : OptionalLong.empty();
    }

    private long tradeCaptureConfirmV2Bitfield8Input;

    private boolean tradeCaptureConfirmV2Bitfield8InputGiven;

    private boolean tradeCaptureConfirmV2Bitfield8InputKnown;

    /**
     * Gives this message the TradeCaptureConfirmV2Bitfield8 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the TradeCaptureConfirmV2Bitfield8
     */
    public void tradeCaptureConfirmV2Bitfield8Input(long value) {
        this.tradeCaptureConfirmV2Bitfield8Input = value;
        this.tradeCaptureConfirmV2Bitfield8InputGiven = true;
        this.tradeCaptureConfirmV2Bitfield8InputKnown = true;
    }

    /**
     * Gives this entry the TradeCaptureConfirmV2Bitfield8 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the TradeCaptureConfirmV2Bitfield8, or empty
     */
    public void tradeCaptureConfirmV2Bitfield8Input(OptionalLong value) {
        this.tradeCaptureConfirmV2Bitfield8Input = value.orElse(0L);
        this.tradeCaptureConfirmV2Bitfield8InputGiven = value.isPresent();
        this.tradeCaptureConfirmV2Bitfield8InputKnown = value.isPresent();
    }

    /**
     * Returns the TradeCaptureConfirmV2Bitfield8 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the TradeCaptureConfirmV2Bitfield8, or empty when none is given or known
     */
    public OptionalLong tradeCaptureConfirmV2Bitfield8Input() {
        return tradeCaptureConfirmV2Bitfield8InputKnown ? OptionalLong.of(tradeCaptureConfirmV2Bitfield8Input) : OptionalLong.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (partyIdPresent() ? PartyIdField.BYTE_LENGTH : 0) + (centralCounterpartyPresent() ? CentralCounterpartyField.BYTE_LENGTH : 0) + (partyRolePresent() ? PartyRoleField.BYTE_LENGTH : 0) + (feeCodePresent() ? FeeCodeField.BYTE_LENGTH : 0);
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
        if (centralCounterpartyPresent()) {
            if (end - cursor < CentralCounterpartyField.BYTE_LENGTH || !centralCounterparty.parse(data, cursor)) {
                return false;
            }
            cursor += CentralCounterpartyField.BYTE_LENGTH;
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
        if (end - cursor < 0) {
            return false;
        }
        if (feeCodePresent()) {
            if (end - cursor < FeeCodeField.BYTE_LENGTH || !feeCode.parse(data, cursor)) {
                return false;
            }
            cursor += FeeCodeField.BYTE_LENGTH;
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
        if (centralCounterpartyPresent() != centralCounterparty.hasValue()) {
            throw new IllegalStateException(centralCounterparty.hasValue() ? "centralCounterparty holds a value the fields before it leave off the wire" : "centralCounterparty holds no value, though the fields before it put it on the wire");
        }
        if (partyRolePresent() != partyRole.hasValue()) {
            throw new IllegalStateException(partyRole.hasValue() ? "partyRole holds a value the fields before it leave off the wire" : "partyRole holds no value, though the fields before it put it on the wire");
        }
        if (feeCodePresent() != feeCode.hasValue()) {
            throw new IllegalStateException(feeCode.hasValue() ? "feeCode holds a value the fields before it leave off the wire" : "feeCode holds no value, though the fields before it put it on the wire");
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
        if (centralCounterpartyPresent()) {
            cursor = centralCounterparty.encode(data, cursor);
        }
        if (partyRolePresent()) {
            cursor = partyRole.encode(data, cursor);
        }
        if (feeCodePresent()) {
            cursor = feeCode.encode(data, cursor);
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
        this.numberOfTradeCaptureConfirmV2BitfieldsInputKnown = numberOfTradeCaptureConfirmV2BitfieldsInputGiven;
        this.tradeCaptureConfirmV2Bitfield1InputKnown = tradeCaptureConfirmV2Bitfield1InputGiven;
        this.tradeCaptureConfirmV2Bitfield2InputKnown = tradeCaptureConfirmV2Bitfield2InputGiven;
        this.tradeCaptureConfirmV2Bitfield3InputKnown = tradeCaptureConfirmV2Bitfield3InputGiven;
        this.tradeCaptureConfirmV2Bitfield4InputKnown = tradeCaptureConfirmV2Bitfield4InputGiven;
        this.tradeCaptureConfirmV2Bitfield6InputKnown = tradeCaptureConfirmV2Bitfield6InputGiven;
        this.tradeCaptureConfirmV2Bitfield8InputKnown = tradeCaptureConfirmV2Bitfield8InputGiven;
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
            case "CentralCounterparty" -> Optional.of(centralCounterparty);
            case "PartyRole" -> Optional.of(partyRole);
            case "FeeCode" -> Optional.of(feeCode);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof TradeCaptureConfirmV2TrdCapAckSideGrpEntry message)) {
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
        if (!(other instanceof TradeCaptureConfirmV2TrdCapAckSideGrpEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
