package omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.BaseCurrencyCodeField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.BusinessDateField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.ConversionRateField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.FxRateCategoryField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.FxRateTypeField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.MaturityDateField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.TargetCurrencyCodeField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the ReferenceFxRateMessage message from the ReferencePricesSnapshot protocol.
 *
 * <p>Exchange FX rates are published for the Cash prompt. Daily and Monthly Moving Average Exchange FX rates are published each day, with the Monthly Average Exchange FX rate published on the last business day of the month. MonthlyMovingAverage and MonthlyAverage are published only for the Exchange category.</p>
 */
public final class ReferenceFxRateMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 25;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Reference Fx Rate Message";

    /**
     * FX rate category. The specification names this field Category; it is qualified here because the Reference Price message gives a Category of its own carrying a different set of values.
     */
    private final FxRateCategoryField fxRateCategory = new FxRateCategoryField();

    /**
     * FX rate type. The specification names this field Type; it is qualified here because the Open Interest and Warrant Band messages give a Type of their own carrying different sets of values.
     */
    private final FxRateTypeField fxRateType = new FxRateTypeField();

    /**
     * The business date on which the price was established, as YYYYMMDD.
     */
    private final BusinessDateField businessDate = new BusinessDateField();

    /**
     * The business date to which the rate applies, as YYYYMMDD.
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * The currency code according to ISO 4217.
     */
    private final BaseCurrencyCodeField baseCurrencyCode = new BaseCurrencyCodeField();

    /**
     * The currency code according to ISO 4217.
     */
    private final TargetCurrencyCodeField targetCurrencyCode = new TargetCurrencyCodeField();

    /**
     * The conversion rate between base and target currencies, in implicit six decimal place format.
     */
    private final ConversionRateField conversionRate = new ConversionRateField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(fxRateCategory, fxRateType, businessDate, maturityDate, baseCurrencyCode, targetCurrencyCode, conversionRate);

    private byte[] buffer;

    private boolean decoded;

    /**
     * FX rate category. The specification names this field Category; it is qualified here because the Reference Price message gives a Category of its own carrying a different set of values.
     *
     * @return the FxRateCategory field
     */
    public FxRateCategoryField fxRateCategory() {
        return fxRateCategory;
    }

    /**
     * FX rate type. The specification names this field Type; it is qualified here because the Open Interest and Warrant Band messages give a Type of their own carrying different sets of values.
     *
     * @return the FxRateType field
     */
    public FxRateTypeField fxRateType() {
        return fxRateType;
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
     * The business date to which the rate applies, as YYYYMMDD.
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * The currency code according to ISO 4217.
     *
     * @return the BaseCurrencyCode field
     */
    public BaseCurrencyCodeField baseCurrencyCode() {
        return baseCurrencyCode;
    }

    /**
     * The currency code according to ISO 4217.
     *
     * @return the TargetCurrencyCode field
     */
    public TargetCurrencyCodeField targetCurrencyCode() {
        return targetCurrencyCode;
    }

    /**
     * The conversion rate between base and target currencies, in implicit six decimal place format.
     *
     * @return the ConversionRate field
     */
    public ConversionRateField conversionRate() {
        return conversionRate;
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
        if (!fxRateCategory.parse(data, cursor)) {
            return false;
        }
        cursor += FxRateCategoryField.BYTE_LENGTH;
        if (!fxRateType.parse(data, cursor)) {
            return false;
        }
        cursor += FxRateTypeField.BYTE_LENGTH;
        if (!businessDate.parse(data, cursor)) {
            return false;
        }
        cursor += BusinessDateField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!baseCurrencyCode.parse(data, cursor)) {
            return false;
        }
        cursor += BaseCurrencyCodeField.BYTE_LENGTH;
        if (!targetCurrencyCode.parse(data, cursor)) {
            return false;
        }
        cursor += TargetCurrencyCodeField.BYTE_LENGTH;
        return conversionRate.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = fxRateCategory.encode(data, cursor);
        cursor = fxRateType.encode(data, cursor);
        cursor = businessDate.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = baseCurrencyCode.encode(data, cursor);
        cursor = targetCurrencyCode.encode(data, cursor);
        cursor = conversionRate.encode(data, cursor);
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
            case "FxRateCategory" -> Optional.of(fxRateCategory);
            case "FxRateType" -> Optional.of(fxRateType);
            case "BusinessDate" -> Optional.of(businessDate);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "BaseCurrencyCode" -> Optional.of(baseCurrencyCode);
            case "TargetCurrencyCode" -> Optional.of(targetCurrencyCode);
            case "ConversionRate" -> Optional.of(conversionRate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ReferenceFxRateMessage message)) {
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
        if (!(other instanceof ReferenceFxRateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
