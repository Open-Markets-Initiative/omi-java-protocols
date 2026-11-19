package omi.bme.bmefixedincome.retail5.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.bmefixedincome.retail5.bmegate.v1_6.fields.IoiPriceField;
import omi.bme.bmefixedincome.retail5.bmegate.v1_6.fields.IoiQtyField;
import omi.bme.bmefixedincome.retail5.bmegate.v1_6.fields.IoiTransTypeField;
import omi.bme.bmefixedincome.retail5.bmegate.v1_6.fields.IoiidField;
import omi.bme.bmefixedincome.retail5.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.bmefixedincome.retail5.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.bmefixedincome.retail5.bmegate.v1_6.fields.SideField;
import omi.bme.bmefixedincome.retail5.bmegate.v1_6.fields.TradingSessionIdField;
import omi.bme.bmefixedincome.retail5.bmegate.v1_6.fields.TransactionDateAndTimeField;
import omi.bme.bmefixedincome.retail5.bmegate.v1_6.types.Field;
import omi.bme.bmefixedincome.retail5.bmegate.v1_6.types.Message;
import omi.bme.bmefixedincome.retail5.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the IndicationOfInterestMessage message from the Retail5 protocol.
 *
 * <p>Used by the Server to notify an indication of interest on a specific instrument. This functionality is available in Fixed Income and Derivatives</p>
 */
public final class IndicationOfInterestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 35;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Indication Of Interest Message";

    /**
     * Message sequence number
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Instrument (or Book) code
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     */
    private final TransactionDateAndTimeField transactionDateAndTime = new TransactionDateAndTimeField();

    /**
     * RFQ identifier
     */
    private final IoiidField ioiid = new IoiidField();

    /**
     * Message type
     */
    private final IoiTransTypeField ioiTransType = new IoiTransTypeField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Requested indicative volume
     */
    private final IoiQtyField ioiQty = new IoiQtyField();

    /**
     * Requested indicative price
     */
    private final IoiPriceField ioiPrice = new IoiPriceField();

    /**
     * Trading mode
     */
    private final TradingSessionIdField tradingSessionId = new TradingSessionIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, securityCode, transactionDateAndTime, ioiid, ioiTransType, side, ioiQty, ioiPrice, tradingSessionId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message sequence number
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Instrument (or Book) code
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     *
     * @return the TransactionDateAndTime field
     */
    public TransactionDateAndTimeField transactionDateAndTime() {
        return transactionDateAndTime;
    }

    /**
     * RFQ identifier
     *
     * @return the Ioiid field
     */
    public IoiidField ioiid() {
        return ioiid;
    }

    /**
     * Message type
     *
     * @return the IoiTransType field
     */
    public IoiTransTypeField ioiTransType() {
        return ioiTransType;
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
     * Requested indicative volume
     *
     * @return the IoiQty field
     */
    public IoiQtyField ioiQty() {
        return ioiQty;
    }

    /**
     * Requested indicative price
     *
     * @return the IoiPrice field
     */
    public IoiPriceField ioiPrice() {
        return ioiPrice;
    }

    /**
     * Trading mode
     *
     * @return the TradingSessionId field
     */
    public TradingSessionIdField tradingSessionId() {
        return tradingSessionId;
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
        return Optional.ofNullable(transactionDateAndTime.value());
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
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!transactionDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionDateAndTimeField.BYTE_LENGTH;
        if (!ioiid.parse(data, cursor)) {
            return false;
        }
        cursor += IoiidField.BYTE_LENGTH;
        if (!ioiTransType.parse(data, cursor)) {
            return false;
        }
        cursor += IoiTransTypeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!ioiQty.parse(data, cursor)) {
            return false;
        }
        cursor += IoiQtyField.BYTE_LENGTH;
        if (!ioiPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IoiPriceField.BYTE_LENGTH;
        return tradingSessionId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sequenceNumber.encode(data, cursor);
        cursor = securityCode.encode(data, cursor);
        cursor = transactionDateAndTime.encode(data, cursor);
        cursor = ioiid.encode(data, cursor);
        cursor = ioiTransType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = ioiQty.encode(data, cursor);
        cursor = ioiPrice.encode(data, cursor);
        cursor = tradingSessionId.encode(data, cursor);
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
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "SecurityCode" -> Optional.of(securityCode);
            case "TransactionDateAndTime" -> Optional.of(transactionDateAndTime);
            case "Ioiid" -> Optional.of(ioiid);
            case "IoiTransType" -> Optional.of(ioiTransType);
            case "Side" -> Optional.of(side);
            case "IoiQty" -> Optional.of(ioiQty);
            case "IoiPrice" -> Optional.of(ioiPrice);
            case "TradingSessionId" -> Optional.of(tradingSessionId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IndicationOfInterestMessage message)) {
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
        if (!(other instanceof IndicationOfInterestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
