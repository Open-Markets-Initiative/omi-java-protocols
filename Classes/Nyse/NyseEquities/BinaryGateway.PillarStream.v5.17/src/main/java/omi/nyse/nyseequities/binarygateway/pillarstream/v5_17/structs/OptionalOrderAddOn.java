package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.DeliverToCompIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.EffectiveTimeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.LocateBrokerField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.MaxFloorField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.OffsetPriceField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.structs.SubMsgHeader;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.GroupEntry;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.PrintOptions;

/**
 * The OptionalOrderAddOn record a message holds.
 *
 * <p>OptionalOrderAddOn</p>
 */
public final class OptionalOrderAddOn implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 41;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "OptionalOrderAddOn";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 17, 8 };

    /**
     * Not applicable.
     */
    private final DeliverToCompIdField deliverToCompId = new DeliverToCompIdField();

    /**
     * 0 = No MaxFloor
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * For orders with Side of Sell Short, Sell Short Exempt, Cross Short, and Cross Short Exempt, identifies which broker has loaned the stock to settle the short sale.
     */
    private final LocateBrokerField locateBroker = new LocateBrokerField();

    /**
     * 0 = No OffsetPrice. Otherwise, value must be: - For Market Peg order - equal to or multiple of 0.01 - For Retail Price Improvement order (optional modifier on NYSE only) - equal to or multiple of 0.001
     */
    private final OffsetPriceField offsetPrice = new OffsetPriceField();

    /**
     * Reserved for future use
     */
    private final EffectiveTimeField effectiveTime = new EffectiveTimeField();

    /**
     * Pillar Stream Sub Message Item Header
     */
    private final SubMsgHeader subMsgHeader = new SubMsgHeader();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(subMsgHeader.fields(), List.<Field>of(deliverToCompId), List.<Field>of(maxFloor), List.<Field>of(locateBroker), List.<Field>of(offsetPrice), List.<Field>of(effectiveTime)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Not applicable.
     *
     * @return the DeliverToCompId field
     */
    public DeliverToCompIdField deliverToCompId() {
        return deliverToCompId;
    }

    /**
     * 0 = No MaxFloor
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
    }

    /**
     * For orders with Side of Sell Short, Sell Short Exempt, Cross Short, and Cross Short Exempt, identifies which broker has loaned the stock to settle the short sale.
     *
     * @return the LocateBroker field
     */
    public LocateBrokerField locateBroker() {
        return locateBroker;
    }

    /**
     * 0 = No OffsetPrice. Otherwise, value must be: - For Market Peg order - equal to or multiple of 0.01 - For Retail Price Improvement order (optional modifier on NYSE only) - equal to or multiple of 0.001
     *
     * @return the OffsetPrice field
     */
    public OffsetPriceField offsetPrice() {
        return offsetPrice;
    }

    /**
     * Reserved for future use
     *
     * @return the EffectiveTime field
     */
    public EffectiveTimeField effectiveTime() {
        return effectiveTime;
    }

    /**
     * Pillar Stream Sub Message Item Header
     *
     * @return the SubMsgHeader record
     */
    public SubMsgHeader subMsgHeader() {
        return subMsgHeader;
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
        if (!subMsgHeader.parseFrom(data, cursor, end - 37)) {
            return false;
        }
        cursor += subMsgHeader.byteLength();
        if (!deliverToCompId.parse(data, cursor)) {
            return false;
        }
        cursor += DeliverToCompIdField.BYTE_LENGTH;
        if (!maxFloor.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorField.BYTE_LENGTH;
        if (!locateBroker.parse(data, cursor)) {
            return false;
        }
        cursor += LocateBrokerField.BYTE_LENGTH;
        cursor += 8; // padding
        if (!offsetPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OffsetPriceField.BYTE_LENGTH;
        return effectiveTime.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = subMsgHeader.encode(data, cursor);
        cursor = deliverToCompId.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = locateBroker.encode(data, cursor);
        if (buffer != null && buffer.length >= 25) {
            System.arraycopy(buffer, 17, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = offsetPrice.encode(data, cursor);
        cursor = effectiveTime.encode(data, cursor);
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
        subMsgHeader.clear();
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
            case "DeliverToCompId" -> Optional.of(deliverToCompId);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "LocateBroker" -> Optional.of(locateBroker);
            case "OffsetPrice" -> Optional.of(offsetPrice);
            case "EffectiveTime" -> Optional.of(effectiveTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof OptionalOrderAddOn message)) {
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
        if (!(other instanceof OptionalOrderAddOn message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
