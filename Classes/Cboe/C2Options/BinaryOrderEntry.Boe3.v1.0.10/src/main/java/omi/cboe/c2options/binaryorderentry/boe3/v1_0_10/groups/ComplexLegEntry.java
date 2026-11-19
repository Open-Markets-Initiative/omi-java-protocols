package omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.fields.CfiCodeField;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.fields.MaturityDateField;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.fields.RatioQtyField;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.fields.SideField;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.fields.StrikePriceField;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.fields.SymbolField;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.types.Field;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.types.GroupEntry;
import omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.types.PrintOptions;

/**
 * One entry of the ComplexLeg repeating group.
 *
 * <p>Complex Leg</p>
 */
public final class ComplexLegEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 27;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "ComplexLeg";

    /**
     * Entire Cboe format symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * When sending Cboe native symbology, set MaturityDate to zero
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Strike Price for option
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * CFI Code for leg
     */
    private final CfiCodeField cfiCode = new CfiCodeField();

    /**
     * Integer ratio of a complex leg with respect to the other legs of a
     */
    private final RatioQtyField ratioQty = new RatioQtyField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbol, maturityDate, strikePrice, cfiCode, ratioQty, side);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Entire Cboe format symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * When sending Cboe native symbology, set MaturityDate to zero
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Strike Price for option
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * CFI Code for leg
     *
     * @return the CfiCode field
     */
    public CfiCodeField cfiCode() {
        return cfiCode;
    }

    /**
     * Integer ratio of a complex leg with respect to the other legs of a
     *
     * @return the RatioQty field
     */
    public RatioQtyField ratioQty() {
        return ratioQty;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!cfiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CfiCodeField.BYTE_LENGTH;
        if (!ratioQty.parse(data, cursor)) {
            return false;
        }
        cursor += RatioQtyField.BYTE_LENGTH;
        return side.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = symbol.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = cfiCode.encode(data, cursor);
        cursor = ratioQty.encode(data, cursor);
        cursor = side.encode(data, cursor);
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
            case "Symbol" -> Optional.of(symbol);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "CfiCode" -> Optional.of(cfiCode);
            case "RatioQty" -> Optional.of(ratioQty);
            case "Side" -> Optional.of(side);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof ComplexLegEntry message)) {
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
        if (!(other instanceof ComplexLegEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
