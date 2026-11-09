package omi.eurex.t7.eti.fbe.v10_0.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eti.fbe.v10_0.fields.BasketSideTradeReportIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyContraFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyContraTraderField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartySubIdTypeField;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.GroupEntry;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * One entry of the BasketRootPartyGrpComp repeating group.
 *
 * <p>Basket Root Party Grp Comp</p>
 */
public final class BasketRootPartyGrpCompEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 40;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "BasketRootPartyGrpComp";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 33, 7 };

    /**
     * Root Party Sub Id Type
     */
    private final RootPartySubIdTypeField rootPartySubIdType = new RootPartySubIdTypeField();

    /**
     * Root Party Contra Firm
     */
    private final RootPartyContraFirmField rootPartyContraFirm = new RootPartyContraFirmField();

    /**
     * Root Party Contra Trader
     */
    private final RootPartyContraTraderField rootPartyContraTrader = new RootPartyContraTraderField();

    /**
     * Basket Side Trade Report Id
     */
    private final BasketSideTradeReportIdField basketSideTradeReportId = new BasketSideTradeReportIdField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(rootPartySubIdType, rootPartyContraFirm, rootPartyContraTrader, basketSideTradeReportId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Root Party Sub Id Type
     *
     * @return the RootPartySubIdType field
     */
    public RootPartySubIdTypeField rootPartySubIdType() {
        return rootPartySubIdType;
    }

    /**
     * Root Party Contra Firm
     *
     * @return the RootPartyContraFirm field
     */
    public RootPartyContraFirmField rootPartyContraFirm() {
        return rootPartyContraFirm;
    }

    /**
     * Root Party Contra Trader
     *
     * @return the RootPartyContraTrader field
     */
    public RootPartyContraTraderField rootPartyContraTrader() {
        return rootPartyContraTrader;
    }

    /**
     * Basket Side Trade Report Id
     *
     * @return the BasketSideTradeReportId field
     */
    public BasketSideTradeReportIdField basketSideTradeReportId() {
        return basketSideTradeReportId;
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
        return PADDING.clone();
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
        if (!rootPartySubIdType.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartySubIdTypeField.BYTE_LENGTH;
        if (!rootPartyContraFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyContraFirmField.BYTE_LENGTH;
        if (!rootPartyContraTrader.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyContraTraderField.BYTE_LENGTH;
        if (!basketSideTradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += BasketSideTradeReportIdField.BYTE_LENGTH;
        cursor += 7; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = rootPartySubIdType.encode(data, cursor);
        cursor = rootPartyContraFirm.encode(data, cursor);
        cursor = rootPartyContraTrader.encode(data, cursor);
        cursor = basketSideTradeReportId.encode(data, cursor);
        if (buffer != null && buffer.length >= 33 + 7) {
            System.arraycopy(buffer, 33, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
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
            case "RootPartySubIdType" -> Optional.of(rootPartySubIdType);
            case "RootPartyContraFirm" -> Optional.of(rootPartyContraFirm);
            case "RootPartyContraTrader" -> Optional.of(rootPartyContraTrader);
            case "BasketSideTradeReportId" -> Optional.of(basketSideTradeReportId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof BasketRootPartyGrpCompEntry message)) {
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
        if (!(other instanceof BasketRootPartyGrpCompEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
