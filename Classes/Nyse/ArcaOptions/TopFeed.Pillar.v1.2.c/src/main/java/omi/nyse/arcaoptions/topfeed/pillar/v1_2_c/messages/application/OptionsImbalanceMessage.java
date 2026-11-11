package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.AuctionInterestClearingPriceField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.AuctionStatusField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.AuctionTypeField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.ContinuousBookClearingPriceField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.ImbalanceSideField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.IndicativeMatchPriceField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.LowerCollarField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.MarketImbalanceQtyField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.PairedQtyField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.SeriesIndexField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.SeriesSeqNumField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.SourceTimeField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.SourceTimeNsField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.TotalImbalanceQtyField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.fields.UpperCollarField;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.types.Field;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.types.Message;
import omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.types.PrintOptions;

/**
 * Represents the OptionsImbalanceMessage message from the TopFeed protocol.
 *
 * <p>Options Imbalance messages are published once a second during opening and reopening auctions to update price and volume information</p>
 */
public final class OptionsImbalanceMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 61;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Options Imbalance Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 16, 4, 32, 2, 44, 4 };

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * The nanosecond offset from the SourceTime
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * The unique ID of this series for all products within this market
     */
    private final SeriesIndexField seriesIndex = new SeriesIndexField();

    /**
     * The unique ID of this message in the sequence of messages published for this specific series
     */
    private final SeriesSeqNumField seriesSeqNum = new SeriesSeqNumField();

    /**
     * The number of contracts paired off at the Indicative Match Price.
     */
    private final PairedQtyField pairedQty = new PairedQtyField();

    /**
     * The total imbalance quantity at the Indicative Match Price.
     */
    private final TotalImbalanceQtyField totalImbalanceQty = new TotalImbalanceQtyField();

    /**
     * The total market order imbalance quantity at the Indicative Match Price.
     */
    private final MarketImbalanceQtyField marketImbalanceQty = new MarketImbalanceQtyField();

    /**
     * AuctionType
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * The side of the TotalImbalanceQty
     */
    private final ImbalanceSideField imbalanceSide = new ImbalanceSideField();

    /**
     * The price at which all interest on the book can trade, including auction and imbalance offset interest, and disregarding auction collars.
     */
    private final ContinuousBookClearingPriceField continuousBookClearingPrice = new ContinuousBookClearingPriceField();

    /**
     * The price at which all eligible auction-only interest would trade, subject to auction collars.
     */
    private final AuctionInterestClearingPriceField auctionInterestClearingPrice = new AuctionInterestClearingPriceField();

    /**
     * The price at which the highest number of contracts would trade, subject to auction collars. It includes the non-displayed quantity of Reserve Orders. See Information on Auctions for details.
     */
    private final IndicativeMatchPriceField indicativeMatchPrice = new IndicativeMatchPriceField();

    /**
     * Legal width bid for option
     */
    private final UpperCollarField upperCollar = new UpperCollarField();

    /**
     * Legal width offer for option
     */
    private final LowerCollarField lowerCollar = new LowerCollarField();

    /**
     * Indicates whether the auction will run
     */
    private final AuctionStatusField auctionStatus = new AuctionStatusField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceTimeNs, seriesIndex, seriesSeqNum, pairedQty, totalImbalanceQty, marketImbalanceQty, auctionType, imbalanceSide, continuousBookClearingPrice, auctionInterestClearingPrice, indicativeMatchPrice, upperCollar, lowerCollar, auctionStatus);

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
     * The unique ID of this series for all products within this market
     *
     * @return the SeriesIndex field
     */
    public SeriesIndexField seriesIndex() {
        return seriesIndex;
    }

    /**
     * The unique ID of this message in the sequence of messages published for this specific series
     *
     * @return the SeriesSeqNum field
     */
    public SeriesSeqNumField seriesSeqNum() {
        return seriesSeqNum;
    }

    /**
     * The number of contracts paired off at the Indicative Match Price.
     *
     * @return the PairedQty field
     */
    public PairedQtyField pairedQty() {
        return pairedQty;
    }

    /**
     * The total imbalance quantity at the Indicative Match Price.
     *
     * @return the TotalImbalanceQty field
     */
    public TotalImbalanceQtyField totalImbalanceQty() {
        return totalImbalanceQty;
    }

    /**
     * The total market order imbalance quantity at the Indicative Match Price.
     *
     * @return the MarketImbalanceQty field
     */
    public MarketImbalanceQtyField marketImbalanceQty() {
        return marketImbalanceQty;
    }

    /**
     * AuctionType
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
     * The price at which all interest on the book can trade, including auction and imbalance offset interest, and disregarding auction collars.
     *
     * @return the ContinuousBookClearingPrice field
     */
    public ContinuousBookClearingPriceField continuousBookClearingPrice() {
        return continuousBookClearingPrice;
    }

    /**
     * The price at which all eligible auction-only interest would trade, subject to auction collars.
     *
     * @return the AuctionInterestClearingPrice field
     */
    public AuctionInterestClearingPriceField auctionInterestClearingPrice() {
        return auctionInterestClearingPrice;
    }

    /**
     * The price at which the highest number of contracts would trade, subject to auction collars. It includes the non-displayed quantity of Reserve Orders. See Information on Auctions for details.
     *
     * @return the IndicativeMatchPrice field
     */
    public IndicativeMatchPriceField indicativeMatchPrice() {
        return indicativeMatchPrice;
    }

    /**
     * Legal width bid for option
     *
     * @return the UpperCollar field
     */
    public UpperCollarField upperCollar() {
        return upperCollar;
    }

    /**
     * Legal width offer for option
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
        cursor += 4; // padding
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
        cursor += 2; // padding
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
        cursor += 4; // padding
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
        return auctionStatus.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceTime.encode(data, cursor);
        cursor = sourceTimeNs.encode(data, cursor);
        cursor = seriesIndex.encode(data, cursor);
        cursor = seriesSeqNum.encode(data, cursor);
        if (buffer != null && buffer.length >= 20) {
            System.arraycopy(buffer, 16, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = pairedQty.encode(data, cursor);
        cursor = totalImbalanceQty.encode(data, cursor);
        cursor = marketImbalanceQty.encode(data, cursor);
        if (buffer != null && buffer.length >= 34) {
            System.arraycopy(buffer, 32, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = auctionType.encode(data, cursor);
        cursor = imbalanceSide.encode(data, cursor);
        cursor = continuousBookClearingPrice.encode(data, cursor);
        cursor = auctionInterestClearingPrice.encode(data, cursor);
        if (buffer != null && buffer.length >= 48) {
            System.arraycopy(buffer, 44, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = indicativeMatchPrice.encode(data, cursor);
        cursor = upperCollar.encode(data, cursor);
        cursor = lowerCollar.encode(data, cursor);
        cursor = auctionStatus.encode(data, cursor);
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
            case "PairedQty" -> Optional.of(pairedQty);
            case "TotalImbalanceQty" -> Optional.of(totalImbalanceQty);
            case "MarketImbalanceQty" -> Optional.of(marketImbalanceQty);
            case "AuctionType" -> Optional.of(auctionType);
            case "ImbalanceSide" -> Optional.of(imbalanceSide);
            case "ContinuousBookClearingPrice" -> Optional.of(continuousBookClearingPrice);
            case "AuctionInterestClearingPrice" -> Optional.of(auctionInterestClearingPrice);
            case "IndicativeMatchPrice" -> Optional.of(indicativeMatchPrice);
            case "UpperCollar" -> Optional.of(upperCollar);
            case "LowerCollar" -> Optional.of(lowerCollar);
            case "AuctionStatus" -> Optional.of(auctionStatus);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OptionsImbalanceMessage message)) {
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
        if (!(other instanceof OptionsImbalanceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
