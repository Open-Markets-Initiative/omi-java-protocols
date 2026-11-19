package omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.AccountField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.AllocQtyField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.CapacityField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ClOrdIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ClearingAccountField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ClearingOptionalDataField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.CmtaNumberField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.FrequentTraderIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.GiveUpFirmIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.OpenCloseField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.SideField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.Field;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.GroupEntry;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.PrintOptions;

/**
 * One entry of the Allocation repeating group.
 *
 * <p>Allocation</p>
 */
public final class AllocationEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 77;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "Allocation";

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Number of contracts for this party
     */
    private final AllocQtyField allocQty = new AllocQtyField();

    /**
     * ID chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * The capacity of the order
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Indicates status of member position in the option
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * For the Agency Side, this field must equal the value of ClearingFirm
     */
    private final GiveUpFirmIdField giveUpFirmId = new GiveUpFirmIdField();

    /**
     * Reflected back on execution reports associated with this order
     */
    private final AccountField account = new AccountField();

    /**
     * CMTA Number of the firm that will clear the trade
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * Corresponds to OnBehalfOfSubID (116) and ClearingAccount (440) in
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Clearing optional data
     */
    private final ClearingOptionalDataField clearingOptionalData = new ClearingOptionalDataField();

    /**
     * Identifies the frequent trader program in which the order is participating
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(side, allocQty, clOrdId, capacity, openClose, giveUpFirmId, account, cmtaNumber, clearingAccount, clearingOptionalData, frequentTraderId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Number of contracts for this party
     *
     * @return the AllocQty field
     */
    public AllocQtyField allocQty() {
        return allocQty;
    }

    /**
     * ID chosen by the client
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * The capacity of the order
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Indicates status of member position in the option
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * For the Agency Side, this field must equal the value of ClearingFirm
     *
     * @return the GiveUpFirmId field
     */
    public GiveUpFirmIdField giveUpFirmId() {
        return giveUpFirmId;
    }

    /**
     * Reflected back on execution reports associated with this order
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * CMTA Number of the firm that will clear the trade
     *
     * @return the CmtaNumber field
     */
    public CmtaNumberField cmtaNumber() {
        return cmtaNumber;
    }

    /**
     * Corresponds to OnBehalfOfSubID (116) and ClearingAccount (440) in
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * Clearing optional data
     *
     * @return the ClearingOptionalData field
     */
    public ClearingOptionalDataField clearingOptionalData() {
        return clearingOptionalData;
    }

    /**
     * Identifies the frequent trader program in which the order is participating
     *
     * @return the FrequentTraderId field
     */
    public FrequentTraderIdField frequentTraderId() {
        return frequentTraderId;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
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
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!cmtaNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaNumberField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!clearingOptionalData.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingOptionalDataField.BYTE_LENGTH;
        return frequentTraderId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = side.encode(data, cursor);
        cursor = allocQty.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = giveUpFirmId.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = cmtaNumber.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = clearingOptionalData.encode(data, cursor);
        cursor = frequentTraderId.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
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
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
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
        return fields;
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
        if (!(other instanceof AllocationEntry message)) {
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

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
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
        if (!(other instanceof AllocationEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
