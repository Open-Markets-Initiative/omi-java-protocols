package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.AckTypeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.BitfieldFlowIndicatorField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.LeavesQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.LocateReqdUField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.MpidField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.OrderIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.OrderQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.OrigClOrdIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.PriceField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.ReasonCodeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.RefClOrdIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.SideField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.SymbolIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.TransactTimeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.UserDataField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Message;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.PrintOptions;

/**
 * Represents the OrderModifyCancelRequestAcknowledgmentAndUroutMessage message from the BinaryGateway protocol.
 *
 * <p>Used as a Modify Request Acknowledgement, Cancel Request Acknowledgement, UROUT, and Billable Cancel, distinguished by AckType.</p>
 */
public final class OrderModifyCancelRequestAcknowledgmentAndUroutMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 70;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Modify Cancel Request Acknowledgment And Urout Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

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
     * Refers to the ClOrdID of the incoming Modify, Cancel, or Bulk Cancel Request, or context-specific value for UROUTs.
     */
    private final RefClOrdIdField refClOrdId = new RefClOrdIdField();

    /**
     * Refers to the ClOrdID of a previously entered order.
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * 0.000001-999999.999999
     */
    private final PriceField price = new PriceField();

    /**
     * 1 - 999,999,999
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Remaining quantity open on the order.
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * 0 = No LocateReqd or not applicable. Orders with Side of Sell Short, Sell Short Exempt, Cross Short, or Cross Short Exempt must be entered with LocateReqd = 0 or will be rejected.
     */
    private final LocateReqdUField locateReqdU = new LocateReqdUField();

    /**
     * Matching engine reason code qualifying the event that produced the message.
     */
    private final ReasonCodeField reasonCode = new ReasonCodeField();

    /**
     * Acknowledgement type indicating the result or status of the order action.
     */
    private final AckTypeField ackType = new AckTypeField();

    /**
     * BitfieldFlowIndicator is a data structure defining whether the inbound message was throttled.
     */
    private final BitfieldFlowIndicatorField bitfieldFlowIndicator = new BitfieldFlowIndicatorField();

    /**
     * Customer defined up to 8 characters; only printable ASCII characters allowed, excluding comma, semicolon, pipe delimiter, “at” symbol, greater than/less than, ampersand (&amp;) and single/double quotation mark..
     */
    private final UserDataField userData = new UserDataField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, symbolId, mpid, orderId, refClOrdId, origClOrdId, price, orderQty, leavesQty, side, locateReqdU, reasonCode, ackType, bitfieldFlowIndicator, userData);

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
     * Refers to the ClOrdID of the incoming Modify, Cancel, or Bulk Cancel Request, or context-specific value for UROUTs.
     *
     * @return the RefClOrdId field
     */
    public RefClOrdIdField refClOrdId() {
        return refClOrdId;
    }

    /**
     * Refers to the ClOrdID of a previously entered order.
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * 0.000001-999999.999999
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
     * Remaining quantity open on the order.
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
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
     * 0 = No LocateReqd or not applicable. Orders with Side of Sell Short, Sell Short Exempt, Cross Short, or Cross Short Exempt must be entered with LocateReqd = 0 or will be rejected.
     *
     * @return the LocateReqdU field
     */
    public LocateReqdUField locateReqdU() {
        return locateReqdU;
    }

    /**
     * Matching engine reason code qualifying the event that produced the message.
     *
     * @return the ReasonCode field
     */
    public ReasonCodeField reasonCode() {
        return reasonCode;
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
     * BitfieldFlowIndicator is a data structure defining whether the inbound message was throttled.
     *
     * @return the BitfieldFlowIndicator field
     */
    public BitfieldFlowIndicatorField bitfieldFlowIndicator() {
        return bitfieldFlowIndicator;
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
        return PADDING.clone();
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
        if (!refClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += RefClOrdIdField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!locateReqdU.parse(data, cursor)) {
            return false;
        }
        cursor += LocateReqdUField.BYTE_LENGTH;
        if (!reasonCode.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonCodeField.BYTE_LENGTH;
        if (!ackType.parse(data, cursor)) {
            return false;
        }
        cursor += AckTypeField.BYTE_LENGTH;
        if (!bitfieldFlowIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BitfieldFlowIndicatorField.BYTE_LENGTH;
        if (!userData.parse(data, cursor)) {
            return false;
        }
        cursor += UserDataField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = mpid.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = refClOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = locateReqdU.encode(data, cursor);
        cursor = reasonCode.encode(data, cursor);
        cursor = ackType.encode(data, cursor);
        cursor = bitfieldFlowIndicator.encode(data, cursor);
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
            case "RefClOrdId" -> Optional.of(refClOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "Price" -> Optional.of(price);
            case "OrderQty" -> Optional.of(orderQty);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "Side" -> Optional.of(side);
            case "LocateReqdU" -> Optional.of(locateReqdU);
            case "ReasonCode" -> Optional.of(reasonCode);
            case "AckType" -> Optional.of(ackType);
            case "BitfieldFlowIndicator" -> Optional.of(bitfieldFlowIndicator);
            case "UserData" -> Optional.of(userData);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderModifyCancelRequestAcknowledgmentAndUroutMessage message)) {
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
        if (!(other instanceof OrderModifyCancelRequestAcknowledgmentAndUroutMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
