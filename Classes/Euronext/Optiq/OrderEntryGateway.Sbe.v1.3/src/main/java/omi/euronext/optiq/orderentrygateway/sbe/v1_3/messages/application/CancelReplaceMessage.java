package omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.AccountTypeOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClMsgSeqNumField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClientIdentificationShortcodeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClientOrderIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.DarkExecutionInstructionField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.EmmField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ExecutionInstructionField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ExecutionWithinFirmShortCodeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FirmIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.LpRoleOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.MifidIndicatorsField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderIdOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderPxField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderQtyField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderTypeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrigClientOrderIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SendingTimeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SideField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.StpidField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SymbolIndexField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.TimeInForceField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.CancelReplaceClearingFieldsGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.CancelReplaceOptionalFieldGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.FreeTextGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Field;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.PrintOptions;

/**
 * Represents the CancelReplaceMessage message from the OrderEntryGateway protocol.
 *
 * <p>CancelReplaceMessage</p>
 */
public final class CancelReplaceMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 89;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Cancel Replace Message";

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
     * executionWithinFirmShortCode
     */
    private final ExecutionWithinFirmShortCodeField executionWithinFirmShortCode = new ExecutionWithinFirmShortCodeField();

    /**
     * clientIdentificationShortcode
     */
    private final ClientIdentificationShortcodeField clientIdentificationShortcode = new ClientIdentificationShortcodeField();

    /**
     * clientOrderID
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * orderID
     */
    private final OrderIdOptionalField orderIdOptional = new OrderIdOptionalField();

    /**
     * origClientOrderID
     */
    private final OrigClientOrderIdField origClientOrderId = new OrigClientOrderIdField();

    /**
     * orderPx
     */
    private final OrderPxField orderPx = new OrderPxField();

    /**
     * orderQty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

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
     * accountType
     */
    private final AccountTypeOptionalField accountTypeOptional = new AccountTypeOptionalField();

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
     * OptionalFields Block
     */
    private final CancelReplaceOptionalFieldGroups cancelReplaceOptionalFieldGroups = new CancelReplaceOptionalFieldGroups();

    /**
     * ClearingFields Block
     */
    private final CancelReplaceClearingFieldsGroups cancelReplaceClearingFieldsGroups = new CancelReplaceClearingFieldsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clMsgSeqNum, firmId, sendingTime, executionWithinFirmShortCode, clientIdentificationShortcode, clientOrderId, orderIdOptional, origClientOrderId, orderPx, orderQty, symbolIndex, emm, side, orderType, timeInForce, accountTypeOptional, lpRoleOptional, executionInstruction, darkExecutionInstruction, mifidIndicators, stpid);

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
     * executionWithinFirmShortCode
     *
     * @return the ExecutionWithinFirmShortCode field
     */
    public ExecutionWithinFirmShortCodeField executionWithinFirmShortCode() {
        return executionWithinFirmShortCode;
    }

    /**
     * clientIdentificationShortcode
     *
     * @return the ClientIdentificationShortcode field
     */
    public ClientIdentificationShortcodeField clientIdentificationShortcode() {
        return clientIdentificationShortcode;
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
     * orderID
     *
     * @return the OrderIdOptional field
     */
    public OrderIdOptionalField orderIdOptional() {
        return orderIdOptional;
    }

    /**
     * origClientOrderID
     *
     * @return the OrigClientOrderId field
     */
    public OrigClientOrderIdField origClientOrderId() {
        return origClientOrderId;
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
     * accountType
     *
     * @return the AccountTypeOptional field
     */
    public AccountTypeOptionalField accountTypeOptional() {
        return accountTypeOptional;
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
     * OptionalFields Block
     *
     * @return the CancelReplaceOptionalFieldGroups record
     */
    public CancelReplaceOptionalFieldGroups cancelReplaceOptionalFieldGroups() {
        return cancelReplaceOptionalFieldGroups;
    }

    /**
     * ClearingFields Block
     *
     * @return the CancelReplaceClearingFieldsGroups record
     */
    public CancelReplaceClearingFieldsGroups cancelReplaceClearingFieldsGroups() {
        return cancelReplaceClearingFieldsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + freeTextGroups.byteLength() - FreeTextGroups.MINIMUM_BYTE_LENGTH + cancelReplaceOptionalFieldGroups.byteLength() - CancelReplaceOptionalFieldGroups.MINIMUM_BYTE_LENGTH + cancelReplaceClearingFieldsGroups.byteLength() - CancelReplaceClearingFieldsGroups.MINIMUM_BYTE_LENGTH;
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
        if (!executionWithinFirmShortCode.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionWithinFirmShortCodeField.BYTE_LENGTH;
        if (!clientIdentificationShortcode.parse(data, cursor)) {
            return false;
        }
        cursor += ClientIdentificationShortcodeField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!orderIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdOptionalField.BYTE_LENGTH;
        if (!origClientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClientOrderIdField.BYTE_LENGTH;
        if (!orderPx.parse(data, cursor)) {
            return false;
        }
        cursor += OrderPxField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
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
        if (!accountTypeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeOptionalField.BYTE_LENGTH;
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
        if (!freeTextGroups.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += freeTextGroups.byteLength();
        if (end - cursor < 4) {
            return false;
        }
        if (!cancelReplaceOptionalFieldGroups.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += cancelReplaceOptionalFieldGroups.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!cancelReplaceClearingFieldsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += cancelReplaceClearingFieldsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = clMsgSeqNum.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = sendingTime.encode(data, cursor);
        cursor = executionWithinFirmShortCode.encode(data, cursor);
        cursor = clientIdentificationShortcode.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = orderIdOptional.encode(data, cursor);
        cursor = origClientOrderId.encode(data, cursor);
        cursor = orderPx.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = accountTypeOptional.encode(data, cursor);
        cursor = lpRoleOptional.encode(data, cursor);
        cursor = executionInstruction.encode(data, cursor);
        cursor = darkExecutionInstruction.encode(data, cursor);
        cursor = mifidIndicators.encode(data, cursor);
        cursor = stpid.encode(data, cursor);
        cursor = freeTextGroups.encode(data, cursor);
        cursor = cancelReplaceOptionalFieldGroups.encode(data, cursor);
        cursor = cancelReplaceClearingFieldsGroups.encode(data, cursor);
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
        cancelReplaceOptionalFieldGroups.clear();
        cancelReplaceClearingFieldsGroups.clear();
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
        if (!cancelReplaceOptionalFieldGroups.isRecognized()) {
            return false;
        }
        return cancelReplaceClearingFieldsGroups.isRecognized();
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
        if (!cancelReplaceOptionalFieldGroups.isValid()) {
            return false;
        }
        if (!cancelReplaceClearingFieldsGroups.isValid()) {
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
        if (!executionWithinFirmShortCode.isDecoded()) {
            return Optional.of(executionWithinFirmShortCode);
        }
        if (!clientIdentificationShortcode.isDecoded()) {
            return Optional.of(clientIdentificationShortcode);
        }
        if (!clientOrderId.isDecoded()) {
            return Optional.of(clientOrderId);
        }
        if (!orderIdOptional.isDecoded()) {
            return Optional.of(orderIdOptional);
        }
        if (!origClientOrderId.isDecoded()) {
            return Optional.of(origClientOrderId);
        }
        if (!orderPx.isDecoded()) {
            return Optional.of(orderPx);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
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
        if (!accountTypeOptional.isDecoded()) {
            return Optional.of(accountTypeOptional);
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
        if (!cancelReplaceOptionalFieldGroups.isDecoded()) {
            return cancelReplaceOptionalFieldGroups.failedAt();
        }
        if (!cancelReplaceClearingFieldsGroups.isDecoded()) {
            return cancelReplaceClearingFieldsGroups.failedAt();
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
            case "ExecutionWithinFirmShortCode" -> Optional.of(executionWithinFirmShortCode);
            case "ClientIdentificationShortcode" -> Optional.of(clientIdentificationShortcode);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "OrderIdOptional" -> Optional.of(orderIdOptional);
            case "OrigClientOrderId" -> Optional.of(origClientOrderId);
            case "OrderPx" -> Optional.of(orderPx);
            case "OrderQty" -> Optional.of(orderQty);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "Emm" -> Optional.of(emm);
            case "Side" -> Optional.of(side);
            case "OrderType" -> Optional.of(orderType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "AccountTypeOptional" -> Optional.of(accountTypeOptional);
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
        if (!(other instanceof CancelReplaceMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(freeTextGroups.diffFields(message.freeTextGroups));
        changed.addAll(cancelReplaceOptionalFieldGroups.diffFields(message.cancelReplaceOptionalFieldGroups));
        changed.addAll(cancelReplaceClearingFieldsGroups.diffFields(message.cancelReplaceClearingFieldsGroups));
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
            cancelReplaceOptionalFieldGroups.toFormattedString(builder, options);
            builder.append(", ");
            cancelReplaceClearingFieldsGroups.toFormattedString(builder, options);
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
        cancelReplaceOptionalFieldGroups.toFormattedString(builder, nested);
        cancelReplaceClearingFieldsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof CancelReplaceMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && freeTextGroups.equals(message.freeTextGroups) && cancelReplaceOptionalFieldGroups.equals(message.cancelReplaceOptionalFieldGroups) && cancelReplaceClearingFieldsGroups.equals(message.cancelReplaceClearingFieldsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, freeTextGroups, cancelReplaceOptionalFieldGroups, cancelReplaceClearingFieldsGroups);
    }
}
