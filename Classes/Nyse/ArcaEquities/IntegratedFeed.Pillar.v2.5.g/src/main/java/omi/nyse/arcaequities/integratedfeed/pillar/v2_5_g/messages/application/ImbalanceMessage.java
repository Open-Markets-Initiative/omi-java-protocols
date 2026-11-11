package omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.AuctionInterestClearingPriceField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.AuctionStatusField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.AuctionTimeField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.AuctionTypeField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.ContinuousBookClearingPriceField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.FreezeStatusField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.ImbalanceSideField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.IndicativeMatchPriceField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.LowerCollarField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.MarketImbalanceQtyField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.NumExtensionsField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.PairedQtyField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.ReferencePriceField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.SourceTimeField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.SourceTimeNsField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.SsrFilingPriceField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.SymbolIndexField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.SymbolSeqNumField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.TotalImbalanceQtyField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.UnpairedQtyField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.UnpairedSideField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.fields.UpperCollarField;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.types.Field;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.types.Message;
import omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.types.PrintOptions;

/**
 * Represents the ImbalanceMessage message from the IntegratedFeed protocol.
 *
 * <p>Imbalance messages are published once a second during auctions to update price and volume information.</p>
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
    private static final int[] PADDING = { 68, 1 };

    /**
     * The time when this msg was generated in the order book, in secs since 1/1/1970 00:00:00 UTC
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * The nanosecond offset from the Time Reference second.
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * The ID of the symbol in the Symbol Index msg
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * The sequence number of this message in the set of all messages for this symbol
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * The price at which imbalances are calculated.
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * Number of shares paired at the Reference Price.
     */
    private final PairedQtyField pairedQty = new PairedQtyField();

    /**
     * The total imbalance quantity at the Reference Price.
     */
    private final TotalImbalanceQtyField totalImbalanceQty = new TotalImbalanceQtyField();

    /**
     * The total market order imbalance quantity at the Reference Price.
     */
    private final MarketImbalanceQtyField marketImbalanceQty = new MarketImbalanceQtyField();

    /**
     * Projected Auction Time (hhmm)
     */
    private final AuctionTimeField auctionTime = new AuctionTimeField();

    /**
     * Auction type indicator.
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * The side of the TotalImbalanceQty
     */
    private final ImbalanceSideField imbalanceSide = new ImbalanceSideField();

    /**
     * The price closest to the reference price where the imbalance is 0.
     */
    private final ContinuousBookClearingPriceField continuousBookClearingPrice = new ContinuousBookClearingPriceField();

    /**
     * The price at which auction only interest would trade.
     */
    private final AuctionInterestClearingPriceField auctionInterestClearingPrice = new AuctionInterestClearingPriceField();

    /**
     * For NYSE non-Significant imbalances, if a Sell Short Restriction is in effect, the price at which Sell Short interest will be filed.
     */
    private final SsrFilingPriceField ssrFilingPrice = new SsrFilingPriceField();

    /**
     * The best price at which the maximum volume of shares is executable in the applicable auction, subject to Auction Collars.
     */
    private final IndicativeMatchPriceField indicativeMatchPrice = new IndicativeMatchPriceField();

    /**
     * Upper boundary for the Indicative Match Price.
     */
    private final UpperCollarField upperCollar = new UpperCollarField();

    /**
     * Lower boundary for the Indicative Match Price.
     */
    private final LowerCollarField lowerCollar = new LowerCollarField();

    /**
     * Indicates whether the auction will run.
     */
    private final AuctionStatusField auctionStatus = new AuctionStatusField();

    /**
     * Indicates an Imbalance Freeze for the auction.
     */
    private final FreezeStatusField freezeStatus = new FreezeStatusField();

    /**
     * The number of times a halt period has been extended
     */
    private final NumExtensionsField numExtensions = new NumExtensionsField();

    /**
     * The number of unpaired shares priced at or better than the Reference Price.
     */
    private final UnpairedQtyField unpairedQty = new UnpairedQtyField();

    /**
     * The side of the Unpaired Qty
     */
    private final UnpairedSideField unpairedSide = new UnpairedSideField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceTimeNs, symbolIndex, symbolSeqNum, referencePrice, pairedQty, totalImbalanceQty, marketImbalanceQty, auctionTime, auctionType, imbalanceSide, continuousBookClearingPrice, auctionInterestClearingPrice, ssrFilingPrice, indicativeMatchPrice, upperCollar, lowerCollar, auctionStatus, freezeStatus, numExtensions, unpairedQty, unpairedSide);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time when this msg was generated in the order book, in secs since 1/1/1970 00:00:00 UTC
     *
     * @return the SourceTime field
     */
    public SourceTimeField sourceTime() {
        return sourceTime;
    }

    /**
     * The nanosecond offset from the Time Reference second.
     *
     * @return the SourceTimeNs field
     */
    public SourceTimeNsField sourceTimeNs() {
        return sourceTimeNs;
    }

    /**
     * The ID of the symbol in the Symbol Index msg
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * The sequence number of this message in the set of all messages for this symbol
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * The price at which imbalances are calculated.
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * Number of shares paired at the Reference Price.
     *
     * @return the PairedQty field
     */
    public PairedQtyField pairedQty() {
        return pairedQty;
    }

    /**
     * The total imbalance quantity at the Reference Price.
     *
     * @return the TotalImbalanceQty field
     */
    public TotalImbalanceQtyField totalImbalanceQty() {
        return totalImbalanceQty;
    }

    /**
     * The total market order imbalance quantity at the Reference Price.
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
     * Auction type indicator.
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
     * The price closest to the reference price where the imbalance is 0.
     *
     * @return the ContinuousBookClearingPrice field
     */
    public ContinuousBookClearingPriceField continuousBookClearingPrice() {
        return continuousBookClearingPrice;
    }

    /**
     * The price at which auction only interest would trade.
     *
     * @return the AuctionInterestClearingPrice field
     */
    public AuctionInterestClearingPriceField auctionInterestClearingPrice() {
        return auctionInterestClearingPrice;
    }

    /**
     * For NYSE non-Significant imbalances, if a Sell Short Restriction is in effect, the price at which Sell Short interest will be filed.
     *
     * @return the SsrFilingPrice field
     */
    public SsrFilingPriceField ssrFilingPrice() {
        return ssrFilingPrice;
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
     * Upper boundary for the Indicative Match Price.
     *
     * @return the UpperCollar field
     */
    public UpperCollarField upperCollar() {
        return upperCollar;
    }

    /**
     * Lower boundary for the Indicative Match Price.
     *
     * @return the LowerCollar field
     */
    public LowerCollarField lowerCollar() {
        return lowerCollar;
    }

    /**
     * Indicates whether the auction will run.
     *
     * @return the AuctionStatus field
     */
    public AuctionStatusField auctionStatus() {
        return auctionStatus;
    }

    /**
     * Indicates an Imbalance Freeze for the auction.
     *
     * @return the FreezeStatus field
     */
    public FreezeStatusField freezeStatus() {
        return freezeStatus;
    }

    /**
     * The number of times a halt period has been extended
     *
     * @return the NumExtensions field
     */
    public NumExtensionsField numExtensions() {
        return numExtensions;
    }

    /**
     * The number of unpaired shares priced at or better than the Reference Price.
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
        if (buffer != null && buffer.length >= 69) {
            System.arraycopy(buffer, 68, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
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
