package omi.lme.lmeselect.dailysummaries.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.fields.BusinessDateField;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.fields.ContractCodeField;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.fields.ContractTypeField;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.fields.CurrencyCodeField;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.fields.DateBandCountField;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.fields.ProductCodeField;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.groups.DateBandsEntry;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.groups.DateBandsList;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the OpenInterestBandMessage message from the DailySummaries protocol.
 *
 * <p>Reports open interest for all futures trades by product between given dates. Open interest volumes are provided per currency, by contract code, and not aggregated across currencies.</p>
 */
public final class OpenInterestBandMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Open Interest Band Message";

    /**
     * The business date for which the open interest is being reported, as YYYYMMDD.
     */
    private final BusinessDateField businessDate = new BusinessDateField();

    /**
     * The product code. This identifies the metal for the instrument.
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * Contract to which the instrument belongs.
     */
    private final ContractCodeField contractCode = new ContractCodeField();

    /**
     * Constant contract type.
     */
    private final ContractTypeField contractType = new ContractTypeField();

    /**
     * The currency code according to ISO 4217.
     */
    private final CurrencyCodeField currencyCode = new CurrencyCodeField();

    /**
     * Number of open interest date bands.
     */
    private final DateBandCountField dateBandCount = new DateBandCountField();

    /**
     * One open interest date band, giving the open interest volume for the period between two dates
     */
    private final DateBandsList dateBands = new DateBandsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(businessDate, productCode, contractCode, contractType, currencyCode, dateBandCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The business date for which the open interest is being reported, as YYYYMMDD.
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
     * Contract to which the instrument belongs.
     *
     * @return the ContractCode field
     */
    public ContractCodeField contractCode() {
        return contractCode;
    }

    /**
     * Constant contract type.
     *
     * @return the ContractType field
     */
    public ContractTypeField contractType() {
        return contractType;
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
     * Number of open interest date bands.
     *
     * @return the DateBandCount field
     */
    public DateBandCountField dateBandCount() {
        return dateBandCount;
    }

    /**
     * One open interest date band, giving the open interest volume for the period between two dates
     *
     * <p>Encode writes this list's size to the DateBandCount field.</p>
     *
     * @return the DateBands entries
     */
    public DateBandsList dateBands() {
        return dateBands;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + dateBands.byteLength();
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!businessDate.parse(data, cursor)) {
            return false;
        }
        cursor += BusinessDateField.BYTE_LENGTH;
        if (!productCode.parse(data, cursor)) {
            return false;
        }
        cursor += ProductCodeField.BYTE_LENGTH;
        if (!contractCode.parse(data, cursor)) {
            return false;
        }
        cursor += ContractCodeField.BYTE_LENGTH;
        if (!contractType.parse(data, cursor)) {
            return false;
        }
        cursor += ContractTypeField.BYTE_LENGTH;
        if (!currencyCode.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyCodeField.BYTE_LENGTH;
        if (!dateBandCount.parse(data, cursor)) {
            return false;
        }
        cursor += DateBandCountField.BYTE_LENGTH;
        if (!dateBands.parse(data, cursor, end, dateBandCount.value())) {
            return false;
        }
        cursor += dateBands.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        dateBandCount.value(dateBands.size());
        int cursor = offset;
        cursor = businessDate.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
        cursor = contractCode.encode(data, cursor);
        cursor = contractType.encode(data, cursor);
        cursor = currencyCode.encode(data, cursor);
        cursor = dateBandCount.encode(data, cursor);
        cursor = dateBands.encode(data, cursor);
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
        dateBands.clear();
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
            if (field != dateBandCount && !field.isRecognized()) {
                return false;
            }
        }
        return dateBands.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != dateBandCount && !field.isValid()) {
                return false;
            }
        }
        if (!dateBands.isValid()) {
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
        if (!businessDate.isDecoded()) {
            return Optional.of(businessDate);
        }
        if (!productCode.isDecoded()) {
            return Optional.of(productCode);
        }
        if (!contractCode.isDecoded()) {
            return Optional.of(contractCode);
        }
        if (!contractType.isDecoded()) {
            return Optional.of(contractType);
        }
        if (!currencyCode.isDecoded()) {
            return Optional.of(currencyCode);
        }
        if (!dateBandCount.isDecoded()) {
            return Optional.of(dateBandCount);
        }
        if (!dateBands.isDecoded()) {
            return Optional.of(dateBands.failedEntry().flatMap(DateBandsEntry::failedAt).orElse(dateBandCount));
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
            case "BusinessDate" -> Optional.of(businessDate);
            case "ProductCode" -> Optional.of(productCode);
            case "ContractCode" -> Optional.of(contractCode);
            case "ContractType" -> Optional.of(contractType);
            case "CurrencyCode" -> Optional.of(currencyCode);
            case "DateBandCount" -> Optional.of(dateBandCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OpenInterestBandMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(dateBands.diffFields(message.dateBands));
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
            dateBands.toFormattedString(builder, options);
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
        dateBands.toFormattedString(builder, nested);
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
        if (!(other instanceof OpenInterestBandMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && dateBands.equals(message.dateBands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, dateBands);
    }
}
