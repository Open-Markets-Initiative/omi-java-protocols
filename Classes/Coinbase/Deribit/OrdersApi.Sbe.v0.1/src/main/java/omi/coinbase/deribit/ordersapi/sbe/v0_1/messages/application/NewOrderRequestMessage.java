package omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.ClientOrderIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.CorrelationIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.FlagsOrderFlagsField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.InstrumentIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.PriceField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.SelfMatchPreventionIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.SelfTradingModeField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.SideField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.TimeInForceField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.Quantity;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.ShowQty;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Field;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Message;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.PrintOptions;

/**
 * Represents the NewOrderRequestMessage message from the OrdersApi protocol.
 *
 * <p>NewOrderRequestMessage</p>
 */
public final class NewOrderRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 63;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Request Message";

    /**
     * clientOrderId
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * correlationId
     */
    private final CorrelationIdField correlationId = new CorrelationIdField();

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * price
     */
    private final PriceField price = new PriceField();

    /**
     * selfMatchPreventionId
     */
    private final SelfMatchPreventionIdField selfMatchPreventionId = new SelfMatchPreventionIdField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * timeInForce
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * OrderFlags bit set
     */
    private final FlagsOrderFlagsField flagsOrderFlags = new FlagsOrderFlagsField();

    /**
     * selfTradingMode
     */
    private final SelfTradingModeField selfTradingMode = new SelfTradingModeField();

    /**
     * NewOrderRequestMessage
     */
    private final Quantity quantity = new Quantity();

    /**
     * NewOrderRequestMessage
     */
    private final ShowQty showQty = new ShowQty();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(clientOrderId), List.<Field>of(correlationId), List.<Field>of(instrumentId), List.<Field>of(price), quantity.fields(), showQty.fields(), List.<Field>of(selfMatchPreventionId), List.<Field>of(side), List.<Field>of(timeInForce), List.<Field>of(flagsOrderFlags), List.<Field>of(selfTradingMode)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * clientOrderId
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * correlationId
     *
     * @return the CorrelationId field
     */
    public CorrelationIdField correlationId() {
        return correlationId;
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
     * price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * selfMatchPreventionId
     *
     * @return the SelfMatchPreventionId field
     */
    public SelfMatchPreventionIdField selfMatchPreventionId() {
        return selfMatchPreventionId;
    }

    /**
     * side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * timeInForce
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * OrderFlags bit set
     *
     * @return the FlagsOrderFlags field
     */
    public FlagsOrderFlagsField flagsOrderFlags() {
        return flagsOrderFlags;
    }

    /**
     * selfTradingMode
     *
     * @return the SelfTradingMode field
     */
    public SelfTradingModeField selfTradingMode() {
        return selfTradingMode;
    }

    /**
     * NewOrderRequestMessage
     *
     * @return the Quantity record
     */
    public Quantity quantity() {
        return quantity;
    }

    /**
     * NewOrderRequestMessage
     *
     * @return the ShowQty record
     */
    public ShowQty showQty() {
        return showQty;
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
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!correlationId.parse(data, cursor)) {
            return false;
        }
        cursor += CorrelationIdField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parseFrom(data, cursor, end - 22)) {
            return false;
        }
        cursor += quantity.byteLength();
        if (!showQty.parseFrom(data, cursor, end - 13)) {
            return false;
        }
        cursor += showQty.byteLength();
        if (!selfMatchPreventionId.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!flagsOrderFlags.parse(data, cursor)) {
            return false;
        }
        cursor += FlagsOrderFlagsField.BYTE_LENGTH;
        return selfTradingMode.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clientOrderId.encode(data, cursor);
        cursor = correlationId.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = showQty.encode(data, cursor);
        cursor = selfMatchPreventionId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = flagsOrderFlags.encode(data, cursor);
        cursor = selfTradingMode.encode(data, cursor);
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
        quantity.clear();
        showQty.clear();
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
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "CorrelationId" -> Optional.of(correlationId);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "Price" -> Optional.of(price);
            case "SelfMatchPreventionId" -> Optional.of(selfMatchPreventionId);
            case "Side" -> Optional.of(side);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "FlagsOrderFlags" -> Optional.of(flagsOrderFlags);
            case "SelfTradingMode" -> Optional.of(selfTradingMode);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderRequestMessage message)) {
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
        if (!(other instanceof NewOrderRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
