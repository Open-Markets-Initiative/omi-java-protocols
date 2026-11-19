package omi.bse.bseindia.eobi.fbe.v1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.ImpliedMarketIndicatorField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.NoLegsField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.ProductComplexField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.SecurityIdField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.SecuritySubTypeField;
import omi.bse.bseindia.eobi.fbe.v1_4.fields.TransactTimeField;
import omi.bse.bseindia.eobi.fbe.v1_4.groups.InstrmtLegGrpEntry;
import omi.bse.bseindia.eobi.fbe.v1_4.groups.InstrmtLegGrpList;
import omi.bse.bseindia.eobi.fbe.v1_4.types.Field;
import omi.bse.bseindia.eobi.fbe.v1_4.types.Message;
import omi.bse.bseindia.eobi.fbe.v1_4.types.PrintOptions;

/**
 * Represents the AddComplexInstrumentMessage message from the Eobi protocol.
 *
 * <p>Published whenever a new complex instrument is created intraday or an existing complex instrument is modified.</p>
 */
public final class AddComplexInstrumentMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 104;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Complex Instrument Message";

    /**
     * The number of slots that InstrmtLegGrp carries on the wire.
     */
    public static final int INSTRMT_LEG_GRP_COUNT = 5;

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 23, 1, 37, 3, 53, 3, 69, 3, 85, 3, 101, 3 };

    /**
     * Unique instrument identifier.
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Transaction timestamp.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Strategy Type.
     */
    private final SecuritySubTypeField securitySubType = new SecuritySubTypeField();

    /**
     * This field qualifies an instrument type on BSE.
     */
    private final ProductComplexField productComplex = new ProductComplexField();

    /**
     * Indicates that an implied market to be created for either the legs of a multi-leg instrument or for the multi-leg instrument based on the existence of the legs.
     */
    private final ImpliedMarketIndicatorField impliedMarketIndicator = new ImpliedMarketIndicatorField();

    /**
     * Number of Legs repeating group instances.
     */
    private final NoLegsField noLegs = new NoLegsField();

    /**
     * Leg definitions repeated NoLegs times in the Add Complex Instrument Message.
     */
    private final InstrmtLegGrpList instrmtLegGrp = new InstrmtLegGrpList(INSTRMT_LEG_GRP_COUNT);

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, transactTime, securitySubType, productComplex, impliedMarketIndicator, noLegs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique instrument identifier.
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Transaction timestamp.
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Strategy Type.
     *
     * @return the SecuritySubType field
     */
    public SecuritySubTypeField securitySubType() {
        return securitySubType;
    }

    /**
     * This field qualifies an instrument type on BSE.
     *
     * @return the ProductComplex field
     */
    public ProductComplexField productComplex() {
        return productComplex;
    }

    /**
     * Indicates that an implied market to be created for either the legs of a multi-leg instrument or for the multi-leg instrument based on the existence of the legs.
     *
     * @return the ImpliedMarketIndicator field
     */
    public ImpliedMarketIndicatorField impliedMarketIndicator() {
        return impliedMarketIndicator;
    }

    /**
     * Number of Legs repeating group instances.
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
    }

    /**
     * Leg definitions repeated NoLegs times in the Add Complex Instrument Message.
     *
     * <p>The wire always carries 5 slots, and this list holds those in use: encode writes its size to the NoLegs field and fills the rest.</p>
     *
     * @return the InstrmtLegGrp entries
     */
    public InstrmtLegGrpList instrmtLegGrp() {
        return instrmtLegGrp;
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
        if (decoded) {
            instrmtLegGrp.keep(buffer, offset);
        }
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
        if (!securitySubType.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySubTypeField.BYTE_LENGTH;
        if (!productComplex.parse(data, cursor)) {
            return false;
        }
        cursor += ProductComplexField.BYTE_LENGTH;
        if (!impliedMarketIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ImpliedMarketIndicatorField.BYTE_LENGTH;
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!instrmtLegGrp.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += instrmtLegGrp.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        if (instrmtLegGrp.size() > 255) {
            throw new IllegalStateException("instrmtLegGrp holds " + instrmtLegGrp.size() + " entries, more than its count field can state");
        }
        noLegs.value((short) instrmtLegGrp.size());
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = securitySubType.encode(data, cursor);
        cursor = productComplex.encode(data, cursor);
        cursor = impliedMarketIndicator.encode(data, cursor);
        cursor = noLegs.encode(data, cursor);
        if (buffer != null && buffer.length >= 24) {
            System.arraycopy(buffer, 23, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = instrmtLegGrp.encode(data, cursor);
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
        instrmtLegGrp.clear();
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
            if (field != noLegs && !field.isRecognized()) {
                return false;
            }
        }
        return instrmtLegGrp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noLegs && !field.isValid()) {
                return false;
            }
        }
        if (!instrmtLegGrp.isValid()) {
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
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!securitySubType.isDecoded()) {
            return Optional.of(securitySubType);
        }
        if (!productComplex.isDecoded()) {
            return Optional.of(productComplex);
        }
        if (!impliedMarketIndicator.isDecoded()) {
            return Optional.of(impliedMarketIndicator);
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!instrmtLegGrp.isDecoded()) {
            return Optional.of(instrmtLegGrp.failedEntry().flatMap(InstrmtLegGrpEntry::failedAt).orElse(noLegs));
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
            case "SecuritySubType" -> Optional.of(securitySubType);
            case "ProductComplex" -> Optional.of(productComplex);
            case "ImpliedMarketIndicator" -> Optional.of(impliedMarketIndicator);
            case "NoLegs" -> Optional.of(noLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddComplexInstrumentMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(instrmtLegGrp.diffFields(message.instrmtLegGrp));
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
            instrmtLegGrp.toFormattedString(builder, options);
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
        instrmtLegGrp.toFormattedString(builder, nested);
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
        if (!(other instanceof AddComplexInstrumentMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && instrmtLegGrp.equals(message.instrmtLegGrp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, instrmtLegGrp);
    }
}
