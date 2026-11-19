package omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.fields.AuctionOnlyPriceField;
import omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.fields.BuyContractsField;
import omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.fields.ComplexInstrumentIdLongField;
import omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.fields.CompositeMarketBidPriceField;
import omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.fields.CompositeMarketOfferPriceField;
import omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.fields.IndicativePriceField;
import omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.fields.OpeningConditionField;
import omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.fields.OptionsAuctionUpdateAuctionTypeField;
import omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.fields.ReferencePriceField;
import omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.fields.SellContractsField;
import omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.fields.TimeOffsetField;
import omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.types.Field;
import omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.types.Message;
import omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.types.PrintOptions;

/**
 * Represents the OptionsAuctionUpdateMessage message from the ComplexAuction protocol.
 *
 * <p>Options Auction Update messages are used to disseminate price and size information during the Opening and Re-Opening (halt) process for complex instruments. The Options Auction Update messages are sent every five seconds during an opening period. Refer to the Cboe Options Complex Book Process specification for more information.</p>
 */
public final class OptionsAuctionUpdateMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 62;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Options Auction Update Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Complex Instrument right padded with spaces.
     */
    private final ComplexInstrumentIdLongField complexInstrumentIdLong = new ComplexInstrumentIdLongField();

    /**
     * G = GTH Opening (C1 Only), O = RTH Opening (C1 Only), H = Halt Re-Opening.
     */
    private final OptionsAuctionUpdateAuctionTypeField optionsAuctionUpdateAuctionType = new OptionsAuctionUpdateAuctionTypeField();

    /**
     * Not used for complex series. Will contain zero value.
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * Cumulative Buy interest at the Indicative Price.
     */
    private final BuyContractsField buyContracts = new BuyContractsField();

    /**
     * Cumulative Sell interest at the Indicative Price.
     */
    private final SellContractsField sellContracts = new SellContractsField();

    /**
     * SNBBO Collared Volume Maximizing Imbalance Minimizing Price computed on combined Auction-Only and Continuous Book (if any).
     */
    private final IndicativePriceField indicativePrice = new IndicativePriceField();

    /**
     * Not used for complex series. Will contain zero value.
     */
    private final AuctionOnlyPriceField auctionOnlyPrice = new AuctionOnlyPriceField();

    /**
     * Not used for Complex series. Will contain zero value.
     */
    private final OpeningConditionField openingCondition = new OpeningConditionField();

    /**
     * Not used for Complex series. Will contain zero value.
     */
    private final CompositeMarketBidPriceField compositeMarketBidPrice = new CompositeMarketBidPriceField();

    /**
     * Not used for complex series. Will contain zero value.
     */
    private final CompositeMarketOfferPriceField compositeMarketOfferPrice = new CompositeMarketOfferPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, complexInstrumentIdLong, optionsAuctionUpdateAuctionType, referencePrice, buyContracts, sellContracts, indicativePrice, auctionOnlyPrice, openingCondition, compositeMarketBidPrice, compositeMarketOfferPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Complex Instrument right padded with spaces.
     *
     * @return the ComplexInstrumentIdLong field
     */
    public ComplexInstrumentIdLongField complexInstrumentIdLong() {
        return complexInstrumentIdLong;
    }

    /**
     * G = GTH Opening (C1 Only), O = RTH Opening (C1 Only), H = Halt Re-Opening.
     *
     * @return the OptionsAuctionUpdateAuctionType field
     */
    public OptionsAuctionUpdateAuctionTypeField optionsAuctionUpdateAuctionType() {
        return optionsAuctionUpdateAuctionType;
    }

    /**
     * Not used for complex series. Will contain zero value.
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * Cumulative Buy interest at the Indicative Price.
     *
     * @return the BuyContracts field
     */
    public BuyContractsField buyContracts() {
        return buyContracts;
    }

    /**
     * Cumulative Sell interest at the Indicative Price.
     *
     * @return the SellContracts field
     */
    public SellContractsField sellContracts() {
        return sellContracts;
    }

    /**
     * SNBBO Collared Volume Maximizing Imbalance Minimizing Price computed on combined Auction-Only and Continuous Book (if any).
     *
     * @return the IndicativePrice field
     */
    public IndicativePriceField indicativePrice() {
        return indicativePrice;
    }

    /**
     * Not used for complex series. Will contain zero value.
     *
     * @return the AuctionOnlyPrice field
     */
    public AuctionOnlyPriceField auctionOnlyPrice() {
        return auctionOnlyPrice;
    }

    /**
     * Not used for Complex series. Will contain zero value.
     *
     * @return the OpeningCondition field
     */
    public OpeningConditionField openingCondition() {
        return openingCondition;
    }

    /**
     * Not used for Complex series. Will contain zero value.
     *
     * @return the CompositeMarketBidPrice field
     */
    public CompositeMarketBidPriceField compositeMarketBidPrice() {
        return compositeMarketBidPrice;
    }

    /**
     * Not used for complex series. Will contain zero value.
     *
     * @return the CompositeMarketOfferPrice field
     */
    public CompositeMarketOfferPriceField compositeMarketOfferPrice() {
        return compositeMarketOfferPrice;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!complexInstrumentIdLong.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexInstrumentIdLongField.BYTE_LENGTH;
        if (!optionsAuctionUpdateAuctionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionsAuctionUpdateAuctionTypeField.BYTE_LENGTH;
        if (!referencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceField.BYTE_LENGTH;
        if (!buyContracts.parse(data, cursor)) {
            return false;
        }
        cursor += BuyContractsField.BYTE_LENGTH;
        if (!sellContracts.parse(data, cursor)) {
            return false;
        }
        cursor += SellContractsField.BYTE_LENGTH;
        if (!indicativePrice.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativePriceField.BYTE_LENGTH;
        if (!auctionOnlyPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionOnlyPriceField.BYTE_LENGTH;
        if (!openingCondition.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningConditionField.BYTE_LENGTH;
        if (!compositeMarketBidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += CompositeMarketBidPriceField.BYTE_LENGTH;
        return compositeMarketOfferPrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = complexInstrumentIdLong.encode(data, cursor);
        cursor = optionsAuctionUpdateAuctionType.encode(data, cursor);
        cursor = referencePrice.encode(data, cursor);
        cursor = buyContracts.encode(data, cursor);
        cursor = sellContracts.encode(data, cursor);
        cursor = indicativePrice.encode(data, cursor);
        cursor = auctionOnlyPrice.encode(data, cursor);
        cursor = openingCondition.encode(data, cursor);
        cursor = compositeMarketBidPrice.encode(data, cursor);
        cursor = compositeMarketOfferPrice.encode(data, cursor);
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "ComplexInstrumentIdLong" -> Optional.of(complexInstrumentIdLong);
            case "OptionsAuctionUpdateAuctionType" -> Optional.of(optionsAuctionUpdateAuctionType);
            case "ReferencePrice" -> Optional.of(referencePrice);
            case "BuyContracts" -> Optional.of(buyContracts);
            case "SellContracts" -> Optional.of(sellContracts);
            case "IndicativePrice" -> Optional.of(indicativePrice);
            case "AuctionOnlyPrice" -> Optional.of(auctionOnlyPrice);
            case "OpeningCondition" -> Optional.of(openingCondition);
            case "CompositeMarketBidPrice" -> Optional.of(compositeMarketBidPrice);
            case "CompositeMarketOfferPrice" -> Optional.of(compositeMarketOfferPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OptionsAuctionUpdateMessage message)) {
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
        if (!(other instanceof OptionsAuctionUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
