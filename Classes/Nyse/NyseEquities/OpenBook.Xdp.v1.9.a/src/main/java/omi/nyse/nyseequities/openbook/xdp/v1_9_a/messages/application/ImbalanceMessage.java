package omi.nyse.nyseequities.openbook.xdp.v1_9_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.fields.AuctionTimeField;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.fields.AuctionTypeField;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.fields.ClosingOnlyClearingPriceField;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.fields.ContinuousBookClearingPriceField;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.fields.ImbalanceSideField;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.fields.MarketImbalanceQtyField;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.fields.PairedQtyField;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.fields.ReferencePriceField;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.fields.SourceTimeField;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.fields.SourceTimeNsField;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.fields.SsrFilingPriceField;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.fields.SymbolIndexField;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.fields.SymbolSeqNumField;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.fields.TotalImbalanceQtyField;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.types.Field;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.types.Message;
import omi.nyse.nyseequities.openbook.xdp.v1_9_a.types.PrintOptions;

/**
 * Represents the ImbalanceMessage message from the OpenBook protocol.
 *
 * <p>Imbalance message. Size of the message: 52 bytes (NYSE, NYSE MKT and NYSE Arca).</p>
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
     * This field specifies the time when the msg was generated in the order book. The number represents the number of seconds in UTC time (EPOCH)
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
     * The Reference Price is the Last Sale if the last sale is at or between the current best quote. Otherwise the Reference Price is the Bid Price if last sale is lower than Bid price, or the Offer price if last sale is higher than Offer price.
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * This field contains the paired off quantity at the reference price point
     */
    private final PairedQtyField pairedQty = new PairedQtyField();

    /**
     * This field contains the total imbalance quantity at the reference price point. For NYSE Arca, positive or negative Imbalance Quantities denote a Buy or Sell imbalance, respectively.
     */
    private final TotalImbalanceQtyField totalImbalanceQty = new TotalImbalanceQtyField();

    /**
     * This field indicates the total market order imbalance at the reference price. For NYSE Arca, positive or negative Imbalance Quantities denote a Buy or Sell imbalance, respectively.
     */
    private final MarketImbalanceQtyField marketImbalanceQty = new MarketImbalanceQtyField();

    /**
     * Projected Auction Time (hhmm)
     */
    private final AuctionTimeField auctionTime = new AuctionTimeField();

    /**
     * Auction type. For the NYSE / NYSE MKT, the opening imbalance will have an "M" Auction Type.
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * This field indicates the side of the imbalance Buy/sell. This field is a future enhancement for NYSE Arca and will have a '0' value until such time. This field is not yet implemented and is left as a future release.
     */
    private final ImbalanceSideField imbalanceSide = new ImbalanceSideField();

    /**
     * The Continuous Book Clearing Price is defined as the price closest to last sale where imbalance is zero. If a Book Clearing Price is not reached, a zero will be published. This field is a future enhancement for NYSE Arca and will have a '0' value until such time. This field is not yet implemented and is left as a future release.
     */
    private final ContinuousBookClearingPriceField continuousBookClearingPrice = new ContinuousBookClearingPriceField();

    /**
     * This field contains the indicative price against closing only order only. This field is a future enhancement for NYSE Arca and will have a '0' value until such time. This field is not yet implemented and is left as a future release.
     */
    private final ClosingOnlyClearingPriceField closingOnlyClearingPrice = new ClosingOnlyClearingPriceField();

    /**
     * This field contains the SSR Filing Price, the price at which Sell Short interest will be filed in the matching in the event a Sell Short Restriction is in effect for the security. It is based on the National Best Bid at 9:30am and remains static after it has been determined. This field is a future enhancement for NYSE Arca and will have a '0' value until such time. This field is not yet implemented and is left as a future release.
     */
    private final SsrFilingPriceField ssrFilingPrice = new SsrFilingPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceTimeNs, symbolIndex, symbolSeqNum, referencePrice, pairedQty, totalImbalanceQty, marketImbalanceQty, auctionTime, auctionType, imbalanceSide, continuousBookClearingPrice, closingOnlyClearingPrice, ssrFilingPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * This field specifies the time when the msg was generated in the order book. The number represents the number of seconds in UTC time (EPOCH)
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
     * The Reference Price is the Last Sale if the last sale is at or between the current best quote. Otherwise the Reference Price is the Bid Price if last sale is lower than Bid price, or the Offer price if last sale is higher than Offer price.
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * This field contains the paired off quantity at the reference price point
     *
     * @return the PairedQty field
     */
    public PairedQtyField pairedQty() {
        return pairedQty;
    }

    /**
     * This field contains the total imbalance quantity at the reference price point. For NYSE Arca, positive or negative Imbalance Quantities denote a Buy or Sell imbalance, respectively.
     *
     * @return the TotalImbalanceQty field
     */
    public TotalImbalanceQtyField totalImbalanceQty() {
        return totalImbalanceQty;
    }

    /**
     * This field indicates the total market order imbalance at the reference price. For NYSE Arca, positive or negative Imbalance Quantities denote a Buy or Sell imbalance, respectively.
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
     * Auction type. For the NYSE / NYSE MKT, the opening imbalance will have an "M" Auction Type.
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * This field indicates the side of the imbalance Buy/sell. This field is a future enhancement for NYSE Arca and will have a '0' value until such time. This field is not yet implemented and is left as a future release.
     *
     * @return the ImbalanceSide field
     */
    public ImbalanceSideField imbalanceSide() {
        return imbalanceSide;
    }

    /**
     * The Continuous Book Clearing Price is defined as the price closest to last sale where imbalance is zero. If a Book Clearing Price is not reached, a zero will be published. This field is a future enhancement for NYSE Arca and will have a '0' value until such time. This field is not yet implemented and is left as a future release.
     *
     * @return the ContinuousBookClearingPrice field
     */
    public ContinuousBookClearingPriceField continuousBookClearingPrice() {
        return continuousBookClearingPrice;
    }

    /**
     * This field contains the indicative price against closing only order only. This field is a future enhancement for NYSE Arca and will have a '0' value until such time. This field is not yet implemented and is left as a future release.
     *
     * @return the ClosingOnlyClearingPrice field
     */
    public ClosingOnlyClearingPriceField closingOnlyClearingPrice() {
        return closingOnlyClearingPrice;
    }

    /**
     * This field contains the SSR Filing Price, the price at which Sell Short interest will be filed in the matching in the event a Sell Short Restriction is in effect for the security. It is based on the National Best Bid at 9:30am and remains static after it has been determined. This field is a future enhancement for NYSE Arca and will have a '0' value until such time. This field is not yet implemented and is left as a future release.
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
        cursor = referencePrice.encode(data, cursor);
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
            case "ReferencePrice" -> Optional.of(referencePrice);
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
