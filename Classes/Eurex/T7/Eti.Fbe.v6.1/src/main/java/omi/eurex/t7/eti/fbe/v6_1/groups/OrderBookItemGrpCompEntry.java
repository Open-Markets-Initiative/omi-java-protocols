package omi.eurex.t7.eti.fbe.v6_1.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eti.fbe.v6_1.fields.BestBidPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.BestBidSizeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.BestOfferPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.BestOfferSizeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MdBookTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MdSubBookTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.GroupEntry;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * One entry of the OrderBookItemGrpComp repeating group.
 *
 * <p>Order Book Item Grp Comp</p>
 */
public final class OrderBookItemGrpCompEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 40;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "OrderBookItemGrpComp";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 34, 6 };

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Best Bid Px
     */
    private final BestBidPxField bestBidPx = new BestBidPxField();

    /**
     * Best Offer Px
     */
    private final BestOfferPxField bestOfferPx = new BestOfferPxField();

    /**
     * Best Bid Size
     */
    private final BestBidSizeField bestBidSize = new BestBidSizeField();

    /**
     * Best Offer Size
     */
    private final BestOfferSizeField bestOfferSize = new BestOfferSizeField();

    /**
     * Md Book Type
     */
    private final MdBookTypeField mdBookType = new MdBookTypeField();

    /**
     * Md Sub Book Type
     */
    private final MdSubBookTypeField mdSubBookType = new MdSubBookTypeField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, bestBidPx, bestOfferPx, bestBidSize, bestOfferSize, mdBookType, mdSubBookType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Best Bid Px
     *
     * @return the BestBidPx field
     */
    public BestBidPxField bestBidPx() {
        return bestBidPx;
    }

    /**
     * Best Offer Px
     *
     * @return the BestOfferPx field
     */
    public BestOfferPxField bestOfferPx() {
        return bestOfferPx;
    }

    /**
     * Best Bid Size
     *
     * @return the BestBidSize field
     */
    public BestBidSizeField bestBidSize() {
        return bestBidSize;
    }

    /**
     * Best Offer Size
     *
     * @return the BestOfferSize field
     */
    public BestOfferSizeField bestOfferSize() {
        return bestOfferSize;
    }

    /**
     * Md Book Type
     *
     * @return the MdBookType field
     */
    public MdBookTypeField mdBookType() {
        return mdBookType;
    }

    /**
     * Md Sub Book Type
     *
     * @return the MdSubBookType field
     */
    public MdSubBookTypeField mdSubBookType() {
        return mdSubBookType;
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!bestBidPx.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidPxField.BYTE_LENGTH;
        if (!bestOfferPx.parse(data, cursor)) {
            return false;
        }
        cursor += BestOfferPxField.BYTE_LENGTH;
        if (!bestBidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidSizeField.BYTE_LENGTH;
        if (!bestOfferSize.parse(data, cursor)) {
            return false;
        }
        cursor += BestOfferSizeField.BYTE_LENGTH;
        if (!mdBookType.parse(data, cursor)) {
            return false;
        }
        cursor += MdBookTypeField.BYTE_LENGTH;
        if (!mdSubBookType.parse(data, cursor)) {
            return false;
        }
        cursor += MdSubBookTypeField.BYTE_LENGTH;
        cursor += 6; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = bestBidPx.encode(data, cursor);
        cursor = bestOfferPx.encode(data, cursor);
        cursor = bestBidSize.encode(data, cursor);
        cursor = bestOfferSize.encode(data, cursor);
        cursor = mdBookType.encode(data, cursor);
        cursor = mdSubBookType.encode(data, cursor);
        if (buffer != null && buffer.length >= 34 + 6) {
            System.arraycopy(buffer, 34, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
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
            case "SecurityId" -> Optional.of(securityId);
            case "BestBidPx" -> Optional.of(bestBidPx);
            case "BestOfferPx" -> Optional.of(bestOfferPx);
            case "BestBidSize" -> Optional.of(bestBidSize);
            case "BestOfferSize" -> Optional.of(bestOfferSize);
            case "MdBookType" -> Optional.of(mdBookType);
            case "MdSubBookType" -> Optional.of(mdSubBookType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof OrderBookItemGrpCompEntry message)) {
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
        if (!(other instanceof OrderBookItemGrpCompEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
