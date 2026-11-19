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
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ClearingOptionalDataField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.CmtaNumberField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.FrequentTraderIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.GiveUpFirmIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.OpenCloseField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.SideField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.types.GroupEntry;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * One entry of the OrderAllocations repeating group.
 *
 * <p>Repeating group stated GroupCnt times.</p>
 */
public final class OrderAllocationsEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 31;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "OrderAllocations";

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
     * Clearing Optional Data
     */
    private final ClearingOptionalDataField clearingOptionalData = new ClearingOptionalDataField();

    /**
     * Frequent Trader Id
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(side, allocQty, clOrdId, capacity, openClose, giveUpFirmId, account, cmtaNumber, clearingAccount, clearingOptionalData, frequentTraderId);

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
     * Clearing Optional Data
     *
     * @return the ClearingOptionalData field
     */
    public ClearingOptionalDataField clearingOptionalData() {
        return clearingOptionalData;
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
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 2L) && (newOrderCrossBitfield2InputKnown && ((newOrderCrossBitfield2Input >>> 3) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 2L) && (newOrderCrossBitfield2InputKnown && ((newOrderCrossBitfield2Input >>> 4) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 2L) && (newOrderCrossBitfield2InputKnown && ((newOrderCrossBitfield2Input >>> 5) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ClearingOptionalData put it on the wire.
     *
     * <p>Decode reads the ClearingOptionalData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingOptionalData is on the wire
     */
    public boolean clearingOptionalDataPresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 2L) && (newOrderCrossBitfield2InputKnown && ((newOrderCrossBitfield2Input >>> 7) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 4L) && (newOrderCrossBitfield4InputKnown && ((newOrderCrossBitfield4Input >>> 2) & 0x1L) > 0L);
    }

    private boolean onWire(Field field) {
        return (field != account || accountPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != clearingOptionalData || clearingOptionalDataPresent()) && (field != frequentTraderId || frequentTraderIdPresent());
    }

    private long numberOfNewOrderCrossBitfieldsInput;

    private boolean numberOfNewOrderCrossBitfieldsInputGiven;

    private boolean numberOfNewOrderCrossBitfieldsInputKnown;

    /**
     * Gives this message the NumberOfNewOrderCrossBitfields that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NumberOfNewOrderCrossBitfields
     */
    public void numberOfNewOrderCrossBitfieldsInput(long value) {
        this.numberOfNewOrderCrossBitfieldsInput = value;
        this.numberOfNewOrderCrossBitfieldsInputGiven = true;
        this.numberOfNewOrderCrossBitfieldsInputKnown = true;
    }

    /**
     * Gives this entry the NumberOfNewOrderCrossBitfields its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NumberOfNewOrderCrossBitfields, or empty
     */
    public void numberOfNewOrderCrossBitfieldsInput(OptionalLong value) {
        this.numberOfNewOrderCrossBitfieldsInput = value.orElse(0L);
        this.numberOfNewOrderCrossBitfieldsInputGiven = value.isPresent();
        this.numberOfNewOrderCrossBitfieldsInputKnown = value.isPresent();
    }

    /**
     * Returns the NumberOfNewOrderCrossBitfields this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NumberOfNewOrderCrossBitfields, or empty when none is given or known
     */
    public OptionalLong numberOfNewOrderCrossBitfieldsInput() {
        return numberOfNewOrderCrossBitfieldsInputKnown ? OptionalLong.of(numberOfNewOrderCrossBitfieldsInput) : OptionalLong.empty();
    }

    private long newOrderCrossBitfield2Input;

    private boolean newOrderCrossBitfield2InputGiven;

    private boolean newOrderCrossBitfield2InputKnown;

    /**
     * Gives this message the NewOrderCrossBitfield2 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NewOrderCrossBitfield2
     */
    public void newOrderCrossBitfield2Input(long value) {
        this.newOrderCrossBitfield2Input = value;
        this.newOrderCrossBitfield2InputGiven = true;
        this.newOrderCrossBitfield2InputKnown = true;
    }

    /**
     * Gives this entry the NewOrderCrossBitfield2 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NewOrderCrossBitfield2, or empty
     */
    public void newOrderCrossBitfield2Input(OptionalLong value) {
        this.newOrderCrossBitfield2Input = value.orElse(0L);
        this.newOrderCrossBitfield2InputGiven = value.isPresent();
        this.newOrderCrossBitfield2InputKnown = value.isPresent();
    }

    /**
     * Returns the NewOrderCrossBitfield2 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NewOrderCrossBitfield2, or empty when none is given or known
     */
    public OptionalLong newOrderCrossBitfield2Input() {
        return newOrderCrossBitfield2InputKnown ? OptionalLong.of(newOrderCrossBitfield2Input) : OptionalLong.empty();
    }

    private long newOrderCrossBitfield4Input;

    private boolean newOrderCrossBitfield4InputGiven;

    private boolean newOrderCrossBitfield4InputKnown;

    /**
     * Gives this message the NewOrderCrossBitfield4 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NewOrderCrossBitfield4
     */
    public void newOrderCrossBitfield4Input(long value) {
        this.newOrderCrossBitfield4Input = value;
        this.newOrderCrossBitfield4InputGiven = true;
        this.newOrderCrossBitfield4InputKnown = true;
    }

    /**
     * Gives this entry the NewOrderCrossBitfield4 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NewOrderCrossBitfield4, or empty
     */
    public void newOrderCrossBitfield4Input(OptionalLong value) {
        this.newOrderCrossBitfield4Input = value.orElse(0L);
        this.newOrderCrossBitfield4InputGiven = value.isPresent();
        this.newOrderCrossBitfield4InputKnown = value.isPresent();
    }

    /**
     * Returns the NewOrderCrossBitfield4 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NewOrderCrossBitfield4, or empty when none is given or known
     */
    public OptionalLong newOrderCrossBitfield4Input() {
        return newOrderCrossBitfield4InputKnown ? OptionalLong.of(newOrderCrossBitfield4Input) : OptionalLong.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (clearingOptionalDataPresent() ? ClearingOptionalDataField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0);
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
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!giveUpFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += GiveUpFirmIdField.BYTE_LENGTH;
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
        if (frequentTraderIdPresent()) {
            if (end - cursor < FrequentTraderIdField.BYTE_LENGTH || !frequentTraderId.parse(data, cursor)) {
                return false;
            }
            cursor += FrequentTraderIdField.BYTE_LENGTH;
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
        if (frequentTraderIdPresent() != frequentTraderId.hasValue()) {
            throw new IllegalStateException(frequentTraderId.hasValue() ? "frequentTraderId holds a value the fields before it leave off the wire" : "frequentTraderId holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = side.encode(data, cursor);
        cursor = allocQty.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = giveUpFirmId.encode(data, cursor);
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
        if (frequentTraderIdPresent()) {
            cursor = frequentTraderId.encode(data, cursor);
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
        this.numberOfNewOrderCrossBitfieldsInputKnown = numberOfNewOrderCrossBitfieldsInputGiven;
        this.newOrderCrossBitfield2InputKnown = newOrderCrossBitfield2InputGiven;
        this.newOrderCrossBitfield4InputKnown = newOrderCrossBitfield4InputGiven;
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
            case "OpenClose" -> Optional.of(openClose);
            case "GiveUpFirmId" -> Optional.of(giveUpFirmId);
            case "Account" -> Optional.of(account);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "ClearingOptionalData" -> Optional.of(clearingOptionalData);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof OrderAllocationsEntry message)) {
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
        if (!(other instanceof OrderAllocationsEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
