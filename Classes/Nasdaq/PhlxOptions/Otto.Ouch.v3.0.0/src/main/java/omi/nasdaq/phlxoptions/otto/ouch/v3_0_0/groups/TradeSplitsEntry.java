package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AllocQtyField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.CapacityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ClearingAccountField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.CmtaField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.CustAcctField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.OccAccountField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.OpenCloseField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.StockCapacityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.StockLegMpidField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Field;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.GroupEntry;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.PrintOptions;

/**
 * One entry of the TradeSplits repeating group.
 *
 * <p>Trade Splits [1..10] of Modify Trade: clearing configuration for each party the trade is being split into</p>
 */
public final class TradeSplitsEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 33;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "TradeSplits";

    /**
     * Quantity being allocated to the specified clearing configuration
     */
    private final AllocQtyField allocQty = new AllocQtyField();

    /**
     * CMTA
     */
    private final CmtaField cmta = new CmtaField();

    /**
     * Sub-account/MM Identifier at the registered exchange; all four characters will be provided to OCC
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * OCC # to use for clearing (give up)
     */
    private final OccAccountField occAccount = new OccAccountField();

    /**
     * Account on the customer system (pass-through)
     */
    private final CustAcctField custAcct = new CustAcctField();

    /**
     * Give-up for the stock leg
     */
    private final StockLegMpidField stockLegMpid = new StockLegMpidField();

    /**
     * See Order Capacity Field
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * O=Open, C=Closed, space=Carry Forward
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * P=Principal, A=Agency, R=Riskless Principal, space=Not Applicable
     */
    private final StockCapacityField stockCapacity = new StockCapacityField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(allocQty, cmta, clearingAccount, occAccount, custAcct, stockLegMpid, capacity, openClose, stockCapacity);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Quantity being allocated to the specified clearing configuration
     *
     * @return the AllocQty field
     */
    public AllocQtyField allocQty() {
        return allocQty;
    }

    /**
     * CMTA
     *
     * @return the Cmta field
     */
    public CmtaField cmta() {
        return cmta;
    }

    /**
     * Sub-account/MM Identifier at the registered exchange; all four characters will be provided to OCC
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * OCC # to use for clearing (give up)
     *
     * @return the OccAccount field
     */
    public OccAccountField occAccount() {
        return occAccount;
    }

    /**
     * Account on the customer system (pass-through)
     *
     * @return the CustAcct field
     */
    public CustAcctField custAcct() {
        return custAcct;
    }

    /**
     * Give-up for the stock leg
     *
     * @return the StockLegMpid field
     */
    public StockLegMpidField stockLegMpid() {
        return stockLegMpid;
    }

    /**
     * See Order Capacity Field
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * O=Open, C=Closed, space=Carry Forward
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * P=Principal, A=Agency, R=Riskless Principal, space=Not Applicable
     *
     * @return the StockCapacity field
     */
    public StockCapacityField stockCapacity() {
        return stockCapacity;
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
        if (!allocQty.parse(data, cursor)) {
            return false;
        }
        cursor += AllocQtyField.BYTE_LENGTH;
        if (!cmta.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!occAccount.parse(data, cursor)) {
            return false;
        }
        cursor += OccAccountField.BYTE_LENGTH;
        if (!custAcct.parse(data, cursor)) {
            return false;
        }
        cursor += CustAcctField.BYTE_LENGTH;
        if (!stockLegMpid.parse(data, cursor)) {
            return false;
        }
        cursor += StockLegMpidField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        return stockCapacity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = allocQty.encode(data, cursor);
        cursor = cmta.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = occAccount.encode(data, cursor);
        cursor = custAcct.encode(data, cursor);
        cursor = stockLegMpid.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = stockCapacity.encode(data, cursor);
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
            case "AllocQty" -> Optional.of(allocQty);
            case "Cmta" -> Optional.of(cmta);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "OccAccount" -> Optional.of(occAccount);
            case "CustAcct" -> Optional.of(custAcct);
            case "StockLegMpid" -> Optional.of(stockLegMpid);
            case "Capacity" -> Optional.of(capacity);
            case "OpenClose" -> Optional.of(openClose);
            case "StockCapacity" -> Optional.of(stockCapacity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof TradeSplitsEntry message)) {
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
        if (!(other instanceof TradeSplitsEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
