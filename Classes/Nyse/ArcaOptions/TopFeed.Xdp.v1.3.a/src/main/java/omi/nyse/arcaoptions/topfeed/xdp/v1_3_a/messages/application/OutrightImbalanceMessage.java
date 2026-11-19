package omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.fields.AuctionTypeField;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.fields.ImbalanceSideField;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.fields.MarketImbalanceQtyField;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.fields.MarketImbalanceSideField;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.fields.PairedQtyField;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.fields.ReferencePriceField;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.fields.SeriesIndexField;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.fields.SourceTimeField;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.fields.SourceTimeNsField;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.fields.SymbolSeqNumField;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.fields.TotalImbalanceQtyField;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.types.Field;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.types.Message;
import omi.nyse.arcaoptions.topfeed.xdp.v1_3_a.types.PrintOptions;

/**
 * Represents the OutrightImbalanceMessage message from the TopFeed protocol.
 *
 * <p>The Outright Imbalance message is sent during the Pre-opening phase or a symbol Halt to provide indicative opening price and net imbalance of all orders at that price which are orders eligible for next Auction.</p>
 */
public final class OutrightImbalanceMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 32;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Outright Imbalance Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 29, 3 };

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * The nanosecond offset from the SourceTime.
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * The unique ID of the symbol in the Series Index message
     */
    private final SeriesIndexField seriesIndex = new SeriesIndexField();

    /**
     * Sequence number of messages for the outright options symbol.
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * Indicative opening price.
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * Paired off quantity at the indicative opening price
     */
    private final PairedQtyField pairedQty = new PairedQtyField();

    /**
     * Total imbalance quantity at the indicative opening price.
     */
    private final TotalImbalanceQtyField totalImbalanceQty = new TotalImbalanceQtyField();

    /**
     * Total market order imbalance at the indicative opening price.
     */
    private final MarketImbalanceQtyField marketImbalanceQty = new MarketImbalanceQtyField();

    /**
     * AuctionType value
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Side of the imbalance Buy/sell.
     */
    private final ImbalanceSideField imbalanceSide = new ImbalanceSideField();

    /**
     * Side of the market imbalance Buy/sell.
     */
    private final MarketImbalanceSideField marketImbalanceSide = new MarketImbalanceSideField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceTimeNs, seriesIndex, symbolSeqNum, referencePrice, pairedQty, totalImbalanceQty, marketImbalanceQty, auctionType, imbalanceSide, marketImbalanceSide);

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
     * The unique ID of the symbol in the Series Index message
     *
     * @return the SeriesIndex field
     */
    public SeriesIndexField seriesIndex() {
        return seriesIndex;
    }

    /**
     * Sequence number of messages for the outright options symbol.
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * Indicative opening price.
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * Paired off quantity at the indicative opening price
     *
     * @return the PairedQty field
     */
    public PairedQtyField pairedQty() {
        return pairedQty;
    }

    /**
     * Total imbalance quantity at the indicative opening price.
     *
     * @return the TotalImbalanceQty field
     */
    public TotalImbalanceQtyField totalImbalanceQty() {
        return totalImbalanceQty;
    }

    /**
     * Total market order imbalance at the indicative opening price.
     *
     * @return the MarketImbalanceQty field
     */
    public MarketImbalanceQtyField marketImbalanceQty() {
        return marketImbalanceQty;
    }

    /**
     * AuctionType value
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Side of the imbalance Buy/sell.
     *
     * @return the ImbalanceSide field
     */
    public ImbalanceSideField imbalanceSide() {
        return imbalanceSide;
    }

    /**
     * Side of the market imbalance Buy/sell.
     *
     * @return the MarketImbalanceSide field
     */
    public MarketImbalanceSideField marketImbalanceSide() {
        return marketImbalanceSide;
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
        if (!symbolSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolSeqNumField.BYTE_LENGTH;
        if (!referencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceField.BYTE_LENGTH;
        if (!pairedQty.parse(data, cursor)) {
            return false;
        }
        cursor += PairedQtyField.BYTE_LENGTH;
        if (!totalImbalanceQty.parse(data, cursor)) {
            return false;
        }
        cursor += TotalImbalanceQtyField.BYTE_LENGTH;
        if (!marketImbalanceQty.parse(data, cursor)) {
            return false;
        }
        cursor += MarketImbalanceQtyField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!imbalanceSide.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceSideField.BYTE_LENGTH;
        if (!marketImbalanceSide.parse(data, cursor)) {
            return false;
        }
        cursor += MarketImbalanceSideField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceTime.encode(data, cursor);
        cursor = sourceTimeNs.encode(data, cursor);
        cursor = seriesIndex.encode(data, cursor);
        cursor = symbolSeqNum.encode(data, cursor);
        cursor = referencePrice.encode(data, cursor);
        cursor = pairedQty.encode(data, cursor);
        cursor = totalImbalanceQty.encode(data, cursor);
        cursor = marketImbalanceQty.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = imbalanceSide.encode(data, cursor);
        cursor = marketImbalanceSide.encode(data, cursor);
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
            case "SymbolSeqNum" -> Optional.of(symbolSeqNum);
            case "ReferencePrice" -> Optional.of(referencePrice);
            case "PairedQty" -> Optional.of(pairedQty);
            case "TotalImbalanceQty" -> Optional.of(totalImbalanceQty);
            case "MarketImbalanceQty" -> Optional.of(marketImbalanceQty);
            case "AuctionType" -> Optional.of(auctionType);
            case "ImbalanceSide" -> Optional.of(imbalanceSide);
            case "MarketImbalanceSide" -> Optional.of(marketImbalanceSide);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OutrightImbalanceMessage message)) {
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
        if (!(other instanceof OutrightImbalanceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
