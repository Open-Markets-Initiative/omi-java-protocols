package omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.FirstLevelCustomerVolumeField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.FirstLevelPriceField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.FirstLevelVolumeField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.QuoteConditionField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.SecondLevelCustomerVolumeField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.SecondLevelPriceField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.SecondLevelVolumeField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.SeriesIndexField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.SourceNsField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.SourceTimeField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.SymbolSeqNumField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.ThirdLevelCustomerVolumeField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.ThirdLevelPriceField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.fields.ThirdLevelVolumeField;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.types.Field;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.types.Message;
import omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.types.PrintOptions;

/**
 * Represents the OutrightMarketDepthBuyMessage message from the DeepFeed protocol.
 *
 * <p>The Buy Market Depth message provides prices and aggregated volumes for each of the best three Buy levels.</p>
 */
public final class OutrightMarketDepthBuyMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 44;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Outright Market Depth Buy Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 35, 1, 42, 2 };

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * The nanosecond offset from the SourceTime.
     */
    private final SourceNsField sourceNs = new SourceNsField();

    /**
     * The unique ID of the symbol in the Series Index message
     */
    private final SeriesIndexField seriesIndex = new SeriesIndexField();

    /**
     * Sequence number of messages for the Outright options symbol.
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * Price of first buy level
     */
    private final FirstLevelPriceField firstLevelPrice = new FirstLevelPriceField();

    /**
     * Price of second buy level
     */
    private final SecondLevelPriceField secondLevelPrice = new SecondLevelPriceField();

    /**
     * Price of third buy level
     */
    private final ThirdLevelPriceField thirdLevelPrice = new ThirdLevelPriceField();

    /**
     * Total volume at first price level
     */
    private final FirstLevelVolumeField firstLevelVolume = new FirstLevelVolumeField();

    /**
     * Total volume at second price level
     */
    private final SecondLevelVolumeField secondLevelVolume = new SecondLevelVolumeField();

    /**
     * Total volume at third price level
     */
    private final ThirdLevelVolumeField thirdLevelVolume = new ThirdLevelVolumeField();

    /**
     * QuoteCondition values
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * Total volume of customer orders at the first level
     */
    private final FirstLevelCustomerVolumeField firstLevelCustomerVolume = new FirstLevelCustomerVolumeField();

    /**
     * Total volume of customer orders at the second level
     */
    private final SecondLevelCustomerVolumeField secondLevelCustomerVolume = new SecondLevelCustomerVolumeField();

    /**
     * Total volume of customer orders at the third level
     */
    private final ThirdLevelCustomerVolumeField thirdLevelCustomerVolume = new ThirdLevelCustomerVolumeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceNs, seriesIndex, symbolSeqNum, firstLevelPrice, secondLevelPrice, thirdLevelPrice, firstLevelVolume, secondLevelVolume, thirdLevelVolume, quoteCondition, firstLevelCustomerVolume, secondLevelCustomerVolume, thirdLevelCustomerVolume);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     *
     * @return the SourceTime field
     */
    public SourceTimeField sourceTime() {
        return sourceTime;
    }

    /**
     * The nanosecond offset from the SourceTime.
     *
     * @return the SourceNs field
     */
    public SourceNsField sourceNs() {
        return sourceNs;
    }

    /**
     * The unique ID of the symbol in the Series Index message
     *
     * @return the SeriesIndex field
     */
    public SeriesIndexField seriesIndex() {
        return seriesIndex;
    }

    /**
     * Sequence number of messages for the Outright options symbol.
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * Price of first buy level
     *
     * @return the FirstLevelPrice field
     */
    public FirstLevelPriceField firstLevelPrice() {
        return firstLevelPrice;
    }

    /**
     * Price of second buy level
     *
     * @return the SecondLevelPrice field
     */
    public SecondLevelPriceField secondLevelPrice() {
        return secondLevelPrice;
    }

    /**
     * Price of third buy level
     *
     * @return the ThirdLevelPrice field
     */
    public ThirdLevelPriceField thirdLevelPrice() {
        return thirdLevelPrice;
    }

    /**
     * Total volume at first price level
     *
     * @return the FirstLevelVolume field
     */
    public FirstLevelVolumeField firstLevelVolume() {
        return firstLevelVolume;
    }

    /**
     * Total volume at second price level
     *
     * @return the SecondLevelVolume field
     */
    public SecondLevelVolumeField secondLevelVolume() {
        return secondLevelVolume;
    }

    /**
     * Total volume at third price level
     *
     * @return the ThirdLevelVolume field
     */
    public ThirdLevelVolumeField thirdLevelVolume() {
        return thirdLevelVolume;
    }

    /**
     * QuoteCondition values
     *
     * @return the QuoteCondition field
     */
    public QuoteConditionField quoteCondition() {
        return quoteCondition;
    }

    /**
     * Total volume of customer orders at the first level
     *
     * @return the FirstLevelCustomerVolume field
     */
    public FirstLevelCustomerVolumeField firstLevelCustomerVolume() {
        return firstLevelCustomerVolume;
    }

    /**
     * Total volume of customer orders at the second level
     *
     * @return the SecondLevelCustomerVolume field
     */
    public SecondLevelCustomerVolumeField secondLevelCustomerVolume() {
        return secondLevelCustomerVolume;
    }

    /**
     * Total volume of customer orders at the third level
     *
     * @return the ThirdLevelCustomerVolume field
     */
    public ThirdLevelCustomerVolumeField thirdLevelCustomerVolume() {
        return thirdLevelCustomerVolume;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
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
        if (!sourceTime.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeField.BYTE_LENGTH;
        if (!sourceNs.parse(data, cursor)) {
            return false;
        }
        cursor += SourceNsField.BYTE_LENGTH;
        if (!seriesIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SeriesIndexField.BYTE_LENGTH;
        if (!symbolSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolSeqNumField.BYTE_LENGTH;
        if (!firstLevelPrice.parse(data, cursor)) {
            return false;
        }
        cursor += FirstLevelPriceField.BYTE_LENGTH;
        if (!secondLevelPrice.parse(data, cursor)) {
            return false;
        }
        cursor += SecondLevelPriceField.BYTE_LENGTH;
        if (!thirdLevelPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ThirdLevelPriceField.BYTE_LENGTH;
        if (!firstLevelVolume.parse(data, cursor)) {
            return false;
        }
        cursor += FirstLevelVolumeField.BYTE_LENGTH;
        if (!secondLevelVolume.parse(data, cursor)) {
            return false;
        }
        cursor += SecondLevelVolumeField.BYTE_LENGTH;
        if (!thirdLevelVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ThirdLevelVolumeField.BYTE_LENGTH;
        if (!quoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteConditionField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!firstLevelCustomerVolume.parse(data, cursor)) {
            return false;
        }
        cursor += FirstLevelCustomerVolumeField.BYTE_LENGTH;
        if (!secondLevelCustomerVolume.parse(data, cursor)) {
            return false;
        }
        cursor += SecondLevelCustomerVolumeField.BYTE_LENGTH;
        if (!thirdLevelCustomerVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ThirdLevelCustomerVolumeField.BYTE_LENGTH;
        cursor += 2; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceTime.encode(data, cursor);
        cursor = sourceNs.encode(data, cursor);
        cursor = seriesIndex.encode(data, cursor);
        cursor = symbolSeqNum.encode(data, cursor);
        cursor = firstLevelPrice.encode(data, cursor);
        cursor = secondLevelPrice.encode(data, cursor);
        cursor = thirdLevelPrice.encode(data, cursor);
        cursor = firstLevelVolume.encode(data, cursor);
        cursor = secondLevelVolume.encode(data, cursor);
        cursor = thirdLevelVolume.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        if (buffer != null && buffer.length >= 35 + 1) {
            System.arraycopy(buffer, 35, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = firstLevelCustomerVolume.encode(data, cursor);
        cursor = secondLevelCustomerVolume.encode(data, cursor);
        cursor = thirdLevelCustomerVolume.encode(data, cursor);
        if (buffer != null && buffer.length >= 42 + 2) {
            System.arraycopy(buffer, 42, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
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
     * Returns a copy of the bytes this message was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the message bytes, or empty when no decode has been attempted
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
            case "SourceTime" -> Optional.of(sourceTime);
            case "SourceNs" -> Optional.of(sourceNs);
            case "SeriesIndex" -> Optional.of(seriesIndex);
            case "SymbolSeqNum" -> Optional.of(symbolSeqNum);
            case "FirstLevelPrice" -> Optional.of(firstLevelPrice);
            case "SecondLevelPrice" -> Optional.of(secondLevelPrice);
            case "ThirdLevelPrice" -> Optional.of(thirdLevelPrice);
            case "FirstLevelVolume" -> Optional.of(firstLevelVolume);
            case "SecondLevelVolume" -> Optional.of(secondLevelVolume);
            case "ThirdLevelVolume" -> Optional.of(thirdLevelVolume);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "FirstLevelCustomerVolume" -> Optional.of(firstLevelCustomerVolume);
            case "SecondLevelCustomerVolume" -> Optional.of(secondLevelCustomerVolume);
            case "ThirdLevelCustomerVolume" -> Optional.of(thirdLevelCustomerVolume);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OutrightMarketDepthBuyMessage message)) {
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
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof OutrightMarketDepthBuyMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
