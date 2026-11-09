package omi.eurex.t7.eobi.fbe.v13_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eobi.fbe.v13_0.fields.ContractDateField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.ExerciseStyleField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.MaturityDateField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.OptAttributeField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.PutOrCallField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityDescField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityIdField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityReferenceDataSupplementField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityTypeField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SettlMethodField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.StrikePriceField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.TransactTimeField;
import omi.eurex.t7.eobi.fbe.v13_0.types.Field;
import omi.eurex.t7.eobi.fbe.v13_0.types.Message;
import omi.eurex.t7.eobi.fbe.v13_0.types.PrintOptions;

/**
 * Represents the AddFlexibleInstrument message from the Eobi protocol.
 */
public final class AddFlexibleInstrument implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 88;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Flexible Instrument";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 84, 4 };

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Matching-engine transaction time in nanoseconds since Unix epoch
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Security Desc
     */
    private final SecurityDescField securityDesc = new SecurityDescField();

    /**
     * Security Type
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * Put Or Call
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Exercise Style
     */
    private final ExerciseStyleField exerciseStyle = new ExerciseStyleField();

    /**
     * Settl Method
     */
    private final SettlMethodField settlMethod = new SettlMethodField();

    /**
     * Maturity Date
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Strike Price
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Opt Attribute
     */
    private final OptAttributeField optAttribute = new OptAttributeField();

    /**
     * Contract Date
     */
    private final ContractDateField contractDate = new ContractDateField();

    /**
     * Security Reference Data Supplement
     */
    private final SecurityReferenceDataSupplementField securityReferenceDataSupplement = new SecurityReferenceDataSupplementField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, transactTime, securityDesc, securityType, putOrCall, exerciseStyle, settlMethod, maturityDate, strikePrice, optAttribute, contractDate, securityReferenceDataSupplement);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Matching-engine transaction time in nanoseconds since Unix epoch
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Security Desc
     *
     * @return the SecurityDesc field
     */
    public SecurityDescField securityDesc() {
        return securityDesc;
    }

    /**
     * Security Type
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * Put Or Call
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Exercise Style
     *
     * @return the ExerciseStyle field
     */
    public ExerciseStyleField exerciseStyle() {
        return exerciseStyle;
    }

    /**
     * Settl Method
     *
     * @return the SettlMethod field
     */
    public SettlMethodField settlMethod() {
        return settlMethod;
    }

    /**
     * Maturity Date
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Strike Price
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Opt Attribute
     *
     * @return the OptAttribute field
     */
    public OptAttributeField optAttribute() {
        return optAttribute;
    }

    /**
     * Contract Date
     *
     * @return the ContractDate field
     */
    public ContractDateField contractDate() {
        return contractDate;
    }

    /**
     * Security Reference Data Supplement
     *
     * @return the SecurityReferenceDataSupplement field
     */
    public SecurityReferenceDataSupplementField securityReferenceDataSupplement() {
        return securityReferenceDataSupplement;
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
        return Optional.ofNullable(transactTime.value());
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!securityDesc.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityDescField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        if (!exerciseStyle.parse(data, cursor)) {
            return false;
        }
        cursor += ExerciseStyleField.BYTE_LENGTH;
        if (!settlMethod.parse(data, cursor)) {
            return false;
        }
        cursor += SettlMethodField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!optAttribute.parse(data, cursor)) {
            return false;
        }
        cursor += OptAttributeField.BYTE_LENGTH;
        if (!contractDate.parse(data, cursor)) {
            return false;
        }
        cursor += ContractDateField.BYTE_LENGTH;
        if (!securityReferenceDataSupplement.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityReferenceDataSupplementField.BYTE_LENGTH;
        cursor += 4; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = securityDesc.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = exerciseStyle.encode(data, cursor);
        cursor = settlMethod.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = optAttribute.encode(data, cursor);
        cursor = contractDate.encode(data, cursor);
        cursor = securityReferenceDataSupplement.encode(data, cursor);
        if (buffer != null && buffer.length >= 84 + 4) {
            System.arraycopy(buffer, 84, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
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
            case "SecurityId" -> Optional.of(securityId);
            case "TransactTime" -> Optional.of(transactTime);
            case "SecurityDesc" -> Optional.of(securityDesc);
            case "SecurityType" -> Optional.of(securityType);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "ExerciseStyle" -> Optional.of(exerciseStyle);
            case "SettlMethod" -> Optional.of(settlMethod);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "OptAttribute" -> Optional.of(optAttribute);
            case "ContractDate" -> Optional.of(contractDate);
            case "SecurityReferenceDataSupplement" -> Optional.of(securityReferenceDataSupplement);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddFlexibleInstrument message)) {
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
        if (!(other instanceof AddFlexibleInstrument message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
