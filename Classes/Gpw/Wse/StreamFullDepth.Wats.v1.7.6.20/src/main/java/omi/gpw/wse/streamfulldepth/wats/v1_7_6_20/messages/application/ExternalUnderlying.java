package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.ExternalUnderlyingIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MicField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.NominalCurrencyField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.ProductCodeField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.ProductIdentificationProductIdentificationField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.ProductIdentificationTypeField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.ProductNameField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TradingCurrencyField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the ExternalUnderlying message from the StreamFullDepth protocol.
 *
 * <p>The message contains a list of underlyings not traded in WATS. It concerns underlyings for derivatives and structured products</p>
 */
public final class ExternalUnderlying implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 113;

    /**
     * This message's declared name.
     */
    public static final String NAME = "External Underlying";

    /**
     * External underlying ID
     */
    private final ExternalUnderlyingIdField externalUnderlyingId = new ExternalUnderlyingIdField();

    /**
     * Product identification
     */
    private final ProductIdentificationProductIdentificationField productIdentificationProductIdentification = new ProductIdentificationProductIdentificationField();

    /**
     * Product identification type
     */
    private final ProductIdentificationTypeField productIdentificationType = new ProductIdentificationTypeField();

    /**
     * Product code
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * Product name
     */
    private final ProductNameField productName = new ProductNameField();

    /**
     * Market structure's Market Identifier Code (MIC) as specified in ISO 10383
     */
    private final MicField mic = new MicField();

    /**
     * Nominal currency
     */
    private final NominalCurrencyField nominalCurrency = new NominalCurrencyField();

    /**
     * Trading currency
     */
    private final TradingCurrencyField tradingCurrency = new TradingCurrencyField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(externalUnderlyingId, productIdentificationProductIdentification, productIdentificationType, productCode, productName, mic, nominalCurrency, tradingCurrency);

    private byte[] buffer;

    private boolean decoded;

    /**
     * External underlying ID
     *
     * @return the ExternalUnderlyingId field
     */
    public ExternalUnderlyingIdField externalUnderlyingId() {
        return externalUnderlyingId;
    }

    /**
     * Product identification
     *
     * @return the ProductIdentificationProductIdentification field
     */
    public ProductIdentificationProductIdentificationField productIdentificationProductIdentification() {
        return productIdentificationProductIdentification;
    }

    /**
     * Product identification type
     *
     * @return the ProductIdentificationType field
     */
    public ProductIdentificationTypeField productIdentificationType() {
        return productIdentificationType;
    }

    /**
     * Product code
     *
     * @return the ProductCode field
     */
    public ProductCodeField productCode() {
        return productCode;
    }

    /**
     * Product name
     *
     * @return the ProductName field
     */
    public ProductNameField productName() {
        return productName;
    }

    /**
     * Market structure's Market Identifier Code (MIC) as specified in ISO 10383
     *
     * @return the Mic field
     */
    public MicField mic() {
        return mic;
    }

    /**
     * Nominal currency
     *
     * @return the NominalCurrency field
     */
    public NominalCurrencyField nominalCurrency() {
        return nominalCurrency;
    }

    /**
     * Trading currency
     *
     * @return the TradingCurrency field
     */
    public TradingCurrencyField tradingCurrency() {
        return tradingCurrency;
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
        if (!externalUnderlyingId.parse(data, cursor)) {
            return false;
        }
        cursor += ExternalUnderlyingIdField.BYTE_LENGTH;
        if (!productIdentificationProductIdentification.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdentificationProductIdentificationField.BYTE_LENGTH;
        if (!productIdentificationType.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdentificationTypeField.BYTE_LENGTH;
        if (!productCode.parse(data, cursor)) {
            return false;
        }
        cursor += ProductCodeField.BYTE_LENGTH;
        if (!productName.parse(data, cursor)) {
            return false;
        }
        cursor += ProductNameField.BYTE_LENGTH;
        if (!mic.parse(data, cursor)) {
            return false;
        }
        cursor += MicField.BYTE_LENGTH;
        if (!nominalCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += NominalCurrencyField.BYTE_LENGTH;
        return tradingCurrency.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = externalUnderlyingId.encode(data, cursor);
        cursor = productIdentificationProductIdentification.encode(data, cursor);
        cursor = productIdentificationType.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
        cursor = productName.encode(data, cursor);
        cursor = mic.encode(data, cursor);
        cursor = nominalCurrency.encode(data, cursor);
        cursor = tradingCurrency.encode(data, cursor);
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
            case "ExternalUnderlyingId" -> Optional.of(externalUnderlyingId);
            case "ProductIdentificationProductIdentification" -> Optional.of(productIdentificationProductIdentification);
            case "ProductIdentificationType" -> Optional.of(productIdentificationType);
            case "ProductCode" -> Optional.of(productCode);
            case "ProductName" -> Optional.of(productName);
            case "Mic" -> Optional.of(mic);
            case "NominalCurrency" -> Optional.of(nominalCurrency);
            case "TradingCurrency" -> Optional.of(tradingCurrency);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExternalUnderlying message)) {
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
        if (!(other instanceof ExternalUnderlying message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
