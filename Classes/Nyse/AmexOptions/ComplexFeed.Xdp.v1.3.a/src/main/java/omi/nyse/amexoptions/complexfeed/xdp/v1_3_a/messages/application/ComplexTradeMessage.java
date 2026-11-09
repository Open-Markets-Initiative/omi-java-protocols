package omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.ComplexIndexField;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.PriceField;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.SourceTimeField;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.SourceTimeNsField;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.SymbolSeqNumField;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.TradeCond1Field;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.TradeCond2Field;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.TradeIdField;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.fields.VolumeField2;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.types.Field;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.types.Message;
import omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.types.PrintOptions;

/**
 * Represents the ComplexTradeMessage message from the ComplexFeed protocol.
 *
 * <p>The Complex Trade message is used to publish all complex Last Sales.</p>
 */
public final class ComplexTradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 32;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Trade Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 30, 2 };

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * The nanosecond offset from the SourceTime.
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * The unique ID of the symbol in the Complex Index msg
     */
    private final ComplexIndexField complexIndex = new ComplexIndexField();

    /**
     * Sequence number of messages for the complex symbol.
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * n/a for complex symbols
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * The net amount of money made by the Seller* (the price of the Sell legs minus the price of the Buy legs).
     */
    private final PriceField price = new PriceField();

    /**
     * Volume of the trade in actual number of contracts
     */
    private final VolumeField2 volume = new VolumeField2();

    /**
     * TradeCond1 value
     */
    private final TradeCond1Field tradeCond1 = new TradeCond1Field();

    /**
     * (blank) n/a for complex symbols
     */
    private final TradeCond2Field tradeCond2 = new TradeCond2Field();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceTimeNs, complexIndex, symbolSeqNum, tradeId, price, volume, tradeCond1, tradeCond2);

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
     * @return the SourceTimeNs field
     */
    public SourceTimeNsField sourceTimeNs() {
        return sourceTimeNs;
    }

    /**
     * The unique ID of the symbol in the Complex Index msg
     *
     * @return the ComplexIndex field
     */
    public ComplexIndexField complexIndex() {
        return complexIndex;
    }

    /**
     * Sequence number of messages for the complex symbol.
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * n/a for complex symbols
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * The net amount of money made by the Seller* (the price of the Sell legs minus the price of the Buy legs).
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Volume of the trade in actual number of contracts
     *
     * @return the Volume field
     */
    public VolumeField2 volume() {
        return volume;
    }

    /**
     * TradeCond1 value
     *
     * @return the TradeCond1 field
     */
    public TradeCond1Field tradeCond1() {
        return tradeCond1;
    }

    /**
     * (blank) n/a for complex symbols
     *
     * @return the TradeCond2 field
     */
    public TradeCond2Field tradeCond2() {
        return tradeCond2;
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
        if (!complexIndex.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexIndexField.BYTE_LENGTH;
        if (!symbolSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolSeqNumField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField2.BYTE_LENGTH;
        if (!tradeCond1.parse(data, cursor)) {
            return false;
        }
        cursor += TradeCond1Field.BYTE_LENGTH;
        if (!tradeCond2.parse(data, cursor)) {
            return false;
        }
        cursor += TradeCond2Field.BYTE_LENGTH;
        cursor += 2; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceTime.encode(data, cursor);
        cursor = sourceTimeNs.encode(data, cursor);
        cursor = complexIndex.encode(data, cursor);
        cursor = symbolSeqNum.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = tradeCond1.encode(data, cursor);
        cursor = tradeCond2.encode(data, cursor);
        if (buffer != null && buffer.length >= 30 + 2) {
            System.arraycopy(buffer, 30, data, cursor, 2); // padding
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
            case "SourceTimeNs" -> Optional.of(sourceTimeNs);
            case "ComplexIndex" -> Optional.of(complexIndex);
            case "SymbolSeqNum" -> Optional.of(symbolSeqNum);
            case "TradeId" -> Optional.of(tradeId);
            case "Price" -> Optional.of(price);
            case "Volume" -> Optional.of(volume);
            case "TradeCond1" -> Optional.of(tradeCond1);
            case "TradeCond2" -> Optional.of(tradeCond2);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexTradeMessage message)) {
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
        if (!(other instanceof ComplexTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
