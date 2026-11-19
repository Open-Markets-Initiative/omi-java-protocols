package omi.lseg.lse.level2incremental.gtp.v26_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.lse.level2incremental.gtp.v26_2.fields.BestBidPriceField;
import omi.lseg.lse.level2incremental.gtp.v26_2.fields.BestBidSizeField;
import omi.lseg.lse.level2incremental.gtp.v26_2.fields.BestOfferPriceField;
import omi.lseg.lse.level2incremental.gtp.v26_2.fields.BestOfferSizeField;
import omi.lseg.lse.level2incremental.gtp.v26_2.fields.DeletedOrderQuantityField;
import omi.lseg.lse.level2incremental.gtp.v26_2.fields.FarPriceField;
import omi.lseg.lse.level2incremental.gtp.v26_2.fields.InstrumentField;
import omi.lseg.lse.level2incremental.gtp.v26_2.fields.SourceVenueField;
import omi.lseg.lse.level2incremental.gtp.v26_2.fields.TimestampField;
import omi.lseg.lse.level2incremental.gtp.v26_2.fields.TotalExecutedQuantityField;
import omi.lseg.lse.level2incremental.gtp.v26_2.fields.TotalHiddenExecutedQuantityField;
import omi.lseg.lse.level2incremental.gtp.v26_2.fields.TradeSummarySideField;
import omi.lseg.lse.level2incremental.gtp.v26_2.fields.TransactionTimeField;
import omi.lseg.lse.level2incremental.gtp.v26_2.types.Field;
import omi.lseg.lse.level2incremental.gtp.v26_2.types.Message;
import omi.lseg.lse.level2incremental.gtp.v26_2.types.PrintOptions;

/**
 * Represents the TradeSummaryMessage message from the Level2Incremental protocol.
 *
 * <p>Trade Summary message is used to disseminate results of multi- and single-fill trade events.</p>
 */
public final class TradeSummaryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 91;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Summary Message";

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * GTP Instrument identifier.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Venue from which market data is received for the instrument.
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * Transaction execution timestamp as reported by the upstream system.
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Far price is the highest price at which volume is depleted as part of the Matching Engine event in case of an aggressing buy order, or the lowest price at which volume is depleted in case of an aggressing sell order. Determined by considering all trades in one Matching Engine event.
     */
    private final FarPriceField farPrice = new FarPriceField();

    /**
     * Total quantity executed (visible &amp; hidden quantity).
     */
    private final TotalExecutedQuantityField totalExecutedQuantity = new TotalExecutedQuantityField();

    /**
     * Total hidden order quantity executed (hidden quantity).
     */
    private final TotalHiddenExecutedQuantityField totalHiddenExecutedQuantity = new TotalHiddenExecutedQuantityField();

    /**
     * Order Quantity deleted due to Self Execution Prevention (SEP) during an execution.
     */
    private final DeletedOrderQuantityField deletedOrderQuantity = new DeletedOrderQuantityField();

    /**
     * The side of the visible passive order(s) that triggered the trade summary.
     */
    private final TradeSummarySideField tradeSummarySide = new TradeSummarySideField();

    /**
     * Aggregated size of all orders at the best buy price available on the book at execution completion. Value will be set to -1 if top of the book is not disclosed.
     */
    private final BestBidSizeField bestBidSize = new BestBidSizeField();

    /**
     * Price of best visible bid available on the book at execution completion. Value will be set to -1 if top of the book is not disclosed. Value will be set to 0 in case of market order is on top of the book.
     */
    private final BestBidPriceField bestBidPrice = new BestBidPriceField();

    /**
     * Aggregated size of all orders at the best sell price available on the book at execution completion. Value will be set to -1 if top of the book is not disclosed.
     */
    private final BestOfferSizeField bestOfferSize = new BestOfferSizeField();

    /**
     * Price of best visible offer available on the book at execution completion. Value will be set to -1 if top of the book is not disclosed. Value will be set to 0 in case of market order is on top of the book.
     */
    private final BestOfferPriceField bestOfferPrice = new BestOfferPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrument, sourceVenue, transactionTime, farPrice, totalExecutedQuantity, totalHiddenExecutedQuantity, deletedOrderQuantity, tradeSummarySide, bestBidSize, bestBidPrice, bestOfferSize, bestOfferPrice);

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
     * GTP Instrument identifier.
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * Venue from which market data is received for the instrument.
     *
     * @return the SourceVenue field
     */
    public SourceVenueField sourceVenue() {
        return sourceVenue;
    }

    /**
     * Transaction execution timestamp as reported by the upstream system.
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Far price is the highest price at which volume is depleted as part of the Matching Engine event in case of an aggressing buy order, or the lowest price at which volume is depleted in case of an aggressing sell order. Determined by considering all trades in one Matching Engine event.
     *
     * @return the FarPrice field
     */
    public FarPriceField farPrice() {
        return farPrice;
    }

    /**
     * Total quantity executed (visible &amp; hidden quantity).
     *
     * @return the TotalExecutedQuantity field
     */
    public TotalExecutedQuantityField totalExecutedQuantity() {
        return totalExecutedQuantity;
    }

    /**
     * Total hidden order quantity executed (hidden quantity).
     *
     * @return the TotalHiddenExecutedQuantity field
     */
    public TotalHiddenExecutedQuantityField totalHiddenExecutedQuantity() {
        return totalHiddenExecutedQuantity;
    }

    /**
     * Order Quantity deleted due to Self Execution Prevention (SEP) during an execution.
     *
     * @return the DeletedOrderQuantity field
     */
    public DeletedOrderQuantityField deletedOrderQuantity() {
        return deletedOrderQuantity;
    }

    /**
     * The side of the visible passive order(s) that triggered the trade summary.
     *
     * @return the TradeSummarySide field
     */
    public TradeSummarySideField tradeSummarySide() {
        return tradeSummarySide;
    }

    /**
     * Aggregated size of all orders at the best buy price available on the book at execution completion. Value will be set to -1 if top of the book is not disclosed.
     *
     * @return the BestBidSize field
     */
    public BestBidSizeField bestBidSize() {
        return bestBidSize;
    }

    /**
     * Price of best visible bid available on the book at execution completion. Value will be set to -1 if top of the book is not disclosed. Value will be set to 0 in case of market order is on top of the book.
     *
     * @return the BestBidPrice field
     */
    public BestBidPriceField bestBidPrice() {
        return bestBidPrice;
    }

    /**
     * Aggregated size of all orders at the best sell price available on the book at execution completion. Value will be set to -1 if top of the book is not disclosed.
     *
     * @return the BestOfferSize field
     */
    public BestOfferSizeField bestOfferSize() {
        return bestOfferSize;
    }

    /**
     * Price of best visible offer available on the book at execution completion. Value will be set to -1 if top of the book is not disclosed. Value will be set to 0 in case of market order is on top of the book.
     *
     * @return the BestOfferPrice field
     */
    public BestOfferPriceField bestOfferPrice() {
        return bestOfferPrice;
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
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!farPrice.parse(data, cursor)) {
            return false;
        }
        cursor += FarPriceField.BYTE_LENGTH;
        if (!totalExecutedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += TotalExecutedQuantityField.BYTE_LENGTH;
        if (!totalHiddenExecutedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += TotalHiddenExecutedQuantityField.BYTE_LENGTH;
        if (!deletedOrderQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += DeletedOrderQuantityField.BYTE_LENGTH;
        if (!tradeSummarySide.parse(data, cursor)) {
            return false;
        }
        cursor += TradeSummarySideField.BYTE_LENGTH;
        if (!bestBidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidSizeField.BYTE_LENGTH;
        if (!bestBidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidPriceField.BYTE_LENGTH;
        if (!bestOfferSize.parse(data, cursor)) {
            return false;
        }
        cursor += BestOfferSizeField.BYTE_LENGTH;
        return bestOfferPrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = sourceVenue.encode(data, cursor);
        cursor = transactionTime.encode(data, cursor);
        cursor = farPrice.encode(data, cursor);
        cursor = totalExecutedQuantity.encode(data, cursor);
        cursor = totalHiddenExecutedQuantity.encode(data, cursor);
        cursor = deletedOrderQuantity.encode(data, cursor);
        cursor = tradeSummarySide.encode(data, cursor);
        cursor = bestBidSize.encode(data, cursor);
        cursor = bestBidPrice.encode(data, cursor);
        cursor = bestOfferSize.encode(data, cursor);
        cursor = bestOfferPrice.encode(data, cursor);
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
            case "TransactionTime" -> Optional.of(transactionTime);
            case "FarPrice" -> Optional.of(farPrice);
            case "TotalExecutedQuantity" -> Optional.of(totalExecutedQuantity);
            case "TotalHiddenExecutedQuantity" -> Optional.of(totalHiddenExecutedQuantity);
            case "DeletedOrderQuantity" -> Optional.of(deletedOrderQuantity);
            case "TradeSummarySide" -> Optional.of(tradeSummarySide);
            case "BestBidSize" -> Optional.of(bestBidSize);
            case "BestBidPrice" -> Optional.of(bestBidPrice);
            case "BestOfferSize" -> Optional.of(bestOfferSize);
            case "BestOfferPrice" -> Optional.of(bestOfferPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeSummaryMessage message)) {
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
        if (!(other instanceof TradeSummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
