package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AccountField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AccountTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.ClearingBusinessDateField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.ContraryInstructionIndicatorField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.OrigPosReqRefIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.PosMaintActionField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.PosMaintResultField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.PosMaintRptIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.PosMaintStatusField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.PosReqIdOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.PosTransTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SenderLocationField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.ThresholdAmountField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.TradeIdOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.TransactTimeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.DeskId;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.Memo;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.OutboundBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.PositionsGroups;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.Text;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.PrintOptions;

/**
 * Represents the PositionMaintenanceReportMessage message from the BinaryEntryPoint protocol.
 *
 * <p>PositionMaintenanceReportMessage</p>
 */
public final class PositionMaintenanceReportMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 101;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Position Maintenance Report Message";

    /**
     * posReqID
     */
    private final PosReqIdOptionalField posReqIdOptional = new PosReqIdOptionalField();

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * posMaintRptID
     */
    private final PosMaintRptIdField posMaintRptId = new PosMaintRptIdField();

    /**
     * posTransType
     */
    private final PosTransTypeField posTransType = new PosTransTypeField();

    /**
     * posMaintAction
     */
    private final PosMaintActionField posMaintAction = new PosMaintActionField();

    /**
     * posMaintStatus
     */
    private final PosMaintStatusField posMaintStatus = new PosMaintStatusField();

    /**
     * tradeID
     */
    private final TradeIdOptionalField tradeIdOptional = new TradeIdOptionalField();

    /**
     * origPosReqRefID
     */
    private final OrigPosReqRefIdField origPosReqRefId = new OrigPosReqRefIdField();

    /**
     * accountType
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * clearingBusinessDate
     */
    private final ClearingBusinessDateField clearingBusinessDate = new ClearingBusinessDateField();

    /**
     * thresholdAmount
     */
    private final ThresholdAmountField thresholdAmount = new ThresholdAmountField();

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * account
     */
    private final AccountField account = new AccountField();

    /**
     * senderLocation
     */
    private final SenderLocationField senderLocation = new SenderLocationField();

    /**
     * posMaintResult
     */
    private final PosMaintResultField posMaintResult = new PosMaintResultField();

    /**
     * contraryInstructionIndicator
     */
    private final ContraryInstructionIndicatorField contraryInstructionIndicator = new ContraryInstructionIndicatorField();

    /**
     * OutboundBusinessHeader
     */
    private final OutboundBusinessHeader outboundBusinessHeader = new OutboundBusinessHeader();

    /**
     * noPositions Block
     */
    private final PositionsGroups positionsGroups = new PositionsGroups();

    /**
     * deskID data struct
     */
    private final DeskId deskId = new DeskId();

    /**
     * memo data struct
     */
    private final Memo memo = new Memo();

    /**
     * text data struct
     */
    private final Text text = new Text();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(outboundBusinessHeader.fields(), List.<Field>of(posReqIdOptional), List.<Field>of(securityId), List.<Field>of(posMaintRptId), List.<Field>of(posTransType), List.<Field>of(posMaintAction), List.<Field>of(posMaintStatus), List.<Field>of(tradeIdOptional), List.<Field>of(origPosReqRefId), List.<Field>of(accountType), List.<Field>of(clearingBusinessDate), List.<Field>of(thresholdAmount), List.<Field>of(transactTime), List.<Field>of(account), List.<Field>of(senderLocation), List.<Field>of(posMaintResult), List.<Field>of(contraryInstructionIndicator), deskId.fields(), memo.fields(), text.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * posReqID
     *
     * @return the PosReqIdOptional field
     */
    public PosReqIdOptionalField posReqIdOptional() {
        return posReqIdOptional;
    }

    /**
     * securityID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * posMaintRptID
     *
     * @return the PosMaintRptId field
     */
    public PosMaintRptIdField posMaintRptId() {
        return posMaintRptId;
    }

    /**
     * posTransType
     *
     * @return the PosTransType field
     */
    public PosTransTypeField posTransType() {
        return posTransType;
    }

    /**
     * posMaintAction
     *
     * @return the PosMaintAction field
     */
    public PosMaintActionField posMaintAction() {
        return posMaintAction;
    }

    /**
     * posMaintStatus
     *
     * @return the PosMaintStatus field
     */
    public PosMaintStatusField posMaintStatus() {
        return posMaintStatus;
    }

    /**
     * tradeID
     *
     * @return the TradeIdOptional field
     */
    public TradeIdOptionalField tradeIdOptional() {
        return tradeIdOptional;
    }

    /**
     * origPosReqRefID
     *
     * @return the OrigPosReqRefId field
     */
    public OrigPosReqRefIdField origPosReqRefId() {
        return origPosReqRefId;
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
     * clearingBusinessDate
     *
     * @return the ClearingBusinessDate field
     */
    public ClearingBusinessDateField clearingBusinessDate() {
        return clearingBusinessDate;
    }

    /**
     * thresholdAmount
     *
     * @return the ThresholdAmount field
     */
    public ThresholdAmountField thresholdAmount() {
        return thresholdAmount;
    }

    /**
     * transactTime
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * senderLocation
     *
     * @return the SenderLocation field
     */
    public SenderLocationField senderLocation() {
        return senderLocation;
    }

    /**
     * posMaintResult
     *
     * @return the PosMaintResult field
     */
    public PosMaintResultField posMaintResult() {
        return posMaintResult;
    }

    /**
     * contraryInstructionIndicator
     *
     * @return the ContraryInstructionIndicator field
     */
    public ContraryInstructionIndicatorField contraryInstructionIndicator() {
        return contraryInstructionIndicator;
    }

    /**
     * OutboundBusinessHeader
     *
     * @return the OutboundBusinessHeader record
     */
    public OutboundBusinessHeader outboundBusinessHeader() {
        return outboundBusinessHeader;
    }

    /**
     * noPositions Block
     *
     * @return the PositionsGroups record
     */
    public PositionsGroups positionsGroups() {
        return positionsGroups;
    }

    /**
     * deskID data struct
     *
     * @return the DeskId record
     */
    public DeskId deskId() {
        return deskId;
    }

    /**
     * memo data struct
     *
     * @return the Memo record
     */
    public Memo memo() {
        return memo;
    }

    /**
     * text data struct
     *
     * @return the Text record
     */
    public Text text() {
        return text;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + positionsGroups.byteLength() - PositionsGroups.MINIMUM_BYTE_LENGTH + deskId.byteLength() - DeskId.MINIMUM_BYTE_LENGTH + memo.byteLength() - Memo.MINIMUM_BYTE_LENGTH + text.byteLength() - Text.MINIMUM_BYTE_LENGTH;
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
        return Optional.ofNullable(outboundBusinessHeader.sendingTime().value());
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
        if (!outboundBusinessHeader.parseFrom(data, cursor, end - 83)) {
            return false;
        }
        cursor += outboundBusinessHeader.byteLength();
        if (!posReqIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += PosReqIdOptionalField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!posMaintRptId.parse(data, cursor)) {
            return false;
        }
        cursor += PosMaintRptIdField.BYTE_LENGTH;
        if (!posTransType.parse(data, cursor)) {
            return false;
        }
        cursor += PosTransTypeField.BYTE_LENGTH;
        if (!posMaintAction.parse(data, cursor)) {
            return false;
        }
        cursor += PosMaintActionField.BYTE_LENGTH;
        if (!posMaintStatus.parse(data, cursor)) {
            return false;
        }
        cursor += PosMaintStatusField.BYTE_LENGTH;
        if (!tradeIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdOptionalField.BYTE_LENGTH;
        if (!origPosReqRefId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigPosReqRefIdField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!clearingBusinessDate.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingBusinessDateField.BYTE_LENGTH;
        if (!thresholdAmount.parse(data, cursor)) {
            return false;
        }
        cursor += ThresholdAmountField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!senderLocation.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationField.BYTE_LENGTH;
        if (!posMaintResult.parse(data, cursor)) {
            return false;
        }
        cursor += PosMaintResultField.BYTE_LENGTH;
        if (!contraryInstructionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ContraryInstructionIndicatorField.BYTE_LENGTH;
        if (!positionsGroups.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += positionsGroups.byteLength();
        if (end - cursor < 3) {
            return false;
        }
        if (!deskId.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += deskId.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!memo.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += memo.byteLength();
        if (end - cursor < 1) {
            return false;
        }
        if (!text.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += text.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = outboundBusinessHeader.encode(data, cursor);
        cursor = posReqIdOptional.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = posMaintRptId.encode(data, cursor);
        cursor = posTransType.encode(data, cursor);
        cursor = posMaintAction.encode(data, cursor);
        cursor = posMaintStatus.encode(data, cursor);
        cursor = tradeIdOptional.encode(data, cursor);
        cursor = origPosReqRefId.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = clearingBusinessDate.encode(data, cursor);
        cursor = thresholdAmount.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = senderLocation.encode(data, cursor);
        cursor = posMaintResult.encode(data, cursor);
        cursor = contraryInstructionIndicator.encode(data, cursor);
        cursor = positionsGroups.encode(data, cursor);
        cursor = deskId.encode(data, cursor);
        cursor = memo.encode(data, cursor);
        cursor = text.encode(data, cursor);
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
        outboundBusinessHeader.clear();
        positionsGroups.clear();
        deskId.clear();
        memo.clear();
        text.clear();
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
            if (field != deskId.deskIdLength() && field != memo.memoLength() && field != text.textLength() && !field.isRecognized()) {
                return false;
            }
        }
        return positionsGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != deskId.deskIdLength() && field != memo.memoLength() && field != text.textLength() && !field.isValid()) {
                return false;
            }
        }
        if (!positionsGroups.isValid()) {
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
        if (!outboundBusinessHeader.isDecoded()) {
            return outboundBusinessHeader.failedAt();
        }
        if (!posReqIdOptional.isDecoded()) {
            return Optional.of(posReqIdOptional);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!posMaintRptId.isDecoded()) {
            return Optional.of(posMaintRptId);
        }
        if (!posTransType.isDecoded()) {
            return Optional.of(posTransType);
        }
        if (!posMaintAction.isDecoded()) {
            return Optional.of(posMaintAction);
        }
        if (!posMaintStatus.isDecoded()) {
            return Optional.of(posMaintStatus);
        }
        if (!tradeIdOptional.isDecoded()) {
            return Optional.of(tradeIdOptional);
        }
        if (!origPosReqRefId.isDecoded()) {
            return Optional.of(origPosReqRefId);
        }
        if (!accountType.isDecoded()) {
            return Optional.of(accountType);
        }
        if (!clearingBusinessDate.isDecoded()) {
            return Optional.of(clearingBusinessDate);
        }
        if (!thresholdAmount.isDecoded()) {
            return Optional.of(thresholdAmount);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!account.isDecoded()) {
            return Optional.of(account);
        }
        if (!senderLocation.isDecoded()) {
            return Optional.of(senderLocation);
        }
        if (!posMaintResult.isDecoded()) {
            return Optional.of(posMaintResult);
        }
        if (!contraryInstructionIndicator.isDecoded()) {
            return Optional.of(contraryInstructionIndicator);
        }
        if (!positionsGroups.isDecoded()) {
            return positionsGroups.failedAt();
        }
        if (!deskId.isDecoded()) {
            return deskId.failedAt();
        }
        if (!memo.isDecoded()) {
            return memo.failedAt();
        }
        if (!text.isDecoded()) {
            return text.failedAt();
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
            case "PosReqIdOptional" -> Optional.of(posReqIdOptional);
            case "SecurityId" -> Optional.of(securityId);
            case "PosMaintRptId" -> Optional.of(posMaintRptId);
            case "PosTransType" -> Optional.of(posTransType);
            case "PosMaintAction" -> Optional.of(posMaintAction);
            case "PosMaintStatus" -> Optional.of(posMaintStatus);
            case "TradeIdOptional" -> Optional.of(tradeIdOptional);
            case "OrigPosReqRefId" -> Optional.of(origPosReqRefId);
            case "AccountType" -> Optional.of(accountType);
            case "ClearingBusinessDate" -> Optional.of(clearingBusinessDate);
            case "ThresholdAmount" -> Optional.of(thresholdAmount);
            case "TransactTime" -> Optional.of(transactTime);
            case "Account" -> Optional.of(account);
            case "SenderLocation" -> Optional.of(senderLocation);
            case "PosMaintResult" -> Optional.of(posMaintResult);
            case "ContraryInstructionIndicator" -> Optional.of(contraryInstructionIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PositionMaintenanceReportMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(positionsGroups.diffFields(message.positionsGroups));
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
            positionsGroups.toFormattedString(builder, options);
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
        positionsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof PositionMaintenanceReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && positionsGroups.equals(message.positionsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, positionsGroups);
    }
}
