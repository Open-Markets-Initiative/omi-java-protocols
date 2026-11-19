package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.AckTypeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.AiqField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.ClOrdIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.ClearingAccountField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.InstrumentIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.MarketParticipantIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.OrderIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.OrderQtyQuantityNonZeroField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.PricePrice4OptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.ReasonCodeOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.SideField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.ThrottleIndicatorField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.TransactTimeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Message;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.PrintOptions;

/**
 * Represents the NewIocQuoteAckMessage message from the BinaryOrderEntry protocol.
 *
 * <p>NewIocQuoteAckMessage</p>
 */
public final class NewIocQuoteAckMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 51;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Ioc Quote Ack Message";

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * marketParticipantId
     */
    private final MarketParticipantIdField marketParticipantId = new MarketParticipantIdField();

    /**
     * clOrdId
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * clearingAccount
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * aiq
     */
    private final AiqField aiq = new AiqField();

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * orderId
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * ackType
     */
    private final AckTypeField ackType = new AckTypeField();

    /**
     * price
     */
    private final PricePrice4OptionalField pricePrice4Optional = new PricePrice4OptionalField();

    /**
     * orderQty
     */
    private final OrderQtyQuantityNonZeroField orderQtyQuantityNonZero = new OrderQtyQuantityNonZeroField();

    /**
     * reasonCode
     */
    private final ReasonCodeOptionalField reasonCodeOptional = new ReasonCodeOptionalField();

    /**
     * throttleIndicator
     */
    private final ThrottleIndicatorField throttleIndicator = new ThrottleIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, marketParticipantId, clOrdId, clearingAccount, aiq, instrumentId, side, orderId, ackType, pricePrice4Optional, orderQtyQuantityNonZero, reasonCodeOptional, throttleIndicator);

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
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * clearingAccount
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * aiq
     *
     * @return the Aiq field
     */
    public AiqField aiq() {
        return aiq;
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
     * side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * orderId
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
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
     * price
     *
     * @return the PricePrice4Optional field
     */
    public PricePrice4OptionalField pricePrice4Optional() {
        return pricePrice4Optional;
    }

    /**
     * orderQty
     *
     * @return the OrderQtyQuantityNonZero field
     */
    public OrderQtyQuantityNonZeroField orderQtyQuantityNonZero() {
        return orderQtyQuantityNonZero;
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
        if (!marketParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!aiq.parse(data, cursor)) {
            return false;
        }
        cursor += AiqField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!ackType.parse(data, cursor)) {
            return false;
        }
        cursor += AckTypeField.BYTE_LENGTH;
        if (!pricePrice4Optional.parse(data, cursor)) {
            return false;
        }
        cursor += PricePrice4OptionalField.BYTE_LENGTH;
        if (!orderQtyQuantityNonZero.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyQuantityNonZeroField.BYTE_LENGTH;
        if (!reasonCodeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonCodeOptionalField.BYTE_LENGTH;
        return throttleIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = marketParticipantId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = aiq.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = ackType.encode(data, cursor);
        cursor = pricePrice4Optional.encode(data, cursor);
        cursor = orderQtyQuantityNonZero.encode(data, cursor);
        cursor = reasonCodeOptional.encode(data, cursor);
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
            case "MarketParticipantId" -> Optional.of(marketParticipantId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "Aiq" -> Optional.of(aiq);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "Side" -> Optional.of(side);
            case "OrderId" -> Optional.of(orderId);
            case "AckType" -> Optional.of(ackType);
            case "PricePrice4Optional" -> Optional.of(pricePrice4Optional);
            case "OrderQtyQuantityNonZero" -> Optional.of(orderQtyQuantityNonZero);
            case "ReasonCodeOptional" -> Optional.of(reasonCodeOptional);
            case "ThrottleIndicator" -> Optional.of(throttleIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewIocQuoteAckMessage message)) {
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
        if (!(other instanceof NewIocQuoteAckMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
