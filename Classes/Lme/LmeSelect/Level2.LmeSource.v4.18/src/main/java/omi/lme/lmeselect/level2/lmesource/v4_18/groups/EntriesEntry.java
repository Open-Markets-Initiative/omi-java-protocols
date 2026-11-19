package omi.lme.lmeselect.level2.lmesource.v4_18.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.AggregateVolumeField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.BuySellField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.NumberOfExplicitOrdersField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.NumberOfImpliedOrdersField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.PriceField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.PriceLevelField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.TotalQtyOfExplicitOrdersField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.TotalQtyOfImpliedOrdersField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.UpdateActionField;
import omi.lme.lmeselect.level2.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.level2.lmesource.v4_18.types.GroupEntry;
import omi.lme.lmeselect.level2.lmesource.v4_18.types.PrintOptions;

/**
 * One entry of the Entries repeating group.
 *
 * <p>One aggregate order book entry, giving the aggregated state of one price level on one side</p>
 */
public final class EntriesEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 43;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "Entries";

    /**
     * Total quantity of orders in this price level and side.
     */
    private final AggregateVolumeField aggregateVolume = new AggregateVolumeField();

    /**
     * The price of the trade. For TaS and TaR either the differential or the substituted price. Null for a strategy from a non-electronic venue. Implicit six decimal place format.
     */
    private final PriceField price = new PriceField();

    /**
     * Number of explicit orders in this price level and side.
     */
    private final NumberOfExplicitOrdersField numberOfExplicitOrders = new NumberOfExplicitOrdersField();

    /**
     * Total quantity of explicit orders in this price level and side.
     */
    private final TotalQtyOfExplicitOrdersField totalQtyOfExplicitOrders = new TotalQtyOfExplicitOrdersField();

    /**
     * Number of implied orders in this price level and side.
     */
    private final NumberOfImpliedOrdersField numberOfImpliedOrders = new NumberOfImpliedOrdersField();

    /**
     * Total quantity of implied orders in this price level and side.
     */
    private final TotalQtyOfImpliedOrdersField totalQtyOfImpliedOrders = new TotalQtyOfImpliedOrdersField();

    /**
     * Side of order. Null for a two sided quote.
     */
    private final BuySellField buySell = new BuySellField();

    /**
     * Indicates the price level, within the top fifteen, of the information carried in the message.
     */
    private final PriceLevelField priceLevel = new PriceLevelField();

    /**
     * Type of market data update action.
     */
    private final UpdateActionField updateAction = new UpdateActionField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(aggregateVolume, price, numberOfExplicitOrders, totalQtyOfExplicitOrders, numberOfImpliedOrders, totalQtyOfImpliedOrders, buySell, priceLevel, updateAction);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Total quantity of orders in this price level and side.
     *
     * @return the AggregateVolume field
     */
    public AggregateVolumeField aggregateVolume() {
        return aggregateVolume;
    }

    /**
     * The price of the trade. For TaS and TaR either the differential or the substituted price. Null for a strategy from a non-electronic venue. Implicit six decimal place format.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Number of explicit orders in this price level and side.
     *
     * @return the NumberOfExplicitOrders field
     */
    public NumberOfExplicitOrdersField numberOfExplicitOrders() {
        return numberOfExplicitOrders;
    }

    /**
     * Total quantity of explicit orders in this price level and side.
     *
     * @return the TotalQtyOfExplicitOrders field
     */
    public TotalQtyOfExplicitOrdersField totalQtyOfExplicitOrders() {
        return totalQtyOfExplicitOrders;
    }

    /**
     * Number of implied orders in this price level and side.
     *
     * @return the NumberOfImpliedOrders field
     */
    public NumberOfImpliedOrdersField numberOfImpliedOrders() {
        return numberOfImpliedOrders;
    }

    /**
     * Total quantity of implied orders in this price level and side.
     *
     * @return the TotalQtyOfImpliedOrders field
     */
    public TotalQtyOfImpliedOrdersField totalQtyOfImpliedOrders() {
        return totalQtyOfImpliedOrders;
    }

    /**
     * Side of order. Null for a two sided quote.
     *
     * @return the BuySell field
     */
    public BuySellField buySell() {
        return buySell;
    }

    /**
     * Indicates the price level, within the top fifteen, of the information carried in the message.
     *
     * @return the PriceLevel field
     */
    public PriceLevelField priceLevel() {
        return priceLevel;
    }

    /**
     * Type of market data update action.
     *
     * @return the UpdateAction field
     */
    public UpdateActionField updateAction() {
        return updateAction;
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
        if (!aggregateVolume.parse(data, cursor)) {
            return false;
        }
        cursor += AggregateVolumeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!numberOfExplicitOrders.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfExplicitOrdersField.BYTE_LENGTH;
        if (!totalQtyOfExplicitOrders.parse(data, cursor)) {
            return false;
        }
        cursor += TotalQtyOfExplicitOrdersField.BYTE_LENGTH;
        if (!numberOfImpliedOrders.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfImpliedOrdersField.BYTE_LENGTH;
        if (!totalQtyOfImpliedOrders.parse(data, cursor)) {
            return false;
        }
        cursor += TotalQtyOfImpliedOrdersField.BYTE_LENGTH;
        if (!buySell.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellField.BYTE_LENGTH;
        if (!priceLevel.parse(data, cursor)) {
            return false;
        }
        cursor += PriceLevelField.BYTE_LENGTH;
        return updateAction.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = aggregateVolume.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = numberOfExplicitOrders.encode(data, cursor);
        cursor = totalQtyOfExplicitOrders.encode(data, cursor);
        cursor = numberOfImpliedOrders.encode(data, cursor);
        cursor = totalQtyOfImpliedOrders.encode(data, cursor);
        cursor = buySell.encode(data, cursor);
        cursor = priceLevel.encode(data, cursor);
        cursor = updateAction.encode(data, cursor);
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
            case "AggregateVolume" -> Optional.of(aggregateVolume);
            case "Price" -> Optional.of(price);
            case "NumberOfExplicitOrders" -> Optional.of(numberOfExplicitOrders);
            case "TotalQtyOfExplicitOrders" -> Optional.of(totalQtyOfExplicitOrders);
            case "NumberOfImpliedOrders" -> Optional.of(numberOfImpliedOrders);
            case "TotalQtyOfImpliedOrders" -> Optional.of(totalQtyOfImpliedOrders);
            case "BuySell" -> Optional.of(buySell);
            case "PriceLevel" -> Optional.of(priceLevel);
            case "UpdateAction" -> Optional.of(updateAction);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof EntriesEntry message)) {
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
        if (!(other instanceof EntriesEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
