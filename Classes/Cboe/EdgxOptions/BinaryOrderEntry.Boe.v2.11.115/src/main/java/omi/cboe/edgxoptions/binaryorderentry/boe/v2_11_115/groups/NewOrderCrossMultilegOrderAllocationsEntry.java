package omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.AccountField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.AllocQtyField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CapacityField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ClOrdIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ClearingAccountField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ClearingOptionalDataField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CmtaNumberField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.EquityLegShortSellField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.EquityPartyIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.FrequentTraderIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.GiveUpFirmIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.LegPositionEffectsExtField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.LegPositionEffectsField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.SideField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.types.GroupEntry;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * One entry of the NewOrderCrossMultilegOrderAllocations repeating group.
 *
 * <p>Repeating group stated GroupCnt times.</p>
 */
public final class NewOrderCrossMultilegOrderAllocationsEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 42;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "NewOrderCrossMultilegOrderAllocations";

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     */
    private final SideField side = new SideField();

    /**
     * Alloc Qty
     */
    private final AllocQtyField allocQty = new AllocQtyField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol (@) and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived, persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Give Up Firm Id
     */
    private final GiveUpFirmIdField giveUpFirmId = new GiveUpFirmIdField();

    /**
     * Indicates status of the client position in the option for each complex option leg. This value String of characters ‘O’, ‘C’, and ‘N’, equal in length to the number of option legs of the instrument. If an equity leg is present it will always be the last leg, and the position effect must be set to ‘N’. This field can be used for complex instruments with up to 12 legs. For more than 12 legs, fill this field with spaces (0x20) and use the optional LegPositionEffectsExt field. O=Open C=Close N=None* *Orders with Capacity = M or ‘N’ will not be required to specify a position effect on their orders or may specify a value of ‘N’, in which case&lt;blank&gt; will be sent to clearing. If the leg is limited to closing only transactions, only Capacity = M will be permitted to submit OpenClose = O if the order has TimeInForce= ‘3’ (IOC) and RoutingInst = B.
     */
    private final LegPositionEffectsField legPositionEffects = new LegPositionEffectsField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Cmta Number
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Clearing Optional Data
     */
    private final ClearingOptionalDataField clearingOptionalData = new ClearingOptionalDataField();

    /**
     * Equity Party Id
     */
    private final EquityPartyIdField equityPartyId = new EquityPartyIdField();

    /**
     * Equity Leg Short Sell
     */
    private final EquityLegShortSellField equityLegShortSell = new EquityLegShortSellField();

    /**
     * Frequent Trader Id
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

    /**
     * See List of Optional Fields.
     */
    private final LegPositionEffectsExtField legPositionEffectsExt = new LegPositionEffectsExtField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(side, allocQty, clOrdId, capacity, giveUpFirmId, legPositionEffects, account, cmtaNumber, clearingAccount, clearingOptionalData, equityPartyId, equityLegShortSell, frequentTraderId, legPositionEffectsExt);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Alloc Qty
     *
     * @return the AllocQty field
     */
    public AllocQtyField allocQty() {
        return allocQty;
    }

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol (@) and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived, persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
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
     * Give Up Firm Id
     *
     * @return the GiveUpFirmId field
     */
    public GiveUpFirmIdField giveUpFirmId() {
        return giveUpFirmId;
    }

    /**
     * Indicates status of the client position in the option for each complex option leg. This value String of characters ‘O’, ‘C’, and ‘N’, equal in length to the number of option legs of the instrument. If an equity leg is present it will always be the last leg, and the position effect must be set to ‘N’. This field can be used for complex instruments with up to 12 legs. For more than 12 legs, fill this field with spaces (0x20) and use the optional LegPositionEffectsExt field. O=Open C=Close N=None* *Orders with Capacity = M or ‘N’ will not be required to specify a position effect on their orders or may specify a value of ‘N’, in which case&lt;blank&gt; will be sent to clearing. If the leg is limited to closing only transactions, only Capacity = M will be permitted to submit OpenClose = O if the order has TimeInForce= ‘3’ (IOC) and RoutingInst = B.
     *
     * @return the LegPositionEffects field
     */
    public LegPositionEffectsField legPositionEffects() {
        return legPositionEffects;
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
     * Cmta Number
     *
     * @return the CmtaNumber field
     */
    public CmtaNumberField cmtaNumber() {
        return cmtaNumber;
    }

    /**
     * Clearing Account
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * Clearing Optional Data
     *
     * @return the ClearingOptionalData field
     */
    public ClearingOptionalDataField clearingOptionalData() {
        return clearingOptionalData;
    }

    /**
     * Equity Party Id
     *
     * @return the EquityPartyId field
     */
    public EquityPartyIdField equityPartyId() {
        return equityPartyId;
    }

    /**
     * Equity Leg Short Sell
     *
     * @return the EquityLegShortSell field
     */
    public EquityLegShortSellField equityLegShortSell() {
        return equityLegShortSell;
    }

    /**
     * Frequent Trader Id
     *
     * @return the FrequentTraderId field
     */
    public FrequentTraderIdField frequentTraderId() {
        return frequentTraderId;
    }

    /**
     * See List of Optional Fields.
     *
     * @return the LegPositionEffectsExt field
     */
    public LegPositionEffectsExtField legPositionEffectsExt() {
        return legPositionEffectsExt;
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 2L) && (newOrderCrossMultilegBitfield2InputKnown && ((newOrderCrossMultilegBitfield2Input >>> 3) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 2L) && (newOrderCrossMultilegBitfield2InputKnown && ((newOrderCrossMultilegBitfield2Input >>> 4) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 2L) && (newOrderCrossMultilegBitfield2InputKnown && ((newOrderCrossMultilegBitfield2Input >>> 5) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ClearingOptionalData put it on the wire.
     *
     * <p>Decode reads the ClearingOptionalData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingOptionalData is on the wire
     */
    public boolean clearingOptionalDataPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 2L) && (newOrderCrossMultilegBitfield2InputKnown && ((newOrderCrossMultilegBitfield2Input >>> 7) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the EquityPartyId put it on the wire.
     *
     * <p>Decode reads the EquityPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityPartyId is on the wire
     */
    public boolean equityPartyIdPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 4L) && (newOrderCrossMultilegBitfield4InputKnown && ((newOrderCrossMultilegBitfield4Input >>> 0) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the EquityLegShortSell put it on the wire.
     *
     * <p>Decode reads the EquityLegShortSell where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityLegShortSell is on the wire
     */
    public boolean equityLegShortSellPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 4L) && (newOrderCrossMultilegBitfield4InputKnown && ((newOrderCrossMultilegBitfield4Input >>> 1) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 5L) && (newOrderCrossMultilegBitfield5InputKnown && ((newOrderCrossMultilegBitfield5Input >>> 1) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the LegPositionEffectsExt put it on the wire.
     *
     * <p>Decode reads the LegPositionEffectsExt where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LegPositionEffectsExt is on the wire
     */
    public boolean legPositionEffectsExtPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 5L) && (newOrderCrossMultilegBitfield5InputKnown && ((newOrderCrossMultilegBitfield5Input >>> 3) & 0x1L) > 0L);
    }

    private boolean onWire(Field field) {
        return (field != account || accountPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != clearingOptionalData || clearingOptionalDataPresent()) && (field != equityPartyId || equityPartyIdPresent()) && (field != equityLegShortSell || equityLegShortSellPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != legPositionEffectsExt || legPositionEffectsExtPresent());
    }

    private long numberOfNewOrderCrossMultilegBitfieldsInput;

    private boolean numberOfNewOrderCrossMultilegBitfieldsInputGiven;

    private boolean numberOfNewOrderCrossMultilegBitfieldsInputKnown;

    /**
     * Gives this message the NumberOfNewOrderCrossMultilegBitfields that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NumberOfNewOrderCrossMultilegBitfields
     */
    public void numberOfNewOrderCrossMultilegBitfieldsInput(long value) {
        this.numberOfNewOrderCrossMultilegBitfieldsInput = value;
        this.numberOfNewOrderCrossMultilegBitfieldsInputGiven = true;
        this.numberOfNewOrderCrossMultilegBitfieldsInputKnown = true;
    }

    /**
     * Gives this entry the NumberOfNewOrderCrossMultilegBitfields its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NumberOfNewOrderCrossMultilegBitfields, or empty
     */
    public void numberOfNewOrderCrossMultilegBitfieldsInput(OptionalLong value) {
        this.numberOfNewOrderCrossMultilegBitfieldsInput = value.orElse(0L);
        this.numberOfNewOrderCrossMultilegBitfieldsInputGiven = value.isPresent();
        this.numberOfNewOrderCrossMultilegBitfieldsInputKnown = value.isPresent();
    }

    /**
     * Returns the NumberOfNewOrderCrossMultilegBitfields this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NumberOfNewOrderCrossMultilegBitfields, or empty when none is given or known
     */
    public OptionalLong numberOfNewOrderCrossMultilegBitfieldsInput() {
        return numberOfNewOrderCrossMultilegBitfieldsInputKnown ? OptionalLong.of(numberOfNewOrderCrossMultilegBitfieldsInput) : OptionalLong.empty();
    }

    private long newOrderCrossMultilegBitfield2Input;

    private boolean newOrderCrossMultilegBitfield2InputGiven;

    private boolean newOrderCrossMultilegBitfield2InputKnown;

    /**
     * Gives this message the NewOrderCrossMultilegBitfield2 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NewOrderCrossMultilegBitfield2
     */
    public void newOrderCrossMultilegBitfield2Input(long value) {
        this.newOrderCrossMultilegBitfield2Input = value;
        this.newOrderCrossMultilegBitfield2InputGiven = true;
        this.newOrderCrossMultilegBitfield2InputKnown = true;
    }

    /**
     * Gives this entry the NewOrderCrossMultilegBitfield2 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NewOrderCrossMultilegBitfield2, or empty
     */
    public void newOrderCrossMultilegBitfield2Input(OptionalLong value) {
        this.newOrderCrossMultilegBitfield2Input = value.orElse(0L);
        this.newOrderCrossMultilegBitfield2InputGiven = value.isPresent();
        this.newOrderCrossMultilegBitfield2InputKnown = value.isPresent();
    }

    /**
     * Returns the NewOrderCrossMultilegBitfield2 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NewOrderCrossMultilegBitfield2, or empty when none is given or known
     */
    public OptionalLong newOrderCrossMultilegBitfield2Input() {
        return newOrderCrossMultilegBitfield2InputKnown ? OptionalLong.of(newOrderCrossMultilegBitfield2Input) : OptionalLong.empty();
    }

    private long newOrderCrossMultilegBitfield4Input;

    private boolean newOrderCrossMultilegBitfield4InputGiven;

    private boolean newOrderCrossMultilegBitfield4InputKnown;

    /**
     * Gives this message the NewOrderCrossMultilegBitfield4 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NewOrderCrossMultilegBitfield4
     */
    public void newOrderCrossMultilegBitfield4Input(long value) {
        this.newOrderCrossMultilegBitfield4Input = value;
        this.newOrderCrossMultilegBitfield4InputGiven = true;
        this.newOrderCrossMultilegBitfield4InputKnown = true;
    }

    /**
     * Gives this entry the NewOrderCrossMultilegBitfield4 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NewOrderCrossMultilegBitfield4, or empty
     */
    public void newOrderCrossMultilegBitfield4Input(OptionalLong value) {
        this.newOrderCrossMultilegBitfield4Input = value.orElse(0L);
        this.newOrderCrossMultilegBitfield4InputGiven = value.isPresent();
        this.newOrderCrossMultilegBitfield4InputKnown = value.isPresent();
    }

    /**
     * Returns the NewOrderCrossMultilegBitfield4 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NewOrderCrossMultilegBitfield4, or empty when none is given or known
     */
    public OptionalLong newOrderCrossMultilegBitfield4Input() {
        return newOrderCrossMultilegBitfield4InputKnown ? OptionalLong.of(newOrderCrossMultilegBitfield4Input) : OptionalLong.empty();
    }

    private long newOrderCrossMultilegBitfield5Input;

    private boolean newOrderCrossMultilegBitfield5InputGiven;

    private boolean newOrderCrossMultilegBitfield5InputKnown;

    /**
     * Gives this message the NewOrderCrossMultilegBitfield5 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NewOrderCrossMultilegBitfield5
     */
    public void newOrderCrossMultilegBitfield5Input(long value) {
        this.newOrderCrossMultilegBitfield5Input = value;
        this.newOrderCrossMultilegBitfield5InputGiven = true;
        this.newOrderCrossMultilegBitfield5InputKnown = true;
    }

    /**
     * Gives this entry the NewOrderCrossMultilegBitfield5 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NewOrderCrossMultilegBitfield5, or empty
     */
    public void newOrderCrossMultilegBitfield5Input(OptionalLong value) {
        this.newOrderCrossMultilegBitfield5Input = value.orElse(0L);
        this.newOrderCrossMultilegBitfield5InputGiven = value.isPresent();
        this.newOrderCrossMultilegBitfield5InputKnown = value.isPresent();
    }

    /**
     * Returns the NewOrderCrossMultilegBitfield5 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NewOrderCrossMultilegBitfield5, or empty when none is given or known
     */
    public OptionalLong newOrderCrossMultilegBitfield5Input() {
        return newOrderCrossMultilegBitfield5InputKnown ? OptionalLong.of(newOrderCrossMultilegBitfield5Input) : OptionalLong.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (clearingOptionalDataPresent() ? ClearingOptionalDataField.BYTE_LENGTH : 0) + (equityPartyIdPresent() ? EquityPartyIdField.BYTE_LENGTH : 0) + (equityLegShortSellPresent() ? EquityLegShortSellField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (legPositionEffectsExtPresent() ? LegPositionEffectsExtField.BYTE_LENGTH : 0);
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
        if (!allocQty.parse(data, cursor)) {
            return false;
        }
        cursor += AllocQtyField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!giveUpFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += GiveUpFirmIdField.BYTE_LENGTH;
        if (!legPositionEffects.parse(data, cursor)) {
            return false;
        }
        cursor += LegPositionEffectsField.BYTE_LENGTH;
        if (accountPresent()) {
            if (end - cursor < AccountField.BYTE_LENGTH || !account.parse(data, cursor)) {
                return false;
            }
            cursor += AccountField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cmtaNumberPresent()) {
            if (end - cursor < CmtaNumberField.BYTE_LENGTH || !cmtaNumber.parse(data, cursor)) {
                return false;
            }
            cursor += CmtaNumberField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingAccountPresent()) {
            if (end - cursor < ClearingAccountField.BYTE_LENGTH || !clearingAccount.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingAccountField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingOptionalDataPresent()) {
            if (end - cursor < ClearingOptionalDataField.BYTE_LENGTH || !clearingOptionalData.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingOptionalDataField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (equityPartyIdPresent()) {
            if (end - cursor < EquityPartyIdField.BYTE_LENGTH || !equityPartyId.parse(data, cursor)) {
                return false;
            }
            cursor += EquityPartyIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (equityLegShortSellPresent()) {
            if (end - cursor < EquityLegShortSellField.BYTE_LENGTH || !equityLegShortSell.parse(data, cursor)) {
                return false;
            }
            cursor += EquityLegShortSellField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (frequentTraderIdPresent()) {
            if (end - cursor < FrequentTraderIdField.BYTE_LENGTH || !frequentTraderId.parse(data, cursor)) {
                return false;
            }
            cursor += FrequentTraderIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (legPositionEffectsExtPresent()) {
            if (end - cursor < LegPositionEffectsExtField.BYTE_LENGTH || !legPositionEffectsExt.parse(data, cursor)) {
                return false;
            }
            cursor += LegPositionEffectsExtField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (accountPresent() != account.hasValue()) {
            throw new IllegalStateException(account.hasValue() ? "account holds a value the fields before it leave off the wire" : "account holds no value, though the fields before it put it on the wire");
        }
        if (cmtaNumberPresent() != cmtaNumber.hasValue()) {
            throw new IllegalStateException(cmtaNumber.hasValue() ? "cmtaNumber holds a value the fields before it leave off the wire" : "cmtaNumber holds no value, though the fields before it put it on the wire");
        }
        if (clearingAccountPresent() != clearingAccount.hasValue()) {
            throw new IllegalStateException(clearingAccount.hasValue() ? "clearingAccount holds a value the fields before it leave off the wire" : "clearingAccount holds no value, though the fields before it put it on the wire");
        }
        if (clearingOptionalDataPresent() != clearingOptionalData.hasValue()) {
            throw new IllegalStateException(clearingOptionalData.hasValue() ? "clearingOptionalData holds a value the fields before it leave off the wire" : "clearingOptionalData holds no value, though the fields before it put it on the wire");
        }
        if (equityPartyIdPresent() != equityPartyId.hasValue()) {
            throw new IllegalStateException(equityPartyId.hasValue() ? "equityPartyId holds a value the fields before it leave off the wire" : "equityPartyId holds no value, though the fields before it put it on the wire");
        }
        if (equityLegShortSellPresent() != equityLegShortSell.hasValue()) {
            throw new IllegalStateException(equityLegShortSell.hasValue() ? "equityLegShortSell holds a value the fields before it leave off the wire" : "equityLegShortSell holds no value, though the fields before it put it on the wire");
        }
        if (frequentTraderIdPresent() != frequentTraderId.hasValue()) {
            throw new IllegalStateException(frequentTraderId.hasValue() ? "frequentTraderId holds a value the fields before it leave off the wire" : "frequentTraderId holds no value, though the fields before it put it on the wire");
        }
        if (legPositionEffectsExtPresent() != legPositionEffectsExt.hasValue()) {
            throw new IllegalStateException(legPositionEffectsExt.hasValue() ? "legPositionEffectsExt holds a value the fields before it leave off the wire" : "legPositionEffectsExt holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = side.encode(data, cursor);
        cursor = allocQty.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = giveUpFirmId.encode(data, cursor);
        cursor = legPositionEffects.encode(data, cursor);
        if (accountPresent()) {
            cursor = account.encode(data, cursor);
        }
        if (cmtaNumberPresent()) {
            cursor = cmtaNumber.encode(data, cursor);
        }
        if (clearingAccountPresent()) {
            cursor = clearingAccount.encode(data, cursor);
        }
        if (clearingOptionalDataPresent()) {
            cursor = clearingOptionalData.encode(data, cursor);
        }
        if (equityPartyIdPresent()) {
            cursor = equityPartyId.encode(data, cursor);
        }
        if (equityLegShortSellPresent()) {
            cursor = equityLegShortSell.encode(data, cursor);
        }
        if (frequentTraderIdPresent()) {
            cursor = frequentTraderId.encode(data, cursor);
        }
        if (legPositionEffectsExtPresent()) {
            cursor = legPositionEffectsExt.encode(data, cursor);
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
        this.numberOfNewOrderCrossMultilegBitfieldsInputKnown = numberOfNewOrderCrossMultilegBitfieldsInputGiven;
        this.newOrderCrossMultilegBitfield2InputKnown = newOrderCrossMultilegBitfield2InputGiven;
        this.newOrderCrossMultilegBitfield4InputKnown = newOrderCrossMultilegBitfield4InputGiven;
        this.newOrderCrossMultilegBitfield5InputKnown = newOrderCrossMultilegBitfield5InputGiven;
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
            case "AllocQty" -> Optional.of(allocQty);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "Capacity" -> Optional.of(capacity);
            case "GiveUpFirmId" -> Optional.of(giveUpFirmId);
            case "LegPositionEffects" -> Optional.of(legPositionEffects);
            case "Account" -> Optional.of(account);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "ClearingOptionalData" -> Optional.of(clearingOptionalData);
            case "EquityPartyId" -> Optional.of(equityPartyId);
            case "EquityLegShortSell" -> Optional.of(equityLegShortSell);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "LegPositionEffectsExt" -> Optional.of(legPositionEffectsExt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof NewOrderCrossMultilegOrderAllocationsEntry message)) {
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
        if (!(other instanceof NewOrderCrossMultilegOrderAllocationsEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
