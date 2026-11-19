package omi.miax.onyxfutures.expressinterface.fei.v1_0_c.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.AdditionalOrderIndicatorsField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.ClientOrderIdField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.ClientSendTimeField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.CustomerOrderHandlingInstructionField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.InstrumentIdBinaryUField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.MpIdField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.OperatorIdField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.OperatorLocationField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.OrderExpiryDateField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.OriginalClientOrderIdField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.PriceField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.PurgeGroupField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.SelfTradeProtectionGroupField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.SizeBinarySField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.fields.StopOrderTriggerPriceField;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.types.Field;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.types.Message;
import omi.miax.onyxfutures.expressinterface.fei.v1_0_c.types.PrintOptions;

/**
 * Represents the ModifyOrderRequestMessage message from the ExpressInterface protocol.
 *
 * <p>use this format to send a request to modify a resting order</p>
 */
public final class ModifyOrderRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 140;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Modify Order Request Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 108, 32 };

    /**
     * Firm’s send time
     */
    private final ClientSendTimeField clientSendTime = new ClientSendTimeField();

    /**
     * Five character MPID of the Firm whose order is sent
     */
    private final MpIdField mpId = new MpIdField();

    /**
     * This must contain a 2 to 18 character Operator.
     */
    private final OperatorIdField operatorId = new OperatorIdField();

    /**
     * The location associated with Operator ID
     */
    private final OperatorLocationField operatorLocation = new OperatorLocationField();

    /**
     * Firm specified unique order ID
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Target Client Order ID that is being modified
     */
    private final OriginalClientOrderIdField originalClientOrderId = new OriginalClientOrderIdField();

    /**
     * Instrument ID mapped to a given Instrument assigned by MIAX Futures Onyx
     */
    private final InstrumentIdBinaryUField instrumentIdBinaryU = new InstrumentIdBinaryUField();

    /**
     * Limit price of the order
     */
    private final PriceField price = new PriceField();

    /**
     * Stop Order Trigger Price, Ignored if not a stop order
     */
    private final StopOrderTriggerPriceField stopOrderTriggerPrice = new StopOrderTriggerPriceField();

    /**
     * New size of the order if size is being modified
     */
    private final SizeBinarySField sizeBinaryS = new SizeBinarySField();

    /**
     * GTD Order Expiry date, set to zero for all other tifs
     */
    private final OrderExpiryDateField orderExpiryDate = new OrderExpiryDateField();

    /**
     * Customer specified protection group, if empty string, group is not specified
     */
    private final SelfTradeProtectionGroupField selfTradeProtectionGroup = new SelfTradeProtectionGroupField();

    /**
     * Customer specified purge group
     */
    private final PurgeGroupField purgeGroup = new PurgeGroupField();

    /**
     * Customer Order Handling Instruction:
     */
    private final CustomerOrderHandlingInstructionField customerOrderHandlingInstruction = new CustomerOrderHandlingInstructionField();

    /**
     * Additional Order Indicators Flags
     */
    private final AdditionalOrderIndicatorsField additionalOrderIndicators = new AdditionalOrderIndicatorsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clientSendTime, mpId, operatorId, operatorLocation, clientOrderId, originalClientOrderId, instrumentIdBinaryU, price, stopOrderTriggerPrice, sizeBinaryS, orderExpiryDate, selfTradeProtectionGroup, purgeGroup, customerOrderHandlingInstruction, additionalOrderIndicators);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Firm’s send time
     *
     * @return the ClientSendTime field
     */
    public ClientSendTimeField clientSendTime() {
        return clientSendTime;
    }

    /**
     * Five character MPID of the Firm whose order is sent
     *
     * @return the MpId field
     */
    public MpIdField mpId() {
        return mpId;
    }

    /**
     * This must contain a 2 to 18 character Operator.
     *
     * @return the OperatorId field
     */
    public OperatorIdField operatorId() {
        return operatorId;
    }

    /**
     * The location associated with Operator ID
     *
     * @return the OperatorLocation field
     */
    public OperatorLocationField operatorLocation() {
        return operatorLocation;
    }

    /**
     * Firm specified unique order ID
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * Target Client Order ID that is being modified
     *
     * @return the OriginalClientOrderId field
     */
    public OriginalClientOrderIdField originalClientOrderId() {
        return originalClientOrderId;
    }

    /**
     * Instrument ID mapped to a given Instrument assigned by MIAX Futures Onyx
     *
     * @return the InstrumentIdBinaryU field
     */
    public InstrumentIdBinaryUField instrumentIdBinaryU() {
        return instrumentIdBinaryU;
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
     * Stop Order Trigger Price, Ignored if not a stop order
     *
     * @return the StopOrderTriggerPrice field
     */
    public StopOrderTriggerPriceField stopOrderTriggerPrice() {
        return stopOrderTriggerPrice;
    }

    /**
     * New size of the order if size is being modified
     *
     * @return the SizeBinaryS field
     */
    public SizeBinarySField sizeBinaryS() {
        return sizeBinaryS;
    }

    /**
     * GTD Order Expiry date, set to zero for all other tifs
     *
     * @return the OrderExpiryDate field
     */
    public OrderExpiryDateField orderExpiryDate() {
        return orderExpiryDate;
    }

    /**
     * Customer specified protection group, if empty string, group is not specified
     *
     * @return the SelfTradeProtectionGroup field
     */
    public SelfTradeProtectionGroupField selfTradeProtectionGroup() {
        return selfTradeProtectionGroup;
    }

    /**
     * Customer specified purge group
     *
     * @return the PurgeGroup field
     */
    public PurgeGroupField purgeGroup() {
        return purgeGroup;
    }

    /**
     * Customer Order Handling Instruction:
     *
     * @return the CustomerOrderHandlingInstruction field
     */
    public CustomerOrderHandlingInstructionField customerOrderHandlingInstruction() {
        return customerOrderHandlingInstruction;
    }

    /**
     * Additional Order Indicators Flags
     *
     * @return the AdditionalOrderIndicators field
     */
    public AdditionalOrderIndicatorsField additionalOrderIndicators() {
        return additionalOrderIndicators;
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
        return Optional.ofNullable(clientSendTime.value());
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
        if (!clientSendTime.parse(data, cursor)) {
            return false;
        }
        cursor += ClientSendTimeField.BYTE_LENGTH;
        if (!mpId.parse(data, cursor)) {
            return false;
        }
        cursor += MpIdField.BYTE_LENGTH;
        if (!operatorId.parse(data, cursor)) {
            return false;
        }
        cursor += OperatorIdField.BYTE_LENGTH;
        if (!operatorLocation.parse(data, cursor)) {
            return false;
        }
        cursor += OperatorLocationField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!originalClientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalClientOrderIdField.BYTE_LENGTH;
        if (!instrumentIdBinaryU.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdBinaryUField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!stopOrderTriggerPrice.parse(data, cursor)) {
            return false;
        }
        cursor += StopOrderTriggerPriceField.BYTE_LENGTH;
        if (!sizeBinaryS.parse(data, cursor)) {
            return false;
        }
        cursor += SizeBinarySField.BYTE_LENGTH;
        if (!orderExpiryDate.parse(data, cursor)) {
            return false;
        }
        cursor += OrderExpiryDateField.BYTE_LENGTH;
        if (!selfTradeProtectionGroup.parse(data, cursor)) {
            return false;
        }
        cursor += SelfTradeProtectionGroupField.BYTE_LENGTH;
        if (!purgeGroup.parse(data, cursor)) {
            return false;
        }
        cursor += PurgeGroupField.BYTE_LENGTH;
        if (!customerOrderHandlingInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += CustomerOrderHandlingInstructionField.BYTE_LENGTH;
        if (!additionalOrderIndicators.parse(data, cursor)) {
            return false;
        }
        cursor += AdditionalOrderIndicatorsField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clientSendTime.encode(data, cursor);
        cursor = mpId.encode(data, cursor);
        cursor = operatorId.encode(data, cursor);
        cursor = operatorLocation.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = originalClientOrderId.encode(data, cursor);
        cursor = instrumentIdBinaryU.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = stopOrderTriggerPrice.encode(data, cursor);
        cursor = sizeBinaryS.encode(data, cursor);
        cursor = orderExpiryDate.encode(data, cursor);
        cursor = selfTradeProtectionGroup.encode(data, cursor);
        cursor = purgeGroup.encode(data, cursor);
        cursor = customerOrderHandlingInstruction.encode(data, cursor);
        cursor = additionalOrderIndicators.encode(data, cursor);
        if (buffer != null && buffer.length >= 140) {
            System.arraycopy(buffer, 108, data, cursor, 32); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 32, (byte) 0); // padding
        }
        cursor += 32;
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
            case "ClientSendTime" -> Optional.of(clientSendTime);
            case "MpId" -> Optional.of(mpId);
            case "OperatorId" -> Optional.of(operatorId);
            case "OperatorLocation" -> Optional.of(operatorLocation);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "OriginalClientOrderId" -> Optional.of(originalClientOrderId);
            case "InstrumentIdBinaryU" -> Optional.of(instrumentIdBinaryU);
            case "Price" -> Optional.of(price);
            case "StopOrderTriggerPrice" -> Optional.of(stopOrderTriggerPrice);
            case "SizeBinaryS" -> Optional.of(sizeBinaryS);
            case "OrderExpiryDate" -> Optional.of(orderExpiryDate);
            case "SelfTradeProtectionGroup" -> Optional.of(selfTradeProtectionGroup);
            case "PurgeGroup" -> Optional.of(purgeGroup);
            case "CustomerOrderHandlingInstruction" -> Optional.of(customerOrderHandlingInstruction);
            case "AdditionalOrderIndicators" -> Optional.of(additionalOrderIndicators);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ModifyOrderRequestMessage message)) {
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
        if (!(other instanceof ModifyOrderRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
