package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.AllOrdersProhibitionField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.structs.MarginTransactionsProhibition;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.structs.NewOrdersProhibition;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.structs.ShortSellingProhibition;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.types.Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.types.GroupEntry;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.types.PrintOptions;

/**
 * The OrderProhibitionStatusAtTheRegularDistribution record a message holds.
 *
 * <p>Order Prohibition Status (at the regular distribution)</p>
 */
public final class OrderProhibitionStatusAtTheRegularDistribution implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 10;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "OrderProhibitionStatusAtTheRegularDistribution";

    /**
     * Indicates the prohibition status for all orders including modification and cancel orders.
     */
    private final AllOrdersProhibitionField allOrdersProhibition = new AllOrdersProhibitionField();

    /**
     * New Orders Prohibition
     */
    private final NewOrdersProhibition newOrdersProhibition = new NewOrdersProhibition();

    /**
     * Margin Transactions Prohibition
     */
    private final MarginTransactionsProhibition marginTransactionsProhibition = new MarginTransactionsProhibition();

    /**
     * Short Selling Prohibition
     */
    private final ShortSellingProhibition shortSellingProhibition = new ShortSellingProhibition();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(newOrdersProhibition.fields(), marginTransactionsProhibition.fields(), shortSellingProhibition.fields(), List.<Field>of(allOrdersProhibition)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Indicates the prohibition status for all orders including modification and cancel orders.
     *
     * @return the AllOrdersProhibition field
     */
    public AllOrdersProhibitionField allOrdersProhibition() {
        return allOrdersProhibition;
    }

    /**
     * New Orders Prohibition
     *
     * @return the NewOrdersProhibition record
     */
    public NewOrdersProhibition newOrdersProhibition() {
        return newOrdersProhibition;
    }

    /**
     * Margin Transactions Prohibition
     *
     * @return the MarginTransactionsProhibition record
     */
    public MarginTransactionsProhibition marginTransactionsProhibition() {
        return marginTransactionsProhibition;
    }

    /**
     * Short Selling Prohibition
     *
     * @return the ShortSellingProhibition record
     */
    public ShortSellingProhibition shortSellingProhibition() {
        return shortSellingProhibition;
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
        if (!newOrdersProhibition.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += newOrdersProhibition.byteLength();
        if (!marginTransactionsProhibition.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += marginTransactionsProhibition.byteLength();
        if (!shortSellingProhibition.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += shortSellingProhibition.byteLength();
        return allOrdersProhibition.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = newOrdersProhibition.encode(data, cursor);
        cursor = marginTransactionsProhibition.encode(data, cursor);
        cursor = shortSellingProhibition.encode(data, cursor);
        cursor = allOrdersProhibition.encode(data, cursor);
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
        newOrdersProhibition.clear();
        marginTransactionsProhibition.clear();
        shortSellingProhibition.clear();
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
        return "AllOrdersProhibition".equals(name) ? Optional.of(allOrdersProhibition) : Optional.empty();
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof OrderProhibitionStatusAtTheRegularDistribution message)) {
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
        if (!(other instanceof OrderProhibitionStatusAtTheRegularDistribution message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
