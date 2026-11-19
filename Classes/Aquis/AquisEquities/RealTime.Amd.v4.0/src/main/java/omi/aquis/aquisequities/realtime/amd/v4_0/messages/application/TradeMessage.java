package omi.aquis.aquisequities.realtime.amd.v4_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.aquis.aquisequities.realtime.amd.v4_0.fields.BinaryMmtField;
import omi.aquis.aquisequities.realtime.amd.v4_0.fields.ExecutionPriceField;
import omi.aquis.aquisequities.realtime.amd.v4_0.fields.MdFlagsField;
import omi.aquis.aquisequities.realtime.amd.v4_0.fields.OrderRefField;
import omi.aquis.aquisequities.realtime.amd.v4_0.fields.SecurityIdField;
import omi.aquis.aquisequities.realtime.amd.v4_0.fields.TimestampField;
import omi.aquis.aquisequities.realtime.amd.v4_0.fields.TradeRefField;
import omi.aquis.aquisequities.realtime.amd.v4_0.fields.TradeTypeField;
import omi.aquis.aquisequities.realtime.amd.v4_0.fields.TradedQuantityField;
import omi.aquis.aquisequities.realtime.amd.v4_0.types.Field;
import omi.aquis.aquisequities.realtime.amd.v4_0.types.Message;
import omi.aquis.aquisequities.realtime.amd.v4_0.types.PrintOptions;

/**
 * Represents the TradeMessage message from the RealTime protocol.
 *
 * <p>Whenever an order trades, partially or fully, a Trade message is published.</p>
 */
public final class TradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0005';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Message";

    /**
     * Numeric identifier of the relevant security
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Code identifying type of trade (see below)
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * Number of shares traded
     */
    private final TradedQuantityField tradedQuantity = new TradedQuantityField();

    /**
     * The execution price
     */
    private final ExecutionPriceField executionPrice = new ExecutionPriceField();

    /**
     * Unique order reference number for the day
     */
    private final OrderRefField orderRef = new OrderRefField();

    /**
     * Trade reference number
     */
    private final TradeRefField tradeRef = new TradeRefField();

    /**
     * Timestamp of this market data event
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Post-trade regulatory flags (MMT)
     */
    private final BinaryMmtField binaryMmt = new BinaryMmtField();

    /**
     * Market data flags
     */
    private final MdFlagsField mdFlags = new MdFlagsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, tradeType, tradedQuantity, executionPrice, orderRef, tradeRef, timestampField, binaryMmt, mdFlags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Numeric identifier of the relevant security
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Code identifying type of trade (see below)
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * Number of shares traded
     *
     * @return the TradedQuantity field
     */
    public TradedQuantityField tradedQuantity() {
        return tradedQuantity;
    }

    /**
     * The execution price
     *
     * @return the ExecutionPrice field
     */
    public ExecutionPriceField executionPrice() {
        return executionPrice;
    }

    /**
     * Unique order reference number for the day
     *
     * @return the OrderRef field
     */
    public OrderRefField orderRef() {
        return orderRef;
    }

    /**
     * Trade reference number
     *
     * @return the TradeRef field
     */
    public TradeRefField tradeRef() {
        return tradeRef;
    }

    /**
     * Timestamp of this market data event
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Post-trade regulatory flags (MMT)
     *
     * @return the BinaryMmt field
     */
    public BinaryMmtField binaryMmt() {
        return binaryMmt;
    }

    /**
     * Market data flags
     *
     * @return the MdFlags field
     */
    public MdFlagsField mdFlags() {
        return mdFlags;
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!tradedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += TradedQuantityField.BYTE_LENGTH;
        if (!executionPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionPriceField.BYTE_LENGTH;
        if (!orderRef.parse(data, cursor)) {
            return false;
        }
        cursor += OrderRefField.BYTE_LENGTH;
        if (!tradeRef.parse(data, cursor)) {
            return false;
        }
        cursor += TradeRefField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!binaryMmt.parse(data, cursor)) {
            return false;
        }
        cursor += BinaryMmtField.BYTE_LENGTH;
        return mdFlags.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = tradedQuantity.encode(data, cursor);
        cursor = executionPrice.encode(data, cursor);
        cursor = orderRef.encode(data, cursor);
        cursor = tradeRef.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = binaryMmt.encode(data, cursor);
        cursor = mdFlags.encode(data, cursor);
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
            case "SecurityId" -> Optional.of(securityId);
            case "TradeType" -> Optional.of(tradeType);
            case "TradedQuantity" -> Optional.of(tradedQuantity);
            case "ExecutionPrice" -> Optional.of(executionPrice);
            case "OrderRef" -> Optional.of(orderRef);
            case "TradeRef" -> Optional.of(tradeRef);
            case "Timestamp" -> Optional.of(timestampField);
            case "BinaryMmt" -> Optional.of(binaryMmt);
            case "MdFlags" -> Optional.of(mdFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeMessage message)) {
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
        if (!(other instanceof TradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
