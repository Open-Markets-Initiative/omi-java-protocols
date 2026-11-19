package omi.nyse.arcaequities.arcabook.pillar.v2_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.fields.AuctionTimeField;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.fields.AuctionTypeField;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.fields.ClosingOnlyClearingPriceField;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.fields.ContinuousBookClearingPriceField;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.fields.ImbalanceSideField;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.fields.IndicativeMatchPriceField;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.fields.MarketImbalanceQtyField;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.fields.PairedQtyField;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.fields.SourceTimeField;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.fields.SourceTimeNsField;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.fields.SsrFilingPriceField;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.fields.SymbolIndexField;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.fields.SymbolSeqNumField;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.fields.TotalImbalanceQtyField;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.types.Field;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.types.Message;
import omi.nyse.arcaequities.arcabook.pillar.v2_2.types.PrintOptions;

/**
 * Represents the ImbalanceMessage message from the ArcaBook protocol.
 *
 * <p>ArcaBook Imbalance Message</p>
 */
public final class ImbalanceMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 48;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Imbalance Message";

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * This field represents the nanosecond offset from the time reference second in UTC time (EPOCH)
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * This field identifies the numerical representation of the symbol.
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * This field contains the symbol sequence number
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * The best price at which the maximum volume of shares is executable in the applicable auction, subject to Auction Collars.
     */
    private final IndicativeMatchPriceField indicativeMatchPrice = new IndicativeMatchPriceField();

    /**
     * The number of shares paired off at the Indicative Match Price.
     */
    private final PairedQtyField pairedQty = new PairedQtyField();

    /**
     * The total imbalance quantity at the Indicative Match Price. If the value is negative, the imbalance is on the Sell side, otherwise, the Buy side.
     */
    private final TotalImbalanceQtyField totalImbalanceQty = new TotalImbalanceQtyField();

    /**
     * The total market order imbalance at the Indicative Match Price. If the value is negative, the imbalance is on the Sell side, otherwise, the Buy side.
     */
    private final MarketImbalanceQtyField marketImbalanceQty = new MarketImbalanceQtyField();

    /**
     * Projected Auction Time (hhmm)
     */
    private final AuctionTimeField auctionTime = new AuctionTimeField();

    /**
     * Auction type indicator
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Not supported, defaulted to 0.
     */
    private final ImbalanceSideField imbalanceSide = new ImbalanceSideField();

    /**
     * Not supported, defaulted to 0.
     */
    private final ContinuousBookClearingPriceField continuousBookClearingPrice = new ContinuousBookClearingPriceField();

    /**
     * Not supported, defaulted to 0.
     */
    private final ClosingOnlyClearingPriceField closingOnlyClearingPrice = new ClosingOnlyClearingPriceField();

    /**
     * Not supported, defaulted to 0.
     */
    private final SsrFilingPriceField ssrFilingPrice = new SsrFilingPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceTimeNs, symbolIndex, symbolSeqNum, indicativeMatchPrice, pairedQty, totalImbalanceQty, marketImbalanceQty, auctionTime, auctionType, imbalanceSide, continuousBookClearingPrice, closingOnlyClearingPrice, ssrFilingPrice);

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
     * This field represents the nanosecond offset from the time reference second in UTC time (EPOCH)
     *
     * @return the SourceTimeNs field
     */
    public SourceTimeNsField sourceTimeNs() {
        return sourceTimeNs;
    }

    /**
     * This field identifies the numerical representation of the symbol.
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * This field contains the symbol sequence number
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * The best price at which the maximum volume of shares is executable in the applicable auction, subject to Auction Collars.
     *
     * @return the IndicativeMatchPrice field
     */
    public IndicativeMatchPriceField indicativeMatchPrice() {
        return indicativeMatchPrice;
    }

    /**
     * The number of shares paired off at the Indicative Match Price.
     *
     * @return the PairedQty field
     */
    public PairedQtyField pairedQty() {
        return pairedQty;
    }

    /**
     * The total imbalance quantity at the Indicative Match Price. If the value is negative, the imbalance is on the Sell side, otherwise, the Buy side.
     *
     * @return the TotalImbalanceQty field
     */
    public TotalImbalanceQtyField totalImbalanceQty() {
        return totalImbalanceQty;
    }

    /**
     * The total market order imbalance at the Indicative Match Price. If the value is negative, the imbalance is on the Sell side, otherwise, the Buy side.
     *
     * @return the MarketImbalanceQty field
     */
    public MarketImbalanceQtyField marketImbalanceQty() {
        return marketImbalanceQty;
    }

    /**
     * Projected Auction Time (hhmm)
     *
     * @return the AuctionTime field
     */
    public AuctionTimeField auctionTime() {
        return auctionTime;
    }

    /**
     * Auction type indicator
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Not supported, defaulted to 0.
     *
     * @return the ImbalanceSide field
     */
    public ImbalanceSideField imbalanceSide() {
        return imbalanceSide;
    }

    /**
     * Not supported, defaulted to 0.
     *
     * @return the ContinuousBookClearingPrice field
     */
    public ContinuousBookClearingPriceField continuousBookClearingPrice() {
        return continuousBookClearingPrice;
    }

    /**
     * Not supported, defaulted to 0.
     *
     * @return the ClosingOnlyClearingPrice field
     */
    public ClosingOnlyClearingPriceField closingOnlyClearingPrice() {
        return closingOnlyClearingPrice;
    }

    /**
     * Not supported, defaulted to 0.
     *
     * @return the SsrFilingPrice field
     */
    public SsrFilingPriceField ssrFilingPrice() {
        return ssrFilingPrice;
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
        return new int[0];
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
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!symbolSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolSeqNumField.BYTE_LENGTH;
        if (!indicativeMatchPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativeMatchPriceField.BYTE_LENGTH;
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
        if (!auctionTime.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTimeField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!imbalanceSide.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceSideField.BYTE_LENGTH;
        if (!continuousBookClearingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ContinuousBookClearingPriceField.BYTE_LENGTH;
        if (!closingOnlyClearingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingOnlyClearingPriceField.BYTE_LENGTH;
        return ssrFilingPrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceTime.encode(data, cursor);
        cursor = sourceTimeNs.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = symbolSeqNum.encode(data, cursor);
        cursor = indicativeMatchPrice.encode(data, cursor);
        cursor = pairedQty.encode(data, cursor);
        cursor = totalImbalanceQty.encode(data, cursor);
        cursor = marketImbalanceQty.encode(data, cursor);
        cursor = auctionTime.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = imbalanceSide.encode(data, cursor);
        cursor = continuousBookClearingPrice.encode(data, cursor);
        cursor = closingOnlyClearingPrice.encode(data, cursor);
        cursor = ssrFilingPrice.encode(data, cursor);
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
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "SymbolSeqNum" -> Optional.of(symbolSeqNum);
            case "IndicativeMatchPrice" -> Optional.of(indicativeMatchPrice);
            case "PairedQty" -> Optional.of(pairedQty);
            case "TotalImbalanceQty" -> Optional.of(totalImbalanceQty);
            case "MarketImbalanceQty" -> Optional.of(marketImbalanceQty);
            case "AuctionTime" -> Optional.of(auctionTime);
            case "AuctionType" -> Optional.of(auctionType);
            case "ImbalanceSide" -> Optional.of(imbalanceSide);
            case "ContinuousBookClearingPrice" -> Optional.of(continuousBookClearingPrice);
            case "ClosingOnlyClearingPrice" -> Optional.of(closingOnlyClearingPrice);
            case "SsrFilingPrice" -> Optional.of(ssrFilingPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ImbalanceMessage message)) {
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
        if (!(other instanceof ImbalanceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
