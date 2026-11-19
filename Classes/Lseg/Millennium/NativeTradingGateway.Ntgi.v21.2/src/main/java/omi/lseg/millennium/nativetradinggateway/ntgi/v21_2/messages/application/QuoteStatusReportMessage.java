package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.BidIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ExpireTimeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ExpireTimeMillisecondsField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.MarketMakersField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OfferIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OrderBookField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.PartitionIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.QuoteMsgIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.QuoteReqIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.QuoteStatusField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.RejectCodeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.RfqIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.SequenceNumberField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Message;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.PrintOptions;

/**
 * Represents the QuoteStatusReportMessage message from the NativeTradingGateway protocol.
 *
 * <p>Allows the server to communicate the status of the RFQ to the Requester.</p>
 */
public final class QuoteStatusReportMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'c';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 143;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Status Report Message";

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
     * Client specified identifier of the RFQ.
     */
    private final QuoteReqIdField quoteReqId = new QuoteReqIdField();

    /**
     * Quote Status
     */
    private final QuoteStatusField quoteStatus = new QuoteStatusField();

    /**
     * Code specifying the reason for the reject.
     */
    private final RejectCodeField rejectCode = new RejectCodeField();

    /**
     * Order Book
     */
    private final OrderBookField orderBook = new OrderBookField();

    /**
     * Pipe separated list of Firm IDs, if it is required to target this quote request to specific Market Makers.
     */
    private final MarketMakersField marketMakers = new MarketMakersField();

    /**
     * Identifier of the initial RFQ by the Requester.
     */
    private final RfqIdField rfqId = new RfqIdField();

    /**
     * Indicates the date or the time the RFQ expires, in Unix (Posix) time format (number of seconds after 1 January 1970).
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Unique identifier assigned to the bid side of the quote.
     */
    private final BidIdField bidId = new BidIdField();

    /**
     * Unique identifier assigned to the offer side of the quote.
     */
    private final OfferIdField offerId = new OfferIdField();

    /**
     * Indicates the number of milliseconds to be added to the date or the time the RFQ expires on specified in the ‘Expire Time’ field.
     */
    private final ExpireTimeMillisecondsField expireTimeMilliseconds = new ExpireTimeMillisecondsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(partitionId, sequenceNumber, quoteMsgId, quoteReqId, quoteStatus, rejectCode, orderBook, marketMakers, rfqId, expireTime, bidId, offerId, expireTimeMilliseconds);

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
     * Client specified identifier of the RFQ.
     *
     * @return the QuoteReqId field
     */
    public QuoteReqIdField quoteReqId() {
        return quoteReqId;
    }

    /**
     * Quote Status
     *
     * @return the QuoteStatus field
     */
    public QuoteStatusField quoteStatus() {
        return quoteStatus;
    }

    /**
     * Code specifying the reason for the reject.
     *
     * @return the RejectCode field
     */
    public RejectCodeField rejectCode() {
        return rejectCode;
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
     * Pipe separated list of Firm IDs, if it is required to target this quote request to specific Market Makers.
     *
     * @return the MarketMakers field
     */
    public MarketMakersField marketMakers() {
        return marketMakers;
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
     * Indicates the date or the time the RFQ expires, in Unix (Posix) time format (number of seconds after 1 January 1970).
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
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
     * Indicates the number of milliseconds to be added to the date or the time the RFQ expires on specified in the ‘Expire Time’ field.
     *
     * @return the ExpireTimeMilliseconds field
     */
    public ExpireTimeMillisecondsField expireTimeMilliseconds() {
        return expireTimeMilliseconds;
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
        if (!quoteReqId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteReqIdField.BYTE_LENGTH;
        if (!quoteStatus.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteStatusField.BYTE_LENGTH;
        if (!rejectCode.parse(data, cursor)) {
            return false;
        }
        cursor += RejectCodeField.BYTE_LENGTH;
        if (!orderBook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookField.BYTE_LENGTH;
        if (!marketMakers.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMakersField.BYTE_LENGTH;
        if (!rfqId.parse(data, cursor)) {
            return false;
        }
        cursor += RfqIdField.BYTE_LENGTH;
        if (!expireTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireTimeField.BYTE_LENGTH;
        if (!bidId.parse(data, cursor)) {
            return false;
        }
        cursor += BidIdField.BYTE_LENGTH;
        if (!offerId.parse(data, cursor)) {
            return false;
        }
        cursor += OfferIdField.BYTE_LENGTH;
        return expireTimeMilliseconds.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = partitionId.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = quoteMsgId.encode(data, cursor);
        cursor = quoteReqId.encode(data, cursor);
        cursor = quoteStatus.encode(data, cursor);
        cursor = rejectCode.encode(data, cursor);
        cursor = orderBook.encode(data, cursor);
        cursor = marketMakers.encode(data, cursor);
        cursor = rfqId.encode(data, cursor);
        cursor = expireTime.encode(data, cursor);
        cursor = bidId.encode(data, cursor);
        cursor = offerId.encode(data, cursor);
        cursor = expireTimeMilliseconds.encode(data, cursor);
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
            case "QuoteReqId" -> Optional.of(quoteReqId);
            case "QuoteStatus" -> Optional.of(quoteStatus);
            case "RejectCode" -> Optional.of(rejectCode);
            case "OrderBook" -> Optional.of(orderBook);
            case "MarketMakers" -> Optional.of(marketMakers);
            case "RfqId" -> Optional.of(rfqId);
            case "ExpireTime" -> Optional.of(expireTime);
            case "BidId" -> Optional.of(bidId);
            case "OfferId" -> Optional.of(offerId);
            case "ExpireTimeMilliseconds" -> Optional.of(expireTimeMilliseconds);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteStatusReportMessage message)) {
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
        if (!(other instanceof QuoteStatusReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
