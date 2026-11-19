package omi.txse.txseequities.bale.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.bale.rake.v1_0.fields.AskPriceField;
import omi.txse.txseequities.bale.rake.v1_0.fields.AskQtyField;
import omi.txse.txseequities.bale.rake.v1_0.fields.BidPriceField;
import omi.txse.txseequities.bale.rake.v1_0.fields.BidQtyField;
import omi.txse.txseequities.bale.rake.v1_0.fields.SymbolIdField;
import omi.txse.txseequities.bale.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.bale.rake.v1_0.types.Field;
import omi.txse.txseequities.bale.rake.v1_0.types.Message;
import omi.txse.txseequities.bale.rake.v1_0.types.PrintOptions;

/**
 * Represents the TopOfBookMessage message from the Bale protocol.
 *
 * <p>Current best bid and offer for a symbol. The BBO is the most aggressive price at which cumulative displayed liquidity reaches a round lot. Quantity is the total displayed shares at the BBO price combined with any displayed shares at more aggressive prices on that side. Price and quantity are zero when cumulative displayed liquidity does not reach a round lot. A TopOfBook is published whenever a depth change occurs at or inside the current BBO on the affected side. A TopOfBook may be published with values identical to the previous one if the net result for the BBO happens to be unchanged after a relevant quantity change. When an execution causes both Trade and TopOfBook messages, all Trade messages from that execution event are delivered before the TopOfBook that reflects the resulting depth change.</p>
 */
public final class TopOfBookMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'q';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Top Of Book Message";

    /**
     * Transaction time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Symbol identifier
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Best bid price. Zero when cumulative displayed bid liquidity does not reach a round lot.
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * Total cumulative displayed quantity at the BBO bid price and all more aggressive bid prices. Zero when cumulative displayed bid liquidity does not reach a round lot. Capped at the maximum value of a 32-bit signed integer; when the cumulative displayed quantity reaches this cap, the field indicates at least that many shares rather than an exact count.
     */
    private final BidQtyField bidQty = new BidQtyField();

    /**
     * Best ask price. Zero when cumulative displayed ask liquidity does not reach a round lot.
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * Total cumulative displayed quantity at the BBO ask price and all more aggressive ask prices. Zero when cumulative displayed ask liquidity does not reach a round lot. Capped at the maximum value of a 32-bit signed integer; when the cumulative displayed quantity reaches this cap, the field indicates at least that many shares rather than an exact count.
     */
    private final AskQtyField askQty = new AskQtyField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, symbolId, bidPrice, bidQty, askPrice, askQty);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Transaction time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Symbol identifier
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Best bid price. Zero when cumulative displayed bid liquidity does not reach a round lot.
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * Total cumulative displayed quantity at the BBO bid price and all more aggressive bid prices. Zero when cumulative displayed bid liquidity does not reach a round lot. Capped at the maximum value of a 32-bit signed integer; when the cumulative displayed quantity reaches this cap, the field indicates at least that many shares rather than an exact count.
     *
     * @return the BidQty field
     */
    public BidQtyField bidQty() {
        return bidQty;
    }

    /**
     * Best ask price. Zero when cumulative displayed ask liquidity does not reach a round lot.
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * Total cumulative displayed quantity at the BBO ask price and all more aggressive ask prices. Zero when cumulative displayed ask liquidity does not reach a round lot. Capped at the maximum value of a 32-bit signed integer; when the cumulative displayed quantity reaches this cap, the field indicates at least that many shares rather than an exact count.
     *
     * @return the AskQty field
     */
    public AskQtyField askQty() {
        return askQty;
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
        return Optional.ofNullable(transactTime.value());
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
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!bidQty.parse(data, cursor)) {
            return false;
        }
        cursor += BidQtyField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        return askQty.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidQty.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = askQty.encode(data, cursor);
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
            case "TransactTime" -> Optional.of(transactTime);
            case "SymbolId" -> Optional.of(symbolId);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidQty" -> Optional.of(bidQty);
            case "AskPrice" -> Optional.of(askPrice);
            case "AskQty" -> Optional.of(askQty);
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
