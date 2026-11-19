package omi.lseg.turquoise.recovery.gtp.v24_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.BidLimitPriceField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.BidLimitSizeField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.BidMarketSizeField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.InstrumentField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.OfferLimitPriceField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.OfferLimitSizeField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.OfferMarketSizeField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.OrderBookTypeField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.SourceVenueField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.TimestampField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.TopOfBookFlagsField;
import omi.lseg.turquoise.recovery.gtp.v24_4.types.Field;
import omi.lseg.turquoise.recovery.gtp.v24_4.types.Message;
import omi.lseg.turquoise.recovery.gtp.v24_4.types.PrintOptions;

/**
 * Represents the TopOfBookMessage message from the Recovery protocol.
 *
 * <p>Used to update the level 1 service following any change to the consolidated Best Bid and Offer</p>
 */
public final class TopOfBookMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 84;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Top Of Book Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 34, 8, 66, 8 };

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * GTP Instrument identifier if Request Level is 0. Blank if not.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Mandatory field if Request Level = 1. Not considered for other Request Levels.
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * Aggregated size of all bid market orders. Value will be 0 if there are no market orders.
     */
    private final BidMarketSizeField bidMarketSize = new BidMarketSizeField();

    /**
     * Price of the best buy limit order
     */
    private final BidLimitPriceField bidLimitPrice = new BidLimitPriceField();

    /**
     * Aggregated size of all orders at the best buy limit price.
     */
    private final BidLimitSizeField bidLimitSize = new BidLimitSizeField();

    /**
     * Aggregated size of all offer market orders. Value will be 0 if there are no market orders.
     */
    private final OfferMarketSizeField offerMarketSize = new OfferMarketSizeField();

    /**
     * Price of the best sell limit order
     */
    private final OfferLimitPriceField offerLimitPrice = new OfferLimitPriceField();

    /**
     * Aggregated size of all orders at the best sell limit price.
     */
    private final OfferLimitSizeField offerLimitSize = new OfferLimitSizeField();

    /**
     * Order book the status applies to.
     */
    private final OrderBookTypeField orderBookType = new OrderBookTypeField();

    /**
     * Top of Book Flags
     */
    private final TopOfBookFlagsField topOfBookFlags = new TopOfBookFlagsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrument, sourceVenue, bidMarketSize, bidLimitPrice, bidLimitSize, offerMarketSize, offerLimitPrice, offerLimitSize, orderBookType, topOfBookFlags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the message was generated.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * GTP Instrument identifier if Request Level is 0. Blank if not.
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * Mandatory field if Request Level = 1. Not considered for other Request Levels.
     *
     * @return the SourceVenue field
     */
    public SourceVenueField sourceVenue() {
        return sourceVenue;
    }

    /**
     * Aggregated size of all bid market orders. Value will be 0 if there are no market orders.
     *
     * @return the BidMarketSize field
     */
    public BidMarketSizeField bidMarketSize() {
        return bidMarketSize;
    }

    /**
     * Price of the best buy limit order
     *
     * @return the BidLimitPrice field
     */
    public BidLimitPriceField bidLimitPrice() {
        return bidLimitPrice;
    }

    /**
     * Aggregated size of all orders at the best buy limit price.
     *
     * @return the BidLimitSize field
     */
    public BidLimitSizeField bidLimitSize() {
        return bidLimitSize;
    }

    /**
     * Aggregated size of all offer market orders. Value will be 0 if there are no market orders.
     *
     * @return the OfferMarketSize field
     */
    public OfferMarketSizeField offerMarketSize() {
        return offerMarketSize;
    }

    /**
     * Price of the best sell limit order
     *
     * @return the OfferLimitPrice field
     */
    public OfferLimitPriceField offerLimitPrice() {
        return offerLimitPrice;
    }

    /**
     * Aggregated size of all orders at the best sell limit price.
     *
     * @return the OfferLimitSize field
     */
    public OfferLimitSizeField offerLimitSize() {
        return offerLimitSize;
    }

    /**
     * Order book the status applies to.
     *
     * @return the OrderBookType field
     */
    public OrderBookTypeField orderBookType() {
        return orderBookType;
    }

    /**
     * Top of Book Flags
     *
     * @return the TopOfBookFlags field
     */
    public TopOfBookFlagsField topOfBookFlags() {
        return topOfBookFlags;
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
        return Optional.ofNullable(timestampField.value());
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!sourceVenue.parse(data, cursor)) {
            return false;
        }
        cursor += SourceVenueField.BYTE_LENGTH;
        if (!bidMarketSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidMarketSizeField.BYTE_LENGTH;
        if (!bidLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidLimitPriceField.BYTE_LENGTH;
        cursor += 8; // padding
        if (!bidLimitSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidLimitSizeField.BYTE_LENGTH;
        if (!offerMarketSize.parse(data, cursor)) {
            return false;
        }
        cursor += OfferMarketSizeField.BYTE_LENGTH;
        if (!offerLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OfferLimitPriceField.BYTE_LENGTH;
        cursor += 8; // padding
        if (!offerLimitSize.parse(data, cursor)) {
            return false;
        }
        cursor += OfferLimitSizeField.BYTE_LENGTH;
        if (!orderBookType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookTypeField.BYTE_LENGTH;
        return topOfBookFlags.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = sourceVenue.encode(data, cursor);
        cursor = bidMarketSize.encode(data, cursor);
        cursor = bidLimitPrice.encode(data, cursor);
        if (buffer != null && buffer.length >= 42) {
            System.arraycopy(buffer, 34, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = bidLimitSize.encode(data, cursor);
        cursor = offerMarketSize.encode(data, cursor);
        cursor = offerLimitPrice.encode(data, cursor);
        if (buffer != null && buffer.length >= 74) {
            System.arraycopy(buffer, 66, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = offerLimitSize.encode(data, cursor);
        cursor = orderBookType.encode(data, cursor);
        cursor = topOfBookFlags.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "Instrument" -> Optional.of(instrument);
            case "SourceVenue" -> Optional.of(sourceVenue);
            case "BidMarketSize" -> Optional.of(bidMarketSize);
            case "BidLimitPrice" -> Optional.of(bidLimitPrice);
            case "BidLimitSize" -> Optional.of(bidLimitSize);
            case "OfferMarketSize" -> Optional.of(offerMarketSize);
            case "OfferLimitPrice" -> Optional.of(offerLimitPrice);
            case "OfferLimitSize" -> Optional.of(offerLimitSize);
            case "OrderBookType" -> Optional.of(orderBookType);
            case "TopOfBookFlags" -> Optional.of(topOfBookFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TopOfBookMessage message)) {
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
        if (!(other instanceof TopOfBookMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
