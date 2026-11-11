package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.seed.rake.v1_0.fields.CanceledQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ExecIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ExecPriceField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ExecQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LeavesQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LiquidityIndicatorField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the SelfMatchPreventedMessage message from the Seed protocol.
 *
 * <p>Notification that a self-match was detected and prevented according to the order's self-match prevention instructions. The message reports the quantity that would have executed, the quantity that was canceled, and the remaining quantity still active on the book.</p>
 */
public final class SelfMatchPreventedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Z';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 52;

    /**
     * This message takes the rest of the bytes it is given, so where those bytes end is its own end.
     */
    public static final boolean RUNS_TO_END = true;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Self Match Prevented Message";

    /**
     * Transaction time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Exchange-assigned order identifier.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Client-specified order identifier that must increase with each new order.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * The price at which these shares were executed.
     */
    private final ExecPriceField execPrice = new ExecPriceField();

    /**
     * Execution identifier.
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Number of shares that were executed.
     */
    private final ExecQtyField execQty = new ExecQtyField();

    /**
     * The quantity that was decremented or canceled from this order as a result of the self-match prevention instruction.
     */
    private final CanceledQtyField canceledQty = new CanceledQtyField();

    /**
     * Number of shares that were still available to execute after the modify.
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Enum LiquidityIndicator. Added in 0.14.draft; absent in pre-0.14 senders, so it is a length-tolerant trailing field - present only when the frame extends past the preceding fields.
     */
    private final LiquidityIndicatorField liquidityIndicator = new LiquidityIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, orderId, clOrdId, execPrice, execId, execQty, canceledQty, leavesQty, liquidityIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Transaction time.
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Exchange-assigned order identifier.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Client-specified order identifier that must increase with each new order.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * The price at which these shares were executed.
     *
     * @return the ExecPrice field
     */
    public ExecPriceField execPrice() {
        return execPrice;
    }

    /**
     * Execution identifier.
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * Number of shares that were executed.
     *
     * @return the ExecQty field
     */
    public ExecQtyField execQty() {
        return execQty;
    }

    /**
     * The quantity that was decremented or canceled from this order as a result of the self-match prevention instruction.
     *
     * @return the CanceledQty field
     */
    public CanceledQtyField canceledQty() {
        return canceledQty;
    }

    /**
     * Number of shares that were still available to execute after the modify.
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Enum LiquidityIndicator. Added in 0.14.draft; absent in pre-0.14 senders, so it is a length-tolerant trailing field - present only when the frame extends past the preceding fields.
     *
     * @return the LiquidityIndicator field
     */
    public LiquidityIndicatorField liquidityIndicator() {
        return liquidityIndicator;
    }

    /**
     * Returns whether the fields before the LiquidityIndicator put it on the wire.
     *
     * <p>The LiquidityIndicator is sent while its bytes remain, which only a decode can tell, so it is on the wire when it holds a value.</p>
     *
     * @return true when the LiquidityIndicator is on the wire
     */
    public boolean liquidityIndicatorPresent() {
        return liquidityIndicator.hasValue();
    }

    private boolean onWire(Field field) {
        return (field != liquidityIndicator || liquidityIndicatorPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (liquidityIndicatorPresent() ? LiquidityIndicatorField.BYTE_LENGTH : 0);
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!execPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ExecPriceField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!execQty.parse(data, cursor)) {
            return false;
        }
        cursor += ExecQtyField.BYTE_LENGTH;
        if (!canceledQty.parse(data, cursor)) {
            return false;
        }
        cursor += CanceledQtyField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (end - cursor > 0) {
            if (end - cursor < LiquidityIndicatorField.BYTE_LENGTH || !liquidityIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += LiquidityIndicatorField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = execPrice.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = execQty.encode(data, cursor);
        cursor = canceledQty.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        if (liquidityIndicatorPresent()) {
            cursor = liquidityIndicator.encode(data, cursor);
        }
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
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
        for (Field field : fields()) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields()) {
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
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "TransactTime" -> Optional.of(transactTime);
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "ExecPrice" -> Optional.of(execPrice);
            case "ExecId" -> Optional.of(execId);
            case "ExecQty" -> Optional.of(execQty);
            case "CanceledQty" -> Optional.of(canceledQty);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "LiquidityIndicator" -> Optional.of(liquidityIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SelfMatchPreventedMessage message)) {
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
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
        if (!(other instanceof SelfMatchPreventedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
