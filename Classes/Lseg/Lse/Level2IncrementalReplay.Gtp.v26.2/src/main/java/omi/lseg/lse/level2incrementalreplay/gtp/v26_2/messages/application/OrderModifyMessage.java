package omi.lseg.lse.level2incrementalreplay.gtp.v26_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.fields.InstrumentField;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.fields.NewPriceField;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.fields.NewQuantityField;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.fields.OrderBookTypeField;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.fields.OrderIdField;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.fields.OrderModifyFlagsField;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.fields.PreviousPriceField;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.fields.PreviousQuantityField;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.fields.SideField;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.fields.SourceVenueField;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.fields.TimestampField;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.fields.TransactionTimeField;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.types.Field;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.types.Message;
import omi.lseg.lse.level2incrementalreplay.gtp.v26_2.types.PrintOptions;

/**
 * Represents the OrderModifyMessage message from the Level2IncrementalReplay protocol.
 *
 * <p>Sent to instruct recipients to update an order's price and/or size on the retrospective order book.</p>
 */
public final class OrderModifyMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 77;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Modify Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 43, 8 };

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Unique identifier of the order.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * GTP Instrument identifier.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Side of the order.
     */
    private final SideField side = new SideField();

    /**
     * Order Modify Flags
     */
    private final OrderModifyFlagsField orderModifyFlags = new OrderModifyFlagsField();

    /**
     * Order book the status applies to.
     */
    private final OrderBookTypeField orderBookType = new OrderBookTypeField();

    /**
     * New displayed quantity of the order.
     */
    private final NewQuantityField newQuantity = new NewQuantityField();

    /**
     * New price of the order.
     */
    private final NewPriceField newPrice = new NewPriceField();

    /**
     * Venue from which market data is received for the instrument.
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * Previous price of the order.
     */
    private final PreviousPriceField previousPrice = new PreviousPriceField();

    /**
     * Previous displayed quantity of the order.
     */
    private final PreviousQuantityField previousQuantity = new PreviousQuantityField();

    /**
     * Transaction execution timestamp as reported by the upstream system.
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, orderId, instrument, side, orderModifyFlags, orderBookType, newQuantity, newPrice, sourceVenue, previousPrice, previousQuantity, transactionTime);

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
     * Unique identifier of the order.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
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
     * Side of the order.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Order Modify Flags
     *
     * @return the OrderModifyFlags field
     */
    public OrderModifyFlagsField orderModifyFlags() {
        return orderModifyFlags;
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
     * New displayed quantity of the order.
     *
     * @return the NewQuantity field
     */
    public NewQuantityField newQuantity() {
        return newQuantity;
    }

    /**
     * New price of the order.
     *
     * @return the NewPrice field
     */
    public NewPriceField newPrice() {
        return newPrice;
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
     * Previous price of the order.
     *
     * @return the PreviousPrice field
     */
    public PreviousPriceField previousPrice() {
        return previousPrice;
    }

    /**
     * Previous displayed quantity of the order.
     *
     * @return the PreviousQuantity field
     */
    public PreviousQuantityField previousQuantity() {
        return previousQuantity;
    }

    /**
     * Transaction execution timestamp as reported by the upstream system.
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
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
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderModifyFlags.parse(data, cursor)) {
            return false;
        }
        cursor += OrderModifyFlagsField.BYTE_LENGTH;
        if (!orderBookType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookTypeField.BYTE_LENGTH;
        if (!newQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += NewQuantityField.BYTE_LENGTH;
        if (!newPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NewPriceField.BYTE_LENGTH;
        cursor += 8; // padding
        if (!sourceVenue.parse(data, cursor)) {
            return false;
        }
        cursor += SourceVenueField.BYTE_LENGTH;
        if (!previousPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousPriceField.BYTE_LENGTH;
        if (!previousQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousQuantityField.BYTE_LENGTH;
        return transactionTime.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderModifyFlags.encode(data, cursor);
        cursor = orderBookType.encode(data, cursor);
        cursor = newQuantity.encode(data, cursor);
        cursor = newPrice.encode(data, cursor);
        if (buffer != null && buffer.length >= 51) {
            System.arraycopy(buffer, 43, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = sourceVenue.encode(data, cursor);
        cursor = previousPrice.encode(data, cursor);
        cursor = previousQuantity.encode(data, cursor);
        cursor = transactionTime.encode(data, cursor);
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
            case "OrderId" -> Optional.of(orderId);
            case "Instrument" -> Optional.of(instrument);
            case "Side" -> Optional.of(side);
            case "OrderModifyFlags" -> Optional.of(orderModifyFlags);
            case "OrderBookType" -> Optional.of(orderBookType);
            case "NewQuantity" -> Optional.of(newQuantity);
            case "NewPrice" -> Optional.of(newPrice);
            case "SourceVenue" -> Optional.of(sourceVenue);
            case "PreviousPrice" -> Optional.of(previousPrice);
            case "PreviousQuantity" -> Optional.of(previousQuantity);
            case "TransactionTime" -> Optional.of(transactionTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderModifyMessage message)) {
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
        if (!(other instanceof OrderModifyMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
