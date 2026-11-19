package omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.AccountTypeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClMsgSeqNumField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClientOrderIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.DarkExecutionInstructionField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.EmmField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ExecutionInstructionField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ExecutionWithinFirmShortCodeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FirmIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.LpRoleOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.MifidIndicatorsField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderPxField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderQtyField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderTypeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SendingTimeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SideField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.StpidField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SymbolIndexField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.TimeInForceField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.TradingCapacityField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.FreeTextGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.MifidShortCodesGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.OrderClearingFieldsGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.OrderOptionalFieldsGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Field;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.PrintOptions;

/**
 * Represents the NewOrderMessage message from the OrderEntryGateway protocol.
 *
 * <p>NewOrderMessage</p>
 */
public final class NewOrderMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 72;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Message";

    /**
     * clMsgSeqNum
     */
    private final ClMsgSeqNumField clMsgSeqNum = new ClMsgSeqNumField();

    /**
     * firmID
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * sendingTime
     */
    private final SendingTimeField sendingTime = new SendingTimeField();

    /**
     * clientOrderID
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * orderType
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * timeInForce
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * orderPx
     */
    private final OrderPxField orderPx = new OrderPxField();

    /**
     * orderQty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * executionWithinFirmShortCode
     */
    private final ExecutionWithinFirmShortCodeField executionWithinFirmShortCode = new ExecutionWithinFirmShortCodeField();

    /**
     * tradingCapacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * accountType
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * lPRole
     */
    private final LpRoleOptionalField lpRoleOptional = new LpRoleOptionalField();

    /**
     * ExecutionInstruction_set bit set
     */
    private final ExecutionInstructionField executionInstruction = new ExecutionInstructionField();

    /**
     * DarkExecutionInstruction_set bit set
     */
    private final DarkExecutionInstructionField darkExecutionInstruction = new DarkExecutionInstructionField();

    /**
     * MiFIDIndicators_set bit set
     */
    private final MifidIndicatorsField mifidIndicators = new MifidIndicatorsField();

    /**
     * sTPID
     */
    private final StpidField stpid = new StpidField();

    /**
     * FreeTextSection Block
     */
    private final FreeTextGroups freeTextGroups = new FreeTextGroups();

    /**
     * MiFIDShortcodes Block
     */
    private final MifidShortCodesGroups mifidShortCodesGroups = new MifidShortCodesGroups();

    /**
     * OptionalFields Block
     */
    private final OrderOptionalFieldsGroups orderOptionalFieldsGroups = new OrderOptionalFieldsGroups();

    /**
     * ClearingFields Block
     */
    private final OrderClearingFieldsGroups orderClearingFieldsGroups = new OrderClearingFieldsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clMsgSeqNum, firmId, sendingTime, clientOrderId, symbolIndex, emm, side, orderType, timeInForce, orderPx, orderQty, executionWithinFirmShortCode, tradingCapacity, accountType, lpRoleOptional, executionInstruction, darkExecutionInstruction, mifidIndicators, stpid);

    private byte[] buffer;

    private boolean decoded;

    /**
     * clMsgSeqNum
     *
     * @return the ClMsgSeqNum field
     */
    public ClMsgSeqNumField clMsgSeqNum() {
        return clMsgSeqNum;
    }

    /**
     * firmID
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * sendingTime
     *
     * @return the SendingTime field
     */
    public SendingTimeField sendingTime() {
        return sendingTime;
    }

    /**
     * clientOrderID
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * symbolIndex
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * eMM
     *
     * @return the Emm field
     */
    public EmmField emm() {
        return emm;
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
     * orderType
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
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
     * orderPx
     *
     * @return the OrderPx field
     */
    public OrderPxField orderPx() {
        return orderPx;
    }

    /**
     * orderQty
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * executionWithinFirmShortCode
     *
     * @return the ExecutionWithinFirmShortCode field
     */
    public ExecutionWithinFirmShortCodeField executionWithinFirmShortCode() {
        return executionWithinFirmShortCode;
    }

    /**
     * tradingCapacity
     *
     * @return the TradingCapacity field
     */
    public TradingCapacityField tradingCapacity() {
        return tradingCapacity;
    }

    /**
     * accountType
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
    }

    /**
     * lPRole
     *
     * @return the LpRoleOptional field
     */
    public LpRoleOptionalField lpRoleOptional() {
        return lpRoleOptional;
    }

    /**
     * ExecutionInstruction_set bit set
     *
     * @return the ExecutionInstruction field
     */
    public ExecutionInstructionField executionInstruction() {
        return executionInstruction;
    }

    /**
     * DarkExecutionInstruction_set bit set
     *
     * @return the DarkExecutionInstruction field
     */
    public DarkExecutionInstructionField darkExecutionInstruction() {
        return darkExecutionInstruction;
    }

    /**
     * MiFIDIndicators_set bit set
     *
     * @return the MifidIndicators field
     */
    public MifidIndicatorsField mifidIndicators() {
        return mifidIndicators;
    }

    /**
     * sTPID
     *
     * @return the Stpid field
     */
    public StpidField stpid() {
        return stpid;
    }

    /**
     * FreeTextSection Block
     *
     * @return the FreeTextGroups record
     */
    public FreeTextGroups freeTextGroups() {
        return freeTextGroups;
    }

    /**
     * MiFIDShortcodes Block
     *
     * @return the MifidShortCodesGroups record
     */
    public MifidShortCodesGroups mifidShortCodesGroups() {
        return mifidShortCodesGroups;
    }

    /**
     * OptionalFields Block
     *
     * @return the OrderOptionalFieldsGroups record
     */
    public OrderOptionalFieldsGroups orderOptionalFieldsGroups() {
        return orderOptionalFieldsGroups;
    }

    /**
     * ClearingFields Block
     *
     * @return the OrderClearingFieldsGroups record
     */
    public OrderClearingFieldsGroups orderClearingFieldsGroups() {
        return orderClearingFieldsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + freeTextGroups.byteLength() - FreeTextGroups.MINIMUM_BYTE_LENGTH + mifidShortCodesGroups.byteLength() - MifidShortCodesGroups.MINIMUM_BYTE_LENGTH + orderOptionalFieldsGroups.byteLength() - OrderOptionalFieldsGroups.MINIMUM_BYTE_LENGTH + orderClearingFieldsGroups.byteLength() - OrderClearingFieldsGroups.MINIMUM_BYTE_LENGTH;
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
        return Optional.ofNullable(sendingTime.value());
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
        if (!clMsgSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += ClMsgSeqNumField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!sendingTime.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!orderPx.parse(data, cursor)) {
            return false;
        }
        cursor += OrderPxField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!executionWithinFirmShortCode.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionWithinFirmShortCodeField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!lpRoleOptional.parse(data, cursor)) {
            return false;
        }
        cursor += LpRoleOptionalField.BYTE_LENGTH;
        if (!executionInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionInstructionField.BYTE_LENGTH;
        if (!darkExecutionInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += DarkExecutionInstructionField.BYTE_LENGTH;
        if (!mifidIndicators.parse(data, cursor)) {
            return false;
        }
        cursor += MifidIndicatorsField.BYTE_LENGTH;
        if (!stpid.parse(data, cursor)) {
            return false;
        }
        cursor += StpidField.BYTE_LENGTH;
        if (!freeTextGroups.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += freeTextGroups.byteLength();
        if (end - cursor < 6) {
            return false;
        }
        if (!mifidShortCodesGroups.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += mifidShortCodesGroups.byteLength();
        if (end - cursor < 4) {
            return false;
        }
        if (!orderOptionalFieldsGroups.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += orderOptionalFieldsGroups.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!orderClearingFieldsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += orderClearingFieldsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = clMsgSeqNum.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = sendingTime.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = orderPx.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = executionWithinFirmShortCode.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = lpRoleOptional.encode(data, cursor);
        cursor = executionInstruction.encode(data, cursor);
        cursor = darkExecutionInstruction.encode(data, cursor);
        cursor = mifidIndicators.encode(data, cursor);
        cursor = stpid.encode(data, cursor);
        cursor = freeTextGroups.encode(data, cursor);
        cursor = mifidShortCodesGroups.encode(data, cursor);
        cursor = orderOptionalFieldsGroups.encode(data, cursor);
        cursor = orderClearingFieldsGroups.encode(data, cursor);
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
        freeTextGroups.clear();
        mifidShortCodesGroups.clear();
        orderOptionalFieldsGroups.clear();
        orderClearingFieldsGroups.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        if (!freeTextGroups.isRecognized()) {
            return false;
        }
        if (!mifidShortCodesGroups.isRecognized()) {
            return false;
        }
        if (!orderOptionalFieldsGroups.isRecognized()) {
            return false;
        }
        return orderClearingFieldsGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!freeTextGroups.isValid()) {
            return false;
        }
        if (!mifidShortCodesGroups.isValid()) {
            return false;
        }
        if (!orderOptionalFieldsGroups.isValid()) {
            return false;
        }
        if (!orderClearingFieldsGroups.isValid()) {
            return false;
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
        if (!clMsgSeqNum.isDecoded()) {
            return Optional.of(clMsgSeqNum);
        }
        if (!firmId.isDecoded()) {
            return Optional.of(firmId);
        }
        if (!sendingTime.isDecoded()) {
            return Optional.of(sendingTime);
        }
        if (!clientOrderId.isDecoded()) {
            return Optional.of(clientOrderId);
        }
        if (!symbolIndex.isDecoded()) {
            return Optional.of(symbolIndex);
        }
        if (!emm.isDecoded()) {
            return Optional.of(emm);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!orderType.isDecoded()) {
            return Optional.of(orderType);
        }
        if (!timeInForce.isDecoded()) {
            return Optional.of(timeInForce);
        }
        if (!orderPx.isDecoded()) {
            return Optional.of(orderPx);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!executionWithinFirmShortCode.isDecoded()) {
            return Optional.of(executionWithinFirmShortCode);
        }
        if (!tradingCapacity.isDecoded()) {
            return Optional.of(tradingCapacity);
        }
        if (!accountType.isDecoded()) {
            return Optional.of(accountType);
        }
        if (!lpRoleOptional.isDecoded()) {
            return Optional.of(lpRoleOptional);
        }
        if (!executionInstruction.isDecoded()) {
            return Optional.of(executionInstruction);
        }
        if (!darkExecutionInstruction.isDecoded()) {
            return Optional.of(darkExecutionInstruction);
        }
        if (!mifidIndicators.isDecoded()) {
            return Optional.of(mifidIndicators);
        }
        if (!stpid.isDecoded()) {
            return Optional.of(stpid);
        }
        if (!freeTextGroups.isDecoded()) {
            return freeTextGroups.failedAt();
        }
        if (!mifidShortCodesGroups.isDecoded()) {
            return mifidShortCodesGroups.failedAt();
        }
        if (!orderOptionalFieldsGroups.isDecoded()) {
            return orderOptionalFieldsGroups.failedAt();
        }
        if (!orderClearingFieldsGroups.isDecoded()) {
            return orderClearingFieldsGroups.failedAt();
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
            case "ClMsgSeqNum" -> Optional.of(clMsgSeqNum);
            case "FirmId" -> Optional.of(firmId);
            case "SendingTime" -> Optional.of(sendingTime);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "Emm" -> Optional.of(emm);
            case "Side" -> Optional.of(side);
            case "OrderType" -> Optional.of(orderType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "OrderPx" -> Optional.of(orderPx);
            case "OrderQty" -> Optional.of(orderQty);
            case "ExecutionWithinFirmShortCode" -> Optional.of(executionWithinFirmShortCode);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "AccountType" -> Optional.of(accountType);
            case "LpRoleOptional" -> Optional.of(lpRoleOptional);
            case "ExecutionInstruction" -> Optional.of(executionInstruction);
            case "DarkExecutionInstruction" -> Optional.of(darkExecutionInstruction);
            case "MifidIndicators" -> Optional.of(mifidIndicators);
            case "Stpid" -> Optional.of(stpid);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(freeTextGroups.diffFields(message.freeTextGroups));
        changed.addAll(mifidShortCodesGroups.diffFields(message.mifidShortCodesGroups));
        changed.addAll(orderOptionalFieldsGroups.diffFields(message.orderOptionalFieldsGroups));
        changed.addAll(orderClearingFieldsGroups.diffFields(message.orderClearingFieldsGroups));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            freeTextGroups.toFormattedString(builder, options);
            builder.append(", ");
            mifidShortCodesGroups.toFormattedString(builder, options);
            builder.append(", ");
            orderOptionalFieldsGroups.toFormattedString(builder, options);
            builder.append(", ");
            orderClearingFieldsGroups.toFormattedString(builder, options);
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
        freeTextGroups.toFormattedString(builder, nested);
        mifidShortCodesGroups.toFormattedString(builder, nested);
        orderOptionalFieldsGroups.toFormattedString(builder, nested);
        orderClearingFieldsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof NewOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && freeTextGroups.equals(message.freeTextGroups) && mifidShortCodesGroups.equals(message.mifidShortCodesGroups) && orderOptionalFieldsGroups.equals(message.orderOptionalFieldsGroups) && orderClearingFieldsGroups.equals(message.orderClearingFieldsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, freeTextGroups, mifidShortCodesGroups, orderOptionalFieldsGroups, orderClearingFieldsGroups);
    }
}
