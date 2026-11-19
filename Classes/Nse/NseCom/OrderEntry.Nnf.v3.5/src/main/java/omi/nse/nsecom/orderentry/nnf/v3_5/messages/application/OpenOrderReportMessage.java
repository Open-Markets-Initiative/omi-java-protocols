package omi.nse.nsecom.orderentry.nnf.v3_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.BrokerIdField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.FirmNameField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.MessageTypeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.ReportDateField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.TraderNameField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.TraderNumberField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.UserTypeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.Field;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.Message;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.PrintOptions;

/**
 * Represents the OpenOrderReportMessage message from the OrderEntry protocol.
 *
 * <p>1821 MS_RP_HDR 108 I, carried in the MS_RP_HDR structure</p>
 */
public final class OpenOrderReportMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 68;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Open Order Report Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 67, 1 };

    /**
     * This field is set to ‘H’ denoting Header
     */
    private final MessageTypeField messageType = new MessageTypeField();

    /**
     * Set to the report date
     */
    private final ReportDateField reportDate = new ReportDateField();

    /**
     * This field can take one of the following values. • ‘0’ denotes Dealer • ‘4’ denotes Corporate Manager • ‘5’ denotes Branch Manager This field should be set to zero while sending to the host
     */
    private final UserTypeField userType = new UserTypeField();

    /**
     * This field should contain the trading member ID
     */
    private final BrokerIdField brokerId = new BrokerIdField();

    /**
     * FirmName
     */
    private final FirmNameField firmName = new FirmNameField();

    /**
     * TraderNumber This field contains the trader or user ID
     */
    private final TraderNumberField traderNumber = new TraderNumberField();

    /**
     * This field should be set to blank while sending to the host
     */
    private final TraderNameField traderName = new TraderNameField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(messageType, reportDate, userType, brokerId, firmName, traderNumber, traderName);

    private byte[] buffer;

    private boolean decoded;

    /**
     * This field is set to ‘H’ denoting Header
     *
     * @return the MessageType field
     */
    public MessageTypeField messageType() {
        return messageType;
    }

    /**
     * Set to the report date
     *
     * @return the ReportDate field
     */
    public ReportDateField reportDate() {
        return reportDate;
    }

    /**
     * This field can take one of the following values. • ‘0’ denotes Dealer • ‘4’ denotes Corporate Manager • ‘5’ denotes Branch Manager This field should be set to zero while sending to the host
     *
     * @return the UserType field
     */
    public UserTypeField userType() {
        return userType;
    }

    /**
     * This field should contain the trading member ID
     *
     * @return the BrokerId field
     */
    public BrokerIdField brokerId() {
        return brokerId;
    }

    /**
     * FirmName
     *
     * @return the FirmName field
     */
    public FirmNameField firmName() {
        return firmName;
    }

    /**
     * TraderNumber This field contains the trader or user ID
     *
     * @return the TraderNumber field
     */
    public TraderNumberField traderNumber() {
        return traderNumber;
    }

    /**
     * This field should be set to blank while sending to the host
     *
     * @return the TraderName field
     */
    public TraderNameField traderName() {
        return traderName;
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
        return Optional.empty();
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
        if (!messageType.parse(data, cursor)) {
            return false;
        }
        cursor += MessageTypeField.BYTE_LENGTH;
        if (!reportDate.parse(data, cursor)) {
            return false;
        }
        cursor += ReportDateField.BYTE_LENGTH;
        if (!userType.parse(data, cursor)) {
            return false;
        }
        cursor += UserTypeField.BYTE_LENGTH;
        if (!brokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerIdField.BYTE_LENGTH;
        if (!firmName.parse(data, cursor)) {
            return false;
        }
        cursor += FirmNameField.BYTE_LENGTH;
        if (!traderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TraderNumberField.BYTE_LENGTH;
        if (!traderName.parse(data, cursor)) {
            return false;
        }
        cursor += TraderNameField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = messageType.encode(data, cursor);
        cursor = reportDate.encode(data, cursor);
        cursor = userType.encode(data, cursor);
        cursor = brokerId.encode(data, cursor);
        cursor = firmName.encode(data, cursor);
        cursor = traderNumber.encode(data, cursor);
        cursor = traderName.encode(data, cursor);
        if (buffer != null && buffer.length >= 68) {
            System.arraycopy(buffer, 67, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
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
            case "MessageType" -> Optional.of(messageType);
            case "ReportDate" -> Optional.of(reportDate);
            case "UserType" -> Optional.of(userType);
            case "BrokerId" -> Optional.of(brokerId);
            case "FirmName" -> Optional.of(firmName);
            case "TraderNumber" -> Optional.of(traderNumber);
            case "TraderName" -> Optional.of(traderName);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OpenOrderReportMessage message)) {
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
        if (!(other instanceof OpenOrderReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
