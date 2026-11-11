package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.AckTypeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.ClOrdIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.MpidField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.OrderIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.OrderQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.PreLiquidityIndicatorField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.SymbolIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.TransactTimeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.UserDataField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.WorkingAwayFromDisplayField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.WorkingPriceField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.Message;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.PrintOptions;

/**
 * Represents the OrderPriorityUpdateAcknowledgmentMessage message from the BinaryGateway protocol.
 *
 * <p>Unsolicited message sent by the Exchange to notify the firm of a Reserve Order replenishment event. The displayed portion of a Reserve Order has been replenished according to MaxFloor and assigned a new OrderID.</p>
 */
public final class OrderPriorityUpdateAcknowledgmentMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 58;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Priority Update Acknowledgment Message";

    /**
     * Exchange application time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Identification number assigned to the security
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Firm Identifier – MPID.
     */
    private final MpidField mpid = new MpidField();

    /**
     * Unique order identifier assigned by the Exchange.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Unique ID of the new Order, Cancel/Replace, Cancel, Modify, or Bulk Cancel request as assigned by the firm.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Working price in the range 0.000001 to 999999.999999.
     */
    private final WorkingPriceField workingPrice = new WorkingPriceField();

    /**
     * 1 - 999,999,999
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Indicates whether the working price differs from the display price.
     */
    private final WorkingAwayFromDisplayField workingAwayFromDisplay = new WorkingAwayFromDisplayField();

    /**
     * Indicator describing the order’s potential to establish or join a displayed market.
     */
    private final PreLiquidityIndicatorField preLiquidityIndicator = new PreLiquidityIndicatorField();

    /**
     * Acknowledgement type indicating the result or status of the order action.
     */
    private final AckTypeField ackType = new AckTypeField();

    /**
     * Customer defined up to 8 characters; only printable ASCII characters allowed, excluding comma, semicolon, pipe delimiter, “at” symbol, greater than/less than, ampersand (&amp;) and single/double quotation mark..
     */
    private final UserDataField userData = new UserDataField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, symbolId, mpid, orderId, clOrdId, workingPrice, orderQty, workingAwayFromDisplay, preLiquidityIndicator, ackType, userData);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange application time.
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Identification number assigned to the security
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Firm Identifier – MPID.
     *
     * @return the Mpid field
     */
    public MpidField mpid() {
        return mpid;
    }

    /**
     * Unique order identifier assigned by the Exchange.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Unique ID of the new Order, Cancel/Replace, Cancel, Modify, or Bulk Cancel request as assigned by the firm.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Working price in the range 0.000001 to 999999.999999.
     *
     * @return the WorkingPrice field
     */
    public WorkingPriceField workingPrice() {
        return workingPrice;
    }

    /**
     * 1 - 999,999,999
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Indicates whether the working price differs from the display price.
     *
     * @return the WorkingAwayFromDisplay field
     */
    public WorkingAwayFromDisplayField workingAwayFromDisplay() {
        return workingAwayFromDisplay;
    }

    /**
     * Indicator describing the order’s potential to establish or join a displayed market.
     *
     * @return the PreLiquidityIndicator field
     */
    public PreLiquidityIndicatorField preLiquidityIndicator() {
        return preLiquidityIndicator;
    }

    /**
     * Acknowledgement type indicating the result or status of the order action.
     *
     * @return the AckType field
     */
    public AckTypeField ackType() {
        return ackType;
    }

    /**
     * Customer defined up to 8 characters; only printable ASCII characters allowed, excluding comma, semicolon, pipe delimiter, “at” symbol, greater than/less than, ampersand (&amp;) and single/double quotation mark..
     *
     * @return the UserData field
     */
    public UserDataField userData() {
        return userData;
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
        if (!mpid.parse(data, cursor)) {
            return false;
        }
        cursor += MpidField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!workingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += WorkingPriceField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!workingAwayFromDisplay.parse(data, cursor)) {
            return false;
        }
        cursor += WorkingAwayFromDisplayField.BYTE_LENGTH;
        if (!preLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += PreLiquidityIndicatorField.BYTE_LENGTH;
        if (!ackType.parse(data, cursor)) {
            return false;
        }
        cursor += AckTypeField.BYTE_LENGTH;
        return userData.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = mpid.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = workingPrice.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = workingAwayFromDisplay.encode(data, cursor);
        cursor = preLiquidityIndicator.encode(data, cursor);
        cursor = ackType.encode(data, cursor);
        cursor = userData.encode(data, cursor);
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
            case "Mpid" -> Optional.of(mpid);
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "WorkingPrice" -> Optional.of(workingPrice);
            case "OrderQty" -> Optional.of(orderQty);
            case "WorkingAwayFromDisplay" -> Optional.of(workingAwayFromDisplay);
            case "PreLiquidityIndicator" -> Optional.of(preLiquidityIndicator);
            case "AckType" -> Optional.of(ackType);
            case "UserData" -> Optional.of(userData);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderPriorityUpdateAcknowledgmentMessage message)) {
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
        if (!(other instanceof OrderPriorityUpdateAcknowledgmentMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
