package omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.BusinessDateField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.ContractCodeField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.ExpiryDateField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.RecordCountField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.RemainingRecordsField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.TimeOfEventField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.groups.VolatilityPointsEntry;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.groups.VolatilityPointsList;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the ReferenceVolatilityPriceMessage message from the ReferencePricesSnapshot protocol.
 *
 * <p>Provides raw strikes. LME volatilities are quoted in Delta space, and the strikes for which LME provide volatilities correspond to plus or minus 5, 10 and 25, the 50 delta, the at the money strike and the tradable strikes for the instrument. The calculated Call Premium and Put Premium are provided for each volatility and strike price for both Traded Options and TAPOs.</p>
 */
public final class ReferenceVolatilityPriceMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 32;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Reference Volatility Price Message";

    /**
     * The time at which the price was established.
     */
    private final TimeOfEventField timeOfEvent = new TimeOfEventField();

    /**
     * The business date on which the price was established, as YYYYMMDD.
     */
    private final BusinessDateField businessDate = new BusinessDateField();

    /**
     * Contract code of the Option or TAPO.
     */
    private final ContractCodeField contractCode = new ContractCodeField();

    /**
     * Option expiry date, as YYYYMMDD.
     */
    private final ExpiryDateField expiryDate = new ExpiryDateField();

    /**
     * Number of remaining prices to be published for a product. When the value of RemainingRecords equals RecordCount this is the last message for the product.
     */
    private final RemainingRecordsField remainingRecords = new RemainingRecordsField();

    /**
     * The number of reference prices in this message.
     */
    private final RecordCountField recordCount = new RecordCountField();

    /**
     * One point of the reference volatility curve. The specification's length formula names the repeat NumVolatilityRecords, a field no table of this message declares; RecordCount is the count it gives, as the number of reference volatility points in this message
     */
    private final VolatilityPointsList volatilityPoints = new VolatilityPointsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOfEvent, businessDate, contractCode, expiryDate, remainingRecords, recordCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time at which the price was established.
     *
     * @return the TimeOfEvent field
     */
    public TimeOfEventField timeOfEvent() {
        return timeOfEvent;
    }

    /**
     * The business date on which the price was established, as YYYYMMDD.
     *
     * @return the BusinessDate field
     */
    public BusinessDateField businessDate() {
        return businessDate;
    }

    /**
     * Contract code of the Option or TAPO.
     *
     * @return the ContractCode field
     */
    public ContractCodeField contractCode() {
        return contractCode;
    }

    /**
     * Option expiry date, as YYYYMMDD.
     *
     * @return the ExpiryDate field
     */
    public ExpiryDateField expiryDate() {
        return expiryDate;
    }

    /**
     * Number of remaining prices to be published for a product. When the value of RemainingRecords equals RecordCount this is the last message for the product.
     *
     * @return the RemainingRecords field
     */
    public RemainingRecordsField remainingRecords() {
        return remainingRecords;
    }

    /**
     * The number of reference prices in this message.
     *
     * @return the RecordCount field
     */
    public RecordCountField recordCount() {
        return recordCount;
    }

    /**
     * One point of the reference volatility curve. The specification's length formula names the repeat NumVolatilityRecords, a field no table of this message declares; RecordCount is the count it gives, as the number of reference volatility points in this message
     *
     * <p>Encode writes this list's size to the RecordCount field.</p>
     *
     * @return the VolatilityPoints entries
     */
    public VolatilityPointsList volatilityPoints() {
        return volatilityPoints;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + volatilityPoints.byteLength();
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
        return Optional.ofNullable(timeOfEvent.value());
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
        if (!timeOfEvent.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOfEventField.BYTE_LENGTH;
        if (!businessDate.parse(data, cursor)) {
            return false;
        }
        cursor += BusinessDateField.BYTE_LENGTH;
        if (!contractCode.parse(data, cursor)) {
            return false;
        }
        cursor += ContractCodeField.BYTE_LENGTH;
        if (!expiryDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDateField.BYTE_LENGTH;
        if (!remainingRecords.parse(data, cursor)) {
            return false;
        }
        cursor += RemainingRecordsField.BYTE_LENGTH;
        if (!recordCount.parse(data, cursor)) {
            return false;
        }
        cursor += RecordCountField.BYTE_LENGTH;
        if (!volatilityPoints.parse(data, cursor, end, recordCount.value())) {
            return false;
        }
        cursor += volatilityPoints.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (volatilityPoints.size() > 65535) {
            throw new IllegalStateException("volatilityPoints holds " + volatilityPoints.size() + " entries, more than its count field can state");
        }
        recordCount.value(volatilityPoints.size());
        int cursor = offset;
        cursor = timeOfEvent.encode(data, cursor);
        cursor = businessDate.encode(data, cursor);
        cursor = contractCode.encode(data, cursor);
        cursor = expiryDate.encode(data, cursor);
        cursor = remainingRecords.encode(data, cursor);
        cursor = recordCount.encode(data, cursor);
        cursor = volatilityPoints.encode(data, cursor);
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
        volatilityPoints.clear();
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
            if (field != recordCount && !field.isRecognized()) {
                return false;
            }
        }
        return volatilityPoints.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != recordCount && !field.isValid()) {
                return false;
            }
        }
        if (!volatilityPoints.isValid()) {
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
        if (!timeOfEvent.isDecoded()) {
            return Optional.of(timeOfEvent);
        }
        if (!businessDate.isDecoded()) {
            return Optional.of(businessDate);
        }
        if (!contractCode.isDecoded()) {
            return Optional.of(contractCode);
        }
        if (!expiryDate.isDecoded()) {
            return Optional.of(expiryDate);
        }
        if (!remainingRecords.isDecoded()) {
            return Optional.of(remainingRecords);
        }
        if (!recordCount.isDecoded()) {
            return Optional.of(recordCount);
        }
        if (!volatilityPoints.isDecoded()) {
            return Optional.of(volatilityPoints.failedEntry().flatMap(VolatilityPointsEntry::failedAt).orElse(recordCount));
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
            case "TimeOfEvent" -> Optional.of(timeOfEvent);
            case "BusinessDate" -> Optional.of(businessDate);
            case "ContractCode" -> Optional.of(contractCode);
            case "ExpiryDate" -> Optional.of(expiryDate);
            case "RemainingRecords" -> Optional.of(remainingRecords);
            case "RecordCount" -> Optional.of(recordCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ReferenceVolatilityPriceMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(volatilityPoints.diffFields(message.volatilityPoints));
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
            volatilityPoints.toFormattedString(builder, options);
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
        volatilityPoints.toFormattedString(builder, nested);
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
        if (!(other instanceof ReferenceVolatilityPriceMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && volatilityPoints.equals(message.volatilityPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, volatilityPoints);
    }
}
