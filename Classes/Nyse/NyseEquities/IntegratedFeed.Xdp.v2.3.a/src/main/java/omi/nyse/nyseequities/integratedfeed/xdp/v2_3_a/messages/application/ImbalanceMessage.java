package omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.AuctionInterestClearingPriceField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.AuctionStatusField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.AuctionTimeField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.AuctionTypeField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.ContinuousBookClearingPriceField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.FreezeStatusField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.ImbalanceSideField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.IndicativeMatchPriceField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.LowerCollarField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.MarketImbalanceQtyField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.NumExtensionsField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.PairedQtyField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.ReferencePriceField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.SignificantImbalanceField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.SourceTimeField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.SourceTimeNsField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.SsrFilingPriceField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.SymbolIndexField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.SymbolSeqNumField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.TotalImbalanceQtyField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.UnpairedQtyField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.UnpairedSideField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.UpperCollarField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.types.Field;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.types.Message;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.types.PrintOptions;

/**
 * Represents the ImbalanceMessage message from the IntegratedFeed protocol.
 *
 * <p>Imbalance messages are sent periodically during auctions to update price and volume information. If there is no change to the calculated fields, no message will be generated.</p>
 */
public final class ImbalanceMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 69;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Imbalance Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * The nanosecond offset from the SourceTime
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * The unique ID of this symbol for all products within this market. This ID cannot be used to cross reference a security between markets.
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * Reserved for future use. Ignore any content. This usage will become standard across all products in future releases.
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * For Pillar-powered markets, the Reference Price is used to calculate the Indicative Match Price. For NYSE Tape A symbols, the Reference Price is the Last Sale if the last sale is at or between the current best quote.
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * For Pillar-powered markets, the number of shares paired off at the Indicative Match Price. For NYSE, the number of shares paired off at the Reference Price, truncated to the nearest round lot quantity.
     */
    private final PairedQtyField pairedQty = new PairedQtyField();

    /**
     * For Pillar-powered markets, the total imbalance quantity at the Indicative Match Price. For NYSE, the total imbalance quantity at the Reference Price, truncated to the round lot.
     */
    private final TotalImbalanceQtyField totalImbalanceQty = new TotalImbalanceQtyField();

    /**
     * For Pillar-powered markets, the total market order imbalance quantity at the Indicative Match Price.
     */
    private final MarketImbalanceQtyField marketImbalanceQty = new MarketImbalanceQtyField();

    /**
     * Projected Auction Time (hhmm)
     */
    private final AuctionTimeField auctionTime = new AuctionTimeField();

    /**
     * Type of auction
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * The side of the TotalImbalanceQty
     */
    private final ImbalanceSideField imbalanceSide = new ImbalanceSideField();

    /**
     * For Pillar-powered markets, the price at which all interest on the book can trade, including auction and imbalance offset interest, and disregarding auction collars. For NYSE, the indicative matching price, i.e. the price closest to the reference price where the imbalance is 0. If a continuous book clearing price is not reached, it is defaulted to 0.
     */
    private final ContinuousBookClearingPriceField continuousBookClearingPrice = new ContinuousBookClearingPriceField();

    /**
     * For Pillar-powered markets, the price at which all eligible auction-only interest would trade, subject to auction collars For NYSE, the price closest to the reference price where the imbalance of closing-only interest is 0. If a closing-only clearing price is not reached, it is defaulted to 0.
     */
    private final AuctionInterestClearingPriceField auctionInterestClearingPrice = new AuctionInterestClearingPriceField();

    /**
     * For Pillar-powered markets, not supported and defaulted to 0. For NYSE, the price at which Sell Short interest in the opening auction will be filed if a Sell Short Restriction is in effect for the security.
     */
    private final SsrFilingPriceField ssrFilingPrice = new SsrFilingPriceField();

    /**
     * For Pillar-powered markets, the price that has the highest executable volume of auction-eligible shares, subject to auction collars. It includes the non-displayed quantity of Reserve Orders.
     */
    private final IndicativeMatchPriceField indicativeMatchPrice = new IndicativeMatchPriceField();

    /**
     * If the IndicativeMatchPrice is not strictly between the UpperCollar and the LowerCollar, special auction rules apply. See Rule 7.35P for details.
     */
    private final UpperCollarField upperCollar = new UpperCollarField();

    /**
     * If the IndicativeMatchPrice is not strictly between the UpperCollar and the LowerCollar, special auction rules apply. See Rule 7.35P for details.
     */
    private final LowerCollarField lowerCollar = new LowerCollarField();

    /**
     * Indicates whether the auction will run
     */
    private final AuctionStatusField auctionStatus = new AuctionStatusField();

    /**
     * Freeze status code
     */
    private final FreezeStatusField freezeStatus = new FreezeStatusField();

    /**
     * Number of times the halt period has been extended
     */
    private final NumExtensionsField numExtensions = new NumExtensionsField();

    /**
     * During the Closing Auction, the number of unpaired shares priced at or better than the Reference Price
     */
    private final UnpairedQtyField unpairedQty = new UnpairedQtyField();

    /**
     * The side of the Unpaired Qty
     */
    private final UnpairedSideField unpairedSide = new UnpairedSideField();

    /**
     * Significant Imbalance Values
     */
    private final SignificantImbalanceField significantImbalance = new SignificantImbalanceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceTimeNs, symbolIndex, symbolSeqNum, referencePrice, pairedQty, totalImbalanceQty, marketImbalanceQty, auctionTime, auctionType, imbalanceSide, continuousBookClearingPrice, auctionInterestClearingPrice, ssrFilingPrice, indicativeMatchPrice, upperCollar, lowerCollar, auctionStatus, freezeStatus, numExtensions, unpairedQty, unpairedSide, significantImbalance);

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
     * The nanosecond offset from the SourceTime
     *
     * @return the SourceTimeNs field
     */
    public SourceTimeNsField sourceTimeNs() {
        return sourceTimeNs;
    }

    /**
     * The unique ID of this symbol for all products within this market. This ID cannot be used to cross reference a security between markets.
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * Reserved for future use. Ignore any content. This usage will become standard across all products in future releases.
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * For Pillar-powered markets, the Reference Price is used to calculate the Indicative Match Price. For NYSE Tape A symbols, the Reference Price is the Last Sale if the last sale is at or between the current best quote.
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * For Pillar-powered markets, the number of shares paired off at the Indicative Match Price. For NYSE, the number of shares paired off at the Reference Price, truncated to the nearest round lot quantity.
     *
     * @return the PairedQty field
     */
    public PairedQtyField pairedQty() {
        return pairedQty;
    }

    /**
     * For Pillar-powered markets, the total imbalance quantity at the Indicative Match Price. For NYSE, the total imbalance quantity at the Reference Price, truncated to the round lot.
     *
     * @return the TotalImbalanceQty field
     */
    public TotalImbalanceQtyField totalImbalanceQty() {
        return totalImbalanceQty;
    }

    /**
     * For Pillar-powered markets, the total market order imbalance quantity at the Indicative Match Price.
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
     * Type of auction
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * The side of the TotalImbalanceQty
     *
     * @return the ImbalanceSide field
     */
    public ImbalanceSideField imbalanceSide() {
        return imbalanceSide;
    }

    /**
     * For Pillar-powered markets, the price at which all interest on the book can trade, including auction and imbalance offset interest, and disregarding auction collars. For NYSE, the indicative matching price, i.e. the price closest to the reference price where the imbalance is 0. If a continuous book clearing price is not reached, it is defaulted to 0.
     *
     * @return the ContinuousBookClearingPrice field
     */
    public ContinuousBookClearingPriceField continuousBookClearingPrice() {
        return continuousBookClearingPrice;
    }

    /**
     * For Pillar-powered markets, the price at which all eligible auction-only interest would trade, subject to auction collars For NYSE, the price closest to the reference price where the imbalance of closing-only interest is 0. If a closing-only clearing price is not reached, it is defaulted to 0.
     *
     * @return the AuctionInterestClearingPrice field
     */
    public AuctionInterestClearingPriceField auctionInterestClearingPrice() {
        return auctionInterestClearingPrice;
    }

    /**
     * For Pillar-powered markets, not supported and defaulted to 0. For NYSE, the price at which Sell Short interest in the opening auction will be filed if a Sell Short Restriction is in effect for the security.
     *
     * @return the SsrFilingPrice field
     */
    public SsrFilingPriceField ssrFilingPrice() {
        return ssrFilingPrice;
    }

    /**
     * For Pillar-powered markets, the price that has the highest executable volume of auction-eligible shares, subject to auction collars. It includes the non-displayed quantity of Reserve Orders.
     *
     * @return the IndicativeMatchPrice field
     */
    public IndicativeMatchPriceField indicativeMatchPrice() {
        return indicativeMatchPrice;
    }

    /**
     * If the IndicativeMatchPrice is not strictly between the UpperCollar and the LowerCollar, special auction rules apply. See Rule 7.35P for details.
     *
     * @return the UpperCollar field
     */
    public UpperCollarField upperCollar() {
        return upperCollar;
    }

    /**
     * If the IndicativeMatchPrice is not strictly between the UpperCollar and the LowerCollar, special auction rules apply. See Rule 7.35P for details.
     *
     * @return the LowerCollar field
     */
    public LowerCollarField lowerCollar() {
        return lowerCollar;
    }

    /**
     * Indicates whether the auction will run
     *
     * @return the AuctionStatus field
     */
    public AuctionStatusField auctionStatus() {
        return auctionStatus;
    }

    /**
     * Freeze status code
     *
     * @return the FreezeStatus field
     */
    public FreezeStatusField freezeStatus() {
        return freezeStatus;
    }

    /**
     * Number of times the halt period has been extended
     *
     * @return the NumExtensions field
     */
    public NumExtensionsField numExtensions() {
        return numExtensions;
    }

    /**
     * During the Closing Auction, the number of unpaired shares priced at or better than the Reference Price
     *
     * @return the UnpairedQty field
     */
    public UnpairedQtyField unpairedQty() {
        return unpairedQty;
    }

    /**
     * The side of the Unpaired Qty
     *
     * @return the UnpairedSide field
     */
    public UnpairedSideField unpairedSide() {
        return unpairedSide;
    }

    /**
     * Significant Imbalance Values
     *
     * @return the SignificantImbalance field
     */
    public SignificantImbalanceField significantImbalance() {
        return significantImbalance;
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
        if (!auctionInterestClearingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionInterestClearingPriceField.BYTE_LENGTH;
        if (!ssrFilingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += SsrFilingPriceField.BYTE_LENGTH;
        if (!indicativeMatchPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativeMatchPriceField.BYTE_LENGTH;
        if (!upperCollar.parse(data, cursor)) {
            return false;
        }
        cursor += UpperCollarField.BYTE_LENGTH;
        if (!lowerCollar.parse(data, cursor)) {
            return false;
        }
        cursor += LowerCollarField.BYTE_LENGTH;
        if (!auctionStatus.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionStatusField.BYTE_LENGTH;
        if (!freezeStatus.parse(data, cursor)) {
            return false;
        }
        cursor += FreezeStatusField.BYTE_LENGTH;
        if (!numExtensions.parse(data, cursor)) {
            return false;
        }
        cursor += NumExtensionsField.BYTE_LENGTH;
        if (!unpairedQty.parse(data, cursor)) {
            return false;
        }
        cursor += UnpairedQtyField.BYTE_LENGTH;
        if (!unpairedSide.parse(data, cursor)) {
            return false;
        }
        cursor += UnpairedSideField.BYTE_LENGTH;
        if (!significantImbalance.parse(data, cursor)) {
            return false;
        }
        cursor += SignificantImbalanceField.BYTE_LENGTH;

        return true;
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
        cursor = auctionInterestClearingPrice.encode(data, cursor);
        cursor = ssrFilingPrice.encode(data, cursor);
        cursor = indicativeMatchPrice.encode(data, cursor);
        cursor = upperCollar.encode(data, cursor);
        cursor = lowerCollar.encode(data, cursor);
        cursor = auctionStatus.encode(data, cursor);
        cursor = freezeStatus.encode(data, cursor);
        cursor = numExtensions.encode(data, cursor);
        cursor = unpairedQty.encode(data, cursor);
        cursor = unpairedSide.encode(data, cursor);
        cursor = significantImbalance.encode(data, cursor);
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
            case "AuctionInterestClearingPrice" -> Optional.of(auctionInterestClearingPrice);
            case "SsrFilingPrice" -> Optional.of(ssrFilingPrice);
            case "IndicativeMatchPrice" -> Optional.of(indicativeMatchPrice);
            case "UpperCollar" -> Optional.of(upperCollar);
            case "LowerCollar" -> Optional.of(lowerCollar);
            case "AuctionStatus" -> Optional.of(auctionStatus);
            case "FreezeStatus" -> Optional.of(freezeStatus);
            case "NumExtensions" -> Optional.of(numExtensions);
            case "UnpairedQty" -> Optional.of(unpairedQty);
            case "UnpairedSide" -> Optional.of(unpairedSide);
            case "SignificantImbalance" -> Optional.of(significantImbalance);
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
