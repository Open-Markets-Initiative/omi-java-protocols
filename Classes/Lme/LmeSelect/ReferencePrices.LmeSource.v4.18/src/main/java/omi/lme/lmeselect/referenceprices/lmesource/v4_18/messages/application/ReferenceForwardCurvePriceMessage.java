package omi.lme.lmeselect.referenceprices.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.fields.BusinessDateField;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.fields.CurrencyCodeField;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.fields.PriceStatusField;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.fields.ProductCodeField;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.fields.RecordCountField;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.fields.RemainingRecordsField;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.fields.TimeOfEventField;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.groups.CurvePricesEntry;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.groups.CurvePricesList;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.referenceprices.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the ReferenceForwardCurvePriceMessage message from the ReferencePrices protocol.
 *
 * <p>Indicative and closing prices for Carries and indicative prices for the Aluminium Premiums.</p>
 */
public final class ReferenceForwardCurvePriceMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 33;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Reference Forward Curve Price Message";

    /**
     * The time at which the price was established.
     */
    private final TimeOfEventField timeOfEvent = new TimeOfEventField();

    /**
     * The business date on which the price was established, as YYYYMMDD.
     */
    private final BusinessDateField businessDate = new BusinessDateField();

    /**
     * The product code. This identifies the metal for the instrument.
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * The status of reference price.
     */
    private final PriceStatusField priceStatus = new PriceStatusField();

    /**
     * The currency code according to ISO 4217.
     */
    private final CurrencyCodeField currencyCode = new CurrencyCodeField();

    /**
     * Number of remaining prices to be published for a product. When the value of RemainingRecords equals RecordCount this is the last message for the product.
     */
    private final RemainingRecordsField remainingRecords = new RemainingRecordsField();

    /**
     * The number of reference prices in this message.
     */
    private final RecordCountField recordCount = new RecordCountField();

    /**
     * One forward curve reference price and the prompt date or dates it relates to. The specification's length formula names the repeat NumPrices, a field no table of this message declares; RecordCount is the count it gives, as the number of reference prices in this message
     */
    private final CurvePricesList curvePrices = new CurvePricesList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOfEvent, businessDate, productCode, priceStatus, currencyCode, remainingRecords, recordCount);

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
     * The product code. This identifies the metal for the instrument.
     *
     * @return the ProductCode field
     */
    public ProductCodeField productCode() {
        return productCode;
    }

    /**
     * The status of reference price.
     *
     * @return the PriceStatus field
     */
    public PriceStatusField priceStatus() {
        return priceStatus;
    }

    /**
     * The currency code according to ISO 4217.
     *
     * @return the CurrencyCode field
     */
    public CurrencyCodeField currencyCode() {
        return currencyCode;
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
     * One forward curve reference price and the prompt date or dates it relates to. The specification's length formula names the repeat NumPrices, a field no table of this message declares; RecordCount is the count it gives, as the number of reference prices in this message
     *
     * <p>Encode writes this list's size to the RecordCount field.</p>
     *
     * @return the CurvePrices entries
     */
    public CurvePricesList curvePrices() {
        return curvePrices;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + curvePrices.byteLength();
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
        if (!productCode.parse(data, cursor)) {
            return false;
        }
        cursor += ProductCodeField.BYTE_LENGTH;
        if (!priceStatus.parse(data, cursor)) {
            return false;
        }
        cursor += PriceStatusField.BYTE_LENGTH;
        if (!currencyCode.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyCodeField.BYTE_LENGTH;
        if (!remainingRecords.parse(data, cursor)) {
            return false;
        }
        cursor += RemainingRecordsField.BYTE_LENGTH;
        if (!recordCount.parse(data, cursor)) {
            return false;
        }
        cursor += RecordCountField.BYTE_LENGTH;
        if (!curvePrices.parse(data, cursor, end, recordCount.value())) {
            return false;
        }
        cursor += curvePrices.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (curvePrices.size() > 65535) {
            throw new IllegalStateException("curvePrices holds " + curvePrices.size() + " entries, more than its count field can state");
        }
        recordCount.value(curvePrices.size());
        int cursor = offset;
        cursor = timeOfEvent.encode(data, cursor);
        cursor = businessDate.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
        cursor = priceStatus.encode(data, cursor);
        cursor = currencyCode.encode(data, cursor);
        cursor = remainingRecords.encode(data, cursor);
        cursor = recordCount.encode(data, cursor);
        cursor = curvePrices.encode(data, cursor);
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
        curvePrices.clear();
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
        return curvePrices.isRecognized();
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
        if (!curvePrices.isValid()) {
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
        if (!productCode.isDecoded()) {
            return Optional.of(productCode);
        }
        if (!priceStatus.isDecoded()) {
            return Optional.of(priceStatus);
        }
        if (!currencyCode.isDecoded()) {
            return Optional.of(currencyCode);
        }
        if (!remainingRecords.isDecoded()) {
            return Optional.of(remainingRecords);
        }
        if (!recordCount.isDecoded()) {
            return Optional.of(recordCount);
        }
        if (!curvePrices.isDecoded()) {
            return Optional.of(curvePrices.failedEntry().flatMap(CurvePricesEntry::failedAt).orElse(recordCount));
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
            case "ProductCode" -> Optional.of(productCode);
            case "PriceStatus" -> Optional.of(priceStatus);
            case "CurrencyCode" -> Optional.of(currencyCode);
            case "RemainingRecords" -> Optional.of(remainingRecords);
            case "RecordCount" -> Optional.of(recordCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ReferenceForwardCurvePriceMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(curvePrices.diffFields(message.curvePrices));
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
            curvePrices.toFormattedString(builder, options);
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
        curvePrices.toFormattedString(builder, nested);
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
        if (!(other instanceof ReferenceForwardCurvePriceMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && curvePrices.equals(message.curvePrices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, curvePrices);
    }
}
