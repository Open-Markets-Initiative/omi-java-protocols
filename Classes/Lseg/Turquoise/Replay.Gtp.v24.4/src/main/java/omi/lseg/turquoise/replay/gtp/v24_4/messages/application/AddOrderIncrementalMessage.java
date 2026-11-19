package omi.lseg.turquoise.replay.gtp.v24_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.turquoise.replay.gtp.v24_4.fields.InstrumentField;
import omi.lseg.turquoise.replay.gtp.v24_4.fields.OrderBookTypeField;
import omi.lseg.turquoise.replay.gtp.v24_4.fields.OrderIdField;
import omi.lseg.turquoise.replay.gtp.v24_4.fields.OrderTypeField;
import omi.lseg.turquoise.replay.gtp.v24_4.fields.ParticipantField;
import omi.lseg.turquoise.replay.gtp.v24_4.fields.PriceField;
import omi.lseg.turquoise.replay.gtp.v24_4.fields.RfqIdField;
import omi.lseg.turquoise.replay.gtp.v24_4.fields.SideField;
import omi.lseg.turquoise.replay.gtp.v24_4.fields.SizeField;
import omi.lseg.turquoise.replay.gtp.v24_4.fields.SourceVenueField;
import omi.lseg.turquoise.replay.gtp.v24_4.fields.TimestampField;
import omi.lseg.turquoise.replay.gtp.v24_4.fields.TransactionTimeField;
import omi.lseg.turquoise.replay.gtp.v24_4.types.Field;
import omi.lseg.turquoise.replay.gtp.v24_4.types.Message;
import omi.lseg.turquoise.replay.gtp.v24_4.types.PrintOptions;

/**
 * Represents the AddOrderIncrementalMessage message from the Replay protocol.
 *
 * <p>Sent to instruct recipients to add a new displayable order to the retrospective order book</p>
 */
public final class AddOrderIncrementalMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 74;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order Incremental Message";

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Unique identifier of the order.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Displayed Size of the order.
     */
    private final SizeField size = new SizeField();

    /**
     * GTP Instrument identifier.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Limit price of the order
     */
    private final PriceField price = new PriceField();

    /**
     * Transaction execution timestamp as reported by the upstream system
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Venue from which market data is received for the instrument
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * Order book the status applies to.
     */
    private final OrderBookTypeField orderBookType = new OrderBookTypeField();

    /**
     * Not Applicable to Turquoise
     */
    private final ParticipantField participant = new ParticipantField();

    /**
     * Type of the order.
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * Not Applicable to Turquoise.
     */
    private final RfqIdField rfqId = new RfqIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, orderId, side, size, instrument, price, transactionTime, sourceVenue, orderBookType, participant, orderType, rfqId);

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
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Displayed Size of the order.
     *
     * @return the Size field
     */
    public SizeField size() {
        return size;
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
     * Limit price of the order
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Transaction execution timestamp as reported by the upstream system
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Venue from which market data is received for the instrument
     *
     * @return the SourceVenue field
     */
    public SourceVenueField sourceVenue() {
        return sourceVenue;
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
     * Not Applicable to Turquoise
     *
     * @return the Participant field
     */
    public ParticipantField participant() {
        return participant;
    }

    /**
     * Type of the order.
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * Not Applicable to Turquoise.
     *
     * @return the RfqId field
     */
    public RfqIdField rfqId() {
        return rfqId;
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
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!size.parse(data, cursor)) {
            return false;
        }
        cursor += SizeField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!sourceVenue.parse(data, cursor)) {
            return false;
        }
        cursor += SourceVenueField.BYTE_LENGTH;
        if (!orderBookType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookTypeField.BYTE_LENGTH;
        if (!participant.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        return rfqId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = size.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = transactionTime.encode(data, cursor);
        cursor = sourceVenue.encode(data, cursor);
        cursor = orderBookType.encode(data, cursor);
        cursor = participant.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "OrderId" -> Optional.of(orderId);
            case "Side" -> Optional.of(side);
            case "Size" -> Optional.of(size);
            case "Instrument" -> Optional.of(instrument);
            case "Price" -> Optional.of(price);
            case "TransactionTime" -> Optional.of(transactionTime);
            case "SourceVenue" -> Optional.of(sourceVenue);
            case "OrderBookType" -> Optional.of(orderBookType);
            case "Participant" -> Optional.of(participant);
            case "OrderType" -> Optional.of(orderType);
            case "RfqId" -> Optional.of(rfqId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddOrderIncrementalMessage message)) {
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
        if (!(other instanceof AddOrderIncrementalMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
