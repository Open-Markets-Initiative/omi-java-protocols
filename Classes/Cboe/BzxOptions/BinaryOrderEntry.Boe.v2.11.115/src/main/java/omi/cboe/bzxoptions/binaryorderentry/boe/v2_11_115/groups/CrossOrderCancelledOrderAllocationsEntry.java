package omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.AccountField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.AllocQtyField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.CapacityField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ClOrdIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ClearingAccountField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.CmtaNumberField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.GiveUpFirmIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.OpenCloseField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.OrderIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.SideField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.types.GroupEntry;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * One entry of the CrossOrderCancelledOrderAllocations repeating group.
 *
 * <p>Repeating group stated GroupCnt times.</p>
 */
public final class CrossOrderCancelledOrderAllocationsEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 32;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "CrossOrderCancelledOrderAllocations";

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol (@) and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived, persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to OrderID (37) in Cboe FIX. Order identifier supplied by Cboe. This identifier corresponds to the identifiers used in Cboe market data products.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     */
    private final SideField side = new SideField();

    /**
     * Alloc Qty
     */
    private final AllocQtyField allocQty = new AllocQtyField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Open Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Give Up Firm Id
     */
    private final GiveUpFirmIdField giveUpFirmId = new GiveUpFirmIdField();

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
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, orderId, side, allocQty, capacity, openClose, giveUpFirmId, account, cmtaNumber, clearingAccount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol (@) and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived, persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Corresponds to OrderID (37) in Cboe FIX. Order identifier supplied by Cboe. This identifier corresponds to the identifiers used in Cboe market data products.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

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
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Open Close
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
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
     * Returns whether the fields before the Side put it on the wire.
     *
     * <p>Decode reads the Side where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Side is on the wire
     */
    public boolean sidePresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 1L) && (crossOrderCancelledReturnBitfield1InputKnown && ((crossOrderCancelledReturnBitfield1Input >>> 0) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the AllocQty put it on the wire.
     *
     * <p>Decode reads the AllocQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AllocQty is on the wire
     */
    public boolean allocQtyPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 10L) && (crossOrderCancelledReturnBitfield10InputKnown && ((crossOrderCancelledReturnBitfield10Input >>> 1) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 2L) && (crossOrderCancelledReturnBitfield2InputKnown && ((crossOrderCancelledReturnBitfield2Input >>> 6) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 4L) && (crossOrderCancelledReturnBitfield4InputKnown && ((crossOrderCancelledReturnBitfield4Input >>> 3) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the GiveUpFirmId put it on the wire.
     *
     * <p>Decode reads the GiveUpFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the GiveUpFirmId is on the wire
     */
    public boolean giveUpFirmIdPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 10L) && (crossOrderCancelledReturnBitfield10InputKnown && ((crossOrderCancelledReturnBitfield10Input >>> 2) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 3L) && (crossOrderCancelledReturnBitfield3InputKnown && ((crossOrderCancelledReturnBitfield3Input >>> 0) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 9L) && (crossOrderCancelledReturnBitfield9InputKnown && ((crossOrderCancelledReturnBitfield9Input >>> 5) & 0x1L) > 0L);
    }

    private boolean onWire(Field field) {
        return (field != side || sidePresent()) && (field != allocQty || allocQtyPresent()) && (field != capacity || capacityPresent()) && (field != openClose || openClosePresent()) && (field != giveUpFirmId || giveUpFirmIdPresent()) && (field != account || accountPresent()) && (field != cmtaNumber || cmtaNumberPresent());
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

    private long crossOrderCancelledReturnBitfield1Input;

    private boolean crossOrderCancelledReturnBitfield1InputGiven;

    private boolean crossOrderCancelledReturnBitfield1InputKnown;

    /**
     * Gives this message the CrossOrderCancelledReturnBitfield1 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield1
     */
    public void crossOrderCancelledReturnBitfield1Input(long value) {
        this.crossOrderCancelledReturnBitfield1Input = value;
        this.crossOrderCancelledReturnBitfield1InputGiven = true;
        this.crossOrderCancelledReturnBitfield1InputKnown = true;
    }

    /**
     * Gives this entry the CrossOrderCancelledReturnBitfield1 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield1, or empty
     */
    public void crossOrderCancelledReturnBitfield1Input(OptionalLong value) {
        this.crossOrderCancelledReturnBitfield1Input = value.orElse(0L);
        this.crossOrderCancelledReturnBitfield1InputGiven = value.isPresent();
        this.crossOrderCancelledReturnBitfield1InputKnown = value.isPresent();
    }

    /**
     * Returns the CrossOrderCancelledReturnBitfield1 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the CrossOrderCancelledReturnBitfield1, or empty when none is given or known
     */
    public OptionalLong crossOrderCancelledReturnBitfield1Input() {
        return crossOrderCancelledReturnBitfield1InputKnown ? OptionalLong.of(crossOrderCancelledReturnBitfield1Input) : OptionalLong.empty();
    }

    private long crossOrderCancelledReturnBitfield10Input;

    private boolean crossOrderCancelledReturnBitfield10InputGiven;

    private boolean crossOrderCancelledReturnBitfield10InputKnown;

    /**
     * Gives this message the CrossOrderCancelledReturnBitfield10 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield10
     */
    public void crossOrderCancelledReturnBitfield10Input(long value) {
        this.crossOrderCancelledReturnBitfield10Input = value;
        this.crossOrderCancelledReturnBitfield10InputGiven = true;
        this.crossOrderCancelledReturnBitfield10InputKnown = true;
    }

    /**
     * Gives this entry the CrossOrderCancelledReturnBitfield10 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield10, or empty
     */
    public void crossOrderCancelledReturnBitfield10Input(OptionalLong value) {
        this.crossOrderCancelledReturnBitfield10Input = value.orElse(0L);
        this.crossOrderCancelledReturnBitfield10InputGiven = value.isPresent();
        this.crossOrderCancelledReturnBitfield10InputKnown = value.isPresent();
    }

    /**
     * Returns the CrossOrderCancelledReturnBitfield10 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the CrossOrderCancelledReturnBitfield10, or empty when none is given or known
     */
    public OptionalLong crossOrderCancelledReturnBitfield10Input() {
        return crossOrderCancelledReturnBitfield10InputKnown ? OptionalLong.of(crossOrderCancelledReturnBitfield10Input) : OptionalLong.empty();
    }

    private long crossOrderCancelledReturnBitfield2Input;

    private boolean crossOrderCancelledReturnBitfield2InputGiven;

    private boolean crossOrderCancelledReturnBitfield2InputKnown;

    /**
     * Gives this message the CrossOrderCancelledReturnBitfield2 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield2
     */
    public void crossOrderCancelledReturnBitfield2Input(long value) {
        this.crossOrderCancelledReturnBitfield2Input = value;
        this.crossOrderCancelledReturnBitfield2InputGiven = true;
        this.crossOrderCancelledReturnBitfield2InputKnown = true;
    }

    /**
     * Gives this entry the CrossOrderCancelledReturnBitfield2 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield2, or empty
     */
    public void crossOrderCancelledReturnBitfield2Input(OptionalLong value) {
        this.crossOrderCancelledReturnBitfield2Input = value.orElse(0L);
        this.crossOrderCancelledReturnBitfield2InputGiven = value.isPresent();
        this.crossOrderCancelledReturnBitfield2InputKnown = value.isPresent();
    }

    /**
     * Returns the CrossOrderCancelledReturnBitfield2 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the CrossOrderCancelledReturnBitfield2, or empty when none is given or known
     */
    public OptionalLong crossOrderCancelledReturnBitfield2Input() {
        return crossOrderCancelledReturnBitfield2InputKnown ? OptionalLong.of(crossOrderCancelledReturnBitfield2Input) : OptionalLong.empty();
    }

    private long crossOrderCancelledReturnBitfield4Input;

    private boolean crossOrderCancelledReturnBitfield4InputGiven;

    private boolean crossOrderCancelledReturnBitfield4InputKnown;

    /**
     * Gives this message the CrossOrderCancelledReturnBitfield4 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield4
     */
    public void crossOrderCancelledReturnBitfield4Input(long value) {
        this.crossOrderCancelledReturnBitfield4Input = value;
        this.crossOrderCancelledReturnBitfield4InputGiven = true;
        this.crossOrderCancelledReturnBitfield4InputKnown = true;
    }

    /**
     * Gives this entry the CrossOrderCancelledReturnBitfield4 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield4, or empty
     */
    public void crossOrderCancelledReturnBitfield4Input(OptionalLong value) {
        this.crossOrderCancelledReturnBitfield4Input = value.orElse(0L);
        this.crossOrderCancelledReturnBitfield4InputGiven = value.isPresent();
        this.crossOrderCancelledReturnBitfield4InputKnown = value.isPresent();
    }

    /**
     * Returns the CrossOrderCancelledReturnBitfield4 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the CrossOrderCancelledReturnBitfield4, or empty when none is given or known
     */
    public OptionalLong crossOrderCancelledReturnBitfield4Input() {
        return crossOrderCancelledReturnBitfield4InputKnown ? OptionalLong.of(crossOrderCancelledReturnBitfield4Input) : OptionalLong.empty();
    }

    private long crossOrderCancelledReturnBitfield3Input;

    private boolean crossOrderCancelledReturnBitfield3InputGiven;

    private boolean crossOrderCancelledReturnBitfield3InputKnown;

    /**
     * Gives this message the CrossOrderCancelledReturnBitfield3 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield3
     */
    public void crossOrderCancelledReturnBitfield3Input(long value) {
        this.crossOrderCancelledReturnBitfield3Input = value;
        this.crossOrderCancelledReturnBitfield3InputGiven = true;
        this.crossOrderCancelledReturnBitfield3InputKnown = true;
    }

    /**
     * Gives this entry the CrossOrderCancelledReturnBitfield3 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield3, or empty
     */
    public void crossOrderCancelledReturnBitfield3Input(OptionalLong value) {
        this.crossOrderCancelledReturnBitfield3Input = value.orElse(0L);
        this.crossOrderCancelledReturnBitfield3InputGiven = value.isPresent();
        this.crossOrderCancelledReturnBitfield3InputKnown = value.isPresent();
    }

    /**
     * Returns the CrossOrderCancelledReturnBitfield3 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the CrossOrderCancelledReturnBitfield3, or empty when none is given or known
     */
    public OptionalLong crossOrderCancelledReturnBitfield3Input() {
        return crossOrderCancelledReturnBitfield3InputKnown ? OptionalLong.of(crossOrderCancelledReturnBitfield3Input) : OptionalLong.empty();
    }

    private long crossOrderCancelledReturnBitfield9Input;

    private boolean crossOrderCancelledReturnBitfield9InputGiven;

    private boolean crossOrderCancelledReturnBitfield9InputKnown;

    /**
     * Gives this message the CrossOrderCancelledReturnBitfield9 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield9
     */
    public void crossOrderCancelledReturnBitfield9Input(long value) {
        this.crossOrderCancelledReturnBitfield9Input = value;
        this.crossOrderCancelledReturnBitfield9InputGiven = true;
        this.crossOrderCancelledReturnBitfield9InputKnown = true;
    }

    /**
     * Gives this entry the CrossOrderCancelledReturnBitfield9 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield9, or empty
     */
    public void crossOrderCancelledReturnBitfield9Input(OptionalLong value) {
        this.crossOrderCancelledReturnBitfield9Input = value.orElse(0L);
        this.crossOrderCancelledReturnBitfield9InputGiven = value.isPresent();
        this.crossOrderCancelledReturnBitfield9InputKnown = value.isPresent();
    }

    /**
     * Returns the CrossOrderCancelledReturnBitfield9 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the CrossOrderCancelledReturnBitfield9, or empty when none is given or known
     */
    public OptionalLong crossOrderCancelledReturnBitfield9Input() {
        return crossOrderCancelledReturnBitfield9InputKnown ? OptionalLong.of(crossOrderCancelledReturnBitfield9Input) : OptionalLong.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (allocQtyPresent() ? AllocQtyField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (giveUpFirmIdPresent() ? GiveUpFirmIdField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0);
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (sidePresent()) {
            if (end - 4 - cursor < SideField.BYTE_LENGTH || !side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
        }
        if (end - cursor < 4) {
            return false;
        }
        if (allocQtyPresent()) {
            if (end - 4 - cursor < AllocQtyField.BYTE_LENGTH || !allocQty.parse(data, cursor)) {
                return false;
            }
            cursor += AllocQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 4) {
            return false;
        }
        if (capacityPresent()) {
            if (end - 4 - cursor < CapacityField.BYTE_LENGTH || !capacity.parse(data, cursor)) {
                return false;
            }
            cursor += CapacityField.BYTE_LENGTH;
        }
        if (end - cursor < 4) {
            return false;
        }
        if (openClosePresent()) {
            if (end - 4 - cursor < OpenCloseField.BYTE_LENGTH || !openClose.parse(data, cursor)) {
                return false;
            }
            cursor += OpenCloseField.BYTE_LENGTH;
        }
        if (end - cursor < 4) {
            return false;
        }
        if (giveUpFirmIdPresent()) {
            if (end - 4 - cursor < GiveUpFirmIdField.BYTE_LENGTH || !giveUpFirmId.parse(data, cursor)) {
                return false;
            }
            cursor += GiveUpFirmIdField.BYTE_LENGTH;
        }
        if (end - cursor < 4) {
            return false;
        }
        if (accountPresent()) {
            if (end - 4 - cursor < AccountField.BYTE_LENGTH || !account.parse(data, cursor)) {
                return false;
            }
            cursor += AccountField.BYTE_LENGTH;
        }
        if (end - cursor < 4) {
            return false;
        }
        if (cmtaNumberPresent()) {
            if (end - 4 - cursor < CmtaNumberField.BYTE_LENGTH || !cmtaNumber.parse(data, cursor)) {
                return false;
            }
            cursor += CmtaNumberField.BYTE_LENGTH;
        }
        if (end - cursor < 4) {
            return false;
        }
        return clearingAccount.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (sidePresent() != side.hasValue()) {
            throw new IllegalStateException(side.hasValue() ? "side holds a value the fields before it leave off the wire" : "side holds no value, though the fields before it put it on the wire");
        }
        if (allocQtyPresent() != allocQty.hasValue()) {
            throw new IllegalStateException(allocQty.hasValue() ? "allocQty holds a value the fields before it leave off the wire" : "allocQty holds no value, though the fields before it put it on the wire");
        }
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (openClosePresent() != openClose.hasValue()) {
            throw new IllegalStateException(openClose.hasValue() ? "openClose holds a value the fields before it leave off the wire" : "openClose holds no value, though the fields before it put it on the wire");
        }
        if (giveUpFirmIdPresent() != giveUpFirmId.hasValue()) {
            throw new IllegalStateException(giveUpFirmId.hasValue() ? "giveUpFirmId holds a value the fields before it leave off the wire" : "giveUpFirmId holds no value, though the fields before it put it on the wire");
        }
        if (accountPresent() != account.hasValue()) {
            throw new IllegalStateException(account.hasValue() ? "account holds a value the fields before it leave off the wire" : "account holds no value, though the fields before it put it on the wire");
        }
        if (cmtaNumberPresent() != cmtaNumber.hasValue()) {
            throw new IllegalStateException(cmtaNumber.hasValue() ? "cmtaNumber holds a value the fields before it leave off the wire" : "cmtaNumber holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        if (sidePresent()) {
            cursor = side.encode(data, cursor);
        }
        if (allocQtyPresent()) {
            cursor = allocQty.encode(data, cursor);
        }
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        if (openClosePresent()) {
            cursor = openClose.encode(data, cursor);
        }
        if (giveUpFirmIdPresent()) {
            cursor = giveUpFirmId.encode(data, cursor);
        }
        if (accountPresent()) {
            cursor = account.encode(data, cursor);
        }
        if (cmtaNumberPresent()) {
            cursor = cmtaNumber.encode(data, cursor);
        }
        cursor = clearingAccount.encode(data, cursor);
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
        this.crossOrderCancelledReturnBitfield1InputKnown = crossOrderCancelledReturnBitfield1InputGiven;
        this.crossOrderCancelledReturnBitfield10InputKnown = crossOrderCancelledReturnBitfield10InputGiven;
        this.crossOrderCancelledReturnBitfield2InputKnown = crossOrderCancelledReturnBitfield2InputGiven;
        this.crossOrderCancelledReturnBitfield4InputKnown = crossOrderCancelledReturnBitfield4InputGiven;
        this.crossOrderCancelledReturnBitfield3InputKnown = crossOrderCancelledReturnBitfield3InputGiven;
        this.crossOrderCancelledReturnBitfield9InputKnown = crossOrderCancelledReturnBitfield9InputGiven;
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderId" -> Optional.of(orderId);
            case "Side" -> Optional.of(side);
            case "AllocQty" -> Optional.of(allocQty);
            case "Capacity" -> Optional.of(capacity);
            case "OpenClose" -> Optional.of(openClose);
            case "GiveUpFirmId" -> Optional.of(giveUpFirmId);
            case "Account" -> Optional.of(account);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof CrossOrderCancelledOrderAllocationsEntry message)) {
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
        if (!(other instanceof CrossOrderCancelledOrderAllocationsEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
