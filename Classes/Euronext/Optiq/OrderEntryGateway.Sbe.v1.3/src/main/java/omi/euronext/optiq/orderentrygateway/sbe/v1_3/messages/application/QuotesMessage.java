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
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ExecutionWithinFirmShortCodeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FirmIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.LpRoleField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.MifidIndicatorsField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.RfeAnswerField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SendingTimeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.TradingCapacityField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.ClearingDatasetGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.MifidShortCodesGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.QuotesRepGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Field;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.PrintOptions;

/**
 * Represents the QuotesMessage message from the OrderEntryGateway protocol.
 *
 * <p>QuotesMessage</p>
 */
public final class QuotesMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 43;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quotes Message";

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
    private final LpRoleField lpRole = new LpRoleField();

    /**
     * MiFIDIndicators_set bit set
     */
    private final MifidIndicatorsField mifidIndicators = new MifidIndicatorsField();

    /**
     * rFEAnswer
     */
    private final RfeAnswerField rfeAnswer = new RfeAnswerField();

    /**
     * MiFIDShortcodes Block
     */
    private final MifidShortCodesGroups mifidShortCodesGroups = new MifidShortCodesGroups();

    /**
     * ClearingDataset Block
     */
    private final ClearingDatasetGroups clearingDatasetGroups = new ClearingDatasetGroups();

    /**
     * QuotesRep Block
     */
    private final QuotesRepGroups quotesRepGroups = new QuotesRepGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clMsgSeqNum, firmId, sendingTime, clientOrderId, executionWithinFirmShortCode, tradingCapacity, accountType, lpRole, mifidIndicators, rfeAnswer);

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
     * @return the LpRole field
     */
    public LpRoleField lpRole() {
        return lpRole;
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
     * rFEAnswer
     *
     * @return the RfeAnswer field
     */
    public RfeAnswerField rfeAnswer() {
        return rfeAnswer;
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
     * ClearingDataset Block
     *
     * @return the ClearingDatasetGroups record
     */
    public ClearingDatasetGroups clearingDatasetGroups() {
        return clearingDatasetGroups;
    }

    /**
     * QuotesRep Block
     *
     * @return the QuotesRepGroups record
     */
    public QuotesRepGroups quotesRepGroups() {
        return quotesRepGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + mifidShortCodesGroups.byteLength() - MifidShortCodesGroups.MINIMUM_BYTE_LENGTH + clearingDatasetGroups.byteLength() - ClearingDatasetGroups.MINIMUM_BYTE_LENGTH + quotesRepGroups.byteLength() - QuotesRepGroups.MINIMUM_BYTE_LENGTH;
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
        if (!lpRole.parse(data, cursor)) {
            return false;
        }
        cursor += LpRoleField.BYTE_LENGTH;
        if (!mifidIndicators.parse(data, cursor)) {
            return false;
        }
        cursor += MifidIndicatorsField.BYTE_LENGTH;
        if (!rfeAnswer.parse(data, cursor)) {
            return false;
        }
        cursor += RfeAnswerField.BYTE_LENGTH;
        if (!mifidShortCodesGroups.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += mifidShortCodesGroups.byteLength();
        if (end - cursor < 4) {
            return false;
        }
        if (!clearingDatasetGroups.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += clearingDatasetGroups.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!quotesRepGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += quotesRepGroups.byteLength();

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
        cursor = executionWithinFirmShortCode.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = lpRole.encode(data, cursor);
        cursor = mifidIndicators.encode(data, cursor);
        cursor = rfeAnswer.encode(data, cursor);
        cursor = mifidShortCodesGroups.encode(data, cursor);
        cursor = clearingDatasetGroups.encode(data, cursor);
        cursor = quotesRepGroups.encode(data, cursor);
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
        mifidShortCodesGroups.clear();
        clearingDatasetGroups.clear();
        quotesRepGroups.clear();
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
        if (!mifidShortCodesGroups.isRecognized()) {
            return false;
        }
        if (!clearingDatasetGroups.isRecognized()) {
            return false;
        }
        return quotesRepGroups.isRecognized();
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
        if (!mifidShortCodesGroups.isValid()) {
            return false;
        }
        if (!clearingDatasetGroups.isValid()) {
            return false;
        }
        if (!quotesRepGroups.isValid()) {
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
        if (!executionWithinFirmShortCode.isDecoded()) {
            return Optional.of(executionWithinFirmShortCode);
        }
        if (!tradingCapacity.isDecoded()) {
            return Optional.of(tradingCapacity);
        }
        if (!accountType.isDecoded()) {
            return Optional.of(accountType);
        }
        if (!lpRole.isDecoded()) {
            return Optional.of(lpRole);
        }
        if (!mifidIndicators.isDecoded()) {
            return Optional.of(mifidIndicators);
        }
        if (!rfeAnswer.isDecoded()) {
            return Optional.of(rfeAnswer);
        }
        if (!mifidShortCodesGroups.isDecoded()) {
            return mifidShortCodesGroups.failedAt();
        }
        if (!clearingDatasetGroups.isDecoded()) {
            return clearingDatasetGroups.failedAt();
        }
        if (!quotesRepGroups.isDecoded()) {
            return quotesRepGroups.failedAt();
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
            case "ExecutionWithinFirmShortCode" -> Optional.of(executionWithinFirmShortCode);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "AccountType" -> Optional.of(accountType);
            case "LpRole" -> Optional.of(lpRole);
            case "MifidIndicators" -> Optional.of(mifidIndicators);
            case "RfeAnswer" -> Optional.of(rfeAnswer);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuotesMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(mifidShortCodesGroups.diffFields(message.mifidShortCodesGroups));
        changed.addAll(clearingDatasetGroups.diffFields(message.clearingDatasetGroups));
        changed.addAll(quotesRepGroups.diffFields(message.quotesRepGroups));
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
            mifidShortCodesGroups.toFormattedString(builder, options);
            builder.append(", ");
            clearingDatasetGroups.toFormattedString(builder, options);
            builder.append(", ");
            quotesRepGroups.toFormattedString(builder, options);
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
        mifidShortCodesGroups.toFormattedString(builder, nested);
        clearingDatasetGroups.toFormattedString(builder, nested);
        quotesRepGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof QuotesMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && mifidShortCodesGroups.equals(message.mifidShortCodesGroups) && clearingDatasetGroups.equals(message.clearingDatasetGroups) && quotesRepGroups.equals(message.quotesRepGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, mifidShortCodesGroups, clearingDatasetGroups, quotesRepGroups);
    }
}
