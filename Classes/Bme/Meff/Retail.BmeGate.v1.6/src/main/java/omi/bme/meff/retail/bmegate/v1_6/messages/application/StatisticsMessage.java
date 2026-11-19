package omi.bme.meff.retail.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.meff.retail.bmegate.v1_6.fields.DataCountField;
import omi.bme.meff.retail.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.meff.retail.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.meff.retail.bmegate.v1_6.fields.TransactionDateAndTimeField;
import omi.bme.meff.retail.bmegate.v1_6.groups.StatisticsRepeatingGroupEntry;
import omi.bme.meff.retail.bmegate.v1_6.groups.StatisticsRepeatingGroupList;
import omi.bme.meff.retail.bmegate.v1_6.types.Field;
import omi.bme.meff.retail.bmegate.v1_6.types.Message;
import omi.bme.meff.retail.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the StatisticsMessage message from the Retail protocol.
 *
 * <p>Message sent by the server to inform about closing prices and other statistics</p>
 */
public final class StatisticsMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 17;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Statistics Message";

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
     * Number of data values
     */
    private final DataCountField dataCount = new DataCountField();

    /**
     * Repeating group of the Statistics message, one entry per data value, DataCount entries
     */
    private final StatisticsRepeatingGroupList statisticsRepeatingGroup = new StatisticsRepeatingGroupList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, securityCode, transactionDateAndTime, dataCount);

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
     * Number of data values
     *
     * @return the DataCount field
     */
    public DataCountField dataCount() {
        return dataCount;
    }

    /**
     * Repeating group of the Statistics message, one entry per data value, DataCount entries
     *
     * <p>Encode writes this list's size to the DataCount field.</p>
     *
     * @return the StatisticsRepeatingGroup entries
     */
    public StatisticsRepeatingGroupList statisticsRepeatingGroup() {
        return statisticsRepeatingGroup;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + statisticsRepeatingGroup.byteLength();
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
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
        if (!dataCount.parse(data, cursor)) {
            return false;
        }
        cursor += DataCountField.BYTE_LENGTH;
        if (!statisticsRepeatingGroup.parse(data, cursor, end, dataCount.value())) {
            return false;
        }
        cursor += statisticsRepeatingGroup.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (statisticsRepeatingGroup.size() > 255) {
            throw new IllegalStateException("statisticsRepeatingGroup holds " + statisticsRepeatingGroup.size() + " entries, more than its count field can state");
        }
        dataCount.value((short) statisticsRepeatingGroup.size());
        int cursor = offset;
        cursor = sequenceNumber.encode(data, cursor);
        cursor = securityCode.encode(data, cursor);
        cursor = transactionDateAndTime.encode(data, cursor);
        cursor = dataCount.encode(data, cursor);
        cursor = statisticsRepeatingGroup.encode(data, cursor);
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
        statisticsRepeatingGroup.clear();
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
            if (field != dataCount && !field.isRecognized()) {
                return false;
            }
        }
        return statisticsRepeatingGroup.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != dataCount && !field.isValid()) {
                return false;
            }
        }
        if (!statisticsRepeatingGroup.isValid()) {
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
        if (!sequenceNumber.isDecoded()) {
            return Optional.of(sequenceNumber);
        }
        if (!securityCode.isDecoded()) {
            return Optional.of(securityCode);
        }
        if (!transactionDateAndTime.isDecoded()) {
            return Optional.of(transactionDateAndTime);
        }
        if (!dataCount.isDecoded()) {
            return Optional.of(dataCount);
        }
        if (!statisticsRepeatingGroup.isDecoded()) {
            return Optional.of(statisticsRepeatingGroup.failedEntry().flatMap(StatisticsRepeatingGroupEntry::failedAt).orElse(dataCount));
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
            case "DataCount" -> Optional.of(dataCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StatisticsMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(statisticsRepeatingGroup.diffFields(message.statisticsRepeatingGroup));
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
            statisticsRepeatingGroup.toFormattedString(builder, options);
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
        statisticsRepeatingGroup.toFormattedString(builder, nested);
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
        if (!(other instanceof StatisticsMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && statisticsRepeatingGroup.equals(message.statisticsRepeatingGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, statisticsRepeatingGroup);
    }
}
