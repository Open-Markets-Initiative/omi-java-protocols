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
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ContractIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.EmmOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ExecutionWithinFirmShortCodeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FirmIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.InstrumentGroupCodeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.LogicalAccessIdOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.MaturityField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OePartitionIdOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OptionTypeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SendingTimeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SideOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SymbolIndexOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Field;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.PrintOptions;

/**
 * Represents the MassCancelMessage message from the OrderEntryGateway protocol.
 *
 * <p>MassCancelMessage</p>
 */
public final class MassCancelMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 64;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Cancel Message";

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
     * symbolIndex
     */
    private final SymbolIndexOptionalField symbolIndexOptional = new SymbolIndexOptionalField();

    /**
     * eMM
     */
    private final EmmOptionalField emmOptional = new EmmOptionalField();

    /**
     * instrumentGroupCode
     */
    private final InstrumentGroupCodeField instrumentGroupCode = new InstrumentGroupCodeField();

    /**
     * side
     */
    private final SideOptionalField sideOptional = new SideOptionalField();

    /**
     * logicalAccessID
     */
    private final LogicalAccessIdOptionalField logicalAccessIdOptional = new LogicalAccessIdOptionalField();

    /**
     * oEPartitionID
     */
    private final OePartitionIdOptionalField oePartitionIdOptional = new OePartitionIdOptionalField();

    /**
     * contractID
     */
    private final ContractIdField contractId = new ContractIdField();

    /**
     * maturity
     */
    private final MaturityField maturity = new MaturityField();

    /**
     * accountType
     */
    private final AccountTypeOptionalField accountTypeOptional = new AccountTypeOptionalField();

    /**
     * optionType
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clMsgSeqNum, firmId, sendingTime, executionWithinFirmShortCode, clientIdentificationShortcode, clientOrderId, symbolIndexOptional, emmOptional, instrumentGroupCode, sideOptional, logicalAccessIdOptional, oePartitionIdOptional, contractId, maturity, accountTypeOptional, optionType);

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
     * symbolIndex
     *
     * @return the SymbolIndexOptional field
     */
    public SymbolIndexOptionalField symbolIndexOptional() {
        return symbolIndexOptional;
    }

    /**
     * eMM
     *
     * @return the EmmOptional field
     */
    public EmmOptionalField emmOptional() {
        return emmOptional;
    }

    /**
     * instrumentGroupCode
     *
     * @return the InstrumentGroupCode field
     */
    public InstrumentGroupCodeField instrumentGroupCode() {
        return instrumentGroupCode;
    }

    /**
     * side
     *
     * @return the SideOptional field
     */
    public SideOptionalField sideOptional() {
        return sideOptional;
    }

    /**
     * logicalAccessID
     *
     * @return the LogicalAccessIdOptional field
     */
    public LogicalAccessIdOptionalField logicalAccessIdOptional() {
        return logicalAccessIdOptional;
    }

    /**
     * oEPartitionID
     *
     * @return the OePartitionIdOptional field
     */
    public OePartitionIdOptionalField oePartitionIdOptional() {
        return oePartitionIdOptional;
    }

    /**
     * contractID
     *
     * @return the ContractId field
     */
    public ContractIdField contractId() {
        return contractId;
    }

    /**
     * maturity
     *
     * @return the Maturity field
     */
    public MaturityField maturity() {
        return maturity;
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
     * optionType
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
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
        if (!symbolIndexOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexOptionalField.BYTE_LENGTH;
        if (!emmOptional.parse(data, cursor)) {
            return false;
        }
        cursor += EmmOptionalField.BYTE_LENGTH;
        if (!instrumentGroupCode.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentGroupCodeField.BYTE_LENGTH;
        if (!sideOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SideOptionalField.BYTE_LENGTH;
        if (!logicalAccessIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += LogicalAccessIdOptionalField.BYTE_LENGTH;
        if (!oePartitionIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OePartitionIdOptionalField.BYTE_LENGTH;
        if (!contractId.parse(data, cursor)) {
            return false;
        }
        cursor += ContractIdField.BYTE_LENGTH;
        if (!maturity.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityField.BYTE_LENGTH;
        if (!accountTypeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeOptionalField.BYTE_LENGTH;
        return optionType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clMsgSeqNum.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = sendingTime.encode(data, cursor);
        cursor = executionWithinFirmShortCode.encode(data, cursor);
        cursor = clientIdentificationShortcode.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = symbolIndexOptional.encode(data, cursor);
        cursor = emmOptional.encode(data, cursor);
        cursor = instrumentGroupCode.encode(data, cursor);
        cursor = sideOptional.encode(data, cursor);
        cursor = logicalAccessIdOptional.encode(data, cursor);
        cursor = oePartitionIdOptional.encode(data, cursor);
        cursor = contractId.encode(data, cursor);
        cursor = maturity.encode(data, cursor);
        cursor = accountTypeOptional.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
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
            case "ClMsgSeqNum" -> Optional.of(clMsgSeqNum);
            case "FirmId" -> Optional.of(firmId);
            case "SendingTime" -> Optional.of(sendingTime);
            case "ExecutionWithinFirmShortCode" -> Optional.of(executionWithinFirmShortCode);
            case "ClientIdentificationShortcode" -> Optional.of(clientIdentificationShortcode);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "SymbolIndexOptional" -> Optional.of(symbolIndexOptional);
            case "EmmOptional" -> Optional.of(emmOptional);
            case "InstrumentGroupCode" -> Optional.of(instrumentGroupCode);
            case "SideOptional" -> Optional.of(sideOptional);
            case "LogicalAccessIdOptional" -> Optional.of(logicalAccessIdOptional);
            case "OePartitionIdOptional" -> Optional.of(oePartitionIdOptional);
            case "ContractId" -> Optional.of(contractId);
            case "Maturity" -> Optional.of(maturity);
            case "AccountTypeOptional" -> Optional.of(accountTypeOptional);
            case "OptionType" -> Optional.of(optionType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassCancelMessage message)) {
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
        if (!(other instanceof MassCancelMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
