package omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.fields.CfiCodeField;
import omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.fields.ContractCodeField;
import omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.fields.ExpiryDateField;
import omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.fields.InstrumentIdField;
import omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.fields.IsinField;
import omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.fields.NameField;
import omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.fields.OptionTypeField;
import omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.fields.StrikePriceField;
import omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.fields.UnderlyingInstrumentIdField;
import omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the InstrumentDefinitionMessage message from the NonElectronicRefData protocol.
 *
 * <p>Describes a futures outright prompt date or option call or put strike.</p>
 */
public final class InstrumentDefinitionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 99;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Definition Message";

    /**
     * Unique Instrument Identifier.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Instrument name.
     */
    private final NameField nameField = new NameField();

    /**
     * Contract to which the instrument belongs.
     */
    private final ContractCodeField contractCode = new ContractCodeField();

    /**
     * A reference to the underlying Instrument. Null otherwise.
     */
    private final UnderlyingInstrumentIdField underlyingInstrumentId = new UnderlyingInstrumentIdField();

    /**
     * Expiry date, as YYYYMMDD.
     */
    private final ExpiryDateField expiryDate = new ExpiryDateField();

    /**
     * Option Exercise Price, in implicit six decimal place format. Null for futures.
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Call or Put. Space if Contract Type is Future.
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * The instrument classification according to ISO 10962.
     */
    private final CfiCodeField cfiCode = new CfiCodeField();

    /**
     * ISIN Code. Not applicable if the Instrument belongs to an algorithmic test contract.
     */
    private final IsinField isin = new IsinField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, nameField, contractCode, underlyingInstrumentId, expiryDate, strikePrice, optionType, cfiCode, isin);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique Instrument Identifier.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Instrument name.
     *
     * @return the Name field
     */
    public NameField nameField() {
        return nameField;
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
     * A reference to the underlying Instrument. Null otherwise.
     *
     * @return the UnderlyingInstrumentId field
     */
    public UnderlyingInstrumentIdField underlyingInstrumentId() {
        return underlyingInstrumentId;
    }

    /**
     * Expiry date, as YYYYMMDD.
     *
     * @return the ExpiryDate field
     */
    public ExpiryDateField expiryDate() {
        return expiryDate;
    }

    /**
     * Option Exercise Price, in implicit six decimal place format. Null for futures.
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Call or Put. Space if Contract Type is Future.
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * The instrument classification according to ISO 10962.
     *
     * @return the CfiCode field
     */
    public CfiCodeField cfiCode() {
        return cfiCode;
    }

    /**
     * ISIN Code. Not applicable if the Instrument belongs to an algorithmic test contract.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
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
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!nameField.parse(data, cursor)) {
            return false;
        }
        cursor += NameField.BYTE_LENGTH;
        if (!contractCode.parse(data, cursor)) {
            return false;
        }
        cursor += ContractCodeField.BYTE_LENGTH;
        if (!underlyingInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingInstrumentIdField.BYTE_LENGTH;
        if (!expiryDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDateField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!cfiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CfiCodeField.BYTE_LENGTH;
        return isin.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = nameField.encode(data, cursor);
        cursor = contractCode.encode(data, cursor);
        cursor = underlyingInstrumentId.encode(data, cursor);
        cursor = expiryDate.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = cfiCode.encode(data, cursor);
        cursor = isin.encode(data, cursor);
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "Name" -> Optional.of(nameField);
            case "ContractCode" -> Optional.of(contractCode);
            case "UnderlyingInstrumentId" -> Optional.of(underlyingInstrumentId);
            case "ExpiryDate" -> Optional.of(expiryDate);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "OptionType" -> Optional.of(optionType);
            case "CfiCode" -> Optional.of(cfiCode);
            case "Isin" -> Optional.of(isin);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InstrumentDefinitionMessage message)) {
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
        if (!(other instanceof InstrumentDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
