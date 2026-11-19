package omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.BandCountField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.BusinessDateField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.ProductCodeField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.UnreportedWarrantsField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.WarrantBandTypeField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.groups.WarrantBandsEntry;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.groups.WarrantBandsList;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the WarrantBandMessage message from the DailySummariesSnapshot protocol.
 *
 * <p>Reports the number of market participants holding a significant percentage of warrants and positions along the front of the curve, being Tom, Cash and Cash plus one day.</p>
 */
public final class WarrantBandMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 22;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Warrant Band Message";

    /**
     * The business date for which the open interest is being reported, as YYYYMMDD.
     */
    private final BusinessDateField businessDate = new BusinessDateField();

    /**
     * Type of warrant band. The specification names this field Type; it is qualified here because the Reference FX Rate and Open Interest messages give a Type of their own carrying different sets of values.
     */
    private final WarrantBandTypeField warrantBandType = new WarrantBandTypeField();

    /**
     * The product code. This identifies the metal for the instrument.
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * Percentage of total live, on warrant, stock that remains unreported, in implicit six decimal place format. Applicable to Type WB, otherwise null.
     */
    private final UnreportedWarrantsField unreportedWarrants = new UnreportedWarrantsField();

    /**
     * Number of warrant bands.
     */
    private final BandCountField bandCount = new BandCountField();

    /**
     * One warrant band, giving the percentage range and the number of participants whose warrant concentration falls within it
     */
    private final WarrantBandsList warrantBands = new WarrantBandsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(businessDate, warrantBandType, productCode, unreportedWarrants, bandCount);

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
     * Type of warrant band. The specification names this field Type; it is qualified here because the Reference FX Rate and Open Interest messages give a Type of their own carrying different sets of values.
     *
     * @return the WarrantBandType field
     */
    public WarrantBandTypeField warrantBandType() {
        return warrantBandType;
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
     * Percentage of total live, on warrant, stock that remains unreported, in implicit six decimal place format. Applicable to Type WB, otherwise null.
     *
     * @return the UnreportedWarrants field
     */
    public UnreportedWarrantsField unreportedWarrants() {
        return unreportedWarrants;
    }

    /**
     * Number of warrant bands.
     *
     * @return the BandCount field
     */
    public BandCountField bandCount() {
        return bandCount;
    }

    /**
     * One warrant band, giving the percentage range and the number of participants whose warrant concentration falls within it
     *
     * <p>Encode writes this list's size to the BandCount field.</p>
     *
     * @return the WarrantBands entries
     */
    public WarrantBandsList warrantBands() {
        return warrantBands;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + warrantBands.byteLength();
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
        if (!warrantBandType.parse(data, cursor)) {
            return false;
        }
        cursor += WarrantBandTypeField.BYTE_LENGTH;
        if (!productCode.parse(data, cursor)) {
            return false;
        }
        cursor += ProductCodeField.BYTE_LENGTH;
        if (!unreportedWarrants.parse(data, cursor)) {
            return false;
        }
        cursor += UnreportedWarrantsField.BYTE_LENGTH;
        if (!bandCount.parse(data, cursor)) {
            return false;
        }
        cursor += BandCountField.BYTE_LENGTH;
        if (!warrantBands.parse(data, cursor, end, bandCount.value())) {
            return false;
        }
        cursor += warrantBands.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        bandCount.value(warrantBands.size());
        int cursor = offset;
        cursor = businessDate.encode(data, cursor);
        cursor = warrantBandType.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
        cursor = unreportedWarrants.encode(data, cursor);
        cursor = bandCount.encode(data, cursor);
        cursor = warrantBands.encode(data, cursor);
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
        warrantBands.clear();
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
            if (field != bandCount && !field.isRecognized()) {
                return false;
            }
        }
        return warrantBands.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != bandCount && !field.isValid()) {
                return false;
            }
        }
        if (!warrantBands.isValid()) {
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
        if (!warrantBandType.isDecoded()) {
            return Optional.of(warrantBandType);
        }
        if (!productCode.isDecoded()) {
            return Optional.of(productCode);
        }
        if (!unreportedWarrants.isDecoded()) {
            return Optional.of(unreportedWarrants);
        }
        if (!bandCount.isDecoded()) {
            return Optional.of(bandCount);
        }
        if (!warrantBands.isDecoded()) {
            return Optional.of(warrantBands.failedEntry().flatMap(WarrantBandsEntry::failedAt).orElse(bandCount));
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
            case "WarrantBandType" -> Optional.of(warrantBandType);
            case "ProductCode" -> Optional.of(productCode);
            case "UnreportedWarrants" -> Optional.of(unreportedWarrants);
            case "BandCount" -> Optional.of(bandCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof WarrantBandMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(warrantBands.diffFields(message.warrantBands));
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
            warrantBands.toFormattedString(builder, options);
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
        warrantBands.toFormattedString(builder, nested);
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
        if (!(other instanceof WarrantBandMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && warrantBands.equals(message.warrantBands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, warrantBands);
    }
}
