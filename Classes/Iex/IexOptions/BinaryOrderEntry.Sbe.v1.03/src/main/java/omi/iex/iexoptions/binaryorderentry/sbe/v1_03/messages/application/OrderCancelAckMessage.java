package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.AckTypeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.ClOrdIdOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.InstrumentIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.LeavesQtyField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.MarketParticipantIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.OrderIdOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.OrigClOrdIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.PricePrice8OptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.ReasonCodeOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.ThrottleIndicatorField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.TransactTimeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Message;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.PrintOptions;

/**
 * Represents the OrderCancelAckMessage message from the BinaryOrderEntry protocol.
 *
 * <p>OrderCancelAckMessage</p>
 */
public final class OrderCancelAckMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 55;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Cancel Ack Message";

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * marketParticipantId
     */
    private final MarketParticipantIdField marketParticipantId = new MarketParticipantIdField();

    /**
     * clOrdId
     */
    private final ClOrdIdOptionalField clOrdIdOptional = new ClOrdIdOptionalField();

    /**
     * origClOrdId
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * orderId
     */
    private final OrderIdOptionalField orderIdOptional = new OrderIdOptionalField();

    /**
     * price
     */
    private final PricePrice8OptionalField pricePrice8Optional = new PricePrice8OptionalField();

    /**
     * leavesQty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * reasonCode
     */
    private final ReasonCodeOptionalField reasonCodeOptional = new ReasonCodeOptionalField();

    /**
     * ackType
     */
    private final AckTypeField ackType = new AckTypeField();

    /**
     * throttleIndicator
     */
    private final ThrottleIndicatorField throttleIndicator = new ThrottleIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, instrumentId, marketParticipantId, clOrdIdOptional, origClOrdId, orderIdOptional, pricePrice8Optional, leavesQty, reasonCodeOptional, ackType, throttleIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * transactTime
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * instrumentId
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * marketParticipantId
     *
     * @return the MarketParticipantId field
     */
    public MarketParticipantIdField marketParticipantId() {
        return marketParticipantId;
    }

    /**
     * clOrdId
     *
     * @return the ClOrdIdOptional field
     */
    public ClOrdIdOptionalField clOrdIdOptional() {
        return clOrdIdOptional;
    }

    /**
     * origClOrdId
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * orderId
     *
     * @return the OrderIdOptional field
     */
    public OrderIdOptionalField orderIdOptional() {
        return orderIdOptional;
    }

    /**
     * price
     *
     * @return the PricePrice8Optional field
     */
    public PricePrice8OptionalField pricePrice8Optional() {
        return pricePrice8Optional;
    }

    /**
     * leavesQty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * reasonCode
     *
     * @return the ReasonCodeOptional field
     */
    public ReasonCodeOptionalField reasonCodeOptional() {
        return reasonCodeOptional;
    }

    /**
     * ackType
     *
     * @return the AckType field
     */
    public AckTypeField ackType() {
        return ackType;
    }

    /**
     * throttleIndicator
     *
     * @return the ThrottleIndicator field
     */
    public ThrottleIndicatorField throttleIndicator() {
        return throttleIndicator;
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
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!marketParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantIdField.BYTE_LENGTH;
        if (!clOrdIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdOptionalField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!orderIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdOptionalField.BYTE_LENGTH;
        if (!pricePrice8Optional.parse(data, cursor)) {
            return false;
        }
        cursor += PricePrice8OptionalField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!reasonCodeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonCodeOptionalField.BYTE_LENGTH;
        if (!ackType.parse(data, cursor)) {
            return false;
        }
        cursor += AckTypeField.BYTE_LENGTH;
        return throttleIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = marketParticipantId.encode(data, cursor);
        cursor = clOrdIdOptional.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = orderIdOptional.encode(data, cursor);
        cursor = pricePrice8Optional.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = reasonCodeOptional.encode(data, cursor);
        cursor = ackType.encode(data, cursor);
        cursor = throttleIndicator.encode(data, cursor);
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "MarketParticipantId" -> Optional.of(marketParticipantId);
            case "ClOrdIdOptional" -> Optional.of(clOrdIdOptional);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "OrderIdOptional" -> Optional.of(orderIdOptional);
            case "PricePrice8Optional" -> Optional.of(pricePrice8Optional);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "ReasonCodeOptional" -> Optional.of(reasonCodeOptional);
            case "AckType" -> Optional.of(ackType);
            case "ThrottleIndicator" -> Optional.of(throttleIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderCancelAckMessage message)) {
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
        if (!(other instanceof OrderCancelAckMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
