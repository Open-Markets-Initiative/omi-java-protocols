package omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClMsgSeqNumField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClientIdentificationShortcodeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClientOrderIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.EmmField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.EndClientField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ExecutionWithinFirmShortCodeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FirmIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FirmIdPublicationField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderQtyField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SendingTimeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SideOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SymbolIndexField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Field;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.PrintOptions;

/**
 * Represents the QuoteRequestMessage message from the OrderEntryGateway protocol.
 *
 * <p>QuoteRequestMessage</p>
 */
public final class QuoteRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 62;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Request Message";

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
    private final SideOptionalField sideOptional = new SideOptionalField();

    /**
     * firmIDPublication
     */
    private final FirmIdPublicationField firmIdPublication = new FirmIdPublicationField();

    /**
     * endClient
     */
    private final EndClientField endClient = new EndClientField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clMsgSeqNum, firmId, sendingTime, executionWithinFirmShortCode, clientIdentificationShortcode, clientOrderId, orderQty, symbolIndex, emm, sideOptional, firmIdPublication, endClient);

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
     * @return the SideOptional field
     */
    public SideOptionalField sideOptional() {
        return sideOptional;
    }

    /**
     * firmIDPublication
     *
     * @return the FirmIdPublication field
     */
    public FirmIdPublicationField firmIdPublication() {
        return firmIdPublication;
    }

    /**
     * endClient
     *
     * @return the EndClient field
     */
    public EndClientField endClient() {
        return endClient;
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
        if (!sideOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SideOptionalField.BYTE_LENGTH;
        if (!firmIdPublication.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdPublicationField.BYTE_LENGTH;
        return endClient.parse(data, cursor);
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
        cursor = orderQty.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = sideOptional.encode(data, cursor);
        cursor = firmIdPublication.encode(data, cursor);
        cursor = endClient.encode(data, cursor);
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
            case "OrderQty" -> Optional.of(orderQty);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "Emm" -> Optional.of(emm);
            case "SideOptional" -> Optional.of(sideOptional);
            case "FirmIdPublication" -> Optional.of(firmIdPublication);
            case "EndClient" -> Optional.of(endClient);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteRequestMessage message)) {
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
        if (!(other instanceof QuoteRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
