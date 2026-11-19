package omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.fields.SeriesIndexField;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.fields.SeriesSeqNumField;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.fields.SourceTimeField;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.fields.SourceTimeNsField;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.fields.TradeCondField;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.fields.TradeIdField;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.fields.TradePriceField;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.fields.VolumeField;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.types.Field;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.types.Message;
import omi.nyse.amexoptions.complexfeed.pillar.v1_0_h.types.PrintOptions;

/**
 * Represents the OptionsTradeMessage message from the ComplexFeed protocol.
 *
 * <p>Used to publish the complex Last Sales.</p>
 */
public final class OptionsTradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 32;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Options Trade Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 29, 1, 30, 1, 31, 1 };

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * The nanosecond offset (UTC Time) from the Time Reference message.
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * The unique ID of this series within this market.
     */
    private final SeriesIndexField seriesIndex = new SeriesIndexField();

    /**
     * The series sequence number.
     */
    private final SeriesSeqNumField seriesSeqNum = new SeriesSeqNumField();

    /**
     * Unique identifier for this trade.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Trade price. A positive value is implicit (no sign), a negative value is indicated by a negative sign. Use the Price scale from the series index mapping.
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * The volume of the trade in contracts.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Settlement related conditions.
     */
    private final TradeCondField tradeCond = new TradeCondField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceTimeNs, seriesIndex, seriesSeqNum, tradeId, tradePrice, volume, tradeCond);

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
     * The nanosecond offset (UTC Time) from the Time Reference message.
     *
     * @return the SourceTimeNs field
     */
    public SourceTimeNsField sourceTimeNs() {
        return sourceTimeNs;
    }

    /**
     * The unique ID of this series within this market.
     *
     * @return the SeriesIndex field
     */
    public SeriesIndexField seriesIndex() {
        return seriesIndex;
    }

    /**
     * The series sequence number.
     *
     * @return the SeriesSeqNum field
     */
    public SeriesSeqNumField seriesSeqNum() {
        return seriesSeqNum;
    }

    /**
     * Unique identifier for this trade.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Trade price. A positive value is implicit (no sign), a negative value is indicated by a negative sign. Use the Price scale from the series index mapping.
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * The volume of the trade in contracts.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Settlement related conditions.
     *
     * @return the TradeCond field
     */
    public TradeCondField tradeCond() {
        return tradeCond;
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
        if (!sourceTimeNs.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeNsField.BYTE_LENGTH;
        if (!seriesIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SeriesIndexField.BYTE_LENGTH;
        if (!seriesSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SeriesSeqNumField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!tradeCond.parse(data, cursor)) {
            return false;
        }
        cursor += TradeCondField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceTime.encode(data, cursor);
        cursor = sourceTimeNs.encode(data, cursor);
        cursor = seriesIndex.encode(data, cursor);
        cursor = seriesSeqNum.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = tradeCond.encode(data, cursor);
        if (buffer != null && buffer.length >= 32) {
            System.arraycopy(buffer, 29, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
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
            case "SourceTimeNs" -> Optional.of(sourceTimeNs);
            case "SeriesIndex" -> Optional.of(seriesIndex);
            case "SeriesSeqNum" -> Optional.of(seriesSeqNum);
            case "TradeId" -> Optional.of(tradeId);
            case "TradePrice" -> Optional.of(tradePrice);
            case "Volume" -> Optional.of(volume);
            case "TradeCond" -> Optional.of(tradeCond);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OptionsTradeMessage message)) {
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
        if (!(other instanceof OptionsTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
