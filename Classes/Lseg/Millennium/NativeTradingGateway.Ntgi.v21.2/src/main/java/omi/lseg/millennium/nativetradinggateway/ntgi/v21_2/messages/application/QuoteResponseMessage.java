package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.BidIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.CapacityField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ClearingAccountField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.InstrumentIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.LimitPriceField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OfferIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OrderBookField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OrderQuantityField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.PartitionIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.QuoteMsgIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.QuoteRespTypeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.RfqIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.SequenceNumberField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.SideField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Message;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.PrintOptions;

/**
 * Represents the QuoteResponseMessage message from the NativeTradingGateway protocol.
 *
 * <p>Carries an RFQ response. Sent by the Requester to execute or cancel an RFQ Quote, and by the server to report quote and RFQ status.</p>
 */
public final class QuoteResponseMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'f';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 88;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Response Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 80, 8 };

    /**
     * The server will stamp the identifier of the matching partition for the instrument
     */
    private final PartitionIdField partitionId = new PartitionIdField();

    /**
     * The server will stamp the message sequence number of the matching partition.
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Identifier specified by the client in the RFQ modification/cancellation/execution request.
     */
    private final QuoteMsgIdField quoteMsgId = new QuoteMsgIdField();

    /**
     * Identifier of the initial RFQ by the Requester.
     */
    private final RfqIdField rfqId = new RfqIdField();

    /**
     * Quote Resp Type
     */
    private final QuoteRespTypeField quoteRespType = new QuoteRespTypeField();

    /**
     * Identifier of the instrument for which the order is submitted.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Side of the order.
     */
    private final SideField side = new SideField();

    /**
     * Quantity that the Requester is expecting to trade.
     */
    private final OrderQuantityField orderQuantity = new OrderQuantityField();

    /**
     * Limit Price.
     */
    private final LimitPriceField limitPrice = new LimitPriceField();

    /**
     * Order Book
     */
    private final OrderBookField orderBook = new OrderBookField();

    /**
     * Unique identifier assigned to the bid side of the quote.
     */
    private final BidIdField bidId = new BidIdField();

    /**
     * Unique identifier assigned to the offer side of the quote.
     */
    private final OfferIdField offerId = new OfferIdField();

    /**
     * Capacity of the order.
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Clearing Account Type.
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(partitionId, sequenceNumber, quoteMsgId, rfqId, quoteRespType, instrumentId, side, orderQuantity, limitPrice, orderBook, bidId, offerId, capacity, clearingAccount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The server will stamp the identifier of the matching partition for the instrument
     *
     * @return the PartitionId field
     */
    public PartitionIdField partitionId() {
        return partitionId;
    }

    /**
     * The server will stamp the message sequence number of the matching partition.
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Identifier specified by the client in the RFQ modification/cancellation/execution request.
     *
     * @return the QuoteMsgId field
     */
    public QuoteMsgIdField quoteMsgId() {
        return quoteMsgId;
    }

    /**
     * Identifier of the initial RFQ by the Requester.
     *
     * @return the RfqId field
     */
    public RfqIdField rfqId() {
        return rfqId;
    }

    /**
     * Quote Resp Type
     *
     * @return the QuoteRespType field
     */
    public QuoteRespTypeField quoteRespType() {
        return quoteRespType;
    }

    /**
     * Identifier of the instrument for which the order is submitted.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Side of the order.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Quantity that the Requester is expecting to trade.
     *
     * @return the OrderQuantity field
     */
    public OrderQuantityField orderQuantity() {
        return orderQuantity;
    }

    /**
     * Limit Price.
     *
     * @return the LimitPrice field
     */
    public LimitPriceField limitPrice() {
        return limitPrice;
    }

    /**
     * Order Book
     *
     * @return the OrderBook field
     */
    public OrderBookField orderBook() {
        return orderBook;
    }

    /**
     * Unique identifier assigned to the bid side of the quote.
     *
     * @return the BidId field
     */
    public BidIdField bidId() {
        return bidId;
    }

    /**
     * Unique identifier assigned to the offer side of the quote.
     *
     * @return the OfferId field
     */
    public OfferIdField offerId() {
        return offerId;
    }

    /**
     * Capacity of the order.
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Clearing Account Type.
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!partitionId.parse(data, cursor)) {
            return false;
        }
        cursor += PartitionIdField.BYTE_LENGTH;
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!quoteMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteMsgIdField.BYTE_LENGTH;
        if (!rfqId.parse(data, cursor)) {
            return false;
        }
        cursor += RfqIdField.BYTE_LENGTH;
        if (!quoteRespType.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteRespTypeField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQuantityField.BYTE_LENGTH;
        if (!limitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LimitPriceField.BYTE_LENGTH;
        if (!orderBook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookField.BYTE_LENGTH;
        if (!bidId.parse(data, cursor)) {
            return false;
        }
        cursor += BidIdField.BYTE_LENGTH;
        if (!offerId.parse(data, cursor)) {
            return false;
        }
        cursor += OfferIdField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = partitionId.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = quoteMsgId.encode(data, cursor);
        cursor = rfqId.encode(data, cursor);
        cursor = quoteRespType.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderQuantity.encode(data, cursor);
        cursor = limitPrice.encode(data, cursor);
        cursor = orderBook.encode(data, cursor);
        cursor = bidId.encode(data, cursor);
        cursor = offerId.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        if (buffer != null && buffer.length >= 88) {
            System.arraycopy(buffer, 80, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
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
            case "PartitionId" -> Optional.of(partitionId);
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "QuoteMsgId" -> Optional.of(quoteMsgId);
            case "RfqId" -> Optional.of(rfqId);
            case "QuoteRespType" -> Optional.of(quoteRespType);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "Side" -> Optional.of(side);
            case "OrderQuantity" -> Optional.of(orderQuantity);
            case "LimitPrice" -> Optional.of(limitPrice);
            case "OrderBook" -> Optional.of(orderBook);
            case "BidId" -> Optional.of(bidId);
            case "OfferId" -> Optional.of(offerId);
            case "Capacity" -> Optional.of(capacity);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteResponseMessage message)) {
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
        if (!(other instanceof QuoteResponseMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
