package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.LeavesQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.OrderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.QuoteSymbolField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.QuoteUpdateIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.RestatementReasonField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.SideField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.TransactionTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.WorkingPriceField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.PrintOptions;

/**
 * Represents the QuoteRestated message from the BinaryOrderEntry protocol.
 *
 * <p>Quote Restatedmessages are sent to inform the TPH that an order has been asynchronously modified for some reason by CFE</p>
 */
public final class QuoteRestated implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 52;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Restated";

    /**
     * The time the event occurred in the CFE Matching Engine (not the time the message was sent)
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Id chosen by the client
     */
    private final QuoteUpdateIdField quoteUpdateId = new QuoteUpdateIdField();

    /**
     * Order identifier supplied by CFE
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Quantity still open for further execution
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * The price at which the quote is working on the order book
     */
    private final WorkingPriceField workingPrice = new WorkingPriceField();

    /**
     * CFE native identifier of the instrument being quoted
     */
    private final QuoteSymbolField quoteSymbol = new QuoteSymbolField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * The reason for this Quote Restated message
     */
    private final RestatementReasonField restatementReason = new RestatementReasonField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, quoteUpdateId, orderId, leavesQty, workingPrice, quoteSymbol, side, restatementReason);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the CFE Matching Engine (not the time the message was sent)
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Id chosen by the client
     *
     * @return the QuoteUpdateId field
     */
    public QuoteUpdateIdField quoteUpdateId() {
        return quoteUpdateId;
    }

    /**
     * Order identifier supplied by CFE
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Quantity still open for further execution
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * The price at which the quote is working on the order book
     *
     * @return the WorkingPrice field
     */
    public WorkingPriceField workingPrice() {
        return workingPrice;
    }

    /**
     * CFE native identifier of the instrument being quoted
     *
     * @return the QuoteSymbol field
     */
    public QuoteSymbolField quoteSymbol() {
        return quoteSymbol;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * The reason for this Quote Restated message
     *
     * @return the RestatementReason field
     */
    public RestatementReasonField restatementReason() {
        return restatementReason;
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
        return Optional.ofNullable(transactionTime.value());
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
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!quoteUpdateId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteUpdateIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!workingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += WorkingPriceField.BYTE_LENGTH;
        if (!quoteSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteSymbolField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        return restatementReason.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = quoteUpdateId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = workingPrice.encode(data, cursor);
        cursor = quoteSymbol.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = restatementReason.encode(data, cursor);
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
            case "TransactionTime" -> Optional.of(transactionTime);
            case "QuoteUpdateId" -> Optional.of(quoteUpdateId);
            case "OrderId" -> Optional.of(orderId);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "WorkingPrice" -> Optional.of(workingPrice);
            case "QuoteSymbol" -> Optional.of(quoteSymbol);
            case "Side" -> Optional.of(side);
            case "RestatementReason" -> Optional.of(restatementReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteRestated message)) {
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
        if (!(other instanceof QuoteRestated message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
