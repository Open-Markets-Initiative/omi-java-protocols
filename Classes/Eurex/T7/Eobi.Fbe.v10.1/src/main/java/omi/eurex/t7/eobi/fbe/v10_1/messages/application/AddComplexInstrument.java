package omi.eurex.t7.eobi.fbe.v10_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eobi.fbe.v10_1.fields.ImpliedMarketIndicatorField;
import omi.eurex.t7.eobi.fbe.v10_1.fields.LegRatioMultiplierField;
import omi.eurex.t7.eobi.fbe.v10_1.fields.NoLegsField;
import omi.eurex.t7.eobi.fbe.v10_1.fields.ProductComplexField;
import omi.eurex.t7.eobi.fbe.v10_1.fields.SecurityIdField;
import omi.eurex.t7.eobi.fbe.v10_1.fields.SecuritySubTypeField;
import omi.eurex.t7.eobi.fbe.v10_1.fields.TransactTimeField;
import omi.eurex.t7.eobi.fbe.v10_1.groups.InstrmtLegGrpCompEntry;
import omi.eurex.t7.eobi.fbe.v10_1.groups.InstrmtLegGrpCompList;
import omi.eurex.t7.eobi.fbe.v10_1.types.Field;
import omi.eurex.t7.eobi.fbe.v10_1.types.Message;
import omi.eurex.t7.eobi.fbe.v10_1.types.PrintOptions;

/**
 * Represents the AddComplexInstrument message from the Eobi protocol.
 */
public final class AddComplexInstrument implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 672;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Complex Instrument";

    /**
     * The number of slots that InstrmtLegGrpComp carries on the wire.
     */
    public static final int INSTRMT_LEG_GRP_COMP_COUNT = 20;

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 22, 2, 29, 3, 36, 4, 62, 2, 68, 4, 94, 2, 100, 4, 126, 2, 132, 4, 158, 2, 164, 4, 190, 2, 196, 4, 222, 2, 228, 4, 254, 2, 260, 4, 286, 2, 292, 4, 318, 2, 324, 4, 350, 2, 356, 4, 382, 2, 388, 4, 414, 2, 420, 4, 446, 2, 452, 4, 478, 2, 484, 4, 510, 2, 516, 4, 542, 2, 548, 4, 574, 2, 580, 4, 606, 2, 612, 4, 638, 2, 644, 4, 670, 2 };

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Matching-engine transaction time in nanoseconds since Unix epoch
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Security Sub Type
     */
    private final SecuritySubTypeField securitySubType = new SecuritySubTypeField();

    /**
     * Product Complex
     */
    private final ProductComplexField productComplex = new ProductComplexField();

    /**
     * Implied Market Indicator
     */
    private final ImpliedMarketIndicatorField impliedMarketIndicator = new ImpliedMarketIndicatorField();

    /**
     * Leg Ratio Multiplier
     */
    private final LegRatioMultiplierField legRatioMultiplier = new LegRatioMultiplierField();

    /**
     * No Legs
     */
    private final NoLegsField noLegs = new NoLegsField();

    /**
     * Instrmt Leg Grp Comp
     */
    private final InstrmtLegGrpCompList instrmtLegGrpComp = new InstrmtLegGrpCompList(INSTRMT_LEG_GRP_COMP_COUNT);

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, transactTime, securitySubType, productComplex, impliedMarketIndicator, legRatioMultiplier, noLegs);

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
     * Security Sub Type
     *
     * @return the SecuritySubType field
     */
    public SecuritySubTypeField securitySubType() {
        return securitySubType;
    }

    /**
     * Product Complex
     *
     * @return the ProductComplex field
     */
    public ProductComplexField productComplex() {
        return productComplex;
    }

    /**
     * Implied Market Indicator
     *
     * @return the ImpliedMarketIndicator field
     */
    public ImpliedMarketIndicatorField impliedMarketIndicator() {
        return impliedMarketIndicator;
    }

    /**
     * Leg Ratio Multiplier
     *
     * @return the LegRatioMultiplier field
     */
    public LegRatioMultiplierField legRatioMultiplier() {
        return legRatioMultiplier;
    }

    /**
     * No Legs
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
    }

    /**
     * Instrmt Leg Grp Comp
     *
     * <p>The wire always carries 20 slots, and this list holds those in use: encode writes its size to the NoLegs field and fills the rest.</p>
     *
     * @return the InstrmtLegGrpComp entries
     */
    public InstrmtLegGrpCompList instrmtLegGrpComp() {
        return instrmtLegGrpComp;
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
            instrmtLegGrpComp.keep(buffer, offset);
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
        cursor += 2; // padding
        if (!legRatioMultiplier.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioMultiplierField.BYTE_LENGTH;
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        cursor += 3; // padding
        if (!instrmtLegGrpComp.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += instrmtLegGrpComp.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        if (instrmtLegGrpComp.size() > 255) {
            throw new IllegalStateException("instrmtLegGrpComp holds " + instrmtLegGrpComp.size() + " entries, more than its count field can state");
        }
        noLegs.value((short) instrmtLegGrpComp.size());
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = securitySubType.encode(data, cursor);
        cursor = productComplex.encode(data, cursor);
        cursor = impliedMarketIndicator.encode(data, cursor);
        if (buffer != null && buffer.length >= 24) {
            System.arraycopy(buffer, 22, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = legRatioMultiplier.encode(data, cursor);
        cursor = noLegs.encode(data, cursor);
        if (buffer != null && buffer.length >= 32) {
            System.arraycopy(buffer, 29, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        cursor = instrmtLegGrpComp.encode(data, cursor);
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
        instrmtLegGrpComp.clear();
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
        return instrmtLegGrpComp.isRecognized();
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
        if (!instrmtLegGrpComp.isValid()) {
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
        if (!legRatioMultiplier.isDecoded()) {
            return Optional.of(legRatioMultiplier);
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!instrmtLegGrpComp.isDecoded()) {
            return Optional.of(instrmtLegGrpComp.failedEntry().flatMap(InstrmtLegGrpCompEntry::failedAt).orElse(noLegs));
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
            case "LegRatioMultiplier" -> Optional.of(legRatioMultiplier);
            case "NoLegs" -> Optional.of(noLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddComplexInstrument message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(instrmtLegGrpComp.diffFields(message.instrmtLegGrpComp));
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
            instrmtLegGrpComp.toFormattedString(builder, options);
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
        instrmtLegGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof AddComplexInstrument message)) {
            return false;
        }
        return fields.equals(message.fields) && instrmtLegGrpComp.equals(message.instrmtLegGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, instrmtLegGrpComp);
    }
}
