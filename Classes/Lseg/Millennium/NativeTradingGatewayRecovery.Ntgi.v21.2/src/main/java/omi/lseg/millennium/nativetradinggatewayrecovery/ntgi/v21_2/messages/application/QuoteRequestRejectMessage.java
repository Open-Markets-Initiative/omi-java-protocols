package omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ContraTraderField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.InstrumentIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.MarketMakersField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.OrderBookField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.OrderQuantityField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.PartitionIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.QuoteReqIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.RejectCodeField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.RfqIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.SequenceNumberField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.SideField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.Message;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.PrintOptions;

/**
 * Represents the QuoteRequestRejectMessage message from the NativeTradingGatewayRecovery protocol.
 *
 * <p>Rejects an RFQ. Sent by the Market Maker to reject, and by the server to reject or to relay a Market Maker rejection.</p>
 */
public final class QuoteRequestRejectMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'b';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 110;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Request Reject Message";

    /**
     * The server will stamp the identifier of the matching partition for the instrument
     */
    private final PartitionIdField partitionId = new PartitionIdField();

    /**
     * The server will stamp the message sequence number of the matching partition.
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Client specified identifier of the RFQ.
     */
    private final QuoteReqIdField quoteReqId = new QuoteReqIdField();

    /**
     * Code specifying the reason for the reject.
     */
    private final RejectCodeField rejectCode = new RejectCodeField();

    /**
     * Order Book
     */
    private final OrderBookField orderBook = new OrderBookField();

    /**
     * Identifier of the instrument the Execution Report is sent for.
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
     * Pipe separated list of Firm IDs, if it is required to target this quote request to specific Market Makers.
     */
    private final MarketMakersField marketMakers = new MarketMakersField();

    /**
     * For Named Models only, the server will stamp the User ID of the Requester to send to the Market Maker.
     */
    private final ContraTraderField contraTrader = new ContraTraderField();

    /**
     * The unique identifier of the initial RFQ automatically generated via the server.
     */
    private final RfqIdField rfqId = new RfqIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(partitionId, sequenceNumber, quoteReqId, rejectCode, orderBook, instrumentId, side, orderQuantity, marketMakers, contraTrader, rfqId);

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
     * Client specified identifier of the RFQ.
     *
     * @return the QuoteReqId field
     */
    public QuoteReqIdField quoteReqId() {
        return quoteReqId;
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
     * Identifier of the instrument the Execution Report is sent for.
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
     * Pipe separated list of Firm IDs, if it is required to target this quote request to specific Market Makers.
     *
     * @return the MarketMakers field
     */
    public MarketMakersField marketMakers() {
        return marketMakers;
    }

    /**
     * For Named Models only, the server will stamp the User ID of the Requester to send to the Market Maker.
     *
     * @return the ContraTrader field
     */
    public ContraTraderField contraTrader() {
        return contraTrader;
    }

    /**
     * The unique identifier of the initial RFQ automatically generated via the server.
     *
     * @return the RfqId field
     */
    public RfqIdField rfqId() {
        return rfqId;
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
        if (!quoteReqId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteReqIdField.BYTE_LENGTH;
        if (!rejectCode.parse(data, cursor)) {
            return false;
        }
        cursor += RejectCodeField.BYTE_LENGTH;
        if (!orderBook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookField.BYTE_LENGTH;
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
        if (!marketMakers.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMakersField.BYTE_LENGTH;
        if (!contraTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ContraTraderField.BYTE_LENGTH;
        return rfqId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = partitionId.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = quoteReqId.encode(data, cursor);
        cursor = rejectCode.encode(data, cursor);
        cursor = orderBook.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderQuantity.encode(data, cursor);
        cursor = marketMakers.encode(data, cursor);
        cursor = contraTrader.encode(data, cursor);
        cursor = rfqId.encode(data, cursor);
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
            case "QuoteReqId" -> Optional.of(quoteReqId);
            case "RejectCode" -> Optional.of(rejectCode);
            case "OrderBook" -> Optional.of(orderBook);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "Side" -> Optional.of(side);
            case "OrderQuantity" -> Optional.of(orderQuantity);
            case "MarketMakers" -> Optional.of(marketMakers);
            case "ContraTrader" -> Optional.of(contraTrader);
            case "RfqId" -> Optional.of(rfqId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteRequestRejectMessage message)) {
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
        if (!(other instanceof QuoteRequestRejectMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
