package omi.nasdaq.uqdf.output.utp.v1_5.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.BestAskMarketCenterField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.BestAskPriceField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.BestAskSizeField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.BestBidMarketCenterField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.BestBidPriceField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.BestBidSizeField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.NbboQuoteConditionField;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Field;
import omi.nasdaq.uqdf.output.utp.v1_5.types.GroupEntry;
import omi.nasdaq.uqdf.output.utp.v1_5.types.PrintOptions;

/**
 * The LongFormNationalBboAppendage record a message holds.
 *
 * <p>Long Form National BBO Appendage</p>
 */
public final class LongFormNationalBboAppendage implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 27;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "LongFormNationalBboAppendage";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * NBBO Quote Condition
     */
    private final NbboQuoteConditionField nbboQuoteCondition = new NbboQuoteConditionField();

    /**
     * Best Bid Market Center
     */
    private final BestBidMarketCenterField bestBidMarketCenter = new BestBidMarketCenterField();

    /**
     * Best Bid Price
     */
    private final BestBidPriceField bestBidPrice = new BestBidPriceField();

    /**
     * Best Bid Size
     */
    private final BestBidSizeField bestBidSize = new BestBidSizeField();

    /**
     * Best Ask Market Center
     */
    private final BestAskMarketCenterField bestAskMarketCenter = new BestAskMarketCenterField();

    /**
     * Best Ask Price
     */
    private final BestAskPriceField bestAskPrice = new BestAskPriceField();

    /**
     * Best Ask Size
     */
    private final BestAskSizeField bestAskSize = new BestAskSizeField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(nbboQuoteCondition, bestBidMarketCenter, bestBidPrice, bestBidSize, bestAskMarketCenter, bestAskPrice, bestAskSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * NBBO Quote Condition
     *
     * @return the NbboQuoteCondition field
     */
    public NbboQuoteConditionField nbboQuoteCondition() {
        return nbboQuoteCondition;
    }

    /**
     * Best Bid Market Center
     *
     * @return the BestBidMarketCenter field
     */
    public BestBidMarketCenterField bestBidMarketCenter() {
        return bestBidMarketCenter;
    }

    /**
     * Best Bid Price
     *
     * @return the BestBidPrice field
     */
    public BestBidPriceField bestBidPrice() {
        return bestBidPrice;
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
     * Best Ask Market Center
     *
     * @return the BestAskMarketCenter field
     */
    public BestAskMarketCenterField bestAskMarketCenter() {
        return bestAskMarketCenter;
    }

    /**
     * Best Ask Price
     *
     * @return the BestAskPrice field
     */
    public BestAskPriceField bestAskPrice() {
        return bestAskPrice;
    }

    /**
     * Best Ask Size
     *
     * @return the BestAskSize field
     */
    public BestAskSizeField bestAskSize() {
        return bestAskSize;
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
        if (!nbboQuoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += NbboQuoteConditionField.BYTE_LENGTH;
        if (!bestBidMarketCenter.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidMarketCenterField.BYTE_LENGTH;
        if (!bestBidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidPriceField.BYTE_LENGTH;
        if (!bestBidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidSizeField.BYTE_LENGTH;
        if (!bestAskMarketCenter.parse(data, cursor)) {
            return false;
        }
        cursor += BestAskMarketCenterField.BYTE_LENGTH;
        if (!bestAskPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BestAskPriceField.BYTE_LENGTH;
        if (!bestAskSize.parse(data, cursor)) {
            return false;
        }
        cursor += BestAskSizeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nbboQuoteCondition.encode(data, cursor);
        cursor = bestBidMarketCenter.encode(data, cursor);
        cursor = bestBidPrice.encode(data, cursor);
        cursor = bestBidSize.encode(data, cursor);
        cursor = bestAskMarketCenter.encode(data, cursor);
        cursor = bestAskPrice.encode(data, cursor);
        cursor = bestAskSize.encode(data, cursor);
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
            case "NbboQuoteCondition" -> Optional.of(nbboQuoteCondition);
            case "BestBidMarketCenter" -> Optional.of(bestBidMarketCenter);
            case "BestBidPrice" -> Optional.of(bestBidPrice);
            case "BestBidSize" -> Optional.of(bestBidSize);
            case "BestAskMarketCenter" -> Optional.of(bestAskMarketCenter);
            case "BestAskPrice" -> Optional.of(bestAskPrice);
            case "BestAskSize" -> Optional.of(bestAskSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof LongFormNationalBboAppendage message)) {
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
        if (!(other instanceof LongFormNationalBboAppendage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
