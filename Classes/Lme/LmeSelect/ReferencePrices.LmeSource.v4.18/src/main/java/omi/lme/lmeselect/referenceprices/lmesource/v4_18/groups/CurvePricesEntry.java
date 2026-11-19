package omi.lme.lmeselect.referenceprices.lmesource.v4_18.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.fields.PriceField;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.fields.PromptDate1Field;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.fields.PromptDate2Field;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.fields.PromptDateLabel1Field;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.fields.PromptDateLabel2Field;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.types.GroupEntry;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.types.PrintOptions;

/**
 * One entry of the CurvePrices repeating group.
 *
 * <p>One forward curve reference price and the prompt date or dates it relates to. The specification's length formula names the repeat NumPrices, a field no table of this message declares; RecordCount is the count it gives, as the number of reference prices in this message</p>
 */
public final class CurvePricesEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 28;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "CurvePrices";

    /**
     * A reference price, in implicit six decimal place format. For an Average represents the mean of bid ask averages.
     */
    private final PriceField price = new PriceField();

    /**
     * The date to which the price relates, as YYYYMMDD. For a spread this is the first leg.
     */
    private final PromptDate1Field promptDate1 = new PromptDate1Field();

    /**
     * The label representing date1. Not applicable for all dates.
     */
    private final PromptDateLabel1Field promptDateLabel1 = new PromptDateLabel1Field();

    /**
     * The date to which the price relates, as YYYYMMDD. For a spread this is the second leg. Null if not applicable.
     */
    private final PromptDate2Field promptDate2 = new PromptDate2Field();

    /**
     * The label representing date2. For a spread the date label associated with the second leg, if there is one. Not applicable for all dates.
     */
    private final PromptDateLabel2Field promptDateLabel2 = new PromptDateLabel2Field();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(price, promptDate1, promptDateLabel1, promptDate2, promptDateLabel2);

    private byte[] buffer;

    private boolean decoded;

    /**
     * A reference price, in implicit six decimal place format. For an Average represents the mean of bid ask averages.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The date to which the price relates, as YYYYMMDD. For a spread this is the first leg.
     *
     * @return the PromptDate1 field
     */
    public PromptDate1Field promptDate1() {
        return promptDate1;
    }

    /**
     * The label representing date1. Not applicable for all dates.
     *
     * @return the PromptDateLabel1 field
     */
    public PromptDateLabel1Field promptDateLabel1() {
        return promptDateLabel1;
    }

    /**
     * The date to which the price relates, as YYYYMMDD. For a spread this is the second leg. Null if not applicable.
     *
     * @return the PromptDate2 field
     */
    public PromptDate2Field promptDate2() {
        return promptDate2;
    }

    /**
     * The label representing date2. For a spread the date label associated with the second leg, if there is one. Not applicable for all dates.
     *
     * @return the PromptDateLabel2 field
     */
    public PromptDateLabel2Field promptDateLabel2() {
        return promptDateLabel2;
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
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!promptDate1.parse(data, cursor)) {
            return false;
        }
        cursor += PromptDate1Field.BYTE_LENGTH;
        if (!promptDateLabel1.parse(data, cursor)) {
            return false;
        }
        cursor += PromptDateLabel1Field.BYTE_LENGTH;
        if (!promptDate2.parse(data, cursor)) {
            return false;
        }
        cursor += PromptDate2Field.BYTE_LENGTH;
        return promptDateLabel2.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = price.encode(data, cursor);
        cursor = promptDate1.encode(data, cursor);
        cursor = promptDateLabel1.encode(data, cursor);
        cursor = promptDate2.encode(data, cursor);
        cursor = promptDateLabel2.encode(data, cursor);
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
            case "Price" -> Optional.of(price);
            case "PromptDate1" -> Optional.of(promptDate1);
            case "PromptDateLabel1" -> Optional.of(promptDateLabel1);
            case "PromptDate2" -> Optional.of(promptDate2);
            case "PromptDateLabel2" -> Optional.of(promptDateLabel2);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof CurvePricesEntry message)) {
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
        if (!(other instanceof CurvePricesEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
